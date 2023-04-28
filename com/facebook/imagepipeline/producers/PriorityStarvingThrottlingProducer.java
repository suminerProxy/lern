package com.facebook.imagepipeline.producers;

import com.facebook.infer.annotation.Nullsafe;
import java.util.Comparator;
import java.util.Queue;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class PriorityStarvingThrottlingProducer<T> implements Producer<T> {
    public static final String PRODUCER_NAME = "PriorityStarvingThrottlingProducer";
    private final Executor mExecutor;
    private final Producer<T> mInputProducer;
    private final int mMaxSimultaneousRequests;
    @GuardedBy("this")
    private int mNumCurrentRequests;
    @GuardedBy("this")
    private final Queue<Item<T>> mPendingRequests;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class Item<T> {
        public final Consumer<T> consumer;
        public final ProducerContext producerContext;
        public final long time;

        public Item(Consumer<T> consumer, ProducerContext producerContext, long time) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class PriorityComparator<T> implements Comparator<Item<T>> {
        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Object o1, Object o2) {
        }

        public int compare(Item<T> o1, Item<T> o2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class ThrottlerConsumer extends DelegatingConsumer<T, T> {
        public final /* synthetic */ PriorityStarvingThrottlingProducer this$0;

        /* renamed from: com.facebook.imagepipeline.producers.PriorityStarvingThrottlingProducer$ThrottlerConsumer$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 implements Runnable {
            public final /* synthetic */ ThrottlerConsumer this$1;
            public final /* synthetic */ Item val$nextRequest;

            public AnonymousClass1(final ThrottlerConsumer this$1, final Item val$nextRequest) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public /* synthetic */ ThrottlerConsumer(PriorityStarvingThrottlingProducer priorityStarvingThrottlingProducer, Consumer consumer, AnonymousClass1 anonymousClass1) {
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

        private ThrottlerConsumer(final PriorityStarvingThrottlingProducer this$0, Consumer<T> consumer) {
        }
    }

    public PriorityStarvingThrottlingProducer(int maxSimultaneousRequests, Executor executor, final Producer<T> inputProducer) {
    }

    public static /* synthetic */ Queue access$100(PriorityStarvingThrottlingProducer priorityStarvingThrottlingProducer) {
    }

    public static /* synthetic */ int access$210(PriorityStarvingThrottlingProducer priorityStarvingThrottlingProducer) {
    }

    public static /* synthetic */ void access$300(PriorityStarvingThrottlingProducer priorityStarvingThrottlingProducer, Item item) {
    }

    public static /* synthetic */ Executor access$400(PriorityStarvingThrottlingProducer priorityStarvingThrottlingProducer) {
    }

    private void produceResultsInternal(Item<T> item) {
    }

    @Override // com.facebook.imagepipeline.producers.Producer
    public void produceResults(final Consumer<T> consumer, final ProducerContext producerContext) {
    }
}
