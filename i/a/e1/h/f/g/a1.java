package i.a.e1.h.f.g;

import org.reactivestreams.Subscriber;

/* compiled from: SingleToFlowable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class a1<T> extends i.a.e1.c.s<T> {
    public final i.a.e1.c.x0<? extends T> c;

    /* compiled from: SingleToFlowable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends i.a.e1.h.j.f<T> implements i.a.e1.c.u0<T> {
        private static final long serialVersionUID = 187782011903685568L;
        public i.a.e1.d.f upstream;

        public a(Subscriber<? super T> downstream) {
        }

        @Override // i.a.e1.h.j.f, org.reactivestreams.Subscription
        public void cancel() {
        }

        @Override // i.a.e1.c.u0, i.a.e1.c.m
        public void onError(Throwable e2) {
        }

        @Override // i.a.e1.c.u0, i.a.e1.c.m
        public void onSubscribe(i.a.e1.d.f d2) {
        }

        @Override // i.a.e1.c.u0
        public void onSuccess(T value) {
        }
    }

    public a1(i.a.e1.c.x0<? extends T> source) {
    }

    @Override // i.a.e1.c.s
    public void F6(final Subscriber<? super T> s) {
    }
}
