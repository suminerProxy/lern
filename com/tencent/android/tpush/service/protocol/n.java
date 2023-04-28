package com.tencent.android.tpush.service.protocol;

import android.content.Context;
import com.tencent.android.tpush.common.Constants;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class n extends e {

    /* renamed from: a  reason: collision with root package name */
    public long f9000a = 0;
    public String b = "";
    public long c = 0;

    /* renamed from: d  reason: collision with root package name */
    public long f9001d = 0;

    /* renamed from: e  reason: collision with root package name */
    public String f9002e = "";

    /* renamed from: f  reason: collision with root package name */
    public long f9003f = 0;

    /* renamed from: g  reason: collision with root package name */
    public long f9004g = 0;

    /* renamed from: h  reason: collision with root package name */
    public String f9005h = "";

    /* renamed from: i  reason: collision with root package name */
    public String f9006i = "";

    /* renamed from: j  reason: collision with root package name */
    public int f9007j = -1;

    /* renamed from: k  reason: collision with root package name */
    public ArrayList<String> f9008k = null;

    public void a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        this.f9000a = jSONObject.optLong("confVersion", this.f9000a);
        this.b = jSONObject.optString(Constants.FLAG_TOKEN, this.b);
        this.c = jSONObject.optLong(TPDownloadProxyEnum.USER_GUID, this.c);
        this.f9001d = jSONObject.optLong("otherPushTokenType", this.f9001d);
        this.f9002e = jSONObject.optString("otherPushToken", this.f9002e);
        this.f9003f = jSONObject.optLong("otherPushTokenCrc32", this.f9003f);
        this.f9004g = jSONObject.optLong("tokenCrc32", this.f9004g);
        this.f9005h = jSONObject.optString("reserved", this.f9005h);
        this.f9006i = jSONObject.optString(Constants.FLAG_TICKET, this.f9006i);
        this.f9007j = jSONObject.optInt(Constants.FLAG_TICKET_TYPE, this.f9007j);
        JSONArray optJSONArray = jSONObject.optJSONArray("groupKeys");
        if (optJSONArray != null) {
            this.f9008k = new ArrayList<>();
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                this.f9008k.add(optJSONArray.getString(i2));
            }
        }
    }

    @Override // com.tencent.android.tpush.service.protocol.c
    public MessageType a() {
        return MessageType.REGISTER;
    }

    public static String a(Context context, String str) {
        if (context != null && !com.tencent.android.tpush.common.i.b(str)) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(Constants.FLAG_TOKEN, str);
                return jSONObject.toString();
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
