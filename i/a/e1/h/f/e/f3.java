package i.a.e1.h.f.e;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ObservableSequenceEqual.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class f3<T> extends i.a.e1.c.i0<Boolean> {
    public final i.a.e1.c.n0<? extends T> b;
    public final i.a.e1.c.n0<? extends T> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.g.d<? super T, ? super T> f27441d;

    /* renamed from: e  reason: collision with root package name */
    public final int f27442e;

    /* compiled from: ObservableSequenceEqual.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicInteger implements i.a.e1.d.f {
        private static final long serialVersionUID = -6178010334400373240L;
        public volatile boolean cancelled;
        public final i.a.e1.g.d<? super T, ? super T> comparer;
        public final i.a.e1.c.p0<? super Boolean> downstream;
        public final i.a.e1.c.n0<? extends T> first;
        public final b<T>[] observers;
        public final i.a.e1.h.a.a resources;
        public final i.a.e1.c.n0<? extends T> second;
        public T v1;
        public T v2;

        public a(i.a.e1.c.p0<? super Boolean> actual, int bufferSize, i.a.e1.c.n0<? extends T> first, i.a.e1.c.n0<? extends T> second, i.a.e1.g.d<? super T, ? super T> comparer) {
        }

        public void cancel(i.a.e1.h.g.c<T> q1, i.a.e1.h.g.c<T> q2) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        public void drain() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }

        public boolean setDisposable(i.a.e1.d.f d2, int index) {
        }

        public void subscribe() {
        }
    }

    /* compiled from: ObservableSequenceEqual.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T> implements i.a.e1.c.p0<T> {
        public final a<T> b;
        public final i.a.e1.h.g.c<T> c;

        /* renamed from: d  reason: collision with root package name */
        public final int f27443d;

        /* renamed from: e  reason: collision with root package name */
        public volatile boolean f27444e;

        /* renamed from: f  reason: collision with root package name */
        public Throwable f27445f;

        public b(a<T> parent, int index, int bufferSize) {
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

    public f3(i.a.e1.c.n0<? extends T> first, i.a.e1.c.n0<? extends T> second, i.a.e1.g.d<? super T, ? super T> comparer, int bufferSize) {
    }

    @Override // i.a.e1.c.i0
    public void c6(i.a.e1.c.p0<? super Boolean> observer) {
    }
}
