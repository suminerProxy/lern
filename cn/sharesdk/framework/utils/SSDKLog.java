package cn.sharesdk.framework.utils;

import cn.sharesdk.framework.ShareSDK;
import com.mob.commons.logcollector.DefaultLogsCollector;
import com.mob.tools.log.NLog;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class SSDKLog {

    /* renamed from: a  reason: collision with root package name */
    private static SSDKLog f212a;
    private static NLog b;
    private final int c = -1;

    private SSDKLog() {
        a();
    }

    public static NLog a() {
        b = NLog.getInstance(ShareSDK.SDK_TAG);
        DefaultLogsCollector.get().addSDK(ShareSDK.SDK_TAG, ShareSDK.SDK_VERSION_CODE);
        return b;
    }

    private boolean a(NLog nLog) {
        return nLog != null;
    }

    public static SSDKLog b() {
        if (f212a == null) {
            f212a = new SSDKLog();
        }
        return f212a;
    }

    public final int c(Throwable th) {
        try {
            if (a(b)) {
                return b.log(4, th);
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public final int d(Throwable th) {
        try {
            if (a(b)) {
                return b.log(6, th);
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public final int c(Object obj, Object... objArr) {
        try {
            if (a(b)) {
                return b.log(4, obj, objArr);
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public final int d(Object obj, Object... objArr) {
        try {
            if (a(b)) {
                return b.log(6, obj, objArr);
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public final int a(Throwable th) {
        try {
            if (a(b)) {
                return b.log(3, th);
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public final int b(Throwable th) {
        try {
            if (a(b)) {
                return b.log(5, th);
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public final int a(Object obj, Object... objArr) {
        try {
            if (a(b)) {
                return b.log(3, obj, objArr);
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public final int b(Object obj, Object... objArr) {
        try {
            if (a(b)) {
                return b.log(5, obj, objArr);
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public final int a(Throwable th, Object obj, Object... objArr) {
        try {
            if (a(b)) {
                return b.log(3, th, obj, objArr);
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public final int b(Throwable th, Object obj, Object... objArr) {
        try {
            if (a(b)) {
                return b.log(5, th, obj, objArr);
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public final int a(String str) {
        try {
            if (a(b)) {
                return b.log(5, str, new Object[0]);
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public final int b(String str) {
        try {
            if (a(b)) {
                return b.log(4, str, new Object[0]);
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }
}
