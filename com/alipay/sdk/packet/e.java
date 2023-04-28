package com.alipay.sdk.packet;

import android.content.Context;
import com.alipay.sdk.net.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static final String f722a = "msp-gzip";
    public static final String b = "Msp-Param";
    public static final String c = "Operation-Type";

    /* renamed from: d  reason: collision with root package name */
    public static final String f723d = "content-type";

    /* renamed from: e  reason: collision with root package name */
    public static final String f724e = "Version";

    /* renamed from: f  reason: collision with root package name */
    public static final String f725f = "AppId";

    /* renamed from: g  reason: collision with root package name */
    public static final String f726g = "des-mode";

    /* renamed from: h  reason: collision with root package name */
    public static final String f727h = "namespace";

    /* renamed from: i  reason: collision with root package name */
    public static final String f728i = "api_name";

    /* renamed from: j  reason: collision with root package name */
    public static final String f729j = "api_version";

    /* renamed from: k  reason: collision with root package name */
    public static final String f730k = "data";

    /* renamed from: l  reason: collision with root package name */
    public static final String f731l = "params";

    /* renamed from: m  reason: collision with root package name */
    public static final String f732m = "public_key";

    /* renamed from: n  reason: collision with root package name */
    public static final String f733n = "device";

    /* renamed from: o  reason: collision with root package name */
    public static final String f734o = "action";

    /* renamed from: p  reason: collision with root package name */
    public static final String f735p = "type";
    public static final String q = "method";
    public boolean r;
    public boolean s;

    public Map<String, String> a(boolean z, String str) {
    }

    public abstract JSONObject a() throws JSONException;

    public String b() {
    }

    public String c() throws JSONException {
    }

    public static JSONObject a(String str, String str2) throws JSONException {
    }

    public String a(String str, JSONObject jSONObject) {
    }

    private static boolean a(a.b bVar) {
    }

    private static String a(a.b bVar, String str) {
    }

    public String a(HashMap<String, String> hashMap, HashMap<String, String> hashMap2) throws JSONException {
    }

    private boolean a(String str) {
    }

    public b a(Context context) throws Throwable {
    }

    public b a(Context context, String str) throws Throwable {
    }

    public b a(Context context, String str, String str2) throws Throwable {
    }

    public b a(Context context, String str, String str2, boolean z) throws Throwable {
    }
}
