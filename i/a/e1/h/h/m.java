package i.a.e1.h.h;

import java.util.concurrent.Callable;

/* compiled from: ScheduledDirectTask.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class m extends a implements Callable<Void> {
    private static final long serialVersionUID = 1811839108042568751L;

    public m(Runnable runnable) {
        super(runnable);
    }

    @Override // i.a.e1.h.h.a, i.a.e1.n.a
    public /* bridge */ /* synthetic */ Runnable getWrappedRunnable() {
        return super.getWrappedRunnable();
    }

    @Override // java.util.concurrent.Callable
    public Void call() {
        this.runner = Thread.currentThread();
        try {
            this.runnable.run();
            return null;
        } finally {
            lazySet(a.FINISHED);
            this.runner = null;
        }
    }
}
