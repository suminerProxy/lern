package i.a.e1.h.f.c;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeUsing.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class v1<T, D> extends i.a.e1.c.z<T> {
    public final i.a.e1.g.s<? extends D> b;
    public final i.a.e1.g.o<? super D, ? extends i.a.e1.c.f0<? extends T>> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.g.g<? super D> f27327d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f27328e;

    /* compiled from: MaybeUsing.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, D> extends AtomicReference<Object> implements i.a.e1.c.c0<T>, i.a.e1.d.f {
        private static final long serialVersionUID = -674404550052917487L;
        public final i.a.e1.g.g<? super D> disposer;
        public final i.a.e1.c.c0<? super T> downstream;
        public final boolean eager;
        public i.a.e1.d.f upstream;

        public a(i.a.e1.c.c0<? super T> actual, D resource, i.a.e1.g.g<? super D> disposer, boolean eager) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        public void disposeResource() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
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

    public v1(i.a.e1.g.s<? extends D> resourceSupplier, i.a.e1.g.o<? super D, ? extends i.a.e1.c.f0<? extends T>> sourceSupplier, i.a.e1.g.g<? super D> resourceDisposer, boolean eager) {
    }

    @Override // i.a.e1.c.z
    public void U1(i.a.e1.c.c0<? super T> observer) {
    }
}
