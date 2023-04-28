package i.a.y0.e.e;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ObservableSequenceEqual.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class a3<T> extends i.a.b0<Boolean> {
    public final i.a.g0<? extends T> b;
    public final i.a.g0<? extends T> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.x0.d<? super T, ? super T> f28700d;

    /* renamed from: e  reason: collision with root package name */
    public final int f28701e;

    /* compiled from: ObservableSequenceEqual.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends AtomicInteger implements i.a.u0.c {
        private static final long serialVersionUID = -6178010334400373240L;
        public volatile boolean cancelled;
        public final i.a.x0.d<? super T, ? super T> comparer;
        public final i.a.i0<? super Boolean> downstream;
        public final i.a.g0<? extends T> first;
        public final b<T>[] observers;
        public final i.a.y0.a.a resources;
        public final i.a.g0<? extends T> second;
        public T v1;
        public T v2;

        public a(i.a.i0<? super Boolean> i0Var, int i2, i.a.g0<? extends T> g0Var, i.a.g0<? extends T> g0Var2, i.a.x0.d<? super T, ? super T> dVar) {
        }

        public void cancel(i.a.y0.f.c<T> cVar, i.a.y0.f.c<T> cVar2) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        public void drain() {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
        }

        public boolean setDisposable(i.a.u0.c cVar, int i2) {
        }

        public void subscribe() {
        }
    }

    /* compiled from: ObservableSequenceEqual.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T> implements i.a.i0<T> {
        public final a<T> b;
        public final i.a.y0.f.c<T> c;

        /* renamed from: d  reason: collision with root package name */
        public final int f28702d;

        /* renamed from: e  reason: collision with root package name */
        public volatile boolean f28703e;

        /* renamed from: f  reason: collision with root package name */
        public Throwable f28704f;

        public b(a<T> aVar, int i2, int i3) {
        }

        @Override // i.a.i0
        public void onComplete() {
        }

        @Override // i.a.i0
        public void onError(Throwable th) {
        }

        @Override // i.a.i0
        public void onNext(T t) {
        }

        @Override // i.a.i0
        public void onSubscribe(i.a.u0.c cVar) {
        }
    }

    public a3(i.a.g0<? extends T> g0Var, i.a.g0<? extends T> g0Var2, i.a.x0.d<? super T, ? super T> dVar, int i2) {
    }

    @Override // i.a.b0
    public void subscribeActual(i.a.i0<? super Boolean> i0Var) {
    }
}
