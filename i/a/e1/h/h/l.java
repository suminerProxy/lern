package i.a.e1.h.h;

/* compiled from: ScheduledDirectPeriodicTask.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class l extends a implements Runnable {
    private static final long serialVersionUID = 1811839108042568751L;

    public l(Runnable runnable) {
        super(runnable);
    }

    @Override // i.a.e1.h.h.a, i.a.e1.n.a
    public /* bridge */ /* synthetic */ Runnable getWrappedRunnable() {
        return super.getWrappedRunnable();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.runner = Thread.currentThread();
        try {
            this.runnable.run();
            this.runner = null;
        } catch (Throwable th) {
            i.a.e1.e.b.b(th);
            this.runner = null;
            lazySet(a.FINISHED);
            i.a.e1.l.a.Y(th);
        }
    }
}
