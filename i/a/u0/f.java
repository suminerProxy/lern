package i.a.u0;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ReferenceDisposable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class f<T> extends AtomicReference<T> implements c {
    private static final long serialVersionUID = 6537757548749041217L;

    public f(T t) {
    }

    @Override // i.a.u0.c
    public final void dispose() {
    }

    @Override // i.a.u0.c
    public final boolean isDisposed() {
    }

    public abstract void onDisposed(@i.a.t0.f T t);
}
