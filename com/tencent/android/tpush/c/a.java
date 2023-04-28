package com.tencent.android.tpush.c;

import android.content.Context;
import com.tencent.android.tpush.logging.TLogger;
import com.tencent.tpns.baseapi.base.util.ChannelUtils;
import java.lang.reflect.InvocationTargetException;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f8617a = {"com.tencent.android.tpush.otherpush.mipush.impl.OtherPushImpl", "com.tencent.android.tpush.otherpush.fcm.impl.OtherPushImpl"};
    private static int b = -2;
    private static String c = null;

    /* renamed from: d  reason: collision with root package name */
    private static int f8618d = -1;

    public static boolean a(Context context) {
        if (b == -2) {
            int i2 = 0;
            while (true) {
                String[] strArr = f8617a;
                if (i2 < strArr.length) {
                    try {
                        Class.forName(strArr[i2]);
                    } catch (ClassNotFoundException unused) {
                    }
                    if (a(context, strArr[i2])) {
                        b = i2;
                        c = strArr[i2];
                        return true;
                    }
                    i2++;
                } else {
                    b = -1;
                    break;
                }
            }
        }
        return b > -1;
    }

    public static void b(Context context, String str) {
        a(context, str, "com.tencent.android.tpush.otherpush.fcm.impl.OtherPushImpl");
    }

    public static boolean a(Context context, String str) {
        try {
            TLogger.ii("OtherPush", "checkDevice pushClassName" + str);
            Class<?> cls = Class.forName(str);
            return ((Boolean) cls.getMethod("checkDevice", Context.class).invoke(cls, context)).booleanValue();
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            TLogger.ee("OtherPush", "checkDevice Error for InvocationTargetException: " + cause.getMessage());
            cause.printStackTrace();
            return false;
        } catch (Throwable th) {
            TLogger.ee("OtherPush", "checkDevice Error, are you import otherpush package? " + th);
            return false;
        }
    }

    private static void a(Context context, String str, String str2) {
        try {
            Class<?> cls = Class.forName(str2);
            cls.getMethod("setAppid", Context.class, String.class).invoke(cls, context, str);
        } catch (Throwable th) {
            TLogger.ww("OtherPush", "setAppid Error, are you import otherpush package? " + th);
        }
    }

    public static int a() {
        if (f8618d == -1) {
            if (!ChannelUtils.isBrandHuaWei() && !ChannelUtils.isBrandHonor()) {
                f8618d = 0;
            } else {
                try {
                    try {
                        Class.forName("com.huawei.hms.aaid.HmsInstanceId");
                        f8618d = 4;
                    } catch (Throwable unused) {
                        Class.forName("com.huawei.android.hms.agent.HMSAgent");
                        f8618d = 2;
                    }
                } catch (Throwable unused2) {
                    f8618d = 0;
                }
            }
        }
        return f8618d;
    }
}
