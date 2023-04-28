package i.a.e1.h.f.e;

import java.util.ArrayDeque;

/* compiled from: ObservableTakeLast.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class t3<T> extends i.a.e1.h.f.e.a<T, T> {
    public final int c;

    /* compiled from: ObservableTakeLast.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends ArrayDeque<T> implements i.a.e1.c.p0<T>, i.a.e1.d.f {
        private static final long serialVersionUID = 7240042530241604978L;
        public volatile boolean cancelled;
        public final int count;
        public final i.a.e1.c.p0<? super T> downstream;
        public i.a.e1.d.f upstream;

        public a(i.a.e1.c.p0<? super T> actual, int count) {
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

    public t3(i.a.e1.c.n0<T> source, int count) {
    }

    @Override // i.a.e1.c.i0
    public void c6(i.a.e1.c.p0<? super T> t) {
    }
}
