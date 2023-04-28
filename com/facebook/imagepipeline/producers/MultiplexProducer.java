package com.facebook.imagepipeline.producers;

import android.util.Pair;
import androidx.annotation.VisibleForTesting;
import com.facebook.common.util.TriState;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.producers.ProducerContext;
import com.facebook.imagepipeline.systrace.FrescoSystrace;
import com.facebook.infer.annotation.Nullsafe;
import java.io.Closeable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class MultiplexProducer<K, T extends Closeable> implements Producer<T> {
    public static final String EXTRAS_STARTED_AS_PREFETCH = "started_as_prefetch";
    private final String mDedupedRequestsCountKey;
    private final Producer<T> mInputProducer;
    private final boolean mKeepCancelledFetchAsLowPriority;
    @GuardedBy("this")
    @VisibleForTesting
    public final Map<K, MultiplexProducer<K, T>.Multiplexer> mMultiplexers;
    private final String mProducerName;

    /* JADX WARN: Field signature parse error: mKey
    jadx.core.utils.exceptions.JadxRuntimeException: Can't parse type: TK at position 1 ('K'), unexpected: T
    	at jadx.core.dex.nodes.parser.SignatureParser.consumeType(SignatureParser.java:169)
    	at jadx.core.dex.visitors.SignatureProcessor.parseFieldSignature(SignatureProcessor.java:128)
    	at jadx.core.dex.visitors.SignatureProcessor.visit(SignatureProcessor.java:36)
     */
    @VisibleForTesting
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class Multiplexer {
        private final CopyOnWriteArraySet<Pair<Consumer<T>, ProducerContext>> mConsumerContextPairs;
        @GuardedBy("Multiplexer.this")
        @Nullable
        private MultiplexProducer<K, T>.Multiplexer.ForwardingConsumer mForwardingConsumer;
        private final Object mKey;
        @GuardedBy("Multiplexer.this")
        @Nullable
        private T mLastIntermediateResult;
        @GuardedBy("Multiplexer.this")
        private float mLastProgress;
        @GuardedBy("Multiplexer.this")
        private int mLastStatus;
        @GuardedBy("Multiplexer.this")
        @Nullable
        private BaseProducerContext mMultiplexProducerContext;
        public final /* synthetic */ MultiplexProducer this$0;

        /* renamed from: com.facebook.imagepipeline.producers.MultiplexProducer$Multiplexer$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 extends BaseProducerContextCallbacks {
            public final /* synthetic */ Multiplexer this$1;
            public final /* synthetic */ Pair val$consumerContextPair;

            public AnonymousClass1(final Multiplexer this$1, final Pair val$consumerContextPair) {
            }

            @Override // com.facebook.imagepipeline.producers.BaseProducerContextCallbacks, com.facebook.imagepipeline.producers.ProducerContextCallbacks
            public void onCancellationRequested() {
            }

            @Override // com.facebook.imagepipeline.producers.BaseProducerContextCallbacks, com.facebook.imagepipeline.producers.ProducerContextCallbacks
            public void onIsIntermediateResultExpectedChanged() {
            }

            @Override // com.facebook.imagepipeline.producers.BaseProducerContextCallbacks, com.facebook.imagepipeline.producers.ProducerContextCallbacks
            public void onIsPrefetchChanged() {
            }

            @Override // com.facebook.imagepipeline.producers.BaseProducerContextCallbacks, com.facebook.imagepipeline.producers.ProducerContextCallbacks
            public void onPriorityChanged() {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class ForwardingConsumer extends BaseConsumer<T> {
            public final /* synthetic */ Multiplexer this$1;

            private ForwardingConsumer(final Multiplexer this$1) {
            }

            @Override // com.facebook.imagepipeline.producers.BaseConsumer
            public void onCancellationImpl() {
            }

            @Override // com.facebook.imagepipeline.producers.BaseConsumer
            public void onFailureImpl(Throwable t) {
            }

            @Override // com.facebook.imagepipeline.producers.BaseConsumer
            public /* bridge */ /* synthetic */ void onNewResultImpl(@Nullable Object newResult, int status) {
            }

            @Override // com.facebook.imagepipeline.producers.BaseConsumer
            public void onProgressUpdateImpl(float progress) {
            }

            public /* synthetic */ ForwardingConsumer(Multiplexer multiplexer, AnonymousClass1 anonymousClass1) {
            }

            public void onNewResultImpl(@Nullable T newResult, int status) {
            }
        }

        public Multiplexer(final MultiplexProducer this$0, K key) {
        }

        public static /* synthetic */ void access$000(Multiplexer multiplexer, TriState triState) {
        }

        public static /* synthetic */ CopyOnWriteArraySet access$100(Multiplexer multiplexer) {
        }

        public static /* synthetic */ BaseProducerContext access$200(Multiplexer multiplexer) {
        }

        public static /* synthetic */ List access$300(Multiplexer multiplexer) {
        }

        public static /* synthetic */ List access$400(Multiplexer multiplexer) {
        }

        public static /* synthetic */ List access$500(Multiplexer multiplexer) {
        }

        private void addCallbacks(final Pair<Consumer<T>, ProducerContext> consumerContextPair, final ProducerContext producerContext) {
        }

        private void closeSafely(@Nullable Closeable obj) {
        }

        private synchronized boolean computeIsIntermediateResultExpected() {
        }

        private synchronized boolean computeIsPrefetch() {
        }

        private synchronized Priority computePriority() {
        }

        private void startInputProducerIfHasAttachedConsumers(TriState startedAsPrefetch) {
        }

        @Nullable
        private synchronized List<ProducerContextCallbacks> updateIsIntermediateResultExpected() {
        }

        @Nullable
        private synchronized List<ProducerContextCallbacks> updateIsPrefetch() {
        }

        @Nullable
        private synchronized List<ProducerContextCallbacks> updatePriority() {
        }

        public boolean addNewConsumer(final Consumer<T> consumer, final ProducerContext producerContext) {
        }

        public void onCancelled(final MultiplexProducer<K, T>.Multiplexer.ForwardingConsumer forwardingConsumer) {
        }

        public void onFailure(final MultiplexProducer<K, T>.Multiplexer.ForwardingConsumer consumer, final Throwable t) {
        }

        public void onNextResult(final MultiplexProducer<K, T>.Multiplexer.ForwardingConsumer consumer, @Nullable final T closeableObject, final int status) {
        }

        public void onProgressUpdate(MultiplexProducer<K, T>.Multiplexer.ForwardingConsumer forwardingConsumer, float progress) {
        }
    }

    public MultiplexProducer(Producer<T> inputProducer, String producerName, @ProducerContext.ExtraKeys String dedupedRequestsCountKey) {
        this(inputProducer, producerName, dedupedRequestsCountKey, false);
    }

    private synchronized MultiplexProducer<K, T>.Multiplexer createAndPutNewMultiplexer(K key) {
        MultiplexProducer<K, T>.Multiplexer multiplexer;
        multiplexer = new Multiplexer(this, key);
        this.mMultiplexers.put(key, multiplexer);
        return multiplexer;
    }

    @Nullable
    public abstract T cloneOrNull(@Nullable T object);

    @Nullable
    public synchronized MultiplexProducer<K, T>.Multiplexer getExistingMultiplexer(K key) {
        return this.mMultiplexers.get(key);
    }

    public abstract K getKey(ProducerContext producerContext);

    @Override // com.facebook.imagepipeline.producers.Producer
    public void produceResults(Consumer<T> consumer, ProducerContext context) {
        boolean z;
        MultiplexProducer<K, T>.Multiplexer existingMultiplexer;
        try {
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.beginSection("MultiplexProducer#produceResults");
            }
            context.getProducerListener().onProducerStart(context, this.mProducerName);
            K key = getKey(context);
            do {
                z = false;
                synchronized (this) {
                    existingMultiplexer = getExistingMultiplexer(key);
                    if (existingMultiplexer == null) {
                        existingMultiplexer = createAndPutNewMultiplexer(key);
                        z = true;
                    }
                }
            } while (!existingMultiplexer.addNewConsumer(consumer, context));
            if (z) {
                Multiplexer.access$000(existingMultiplexer, TriState.valueOf(context.isPrefetch()));
            }
        } finally {
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.endSection();
            }
        }
    }

    public synchronized void removeMultiplexer(K key, MultiplexProducer<K, T>.Multiplexer multiplexer) {
        if (this.mMultiplexers.get(key) == multiplexer) {
            this.mMultiplexers.remove(key);
        }
    }

    public MultiplexProducer(Producer<T> inputProducer, String producerName, @ProducerContext.ExtraKeys String dedupedRequestsCountKey, boolean keepCancelledFetchAsLowPriority) {
        this.mInputProducer = inputProducer;
        this.mMultiplexers = new HashMap();
        this.mKeepCancelledFetchAsLowPriority = keepCancelledFetchAsLowPriority;
        this.mProducerName = producerName;
        this.mDedupedRequestsCountKey = dedupedRequestsCountKey;
    }
}
