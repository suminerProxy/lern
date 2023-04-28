package com.tencent.android.tpush.service.protocol;

import com.tencent.android.tpush.common.MessageKey;
import com.tencent.android.tpush.logging.TLogger;
import org.json.JSONObject;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    public long f8966a = 0;
    public long b = 0;
    public long c = 0;

    /* renamed from: d  reason: collision with root package name */
    public String f8967d = "";

    /* renamed from: e  reason: collision with root package name */
    public String f8968e = "";

    /* renamed from: f  reason: collision with root package name */
    public long f8969f = 0;

    /* renamed from: g  reason: collision with root package name */
    public String f8970g = "";

    /* renamed from: h  reason: collision with root package name */
    public long f8971h = 0;

    /* renamed from: i  reason: collision with root package name */
    public long f8972i = 0;

    /* renamed from: j  reason: collision with root package name */
    public String f8973j = "";

    /* renamed from: k  reason: collision with root package name */
    public long f8974k = 0;

    /* renamed from: l  reason: collision with root package name */
    public int f8975l = 0;

    /* renamed from: m  reason: collision with root package name */
    public long f8976m = 0;

    /* renamed from: n  reason: collision with root package name */
    public long f8977n = 0;

    /* renamed from: o  reason: collision with root package name */
    public long f8978o = 0;

    /* renamed from: p  reason: collision with root package name */
    public String f8979p = "";
    public String q = "";
    public String r = "";
    public String s = "";
    public long t = 0;
    public long u = 0;
    public int v = 0;
    public String w = "";
    public String x = "";
    public String y = "";

    public void a(JSONObject jSONObject) {
        b(jSONObject);
        JSONObject optJSONObject = jSONObject.optJSONObject("content");
        if (optJSONObject != null) {
            this.f8968e = optJSONObject.toString();
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject(MessageKey.MSG_IN_MSG);
        if (optJSONObject2 != null) {
            this.y = optJSONObject2.toString();
        }
    }

    public void b(JSONObject jSONObject) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("xg");
            if (optJSONObject != null) {
                TLogger.w("PushMessage", "parse mqtt msg contain key \"xg\"");
                jSONObject = optJSONObject;
            } else {
                TLogger.w("PushMessage", "parse mqtt msg not contain key \"xg\"");
            }
            this.f8966a = jSONObject.optLong(MessageKey.MSG_ID, 0L);
            this.b = jSONObject.optLong("accessId", 0L);
            this.c = jSONObject.optLong(MessageKey.MSG_BUSI_MSG_ID, 0L);
            this.f8967d = jSONObject.optString("title", "");
            long optLong = jSONObject.optLong("type", 0L);
            this.f8969f = optLong;
            if (optLong == 0) {
                this.f8969f = jSONObject.optLong("msgType", 0L);
            }
            this.f8970g = jSONObject.optString("appPkgName", "");
            this.f8971h = jSONObject.optLong("timestamp", 0L) * 1000;
            this.f8972i = jSONObject.optLong(MessageKey.MSG_CREATE_MULTIPKG, 0L);
            this.f8973j = jSONObject.optString("date", "");
            this.f8974k = jSONObject.optLong("serverTime", 0L) * 1000000;
            this.f8975l = jSONObject.optInt(MessageKey.MSG_TTL, 0);
            this.f8976m = jSONObject.optLong("channelId", 0L);
            this.f8977n = jSONObject.optLong("adPush", 0L);
            this.f8978o = jSONObject.optLong("reseverId", 0L);
            this.f8979p = jSONObject.optString("statTag", "");
            this.r = jSONObject.optString("groupId", "");
            this.t = jSONObject.optLong(MessageKey.MSG_TARGET_TYPE, 0L);
            this.u = jSONObject.optLong(MessageKey.MSG_SOURCE, 0L);
            this.v = jSONObject.optInt(MessageKey.MSG_REVOKEID, 0);
            this.w = jSONObject.optString(MessageKey.MSG_TEMPLATE_ID, "");
            this.x = jSONObject.optString(MessageKey.MSG_TRACE_ID, "");
        } catch (Throwable unused) {
        }
    }
}
