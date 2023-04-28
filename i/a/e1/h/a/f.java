package i.a.e1.h.a;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SequentialDisposable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class f extends AtomicReference<i.a.e1.d.f> implements i.a.e1.d.f {
    private static final long serialVersionUID = -754898800686245608L;

    public f() {
    }

    @Override // i.a.e1.d.f
    public void dispose() {
        c.dispose(this);
    }

    @Override // i.a.e1.d.f
    public boolean isDisposed() {
        return c.isDisposed(get());
    }

    public boolean replace(i.a.e1.d.f next) {
        return c.replace(this, next);
    }

    public boolean update(i.a.e1.d.f next) {
        return c.set(this, next);
    }

    public f(i.a.e1.d.f initial) {
        lazySet(initial);
    }
}
