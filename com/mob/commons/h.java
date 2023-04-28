package com.mob.commons;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.mob.MobSDK;
import com.mob.tools.MobLog;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.HashonHelper;
import com.mob.tools.utils.ResHelper;
import com.tencent.qcloud.tuicore.TUIThemeManager;
import com.umeng.analytics.pro.am;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import net.sourceforge.pinyin4j.ChineseToPinyinResource;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class h {
    private static h b = new h();
    private volatile boolean c = false;

    /* renamed from: d  reason: collision with root package name */
    private volatile long f3624d = 0;

    /* renamed from: e  reason: collision with root package name */
    private final ConcurrentHashMap<String, Object> f3625e = new ConcurrentHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f3623a = new AtomicBoolean(false);

    private h() {
    }

    private boolean d() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        DH.requester(MobSDK.getContext()).getCarrier().request(new DH.DHResponder(this, linkedBlockingQueue) { // from class: com.mob.commons.h.2

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ LinkedBlockingQueue f3627a;
            public final /* synthetic */ h b;

            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
            }
        });
        try {
            return ((Boolean) linkedBlockingQueue.poll(120L, TimeUnit.MILLISECONDS)).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public boolean b() {
        return a(false);
    }

    public ConcurrentHashMap<String, Object> c() {
        return this.f3625e;
    }

    private synchronized boolean b(boolean z) {
        long longValue;
        String str;
        try {
            if (z) {
                HashMap fromJson = HashonHelper.fromJson(x.a().d());
                if (fromJson.isEmpty()) {
                    fromJson = HashonHelper.fromJson(x.a().c());
                }
                longValue = ((Long) ResHelper.forceCast(fromJson.get(p.a("004iQdgQi8dl")), 5L)).longValue() * 1000;
                str = (String) ResHelper.forceCast(fromJson.get(p.a("002RdgAh")), p.a("0068gkgkglglglgl"));
            } else {
                longValue = ((Long) b.a(p.a("004iLdg:i8dl"), 5L)).longValue() * 1000;
                str = (String) b.a(p.a("002)dgEh"), p.a("0060gkgkglglglgl"));
            }
            if (this.f3624d != 0 && System.currentTimeMillis() - this.f3624d <= longValue) {
                return this.c;
            }
            boolean a2 = a(str);
            if (this.f3624d == 0 || a2 != this.c) {
                c(a2);
            }
            this.f3624d = System.currentTimeMillis();
            this.c = a2;
            return a2;
        } catch (Throwable th) {
            MobLog.getInstance().e(th);
            return true;
        }
    }

    private void c(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put(p.a("005Mdged3i_dfdh"), Integer.valueOf(!z ? 1 : 0));
        hashMap.put(p.a("002!dcdg"), ResHelper.forceCast(this.f3625e.get(p.a("002!dcdg")), 0));
        hashMap.put(p.a("002$dcNh"), ResHelper.forceCast(this.f3625e.get(p.a("002$dcNh")), 0));
        hashMap.put(p.a("002je"), ResHelper.forceCast(this.f3625e.get(p.a("002je")), 0));
        hashMap.put(p.a("002KfdAe"), ResHelper.forceCast(this.f3625e.get(p.a("002KfdAe")), 0));
        hashMap.put(p.a("002-dh'd"), ResHelper.forceCast(this.f3625e.get(p.a("002-dh'd")), 0));
        hashMap.put(p.a("0022dl;e"), ResHelper.forceCast(this.f3625e.get(p.a("0022dl;e")), 0));
        long currentTimeMillis = System.currentTimeMillis();
        HashMap<String, Object> hashMap2 = new HashMap<>();
        hashMap2.put(p.a("004d?di]ei"), "ECMT");
        hashMap2.put(p.a("004hGdf,dGdf"), hashMap);
        hashMap2.put(p.a("008hCdfOdid3deQli"), Long.valueOf(currentTimeMillis));
        d.a().a(currentTimeMillis, hashMap2);
    }

    public static h a() {
        return b;
    }

    public synchronized boolean a(boolean z) {
        return !b(z);
    }

    private boolean a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            char[] charArray = str.toCharArray();
            HashMap hashMap = new HashMap();
            boolean z = false;
            for (int i2 = 0; i2 < charArray.length; i2++) {
                if (charArray[i2] == '1') {
                    z |= a(i2);
                } else if (charArray[i2] != '0') {
                    List list = (List) hashMap.get(Character.valueOf(charArray[i2]));
                    if (list == null) {
                        list = new ArrayList();
                    }
                    list.add(Integer.valueOf(i2));
                    hashMap.put(Character.valueOf(charArray[i2]), list);
                }
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                boolean z2 = true;
                for (Integer num : (List) entry.getValue()) {
                    z2 &= a(num.intValue());
                }
                z |= z2;
            }
            return z;
        } catch (Throwable th) {
            MobLog.getInstance().e(th);
            return true;
        }
    }

    private boolean b(List<String> list) {
        DH.RequestBuilder requester = DH.requester(MobSDK.getContext());
        if (list == null || list.size() == 0) {
            return false;
        }
        for (String str : list) {
            requester.isPackageInstalled(str);
        }
        boolean[] zArr = {false};
        requester.request(new DH.DHResponder(this, list, zArr) { // from class: com.mob.commons.h.4

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ List f3629a;
            public final /* synthetic */ boolean[] b;
            public final /* synthetic */ h c;

            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
            }
        });
        return zArr[0];
    }

    private boolean a(int i2) {
        boolean[] zArr = {true};
        DH.RequestBuilder requester = DH.requester(MobSDK.getContext());
        if (i2 == 0) {
            requester.checkUA();
        } else if (i2 == 1) {
            requester.usbEnable();
        } else if (i2 == 2) {
            requester.vpn();
        } else if (i2 == 3) {
            requester.isWifiProxy();
        } else if (i2 == 4) {
            requester.isRooted();
        } else if (i2 == 5) {
            requester.cx();
        }
        requester.request(new DH.DHResponder(this, i2, zArr) { // from class: com.mob.commons.h.1

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f3626a;
            public final /* synthetic */ boolean[] b;
            public final /* synthetic */ h c;

            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
            }
        });
        return zArr[0];
    }

    public boolean a(HashMap<String, Object> hashMap) {
        try {
            List<String> list = (List) ResHelper.forceCast(hashMap.get("j"), null);
            if (list != null && list.size() > 0) {
                boolean z = false;
                for (String str : list) {
                    if (str.contains(ChineseToPinyinResource.Field.COMMA)) {
                        boolean z2 = true;
                        for (String str2 : str.split(ChineseToPinyinResource.Field.COMMA)) {
                            z2 &= a(str2, hashMap);
                        }
                        z |= z2;
                    } else {
                        z |= a(str, hashMap);
                    }
                }
                this.f3625e.put(p.a("006QffNeHdddh9i@fg"), Boolean.valueOf(z ? false : true));
                return !z;
            }
        } catch (Throwable th) {
            MobLog.getInstance().e(th);
        }
        return true;
    }

    private boolean a(String str, HashMap<String, Object> hashMap) {
        if (TextUtils.equals(str, "a")) {
            return ((Integer) ResHelper.forceCast(hashMap.get("a"), 0)).intValue() == 1 && d();
        } else if (TextUtils.equals(str, "p")) {
            return b((List) ResHelper.forceCast(hashMap.get("p"), null));
        } else {
            if (TextUtils.equals(str, "fp")) {
                return b((List) ResHelper.forceCast(hashMap.get("fp"), null));
            }
            if (TextUtils.equals(str, am.aB)) {
                return a((List) ResHelper.forceCast(hashMap.get(am.aB), null));
            }
            if (TextUtils.equals(str, "fs")) {
                return a((List) ResHelper.forceCast(hashMap.get("fs"), null));
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(Context context) {
        Locale locale = context.getResources().getConfiguration().locale;
        return locale.getLanguage().startsWith(TUIThemeManager.LANGUAGE_ZH_CN) && TextUtils.equals(locale.getCountry(), "CN");
    }

    private boolean a(List<String> list) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        if (list != null && list.size() > 0) {
            DH.RequestBuilder requester = DH.requester(MobSDK.getContext());
            for (int i2 = 0; i2 < list.size(); i2++) {
                try {
                    requester.queryIntentServices(new Intent(list.get(i2)), 0);
                } catch (Throwable th) {
                    MobLog.getInstance().d(th);
                }
            }
            requester.request(new DH.DHResponder(this, list, linkedBlockingQueue) { // from class: com.mob.commons.h.3

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ List f3628a;
                public final /* synthetic */ LinkedBlockingQueue b;
                public final /* synthetic */ h c;

                @Override // com.mob.tools.utils.DH.DHResponder
                public void onResponse(DH.DHResponse dHResponse) {
                }
            });
        }
        try {
            return ((Boolean) linkedBlockingQueue.poll(150L, TimeUnit.MILLISECONDS)).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public void a(HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2, HashMap<String, Object> hashMap3) {
        try {
            Object obj = this.f3625e.get(p.a("006il>dddh4i$fg"));
            Boolean bool = Boolean.FALSE;
            boolean booleanValue = ((Boolean) ResHelper.forceCast(obj, bool)).booleanValue();
            boolean booleanValue2 = ((Boolean) ResHelper.forceCast(this.f3625e.get(p.a("006!ff e?dddhMi-fg")), bool)).booleanValue();
            HashMap hashMap4 = new HashMap(4);
            hashMap4.put(p.a("003)dhXiIfg"), Boolean.valueOf(booleanValue));
            if (!booleanValue && hashMap2 != null) {
                hashMap4.put(p.a("003Ofgde9h"), ResHelper.forceCast(hashMap2.get(p.a("003Ofgde9h")), null));
                hashMap4.put(p.a("003;dhdeXh"), ResHelper.forceCast(hashMap2.get(p.a("003;dhdeXh")), null));
            } else {
                hashMap4.put(p.a("003@fgde^h"), ResHelper.forceCast(hashMap.get(p.a("003@fgde^h")), null));
                hashMap4.put(p.a("003=dhdeWh"), ResHelper.forceCast(hashMap.get(p.a("003=dhdeWh")), null));
            }
            this.f3625e.put(p.a("006il1dddh%iYfg"), HashonHelper.fromHashMap(hashMap4));
            if (booleanValue) {
                HashMap hashMap5 = new HashMap(4);
                hashMap5.put(p.a("0031dhBiOfg"), Boolean.valueOf(booleanValue2));
                if (!booleanValue2 && hashMap3 != null) {
                    hashMap5.put(p.a("003<fgdeEh"), ResHelper.forceCast(hashMap3.get(p.a("003<fgdeEh")), null));
                    hashMap5.put(p.a("003DdhdeRh"), ResHelper.forceCast(hashMap3.get(p.a("003DdhdeRh")), null));
                } else {
                    hashMap5.put(p.a("003@fgde,h"), ResHelper.forceCast(hashMap.get(p.a("003@fgde,h")), null));
                    hashMap5.put(p.a("003.dhdeDh"), ResHelper.forceCast(hashMap.get(p.a("003.dhdeDh")), null));
                }
                this.f3625e.put(p.a("006^ffMe%dddh4i1fg"), HashonHelper.fromHashMap(hashMap5));
            }
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
        }
    }
}
