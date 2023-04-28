package i.a;

/* compiled from: MaybeObserver.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface v<T> {
    void onComplete();

    void onError(@i.a.t0.f Throwable th);

    void onSubscribe(@i.a.t0.f i.a.u0.c cVar);

    void onSuccess(@i.a.t0.f T t);
}
