package h.y.a.m.t;

import h.y.a.n.m0;
import h.y.a.n.u0;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* compiled from: HeadInterceptor.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class a implements Interceptor {
    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
        Request.Builder addHeader = chain.request().newBuilder().addHeader("CTERMINAL", "android");
        return chain.proceed(addHeader.addHeader("CUSYSTIME", m0.k() + "").addHeader("CUUSERREF", u0.L().b1()).addHeader("CUSUT", u0.L().h1() ? u0.L().j0() : "").build());
    }
}
