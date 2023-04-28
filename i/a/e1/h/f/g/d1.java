package i.a.e1.h.f.g;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SingleUsing.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class d1<T, U> extends i.a.e1.c.r0<T> {
    public final i.a.e1.g.s<U> b;
    public final i.a.e1.g.o<? super U, ? extends i.a.e1.c.x0<? extends T>> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.g.g<? super U> f27753d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f27754e;

    /* compiled from: SingleUsing.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, U> extends AtomicReference<Object> implements i.a.e1.c.u0<T>, i.a.e1.d.f {
        private static final long serialVersionUID = -5331524057054083935L;
        public final i.a.e1.g.g<? super U> disposer;
        public final i.a.e1.c.u0<? super T> downstream;
        public final boolean eager;
        public i.a.e1.d.f upstream;

        public a(i.a.e1.c.u0<? super T> actual, U resource, boolean eager, i.a.e1.g.g<? super U> disposer) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        public void disposeResource() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
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

    public d1(i.a.e1.g.s<U> resourceSupplier, i.a.e1.g.o<? super U, ? extends i.a.e1.c.x0<? extends T>> singleFunction, i.a.e1.g.g<? super U> disposer, boolean eager) {
    }

    @Override // i.a.e1.c.r0
    public void M1(final i.a.e1.c.u0<? super T> observer) {
    }
}
