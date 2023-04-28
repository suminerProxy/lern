package i.a.e1.h.f.e;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: ObservableUnsubscribeOn.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class h4<T> extends i.a.e1.h.f.e.a<T, T> {
    public final i.a.e1.c.q0 c;

    /* compiled from: ObservableUnsubscribeOn.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicBoolean implements i.a.e1.c.p0<T>, i.a.e1.d.f {
        private static final long serialVersionUID = 1015244841293359600L;
        public final i.a.e1.c.p0<? super T> downstream;
        public final i.a.e1.c.q0 scheduler;
        public i.a.e1.d.f upstream;

        /* compiled from: ObservableUnsubscribeOn.java */
        /* renamed from: i.a.e1.h.f.e.h4$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public final class RunnableC0484a implements Runnable {
            public final /* synthetic */ a b;

            public RunnableC0484a(final a this$0) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public a(i.a.e1.c.p0<? super T> actual, i.a.e1.c.q0 scheduler) {
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
    }

    public h4(i.a.e1.c.n0<T> source, i.a.e1.c.q0 scheduler) {
    }

    @Override // i.a.e1.c.i0
    public void c6(i.a.e1.c.p0<? super T> t) {
    }
}
