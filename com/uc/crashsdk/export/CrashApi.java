package com.uc.crashsdk.export;

import android.content.Context;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.webkit.ValueCallback;
import java.util.concurrent.Callable;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class CrashApi {

    /* renamed from: a  reason: collision with root package name */
    private static CrashApi f14618a = null;
    private static boolean c = true;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f14619d;
    private boolean b;

    private CrashApi(Context context, CustomInfo customInfo, VersionInfo versionInfo, ICrashClient iCrashClient, boolean z, boolean z2, boolean z3) {
    }

    private static void a() {
    }

    private static void b() {
    }

    private static void c() {
    }

    public static synchronized CrashApi createInstance(Context context, CustomInfo customInfo, VersionInfo versionInfo, ICrashClient iCrashClient, boolean z, boolean z2, boolean z3) {
    }

    public static CrashApi createInstanceEx(Context context, String str, boolean z) {
    }

    public static CrashApi getInstance() {
    }

    public int addCachedInfo(String str, String str2) {
    }

    public int addDumpFile(DumpFileInfo dumpFileInfo) {
    }

    public void addHeaderInfo(String str, String str2) {
    }

    public boolean addStatInfo(String str, String str2) {
    }

    public void crashSoLoaded() {
    }

    public int createCachedInfo(String str, int i2, int i3) {
    }

    public void disableLog(int i2) {
    }

    public boolean generateCustomLog(CustomLogInfo customLogInfo) {
    }

    public boolean generateTraces(String str, long j2) {
    }

    public String getCrashLogUploadUrl() {
    }

    public ParcelFileDescriptor getHostFd() {
    }

    public ParcelFileDescriptor getIsolatedHostFd() {
    }

    public int getLastExitType() {
    }

    public int getLastExitTypeEx() {
    }

    public Throwable getUncaughtException() {
    }

    public int getUnexpReason() {
    }

    public void onExit() {
    }

    public boolean registerCallback(int i2, ValueCallback<Bundle> valueCallback) {
    }

    public int registerInfoCallback(String str, int i2) {
    }

    public int registerThread(int i2, String str) {
    }

    public int reportCrashStats(boolean z) {
    }

    public int resetCrashStats(boolean z) {
    }

    public void setForeground(boolean z) {
    }

    public boolean setHostFd(ParcelFileDescriptor parcelFileDescriptor) {
    }

    public boolean setIsolatedHostFd(ParcelFileDescriptor parcelFileDescriptor) {
    }

    public void setNewInstall() {
    }

    public int updateCustomInfo(CustomInfo customInfo) {
    }

    public boolean updateUnexpInfo() {
    }

    public void updateVersionInfo(VersionInfo versionInfo) {
    }

    public void uploadCrashLogs() {
    }

    public static CrashApi createInstanceEx(Context context, String str, boolean z, Bundle bundle) {
    }

    public static CrashApi createInstanceEx(Context context, String str, boolean z, Bundle bundle, ICrashClient iCrashClient) {
    }

    public int registerInfoCallback(String str, int i2, Callable<String> callable) {
    }

    public int updateCustomInfo(Bundle bundle) {
    }

    public void updateVersionInfo(Bundle bundle) {
    }

    private static void a(Context context, CustomInfo customInfo, VersionInfo versionInfo, ICrashClient iCrashClient) {
    }

    public int addDumpFile(String str, String str2, int i2, Bundle bundle) {
    }

    private static Context a(Context context) {
    }

    private static void b(Context context) {
    }

    private static void a(Throwable th) {
    }

    public boolean generateCustomLog(StringBuffer stringBuffer, String str, Bundle bundle) {
    }

    private static boolean a(String str) {
    }
}
