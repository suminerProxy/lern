package com.baidu.location;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface LLSInterface {
    double getVersion();

    IBinder onBind(Intent intent);

    void onCreate(Context context);

    void onDestroy();

    int onStartCommand(Intent intent, int i2, int i3);

    void onTaskRemoved(Intent intent);

    boolean onUnBind(Intent intent);
}
