package com.tencent.bugly.idasc.crashreport;

import android.annotation.SuppressLint;
import android.content.Context;
import android.webkit.WebView;
import com.tencent.bugly.idasc.BuglyStrategy;
import com.tencent.bugly.idasc.crashreport.crash.h5.H5JavaScriptInterface;
import java.net.InetAddress;
import java.net.Proxy;
import java.util.Map;
import java.util.Set;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class CrashReport {

    /* renamed from: a  reason: collision with root package name */
    private static Context f9277a;

    /* renamed from: com.tencent.bugly.idasc.crashreport.CrashReport$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public final class AnonymousClass1 implements WebViewInterface {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ WebView f9278a;

        public AnonymousClass1(WebView webView) {
        }

        @Override // com.tencent.bugly.idasc.crashreport.CrashReport.WebViewInterface
        public final void addJavascriptInterface(H5JavaScriptInterface h5JavaScriptInterface, String str) {
        }

        @Override // com.tencent.bugly.idasc.crashreport.CrashReport.WebViewInterface
        public final CharSequence getContentDescription() {
        }

        @Override // com.tencent.bugly.idasc.crashreport.CrashReport.WebViewInterface
        public final String getUrl() {
        }

        @Override // com.tencent.bugly.idasc.crashreport.CrashReport.WebViewInterface
        public final void loadUrl(String str) {
        }

        @Override // com.tencent.bugly.idasc.crashreport.CrashReport.WebViewInterface
        public final void setJavaScriptEnabled(boolean z) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class CrashHandleCallback extends BuglyStrategy.a {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class UserStrategy extends BuglyStrategy {
        private CrashHandleCallback c;

        public UserStrategy(Context context) {
        }

        @Override // com.tencent.bugly.idasc.BuglyStrategy
        public synchronized int getCallBackType() {
        }

        @Override // com.tencent.bugly.idasc.BuglyStrategy
        public synchronized boolean getCloseErrorCallback() {
        }

        @Override // com.tencent.bugly.idasc.BuglyStrategy
        public /* bridge */ /* synthetic */ BuglyStrategy.a getCrashHandleCallback() {
        }

        @Override // com.tencent.bugly.idasc.BuglyStrategy
        public synchronized CrashHandleCallback getCrashHandleCallback() {
        }

        @Override // com.tencent.bugly.idasc.BuglyStrategy
        public synchronized void setCallBackType(int i2) {
        }

        @Override // com.tencent.bugly.idasc.BuglyStrategy
        public synchronized void setCloseErrorCallback(boolean z) {
        }

        public synchronized void setCrashHandleCallback(CrashHandleCallback crashHandleCallback) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface WebViewInterface {
        void addJavascriptInterface(H5JavaScriptInterface h5JavaScriptInterface, String str);

        CharSequence getContentDescription();

        String getUrl();

        void loadUrl(String str);

        void setJavaScriptEnabled(boolean z);
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

    public static String getDeviceID(Context context) {
    }

    public static Proxy getHttpProxy() {
    }

    public static Map<String, String> getSdkExtraData() {
    }

    public static Map<String, String> getSdkExtraData(Context context) {
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

    public static void initCrashReport(Context context, UserStrategy userStrategy) {
    }

    public static void initCrashReport(Context context, String str, boolean z) {
    }

    public static void initCrashReport(Context context, String str, boolean z, UserStrategy userStrategy) {
    }

    public static boolean isLastSessionCrash() {
    }

    public static void postCatchedException(Throwable th) {
    }

    public static void postCatchedException(Throwable th, Thread thread) {
    }

    public static void postCatchedException(Throwable th, Thread thread, boolean z) {
    }

    public static void postException(int i2, String str, String str2, String str3, Map<String, String> map) {
    }

    public static void postException(Thread thread, int i2, String str, String str2, String str3, Map<String, String> map) {
    }

    private static void putSdkData(Context context, String str, String str2) {
    }

    public static void putUserData(Context context, String str, String str2) {
    }

    public static String removeUserData(Context context, String str) {
    }

    public static void setAppChannel(Context context, String str) {
    }

    public static void setAppPackage(Context context, String str) {
    }

    public static void setAppVersion(Context context, String str) {
    }

    public static void setBuglyDbName(String str) {
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

    public static void setHandleNativeCrashInJava(boolean z) {
    }

    public static void setHttpProxy(String str, int i2) {
    }

    public static void setHttpProxy(InetAddress inetAddress, int i2) {
    }

    public static void setIsAppForeground(Context context, boolean z) {
    }

    public static void setIsDevelopmentDevice(Context context, boolean z) {
    }

    public static boolean setJavascriptMonitor(WebView webView, boolean z) {
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public static boolean setJavascriptMonitor(WebView webView, boolean z, boolean z2) {
    }

    public static boolean setJavascriptMonitor(WebViewInterface webViewInterface, boolean z) {
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public static boolean setJavascriptMonitor(WebViewInterface webViewInterface, boolean z, boolean z2) {
    }

    public static void setSdkExtraData(Context context, String str, String str2) {
    }

    public static void setServerUrl(String str) {
    }

    public static void setSessionIntervalMills(long j2) {
    }

    public static void setUserId(Context context, String str) {
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

    public static void testNativeCrash(boolean z, boolean z2, boolean z3) {
    }

    public static void uploadUserInfo() {
    }
}
