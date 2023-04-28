package i.a.e1.h.e;

/* compiled from: InnerQueuedObserverSupport.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface u<T> {
    void drain();

    void innerComplete(t<T> inner);

    void innerError(t<T> inner, Throwable e2);

    void innerNext(t<T> inner, T value);
}
