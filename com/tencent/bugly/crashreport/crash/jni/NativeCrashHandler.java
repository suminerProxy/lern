package com.tencent.bugly.crashreport.crash.jni;

import android.annotation.SuppressLint;
import android.content.Context;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.proguard.aa;
import com.tencent.bugly.proguard.ac;
import com.tencent.bugly.proguard.ak;
import com.tencent.bugly.proguard.as;
import com.tencent.bugly.proguard.q;
import java.io.File;
import java.util.Comparator;

/* compiled from: BUGLY */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class NativeCrashHandler implements q {

    /* renamed from: a  reason: collision with root package name */
    public static String f9242a = null;
    private static NativeCrashHandler b = null;
    private static int c = 1;

    /* renamed from: n  reason: collision with root package name */
    private static boolean f9243n = true;

    /* renamed from: d  reason: collision with root package name */
    private final Context f9244d;

    /* renamed from: e  reason: collision with root package name */
    private final aa f9245e;

    /* renamed from: f  reason: collision with root package name */
    private final ak f9246f;

    /* renamed from: g  reason: collision with root package name */
    private NativeExceptionHandler f9247g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f9248h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f9249i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f9250j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f9251k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f9252l;

    /* renamed from: m  reason: collision with root package name */
    private as f9253m;

    /* compiled from: BUGLY */
    /* renamed from: com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ NativeCrashHandler f9254a;

        public AnonymousClass1(NativeCrashHandler nativeCrashHandler) {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    /* compiled from: BUGLY */
    /* renamed from: com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements Comparator<File> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ NativeCrashHandler f9255a;

        public AnonymousClass2(NativeCrashHandler nativeCrashHandler) {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(File file, File file2) {
        }
    }

    @SuppressLint({"SdCardPath"})
    private NativeCrashHandler(Context context, aa aaVar, as asVar, ak akVar, boolean z, String str) {
    }

    public static /* synthetic */ Context a(NativeCrashHandler nativeCrashHandler) {
    }

    public static /* synthetic */ NativeExceptionHandler b(NativeCrashHandler nativeCrashHandler) {
    }

    public static /* synthetic */ as c(NativeCrashHandler nativeCrashHandler) {
    }

    public static synchronized String getDumpFilePath() {
    }

    public static synchronized NativeCrashHandler getInstance(Context context, aa aaVar, as asVar, ac acVar, ak akVar, boolean z, String str) {
    }

    private native String getProperties(String str);

    private native String getSoCpuAbi();

    public static boolean isShouldHandleInJava() {
    }

    public static synchronized void setDumpFilePath(String str) {
    }

    public static void setShouldHandleInJava(boolean z) {
    }

    @Override // com.tencent.bugly.proguard.q
    public boolean appendLogToNative(String str, String str2, String str3) {
    }

    public native boolean appendNativeLog(String str, String str2, String str3);

    public native boolean appendWholeNativeLog(String str);

    public void checkUploadRecordCrash() {
    }

    public void disableCatchAnrTrace() {
    }

    public void dumpAnrNativeStack() {
    }

    public void enableCatchAnrTrace() {
    }

    public boolean filterSigabrtSysLog() {
    }

    @Override // com.tencent.bugly.proguard.q
    public String getLogFromNative() {
    }

    public NativeExceptionHandler getNativeExceptionHandler() {
    }

    public native String getNativeKeyValueList();

    public native String getNativeLog();

    public String getRunningCpuAbi() {
    }

    public String getSystemProperty(String str) {
    }

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

    public void resendSigquit() {
    }

    public boolean setNativeAppChannel(String str) {
    }

    public boolean setNativeAppPackage(String str) {
    }

    public boolean setNativeAppVersion(String str) {
    }

    public native void setNativeInfo(int i2, String str);

    @Override // com.tencent.bugly.proguard.q
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

    public void unBlockSigquit(boolean z) {
    }

    public native String unregist();

    public static /* synthetic */ boolean a() {
    }

    public static /* synthetic */ String b() {
    }

    private synchronized void c() {
    }

    public static /* synthetic */ boolean a(NativeCrashHandler nativeCrashHandler, String str) {
    }

    private synchronized void b(boolean z) {
    }

    private synchronized void a(boolean z) {
    }

    public static synchronized NativeCrashHandler getInstance() {
    }

    public void testNativeCrash(boolean z, boolean z2, boolean z3) {
    }

    private synchronized void c(boolean z) {
    }

    private static boolean a(String str, boolean z) {
    }

    private boolean a(int i2, String str) {
    }
}
