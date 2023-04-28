package com.facebook.imagepipeline.producers;

import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Supplier;
import com.facebook.common.memory.ByteArrayPool;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.util.UriUtil;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.core.CloseableReferenceFactory;
import com.facebook.imagepipeline.decoder.ImageDecoder;
import com.facebook.imagepipeline.decoder.ProgressiveJpegConfig;
import com.facebook.imagepipeline.decoder.ProgressiveJpegParser;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.image.QualityInfo;
import com.facebook.imagepipeline.producers.JobScheduler;
import com.facebook.imagepipeline.systrace.FrescoSystrace;
import com.facebook.infer.annotation.Nullsafe;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class DecodeProducer implements Producer<CloseableReference<CloseableImage>> {
    public static final String ENCODED_IMAGE_SIZE = "encodedImageSize";
    public static final String EXTRA_BITMAP_BYTES = "byteCount";
    public static final String EXTRA_BITMAP_SIZE = "bitmapSize";
    public static final String EXTRA_HAS_GOOD_QUALITY = "hasGoodQuality";
    public static final String EXTRA_IMAGE_FORMAT_NAME = "imageFormat";
    public static final String EXTRA_IS_FINAL = "isFinal";
    private static final int MAX_BITMAP_SIZE = 104857600;
    public static final String PRODUCER_NAME = "DecodeProducer";
    public static final String REQUESTED_IMAGE_SIZE = "requestedImageSize";
    public static final String SAMPLE_SIZE = "sampleSize";
    private final ByteArrayPool mByteArrayPool;
    private final CloseableReferenceFactory mCloseableReferenceFactory;
    private final boolean mDecodeCancellationEnabled;
    private final boolean mDownsampleEnabled;
    private final boolean mDownsampleEnabledForNetwork;
    private final Executor mExecutor;
    private final ImageDecoder mImageDecoder;
    private final Producer<EncodedImage> mInputProducer;
    private final int mMaxBitmapSize;
    private final ProgressiveJpegConfig mProgressiveJpegConfig;
    @Nullable
    private final Runnable mReclaimMemoryRunnable;
    private final Supplier<Boolean> mRecoverFromDecoderOOM;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class LocalImagesProgressiveDecoder extends ProgressiveDecoder {
        public final /* synthetic */ DecodeProducer this$0;

        public LocalImagesProgressiveDecoder(final DecodeProducer this$0, final Consumer<CloseableReference<CloseableImage>> consumer, final ProducerContext producerContext, final boolean decodeCancellationEnabled, final int maxBitmapSize) {
        }

        @Override // com.facebook.imagepipeline.producers.DecodeProducer.ProgressiveDecoder
        public int getIntermediateImageEndOffset(EncodedImage encodedImage) {
        }

        @Override // com.facebook.imagepipeline.producers.DecodeProducer.ProgressiveDecoder
        public QualityInfo getQualityInfo() {
        }

        @Override // com.facebook.imagepipeline.producers.DecodeProducer.ProgressiveDecoder
        public synchronized boolean updateDecodeJob(@Nullable EncodedImage encodedImage, int status) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class NetworkImagesProgressiveDecoder extends ProgressiveDecoder {
        private int mLastScheduledScanNumber;
        private final ProgressiveJpegConfig mProgressiveJpegConfig;
        private final ProgressiveJpegParser mProgressiveJpegParser;
        public final /* synthetic */ DecodeProducer this$0;

        public NetworkImagesProgressiveDecoder(final DecodeProducer this$0, final Consumer<CloseableReference<CloseableImage>> consumer, final ProducerContext producerContext, final ProgressiveJpegParser progressiveJpegParser, final ProgressiveJpegConfig progressiveJpegConfig, final boolean decodeCancellationEnabled, final int maxBitmapSize) {
        }

        @Override // com.facebook.imagepipeline.producers.DecodeProducer.ProgressiveDecoder
        public int getIntermediateImageEndOffset(EncodedImage encodedImage) {
        }

        @Override // com.facebook.imagepipeline.producers.DecodeProducer.ProgressiveDecoder
        public QualityInfo getQualityInfo() {
        }

        @Override // com.facebook.imagepipeline.producers.DecodeProducer.ProgressiveDecoder
        public synchronized boolean updateDecodeJob(@Nullable EncodedImage encodedImage, int status) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public abstract class ProgressiveDecoder extends DelegatingConsumer<EncodedImage, CloseableReference<CloseableImage>> {
        private static final int DECODE_EXCEPTION_MESSAGE_NUM_HEADER_BYTES = 10;
        private final String TAG;
        private final ImageDecodeOptions mImageDecodeOptions;
        @GuardedBy("this")
        private boolean mIsFinished;
        private final JobScheduler mJobScheduler;
        private final ProducerContext mProducerContext;
        private final ProducerListener2 mProducerListener;
        public final /* synthetic */ DecodeProducer this$0;

        /* renamed from: com.facebook.imagepipeline.producers.DecodeProducer$ProgressiveDecoder$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 implements JobScheduler.JobRunnable {
            public final /* synthetic */ ProgressiveDecoder this$1;
            public final /* synthetic */ int val$maxBitmapSize;
            public final /* synthetic */ ProducerContext val$producerContext;
            public final /* synthetic */ DecodeProducer val$this$0;

            public AnonymousClass1(final ProgressiveDecoder this$1, final DecodeProducer val$maxBitmapSize, final ProducerContext val$producerContext, final int val$this$0) {
            }

            @Override // com.facebook.imagepipeline.producers.JobScheduler.JobRunnable
            public void run(EncodedImage encodedImage, int status) {
            }
        }

        /* renamed from: com.facebook.imagepipeline.producers.DecodeProducer$ProgressiveDecoder$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass2 extends BaseProducerContextCallbacks {
            public final /* synthetic */ ProgressiveDecoder this$1;
            public final /* synthetic */ boolean val$decodeCancellationEnabled;
            public final /* synthetic */ DecodeProducer val$this$0;

            public AnonymousClass2(final ProgressiveDecoder this$1, final DecodeProducer val$decodeCancellationEnabled, final boolean val$this$0) {
            }

            @Override // com.facebook.imagepipeline.producers.BaseProducerContextCallbacks, com.facebook.imagepipeline.producers.ProducerContextCallbacks
            public void onCancellationRequested() {
            }

            @Override // com.facebook.imagepipeline.producers.BaseProducerContextCallbacks, com.facebook.imagepipeline.producers.ProducerContextCallbacks
            public void onIsIntermediateResultExpectedChanged() {
            }
        }

        public ProgressiveDecoder(final DecodeProducer this$0, final Consumer<CloseableReference<CloseableImage>> consumer, final ProducerContext producerContext, final boolean decodeCancellationEnabled, final int maxBitmapSize) {
        }

        public static /* synthetic */ ProducerContext access$000(ProgressiveDecoder progressiveDecoder) {
        }

        public static /* synthetic */ void access$300(ProgressiveDecoder progressiveDecoder, EncodedImage encodedImage) {
        }

        public static /* synthetic */ void access$400(ProgressiveDecoder progressiveDecoder, EncodedImage encodedImage, int i2) {
        }

        public static /* synthetic */ JobScheduler access$600(ProgressiveDecoder progressiveDecoder) {
        }

        public static /* synthetic */ void access$700(ProgressiveDecoder progressiveDecoder) {
        }

        private void doDecode(EncodedImage encodedImage, int status) {
        }

        @Nullable
        private Map<String, String> getExtraMap(@Nullable CloseableImage image, long queueTime, QualityInfo quality, boolean isFinal, String imageFormatName, String encodedImageSize, String requestImageSize, String sampleSize) {
        }

        private void handleCancellation() {
        }

        private void handleError(Throwable t) {
        }

        private void handleResult(final CloseableImage decodedImage, final int status) {
        }

        private CloseableImage internalDecode(EncodedImage encodedImage, int length, QualityInfo quality) {
        }

        private synchronized boolean isFinished() {
        }

        private void maybeFinish(boolean shouldFinish) {
        }

        private void maybeIncreaseSampleSize(final EncodedImage encodedImage) {
        }

        private void setImageExtras(EncodedImage encodedImage, CloseableImage image) {
        }

        public abstract int getIntermediateImageEndOffset(EncodedImage encodedImage);

        public abstract QualityInfo getQualityInfo();

        @Override // com.facebook.imagepipeline.producers.DelegatingConsumer, com.facebook.imagepipeline.producers.BaseConsumer
        public void onCancellationImpl() {
        }

        @Override // com.facebook.imagepipeline.producers.DelegatingConsumer, com.facebook.imagepipeline.producers.BaseConsumer
        public void onFailureImpl(Throwable t) {
        }

        @Override // com.facebook.imagepipeline.producers.BaseConsumer
        public /* bridge */ /* synthetic */ void onNewResultImpl(@Nullable Object newResult, int status) {
        }

        @Override // com.facebook.imagepipeline.producers.DelegatingConsumer, com.facebook.imagepipeline.producers.BaseConsumer
        public void onProgressUpdateImpl(float progress) {
        }

        public boolean updateDecodeJob(@Nullable EncodedImage ref, int status) {
        }

        public void onNewResultImpl(@Nullable EncodedImage newResult, int status) {
        }
    }

    public DecodeProducer(final ByteArrayPool byteArrayPool, final Executor executor, final ImageDecoder imageDecoder, final ProgressiveJpegConfig progressiveJpegConfig, final boolean downsampleEnabled, final boolean downsampleEnabledForNetwork, final boolean decodeCancellationEnabled, final Producer<EncodedImage> inputProducer, final int maxBitmapSize, final CloseableReferenceFactory closeableReferenceFactory, @Nullable final Runnable reclaimMemoryRunnable, Supplier<Boolean> recoverFromDecoderOOM) {
        this.mByteArrayPool = (ByteArrayPool) Preconditions.checkNotNull(byteArrayPool);
        this.mExecutor = (Executor) Preconditions.checkNotNull(executor);
        this.mImageDecoder = (ImageDecoder) Preconditions.checkNotNull(imageDecoder);
        this.mProgressiveJpegConfig = (ProgressiveJpegConfig) Preconditions.checkNotNull(progressiveJpegConfig);
        this.mDownsampleEnabled = downsampleEnabled;
        this.mDownsampleEnabledForNetwork = downsampleEnabledForNetwork;
        this.mInputProducer = (Producer) Preconditions.checkNotNull(inputProducer);
        this.mDecodeCancellationEnabled = decodeCancellationEnabled;
        this.mMaxBitmapSize = maxBitmapSize;
        this.mCloseableReferenceFactory = closeableReferenceFactory;
        this.mReclaimMemoryRunnable = reclaimMemoryRunnable;
        this.mRecoverFromDecoderOOM = recoverFromDecoderOOM;
    }

    @Override // com.facebook.imagepipeline.producers.Producer
    public void produceResults(final Consumer<CloseableReference<CloseableImage>> consumer, final ProducerContext producerContext) {
        Consumer<EncodedImage> networkImagesProgressiveDecoder;
        try {
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.beginSection("DecodeProducer#produceResults");
            }
            if (!UriUtil.isNetworkUri(producerContext.getImageRequest().getSourceUri())) {
                networkImagesProgressiveDecoder = new LocalImagesProgressiveDecoder(this, consumer, producerContext, this.mDecodeCancellationEnabled, this.mMaxBitmapSize);
            } else {
                networkImagesProgressiveDecoder = new NetworkImagesProgressiveDecoder(this, consumer, producerContext, new ProgressiveJpegParser(this.mByteArrayPool), this.mProgressiveJpegConfig, this.mDecodeCancellationEnabled, this.mMaxBitmapSize);
            }
            this.mInputProducer.produceResults(networkImagesProgressiveDecoder, producerContext);
        } finally {
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.endSection();
            }
        }
    }
}
