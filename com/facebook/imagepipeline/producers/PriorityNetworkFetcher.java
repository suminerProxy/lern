package com.facebook.imagepipeline.producers;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.common.time.MonotonicClock;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.producers.FetchState;
import com.facebook.imagepipeline.producers.NetworkFetcher;
import com.facebook.infer.annotation.Nullsafe;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class PriorityNetworkFetcher<FETCH_STATE extends FetchState> implements NetworkFetcher<PriorityFetchState<FETCH_STATE>> {
    @VisibleForTesting
    public static final int INFINITE_REQUEUE = -1;
    @VisibleForTesting
    public static final int NO_DELAYED_REQUESTS = -1;
    public static final String TAG = "PriorityNetworkFetcher";
    private final boolean doNotCancelRequests;
    private long firstDelayedRequestEnqueuedTimeStamp;
    private final int immediateRequeueCount;
    private final boolean inflightFetchesCanBeCancelled;
    private volatile boolean isRunning;
    private final MonotonicClock mClock;
    private final HashSet<PriorityFetchState<FETCH_STATE>> mCurrentlyFetching;
    private final LinkedList<PriorityFetchState<FETCH_STATE>> mDelayedQueue;
    private final NetworkFetcher<FETCH_STATE> mDelegate;
    private final LinkedList<PriorityFetchState<FETCH_STATE>> mHiPriQueue;
    private final boolean mIsHiPriFifo;
    private final Object mLock;
    private final LinkedList<PriorityFetchState<FETCH_STATE>> mLowPriQueue;
    private final int mMaxOutstandingHiPri;
    private final int mMaxOutstandingLowPri;
    private final int maxNumberOfRequeue;
    private final boolean multipleDequeue;
    private final long requeueDelayTimeInMillis;

    /* renamed from: com.facebook.imagepipeline.producers.PriorityNetworkFetcher$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends BaseProducerContextCallbacks {
        public final /* synthetic */ PriorityNetworkFetcher this$0;
        public final /* synthetic */ NetworkFetcher.Callback val$callback;
        public final /* synthetic */ PriorityFetchState val$fetchState;

        public AnonymousClass1(final PriorityNetworkFetcher this$0, final PriorityFetchState val$callback, final NetworkFetcher.Callback val$fetchState) {
        }

        @Override // com.facebook.imagepipeline.producers.BaseProducerContextCallbacks, com.facebook.imagepipeline.producers.ProducerContextCallbacks
        public void onCancellationRequested() {
        }

        @Override // com.facebook.imagepipeline.producers.BaseProducerContextCallbacks, com.facebook.imagepipeline.producers.ProducerContextCallbacks
        public void onPriorityChanged() {
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.PriorityNetworkFetcher$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 implements NetworkFetcher.Callback {
        public final /* synthetic */ PriorityNetworkFetcher this$0;
        public final /* synthetic */ PriorityFetchState val$fetchState;

        public AnonymousClass2(final PriorityNetworkFetcher this$0, final PriorityFetchState val$fetchState) {
        }

        @Override // com.facebook.imagepipeline.producers.NetworkFetcher.Callback
        public void onCancellation() {
        }

        @Override // com.facebook.imagepipeline.producers.NetworkFetcher.Callback
        public void onFailure(Throwable throwable) {
        }

        @Override // com.facebook.imagepipeline.producers.NetworkFetcher.Callback
        public void onResponse(InputStream response, int responseLength) throws IOException {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class NonrecoverableException extends Throwable {
        public NonrecoverableException(@Nullable String message) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class PriorityFetchState<FETCH_STATE extends FetchState> extends FetchState {
        @javax.annotation.Nullable
        public NetworkFetcher.Callback callback;
        public final int currentlyFetchingCountWhenCreated;
        public int delayCount;
        public FETCH_STATE delegatedState;
        public long dequeuedTimestamp;
        public final long enqueuedTimestamp;
        public final int hiPriCountWhenCreated;
        public final boolean isInitialPriorityHigh;
        public final int lowPriCountWhenCreated;
        public int priorityChangedCount;
        public int requeueCount;

        public /* synthetic */ PriorityFetchState(Consumer consumer, ProducerContext producerContext, FetchState fetchState, long j2, int i2, int i3, int i4, AnonymousClass1 anonymousClass1) {
        }

        private PriorityFetchState(Consumer<EncodedImage> consumer, ProducerContext producerContext, FETCH_STATE delegatedState, long enqueuedTimestamp, int hiPriCountWhenCreated, int lowPriCountWhenCreated, int currentlyFetchingCountWhenCreated) {
        }
    }

    public PriorityNetworkFetcher(NetworkFetcher<FETCH_STATE> delegate, boolean isHiPriFifo, int maxOutstandingHiPri, int maxOutstandingLowPri, boolean inflightFetchesCanBeCancelled, int maxNumberOfRequeue, boolean doNotCancelRequests, int immediateRequeueCount, int requeueDelayTimeInMillis, boolean multipleDequeue) {
    }

    public static /* synthetic */ boolean access$000(PriorityNetworkFetcher priorityNetworkFetcher) {
    }

    public static /* synthetic */ boolean access$100(PriorityNetworkFetcher priorityNetworkFetcher) {
    }

    public static /* synthetic */ HashSet access$200(PriorityNetworkFetcher priorityNetworkFetcher) {
    }

    public static /* synthetic */ void access$300(PriorityNetworkFetcher priorityNetworkFetcher, PriorityFetchState priorityFetchState, String str) {
    }

    public static /* synthetic */ void access$400(PriorityNetworkFetcher priorityNetworkFetcher, PriorityFetchState priorityFetchState, boolean z) {
    }

    public static /* synthetic */ int access$500(PriorityNetworkFetcher priorityNetworkFetcher) {
    }

    public static /* synthetic */ void access$600(PriorityNetworkFetcher priorityNetworkFetcher, PriorityFetchState priorityFetchState) {
    }

    private void changePriority(PriorityFetchState<FETCH_STATE> fetchState, boolean isNewHiPri) {
    }

    private void changePriorityInDelayedQueue(PriorityFetchState<FETCH_STATE> fetchState) {
    }

    private void delegateFetch(final PriorityFetchState<FETCH_STATE> fetchState) {
    }

    private void dequeueIfAvailableSlots() {
    }

    private void moveDelayedRequestsToPriorityQueues() {
    }

    private void putInDelayedQueue(PriorityFetchState<FETCH_STATE> fetchState) {
    }

    private void putInQueue(PriorityFetchState<FETCH_STATE> entry, boolean isHiPri) {
    }

    private void removeFromQueue(PriorityFetchState<FETCH_STATE> fetchState, String reasonForLogging) {
    }

    private void requeue(PriorityFetchState<FETCH_STATE> fetchState) {
    }

    @Override // com.facebook.imagepipeline.producers.NetworkFetcher
    public /* bridge */ /* synthetic */ FetchState createFetchState(Consumer consumer, ProducerContext producerContext) {
    }

    @Override // com.facebook.imagepipeline.producers.NetworkFetcher
    public /* bridge */ /* synthetic */ void fetch(final FetchState fetchState, final NetworkFetcher.Callback callback) {
    }

    @VisibleForTesting
    public HashSet<PriorityFetchState<FETCH_STATE>> getCurrentlyFetching() {
    }

    @VisibleForTesting
    public List<PriorityFetchState<FETCH_STATE>> getDelayedQeueue() {
    }

    @Override // com.facebook.imagepipeline.producers.NetworkFetcher
    @javax.annotation.Nullable
    public /* bridge */ /* synthetic */ Map getExtraMap(FetchState fetchState, int byteSize) {
    }

    @VisibleForTesting
    public List<PriorityFetchState<FETCH_STATE>> getHiPriQueue() {
    }

    @VisibleForTesting
    public List<PriorityFetchState<FETCH_STATE>> getLowPriQueue() {
    }

    @Override // com.facebook.imagepipeline.producers.NetworkFetcher
    public /* bridge */ /* synthetic */ void onFetchCompletion(FetchState fetchState, int byteSize) {
    }

    public void pause() {
    }

    public void resume() {
    }

    @Override // com.facebook.imagepipeline.producers.NetworkFetcher
    public /* bridge */ /* synthetic */ boolean shouldPropagate(FetchState fetchState) {
    }

    @Override // com.facebook.imagepipeline.producers.NetworkFetcher
    public PriorityFetchState<FETCH_STATE> createFetchState(Consumer<EncodedImage> consumer, ProducerContext producerContext) {
    }

    public void fetch(final PriorityFetchState<FETCH_STATE> fetchState, final NetworkFetcher.Callback callback) {
    }

    @javax.annotation.Nullable
    public Map<String, String> getExtraMap(PriorityFetchState<FETCH_STATE> fetchState, int byteSize) {
    }

    public void onFetchCompletion(PriorityFetchState<FETCH_STATE> fetchState, int byteSize) {
    }

    public boolean shouldPropagate(PriorityFetchState<FETCH_STATE> fetchState) {
    }

    public PriorityNetworkFetcher(NetworkFetcher<FETCH_STATE> delegate, boolean isHiPriFifo, int maxOutstandingHiPri, int maxOutstandingLowPri, boolean inflightFetchesCanBeCancelled, boolean infiniteRequeue, boolean doNotCancelRequests) {
    }

    @VisibleForTesting
    public PriorityNetworkFetcher(NetworkFetcher<FETCH_STATE> delegate, boolean isHiPriFifo, int maxOutstandingHiPri, int maxOutstandingLowPri, boolean inflightFetchesCanBeCancelled, int maxNumberOfRequeue, boolean doNotCancelRequests, int immediateRequeueCount, int requeueDelayTimeInMillis, boolean multipleDequeue, MonotonicClock clock) {
    }
}
