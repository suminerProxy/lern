package com.showstartfans.activity.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.Nullable;
import com.baidu.location.BDLocation;
import com.baidu.location.LocationClient;
import h.u.a.l.a;
import h.u.a.l.h;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class UpGPSService extends Service implements a {
    private LocationClient b;
    private h c;

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
    }

    @Override // android.app.Service
    public void onCreate() {
    }

    @Override // android.app.Service
    public void onDestroy() {
    }

    @Override // h.u.a.l.a
    public void onReceiveLocation(@org.jetbrains.annotations.Nullable BDLocation bDLocation) {
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
    }
}
