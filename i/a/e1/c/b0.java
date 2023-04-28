package i.a.e1.c;

/* compiled from: MaybeEmitter.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface b0<T> {
    boolean isDisposed();

    void onComplete();

    void onError(@i.a.e1.b.f Throwable t);

    void onSuccess(@i.a.e1.b.f T t);

    void setCancellable(@i.a.e1.b.g i.a.e1.g.f c);

    void setDisposable(@i.a.e1.b.g i.a.e1.d.f d2);

    boolean tryOnError(@i.a.e1.b.f Throwable t);
}
