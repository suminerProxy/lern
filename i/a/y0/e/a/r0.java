package i.a.y0.e.a;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: CompletableUsing.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class r0<R> extends i.a.c {
    public final Callable<R> b;
    public final i.a.x0.o<? super R, ? extends i.a.i> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.x0.g<? super R> f28205d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f28206e;

    /* compiled from: CompletableUsing.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<R> extends AtomicReference<Object> implements i.a.f, i.a.u0.c {
        private static final long serialVersionUID = -674404550052917487L;
        public final i.a.x0.g<? super R> disposer;
        public final i.a.f downstream;
        public final boolean eager;
        public i.a.u0.c upstream;

        public a(i.a.f fVar, R r, i.a.x0.g<? super R> gVar, boolean z) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        public void disposeResourceAfter() {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
        }

        @Override // i.a.f
        public void onComplete() {
        }

        @Override // i.a.f
        public void onError(Throwable th) {
        }

        @Override // i.a.f
        public void onSubscribe(i.a.u0.c cVar) {
        }
    }

    public r0(Callable<R> callable, i.a.x0.o<? super R, ? extends i.a.i> oVar, i.a.x0.g<? super R> gVar, boolean z) {
    }

    @Override // i.a.c
    public void I0(i.a.f fVar) {
    }
}
