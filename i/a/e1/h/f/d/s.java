package i.a.e1.h.f.d;

import i.a.e1.c.i0;
import i.a.e1.c.n0;
import i.a.e1.c.p0;
import i.a.e1.c.u0;
import i.a.e1.c.x0;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableConcatMapSingle.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class s<T, R> extends i0<R> {
    public final n0<T> b;
    public final i.a.e1.g.o<? super T, ? extends x0<? extends R>> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.h.k.j f27367d;

    /* renamed from: e  reason: collision with root package name */
    public final int f27368e;

    /* compiled from: ObservableConcatMapSingle.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, R> extends AtomicInteger implements p0<T>, i.a.e1.d.f {
        public static final int STATE_ACTIVE = 1;
        public static final int STATE_INACTIVE = 0;
        public static final int STATE_RESULT_VALUE = 2;
        private static final long serialVersionUID = -9140123220065488293L;
        public volatile boolean cancelled;
        public volatile boolean done;
        public final p0<? super R> downstream;
        public final i.a.e1.h.k.j errorMode;
        public final i.a.e1.h.k.c errors;
        public final C0472a<R> inner;
        public R item;
        public final i.a.e1.g.o<? super T, ? extends x0<? extends R>> mapper;
        public final i.a.e1.h.c.p<T> queue;
        public volatile int state;
        public i.a.e1.d.f upstream;

        /* compiled from: ObservableConcatMapSingle.java */
        /* renamed from: i.a.e1.h.f.d.s$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public static final class C0472a<R> extends AtomicReference<i.a.e1.d.f> implements u0<R> {
            private static final long serialVersionUID = -3051469169682093892L;
            public final a<?, R> parent;

            public C0472a(a<?, R> parent) {
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

        public a(p0<? super R> downstream, i.a.e1.g.o<? super T, ? extends x0<? extends R>> mapper, int prefetch, i.a.e1.h.k.j errorMode) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        public void drain() {
        }

        public void innerError(Throwable ex) {
        }

        public void innerSuccess(R item) {
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

    public s(n0<T> source, i.a.e1.g.o<? super T, ? extends x0<? extends R>> mapper, i.a.e1.h.k.j errorMode, int prefetch) {
    }

    @Override // i.a.e1.c.i0
    public void c6(p0<? super R> observer) {
    }
}
