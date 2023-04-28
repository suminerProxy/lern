package com.mob.commons;

import android.text.TextUtils;
import com.mob.MobSDK;
import com.mob.tools.MobLog;
import com.mob.tools.utils.DH;
import java.util.HashMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class r {
    public static void a() {
        try {
            t.a(false);
        } catch (Throwable th) {
            MobLog.getInstance().w(th);
        }
    }

    public static void b() {
        t.a(true);
    }

    public static int c() {
        int e2 = t.e();
        if (e2 == 1) {
            return 1;
        }
        if (e2 == 0) {
            return -1;
        }
        boolean z = o.f3666e;
        if (x.b()) {
            z = x.a().a(x.f3710h, o.f3666e);
        }
        return z ? 0 : 2;
    }

    public static boolean d() {
        int c = c();
        if (c == 2 || c == 1) {
            return b.b();
        }
        return false;
    }

    public static boolean e() {
        int c = c();
        if (c == 2 || c == 1) {
            t.g();
            return true ^ b.a();
        }
        return true;
    }

    public static HashMap<String, Object> f() {
        final HashMap<String, Object> hashMap = new HashMap<>();
        DH.RequestBuilder requester = DH.requester(MobSDK.getContext());
        requester.getIMEI().getSerialno().getCarrier().getNetworkType().getMIUIVersion().getSignMD5().getIMSI();
        requester.request(new DH.DHResponder() { // from class: com.mob.commons.r.1
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
                hashMap.put(p.a("006Adf9eeNdj$i9di"), MobSDK.getAppkey());
                hashMap.put(p.a("006>fgMhTdj8ji.dh"), Integer.valueOf(MobSDK.SDK_VERSION_CODE));
                hashMap.put(p.a("004e9eddf<d"), 1);
                hashMap.put(p.a("004h@dcdeWh"), e.a((MobProduct) null));
                hashMap.put(p.a("006<dfCeee=djff"), MobSDK.getContext().getPackageName());
                hashMap.put(p.a("0068df)eeji:dh"), Integer.valueOf(DH.SyncMtd.getAppVersion()));
                hashMap.put("iemt", dHResponse.getIMEI());
                hashMap.put("snmt", dHResponse.getSerialno());
                hashMap.put(p.a("007>dgdfdhdhde>i[dh"), dHResponse.getCarrier());
                hashMap.put(p.a("005l2ec7hi,ed"), DH.SyncMtd.getModel());
                hashMap.put(p.a("007,fhdfdgYd]ecdhdi"), DH.SyncMtd.getManufacturer());
                hashMap.put(p.a("011-dk8id5fdecdhdjeidiLei"), dHResponse.getNetworkType());
                hashMap.put(p.a("006OfgdifgJjiEdh"), DH.SyncMtd.getOSVersionName());
                hashMap.put(p.a("0057dcdeJji@dh"), dHResponse.getMIUIVersion());
                hashMap.put(p.a("009PfgdifgIji:dhdedkPd"), Integer.valueOf(DH.SyncMtd.getOSVersionInt()));
                hashMap.put(p.a("0108dgedde*iFdk+dReideYli"), Long.valueOf(System.currentTimeMillis()));
                hashMap.put(p.a("006LdfTeelhWhe"), dHResponse.getSignMD5());
                hashMap.put("ismt", dHResponse.getIMSI());
                hashMap.put(p.a("005*fcdhdfdk=h"), DH.SyncMtd.getBrand());
            }
        });
        return hashMap;
    }

    public static HashMap<String, Object> a(String str) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(p.a("006>dfYee)djOi,di"), MobSDK.getAppkey());
        hashMap.put(p.a("006!df8eee1djff"), DH.SyncMtd.getPackageName());
        hashMap.put(p.a("006Kdf1eeji%dh"), DH.SyncMtd.getAppVersionName());
        hashMap.put(p.a("004eZeddfNd"), String.valueOf(DH.SyncMtd.getPlatformCode()));
        hashMap.put(p.a("011Jdk_idMfdecdhdjAdBdi_ei"), str);
        String b = e.b();
        if (!TextUtils.isEmpty(b)) {
            hashMap.put(p.a("004h3dcdeVh"), b);
        }
        return hashMap;
    }
}
