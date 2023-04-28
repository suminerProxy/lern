package com.tencent.tpns.mqttchannel.core.a;

import com.tencent.tpns.baseapi.base.util.CommonWorkingThread;
import com.tencent.tpns.baseapi.base.util.TTask;
import com.tencent.tpns.mqttchannel.core.common.inf.IMqttCallback;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class b extends IMqttCallback.a {
    public abstract void callback(int i2, String str);

    @Override // com.tencent.tpns.mqttchannel.core.common.inf.IMqttCallback
    public final void handleCallback(int i2, String str) {
        CommonWorkingThread.getInstance().execute(new TTask(this, i2, str) { // from class: com.tencent.tpns.mqttchannel.core.a.b.1

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f13734a;
            public final /* synthetic */ String b;
            public final /* synthetic */ b c;

            @Override // com.tencent.tpns.baseapi.base.util.TTask
            public void TRun() {
            }
        });
    }
}
