package i.a.e1.h.f.e;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableMergeWithSingle.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class f2<T> extends i.a.e1.h.f.e.a<T, T> {
    public final i.a.e1.c.x0<? extends T> c;

    /* compiled from: ObservableMergeWithSingle.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicInteger implements i.a.e1.c.p0<T>, i.a.e1.d.f {
        public static final int OTHER_STATE_CONSUMED_OR_EMPTY = 2;
        public static final int OTHER_STATE_HAS_VALUE = 1;
        private static final long serialVersionUID = -4592979584110982903L;
        public volatile boolean disposed;
        public final i.a.e1.c.p0<? super T> downstream;
        public final i.a.e1.h.k.c errors;
        public final AtomicReference<i.a.e1.d.f> mainDisposable;
        public volatile boolean mainDone;
        public final C0481a<T> otherObserver;
        public volatile int otherState;
        public volatile i.a.e1.h.c.p<T> queue;
        public T singleItem;

        /* compiled from: ObservableMergeWithSingle.java */
        /* renamed from: i.a.e1.h.f.e.f2$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public static final class C0481a<T> extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.u0<T> {
            private static final long serialVersionUID = -2935427570954647017L;
            public final a<T> parent;

            public C0481a(a<T> parent) {
            }

            @Override // i.a.e1.c.u0, i.a.e1.c.m
            public void onError(Throwable e2) {
            }

            @Override // i.a.e1.c.u0, i.a.e1.c.m
            public void onSubscribe(i.a.e1.d.f d2) {
            }

            @Override // i.a.e1.c.u0
            public void onSuccess(T t) {
            }
        }

        public a(i.a.e1.c.p0<? super T> downstream) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        public void drain() {
        }

        public void drainLoop() {
        }

        public i.a.e1.h.c.p<T> getOrCreateQueue() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }

        @Override // i.a.e1.c.p0
        public void onComplete() {
        }

        @Override // i.a.e1.c.p0
        public void onError(Throwable ex) {
        }

        @Override // i.a.e1.c.p0
        public void onNext(T t) {
        }

        @Override // i.a.e1.c.p0
        public void onSubscribe(i.a.e1.d.f d2) {
        }

        public void otherError(Throwable ex) {
        }

        public void otherSuccess(T value) {
        }
    }

    public f2(i.a.e1.c.i0<T> source, i.a.e1.c.x0<? extends T> other) {
    }

    @Override // i.a.e1.c.i0
    public void c6(i.a.e1.c.p0<? super T> observer) {
    }
}
