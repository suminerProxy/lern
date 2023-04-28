package com.tencent.android.tpush.stat.event;

import android.content.Context;
import com.tencent.android.tpush.XGPushConfig;
import com.tencent.android.tpush.service.cache.CacheManager;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import com.tencent.tpns.dataacquisition.CustomDeviceInfos;
import com.umeng.analytics.pro.am;
import org.json.JSONObject;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class Event {
    public static String channel = "xgsdk";

    /* renamed from: h  reason: collision with root package name */
    public static String f9131h;

    /* renamed from: i  reason: collision with root package name */
    public static long f9132i;
    public String c;

    /* renamed from: d  reason: collision with root package name */
    public long f9133d;

    /* renamed from: e  reason: collision with root package name */
    public long f9134e;

    /* renamed from: f  reason: collision with root package name */
    public int f9135f;

    /* renamed from: g  reason: collision with root package name */
    public String f9136g;

    /* renamed from: j  reason: collision with root package name */
    public long f9137j;

    /* renamed from: k  reason: collision with root package name */
    public Context f9138k;

    public Event(Context context, int i2, long j2) {
        this.c = null;
        this.f9133d = 0L;
        this.f9136g = null;
        this.f9137j = 0L;
        this.c = "Axg" + j2;
        a(context, i2, j2);
    }

    private void a(Context context, int i2, long j2) {
        this.f9138k = context;
        this.f9133d = j2;
        this.f9134e = System.currentTimeMillis() / 1000;
        this.f9135f = i2;
        this.f9136g = com.tencent.android.tpush.stat.b.b.b(context, j2);
        String str = f9131h;
        if (str == null || str.trim().length() < 40) {
            String token = XGPushConfig.getToken(context);
            f9131h = token;
            if (!com.tencent.android.tpush.stat.b.b.c(token)) {
                f9131h = "0";
            }
        }
        if (f9132i == 0) {
            f9132i = CacheManager.getGuid(getContext());
        }
    }

    public boolean decode(JSONObject jSONObject) {
        return true;
    }

    public boolean encode(JSONObject jSONObject) {
        try {
            com.tencent.android.tpush.stat.b.e.a(jSONObject, "ky", this.c);
            EventType type = getType();
            if (type != null) {
                jSONObject.put("et", type.GetIntValue());
            }
            jSONObject.put("ui", com.tencent.android.tpush.stat.b.e.a(this.f9138k));
            com.tencent.android.tpush.stat.b.e.a(jSONObject, am.A, CustomDeviceInfos.getFacilityMacAddr(this.f9138k));
            jSONObject.put("ut", 1);
            if (getType() != EventType.SESSION_ENV) {
                com.tencent.android.tpush.stat.b.e.a(jSONObject, com.alipay.sdk.sys.a.f751k, this.f9136g);
                com.tencent.android.tpush.stat.b.e.a(jSONObject, "ch", channel);
            }
            com.tencent.android.tpush.stat.b.e.a(jSONObject, "mid", f9131h);
            jSONObject.put("si", this.f9135f);
            if (getType() == EventType.CUSTOM) {
                jSONObject.put("cts", this.f9134e);
                long j2 = this.f9137j;
                if (j2 == 0) {
                    long j3 = this.f9134e;
                    if (j3 != 0) {
                        jSONObject.put("ts", j3);
                    }
                }
                jSONObject.put("ts", j2);
            } else {
                jSONObject.put("ts", this.f9134e);
            }
            if ("0".equals(com.tencent.android.tpush.stat.b.b.a(this.f9138k, this.f9133d))) {
                jSONObject.put(com.alipay.sdk.sys.a.f748h, com.tencent.android.tpush.stat.b.b.a(this.f9138k));
            } else {
                jSONObject.put(com.alipay.sdk.sys.a.f748h, com.tencent.android.tpush.stat.b.b.a(this.f9138k, this.f9133d));
            }
            jSONObject.put(TPDownloadProxyEnum.USER_GUID, f9132i);
            jSONObject.put("dts", com.tencent.android.tpush.stat.b.b.a(this.f9138k, false));
            return onEncode(jSONObject);
        } catch (Throwable unused) {
            return false;
        }
    }

    public long getAccessid() {
        return this.f9133d;
    }

    public String getAppkey() {
        return this.c;
    }

    public Context getContext() {
        return this.f9138k;
    }

    public long getMsgTimeSec() {
        return this.f9137j;
    }

    public long getTimestamp() {
        return this.f9134e;
    }

    public abstract EventType getType();

    public abstract boolean onEncode(JSONObject jSONObject);

    public void setAccessid(long j2) {
        this.f9133d = j2;
    }

    public void setAppkey(String str) {
        this.c = str;
    }

    public void setMsgTimeSec(long j2) {
        this.f9137j = j2;
    }

    public String toJsonString() {
        try {
            JSONObject jSONObject = new JSONObject();
            encode(jSONObject);
            return jSONObject.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public String toString() {
        return toJsonString();
    }

    public Event(Context context, String str) {
        this.c = null;
        this.f9133d = 0L;
        this.f9136g = null;
        this.f9137j = 0L;
        this.c = str;
        a(context, 0, 0L);
    }

    public Event(Context context, String str, long j2) {
        this.c = null;
        this.f9133d = 0L;
        this.f9136g = null;
        this.f9137j = 0L;
        this.c = str;
        a(context, 0, j2);
    }

    public Event(Context context) {
        this.c = null;
        this.f9133d = 0L;
        this.f9136g = null;
        this.f9137j = 0L;
        a(context, 0, 0L);
    }
}
