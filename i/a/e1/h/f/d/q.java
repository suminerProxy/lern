package i.a.e1.h.f.d;

import i.a.e1.c.i0;
import i.a.e1.c.p0;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableConcatMapCompletable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class q<T> extends i.a.e1.c.j {
    public final i0<T> b;
    public final i.a.e1.g.o<? super T, ? extends i.a.e1.c.p> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.h.k.j f27363d;

    /* renamed from: e  reason: collision with root package name */
    public final int f27364e;

    /* compiled from: ObservableConcatMapCompletable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicInteger implements p0<T>, i.a.e1.d.f {
        private static final long serialVersionUID = 3610901111000061034L;
        public volatile boolean active;
        public volatile boolean disposed;
        public volatile boolean done;
        public final i.a.e1.c.m downstream;
        public final i.a.e1.h.k.j errorMode;
        public final i.a.e1.h.k.c errors;
        public final C0470a inner;
        public final i.a.e1.g.o<? super T, ? extends i.a.e1.c.p> mapper;
        public final int prefetch;
        public i.a.e1.h.c.q<T> queue;
        public i.a.e1.d.f upstream;

        /* compiled from: ObservableConcatMapCompletable.java */
        /* renamed from: i.a.e1.h.f.d.q$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public static final class C0470a extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.m {
            private static final long serialVersionUID = 5638352172918776687L;
            public final a<?> parent;

            public C0470a(a<?> parent) {
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

        public a(i.a.e1.c.m downstream, i.a.e1.g.o<? super T, ? extends i.a.e1.c.p> mapper, i.a.e1.h.k.j errorMode, int prefetch) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        public void drain() {
        }

        public void innerComplete() {
        }

        public void innerError(Throwable ex) {
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

    public q(i0<T> source, i.a.e1.g.o<? super T, ? extends i.a.e1.c.p> mapper, i.a.e1.h.k.j errorMode, int prefetch) {
    }

    @Override // i.a.e1.c.j
    public void Y0(i.a.e1.c.m observer) {
    }
}
