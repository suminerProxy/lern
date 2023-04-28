package com.baidu.location;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class f extends Service {
    public static boolean isServing = false;
    public static boolean isStartedServing = false;
    public static Context mC = null;
    public static String replaceFileName = "repll.jar";

    /* renamed from: a  reason: collision with root package name */
    public LLSInterface f1474a;
    public LLSInterface b;
    public LLSInterface c;

    public static float getFrameVersion() {
    }

    public static String getJarFileName() {
    }

    public static Context getServiceContext() {
    }

    public static void setServiceContext(Context context) {
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
    }

    @Override // android.app.Service
    @SuppressLint({"NewApi"})
    public void onCreate() {
    }

    @Override // android.app.Service
    public void onDestroy() {
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
    }
}
