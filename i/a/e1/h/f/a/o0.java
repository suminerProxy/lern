package i.a.e1.h.f.a;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: CompletableTimeout.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class o0 extends i.a.e1.c.j {
    public final i.a.e1.c.p b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final TimeUnit f26857d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.e1.c.q0 f26858e;

    /* renamed from: f  reason: collision with root package name */
    public final i.a.e1.c.p f26859f;

    /* compiled from: CompletableTimeout.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public final class a implements Runnable {
        private final AtomicBoolean b;
        public final i.a.e1.d.d c;

        /* renamed from: d  reason: collision with root package name */
        public final i.a.e1.c.m f26860d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ o0 f26861e;

        /* compiled from: CompletableTimeout.java */
        /* renamed from: i.a.e1.h.f.a.o0$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public final class C0437a implements i.a.e1.c.m {
            public final /* synthetic */ a b;

            public C0437a(final a this$1) {
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

        public a(final o0 this$0, AtomicBoolean once, i.a.e1.d.d set, i.a.e1.c.m observer) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: CompletableTimeout.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b implements i.a.e1.c.m {
        private final i.a.e1.d.d b;
        private final AtomicBoolean c;

        /* renamed from: d  reason: collision with root package name */
        private final i.a.e1.c.m f26862d;

        public b(i.a.e1.d.d set, AtomicBoolean once, i.a.e1.c.m observer) {
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

    public o0(i.a.e1.c.p source, long timeout, TimeUnit unit, i.a.e1.c.q0 scheduler, i.a.e1.c.p other) {
    }

    @Override // i.a.e1.c.j
    public void Y0(final i.a.e1.c.m observer) {
    }
}
