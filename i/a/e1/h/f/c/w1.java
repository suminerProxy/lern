package i.a.e1.h.f.c;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeZipArray.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class w1<T, R> extends i.a.e1.c.z<R> {
    public final i.a.e1.c.f0<? extends T>[] b;
    public final i.a.e1.g.o<? super Object[], ? extends R> c;

    /* compiled from: MaybeZipArray.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public final class a implements i.a.e1.g.o<T, R> {
        public final /* synthetic */ w1 b;

        public a(final w1 this$0) {
        }

        @Override // i.a.e1.g.o
        public R apply(T t) throws Throwable {
        }
    }

    /* compiled from: MaybeZipArray.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T, R> extends AtomicInteger implements i.a.e1.d.f {
        private static final long serialVersionUID = -5556924161382950569L;
        public final i.a.e1.c.c0<? super R> downstream;
        public final c<T>[] observers;
        public final Object[] values;
        public final i.a.e1.g.o<? super Object[], ? extends R> zipper;

        public b(i.a.e1.c.c0<? super R> observer, int n2, i.a.e1.g.o<? super Object[], ? extends R> zipper) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        public void disposeExcept(int index) {
        }

        public void innerComplete(int index) {
        }

        public void innerError(Throwable ex, int index) {
        }

        public void innerSuccess(T value, int index) {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }
    }

    /* compiled from: MaybeZipArray.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class c<T> extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.c0<T> {
        private static final long serialVersionUID = 3323743579927613702L;
        public final int index;
        public final b<T, ?> parent;

        public c(b<T, ?> parent, int index) {
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

    public w1(i.a.e1.c.f0<? extends T>[] sources, i.a.e1.g.o<? super Object[], ? extends R> zipper) {
    }

    @Override // i.a.e1.c.z
    public void U1(i.a.e1.c.c0<? super R> observer) {
    }
}
