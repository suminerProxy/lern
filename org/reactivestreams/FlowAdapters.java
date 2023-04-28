package org.reactivestreams;

import java.util.concurrent.Flow;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class FlowAdapters {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class FlowPublisherFromReactive<T> implements Flow.Publisher<T> {
        public final Publisher<? extends T> reactiveStreams;

        public FlowPublisherFromReactive(Publisher<? extends T> publisher) {
        }

        @Override // java.util.concurrent.Flow.Publisher
        public void subscribe(Flow.Subscriber<? super T> subscriber) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class FlowToReactiveProcessor<T, U> implements Flow.Processor<T, U> {
        public final Processor<? super T, ? extends U> reactiveStreams;

        public FlowToReactiveProcessor(Processor<? super T, ? extends U> processor) {
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onComplete() {
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onError(Throwable th) {
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onNext(T t) {
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onSubscribe(Flow.Subscription subscription) {
        }

        @Override // java.util.concurrent.Flow.Publisher
        public void subscribe(Flow.Subscriber<? super U> subscriber) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class FlowToReactiveSubscriber<T> implements Flow.Subscriber<T> {
        public final Subscriber<? super T> reactiveStreams;

        public FlowToReactiveSubscriber(Subscriber<? super T> subscriber) {
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onComplete() {
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onError(Throwable th) {
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onNext(T t) {
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onSubscribe(Flow.Subscription subscription) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class FlowToReactiveSubscription implements Flow.Subscription {
        public final Subscription reactiveStreams;

        public FlowToReactiveSubscription(Subscription subscription) {
        }

        @Override // java.util.concurrent.Flow.Subscription
        public void cancel() {
        }

        @Override // java.util.concurrent.Flow.Subscription
        public void request(long j2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class ReactivePublisherFromFlow<T> implements Publisher<T> {
        public final Flow.Publisher<? extends T> flow;

        public ReactivePublisherFromFlow(Flow.Publisher<? extends T> publisher) {
        }

        @Override // org.reactivestreams.Publisher
        public void subscribe(Subscriber<? super T> subscriber) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class ReactiveToFlowProcessor<T, U> implements Processor<T, U> {
        public final Flow.Processor<? super T, ? extends U> flow;

        public ReactiveToFlowProcessor(Flow.Processor<? super T, ? extends U> processor) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
        }

        @Override // org.reactivestreams.Subscriber, i.a.q
        public void onSubscribe(Subscription subscription) {
        }

        @Override // org.reactivestreams.Publisher
        public void subscribe(Subscriber<? super U> subscriber) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class ReactiveToFlowSubscriber<T> implements Subscriber<T> {
        public final Flow.Subscriber<? super T> flow;

        public ReactiveToFlowSubscriber(Flow.Subscriber<? super T> subscriber) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
        }

        @Override // org.reactivestreams.Subscriber, i.a.q
        public void onSubscribe(Subscription subscription) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class ReactiveToFlowSubscription implements Subscription {
        public final Flow.Subscription flow;

        public ReactiveToFlowSubscription(Flow.Subscription subscription) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
        }
    }

    private FlowAdapters() {
    }

    public static <T, U> Flow.Processor<T, U> toFlowProcessor(Processor<? super T, ? extends U> processor) {
    }

    public static <T> Flow.Publisher<T> toFlowPublisher(Publisher<? extends T> publisher) {
    }

    public static <T> Flow.Subscriber<T> toFlowSubscriber(Subscriber<T> subscriber) {
    }

    public static <T, U> Processor<T, U> toProcessor(Flow.Processor<? super T, ? extends U> processor) {
    }

    public static <T> Publisher<T> toPublisher(Flow.Publisher<? extends T> publisher) {
    }

    public static <T> Subscriber<T> toSubscriber(Flow.Subscriber<T> subscriber) {
    }
}
