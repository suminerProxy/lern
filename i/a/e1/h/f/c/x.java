package i.a.e1.h.f.c;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeEqualSingle.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class x<T> extends i.a.e1.c.r0<Boolean> {
    public final i.a.e1.c.f0<? extends T> b;
    public final i.a.e1.c.f0<? extends T> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.g.d<? super T, ? super T> f27329d;

    /* compiled from: MaybeEqualSingle.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicInteger implements i.a.e1.d.f {
        public final i.a.e1.c.u0<? super Boolean> downstream;
        public final i.a.e1.g.d<? super T, ? super T> isEqual;
        public final b<T> observer1;
        public final b<T> observer2;

        public a(i.a.e1.c.u0<? super Boolean> actual, i.a.e1.g.d<? super T, ? super T> isEqual) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        public void done() {
        }

        public void error(b<T> sender, Throwable ex) {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }

        public void subscribe(i.a.e1.c.f0<? extends T> source1, i.a.e1.c.f0<? extends T> source2) {
        }
    }

    /* compiled from: MaybeEqualSingle.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T> extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.c0<T> {
        private static final long serialVersionUID = -3031974433025990931L;
        public final a<T> parent;
        public Object value;

        public b(a<T> parent) {
        }

        public void dispose() {
        }

        @Override // i.a.e1.c.c0, i.a.e1.c.m
        public void onComplete() {
        }

        @Override // i.a.e1.c.c0, i.a.e1.c.u0, i.a.e1.c.m
        public void onError(Throwable e2) {
        }

        @Override // i.a.e1.c.c0, i.a.e1.c.u0, i.a.e1.c.m
        public void onSubscribe(i.a.e1.d.f d2) {
        }

        @Override // i.a.e1.c.c0, i.a.e1.c.u0
        public void onSuccess(T value) {
        }
    }

    public x(i.a.e1.c.f0<? extends T> source1, i.a.e1.c.f0<? extends T> source2, i.a.e1.g.d<? super T, ? super T> isEqual) {
    }

    @Override // i.a.e1.c.r0
    public void M1(i.a.e1.c.u0<? super Boolean> observer) {
    }
}
