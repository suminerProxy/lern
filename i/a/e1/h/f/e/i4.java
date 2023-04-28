package i.a.e1.h.f.e;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: ObservableUsing.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class i4<T, D> extends i.a.e1.c.i0<T> {
    public final i.a.e1.g.s<? extends D> b;
    public final i.a.e1.g.o<? super D, ? extends i.a.e1.c.n0<? extends T>> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.g.g<? super D> f27479d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f27480e;

    /* compiled from: ObservableUsing.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, D> extends AtomicBoolean implements i.a.e1.c.p0<T>, i.a.e1.d.f {
        private static final long serialVersionUID = 5904473792286235046L;
        public final i.a.e1.g.g<? super D> disposer;
        public final i.a.e1.c.p0<? super T> downstream;
        public final boolean eager;
        public final D resource;
        public i.a.e1.d.f upstream;

        public a(i.a.e1.c.p0<? super T> actual, D resource, i.a.e1.g.g<? super D> disposer, boolean eager) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        public void disposeResource() {
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

    public i4(i.a.e1.g.s<? extends D> resourceSupplier, i.a.e1.g.o<? super D, ? extends i.a.e1.c.n0<? extends T>> sourceSupplier, i.a.e1.g.g<? super D> disposer, boolean eager) {
    }

    @Override // i.a.e1.c.i0
    public void c6(i.a.e1.c.p0<? super T> observer) {
    }
}
