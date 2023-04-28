package com.tencent.tpns.mqttchannel.api;

import android.content.Context;
import com.tencent.tpns.mqttchannel.core.common.a.b;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class MqttTools {
    public static String getMqttSdkVersion() {
        return "1.3.7.0";
    }

    public static boolean isAesPushMsgTopic(Context context, String str) {
        return b.l(context, str);
    }

    public static boolean isGZipAesPushMsgTopic(Context context, String str) {
        return b.p(context, str);
    }

    public static boolean isGZipPushMsgTopic(Context context, String str) {
        return b.n(context, str);
    }

    public static boolean isPushMsgTopic(Context context, String str) {
        return b.j(context, str);
    }
}
