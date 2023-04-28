package i.a.e1.h.h;

import i.a.e1.c.q0;
import java.util.concurrent.ThreadFactory;

/* compiled from: NewThreadScheduler.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class h extends q0 {
    public final ThreadFactory c;

    /* renamed from: d  reason: collision with root package name */
    private static final String f27839d = "RxNewThreadScheduler";

    /* renamed from: f  reason: collision with root package name */
    private static final String f27841f = "rx3.newthread-priority";

    /* renamed from: e  reason: collision with root package name */
    private static final k f27840e = new k(f27839d, Math.max(1, Math.min(10, Integer.getInteger(f27841f, 5).intValue())));

    public h() {
        this(f27840e);
    }

    @Override // i.a.e1.c.q0
    @i.a.e1.b.f
    public q0.c c() {
        return new i(this.c);
    }

    public h(ThreadFactory threadFactory) {
        this.c = threadFactory;
    }
}
