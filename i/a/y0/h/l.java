package i.a.y0.h;

/* compiled from: InnerQueuedSubscriberSupport.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface l<T> {
    void drain();

    void innerComplete(k<T> kVar);

    void innerError(k<T> kVar, Throwable th);

    void innerNext(k<T> kVar, T t);
}
