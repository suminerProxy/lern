package i.a.e1.h.f.d;

import i.a.e1.c.i0;
import i.a.e1.c.p0;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableSwitchMapCompletable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class t<T> extends i.a.e1.c.j {
    public final i0<T> b;
    public final i.a.e1.g.o<? super T, ? extends i.a.e1.c.p> c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f27369d;

    /* compiled from: ObservableSwitchMapCompletable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> implements p0<T>, i.a.e1.d.f {

        /* renamed from: i  reason: collision with root package name */
        public static final C0473a f27370i = null;
        public final i.a.e1.c.m b;
        public final i.a.e1.g.o<? super T, ? extends i.a.e1.c.p> c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f27371d;

        /* renamed from: e  reason: collision with root package name */
        public final i.a.e1.h.k.c f27372e;

        /* renamed from: f  reason: collision with root package name */
        public final AtomicReference<C0473a> f27373f;

        /* renamed from: g  reason: collision with root package name */
        public volatile boolean f27374g;

        /* renamed from: h  reason: collision with root package name */
        public i.a.e1.d.f f27375h;

        /* compiled from: ObservableSwitchMapCompletable.java */
        /* renamed from: i.a.e1.h.f.d.t$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public static final class C0473a extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.m {
            private static final long serialVersionUID = -8003404460084760287L;
            public final a<?> parent;

            public C0473a(a<?> parent) {
            }

            public void dispose() {
            }

            @Override // i.a.e1.c.m
            public void onComplete() {
            }

            @Override // i.a.e1.c.m
            public void onError(Throwable e2) {
            }

            @Override // i.a.e1.c.m
            public void onSubscribe(i.a.e1.d.f d2) {
            }
        }

        public a(i.a.e1.c.m downstream, i.a.e1.g.o<? super T, ? extends i.a.e1.c.p> mapper, boolean delayErrors) {
        }

        public void a() {
        }

        public void b(C0473a sender) {
        }

        public void c(C0473a sender, Throwable error) {
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
        public void onSubscribe(i.a.e1.d.f d2) {
        }
    }

    public t(i0<T> source, i.a.e1.g.o<? super T, ? extends i.a.e1.c.p> mapper, boolean delayErrors) {
    }

    @Override // i.a.e1.c.j
    public void Y0(i.a.e1.c.m observer) {
    }
}
