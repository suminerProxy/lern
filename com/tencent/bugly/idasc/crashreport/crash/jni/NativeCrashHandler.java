package com.tencent.bugly.idasc.crashreport.crash.jni;

import android.annotation.SuppressLint;
import android.content.Context;
import com.tencent.bugly.idasc.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.idasc.proguard.w;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class NativeCrashHandler implements com.tencent.bugly.idasc.crashreport.a {

    /* renamed from: a  reason: collision with root package name */
    private static NativeCrashHandler f9453a = null;
    private static int b = 1;

    /* renamed from: m  reason: collision with root package name */
    private static boolean f9454m = false;

    /* renamed from: n  reason: collision with root package name */
    private static boolean f9455n = false;

    /* renamed from: p  reason: collision with root package name */
    private static boolean f9456p = true;
    private final Context c;

    /* renamed from: d  reason: collision with root package name */
    private final com.tencent.bugly.idasc.crashreport.common.info.a f9457d;

    /* renamed from: e  reason: collision with root package name */
    private final w f9458e;

    /* renamed from: f  reason: collision with root package name */
    private NativeExceptionHandler f9459f;

    /* renamed from: g  reason: collision with root package name */
    private String f9460g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f9461h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f9462i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f9463j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f9464k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f9465l;

    /* renamed from: o  reason: collision with root package name */
    private com.tencent.bugly.idasc.crashreport.crash.b f9466o;

    /* renamed from: com.tencent.bugly.idasc.crashreport.crash.jni.NativeCrashHandler$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public final class AnonymousClass1 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ NativeCrashHandler f9467a;

        public AnonymousClass1(NativeCrashHandler nativeCrashHandler) {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    @SuppressLint({"SdCardPath"})
    private NativeCrashHandler(Context context, com.tencent.bugly.idasc.crashreport.common.info.a aVar, com.tencent.bugly.idasc.crashreport.crash.b bVar, w wVar, boolean z, String str) {
    }

    public static /* synthetic */ Context a(NativeCrashHandler nativeCrashHandler) {
    }

    private synchronized void a(boolean z) {
    }

    private boolean a(int i2, String str) {
    }

    public static /* synthetic */ boolean a(NativeCrashHandler nativeCrashHandler, int i2, String str) {
    }

    private static boolean a(String str, boolean z) {
    }

    public static /* synthetic */ String b(NativeCrashHandler nativeCrashHandler) {
    }

    private synchronized void b(boolean z) {
    }

    public static /* synthetic */ boolean b() {
    }

    public static /* synthetic */ NativeExceptionHandler c(NativeCrashHandler nativeCrashHandler) {
    }

    private synchronized void c() {
    }

    private synchronized void c(boolean z) {
    }

    public static /* synthetic */ com.tencent.bugly.idasc.crashreport.crash.b d(NativeCrashHandler nativeCrashHandler) {
    }

    public static synchronized NativeCrashHandler getInstance() {
    }

    public static synchronized NativeCrashHandler getInstance(Context context, com.tencent.bugly.idasc.crashreport.common.info.a aVar, com.tencent.bugly.idasc.crashreport.crash.b bVar, com.tencent.bugly.idasc.crashreport.common.strategy.a aVar2, w wVar, boolean z, String str) {
    }

    public static boolean isShouldHandleInJava() {
    }

    public static void setShouldHandleInJava(boolean z) {
    }

    public final void a() {
    }

    public boolean appendLogToNative(String str, String str2, String str3) {
    }

    public native boolean appendNativeLog(String str, String str2, String str3);

    public native boolean appendWholeNativeLog(String str);

    public void checkUploadRecordCrash() {
    }

    public void dumpAnrNativeStack() {
    }

    public void enableCatchAnrTrace() {
    }

    public boolean filterSigabrtSysLog() {
    }

    public synchronized String getDumpFilePath() {
    }

    public String getLogFromNative() {
    }

    public NativeExceptionHandler getNativeExceptionHandler() {
    }

    public native String getNativeKeyValueList();

    public native String getNativeLog();

    public boolean isEnableCatchAnrTrace() {
    }

    public synchronized boolean isUserOpened() {
    }

    public synchronized void onStrategyChanged(StrategyBean strategyBean) {
    }

    public boolean putKeyValueToNative(String str, String str2) {
    }

    public native boolean putNativeKeyValue(String str, String str2);

    public native String regist(String str, boolean z, int i2);

    public void removeEmptyNativeRecordFiles() {
    }

    public native String removeNativeKeyValue(String str);

    public synchronized void setDumpFilePath(String str) {
    }

    public boolean setNativeAppChannel(String str) {
    }

    public boolean setNativeAppPackage(String str) {
    }

    public boolean setNativeAppVersion(String str) {
    }

    public native void setNativeInfo(int i2, String str);

    @Override // com.tencent.bugly.idasc.crashreport.a
    public boolean setNativeIsAppForeground(boolean z) {
    }

    public boolean setNativeLaunchTime(long j2) {
    }

    public boolean setNativeUserId(String str) {
    }

    public synchronized void setUserOpened(boolean z) {
    }

    public synchronized void startNativeMonitor() {
    }

    public native void testCrash();

    public void testNativeCrash() {
    }

    public void testNativeCrash(boolean z, boolean z2, boolean z3) {
    }

    public native String unregist();
}
