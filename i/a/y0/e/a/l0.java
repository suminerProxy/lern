package i.a.y0.e.a;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: CompletableTakeUntilCompletable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class l0 extends i.a.c {
    public final i.a.c b;
    public final i.a.i c;

    /* compiled from: CompletableTakeUntilCompletable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a extends AtomicReference<i.a.u0.c> implements i.a.f, i.a.u0.c {
        private static final long serialVersionUID = 3533011714830024923L;
        public final i.a.f downstream;
        public final AtomicBoolean once;
        public final C0528a other;

        /* compiled from: CompletableTakeUntilCompletable.java */
        /* renamed from: i.a.y0.e.a.l0$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public static final class C0528a extends AtomicReference<i.a.u0.c> implements i.a.f {
            private static final long serialVersionUID = 5176264485428790318L;
            public final a parent;

            public C0528a(a aVar) {
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

        public a(i.a.f fVar) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        public void innerComplete() {
        }

        public void innerError(Throwable th) {
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

    public l0(i.a.c cVar, i.a.i iVar) {
    }

    @Override // i.a.c
    public void I0(i.a.f fVar) {
    }
}
