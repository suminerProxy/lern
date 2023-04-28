package i.a.e1.h.f.d;

import i.a.e1.c.i0;
import i.a.e1.c.p0;
import i.a.e1.c.u0;
import i.a.e1.c.x0;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableSwitchMapSingle.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class v<T, R> extends i0<R> {
    public final i0<T> b;
    public final i.a.e1.g.o<? super T, ? extends x0<? extends R>> c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f27377d;

    /* compiled from: ObservableSwitchMapSingle.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, R> extends AtomicInteger implements p0<T>, i.a.e1.d.f {
        public static final C0475a<Object> INNER_DISPOSED = null;
        private static final long serialVersionUID = -5402190102429853762L;
        public volatile boolean cancelled;
        public final boolean delayErrors;
        public volatile boolean done;
        public final p0<? super R> downstream;
        public final i.a.e1.h.k.c errors;
        public final AtomicReference<C0475a<R>> inner;
        public final i.a.e1.g.o<? super T, ? extends x0<? extends R>> mapper;
        public i.a.e1.d.f upstream;

        /* compiled from: ObservableSwitchMapSingle.java */
        /* renamed from: i.a.e1.h.f.d.v$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public static final class C0475a<R> extends AtomicReference<i.a.e1.d.f> implements u0<R> {
            private static final long serialVersionUID = 8042919737683345351L;
            public volatile R item;
            public final a<?, R> parent;

            public C0475a(a<?, R> parent) {
            }

            public void dispose() {
            }

            @Override // i.a.e1.c.u0, i.a.e1.c.m
            public void onError(Throwable e2) {
            }

            @Override // i.a.e1.c.u0, i.a.e1.c.m
            public void onSubscribe(i.a.e1.d.f d2) {
            }

            @Override // i.a.e1.c.u0
            public void onSuccess(R t) {
            }
        }

        public a(p0<? super R> downstream, i.a.e1.g.o<? super T, ? extends x0<? extends R>> mapper, boolean delayErrors) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        public void disposeInner() {
        }

        public void drain() {
        }

        public void innerError(C0475a<R> sender, Throwable ex) {
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

    public v(i0<T> source, i.a.e1.g.o<? super T, ? extends x0<? extends R>> mapper, boolean delayErrors) {
    }

    @Override // i.a.e1.c.i0
    public void c6(p0<? super R> observer) {
    }
}
