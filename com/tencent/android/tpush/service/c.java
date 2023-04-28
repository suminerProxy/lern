package com.tencent.android.tpush.service;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.tencent.android.tpush.XGPushConfig;
import com.tencent.android.tpush.common.AppInfos;
import com.tencent.android.tpush.common.Constants;
import com.tencent.android.tpush.common.MessageKey;
import com.tencent.android.tpush.common.ReturnCode;
import com.tencent.android.tpush.common.g;
import com.tencent.android.tpush.common.i;
import com.tencent.android.tpush.encrypt.Rijndael;
import com.tencent.android.tpush.logging.TLogger;
import com.tencent.android.tpush.service.channel.security.TpnsSecurity;
import com.tencent.android.tpush.service.protocol.f;
import com.tencent.android.tpush.service.protocol.l;
import com.tencent.android.tpush.service.protocol.o;
import com.tencent.android.tpush.service.protocol.p;
import com.tencent.android.tpush.service.protocol.q;
import com.tencent.android.tpush.service.protocol.r;
import com.tencent.android.tpush.service.protocol.s;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.tpns.baseapi.base.util.Md5;
import com.tencent.tpns.baseapi.base.util.TGlobalHelper;
import com.tencent.tpns.baseapi.base.util.Util;
import com.tencent.tpns.dataacquisition.CustomDeviceInfos;
import com.tencent.tpns.dataacquisition.DeviceInfos;
import java.util.ArrayList;
import java.util.Locale;
import java.util.TimeZone;
import net.sourceforge.pinyin4j.ChineseToPinyinResource;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class c {

    /* renamed from: e  reason: collision with root package name */
    private static f f8883e;

    /* renamed from: a  reason: collision with root package name */
    private static c f8881a = new c();
    private static JSONArray b = new JSONArray();
    private static final String c = Md5.md5("com.tencent.tpush.last_wifi_ts");

    /* renamed from: d  reason: collision with root package name */
    private static int f8882d = -1;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f8884f = false;

    public static byte a(boolean z) {
        return z ? (byte) 1 : (byte) 0;
    }

    public static c a() {
        return f8881a;
    }

    private static o b(Context context) {
        o oVar = new o();
        oVar.f9009a = DeviceInfos.getBootTime();
        oVar.b = Locale.getDefault().getCountry();
        oVar.c = DeviceInfos.getDeviceName(context);
        oVar.f9010d = DeviceInfos.getCarrierInfo(context);
        oVar.f9011e = String.valueOf(DeviceInfos.getTotalMemory());
        oVar.f9012f = String.valueOf(DeviceInfos.getTotalInternalMemorySize());
        oVar.f9013g = DeviceInfos.getSysFileTime();
        return oVar;
    }

    public static f a(Context context) {
        if (f8883e == null) {
            f8883e = new f();
        }
        if (TextUtils.isEmpty(f8883e.c)) {
            f fVar = f8883e;
            fVar.f8948i = "" + AppInfos.getApiLevel();
            f8883e.f8942a = CustomDeviceInfos.getFacilityIdentity(context);
            if (DeviceInfos.checkSimulator(context)) {
                f fVar2 = f8883e;
                fVar2.f8947h = "SIMULATOR";
                fVar2.b = DeviceInfos.getSimulatorModel(context);
            } else {
                f8883e.f8947h = Build.MANUFACTURER;
                f8883e.b = TGlobalHelper.getDM(context);
            }
            f8883e.c = "android";
            DisplayMetrics displayMetrics = DeviceInfos.getDisplayMetrics(context);
            f fVar3 = f8883e;
            fVar3.f8946g = displayMetrics.widthPixels + "*" + displayMetrics.heightPixels;
            f fVar4 = f8883e;
            fVar4.f8948i = "" + Build.VERSION.SDK_INT;
            f8883e.f8944e = DeviceInfos.getExternalStorageInfo(context);
            f8883e.f8945f = CustomDeviceInfos.getSimOperator(context);
            f8883e.f8949j = Build.VERSION.RELEASE;
            f8883e.f8950k = DeviceInfos.hasRootAccess(context);
            f8883e.f8953n = Locale.getDefault().getLanguage();
            f8883e.f8955p = AppInfos.getLauncherPackageName(context);
            f8883e.v = b(context);
            f8883e.r = g.a();
            f8883e.s = g.c();
        }
        f8883e.f8954o = TimeZone.getDefault().getID();
        f8883e.f8943d = DeviceInfos.getLinkedWay(context);
        f8883e.t = com.tencent.android.tpush.service.util.b.b(context);
        f8883e.u = com.tencent.android.tpush.service.util.b.c(context);
        return f8883e;
    }

    public void b(long j2, String str, String str2, int i2, String str3, com.tencent.android.tpush.service.c.a aVar) {
        com.tencent.android.tpush.service.protocol.b bVar = new com.tencent.android.tpush.service.protocol.b();
        bVar.f8938a = j2;
        bVar.b = str;
        bVar.f8939d = i2;
        bVar.c = str3;
        bVar.f8940e = System.currentTimeMillis() / 1000;
        bVar.f8941f = "1.3.7.0";
        TLogger.d("PushServiceNetworkHandler", "Action -> sendAttributes to server (" + j2 + ChineseToPinyinResource.Field.COMMA + str2 + ChineseToPinyinResource.Field.RIGHT_BRACKET);
        if (Util.checkAccessId(bVar.f8938a) && Util.checkAccessKey(bVar.b)) {
            com.tencent.android.tpush.service.c.b.a().a(b.e(), bVar, aVar);
        } else if (aVar != null) {
            ReturnCode returnCode = ReturnCode.CODE_ACCESSKET_OR_ACCESSID_ERROR;
            aVar.b(returnCode.getType(), ReturnCode.errCodeToMsg(returnCode.getType()), bVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
        r4 = com.tencent.android.tpush.common.ReturnCode.CODE_ACCESSKET_OR_ACCESSID_ERROR;
        r6.b(r4.getType(), com.tencent.android.tpush.common.ReturnCode.errCodeToMsg(r4.getType()), r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0096, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.content.Context r4, com.tencent.android.tpush.service.protocol.m r5, com.tencent.android.tpush.service.c.a r6) {
        /*
            r3 = this;
            if (r4 != 0) goto L6
            android.content.Context r4 = com.tencent.android.tpush.service.b.e()     // Catch: java.lang.Throwable -> L96
        L6:
            if (r5 != 0) goto L1c
            if (r6 == 0) goto L1b
            com.tencent.android.tpush.common.ReturnCode r4 = com.tencent.android.tpush.common.ReturnCode.ERRORCODE_UNKNOWN     // Catch: java.lang.Throwable -> L96
            int r0 = r4.getType()     // Catch: java.lang.Throwable -> L96
            int r4 = r4.getType()     // Catch: java.lang.Throwable -> L96
            java.lang.String r4 = com.tencent.android.tpush.common.ReturnCode.errCodeToMsg(r4)     // Catch: java.lang.Throwable -> L96
            r6.b(r0, r4, r5)     // Catch: java.lang.Throwable -> L96
        L1b:
            return
        L1c:
            long r0 = r5.f8986a     // Catch: java.lang.Throwable -> L96
            boolean r0 = com.tencent.tpns.baseapi.base.util.Util.checkAccessId(r0)     // Catch: java.lang.Throwable -> L96
            if (r0 == 0) goto L83
            java.lang.String r0 = r5.b     // Catch: java.lang.Throwable -> L96
            boolean r0 = com.tencent.tpns.baseapi.base.util.Util.checkAccessKey(r0)     // Catch: java.lang.Throwable -> L96
            if (r0 != 0) goto L2d
            goto L83
        L2d:
            boolean r0 = r5.L     // Catch: java.lang.Throwable -> L96
            java.lang.String r1 = ""
            if (r0 == 0) goto L63
            com.tencent.tpns.baseapi.base.util.CacheHelper$Key r0 = com.tencent.android.tpush.d.b.a.b()     // Catch: java.lang.Throwable -> L96
            java.lang.Object r0 = com.tencent.tpns.baseapi.base.util.CacheHelper.get(r4, r0)     // Catch: java.lang.Throwable -> L96
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L96
            boolean r0 = com.tencent.tpns.baseapi.base.util.Util.isNullOrEmptyString(r0)     // Catch: java.lang.Throwable -> L96
            if (r0 == 0) goto L59
            java.lang.String r0 = r5.v     // Catch: java.lang.Throwable -> L96
            java.lang.String r0 = com.tencent.android.tpush.service.protocol.n.a(r4, r0)     // Catch: java.lang.Throwable -> L96
            boolean r2 = com.tencent.tpns.baseapi.base.util.Util.isNullOrEmptyString(r0)     // Catch: java.lang.Throwable -> L96
            if (r2 != 0) goto L63
            com.tencent.android.tpush.common.ReturnCode r4 = com.tencent.android.tpush.common.ReturnCode.CODE_SUCCESS     // Catch: java.lang.Throwable -> L96
            int r4 = r4.getType()     // Catch: java.lang.Throwable -> L96
            r6.a(r4, r0, r5)     // Catch: java.lang.Throwable -> L96
            return
        L59:
            com.tencent.android.tpush.common.ReturnCode r4 = com.tencent.android.tpush.common.ReturnCode.CODE_SUCCESS     // Catch: java.lang.Throwable -> L96
            int r4 = r4.getType()     // Catch: java.lang.Throwable -> L96
            r6.a(r4, r1, r5)     // Catch: java.lang.Throwable -> L96
            return
        L63:
            boolean r0 = r5.b(r4)     // Catch: java.lang.Throwable -> L96
            if (r0 != 0) goto L7b
            boolean r0 = com.tencent.tpns.baseapi.XGApiConfig.isRegistered(r4)     // Catch: java.lang.Throwable -> L96
            if (r0 == 0) goto L7b
            if (r6 == 0) goto L7a
            com.tencent.android.tpush.common.ReturnCode r4 = com.tencent.android.tpush.common.ReturnCode.CODE_SUCCESS     // Catch: java.lang.Throwable -> L96
            int r4 = r4.getType()     // Catch: java.lang.Throwable -> L96
            r6.a(r4, r1, r5)     // Catch: java.lang.Throwable -> L96
        L7a:
            return
        L7b:
            com.tencent.android.tpush.service.c.b r0 = com.tencent.android.tpush.service.c.b.a()     // Catch: java.lang.Throwable -> L96
            r0.a(r4, r5, r6)     // Catch: java.lang.Throwable -> L96
            goto L96
        L83:
            if (r6 == 0) goto L96
            com.tencent.android.tpush.common.ReturnCode r4 = com.tencent.android.tpush.common.ReturnCode.CODE_ACCESSKET_OR_ACCESSID_ERROR     // Catch: java.lang.Throwable -> L96
            int r0 = r4.getType()     // Catch: java.lang.Throwable -> L96
            int r4 = r4.getType()     // Catch: java.lang.Throwable -> L96
            java.lang.String r4 = com.tencent.android.tpush.common.ReturnCode.errCodeToMsg(r4)     // Catch: java.lang.Throwable -> L96
            r6.b(r0, r4, r5)     // Catch: java.lang.Throwable -> L96
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.android.tpush.service.c.a(android.content.Context, com.tencent.android.tpush.service.protocol.m, com.tencent.android.tpush.service.c.a):void");
    }

    public void a(String str, String str2, long j2, String str3, String str4, com.tencent.android.tpush.service.c.a aVar) {
        String str5;
        r rVar = new r();
        try {
            str5 = TpnsSecurity.getEncryptAPKSignature(b.e().createPackageContext(str4, 0));
        } catch (Throwable th) {
            TLogger.e("PushServiceNetworkHandler", ">> create context [for: " + str4 + "] fail.", th);
            str5 = "";
        }
        rVar.b = j2;
        rVar.c = str3;
        rVar.f9020d = str5;
        rVar.f9021e = (byte) 0;
        rVar.f9022f = (byte) 0;
        rVar.f9023g = System.currentTimeMillis() / 1000;
        rVar.f9024h = "1.3.7.0";
        if (Util.checkAccessId(rVar.b) && Util.checkAccessKey(rVar.c)) {
            com.tencent.android.tpush.service.c.b.a().a(b.e(), rVar, aVar);
        } else if (aVar != null) {
            ReturnCode returnCode = ReturnCode.CODE_ACCESSKET_OR_ACCESSID_ERROR;
            aVar.b(returnCode.getType(), ReturnCode.errCodeToMsg(returnCode.getType()), rVar);
        }
    }

    public void a(long j2, String str, String str2, int i2, com.tencent.android.tpush.service.c.a aVar) {
        long currentTimeMillis = System.currentTimeMillis();
        com.tencent.android.tpush.service.protocol.a aVar2 = new com.tencent.android.tpush.service.protocol.a();
        aVar2.f8934a = j2;
        aVar2.b = str;
        aVar2.c = i2;
        aVar2.f8935d = currentTimeMillis / 1000;
        aVar2.f8936e = "1.3.7.0";
        if (!i.b(str2)) {
            try {
                JSONArray jSONArray = new JSONArray(str2);
                ArrayList<q> arrayList = new ArrayList<>();
                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i3);
                    q qVar = new q();
                    qVar.a(jSONObject.getString(Constants.FLAG_ACCOUNT));
                    qVar.a(jSONObject.optInt("account_type", 0));
                    arrayList.add(qVar);
                }
                aVar2.f8937f = arrayList;
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        if (XGPushConfig.enableDebug) {
            TLogger.vv("PushServiceNetworkHandler", "setAccount(" + j2 + ChineseToPinyinResource.Field.COMMA + str2 + ChineseToPinyinResource.Field.RIGHT_BRACKET);
        }
        if (Util.checkAccessId(aVar2.f8934a) && Util.checkAccessKey(aVar2.b)) {
            com.tencent.android.tpush.service.c.b.a().a(b.e(), aVar2, aVar);
            return;
        }
        ReturnCode returnCode = ReturnCode.CODE_ACCESSKET_OR_ACCESSID_ERROR;
        aVar.b(returnCode.getType(), ReturnCode.errCodeToMsg(returnCode.getType()), aVar2);
    }

    public void a(long j2, String str, String str2, int i2, String str3, com.tencent.android.tpush.service.c.a aVar) {
        p pVar = new p();
        pVar.f9014a = j2;
        pVar.b = str;
        pVar.f9015d = i2;
        pVar.c = str3;
        pVar.f9016e = System.currentTimeMillis() / 1000;
        pVar.f9017f = "1.3.7.0";
        if (XGPushConfig.enableDebug) {
            TLogger.d("PushServiceNetworkHandler", "Action -> sendTag to server (" + j2 + ChineseToPinyinResource.Field.COMMA + str2 + ChineseToPinyinResource.Field.RIGHT_BRACKET);
        }
        if (Util.checkAccessId(pVar.f9014a) && Util.checkAccessKey(pVar.b)) {
            com.tencent.android.tpush.service.c.b.a().a(b.e(), pVar, aVar);
        } else if (aVar != null) {
            ReturnCode returnCode = ReturnCode.CODE_ACCESSKET_OR_ACCESSID_ERROR;
            aVar.b(returnCode.getType(), ReturnCode.errCodeToMsg(returnCode.getType()), pVar);
        }
    }

    public void a(long j2, String str, String str2, int i2, int i3, String str3, com.tencent.android.tpush.service.c.a aVar) {
        l lVar = new l();
        lVar.f8981a = j2;
        lVar.b = str;
        lVar.f8982d = i3;
        lVar.c = i2;
        lVar.f8985g = str3;
        lVar.f8983e = System.currentTimeMillis() / 1000;
        lVar.f8984f = "1.3.7.0";
        if (XGPushConfig.enableDebug) {
            TLogger.d("PushServiceNetworkHandler", "Action -> getTags from server (" + j2 + ChineseToPinyinResource.Field.COMMA + str2 + ChineseToPinyinResource.Field.RIGHT_BRACKET);
        }
        if (Util.checkAccessId(lVar.f8981a) && Util.checkAccessKey(lVar.b)) {
            com.tencent.android.tpush.service.c.b.a().a(b.e(), lVar, aVar);
        } else if (aVar != null) {
            ReturnCode returnCode = ReturnCode.CODE_ACCESSKET_OR_ACCESSID_ERROR;
            aVar.b(returnCode.getType(), ReturnCode.errCodeToMsg(returnCode.getType()), lVar);
        }
    }

    public void a(long j2, String str, String str2, String str3, String str4, com.tencent.android.tpush.service.c.a aVar) {
        com.tencent.android.tpush.service.c.b.a().a(b.e(), new s(j2, str, str2, str3, str4, System.currentTimeMillis() / 1000, "1.3.7.0"), aVar);
    }

    public void a(Intent intent, com.tencent.android.tpush.service.c.a aVar) {
        com.tencent.android.tpush.service.protocol.i iVar = new com.tencent.android.tpush.service.protocol.i();
        iVar.f8959a = intent.getLongExtra("type", 0L);
        try {
            iVar.b = Long.parseLong(Rijndael.decrypt(intent.getStringExtra("accessId")));
        } catch (NumberFormatException unused) {
            TLogger.e("PushServiceNetworkHandler", "sendCommReportMessage NumberFormatException");
        }
        iVar.c = intent.getLongExtra(MessageKey.MSG_ID, 0L);
        iVar.f8960d = intent.getLongExtra("broadcastId", 0L);
        iVar.f8961e = intent.getLongExtra("msgTimestamp", 0L);
        iVar.f8962f = intent.getLongExtra("clientTimestamp", 0L);
        iVar.f8965i = intent.getStringExtra("pkgName");
        String decrypt = Rijndael.decrypt(intent.getStringExtra("msg"));
        if (decrypt != null) {
            iVar.f8963g = decrypt;
        }
        String decrypt2 = Rijndael.decrypt(intent.getStringExtra(TUIConstants.TUIOfflinePush.NOTIFICATION_EXT_KEY));
        if (decrypt2 != null) {
            iVar.f8964h = decrypt2;
        }
        if (Util.checkAccessId(iVar.b)) {
            com.tencent.android.tpush.service.c.b.a().b(b.e(), iVar, aVar);
        } else if (aVar != null) {
            ReturnCode returnCode = ReturnCode.CODE_ACCESSKET_OR_ACCESSID_ERROR;
            aVar.b(returnCode.getType(), ReturnCode.errCodeToMsg(returnCode.getType()), iVar);
        }
    }
}
