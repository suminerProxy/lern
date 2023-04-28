package i.a.e1.h.f.e;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableTakeUntil.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class w3<T, U> extends i.a.e1.h.f.e.a<T, T> {
    public final i.a.e1.c.n0<? extends U> c;

    /* compiled from: ObservableTakeUntil.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, U> extends AtomicInteger implements i.a.e1.c.p0<T>, i.a.e1.d.f {
        private static final long serialVersionUID = 1418547743690811973L;
        public final i.a.e1.c.p0<? super T> downstream;
        public final i.a.e1.h.k.c error;
        public final a<T, U>.C0490a otherObserver;
        public final AtomicReference<i.a.e1.d.f> upstream;

        /* compiled from: ObservableTakeUntil.java */
        /* renamed from: i.a.e1.h.f.e.w3$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public final class C0490a extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.p0<U> {
            private static final long serialVersionUID = -8693423678067375039L;
            public final /* synthetic */ a this$0;

            public C0490a(final a this$0) {
            }

            @Override // i.a.e1.c.p0
            public void onComplete() {
            }

            @Override // i.a.e1.c.p0
            public void onError(Throwable e2) {
            }

            @Override // i.a.e1.c.p0
            public void onNext(U t) {
            }

            @Override // i.a.e1.c.p0
            public void onSubscribe(i.a.e1.d.f d2) {
            }
        }

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
        public void onError(Throwable e2) {
        }

        @Override // i.a.e1.c.p0
        public void onNext(T t) {
        }

        @Override // i.a.e1.c.p0
        public void onSubscribe(i.a.e1.d.f d2) {
        }

        public void otherComplete() {
        }

        public void otherError(Throwable e2) {
        }
    }

    public w3(i.a.e1.c.n0<T> source, i.a.e1.c.n0<? extends U> other) {
    }

    @Override // i.a.e1.c.i0
    public void c6(i.a.e1.c.p0<? super T> child) {
    }
}
