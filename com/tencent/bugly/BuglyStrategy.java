package com.tencent.bugly;

import com.tencent.bugly.proguard.aa;
import java.util.Map;

/* compiled from: BUGLY */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class BuglyStrategy {
    private String c;

    /* renamed from: d  reason: collision with root package name */
    private String f9174d;

    /* renamed from: e  reason: collision with root package name */
    private String f9175e;

    /* renamed from: f  reason: collision with root package name */
    private long f9176f;

    /* renamed from: g  reason: collision with root package name */
    private String f9177g;

    /* renamed from: h  reason: collision with root package name */
    private String f9178h;

    /* renamed from: i  reason: collision with root package name */
    private String f9179i;
    private a u;

    /* renamed from: j  reason: collision with root package name */
    private boolean f9180j = true;

    /* renamed from: k  reason: collision with root package name */
    private boolean f9181k = true;

    /* renamed from: l  reason: collision with root package name */
    private boolean f9182l = true;

    /* renamed from: m  reason: collision with root package name */
    private boolean f9183m = false;

    /* renamed from: n  reason: collision with root package name */
    private boolean f9184n = true;

    /* renamed from: o  reason: collision with root package name */
    private Class<?> f9185o = null;

    /* renamed from: p  reason: collision with root package name */
    private boolean f9186p = true;
    private boolean q = true;
    private boolean r = true;
    private boolean s = true;
    private boolean t = false;

    /* renamed from: a  reason: collision with root package name */
    public int f9173a = 31;
    public boolean b = false;
    private boolean v = false;

    /* compiled from: BUGLY */
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
        String str = this.f9174d;
        if (str == null) {
            return aa.b().s;
        }
        return str;
    }

    public synchronized String getAppPackageName() {
        String str = this.f9175e;
        if (str == null) {
            return aa.b().c;
        }
        return str;
    }

    public synchronized long getAppReportDelay() {
        return this.f9176f;
    }

    public synchronized String getAppVersion() {
        String str = this.c;
        if (str == null) {
            return aa.b().f9663o;
        }
        return str;
    }

    public synchronized int getCallBackType() {
        return this.f9173a;
    }

    public synchronized boolean getCloseErrorCallback() {
        return this.b;
    }

    public synchronized a getCrashHandleCallback() {
        return this.u;
    }

    public synchronized String getDeviceID() {
        return this.f9178h;
    }

    public synchronized String getDeviceModel() {
        return this.f9179i;
    }

    public synchronized String getLibBuglySOFilePath() {
        return this.f9177g;
    }

    public synchronized Class<?> getUserInfoActivity() {
        return this.f9185o;
    }

    public synchronized boolean isBuglyLogUpload() {
        return this.f9186p;
    }

    public synchronized boolean isEnableANRCrashMonitor() {
        return this.f9181k;
    }

    public synchronized boolean isEnableCatchAnrTrace() {
        return this.f9182l;
    }

    public synchronized boolean isEnableNativeCrashMonitor() {
        return this.f9180j;
    }

    public boolean isEnableRecordAnrMainStack() {
        return this.f9183m;
    }

    public synchronized boolean isEnableUserInfo() {
        return this.f9184n;
    }

    public boolean isMerged() {
        return this.v;
    }

    public boolean isReplaceOldChannel() {
        return this.q;
    }

    public synchronized boolean isUploadProcess() {
        return this.r;
    }

    public synchronized boolean isUploadSpotCrash() {
        return this.s;
    }

    public synchronized boolean recordUserInfoOnceADay() {
        return this.t;
    }

    public synchronized BuglyStrategy setAppChannel(String str) {
        this.f9174d = str;
        return this;
    }

    public synchronized BuglyStrategy setAppPackageName(String str) {
        this.f9175e = str;
        return this;
    }

    public synchronized BuglyStrategy setAppReportDelay(long j2) {
        this.f9176f = j2;
        return this;
    }

    public synchronized BuglyStrategy setAppVersion(String str) {
        this.c = str;
        return this;
    }

    public synchronized BuglyStrategy setBuglyLogUpload(boolean z) {
        this.f9186p = z;
        return this;
    }

    public synchronized void setCallBackType(int i2) {
        this.f9173a = i2;
    }

    public synchronized void setCloseErrorCallback(boolean z) {
        this.b = z;
    }

    public synchronized BuglyStrategy setCrashHandleCallback(a aVar) {
        this.u = aVar;
        return this;
    }

    public synchronized BuglyStrategy setDeviceID(String str) {
        this.f9178h = str;
        return this;
    }

    public synchronized BuglyStrategy setDeviceModel(String str) {
        this.f9179i = str;
        return this;
    }

    public synchronized BuglyStrategy setEnableANRCrashMonitor(boolean z) {
        this.f9181k = z;
        return this;
    }

    public void setEnableCatchAnrTrace(boolean z) {
        this.f9182l = z;
    }

    public synchronized BuglyStrategy setEnableNativeCrashMonitor(boolean z) {
        this.f9180j = z;
        return this;
    }

    public void setEnableRecordAnrMainStack(boolean z) {
        this.f9183m = z;
    }

    public synchronized BuglyStrategy setEnableUserInfo(boolean z) {
        this.f9184n = z;
        return this;
    }

    public synchronized BuglyStrategy setLibBuglySOFilePath(String str) {
        this.f9177g = str;
        return this;
    }

    @Deprecated
    public void setMerged(boolean z) {
        this.v = z;
    }

    public synchronized BuglyStrategy setRecordUserInfoOnceADay(boolean z) {
        this.t = z;
        return this;
    }

    public void setReplaceOldChannel(boolean z) {
        this.q = z;
    }

    public synchronized BuglyStrategy setUploadProcess(boolean z) {
        this.r = z;
        return this;
    }

    public synchronized void setUploadSpotCrash(boolean z) {
        this.s = z;
    }

    public synchronized BuglyStrategy setUserInfoActivity(Class<?> cls) {
        this.f9185o = cls;
        return this;
    }
}
