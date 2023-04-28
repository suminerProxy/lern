package com.mob.commons;

import android.text.TextUtils;
import android.util.Base64;
import cn.sharesdk.framework.ShareSDK;
import com.mob.MobSDK;
import com.mob.mgs.MobMGS;
import com.mob.tools.MobLog;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.Data;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class w {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f3702a = {ShareSDK.SDK_TAG, com.mob.commons.a.o.a("006)fihjfifigjik"), "MOBLINK", "MOBPUSH", com.mob.commons.a.o.a("009(fihehhhghehffhgljj"), com.mob.commons.a.o.a("008)hjgmgkfkgjfigjik"), MobMGS.MGS_TAG};
    private static AtomicBoolean b = new AtomicBoolean(false);
    private static final HashMap<String, MobProduct> c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private static String f3703d;

    public static synchronized ArrayList<MobProduct> b() {
        ArrayList<MobProduct> arrayList;
        synchronized (w.class) {
            if (b.compareAndSet(false, true)) {
                c.putAll(h());
            }
            arrayList = new ArrayList<>();
            arrayList.addAll(c.values());
        }
        return arrayList;
    }

    public static synchronized String c() {
        String a2;
        synchronized (w.class) {
            a2 = a(b(), 0);
        }
        return a2;
    }

    public static synchronized String d() {
        String a2;
        synchronized (w.class) {
            a2 = a(b(), 1);
        }
        return a2;
    }

    public static synchronized String e() {
        String a2;
        synchronized (w.class) {
            a2 = a(b(), 2);
        }
        return a2;
    }

    public static synchronized String f() {
        String a2;
        synchronized (w.class) {
            a2 = a(b(), 3);
        }
        return a2;
    }

    private static void g() {
        try {
            new MOBLINK().getProductTag();
        } catch (Throwable unused) {
        }
    }

    private static HashMap<String, MobProduct> h() {
        Class<?> cls;
        HashMap<String, MobProduct> hashMap = new HashMap<>();
        for (Object obj : q.f3674a) {
            try {
                if (obj instanceof String) {
                    cls = Class.forName(String.valueOf(obj).trim());
                } else {
                    cls = (Class) obj;
                }
                if (MobProduct.class.isAssignableFrom(cls) && !MobProduct.class.equals(cls)) {
                    MobProduct mobProduct = (MobProduct) cls.newInstance();
                    String productTag = mobProduct.getProductTag();
                    String[] strArr = f3702a;
                    int length = strArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            String str = strArr[i2];
                            if (str.equals(productTag)) {
                                hashMap.put(str, mobProduct);
                                break;
                            }
                            i2++;
                        }
                    }
                } else {
                    cls.newInstance();
                }
            } catch (Throwable unused) {
            }
        }
        return hashMap;
    }

    public static void a() {
        g();
        v.c.execute(new com.mob.tools.utils.e() { // from class: com.mob.commons.w.1
            @Override // com.mob.tools.utils.e
            public void a() {
            }
        });
    }

    public static synchronized void a(MobProduct mobProduct) {
        synchronized (w.class) {
            if (mobProduct != null) {
                HashMap<String, MobProduct> hashMap = c;
                if (!hashMap.containsKey(mobProduct.getProductTag())) {
                    hashMap.put(mobProduct.getProductTag(), mobProduct);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(boolean z) {
        if (!TextUtils.isEmpty(f3703d)) {
            return f3703d;
        }
        String o2 = com.mob.tools.a.c.a(MobSDK.getContext()).b().o();
        if (TextUtils.isEmpty(o2) && z) {
            o2 = com.mob.tools.a.b.a(MobSDK.getContext()).e("iemt");
        }
        if (!TextUtils.isEmpty(o2)) {
            try {
                String encodeToString = Base64.encodeToString(Data.AES128Encode(Data.MD5(DH.SyncMtd.getManufacturer()), o2), 2);
                f3703d = encodeToString;
                return encodeToString;
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
            }
        }
        return null;
    }

    private static synchronized String a(ArrayList<MobProduct> arrayList, int i2) {
        String str;
        synchronized (w.class) {
            String[] strArr = {""};
            DH.RequestBuilder carrier = DH.requester(MobSDK.getContext()).getMIUIVersion().getNetworkTypeForStatic().getCarrier();
            if (t.b() && i2 != 3) {
                carrier.getDeviceKey();
            } else {
                carrier.getDeviceKeyFromCache(true);
            }
            carrier.request(new DH.DHResponder(i2, arrayList, strArr) { // from class: com.mob.commons.w.2

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ int f3704a;
                public final /* synthetic */ ArrayList b;
                public final /* synthetic */ String[] c;

                @Override // com.mob.tools.utils.DH.DHResponder
                public void onResponse(DH.DHResponse dHResponse) {
                }
            });
            str = strArr[0];
        }
        return str;
    }
}
