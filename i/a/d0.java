package i.a;

/* compiled from: ObservableEmitter.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface d0<T> extends k<T> {
    boolean isDisposed();

    @i.a.t0.f
    d0<T> serialize();

    void setCancellable(@i.a.t0.g i.a.x0.f fVar);

    void setDisposable(@i.a.t0.g i.a.u0.c cVar);

    boolean tryOnError(@i.a.t0.f Throwable th);
}
