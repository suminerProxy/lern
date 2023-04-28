package i.a.y0.e.e;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableCombineLatest.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class u<T, R> extends i.a.b0<R> {
    public final i.a.g0<? extends T>[] b;
    public final Iterable<? extends i.a.g0<? extends T>> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.x0.o<? super Object[], ? extends R> f28962d;

    /* renamed from: e  reason: collision with root package name */
    public final int f28963e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f28964f;

    /* compiled from: ObservableCombineLatest.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, R> extends AtomicReference<i.a.u0.c> implements i.a.i0<T> {
        private static final long serialVersionUID = -4823716997131257941L;
        public final int index;
        public final b<T, R> parent;

        public a(b<T, R> bVar, int i2) {
        }

        public void dispose() {
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

    /* compiled from: ObservableCombineLatest.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T, R> extends AtomicInteger implements i.a.u0.c {
        private static final long serialVersionUID = 8567835998786448817L;
        public int active;
        public volatile boolean cancelled;
        public final i.a.x0.o<? super Object[], ? extends R> combiner;
        public int complete;
        public final boolean delayError;
        public volatile boolean done;
        public final i.a.i0<? super R> downstream;
        public final i.a.y0.j.c errors;
        public Object[] latest;
        public final a<T, R>[] observers;
        public final i.a.y0.f.c<Object[]> queue;

        public b(i.a.i0<? super R> i0Var, i.a.x0.o<? super Object[], ? extends R> oVar, int i2, int i3, boolean z) {
        }

        public void cancelSources() {
        }

        public void clear(i.a.y0.f.c<?> cVar) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        public void drain() {
        }

        public void innerComplete(int i2) {
        }

        public void innerError(int i2, Throwable th) {
        }

        public void innerNext(int i2, T t) {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
        }

        public void subscribe(i.a.g0<? extends T>[] g0VarArr) {
        }
    }

    public u(i.a.g0<? extends T>[] g0VarArr, Iterable<? extends i.a.g0<? extends T>> iterable, i.a.x0.o<? super Object[], ? extends R> oVar, int i2, boolean z) {
    }

    @Override // i.a.b0
    public void subscribeActual(i.a.i0<? super R> i0Var) {
    }
}
