package com.facebook.imagepipeline.producers;

import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import com.facebook.common.memory.ByteArrayPool;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.common.memory.PooledByteBufferOutputStream;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.common.BytesRange;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.image.EncodedImageOrigin;
import com.facebook.imagepipeline.producers.NetworkFetcher;
import com.facebook.infer.annotation.Nullsafe;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class NetworkFetchProducer implements Producer<EncodedImage> {
    public static final String INTERMEDIATE_RESULT_PRODUCER_EVENT = "intermediate_result";
    public static final String PRODUCER_NAME = "NetworkFetchProducer";
    private static final int READ_SIZE = 16384;
    @VisibleForTesting
    public static final long TIME_BETWEEN_PARTIAL_RESULTS_MS = 100;
    private final ByteArrayPool mByteArrayPool;
    private final NetworkFetcher mNetworkFetcher;
    public final PooledByteBufferFactory mPooledByteBufferFactory;

    public NetworkFetchProducer(PooledByteBufferFactory pooledByteBufferFactory, ByteArrayPool byteArrayPool, NetworkFetcher networkFetcher) {
        this.mPooledByteBufferFactory = pooledByteBufferFactory;
        this.mByteArrayPool = byteArrayPool;
        this.mNetworkFetcher = networkFetcher;
    }

    public static float calculateProgress(int downloaded, int total) {
        return total > 0 ? downloaded / total : 1.0f - ((float) Math.exp((-downloaded) / 50000.0d));
    }

    @Nullable
    private Map<String, String> getExtraMap(FetchState fetchState, int byteSize) {
        if (fetchState.getListener().requiresExtraMap(fetchState.getContext(), PRODUCER_NAME)) {
            return this.mNetworkFetcher.getExtraMap(fetchState, byteSize);
        }
        return null;
    }

    public static void notifyConsumer(PooledByteBufferOutputStream pooledOutputStream, int status, @Nullable BytesRange responseBytesRange, Consumer<EncodedImage> consumer, ProducerContext context) {
        EncodedImage encodedImage;
        CloseableReference of = CloseableReference.of(pooledOutputStream.toByteBuffer());
        EncodedImage encodedImage2 = null;
        try {
            encodedImage = new EncodedImage(of);
        } catch (Throwable th) {
            th = th;
        }
        try {
            encodedImage.setBytesRange(responseBytesRange);
            encodedImage.parseMetaData();
            context.setEncodedImageOrigin(EncodedImageOrigin.NETWORK);
            consumer.onNewResult(encodedImage, status);
            EncodedImage.closeSafely(encodedImage);
            CloseableReference.closeSafely(of);
        } catch (Throwable th2) {
            th = th2;
            encodedImage2 = encodedImage;
            EncodedImage.closeSafely(encodedImage2);
            CloseableReference.closeSafely(of);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onCancellation(FetchState fetchState) {
        fetchState.getListener().onProducerFinishWithCancellation(fetchState.getContext(), PRODUCER_NAME, null);
        fetchState.getConsumer().onCancellation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onFailure(FetchState fetchState, Throwable e2) {
        fetchState.getListener().onProducerFinishWithFailure(fetchState.getContext(), PRODUCER_NAME, e2, null);
        fetchState.getListener().onUltimateProducerReached(fetchState.getContext(), PRODUCER_NAME, false);
        fetchState.getContext().putOriginExtra("network");
        fetchState.getConsumer().onFailure(e2);
    }

    private boolean shouldPropagateIntermediateResults(FetchState fetchState) {
        if (fetchState.getContext().isIntermediateResultExpected()) {
            return this.mNetworkFetcher.shouldPropagate(fetchState);
        }
        return false;
    }

    @VisibleForTesting
    public long getSystemUptime() {
        return SystemClock.uptimeMillis();
    }

    public void handleFinalResult(PooledByteBufferOutputStream pooledOutputStream, FetchState fetchState) {
        Map<String, String> extraMap = getExtraMap(fetchState, pooledOutputStream.size());
        ProducerListener2 listener = fetchState.getListener();
        listener.onProducerFinishWithSuccess(fetchState.getContext(), PRODUCER_NAME, extraMap);
        listener.onUltimateProducerReached(fetchState.getContext(), PRODUCER_NAME, true);
        fetchState.getContext().putOriginExtra("network");
        notifyConsumer(pooledOutputStream, fetchState.getOnNewResultStatusFlags() | 1, fetchState.getResponseBytesRange(), fetchState.getConsumer(), fetchState.getContext());
    }

    public void maybeHandleIntermediateResult(PooledByteBufferOutputStream pooledOutputStream, FetchState fetchState) {
        long systemUptime = getSystemUptime();
        if (!shouldPropagateIntermediateResults(fetchState) || systemUptime - fetchState.getLastIntermediateResultTimeMs() < 100) {
            return;
        }
        fetchState.setLastIntermediateResultTimeMs(systemUptime);
        fetchState.getListener().onProducerEvent(fetchState.getContext(), PRODUCER_NAME, INTERMEDIATE_RESULT_PRODUCER_EVENT);
        notifyConsumer(pooledOutputStream, fetchState.getOnNewResultStatusFlags(), fetchState.getResponseBytesRange(), fetchState.getConsumer(), fetchState.getContext());
    }

    public void onResponse(FetchState fetchState, InputStream responseData, int responseContentLength) throws IOException {
        PooledByteBufferOutputStream newOutputStream;
        if (responseContentLength > 0) {
            newOutputStream = this.mPooledByteBufferFactory.newOutputStream(responseContentLength);
        } else {
            newOutputStream = this.mPooledByteBufferFactory.newOutputStream();
        }
        byte[] bArr = this.mByteArrayPool.get(16384);
        while (true) {
            try {
                int read = responseData.read(bArr);
                if (read < 0) {
                    this.mNetworkFetcher.onFetchCompletion(fetchState, newOutputStream.size());
                    handleFinalResult(newOutputStream, fetchState);
                    return;
                } else if (read > 0) {
                    newOutputStream.write(bArr, 0, read);
                    maybeHandleIntermediateResult(newOutputStream, fetchState);
                    fetchState.getConsumer().onProgressUpdate(calculateProgress(newOutputStream.size(), responseContentLength));
                }
            } finally {
                this.mByteArrayPool.release(bArr);
                newOutputStream.close();
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.Producer
    public void produceResults(Consumer<EncodedImage> consumer, ProducerContext context) {
        context.getProducerListener().onProducerStart(context, PRODUCER_NAME);
        FetchState createFetchState = this.mNetworkFetcher.createFetchState(consumer, context);
        this.mNetworkFetcher.fetch(createFetchState, new NetworkFetcher.Callback(this, createFetchState) { // from class: com.facebook.imagepipeline.producers.NetworkFetchProducer.1
            public final /* synthetic */ NetworkFetchProducer this$0;
            public final /* synthetic */ FetchState val$fetchState;

            @Override // com.facebook.imagepipeline.producers.NetworkFetcher.Callback
            public void onCancellation() {
            }

            @Override // com.facebook.imagepipeline.producers.NetworkFetcher.Callback
            public void onFailure(Throwable throwable) {
            }

            @Override // com.facebook.imagepipeline.producers.NetworkFetcher.Callback
            public void onResponse(InputStream response, int responseLength) throws IOException {
            }
        });
    }
}
