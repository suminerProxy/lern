package h.y.a.m;

import java.io.IOException;
import okhttp3.Call;
import okhttp3.Response;

/* compiled from: HttpCallBack.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public abstract class k extends j {
    @Override // h.y.a.m.j
    public void e(Call call, IOException iOException) {
        if (iOException != null) {
            iOException.printStackTrace();
        }
        g(call, iOException);
        h();
    }

    @Override // h.y.a.m.j
    public void f(String str, Call call, Response response) {
        i(str, call, response);
        h();
    }

    public abstract void g(Call call, IOException iOException);

    public abstract void h();

    public abstract void i(String str, Call call, Response response);
}
