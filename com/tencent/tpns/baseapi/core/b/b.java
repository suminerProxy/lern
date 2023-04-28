package com.tencent.tpns.baseapi.core.b;

import com.tencent.android.tpush.common.Constants;
import com.tencent.tpns.baseapi.base.util.Util;
import com.umeng.analytics.pro.am;
import org.json.JSONObject;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public String f13694a;
    public String b;
    public String c;

    /* renamed from: d  reason: collision with root package name */
    public String f13695d;

    /* renamed from: e  reason: collision with root package name */
    public String f13696e;

    /* renamed from: f  reason: collision with root package name */
    private JSONObject f13697f;

    public JSONObject a() {
        this.f13697f = new JSONObject();
        if (!Util.isNullOrEmptyString(this.f13694a)) {
            this.f13697f.put("appVersion", this.f13694a);
        }
        if (!Util.isNullOrEmptyString(this.b)) {
            this.f13697f.put("network", this.b);
        }
        if (!Util.isNullOrEmptyString(this.c)) {
            this.f13697f.put(am.x, this.c);
        }
        if (!Util.isNullOrEmptyString(this.f13695d)) {
            this.f13697f.put(Constants.FLAG_PACKAGE_NAME, this.f13695d);
        }
        if (!Util.isNullOrEmptyString(this.f13696e)) {
            this.f13697f.put("sdkVersionName", this.f13696e);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("appDeviceInfo", this.f13697f);
        return jSONObject;
    }
}
