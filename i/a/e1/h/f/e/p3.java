package i.a.e1.h.f.e;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableSubscribeOn.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class p3<T> extends i.a.e1.h.f.e.a<T, T> {
    public final i.a.e1.c.q0 c;

    /* compiled from: ObservableSubscribeOn.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.p0<T>, i.a.e1.d.f {
        private static final long serialVersionUID = 8094547886072529208L;
        public final i.a.e1.c.p0<? super T> downstream;
        public final AtomicReference<i.a.e1.d.f> upstream;

        public a(i.a.e1.c.p0<? super T> downstream) {
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
        public void onError(Throwable t) {
        }

        @Override // i.a.e1.c.p0
        public void onNext(T t) {
        }

        @Override // i.a.e1.c.p0
        public void onSubscribe(i.a.e1.d.f d2) {
        }

        public void setDisposable(i.a.e1.d.f d2) {
        }
    }

    /* compiled from: ObservableSubscribeOn.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public final class b implements Runnable {
        private final a<T> b;
        public final /* synthetic */ p3 c;

        public b(final p3 this$0, a<T> parent) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public p3(i.a.e1.c.n0<T> source, i.a.e1.c.q0 scheduler) {
    }

    @Override // i.a.e1.c.i0
    public void c6(final i.a.e1.c.p0<? super T> observer) {
    }
}
