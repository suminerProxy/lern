package com.tencent.tpns.mqttchannel.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unexpected branching in enum static init block */
/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class MqttConnectState {
    public static final MqttConnectState CONNECTED = null;
    public static final MqttConnectState CONNECTFAIL = null;
    public static final MqttConnectState CONNECTING = null;
    public static final MqttConnectState DISCONNECTED = null;
    public static final MqttConnectState DISCONNECTING = null;
    public static final MqttConnectState SUBTOPICS = null;
    public static final MqttConnectState UNKOWN = null;
    private static final /* synthetic */ MqttConnectState[] b = null;

    /* renamed from: a  reason: collision with root package name */
    private int f13732a;

    private MqttConnectState(String str, int i2, int i3) {
    }

    public static MqttConnectState from(int i2) {
    }

    public static MqttConnectState valueOf(String str) {
    }

    public static MqttConnectState[] values() {
    }

    public int getType() {
    }
}
