package com.tencent.android.tpush.stat.event;

import android.content.Context;
import com.tencent.android.tpush.common.Constants;
import com.tencent.android.tpush.logging.TLogger;
import com.tencent.tpns.baseapi.XGApiConfig;
import com.tencent.tpns.baseapi.base.device.GuidInfoManager;
import java.util.Properties;
import net.sourceforge.pinyin4j.ChineseToPinyinResource;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class c extends Event {

    /* renamed from: a  reason: collision with root package name */
    public a f9146a;
    public long b;

    public c(Context context, int i2, String str, long j2, long j3) {
        super(context, i2, j2);
        a aVar = new a();
        this.f9146a = aVar;
        this.b = -1L;
        aVar.f9147a = str;
        this.f9137j = j3;
    }

    public a a() {
        return this.f9146a;
    }

    @Override // com.tencent.android.tpush.stat.event.Event
    public EventType getType() {
        return EventType.CUSTOM;
    }

    @Override // com.tencent.android.tpush.stat.event.Event
    public boolean onEncode(JSONObject jSONObject) {
        return true;
    }

    @Override // com.tencent.android.tpush.stat.event.Event
    public String toJsonString() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("eventId", this.f9146a.f9147a);
            JSONObject jSONObject3 = this.f9146a.c;
            if (jSONObject3 != null && jSONObject3.length() != 0) {
                jSONObject2.put("kv", this.f9146a.c);
            }
            jSONObject.put("customEvent", jSONObject2);
            EventType type = getType();
            if (type != null) {
                jSONObject.put("et", type.GetIntValue());
            }
            jSONObject.put("sdkVersion", "1.3.7.0");
            jSONObject.put(Constants.FLAG_TOKEN, GuidInfoManager.getToken(this.f9138k.getApplicationContext()));
            jSONObject.put("accessId", XGApiConfig.getAccessId(this.f9138k));
            jSONObject.put("timestamp", System.currentTimeMillis() / 1000);
            jSONObject.put("idx", com.tencent.android.tpush.stat.b.b.a());
            return jSONObject.toString();
        } catch (Throwable th) {
            TLogger.e("CustomEvent toJson Error:", th.getMessage());
            return "";
        }
    }

    @Override // com.tencent.android.tpush.stat.event.Event
    public String toString() {
        return toJsonString();
    }

    /* compiled from: ProGuard */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f9147a;
        public JSONArray b;
        public JSONObject c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f9148d;

        public a(String str, String[] strArr, Properties properties) {
            this.c = null;
            this.f9148d = false;
            this.f9147a = str;
            if (properties != null) {
                this.c = new JSONObject(properties);
            } else if (strArr != null) {
                this.b = new JSONArray();
                for (String str2 : strArr) {
                    this.b.put(str2);
                }
            } else {
                this.c = new JSONObject();
            }
        }

        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                return toString().equals(((a) obj).toString());
            }
            return false;
        }

        public int hashCode() {
            return toString().hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f9147a);
            sb.append(ChineseToPinyinResource.Field.COMMA);
            JSONArray jSONArray = this.b;
            if (jSONArray != null) {
                sb.append(jSONArray.toString());
            }
            JSONObject jSONObject = this.c;
            if (jSONObject != null) {
                sb.append(jSONObject.toString());
            }
            return sb.toString();
        }

        public a() {
            this.c = null;
            this.f9148d = false;
        }
    }
}
