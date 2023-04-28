package com.umeng.umcrash;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.observer.IConfigCallback;
import com.efs.sdk.pa.config.IEfsReporter;
import com.uc.crashsdk.export.ICrashClient;
import com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class UMCrash {
    private static final long DEFAULT_PA_TIMEOUT_TIME = 2000;
    private static final boolean DEFAULT_VALUE_CRASH_ANR = true;
    private static final boolean DEFAULT_VALUE_CRASH_JAVA = true;
    private static final boolean DEFAULT_VALUE_CRASH_NATIVE = true;
    private static final boolean DEFAULT_VALUE_CRASH_UNEXP = false;
    private static final boolean DEFAULT_VALUE_H5PAGE = true;
    private static final boolean DEFAULT_VALUE_LAUNCH = true;
    private static final boolean DEFAULT_VALUE_MEM = true;
    private static final boolean DEFAULT_VALUE_NET = true;
    private static final boolean DEFAULT_VALUE_PA = true;
    private static final boolean DEFAULT_VALUE_PAGE = true;
    private static final String INTEGRATIONTESTING_SP = "itconfig";
    private static final String IT_DEBUGKEY = "apm_debugkey";
    private static final String IT_SENDAGING = "apm_sendaging";
    private static final String KEY_ACTIITY_ON_CREATED = "onCreated";
    private static final String KEY_ACTIITY_ON_DESTROYED = "onDestroyed";
    private static final String KEY_ACTIITY_ON_PAUSED = "onPaused";
    private static final String KEY_ACTIITY_ON_RESUMED = "onResumed";
    private static final String KEY_ACTIITY_ON_STARTED = "onStarted";
    private static final String KEY_ACTIITY_ON_STOPPED = "onStopped";
    public static final String KEY_APM_DEFAULT_SECRET = "NEej8y@anWa*8hep";
    public static final String KEY_APM_ROOT_NAME = "UApm";
    public static final String KEY_CALLBACK_PAGE_ACTION = "um_action_log";
    public static final String KEY_CALLBACK_UMID = "um_umid";
    private static final String KEY_CALLBACK_USER_STRING = "um_user_string";
    public static final String KEY_DEBUGKEY = "um_dk";
    public static final String KEY_ENABLE_ANR = "enableANRLog";
    public static final String KEY_ENABLE_CRASH_JAVA = "enableJavaLog";
    public static final String KEY_ENABLE_CRASH_NATIVE = "enableNativeLog";
    public static final String KEY_ENABLE_CRASH_UNEXP = "enableUnexpLog";
    public static final String KEY_ENABLE_H5PAGE = "enableH5PageLog";
    public static final String KEY_ENABLE_LAUNCH = "enableLaunchLog";
    public static final String KEY_ENABLE_MEM = "enableMemLog";
    public static final String KEY_ENABLE_NET = "enableNetLog";
    public static final String KEY_ENABLE_PA = "enablePaLog";
    public static final String KEY_ENABLE_PAGE = "enablePageLog";
    public static final String KEY_HEADER_ACCESS = "um_access";
    public static final String KEY_HEADER_ACCESS_SUBTYPE = "um_access_subtype";
    public static final String KEY_HEADER_APPKEY = "um_app_key";
    public static final String KEY_HEADER_BESRIAL = "um_bserial";
    public static final String KEY_HEADER_BSVER = "um_bsver";
    public static final String KEY_HEADER_BVER = "um_bver";
    public static final String KEY_HEADER_CARRIER = "um_app_carrier";
    public static final String KEY_HEADER_CHANNEL = "um_app_channel";
    public static final String KEY_HEADER_CRASH_VERSION = "um_crash_sdk_version";
    public static final String KEY_HEADER_DEBUGKEY = "um_dk";
    public static final String KEY_HEADER_NETWORK_TYPE = "um_network_type";
    public static final String KEY_HEADER_OS = "um_os";
    public static final String KEY_HEADER_PROVIDER = "um_app_provider";
    public static final String KEY_HEADER_PUID = "um_app_puid";
    public static final String KEY_HEADER_START_TIME = "um_app_start_time";
    public static final String KEY_HEADER_UMID = "um_umid_header";
    private static final int KEY_MAX_LENGTH = 20480;
    private static final int KEY_MAX_LENGTH_128 = 128;
    public static final String KEY_PA_TIMEOUT_TIME = "pa_timeout_time";
    public static final String SP_KEY_DEBUG = "debugkey";
    public static final String SP_KEY_TIMESTAMP = "timestamp";
    private static final String TAG = "UMCrash";
    private static String crashSdkVersion = "1.7.0";
    private static boolean enableANRLog = false;
    private static boolean enableH5PageLog = false;
    private static boolean enableJavaLog = false;
    private static boolean enableLaunchLog = false;
    private static boolean enableMemLog = false;
    private static boolean enableNativeLog = false;
    private static boolean enableNetLog = false;
    private static boolean enablePaLog = false;
    private static boolean enablePageLog = false;
    private static int index = 0;
    private static boolean isBuildId = true;
    private static boolean isDebug = true;
    private static boolean isEncrypt = false;
    private static boolean isIntl = false;
    private static boolean isLa = false;
    private static boolean isNet = false;
    private static boolean isOpenUserCrash = false;
    private static boolean isPA = false;
    private static boolean isPage = false;
    private static boolean isUploadNowUserCrash = false;
    private static boolean isZip = true;
    private static ArrayList<String> mArrayList;
    private static Context mContext;
    private static UMCrashCallback mUMCrashCallback;
    private static long paTimeoutTime;
    private static Object pageArrayLock;
    public static EfsReporter sReporter;
    private static String userBesrial;
    private static String userBsver;
    private static String userBver;

    /* renamed from: com.umeng.umcrash.UMCrash$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class AnonymousClass1 implements Runnable {
        public final /* synthetic */ Context val$context;

        /* renamed from: com.umeng.umcrash.UMCrash$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class C02881 implements UMImprintChangeCallback {
            public final /* synthetic */ AnonymousClass1 this$0;

            public C02881(AnonymousClass1 anonymousClass1) {
            }

            @Override // com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback
            public void onImprintValueChanged(String str, String str2) {
            }
        }

        public AnonymousClass1(Context context) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.umeng.umcrash.UMCrash$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class AnonymousClass2 implements Application.ActivityLifecycleCallbacks {
        public final /* synthetic */ String val$appkey;
        public final /* synthetic */ SharedPreferences val$sharedPreferences;

        public AnonymousClass2(String str, SharedPreferences sharedPreferences) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: com.umeng.umcrash.UMCrash$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class AnonymousClass3 implements Runnable {
        public final /* synthetic */ Context val$context;

        /* renamed from: com.umeng.umcrash.UMCrash$3$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 implements IEfsReporter {
            public final /* synthetic */ AnonymousClass3 this$0;

            public AnonymousClass1(AnonymousClass3 anonymousClass3) {
            }

            @Override // com.efs.sdk.pa.config.IEfsReporter
            public EfsReporter getReporter() {
            }
        }

        public AnonymousClass3(Context context) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.umeng.umcrash.UMCrash$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class AnonymousClass4 implements UMImprintChangeCallback {
        public final /* synthetic */ Context val$context;

        public AnonymousClass4(Context context) {
        }

        @Override // com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback
        public void onImprintValueChanged(String str, String str2) {
        }
    }

    /* renamed from: com.umeng.umcrash.UMCrash$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class AnonymousClass5 implements IConfigCallback {
        public final /* synthetic */ Context val$context;

        public AnonymousClass5(Context context) {
        }

        @Override // com.efs.sdk.base.observer.IConfigCallback
        public void onChange(Map<String, Object> map) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class CrashClientImpl implements ICrashClient {
        private CrashClientImpl() {
        }

        @Override // com.uc.crashsdk.export.ICrashClient
        public void onAddCrashStats(String str, int i2, int i3) {
        }

        @Override // com.uc.crashsdk.export.ICrashClient
        public File onBeforeUploadLog(File file) {
        }

        @Override // com.uc.crashsdk.export.ICrashClient
        public void onClientProcessLogGenerated(String str, File file, String str2) {
        }

        @Override // com.uc.crashsdk.export.ICrashClient
        public void onCrashRestarting(boolean z) {
        }

        @Override // com.uc.crashsdk.export.ICrashClient
        public String onGetCallbackInfo(String str, boolean z) {
        }

        @Override // com.uc.crashsdk.export.ICrashClient
        public void onLogGenerated(File file, String str) {
        }

        public /* synthetic */ CrashClientImpl(AnonymousClass1 anonymousClass1) {
        }
    }

    public static /* synthetic */ ArrayList access$000() {
    }

    public static /* synthetic */ boolean access$100() {
    }

    public static /* synthetic */ long access$1000() {
    }

    public static /* synthetic */ boolean access$1102(boolean z) {
    }

    public static /* synthetic */ void access$1200(Context context, Map map) {
    }

    public static /* synthetic */ void access$1300(Context context, Map map) {
    }

    public static /* synthetic */ boolean access$1402(boolean z) {
    }

    public static /* synthetic */ boolean access$200() {
    }

    public static /* synthetic */ String access$300() {
    }

    public static /* synthetic */ Context access$400() {
    }

    public static /* synthetic */ String access$500(Context context) {
    }

    public static /* synthetic */ UMCrashCallback access$600() {
    }

    public static /* synthetic */ void access$800(String str, String str2) {
    }

    public static /* synthetic */ int access$900() {
    }

    public static /* synthetic */ int access$908() {
    }

    public static /* synthetic */ int access$910() {
    }

    @Deprecated
    public static void enableANRLog(boolean z) {
    }

    public static void enableJavaScriptBridge(WebView webView) {
    }

    @Deprecated
    public static void enableMemoryMonitor(boolean z) {
    }

    @Deprecated
    public static void enableNativeLog(boolean z) {
    }

    public static void generateCustomLog(Throwable th, String str) {
    }

    public static EfsReporter getReporter() {
    }

    public static String getUMAPMFlag() {
    }

    private static synchronized String getUMID(Context context) {
    }

    public static void init(Context context, String str, String str2) {
    }

    public static void initConfig(Bundle bundle) {
    }

    private static void initReporter(Context context, String str, String str2) {
    }

    public static void isBuildId(boolean z) {
    }

    public static void registerUMCrashCallback(UMCrashCallback uMCrashCallback) {
    }

    private static void saveActivityState(String str, String str2) {
    }

    private static void saveLocalCrashSampling(Context context, Map<String, Object> map) {
    }

    public static void setAppVersion(String str, String str2, String str3) {
    }

    public static void setDebug(boolean z) {
    }

    public static void setPaTimeoutTime(long j2) {
    }

    private static void updateLocalCrashConfig(Context context, Map<String, Object> map) {
    }

    private static void updateLocalCrashSampling(Object obj, Object obj2, Object obj3, Object obj4) {
    }

    private static void useIntlServices(boolean z) {
    }

    public static void enableJavaScriptBridge(View view) {
    }

    public static void generateCustomLog(String str, String str2) {
    }
}
