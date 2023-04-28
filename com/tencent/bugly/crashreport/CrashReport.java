package com.tencent.bugly.crashreport;

import android.annotation.SuppressLint;
import android.content.Context;
import android.webkit.WebView;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.crashreport.crash.h5.H5JavaScriptInterface;
import java.net.InetAddress;
import java.net.Proxy;
import java.util.Map;
import java.util.Set;

/* compiled from: BUGLY */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class CrashReport {

    /* renamed from: a  reason: collision with root package name */
    private static Context f9190a;

    /* compiled from: BUGLY */
    /* renamed from: com.tencent.bugly.crashreport.CrashReport$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class AnonymousClass1 implements a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WebView f9191a;

        public AnonymousClass1(WebView webView) {
        }

        @Override // com.tencent.bugly.crashreport.CrashReport.a
        public final String a() {
        }

        @Override // com.tencent.bugly.crashreport.CrashReport.a
        public final void b() {
        }

        @Override // com.tencent.bugly.crashreport.CrashReport.a
        public final CharSequence c() {
        }

        @Override // com.tencent.bugly.crashreport.CrashReport.a
        public final void a(String str) {
        }

        @Override // com.tencent.bugly.crashreport.CrashReport.a
        public final void a(H5JavaScriptInterface h5JavaScriptInterface, String str) {
        }
    }

    /* compiled from: BUGLY */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class CrashHandleCallback extends BuglyStrategy.a {
    }

    /* compiled from: BUGLY */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class UserStrategy extends BuglyStrategy {
        public CrashHandleCallback c;

        public UserStrategy(Context context) {
        }

        @Override // com.tencent.bugly.BuglyStrategy
        public synchronized int getCallBackType() {
        }

        @Override // com.tencent.bugly.BuglyStrategy
        public synchronized boolean getCloseErrorCallback() {
        }

        @Override // com.tencent.bugly.BuglyStrategy
        public /* bridge */ /* synthetic */ BuglyStrategy.a getCrashHandleCallback() {
        }

        @Override // com.tencent.bugly.BuglyStrategy
        public synchronized void setCallBackType(int i2) {
        }

        @Override // com.tencent.bugly.BuglyStrategy
        public synchronized void setCloseErrorCallback(boolean z) {
        }

        public synchronized void setCrashHandleCallback(CrashHandleCallback crashHandleCallback) {
        }

        @Override // com.tencent.bugly.BuglyStrategy
        public synchronized CrashHandleCallback getCrashHandleCallback() {
        }
    }

    /* compiled from: BUGLY */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface a {
        String a();

        void a(H5JavaScriptInterface h5JavaScriptInterface, String str);

        void a(String str);

        void b();

        CharSequence c();
    }

    public static void closeBugly() {
    }

    public static void closeCrashReport() {
    }

    public static void closeNativeReport() {
    }

    public static void enableBugly(boolean z) {
    }

    public static void enableObtainId(Context context, boolean z) {
    }

    public static Set<String> getAllUserDataKeys(Context context) {
    }

    public static String getAppChannel() {
    }

    public static String getAppID() {
    }

    public static String getAppVer() {
    }

    public static String getBuglyVersion(Context context) {
    }

    public static Context getContext() {
    }

    public static String getDeviceID(Context context) {
    }

    public static Proxy getHttpProxy() {
    }

    public static Map<String, String> getSdkExtraData() {
    }

    public static String getUserData(Context context, String str) {
    }

    public static int getUserDatasSize(Context context) {
    }

    public static String getUserId() {
    }

    public static int getUserSceneTagId(Context context) {
    }

    public static void initCrashReport(Context context) {
    }

    public static boolean isLastSessionCrash() {
    }

    public static void postCatchedException(Throwable th) {
    }

    public static void postException(Thread thread, int i2, String str, String str2, String str3, Map<String, String> map) {
    }

    private static void putSdkData(Context context, String str, String str2) {
    }

    public static void putUserData(Context context, String str, String str2) {
    }

    public static String removeUserData(Context context, String str) {
    }

    public static void setAllThreadStackEnable(Context context, boolean z, boolean z2) {
    }

    public static void setAppChannel(Context context, String str) {
    }

    public static void setAppPackage(Context context, String str) {
    }

    public static void setAppVersion(Context context, String str) {
    }

    public static void setBuglyDbName(String str) {
    }

    public static void setCollectPrivacyInfo(Context context, boolean z) {
    }

    public static void setContext(Context context) {
    }

    public static void setCrashFilter(String str) {
    }

    public static void setCrashRegularFilter(String str) {
    }

    public static void setDeviceId(Context context, String str) {
    }

    public static void setDeviceModel(Context context, String str) {
    }

    public static void setDumpFilePath(Context context, String str) {
    }

    public static void setHandleNativeCrashInJava(boolean z) {
    }

    public static void setHttpProxy(String str, int i2) {
    }

    @Deprecated
    public static void setIsAppForeground(Context context, boolean z) {
    }

    public static void setIsDevelopmentDevice(Context context, boolean z) {
    }

    public static boolean setJavascriptMonitor(WebView webView, boolean z) {
    }

    public static void setSdkExtraData(Context context, String str, String str2) {
    }

    public static void setServerUrl(String str) {
    }

    public static void setSessionIntervalMills(long j2) {
    }

    public static void setUserId(String str) {
    }

    public static void setUserSceneTag(Context context, int i2) {
    }

    public static void startCrashReport() {
    }

    public static void testANRCrash() {
    }

    public static void testJavaCrash() {
    }

    public static void testNativeCrash() {
    }

    public static void uploadUserInfo() {
    }

    public static void postCatchedException(Throwable th, Thread thread) {
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public static boolean setJavascriptMonitor(WebView webView, boolean z, boolean z2) {
    }

    public static void testNativeCrash(boolean z, boolean z2, boolean z3) {
    }

    public static void postCatchedException(Throwable th, Thread thread, boolean z) {
    }

    public static void initCrashReport(Context context, UserStrategy userStrategy) {
    }

    public static void setHttpProxy(InetAddress inetAddress, int i2) {
    }

    public static void postException(int i2, String str, String str2, String str3, Map<String, String> map) {
    }

    public static void setUserId(Context context, String str) {
    }

    public static Map<String, String> getSdkExtraData(Context context) {
    }

    public static void initCrashReport(Context context, String str, boolean z) {
    }

    public static boolean setJavascriptMonitor(a aVar, boolean z) {
    }

    public static void initCrashReport(Context context, String str, boolean z, UserStrategy userStrategy) {
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public static boolean setJavascriptMonitor(a aVar, boolean z, boolean z2) {
    }
}
