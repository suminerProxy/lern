package com.uc.crashsdk.export;

import java.io.File;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface ICrashClient {
    public static final int EVENT_TYPE_ADD_CRASH_STATS = 3;
    public static final int EVENT_TYPE_CLIENT_PROCESS_LOG_GENERATED = 4;
    public static final int EVENT_TYPE_CRASH_RESTARTING = 2;
    public static final int EVENT_TYPE_LOG_GENERATED = 1;

    void onAddCrashStats(String str, int i2, int i3);

    File onBeforeUploadLog(File file);

    void onClientProcessLogGenerated(String str, File file, String str2);

    void onCrashRestarting(boolean z);

    String onGetCallbackInfo(String str, boolean z);

    void onLogGenerated(File file, String str);
}
