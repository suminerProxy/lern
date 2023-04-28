package com.facebook.common.activitylistener;

import android.app.Activity;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface ActivityListener {
    public static final int MAX_PRIORITY = 10;
    public static final int MIN_PRIORITY = 1;

    int getPriority();

    void onActivityCreate(Activity activity);

    void onDestroy(Activity activity);

    void onPause(Activity activity);

    void onResume(Activity activity);

    void onStart(Activity activity);

    void onStop(Activity activity);
}
