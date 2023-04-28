package com.tencent.tpns.baseapi.base.util;

import android.content.Context;
import com.tencent.tpns.baseapi.base.PushPreferences;
import com.tencent.tpns.baseapi.base.logger.TBaseLogger;
import com.tencent.tpns.dataacquisition.DeviceInfos;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TGlobalHelper {

    /* renamed from: a  reason: collision with root package name */
    private static Context f13666a;
    private static volatile String b;
    public static String curProcessName;

    private static synchronized String a() {
        synchronized (TGlobalHelper.class) {
            if (b != null) {
                return b;
            }
            b = DeviceInfos.getDM();
            return b;
        }
    }

    public static Context getContext(Context context) {
        if (f13666a == null) {
            f13666a = context;
        }
        return f13666a;
    }

    public static synchronized String getDM(Context context) {
        synchronized (TGlobalHelper.class) {
            if (b != null) {
                return b;
            }
            if (context == null) {
                context = f13666a;
            }
            if (!Util.isMainProcess(context)) {
                b = (String) PushPreferences.getObject(context, "dm", "");
            } else {
                b = DeviceInfos.getDM();
            }
            if (b == null) {
                b = "";
            }
            return b;
        }
    }

    public static Object loadWithIPC(String str) {
        if (Util.isNullOrEmptyString(str)) {
            return null;
        }
        if ("dm".equals(str)) {
            return a();
        }
        TBaseLogger.d("TGlobalHelper", "don't support type");
        return null;
    }

    public static void setContext(Context context) {
        f13666a = context;
    }
}
