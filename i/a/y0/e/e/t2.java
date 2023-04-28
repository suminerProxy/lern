package i.a.y0.e.e;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ObservableRetryPredicate.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class t2<T> extends i.a.y0.e.e.a<T, T> {
    public final i.a.x0.r<? super Throwable> c;

    /* renamed from: d  reason: collision with root package name */
    public final long f28959d;

    /* compiled from: ObservableRetryPredicate.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends AtomicInteger implements i.a.i0<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        public final i.a.i0<? super T> downstream;
        public final i.a.x0.r<? super Throwable> predicate;
        public long remaining;
        public final i.a.g0<? extends T> source;
        public final i.a.y0.a.h upstream;

        public a(i.a.i0<? super T> i0Var, long j2, i.a.x0.r<? super Throwable> rVar, i.a.y0.a.h hVar, i.a.g0<? extends T> g0Var) {
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

        public void subscribeNext() {
        }
    }

    public t2(i.a.b0<T> b0Var, long j2, i.a.x0.r<? super Throwable> rVar) {
    }

    @Override // i.a.b0
    public void subscribeActual(i.a.i0<? super T> i0Var) {
    }
}
