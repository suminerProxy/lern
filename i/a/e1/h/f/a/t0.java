package i.a.e1.h.f.a;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: CompletableUsing.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class t0<R> extends i.a.e1.c.j {
    public final i.a.e1.g.s<R> b;
    public final i.a.e1.g.o<? super R, ? extends i.a.e1.c.p> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.g.g<? super R> f26865d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f26866e;

    /* compiled from: CompletableUsing.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<R> extends AtomicReference<Object> implements i.a.e1.c.m, i.a.e1.d.f {
        private static final long serialVersionUID = -674404550052917487L;
        public final i.a.e1.g.g<? super R> disposer;
        public final i.a.e1.c.m downstream;
        public final boolean eager;
        public i.a.e1.d.f upstream;

        public a(i.a.e1.c.m actual, R resource, i.a.e1.g.g<? super R> disposer, boolean eager) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        public void disposeResource() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }

        @Override // i.a.e1.c.m
        public void onComplete() {
        }

        @Override // i.a.e1.c.m
        public void onError(Throwable e2) {
        }

        @Override // i.a.e1.c.m
        public void onSubscribe(i.a.e1.d.f d2) {
        }
    }

    public t0(i.a.e1.g.s<R> resourceSupplier, i.a.e1.g.o<? super R, ? extends i.a.e1.c.p> completableFunction, i.a.e1.g.g<? super R> disposer, boolean eager) {
    }

    @Override // i.a.e1.c.j
    public void Y0(i.a.e1.c.m observer) {
    }
}
