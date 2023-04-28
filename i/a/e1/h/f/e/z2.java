package i.a.e1.h.f.e;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableRetryWhen.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class z2<T> extends i.a.e1.h.f.e.a<T, T> {
    public final i.a.e1.g.o<? super i.a.e1.c.i0<Throwable>, ? extends i.a.e1.c.n0<?>> c;

    /* compiled from: ObservableRetryWhen.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicInteger implements i.a.e1.c.p0<T>, i.a.e1.d.f {
        private static final long serialVersionUID = 802743776666017014L;
        public volatile boolean active;
        public final i.a.e1.c.p0<? super T> downstream;
        public final i.a.e1.h.k.c error;
        public final a<T>.C0494a inner;
        public final i.a.e1.o.i<Throwable> signaller;
        public final i.a.e1.c.n0<T> source;
        public final AtomicReference<i.a.e1.d.f> upstream;
        public final AtomicInteger wip;

        /* compiled from: ObservableRetryWhen.java */
        /* renamed from: i.a.e1.h.f.e.z2$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public final class C0494a extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.p0<Object> {
            private static final long serialVersionUID = 3254781284376480842L;
            public final /* synthetic */ a this$0;

            public C0494a(final a this$0) {
            }

            @Override // i.a.e1.c.p0
            public void onComplete() {
            }

            @Override // i.a.e1.c.p0
            public void onError(Throwable e2) {
            }

            @Override // i.a.e1.c.p0
            public void onNext(Object t) {
            }

            @Override // i.a.e1.c.p0
            public void onSubscribe(i.a.e1.d.f d2) {
            }
        }

        public a(i.a.e1.c.p0<? super T> actual, i.a.e1.o.i<Throwable> signaller, i.a.e1.c.n0<T> source) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        public void innerComplete() {
        }

        public void innerError(Throwable ex) {
        }

        public void innerNext() {
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

        public void subscribeNext() {
        }
    }

    public z2(i.a.e1.c.n0<T> source, i.a.e1.g.o<? super i.a.e1.c.i0<Throwable>, ? extends i.a.e1.c.n0<?>> handler) {
    }

    @Override // i.a.e1.c.i0
    public void c6(i.a.e1.c.p0<? super T> observer) {
    }
}
