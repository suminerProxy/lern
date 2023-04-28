package com.efs.sdk.launch;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.efs.sdk.base.EfsReporter;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class LaunchManager {
    public static final String APP_ATTACH_BASE_CONTEXT = "app_attachBaseContext";
    public static final String APP_CONSTRUCT = "app_<init>";
    public static final String APP_ON_CREATE = "app_onCreate";
    public static final String PAGE_ON_CREATE = "page_onCreate";
    public static final String PAGE_ON_RESUME = "page_onResume";
    public static final String PAGE_ON_RE_START = "page_onReStart";
    public static final String PAGE_ON_START = "page_onStart";
    public static final String PAGE_ON_STOP = "page_onStop";
    public static final String PAGE_ON_WINDOW = "page_on_window";

    /* renamed from: a  reason: collision with root package name */
    private static LaunchConfigManager f3148a = null;
    private static Context b = null;
    private static EfsReporter c = null;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f3149d = false;
    public static boolean isDebug = true;

    /* renamed from: com.efs.sdk.launch.LaunchManager$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass1 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f3150a;

        public AnonymousClass1(Context context) {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    public static LaunchConfigManager getLaunchConfigManager() {
    }

    public static EfsReporter getReporter() {
    }

    public static void init(Context context, EfsReporter efsReporter) {
    }

    public static boolean isInit() {
    }

    public static void onTraceApp(Application application, String str, boolean z) {
    }

    public static void onTraceBegin(Context context, String str, long j2) {
    }

    public static void onTraceEnd(Context context, String str, long j2) {
    }

    public static void onTracePage(Activity activity, String str, boolean z) {
    }

    public static void sendLaunchCache(Context context, String str) {
    }
}
