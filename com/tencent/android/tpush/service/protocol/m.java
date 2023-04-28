package com.tencent.android.tpush.service.protocol;

import android.content.Context;
import android.content.Intent;
import com.tencent.android.tpush.common.Constants;
import com.tencent.android.tpush.encrypt.Rijndael;
import com.tencent.android.tpush.logging.TLogger;
import com.tencent.android.tpush.service.cache.CacheManager;
import com.tencent.android.tpush.service.channel.security.TpnsSecurity;
import com.tencent.tpns.baseapi.base.util.CacheHelper;
import com.tencent.tpns.baseapi.base.util.CloudManager;
import com.tencent.tpns.baseapi.base.util.Logger;
import com.tencent.tpns.baseapi.base.util.Md5;
import net.sourceforge.pinyin4j.ChineseToPinyinResource;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class m extends d {
    public String M;
    public String N;

    /* renamed from: a  reason: collision with root package name */
    public long f8986a = 0;
    public String b = "";
    public String c = "";

    /* renamed from: d  reason: collision with root package name */
    public String f8987d = "";

    /* renamed from: e  reason: collision with root package name */
    public String f8988e = "";

    /* renamed from: f  reason: collision with root package name */
    public short f8989f = 0;

    /* renamed from: g  reason: collision with root package name */
    public short f8990g = 0;

    /* renamed from: h  reason: collision with root package name */
    public f f8991h = null;

    /* renamed from: i  reason: collision with root package name */
    public short f8992i = 0;

    /* renamed from: j  reason: collision with root package name */
    public byte f8993j = 0;

    /* renamed from: k  reason: collision with root package name */
    public h f8994k = null;

    /* renamed from: l  reason: collision with root package name */
    public short f8995l = 0;

    /* renamed from: m  reason: collision with root package name */
    public String f8996m = "";

    /* renamed from: n  reason: collision with root package name */
    public String f8997n = "";

    /* renamed from: o  reason: collision with root package name */
    public String f8998o = "";

    /* renamed from: p  reason: collision with root package name */
    public long f8999p = 0;
    public long q = 0;
    public long r = 0;
    public long s = 0;
    public long t = 0;
    public long u = 0;
    public String v = "";
    public long w = 0;
    public long x = 0;
    public String y = "";
    public String z = "";
    public String A = "";
    public String B = "";
    public String C = "";
    public String D = "";
    public int E = 0;
    public g F = null;
    public int G = 0;
    public long H = 0;
    public boolean I = true;
    public boolean J = false;
    public String K = null;
    public boolean L = false;

    @Override // com.tencent.android.tpush.service.protocol.d
    public JSONObject a(Context context) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("accessId", this.f8986a);
        jSONObject.put("accessKey", this.b);
        jSONObject.put(Constants.FLAG_DEVICE_ID, this.c);
        jSONObject.put("appCert", this.f8987d);
        jSONObject.put(Constants.FLAG_TICKET, this.f8988e);
        jSONObject.put(Constants.FLAG_TICKET_TYPE, (int) this.f8989f);
        jSONObject.put("deviceType", (int) this.f8990g);
        f fVar = this.f8991h;
        if (fVar != null) {
            jSONObject.put("deviceInfo", fVar.a());
            f fVar2 = this.f8991h;
            this.N = com.tencent.android.tpush.service.util.b.a(fVar2.t, fVar2.u);
        }
        jSONObject.put("version", (int) this.f8992i);
        jSONObject.put("keyEncrypted", (int) this.f8993j);
        h hVar = this.f8994k;
        if (hVar != null) {
            jSONObject.put("mutableInfo", hVar.a());
        }
        jSONObject.put("updateAutoTag", (int) this.f8995l);
        jSONObject.put("appVersion", this.f8996m);
        jSONObject.put("clientid", this.f8998o);
        jSONObject.put("connVersion", this.r);
        jSONObject.put("channelId", this.s);
        jSONObject.put("otherPushTokenOpType", this.t);
        jSONObject.put("otherPushTokenType", this.u);
        jSONObject.put("otherPushToken", this.v);
        jSONObject.put("otherPushTokenCrc32", this.w);
        jSONObject.put("tokenCrc32", this.x);
        jSONObject.put("otherPushData", this.y);
        jSONObject.put("sdkVersion", this.z);
        if (!com.tencent.android.tpush.common.i.b(this.A) && !com.tencent.android.tpush.common.i.b(this.B)) {
            jSONObject.put("channelToken", this.A);
            jSONObject.put("channelType", this.B);
            jSONObject.put("deviceRegion", this.C);
        }
        if (!com.tencent.android.tpush.common.i.b(this.D)) {
            jSONObject.put("appPkgName", this.D);
        }
        jSONObject.put("tAd", this.E);
        g gVar = this.F;
        if (gVar != null && gVar.a()) {
            jSONObject.put("freeVersionInfo", this.F.b());
        }
        jSONObject.put("hwSdk", this.G);
        jSONObject.put("cloudVersion", this.H);
        try {
            String jSONObject2 = jSONObject.toString();
            String str = (String) CacheHelper.get(context, com.tencent.android.tpush.d.b.a.a());
            String md5 = Md5.md5(jSONObject2.substring(0, jSONObject2.indexOf("bootTime")) + jSONObject2.substring(jSONObject2.indexOf("countryCode")));
            if (md5 != null && md5.equals(str)) {
                this.I = false;
            } else {
                this.I = true;
                CacheHelper.set(context, com.tencent.android.tpush.d.b.a.a().set(md5));
            }
        } catch (Throwable unused) {
            this.I = true;
        }
        jSONObject.put("timestamp", this.q);
        return jSONObject;
    }

    public boolean b(Context context) {
        try {
            a(context);
        } catch (Throwable th) {
            TLogger.d("RegisterReq", "unexpected for:" + th.getMessage());
        }
        return this.I;
    }

    @Override // com.tencent.android.tpush.service.protocol.c
    public MessageType a() {
        return MessageType.REGISTER;
    }

    public static m a(Context context, Intent intent, boolean z) {
        String str;
        m mVar;
        String decrypt;
        String stringExtra;
        String stringExtra2;
        String stringExtra3;
        String stringExtra4;
        String stringExtra5;
        if (intent == null) {
            Logger.w("RegReq", "intent was null");
            return null;
        } else if (context == null) {
            Logger.w("RegReq", "context was null");
            return null;
        } else {
            try {
                mVar = new m();
                mVar.f8986a = Long.parseLong(Rijndael.decrypt(intent.getStringExtra("accId")));
                mVar.b = Rijndael.decrypt(intent.getStringExtra(Constants.FLAG_ACC_KEY));
                mVar.K = Rijndael.decrypt(intent.getStringExtra(Constants.FLAG_PACK_NAME));
                mVar.f8988e = Rijndael.decrypt(intent.getStringExtra(Constants.FLAG_TICKET));
                mVar.f8989f = (short) intent.getIntExtra(Constants.FLAG_TICKET_TYPE, -1);
                decrypt = Rijndael.decrypt(intent.getStringExtra("qua"));
                mVar.f8996m = intent.getStringExtra("appVer");
                mVar.f8997n = Rijndael.decrypt(intent.getStringExtra("reserved"));
                mVar.s = intent.getLongExtra("accChannel", -1L);
                stringExtra = intent.getStringExtra("url");
                mVar.v = intent.getStringExtra("otherToken");
                stringExtra2 = intent.getStringExtra("payload");
                mVar.u = intent.getLongExtra("otherPushType", -1L);
                mVar.t = intent.getLongExtra("otherPushTokenOpType", -1L);
                mVar.J = intent.getBooleanExtra("aidl", false);
                stringExtra3 = intent.getStringExtra("channelToken");
                stringExtra4 = intent.getStringExtra("channelType");
                stringExtra5 = intent.getStringExtra("deviceRegion");
            } catch (Throwable th) {
                th = th;
                str = "RegReq";
            }
            try {
                mVar.H = CloudManager.getInstance(context).getCloudVersion();
                try {
                    if (!com.tencent.android.tpush.common.i.b(decrypt)) {
                        CacheManager.setQua(context, mVar.f8986a, decrypt);
                    }
                } catch (Throwable unused) {
                }
                try {
                    mVar.f8987d = TpnsSecurity.getEncryptAPKSignature(context.createPackageContext(mVar.K, 0));
                } catch (Throwable unused2) {
                }
                mVar.c = com.tencent.android.tpush.service.util.a.a();
                mVar.z = "1.3.7.0";
                mVar.f8991h = com.tencent.android.tpush.service.c.a(com.tencent.android.tpush.service.b.e());
                mVar.f8992i = (short) 4;
                mVar.r = 0L;
                mVar.q = System.currentTimeMillis() / 1000;
                if (!com.tencent.android.tpush.common.i.b(stringExtra)) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("url", stringExtra);
                        if (!com.tencent.android.tpush.common.i.b(stringExtra2)) {
                            jSONObject.put("payload", stringExtra2);
                        }
                    } catch (JSONException unused3) {
                    }
                    mVar.y = jSONObject.toString();
                }
                mVar.f8999p = CacheManager.getGuid(com.tencent.android.tpush.service.b.e());
                if (stringExtra3 != null && stringExtra4 != null) {
                    mVar.A = stringExtra3;
                    mVar.B = stringExtra4;
                    mVar.C = stringExtra5;
                }
                if (context != null) {
                    mVar.D = context.getPackageName();
                }
                try {
                    Class.forName("com.qq.e.ads.ADActivity");
                    mVar.E = 1;
                    mVar.G = com.tencent.android.tpush.c.a.a();
                    mVar.L = intent.getBooleanExtra("hasRegisted", false);
                    mVar.M = intent.getStringExtra(Constants.FLAG_TOKEN);
                    TLogger.vv("RegReq", "Register(" + mVar.f8986a + ChineseToPinyinResource.Field.COMMA + mVar.c + ChineseToPinyinResource.Field.COMMA + mVar.f8988e + ChineseToPinyinResource.Field.COMMA + ((int) mVar.f8989f) + "),payload: " + mVar.y + " channel id" + mVar.s);
                    return mVar;
                }
            } catch (Throwable th2) {
                th = th2;
                str = "RegReq";
                TLogger.e(str, ">> register error " + th);
                TLogger.e(str, ">> register error-> " + TLogger.getStackTraceString(th));
                return null;
            }
        }
    }
}
