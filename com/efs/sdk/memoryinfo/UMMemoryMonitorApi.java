package com.efs.sdk.memoryinfo;

import android.app.Activity;
import android.content.Context;
import com.efs.sdk.base.EfsReporter;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface UMMemoryMonitorApi {
    String getCurrentActivity();

    boolean isEnable();

    boolean isForeground();

    void onActivityResumed(Activity activity);

    void onActivityStarted(Activity activity);

    void onActivityStopped(Activity activity);

    void setEnable(boolean z);

    void start(Context context, EfsReporter efsReporter);
}
