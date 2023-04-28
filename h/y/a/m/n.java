package h.y.a.m;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import okhttp3.HttpUrl;
import okhttp3.Response;

/* compiled from: Result.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    private o f26252a;
    private Object b;
    private String c = "";

    /* renamed from: d  reason: collision with root package name */
    public h.y.a.l.a f26253d;

    /* renamed from: e  reason: collision with root package name */
    public String f26254e;

    /* renamed from: f  reason: collision with root package name */
    public Response f26255f;

    public n(o oVar, Object obj) {
        this.f26252a = oVar;
        this.b = obj;
    }

    public o a() {
        return this.f26252a;
    }

    public Object b() {
        Object obj = this.b;
        return obj == null ? "" : obj;
    }

    public String c() {
        try {
            JSONObject parseObject = JSON.parseObject(b().toString());
            if (parseObject != null && parseObject.containsKey(com.alipay.sdk.util.l.c)) {
                String string = parseObject.getString(com.alipay.sdk.util.l.c);
                if (!TextUtils.isEmpty(string)) {
                    if (!HttpUrl.PATH_SEGMENT_ENCODE_SET_URI.equals(string)) {
                        return string;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public String d() {
        JSONObject parseObject = JSON.parseObject(c());
        if (parseObject == null || !parseObject.containsKey(com.alipay.sdk.util.l.c)) {
            return null;
        }
        return parseObject.getString(com.alipay.sdk.util.l.c);
    }

    public String e() {
        return this.c;
    }

    public boolean f() {
        return this.f26252a == o.RESULT_OK;
    }

    public void g(o oVar) {
        this.f26252a = oVar;
    }

    public void h(String str) {
        this.b = str;
    }

    public void i(Object obj) {
        this.b = obj;
    }

    public void j(Response response) {
        this.f26255f = response;
    }

    public void k(String str) {
        this.c = str;
    }
}
