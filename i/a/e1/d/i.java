package i.a.e1.d;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ReferenceDisposable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class i<T> extends AtomicReference<T> implements f {
    private static final long serialVersionUID = 6537757548749041217L;

    public i(T value) {
    }

    @Override // i.a.e1.d.f
    public final void dispose() {
    }

    @Override // i.a.e1.d.f
    public final boolean isDisposed() {
    }

    public abstract void onDisposed(@i.a.e1.b.f T value);
}
