package i.a.e1.e;

/* compiled from: OnErrorNotImplementedException.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class d extends RuntimeException {
    private static final long serialVersionUID = -6298857009889503852L;

    public d(String message, @i.a.e1.b.f Throwable e2) {
        super(message, e2 == null ? new NullPointerException() : e2);
    }

    public d(@i.a.e1.b.f Throwable e2) {
        this("The exception was not handled due to missing onError handler in the subscribe() method call. Further reading: https://github.com/ReactiveX/RxJava/wiki/Error-Handling | " + e2, e2);
    }
}
