package com.tencent.bugly.idasc;

import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class BuglyStrategy {

    /* renamed from: a  reason: collision with root package name */
    public int f9257a;
    public boolean b;
    private String c;

    /* renamed from: d  reason: collision with root package name */
    private String f9258d;

    /* renamed from: e  reason: collision with root package name */
    private String f9259e;

    /* renamed from: f  reason: collision with root package name */
    private long f9260f;

    /* renamed from: g  reason: collision with root package name */
    private String f9261g;

    /* renamed from: h  reason: collision with root package name */
    private String f9262h;

    /* renamed from: i  reason: collision with root package name */
    private String f9263i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f9264j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f9265k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f9266l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f9267m;

    /* renamed from: n  reason: collision with root package name */
    private Class<?> f9268n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f9269o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f9270p;
    private boolean q;
    private boolean r;
    private boolean s;
    private a t;
    private boolean u;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class a {
        public static final int CRASHTYPE_ANR = 4;
        public static final int CRASHTYPE_BLOCK = 7;
        public static final int CRASHTYPE_COCOS2DX_JS = 5;
        public static final int CRASHTYPE_COCOS2DX_LUA = 6;
        public static final int CRASHTYPE_JAVA_CATCH = 1;
        public static final int CRASHTYPE_JAVA_CRASH = 0;
        public static final int CRASHTYPE_NATIVE = 2;
        public static final int CRASHTYPE_U3D = 3;
        public static final int MAX_USERDATA_KEY_LENGTH = 100;
        public static final int MAX_USERDATA_VALUE_LENGTH = 100000;

        public synchronized Map<String, String> onCrashHandleStart(int i2, String str, String str2, String str3) {
        }

        public synchronized byte[] onCrashHandleStart2GetExtraDatas(int i2, String str, String str2, String str3) {
        }
    }

    public synchronized String getAppChannel() {
    }

    public synchronized String getAppPackageName() {
    }

    public synchronized long getAppReportDelay() {
    }

    public synchronized String getAppVersion() {
    }

    public synchronized int getCallBackType() {
    }

    public synchronized boolean getCloseErrorCallback() {
    }

    public synchronized a getCrashHandleCallback() {
    }

    public synchronized String getDeviceID() {
    }

    public synchronized String getDeviceModel() {
    }

    public synchronized String getLibBuglySOFilePath() {
    }

    public synchronized Class<?> getUserInfoActivity() {
    }

    public synchronized boolean isBuglyLogUpload() {
    }

    public synchronized boolean isEnableANRCrashMonitor() {
    }

    public synchronized boolean isEnableCatchAnrTrace() {
    }

    public synchronized boolean isEnableNativeCrashMonitor() {
    }

    public synchronized boolean isEnableUserInfo() {
    }

    public boolean isMerged() {
    }

    public boolean isReplaceOldChannel() {
    }

    public synchronized boolean isUploadProcess() {
    }

    public synchronized boolean isUploadSpotCrash() {
    }

    public synchronized boolean recordUserInfoOnceADay() {
    }

    public synchronized BuglyStrategy setAppChannel(String str) {
    }

    public synchronized BuglyStrategy setAppPackageName(String str) {
    }

    public synchronized BuglyStrategy setAppReportDelay(long j2) {
    }

    public synchronized BuglyStrategy setAppVersion(String str) {
    }

    public synchronized BuglyStrategy setBuglyLogUpload(boolean z) {
    }

    public synchronized void setCallBackType(int i2) {
    }

    public synchronized void setCloseErrorCallback(boolean z) {
    }

    public synchronized BuglyStrategy setCrashHandleCallback(a aVar) {
    }

    public synchronized BuglyStrategy setDeviceID(String str) {
    }

    public synchronized BuglyStrategy setDeviceModel(String str) {
    }

    public synchronized BuglyStrategy setEnableANRCrashMonitor(boolean z) {
    }

    public void setEnableCatchAnrTrace(boolean z) {
    }

    public synchronized BuglyStrategy setEnableNativeCrashMonitor(boolean z) {
    }

    public synchronized BuglyStrategy setEnableUserInfo(boolean z) {
    }

    public synchronized BuglyStrategy setLibBuglySOFilePath(String str) {
    }

    public void setMerged(boolean z) {
    }

    public synchronized BuglyStrategy setRecordUserInfoOnceADay(boolean z) {
    }

    public void setReplaceOldChannel(boolean z) {
    }

    public synchronized BuglyStrategy setUploadProcess(boolean z) {
    }

    public synchronized void setUploadSpotCrash(boolean z) {
    }

    public synchronized BuglyStrategy setUserInfoActivity(Class<?> cls) {
    }
}
