package i.a.e1.h.f.e;

import java.util.ArrayDeque;

/* compiled from: ObservableSkipLast.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class l3<T> extends i.a.e1.h.f.e.a<T, T> {
    public final int c;

    /* compiled from: ObservableSkipLast.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends ArrayDeque<T> implements i.a.e1.c.p0<T>, i.a.e1.d.f {
        private static final long serialVersionUID = -3807491841935125653L;
        public final i.a.e1.c.p0<? super T> downstream;
        public final int skip;
        public i.a.e1.d.f upstream;

        public a(i.a.e1.c.p0<? super T> actual, int skip) {
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

    public l3(i.a.e1.c.n0<T> source, int skip) {
    }

    @Override // i.a.e1.c.i0
    public void c6(i.a.e1.c.p0<? super T> observer) {
    }
}
