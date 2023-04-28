package i.a.e1.h.f.e;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableAmb.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class h<T> extends i.a.e1.c.i0<T> {
    public final i.a.e1.c.n0<? extends T>[] b;
    public final Iterable<? extends i.a.e1.c.n0<? extends T>> c;

    /* compiled from: ObservableAmb.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> implements i.a.e1.d.f {
        public final i.a.e1.c.p0<? super T> b;
        public final b<T>[] c;

        /* renamed from: d  reason: collision with root package name */
        public final AtomicInteger f27463d;

        public a(i.a.e1.c.p0<? super T> actual, int count) {
        }

        public void a(i.a.e1.c.n0<? extends T>[] sources) {
        }

        public boolean b(int index) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }
    }

    /* compiled from: ObservableAmb.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T> extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.p0<T> {
        private static final long serialVersionUID = -1185974347409665484L;
        public final i.a.e1.c.p0<? super T> downstream;
        public final int index;
        public final a<T> parent;
        public boolean won;

        public b(a<T> parent, int index, i.a.e1.c.p0<? super T> downstream) {
        }

        public void dispose() {
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

    public h(i.a.e1.c.n0<? extends T>[] sources, Iterable<? extends i.a.e1.c.n0<? extends T>> sourcesIterable) {
    }

    @Override // i.a.e1.c.i0
    public void c6(i.a.e1.c.p0<? super T> observer) {
    }
}
