package com.mob.commons;

import android.text.TextUtils;
import com.mob.MobSDK;
import com.mob.tools.MobLog;
import com.mob.tools.utils.FileLocker;
import com.mob.tools.utils.ResHelper;
import java.io.File;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    public static final String f3641a;
    public static final String b;
    public static final String c;

    /* renamed from: d  reason: collision with root package name */
    public static final String f3642d;

    /* renamed from: e  reason: collision with root package name */
    public static final String f3643e;

    /* renamed from: f  reason: collision with root package name */
    public static final String f3644f;

    /* renamed from: g  reason: collision with root package name */
    public static final String f3645g;

    /* renamed from: h  reason: collision with root package name */
    public static final Object f3646h;

    /* renamed from: i  reason: collision with root package name */
    public static final Object f3647i;

    /* renamed from: j  reason: collision with root package name */
    private static final String f3648j;

    static {
        String a2 = com.mob.commons.a.o.a("011Tehfd*mmhYfefdehekghFh");
        f3648j = a2;
        f3641a = a2 + ".mrlock";
        b = a2 + com.mob.commons.a.o.a("007(fm_id7fefdehek");
        c = a2 + com.mob.commons.a.o.a("011[fmggfefdgdegfeflfdehek");
        f3642d = a2 + com.mob.commons.a.o.a("008:fmUiXejeefefdehek");
        f3643e = a2 + com.mob.commons.a.o.a("008Gfm6iNgheefefdehek");
        f3644f = a2 + ".cl_lock";
        f3645g = a2 + ".gcf_lock";
        f3646h = new Object();
        f3647i = new Object();
    }

    public static synchronized File a(String str) {
        File dataCacheFile;
        synchronized (m.class) {
            dataCacheFile = ResHelper.getDataCacheFile(MobSDK.getContext(), str, true);
        }
        return dataCacheFile;
    }

    private static String b(String str) {
        if (!TextUtils.isEmpty(str)) {
            String str2 = c;
            if (str.endsWith(str2)) {
                return str2;
            }
            String str3 = b;
            if (str.endsWith(str3)) {
                return str3;
            }
            String str4 = f3642d;
            if (str.endsWith(str4)) {
                return str4;
            }
            String str5 = f3643e;
            if (str.endsWith(str5)) {
                return str5;
            }
            String str6 = f3644f;
            if (str.endsWith(str6)) {
                return str6;
            }
            String str7 = f3645g;
            if (str.endsWith(str7)) {
                return str7;
            }
        }
        return str;
    }

    public static boolean a(File file, l lVar) {
        return a(file, true, lVar);
    }

    public static boolean a(File file, boolean z, l lVar) {
        try {
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            if (!file.exists()) {
                file.createNewFile();
            }
            String absolutePath = file.getAbsolutePath();
            synchronized (b(absolutePath)) {
                FileLocker fileLocker = new FileLocker();
                fileLocker.setLockFile(absolutePath);
                if (fileLocker.lock(z)) {
                    if (!lVar.a(fileLocker)) {
                        fileLocker.release();
                    }
                    return true;
                }
                return false;
            }
        } catch (Throwable th) {
            MobLog.getInstance().w(th);
            return true;
        }
    }
}
