package i.a.y0.e.e;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableZip.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class l4<T, R> extends i.a.b0<R> {
    public final i.a.g0<? extends T>[] b;
    public final Iterable<? extends i.a.g0<? extends T>> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.x0.o<? super Object[], ? extends R> f28850d;

    /* renamed from: e  reason: collision with root package name */
    public final int f28851e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f28852f;

    /* compiled from: ObservableZip.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, R> extends AtomicInteger implements i.a.u0.c {
        private static final long serialVersionUID = 2983708048395377667L;
        public volatile boolean cancelled;
        public final boolean delayError;
        public final i.a.i0<? super R> downstream;
        public final b<T, R>[] observers;
        public final T[] row;
        public final i.a.x0.o<? super Object[], ? extends R> zipper;

        public a(i.a.i0<? super R> i0Var, i.a.x0.o<? super Object[], ? extends R> oVar, int i2, boolean z) {
        }

        public void cancel() {
        }

        public void cancelSources() {
        }

        public boolean checkTerminated(boolean z, boolean z2, i.a.i0<? super R> i0Var, boolean z3, b<?, ?> bVar) {
        }

        public void clear() {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        public void drain() {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
        }

        public void subscribe(i.a.g0<? extends T>[] g0VarArr, int i2) {
        }
    }

    /* compiled from: ObservableZip.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T, R> implements i.a.i0<T> {
        public final a<T, R> b;
        public final i.a.y0.f.c<T> c;

        /* renamed from: d  reason: collision with root package name */
        public volatile boolean f28853d;

        /* renamed from: e  reason: collision with root package name */
        public Throwable f28854e;

        /* renamed from: f  reason: collision with root package name */
        public final AtomicReference<i.a.u0.c> f28855f;

        public b(a<T, R> aVar, int i2) {
        }

        public void a() {
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

    public l4(i.a.g0<? extends T>[] g0VarArr, Iterable<? extends i.a.g0<? extends T>> iterable, i.a.x0.o<? super Object[], ? extends R> oVar, int i2, boolean z) {
    }

    @Override // i.a.b0
    public void subscribeActual(i.a.i0<? super R> i0Var) {
    }
}
