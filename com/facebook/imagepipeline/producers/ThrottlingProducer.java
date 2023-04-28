package com.facebook.imagepipeline.producers;

import android.util.Pair;
import com.facebook.common.internal.Preconditions;
import com.facebook.infer.annotation.Nullsafe;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class ThrottlingProducer<T> implements Producer<T> {
    public static final String PRODUCER_NAME = "ThrottlingProducer";
    private final Executor mExecutor;
    private final Producer<T> mInputProducer;
    private final int mMaxSimultaneousRequests;
    @GuardedBy("this")
    private final ConcurrentLinkedQueue<Pair<Consumer<T>, ProducerContext>> mPendingRequests = new ConcurrentLinkedQueue<>();
    @GuardedBy("this")
    private int mNumCurrentRequests = 0;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class ThrottlerConsumer extends DelegatingConsumer<T, T> {
        public final /* synthetic */ ThrottlingProducer this$0;

        /* renamed from: com.facebook.imagepipeline.producers.ThrottlingProducer$ThrottlerConsumer$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 implements Runnable {
            public final /* synthetic */ ThrottlerConsumer this$1;
            public final /* synthetic */ Pair val$nextRequestPair;

            public AnonymousClass1(final ThrottlerConsumer this$1, final Pair val$nextRequestPair) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public /* synthetic */ ThrottlerConsumer(ThrottlingProducer throttlingProducer, Consumer consumer, AnonymousClass1 anonymousClass1) {
        }

        private void onRequestFinished() {
        }

        @Override // com.facebook.imagepipeline.producers.DelegatingConsumer, com.facebook.imagepipeline.producers.BaseConsumer
        public void onCancellationImpl() {
        }

        @Override // com.facebook.imagepipeline.producers.DelegatingConsumer, com.facebook.imagepipeline.producers.BaseConsumer
        public void onFailureImpl(Throwable t) {
        }

        @Override // com.facebook.imagepipeline.producers.BaseConsumer
        public void onNewResultImpl(@Nullable T newResult, int status) {
        }

        private ThrottlerConsumer(final ThrottlingProducer this$0, Consumer<T> consumer) {
        }
    }

    public ThrottlingProducer(int maxSimultaneousRequests, Executor executor, final Producer<T> inputProducer) {
        this.mMaxSimultaneousRequests = maxSimultaneousRequests;
        this.mExecutor = (Executor) Preconditions.checkNotNull(executor);
        this.mInputProducer = (Producer) Preconditions.checkNotNull(inputProducer);
    }

    public static /* synthetic */ int access$210(ThrottlingProducer throttlingProducer) {
        int i2 = throttlingProducer.mNumCurrentRequests;
        throttlingProducer.mNumCurrentRequests = i2 - 1;
        return i2;
    }

    @Override // com.facebook.imagepipeline.producers.Producer
    public void produceResults(final Consumer<T> consumer, final ProducerContext producerContext) {
        boolean z;
        producerContext.getProducerListener().onProducerStart(producerContext, PRODUCER_NAME);
        synchronized (this) {
            int i2 = this.mNumCurrentRequests;
            z = true;
            if (i2 >= this.mMaxSimultaneousRequests) {
                this.mPendingRequests.add(Pair.create(consumer, producerContext));
            } else {
                this.mNumCurrentRequests = i2 + 1;
                z = false;
            }
        }
        if (z) {
            return;
        }
        produceResultsInternal(consumer, producerContext);
    }

    public void produceResultsInternal(Consumer<T> consumer, ProducerContext producerContext) {
        producerContext.getProducerListener().onProducerFinishWithSuccess(producerContext, PRODUCER_NAME, null);
        this.mInputProducer.produceResults(new ThrottlerConsumer(this, consumer, null), producerContext);
    }
}
