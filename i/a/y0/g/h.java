package i.a.y0.g;

import i.a.j0;
import java.util.concurrent.ThreadFactory;

/* compiled from: NewThreadScheduler.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class h extends j0 {
    public final ThreadFactory c;

    /* renamed from: d  reason: collision with root package name */
    private static final String f29150d = "RxNewThreadScheduler";

    /* renamed from: f  reason: collision with root package name */
    private static final String f29152f = "rx2.newthread-priority";

    /* renamed from: e  reason: collision with root package name */
    private static final k f29151e = new k(f29150d, Math.max(1, Math.min(10, Integer.getInteger(f29152f, 5).intValue())));

    public h() {
        this(f29151e);
    }

    @Override // i.a.j0
    @i.a.t0.f
    public j0.c c() {
        return new i(this.c);
    }

    public h(ThreadFactory threadFactory) {
        this.c = threadFactory;
    }
}
