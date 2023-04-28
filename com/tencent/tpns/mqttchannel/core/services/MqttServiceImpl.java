package com.tencent.tpns.mqttchannel.core.services;

import android.content.Context;
import com.tencent.tpns.mqttchannel.core.common.inf.IMqttService;
import com.tencent.tpns.mqttchannel.services.BaseMqttClientService;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class MqttServiceImpl {

    /* renamed from: a  reason: collision with root package name */
    private IMqttService.Stub f13801a;

    public MqttServiceImpl(Context context, BaseMqttClientService baseMqttClientService) {
        this.f13801a = new IMqttServiceImpl(context, baseMqttClientService);
    }

    public IMqttService.Stub getIMqttService() {
        return this.f13801a;
    }

    public MqttServiceImpl(Context context) {
        this.f13801a = new IMqttServiceImpl(context);
    }
}
