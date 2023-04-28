package h.y.a.m;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSON;
import com.taihebase.activity.R;
import com.taihebase.activity.base.BaseApplication;
import h.y.a.n.f1;
import h.y.a.n.i0;
import h.y.a.n.n0;
import h.y.a.n.u0;
import h.y.a.n.v0;
import java.io.IOException;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.Response;
import org.greenrobot.eventbus.EventBus;

/* compiled from: ApiHelper.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private static c f26243a;

    /* compiled from: ApiHelper.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements g {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f26244a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ i f26245d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ g f26246e;

        public a(Context context, String str, String str2, i iVar, g gVar) {
            this.f26244a = context;
            this.b = str;
            this.c = str2;
            this.f26245d = iVar;
            this.f26246e = gVar;
        }

        @Override // h.y.a.m.g
        public void a(n nVar) {
            h.y.a.l.a aVar;
            if (nVar != null && !nVar.f() && (aVar = nVar.f26253d) != null && "http.method.not.suppored".equals(aVar.getState())) {
                if (h.y.a.f.k.s) {
                    f1.i("测试环境可见：检测到接口请求方式错误，已自动切换，日志已写入粘贴板，尽快联系开发者");
                    Context context = this.f26244a;
                    h.y.a.e.e(context, "检测到接口请求方式错误：\n" + this.b);
                }
                i0.d("OkHttp", "检测到接口请求方式错误,已自动切换，尽快去修改:" + this.b);
                h.f(this.f26244a, this.c, this.b, this.f26245d, this.f26246e);
                return;
            }
            g gVar = this.f26246e;
            if (gVar != null) {
                gVar.a(nVar);
            }
        }
    }

    /* compiled from: ApiHelper.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class b extends k {

        /* renamed from: a  reason: collision with root package name */
        public n f26247a;
        private final g b;
        private Context c;

        public b(Context context, g gVar) {
            this.b = gVar;
            this.c = context;
        }

        private n j(String str, String str2) {
            h.y.a.l.a aVar = (h.y.a.l.a) JSON.parseObject(str, h.y.a.l.a.class);
            if ("1".equals(aVar.getState())) {
                return new n(o.RESULT_OK, str);
            }
            if (!TextUtils.isEmpty(aVar.getMsg())) {
                str2 = aVar.getMsg();
            }
            n nVar = new n(o.RESULT_FAILED, str2);
            nVar.f26254e = str;
            nVar.f26253d = aVar;
            if (h.y.a.h.a.third_register_alert.getValue().equals(aVar.getState())) {
                nVar.g(o.THIRD_REGISTER_ALERT);
            } else if (h.y.a.h.a.access_to_many.getValue().equals(aVar.getState())) {
                nVar.g(o.ACCESS_TO_MANY);
            } else if (!h.y.a.h.a.user_not_login.getValue().equals(aVar.getState()) && !h.y.a.h.a.user_login_again.getValue().equals(aVar.getState()) && !h.y.a.h.a.user_ref_login_again.getValue().equals(aVar.getState()) && !h.y.a.h.a.user_token_login_again.getValue().equals(aVar.getState())) {
                if (h.y.a.h.a.user_other_login.getValue().equals(aVar.getState())) {
                    nVar.g(o.OTHER_LOGIN);
                    nVar.i(TextUtils.isEmpty(aVar.getMsg()) ? "登录失效,账号已在其他设备登录" : aVar.getMsg());
                    u0.L().b();
                    u0.L().f2(false);
                    if (this.c.getApplicationContext() instanceof BaseApplication) {
                        ((BaseApplication) this.c.getApplicationContext()).f(this.c);
                    }
                } else if (h.y.a.h.a.ServiceErr.getValue().equals(aVar.getState())) {
                    nVar.g(o.ServiceErr);
                    nVar.i(str2);
                } else if (h.y.a.h.a.faceErr.getValue().equals(aVar.getState())) {
                    nVar.i("face_limit_error");
                } else if (h.y.a.h.a.token_expire.getValue().equals(aVar.getState())) {
                    EventBus.getDefault().post(new q());
                } else if (!h.y.a.h.a.tips_sflp01.getValue().equals(aVar.getState())) {
                    try {
                        int parseInt = Integer.parseInt(aVar.getState());
                        if (parseInt != 500 && parseInt != 502) {
                            if (parseInt == 599) {
                                nVar.g(o.FLOW_CONTROL);
                                nVar.i("您的访问存在异常，我们已经记录，请稍后重新尝试");
                            } else if (parseInt == 110) {
                                nVar.g(o.NO_USER);
                                if (TextUtils.isEmpty(str2)) {
                                    nVar.i("不存在该用户");
                                }
                            } else {
                                nVar.g(o.FLOW_CONTROL);
                                if (TextUtils.isEmpty(str2)) {
                                    nVar.i("您的访问过于频繁，请慢一些");
                                }
                            }
                        }
                        nVar.g(o.FLOW_CONTROL);
                        nVar.i("前方太拥挤，请稍后再试");
                    } catch (NumberFormatException e2) {
                        e2.printStackTrace();
                    }
                }
            } else {
                nVar.g(o.USER_NOT_LOGIN_SIGN_ERROR);
                nVar.i("登录已过期,请重新登录");
                u0.L().b();
                u0.L().f2(false);
                if (this.c.getApplicationContext() instanceof BaseApplication) {
                    ((BaseApplication) this.c.getApplicationContext()).f(this.c);
                }
            }
            return nVar;
        }

        @Override // h.y.a.m.k
        public void g(Call call, IOException iOException) {
            this.f26247a = new n(o.RESULT_FAILED, "网络不给力，盆友消消气");
        }

        @Override // h.y.a.m.k
        public void h() {
            n nVar;
            if (h.f26243a != null && this.f26247a != null) {
                h.f26243a.a(this.f26247a);
            }
            g gVar = this.b;
            if (gVar == null || (nVar = this.f26247a) == null) {
                return;
            }
            gVar.a(nVar);
        }

        @Override // h.y.a.m.k
        public void i(String str, Call call, Response response) {
            try {
                n j2 = j(str, "秀动暴走罢工了,程序哥哥鞭挞中");
                this.f26247a = j2;
                j2.j(response);
            } catch (Exception e2) {
                e2.printStackTrace();
                if (TextUtils.isEmpty(str)) {
                    str = "秀动暴走罢工了,程序哥哥鞭挞中";
                }
                this.f26247a = new n(o.RESULT_FAILED, str);
            }
        }
    }

    /* compiled from: ApiHelper.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface c {
        void a(n nVar);
    }

    public static void A(Context context, String str, i iVar, g gVar) {
        if (b(context, gVar)) {
            return;
        }
        i0.h("OkHttp", "post --> " + str);
        m.i(context, h.y.a.f.k.D + str, null, iVar.getPostParams(str, false, h.y.a.m.u.a.REQUEST_BODY), new b(context, gVar));
    }

    public static void B(c cVar) {
        f26243a = cVar;
    }

    private static boolean b(Context context, g gVar) {
        if (!n0.b()) {
            n nVar = new n(o.NETWORK_TROBLE, context.getString(R.string.error_network_unavailable));
            if (gVar != null) {
                gVar.a(nVar);
            }
            return true;
        } else if (v0.c()) {
            n nVar2 = new n(o.NETWORK_TROBLE, "网络异常");
            if (gVar != null) {
                gVar.a(nVar2);
            }
            return true;
        } else {
            return false;
        }
    }

    private static void c(i iVar) {
    }

    private static String d(String str) {
        try {
            return str.replaceAll("/+", "/").replaceAll(":/+", "://");
        } catch (Exception e2) {
            e2.printStackTrace();
            return str;
        }
    }

    public static void e(Context context, String str, i iVar, g gVar) {
        y(context, h.y.a.f.k.z, str, "", "", null, iVar, gVar);
    }

    public static void f(Context context, String str, String str2, i iVar, g gVar) {
        y(context, str, str2, "", "", null, iVar, gVar);
    }

    public static void g(Context context, String str, String str2, String str3, i iVar, g gVar) {
        y(context, h.y.a.f.k.z, str, str2, str3, null, iVar, gVar);
    }

    public static void h(Context context, String str, String str2, String str3, String str4, i iVar, g gVar) {
        y(context, str, str2, str3, str4, null, iVar, gVar);
    }

    public static void i(Context context, String str, i iVar, g gVar) {
        if (b(context, gVar)) {
            return;
        }
        if (iVar == null) {
            iVar = new i();
        }
        i0.h("OkHttp", "Hotel get --> " + str);
        Pair<Headers, String> headersAndParams = iVar.getHeadersAndParams(str, null, false);
        l.b(context, h.y.a.f.k.t + h.y.a.f.k.z + str, (Headers) headersAndParams.first, "", new b(context, gVar));
    }

    public static boolean j() {
        return n0.b();
    }

    public static void k(Context context, String str, i iVar, g gVar) {
        z(context, h.y.a.f.k.z, str, "", "", null, iVar, h.y.a.m.u.a.REQUEST_QUERY, gVar);
    }

    public static void l(Context context, String str, String str2, i iVar, g gVar) {
        z(context, str, str2, "", "", null, iVar, h.y.a.m.u.a.REQUEST_QUERY, gVar);
    }

    public static void m(Context context, String str, String str2, String str3, i iVar, g gVar) {
        z(context, h.y.a.f.k.z, str, str2, str3, null, iVar, h.y.a.m.u.a.REQUEST_QUERY, gVar);
    }

    public static void n(Context context, String str, String str2, String str3, String str4, i iVar, g gVar) {
        z(context, str, str2, str3, str4, null, iVar, h.y.a.m.u.a.REQUEST_QUERY, gVar);
    }

    public static void o(Context context, String str, String str2, String str3, String str4, Map<String, String> map, i iVar, g gVar) {
        z(context, str, str2, str3, str4, map, iVar, h.y.a.m.u.a.REQUEST_QUERY, gVar);
    }

    public static void p(Context context, String str, String str2, Map<String, String> map, i iVar, g gVar) {
        z(context, str, str2, "", "", map, iVar, h.y.a.m.u.a.REQUEST_QUERY, gVar);
    }

    public static void q(Context context, String str, Map<String, String> map, i iVar, g gVar) {
        z(context, h.y.a.f.k.z, str, "", "", map, iVar, h.y.a.m.u.a.REQUEST_QUERY, gVar);
    }

    public static void r(Context context, String str, i iVar, g gVar) {
        if (b(context, gVar)) {
            return;
        }
        if (iVar == null) {
            iVar = new i();
        }
        i0.h("OkHttp", "postFile --> " + str);
        m.j(context, h.y.a.f.k.u + str, iVar.getFileUploadParams(), new b(context, gVar));
    }

    public static void s(Context context, String str, i iVar, g gVar) {
        if (b(context, gVar)) {
            return;
        }
        if (iVar == null) {
            iVar = new i();
        }
        i0.h("OkHttp", "postFileZip --> " + str);
        m.j(context, h.y.a.f.k.u + str, iVar.getFileZipUploadParams(), new b(context, gVar));
    }

    public static void t(Context context, String str, i iVar, g gVar) {
        z(context, h.y.a.f.k.z, str, "", "", null, iVar, h.y.a.m.u.a.REQUEST_BODY, gVar);
    }

    public static void u(Context context, String str, String str2, i iVar, g gVar) {
        z(context, str, str2, "", "", null, iVar, h.y.a.m.u.a.REQUEST_BODY, gVar);
    }

    public static void v(Context context, String str, String str2, String str3, i iVar, g gVar) {
        z(context, h.y.a.f.k.z, str, str2, str3, null, iVar, h.y.a.m.u.a.REQUEST_BODY, gVar);
    }

    public static void w(Context context, String str, String str2, String str3, String str4, i iVar, g gVar) {
        z(context, str, str2, str3, str4, null, iVar, h.y.a.m.u.a.REQUEST_BODY, gVar);
    }

    public static void x(Context context, String str, Map<String, String> map, i iVar, g gVar) {
        z(context, h.y.a.f.k.z, str, "", "", map, iVar, h.y.a.m.u.a.REQUEST_BODY, gVar);
    }

    private static void y(Context context, String str, String str2, String str3, String str4, Map<String, String> map, i iVar, g gVar) {
        if (b(context, gVar)) {
            return;
        }
        if (iVar == null) {
            iVar = new i();
        }
        i0.h("OkHttp", "get --> " + str2);
        if (!str.contains(h.y.a.f.k.z) && !str.contains(h.y.a.f.k.B)) {
            m.i(context, h.y.a.f.k.t + str + p.a(str3, str4), map, iVar.getPostParams(str2, false, h.y.a.m.u.a.REQUEST_QUERY), new b(context, gVar));
            return;
        }
        c(iVar);
        Pair<Headers, String> headersAndParams = iVar.getHeadersAndParams(str2, map, false);
        l.b(context, d(h.y.a.f.k.t + str + str2), (Headers) headersAndParams.first, (String) headersAndParams.second, new b(context, gVar));
    }

    private static void z(Context context, String str, String str2, String str3, String str4, Map<String, String> map, i iVar, h.y.a.m.u.a aVar, g gVar) {
        if (b(context, gVar)) {
            return;
        }
        i iVar2 = iVar == null ? new i() : iVar;
        i0.h("OkHttp", "post --> " + str2);
        if (!str.contains(h.y.a.f.k.z) && !str.contains(h.y.a.f.k.B)) {
            m.i(context, h.y.a.f.k.t + str + p.a(str3, str4), map, iVar2.getPostParams(str2, false, aVar), new b(context, gVar));
            return;
        }
        c(iVar2);
        Pair<Headers, String> headersAndParams = iVar2.getHeadersAndParams(str2, map, aVar == h.y.a.m.u.a.REQUEST_BODY);
        l.g(context, d(h.y.a.f.k.t + str + str2), (Headers) headersAndParams.first, (String) headersAndParams.second, aVar, new b(context, new a(context, str2, str, iVar2, gVar)));
    }
}
