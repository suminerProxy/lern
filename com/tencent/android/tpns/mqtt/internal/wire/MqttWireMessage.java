package com.tencent.android.tpns.mqtt.internal.wire;

import com.tencent.android.tpns.mqtt.MqttException;
import com.tencent.android.tpns.mqtt.MqttPersistable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public abstract class MqttWireMessage {
    public static final byte MESSAGE_TYPE_CONNACK = 2;
    public static final byte MESSAGE_TYPE_CONNECT = 1;
    public static final byte MESSAGE_TYPE_DISCONNECT = 14;
    public static final byte MESSAGE_TYPE_PINGREQ = 12;
    public static final byte MESSAGE_TYPE_PINGRESP = 13;
    public static final byte MESSAGE_TYPE_PUBACK = 4;
    public static final byte MESSAGE_TYPE_PUBCOMP = 7;
    public static final byte MESSAGE_TYPE_PUBLISH = 3;
    public static final byte MESSAGE_TYPE_PUBREC = 5;
    public static final byte MESSAGE_TYPE_PUBREL = 6;
    public static final byte MESSAGE_TYPE_SUBACK = 9;
    public static final byte MESSAGE_TYPE_SUBSCRIBE = 8;
    public static final byte MESSAGE_TYPE_UNSUBACK = 11;
    public static final byte MESSAGE_TYPE_UNSUBSCRIBE = 10;
    private static final String[] PACKET_NAMES = null;
    public static final String STRING_ENCODING = "UTF-8";
    public boolean duplicate;
    public int msgId;
    private byte type;

    public MqttWireMessage(byte b) {
    }

    public static MqttWireMessage createWireMessage(MqttPersistable mqttPersistable) throws MqttException {
    }

    public static byte[] encodeMBI(long j2) {
    }

    public static MultiByteInteger readMBI(DataInputStream dataInputStream) throws IOException {
    }

    public String decodeUTF8(DataInputStream dataInputStream) throws MqttException {
    }

    public byte[] encodeMessageId() throws MqttException {
    }

    public void encodeUTF8(DataOutputStream dataOutputStream, String str) throws MqttException {
    }

    public byte[] getHeader() throws MqttException {
    }

    public String getKey() {
    }

    public int getMessageId() {
    }

    public abstract byte getMessageInfo();

    public byte[] getPayload() throws MqttException {
    }

    public byte getType() {
    }

    public abstract byte[] getVariableHeader() throws MqttException;

    public boolean isMessageIdRequired() {
    }

    public boolean isRetryable() {
    }

    public void setDuplicate(boolean z) {
    }

    public void setMessageId(int i2) {
    }

    public String toString() {
    }

    public static MqttWireMessage createWireMessage(byte[] bArr) throws MqttException {
    }

    private static MqttWireMessage createWireMessage(InputStream inputStream) throws MqttException {
    }
}
