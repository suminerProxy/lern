package com.tencent.android.tpns.mqtt;

import com.tencent.android.tpns.mqtt.internal.ClientComms;
import com.tencent.android.tpns.mqtt.internal.wire.MqttPublish;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class MqttTopic {
    private static final int MAX_TOPIC_LEN = 65535;
    private static final int MIN_TOPIC_LEN = 1;
    public static final String MULTI_LEVEL_WILDCARD = "#";
    public static final String MULTI_LEVEL_WILDCARD_PATTERN = "/#";
    private static final char NUL = 0;
    public static final String SINGLE_LEVEL_WILDCARD = "+";
    public static final String TOPIC_LEVEL_SEPARATOR = "/";
    public static final String TOPIC_WILDCARDS = "#+";
    private ClientComms comms;
    private String name;

    public MqttTopic(String str, ClientComms clientComms) {
    }

    private MqttPublish createPublish(MqttMessage mqttMessage) {
    }

    public static boolean isMatched(String str, String str2) throws IllegalArgumentException {
    }

    public static void validate(String str, boolean z) throws IllegalArgumentException {
    }

    private static void validateSingleLevelWildcard(String str) {
    }

    public String getName() {
    }

    public MqttDeliveryToken publish(byte[] bArr, int i2, boolean z) throws MqttException, MqttPersistenceException {
    }

    public String toString() {
    }

    public MqttDeliveryToken publish(MqttMessage mqttMessage) throws MqttException, MqttPersistenceException {
    }
}
