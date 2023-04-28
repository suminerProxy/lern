package com.tencent.android.tpush.service.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.tencent.android.tpush.data.RegisterEntity;
import com.tencent.android.tpush.service.cache.CacheManager;
import com.tencent.tpns.dataacquisition.CustomDeviceInfos;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static volatile c f9034a;
    private Context b;
    private Map<String, String> c = new HashMap(10);

    /* renamed from: d  reason: collision with root package name */
    private Map<Long, String> f9035d = new HashMap(10);

    private c(Context context) {
        this.b = null;
        this.b = context.getApplicationContext();
        this.f9035d.put(-1L, "");
    }

    public static c a(Context context) {
        if (f9034a == null) {
            synchronized (c.class) {
                if (f9034a == null) {
                    f9034a = new c(context);
                }
            }
        }
        return f9034a;
    }

    public String a(long j2) {
        if (this.f9035d.containsKey(Long.valueOf(j2))) {
            return this.f9035d.get(Long.valueOf(j2));
        }
        List<String> registerInfos = CacheManager.getRegisterInfos(this.b);
        if (registerInfos != null) {
            for (String str : registerInfos) {
                RegisterEntity registerInfoByPkgName = CacheManager.getRegisterInfoByPkgName(str);
                if (registerInfoByPkgName != null) {
                    this.f9035d.put(Long.valueOf(registerInfoByPkgName.accessId), a(str));
                }
            }
        }
        return this.f9035d.get(Long.valueOf(j2)) == null ? "" : this.f9035d.get(Long.valueOf(j2));
    }

    public String a(String str) {
        if (str == null) {
            return "";
        }
        if (this.c.containsKey(str)) {
            return this.c.get(str);
        }
        List<PackageInfo> appPackages = CustomDeviceInfos.getAppPackages(this.b);
        if (appPackages != null) {
            for (PackageInfo packageInfo : appPackages) {
                if (str.equals(packageInfo.packageName)) {
                    this.c.put(str, packageInfo.versionName);
                    return packageInfo.versionName;
                }
            }
        }
        return "";
    }
}
