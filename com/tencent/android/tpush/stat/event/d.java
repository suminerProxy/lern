package com.tencent.android.tpush.stat.event;

import android.content.Context;
import android.os.Process;
import androidx.annotation.Nullable;
import cn.sharesdk.framework.InnerShareParams;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.tencent.android.tpush.common.Constants;
import com.tencent.android.tpush.logging.TLogger;
import com.tencent.tpns.baseapi.base.logger.DeviceInfo;
import com.umeng.analytics.pro.am;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class d extends Event {

    /* renamed from: a  reason: collision with root package name */
    private static DeviceInfo f9149a;
    private String b;

    /* renamed from: l  reason: collision with root package name */
    private JSONArray f9150l;

    /* renamed from: m  reason: collision with root package name */
    private int f9151m;

    /* renamed from: n  reason: collision with root package name */
    private Thread f9152n;

    /* renamed from: o  reason: collision with root package name */
    private String f9153o;

    /* renamed from: p  reason: collision with root package name */
    private long f9154p;
    private String q;
    private String r;
    private String s;

    public d(Context context, int i2, int i3, JSONArray jSONArray, long j2) {
        super(context, 0, j2);
        this.f9152n = null;
        this.f9153o = null;
        this.f9154p = -1L;
        this.q = null;
        this.r = null;
        this.s = null;
        this.f9151m = i3;
        this.f9150l = jSONArray;
    }

    private void b(JSONObject jSONObject) {
        JSONObject a2 = a(this.f9152n);
        try {
            if (f9149a == null) {
                f9149a = new DeviceInfo(this.f9138k);
            }
            a2.put("deviceInfo", f9149a);
        } catch (Throwable unused) {
            TLogger.w("ErrorEvent", "unexpected for encodeCrashThread");
        }
        JSONArray jSONArray = this.f9150l;
        if (jSONArray != null) {
            a2.put(InnerShareParams.STACK, jSONArray);
            if (this.f9154p > -1) {
                a2.put("gfra", this.f9150l);
            }
        } else {
            a2.put(InnerShareParams.STACK, this.b);
            if (this.f9154p > -1) {
                a2.put("gfra", this.b);
            }
        }
        jSONObject.put("cth", a2);
        if (this.f9151m == 3) {
            a2.put("nfra", this.s);
        }
    }

    public void a(String str) {
        this.f9153o = str;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            d dVar = (d) obj;
            try {
                if (this.f9133d == dVar.f9133d && this.q.equals(dVar.q) && this.r.equals(dVar.r)) {
                    if (this.f9150l.toString().equals(dVar.f9150l.toString())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable unused) {
                TLogger.w("ErrorEvent", "unexpected for equals");
            }
        }
        return false;
    }

    @Override // com.tencent.android.tpush.stat.event.Event
    public EventType getType() {
        return EventType.ERROR;
    }

    public int hashCode() {
        return super.hashCode();
    }

    @Override // com.tencent.android.tpush.stat.event.Event
    public boolean onEncode(JSONObject jSONObject) {
        jSONObject.put("cmode", 2);
        jSONObject.put("ea", this.f9151m);
        jSONObject.put("prcp", Process.myPid());
        jSONObject.put("prct", Process.myTid());
        new com.tencent.android.tpush.stat.b.a(this.f9138k, this.f9133d).a(jSONObject, this.f9152n);
        b(jSONObject);
        a(jSONObject);
        return true;
    }

    @Override // com.tencent.android.tpush.stat.event.Event
    public String toJsonString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("accessId", this.f9133d);
            jSONObject.put("timestamp", this.f9134e);
            String str = this.q;
            if (str != null) {
                jSONObject.put(Constants.FLAG_TOKEN, str);
            }
            String str2 = this.c;
            if (str2 != null) {
                jSONObject.put("accessKey", str2);
            }
            String str3 = this.r;
            if (str3 != null) {
                jSONObject.put("sdkVersion", str3);
            }
            jSONObject.put("et", getType().GetIntValue());
            b(jSONObject);
            return jSONObject.toString();
        } catch (Throwable unused) {
            TLogger.w("ErrorEvent", "unexpected for toJsonString");
            return null;
        }
    }

    @Override // com.tencent.android.tpush.stat.event.Event
    public String toString() {
        return toJsonString();
    }

    private void a(JSONObject jSONObject) {
        jSONObject.put("md5", com.tencent.android.tpush.stat.b.b.a(this.b));
        jSONObject.put("ct", this.f9151m);
        jSONObject.put(MapBundleKey.MapObjKey.OBJ_BID, this.f9138k.getPackageName());
        jSONObject.put("dt", System.currentTimeMillis() / 1000);
    }

    private JSONObject a(Thread thread) {
        JSONObject jSONObject = new JSONObject();
        if (thread != null) {
            jSONObject.put("id", thread.getId());
            jSONObject.put("name", thread.getName());
            jSONObject.put(am.ay, thread.getPriority());
        }
        long j2 = this.f9154p;
        if (j2 > -1) {
            jSONObject.put("gthn", j2);
        }
        return jSONObject;
    }

    public boolean a() {
        String str;
        JSONArray jSONArray = this.f9150l;
        if (jSONArray != null) {
            str = jSONArray.toString();
        } else {
            str = this.b;
        }
        return str.contains("com.tencent.android.tpush.") || str.contains("com.tencent.android.tpns.") || str.contains("com.tencent.tpns.");
    }
}
