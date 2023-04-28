package i.a.y0.e.e;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ObservableRepeatUntil.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class p2<T> extends i.a.y0.e.e.a<T, T> {
    public final i.a.x0.e c;

    /* compiled from: ObservableRepeatUntil.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends AtomicInteger implements i.a.i0<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        public final i.a.i0<? super T> downstream;
        public final i.a.g0<? extends T> source;
        public final i.a.x0.e stop;
        public final i.a.y0.a.h upstream;

        public a(i.a.i0<? super T> i0Var, i.a.x0.e eVar, i.a.y0.a.h hVar, i.a.g0<? extends T> g0Var) {
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

    public p2(i.a.b0<T> b0Var, i.a.x0.e eVar) {
    }

    @Override // i.a.b0
    public void subscribeActual(i.a.i0<? super T> i0Var) {
    }
}
