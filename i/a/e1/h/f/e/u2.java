package i.a.e1.h.f.e;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ObservableRepeatUntil.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class u2<T> extends i.a.e1.h.f.e.a<T, T> {
    public final i.a.e1.g.e c;

    /* compiled from: ObservableRepeatUntil.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicInteger implements i.a.e1.c.p0<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        public final i.a.e1.c.p0<? super T> downstream;
        public final i.a.e1.c.n0<? extends T> source;
        public final i.a.e1.g.e stop;
        public final i.a.e1.h.a.f upstream;

        public a(i.a.e1.c.p0<? super T> actual, i.a.e1.g.e until, i.a.e1.h.a.f sd, i.a.e1.c.n0<? extends T> source) {
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

        public void subscribeNext() {
        }
    }

    public u2(i.a.e1.c.i0<T> source, i.a.e1.g.e until) {
    }

    @Override // i.a.e1.c.i0
    public void c6(i.a.e1.c.p0<? super T> observer) {
    }
}
