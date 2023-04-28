package com.umeng.commonsdk;

import android.content.Context;
import com.umeng.analytics.MobclickAgent;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.listener.OnGetOaidListener;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class UMConfigure {
    public static MobclickAgent.PageMode AUTO_ACTIVITY_PAGE_COLLECTION = null;
    private static final String[] BUSINESS_TYPE = null;
    public static final int DEVICE_TYPE_BOX = 2;
    public static final int DEVICE_TYPE_PHONE = 1;
    private static final String KEY_FILE_NAME_APPKEY = "APPKEY";
    private static final String KEY_FILE_NAME_LOG = "LOG";
    private static final String KEY_METHOD_NAME_PUSH_SETCHANNEL = "setMessageChannel";
    private static final String KEY_METHOD_NAME_PUSH_SET_SECRET = "setSecret";
    private static final String KEY_METHOD_NAME_SETAPPKEY = "setAppkey";
    private static final String KEY_METHOD_NAME_SETCHANNEL = "setChannel";
    private static final String KEY_METHOD_NAME_SETDEBUGMODE = "setDebugMode";
    private static Object PreInitLock = null;
    private static final String TAG = "UMConfigure";
    private static final String WRAPER_TYPE_COCOS2DX_X = "Cocos2d-x";
    private static final String WRAPER_TYPE_COCOS2DX_XLUA = "Cocos2d-x_lua";
    private static final String WRAPER_TYPE_FLUTTER = "flutter";
    private static final String WRAPER_TYPE_HYBRID = "hybrid";
    private static final String WRAPER_TYPE_NATIVE = "native";
    private static final String WRAPER_TYPE_PHONEGAP = "phonegap";
    private static final String WRAPER_TYPE_REACTNATIVE = "react-native";
    private static final String WRAPER_TYPE_UNITY = "Unity";
    private static final String WRAPER_TYPE_WEEX = "weex";
    private static boolean debugLog;
    private static boolean isFinish;
    public static boolean isInit;
    private static Object lock;
    private static Object lockObject;
    private static OnGetOaidListener mOnGetOaidListener;
    private static int policyGrantInvokedFlag;
    private static int policyGrantResult;
    private static boolean preInitComplete;
    private static int preInitInvokedFlag;
    public static String sAppkey;
    public static String sChannel;
    private static boolean shouldCheckShareSdk;
    public static UMLog umDebugLog;

    /* renamed from: com.umeng.commonsdk.UMConfigure$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class AnonymousClass1 extends Thread {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f15086a;

        public AnonymousClass1(Context context) {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.umeng.commonsdk.UMConfigure$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class AnonymousClass2 extends Thread {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f15087a;

        public AnonymousClass2(Context context) {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.umeng.commonsdk.UMConfigure$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class AnonymousClass3 extends Thread {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f15088a;

        public AnonymousClass3(Context context) {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.umeng.commonsdk.UMConfigure$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class AnonymousClass4 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f15089a;

        public AnonymousClass4(Context context) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class BS_TYPE {
        public static final BS_TYPE ABTEST = null;
        public static final BS_TYPE APM = null;
        public static final BS_TYPE GAME = null;
        public static final BS_TYPE PUSH = null;
        public static final BS_TYPE SHARE = null;
        public static final BS_TYPE ULINK = null;
        public static final BS_TYPE UREC = null;
        public static final BS_TYPE USMS = null;
        public static final BS_TYPE UVERIFY = null;
        public static final BS_TYPE ZID = null;

        /* renamed from: a  reason: collision with root package name */
        private static final /* synthetic */ BS_TYPE[] f15090a = null;

        private BS_TYPE(String str, int i2) {
        }

        public static BS_TYPE valueOf(String str) {
        }

        public static BS_TYPE[] values() {
        }
    }

    public static /* synthetic */ OnGetOaidListener access$000() {
    }

    private static boolean checkShareSdk(Class<?> cls) {
    }

    private static void deleteModuleTag(BS_TYPE bs_type, String str) {
    }

    private static Class<?> getClass(String str) {
    }

    private static Object getDecInstanceObject(Class<?> cls) {
    }

    private static Method getDecMethod(Class<?> cls, String str, Class<?>[] clsArr) {
    }

    public static boolean getInitStatus() {
    }

    private static Map<String, String> getModuleTags() {
    }

    public static void getOaid(Context context, OnGetOaidListener onGetOaidListener) {
    }

    public static String[] getTestDeviceInfo(Context context) {
    }

    public static String getUMIDString(Context context) {
    }

    public static String getUmengZID(Context context) {
    }

    private static void ignoreSdkCheck(Context context) {
    }

    public static void init(Context context, int i2, String str) {
    }

    private static void invoke(Method method, Object obj, Object[] objArr) {
    }

    public static boolean isDebugLog() {
    }

    private static boolean isPreInit() {
    }

    private static boolean isSilentMode() {
    }

    private static boolean needCheckPolicyResult(Context context) {
    }

    public static boolean needSendZcfgEnv(Context context) {
    }

    public static void preInit(Context context, String str, String str2) {
    }

    private static void preInitInternal(Context context, String str, String str2) {
    }

    private static void setCheckDevice(boolean z) {
    }

    public static void setEncryptEnabled(boolean z) {
    }

    private static void setFile(Class<?> cls, String str, String str2) {
    }

    private static void setLatencyWindow(long j2) {
    }

    public static void setLogEnabled(boolean z) {
    }

    private static void setModuleTag(BS_TYPE bs_type, String str, String str2) {
    }

    public static void setProcessEvent(boolean z) {
    }

    private static void setWraperType(String str, String str2) {
    }

    public static void submitPolicyGrantResult(Context context, boolean z) {
    }

    public static void init(Context context, String str, String str2, int i2, String str3) {
    }

    private static void invoke(Method method, Object[] objArr) {
    }

    private static void setFile(Class<?> cls, String str, boolean z) {
    }
}
