package i.a.e1.h.i;

/* compiled from: InnerQueuedSubscriberSupport.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public interface l<T> {
    void drain();

    void innerComplete(k<T> inner);

    void innerError(k<T> inner, Throwable e2);

    void innerNext(k<T> inner, T value);
}
