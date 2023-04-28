package i.a.y0.d;

/* compiled from: InnerQueuedObserverSupport.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface t<T> {
    void drain();

    void innerComplete(s<T> sVar);

    void innerError(s<T> sVar, Throwable th);

    void innerNext(s<T> sVar, T t);
}
