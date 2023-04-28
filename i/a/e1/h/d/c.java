package i.a.e1.h.d;

import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collector;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableCollectWithCollector.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class c<T, A, R> extends i.a.e1.c.s<R> {
    public final i.a.e1.c.s<T> c;

    /* renamed from: d  reason: collision with root package name */
    public final Collector<T, A, R> f26763d;

    /* compiled from: FlowableCollectWithCollector.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, A, R> extends i.a.e1.h.j.f<R> implements i.a.e1.c.x<T> {
        private static final long serialVersionUID = -229544830565448758L;
        public final BiConsumer<A, T> accumulator;
        public A container;
        public boolean done;
        public final Function<A, R> finisher;
        public Subscription upstream;

        public a(Subscriber<? super R> downstream, A container, BiConsumer<A, T> accumulator, Function<A, R> finisher) {
        }

        @Override // i.a.e1.h.j.f, org.reactivestreams.Subscription
        public void cancel() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable t) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
        }

        @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
        public void onSubscribe(@i.a.e1.b.f Subscription s) {
        }
    }

    public c(i.a.e1.c.s<T> source, Collector<T, A, R> collector) {
    }

    @Override // i.a.e1.c.s
    public void F6(@i.a.e1.b.f Subscriber<? super R> s) {
    }
}
