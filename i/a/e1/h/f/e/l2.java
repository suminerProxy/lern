package i.a.e1.h.f.e;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservablePublish.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class l2<T> extends i.a.e1.i.a<T> implements i.a.e1.h.c.i<T> {
    public final i.a.e1.c.n0<T> b;
    public final AtomicReference<b<T>> c;

    /* compiled from: ObservablePublish.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicReference<b<T>> implements i.a.e1.d.f {
        private static final long serialVersionUID = 7463222674719692880L;
        public final i.a.e1.c.p0<? super T> downstream;

        public a(i.a.e1.c.p0<? super T> downstream, b<T> parent) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }
    }

    /* compiled from: ObservablePublish.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T> extends AtomicReference<a<T>[]> implements i.a.e1.c.p0<T>, i.a.e1.d.f {
        public static final a[] EMPTY = null;
        public static final a[] TERMINATED = null;
        private static final long serialVersionUID = -3251430252873581268L;
        public final AtomicBoolean connect;
        public final AtomicReference<b<T>> current;
        public Throwable error;
        public final AtomicReference<i.a.e1.d.f> upstream;

        public b(AtomicReference<b<T>> current) {
        }

        public boolean add(a<T> inner) {
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
        public void onError(Throwable e2) {
        }

        @Override // i.a.e1.c.p0
        public void onNext(T t) {
        }

        @Override // i.a.e1.c.p0
        public void onSubscribe(i.a.e1.d.f d2) {
        }

        public void remove(a<T> inner) {
        }
    }

    public l2(i.a.e1.c.n0<T> source) {
    }

    @Override // i.a.e1.i.a
    public void D8(i.a.e1.g.g<? super i.a.e1.d.f> connection) {
    }

    @Override // i.a.e1.i.a
    public void K8() {
    }

    @Override // i.a.e1.c.i0
    public void c6(i.a.e1.c.p0<? super T> observer) {
    }

    @Override // i.a.e1.h.c.i
    public i.a.e1.c.n0<T> source() {
    }
}
