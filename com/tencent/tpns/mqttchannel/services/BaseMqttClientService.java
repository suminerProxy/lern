package com.tencent.tpns.mqttchannel.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.Nullable;
import com.tencent.tpns.mqttchannel.core.common.inf.a;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class BaseMqttClientService extends Service {

    /* renamed from: a  reason: collision with root package name */
    private a.AbstractBinderC0266a f13802a;

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        return this.f13802a;
    }

    public abstract void onConnectComplete(boolean z);

    public abstract void onConnectionLost();

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f13802a = new com.tencent.tpns.mqttchannel.core.a.a(this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f13802a = null;
        super.onDestroy();
    }

    public abstract void onHeartBeat();

    public abstract void onMessageArrived(String str, String str2);
}
