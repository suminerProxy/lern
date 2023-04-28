package com.tencent.android.tpns.mqtt;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class MqttMessage {
    private boolean dup;
    private int messageId;
    private boolean mutable;
    private byte[] payload;
    private int qos;
    private boolean retained;

    public MqttMessage() {
    }

    public static void validateQos(int i2) {
    }

    public void checkMutable() throws IllegalStateException {
    }

    public void clearPayload() {
    }

    public int getId() {
    }

    public byte[] getPayload() {
    }

    public int getQos() {
    }

    public boolean isDuplicate() {
    }

    public boolean isRetained() {
    }

    public void setDuplicate(boolean z) {
    }

    public void setId(int i2) {
    }

    public void setMutable(boolean z) {
    }

    public void setPayload(byte[] bArr) {
    }

    public void setQos(int i2) {
    }

    public void setRetained(boolean z) {
    }

    public String toString() {
    }

    public MqttMessage(byte[] bArr) {
    }
}
