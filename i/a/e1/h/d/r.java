package i.a.e1.h.d;

import i.a.e1.c.i0;
import i.a.e1.c.p0;
import i.a.e1.c.r0;
import i.a.e1.c.u0;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collector;

/* compiled from: ObservableCollectWithCollectorSingle.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class r<T, A, R> extends r0<R> implements i.a.e1.h.c.f<R> {
    public final i0<T> b;
    public final Collector<T, A, R> c;

    /* compiled from: ObservableCollectWithCollectorSingle.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, A, R> implements p0<T>, i.a.e1.d.f {
        public final u0<? super R> b;
        public final BiConsumer<A, T> c;

        /* renamed from: d  reason: collision with root package name */
        public final Function<A, R> f26796d;

        /* renamed from: e  reason: collision with root package name */
        public i.a.e1.d.f f26797e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f26798f;

        /* renamed from: g  reason: collision with root package name */
        public A f26799g;

        public a(u0<? super R> downstream, A container, BiConsumer<A, T> accumulator, Function<A, R> finisher) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }

        @Override // i.a.e1.c.p0
        public void onComplete() {
        }

        @Override // i.a.e1.c.p0
        public void onError(Throwable t) {
        }

        @Override // i.a.e1.c.p0
        public void onNext(T t) {
        }

        @Override // i.a.e1.c.p0
        public void onSubscribe(@i.a.e1.b.f i.a.e1.d.f d2) {
        }
    }

    public r(i0<T> source, Collector<T, A, R> collector) {
    }

    @Override // i.a.e1.c.r0
    public void M1(@i.a.e1.b.f u0<? super R> observer) {
    }

    @Override // i.a.e1.h.c.f
    public i0<R> a() {
    }
}
