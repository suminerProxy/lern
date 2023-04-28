package i.a.e1.c;

/* compiled from: ObservableEmitter.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface k0<T> extends r<T> {
    boolean isDisposed();

    @i.a.e1.b.f
    k0<T> serialize();

    void setCancellable(@i.a.e1.b.g i.a.e1.g.f c);

    void setDisposable(@i.a.e1.b.g i.a.e1.d.f d2);

    boolean tryOnError(@i.a.e1.b.f Throwable t);
}
