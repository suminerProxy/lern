package i.a.e1.h.d;

import i.a.e1.c.r0;
import i.a.e1.c.u0;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collector;
import org.reactivestreams.Subscription;

/* compiled from: FlowableCollectWithCollectorSingle.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class d<T, A, R> extends r0<R> implements i.a.e1.h.c.d<R> {
    public final i.a.e1.c.s<T> b;
    public final Collector<T, A, R> c;

    /* compiled from: FlowableCollectWithCollectorSingle.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, A, R> implements i.a.e1.c.x<T>, i.a.e1.d.f {
        public final u0<? super R> b;
        public final BiConsumer<A, T> c;

        /* renamed from: d  reason: collision with root package name */
        public final Function<A, R> f26769d;

        /* renamed from: e  reason: collision with root package name */
        public Subscription f26770e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f26771f;

        /* renamed from: g  reason: collision with root package name */
        public A f26772g;

        public a(u0<? super R> downstream, A container, BiConsumer<A, T> accumulator, Function<A, R> finisher) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
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

    public d(i.a.e1.c.s<T> source, Collector<T, A, R> collector) {
    }

    @Override // i.a.e1.c.r0
    public void M1(@i.a.e1.b.f u0<? super R> observer) {
    }

    @Override // i.a.e1.h.c.d
    public i.a.e1.c.s<R> c() {
    }
}
