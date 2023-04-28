package com.tencent.android.tpush.stat.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.tencent.android.tpush.InnerTpnsActivity;
import com.tencent.android.tpush.TpnsActivity;
import com.tencent.android.tpush.common.i;
import com.tencent.android.tpush.logging.TLogger;
import com.tencent.android.tpush.service.util.b;
import com.tencent.android.tpush.stat.ServiceStat;
import com.tencent.tpns.baseapi.base.PushPreferences;
import com.tencent.tpns.baseapi.base.device.GuidInfoManager;
import com.tencent.tpns.baseapi.base.util.CloudManager;
import com.tencent.tpns.baseapi.base.util.CommonWorkingThread;
import com.tencent.tpns.baseapi.base.util.TTask;
import com.tencent.tpns.baseapi.base.util.Util;
import java.util.Set;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class a extends TTask {

    /* renamed from: a  reason: collision with root package name */
    private static long f9078a;
    private static long b;

    /* renamed from: g  reason: collision with root package name */
    private static String f9079g;

    /* renamed from: h  reason: collision with root package name */
    private static volatile boolean f9080h;

    /* renamed from: i  reason: collision with root package name */
    private static a f9081i;
    private Intent c;

    /* renamed from: d  reason: collision with root package name */
    private String f9082d;

    /* renamed from: e  reason: collision with root package name */
    private Context f9083e;

    /* renamed from: f  reason: collision with root package name */
    private int f9084f;

    public a(Context context, Intent intent, String str, int i2) {
        super("AppLaunchTask");
        this.c = intent;
        this.f9082d = str;
        this.f9083e = context;
        this.f9084f = i2;
    }

    private void a() {
        Context context = this.f9083e;
        if (i.c(context, context.getPackageName()) && PushPreferences.getBoolean(this.f9083e, "app_first_launch", true)) {
            ServiceStat.reportCustomData4FirstLaunch(this.f9083e);
            PushPreferences.putBoolean(this.f9083e, "app_first_launch", false);
        }
    }

    private void b() {
        if (!CloudManager.getInstance(this.f9083e).disableRepLanuEv()) {
            int i2 = 4;
            long j2 = 0;
            if (!TextUtils.equals(this.f9082d, TpnsActivity.class.getCanonicalName()) && !TextUtils.equals(this.f9082d, InnerTpnsActivity.class.getCanonicalName())) {
                Intent intent = this.c;
                if (intent != null) {
                    Uri data = intent.getData();
                    if (data == null || i.b(data.getHost())) {
                        String action = this.c.getAction();
                        Set<String> categories = this.c.getCategories();
                        boolean z = categories != null && categories.contains("android.intent.category.LAUNCHER");
                        if (TextUtils.equals(action, "android.intent.action.MAIN") && z) {
                            i2 = 1;
                        }
                    } else {
                        i2 = 2;
                    }
                }
            } else {
                i2 = 3;
                j2 = TpnsActivity.getMsgIdWithIntent(this.c);
            }
            ServiceStat.reportLaunchEvent(this.f9083e, i2, b(this.f9083e), j2);
            return;
        }
        TLogger.d("AppLaunchTask", "disabled report launch event");
    }

    private static synchronized int c() {
        synchronized (a.class) {
            long currentTimeMillis = System.currentTimeMillis() - f9078a;
            long j2 = b;
            if (j2 != 0 || currentTimeMillis <= 30000) {
                return (j2 != 0 || currentTimeMillis <= 8000) ? -1 : 1;
            }
            return 2;
        }
    }

    @Override // com.tencent.tpns.baseapi.base.util.TTask
    public void TRun() {
        Context context = this.f9083e;
        if (context == null) {
            TLogger.d("AppLaunchTask", "context was null");
        } else if (i.a(context) > 0) {
            TLogger.d("AppLaunchTask", "TPNS init failed!");
        } else {
            if (this.f9084f == 2) {
                a();
                b();
            }
            b.a(this.f9083e, true);
        }
    }

    private static boolean a(Context context) {
        if (context == null) {
            return false;
        }
        if (i.b(f9079g)) {
            String token = GuidInfoManager.getToken(context.getApplicationContext());
            f9079g = token;
            return !i.b(token);
        }
        return true;
    }

    public static void a(Context context, String str, String str2) {
        try {
            if (i.b(str)) {
                TLogger.d("AppLaunchTask", "token was null");
            } else if (context == null) {
                TLogger.d("AppLaunchTask", "context was null");
            } else if (!Util.isMainProcess(context)) {
                TLogger.d("AppLaunchTask", "must run at main process");
            } else {
                f9079g = str;
                if (!f9080h || f9081i == null) {
                    return;
                }
                CommonWorkingThread.getInstance().execute(f9081i);
                f9080h = false;
                f9081i = null;
            }
        } catch (Throwable unused) {
        }
    }

    public static void b(Activity activity, String str) {
        try {
            if (activity == null) {
                TLogger.w("AppLaunchTask", "onActivityEntry - activity was null, reason:" + str);
                return;
            }
            int c = c();
            if (!a(activity)) {
                if (c == 2) {
                    f9080h = true;
                    f9081i = a(activity, str, c);
                    return;
                }
                return;
            }
            if (c > 0) {
                b(activity, str, c);
            }
            if (b == 0) {
                b = System.currentTimeMillis();
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(Activity activity, String str) {
        try {
            if (activity == null) {
                TLogger.w("AppLaunchTask", "onActivityExits - activity was null, reason:" + str);
                return;
            }
            f9078a = System.currentTimeMillis();
            if (b != 0) {
                b = 0L;
            }
        } catch (Throwable unused) {
        }
    }

    private static void b(Activity activity, String str, int i2) {
        try {
            a a2 = a(activity, str, i2);
            if (a2 != null) {
                CommonWorkingThread.getInstance().execute(a2);
            }
            f9081i = null;
            f9080h = false;
        } catch (Throwable th) {
            TLogger.d("AppLaunchTask", "unexpected for runAppLaunch:" + th.getMessage());
        }
    }

    private static a a(Activity activity, String str, int i2) {
        if (activity == null) {
            TLogger.d("AppLaunchTask", "runAppLaunch - activity was null");
            return null;
        }
        String className = activity.getComponentName().getClassName();
        return new a(activity.getApplicationContext(), activity.getIntent(), className, i2);
    }

    private int b(Context context) {
        long j2 = PushPreferences.getLong(context, "fisrt.launch.of.the.day", 0L);
        long currentTimeMillis = System.currentTimeMillis();
        boolean a2 = i.a(currentTimeMillis, j2);
        if (!a2) {
            PushPreferences.putLong(context, "fisrt.launch.of.the.day", currentTimeMillis);
        }
        return !a2 ? 1 : 0;
    }
}
