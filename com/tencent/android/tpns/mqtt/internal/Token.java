package com.tencent.android.tpns.mqtt.internal;

import com.tencent.android.tpns.mqtt.IMqttActionListener;
import com.tencent.android.tpns.mqtt.IMqttAsyncClient;
import com.tencent.android.tpns.mqtt.MqttException;
import com.tencent.android.tpns.mqtt.MqttMessage;
import com.tencent.android.tpns.mqtt.internal.wire.MqttWireMessage;
import com.tencent.android.tpns.mqtt.logging.Logger;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class Token {
    private static final String CLASS_NAME = "Token";
    private static final Logger log = null;
    private IMqttActionListener callback;
    private IMqttAsyncClient client;
    private volatile boolean completed;
    private MqttException exception;
    private String key;
    public MqttMessage message;
    private int messageID;
    private boolean notified;
    private boolean pendingComplete;
    private MqttWireMessage response;
    private Object responseLock;
    private boolean sent;
    private Object sentLock;
    private String[] topics;
    private Object userContext;

    public Token(String str) {
    }

    public boolean checkResult() throws MqttException {
    }

    public IMqttActionListener getActionCallback() {
    }

    public IMqttAsyncClient getClient() {
    }

    public MqttException getException() {
    }

    public int[] getGrantedQos() {
    }

    public String getKey() {
    }

    public MqttMessage getMessage() {
    }

    public int getMessageID() {
    }

    public MqttWireMessage getResponse() {
    }

    public boolean getSessionPresent() {
    }

    public String[] getTopics() {
    }

    public Object getUserContext() {
    }

    public MqttWireMessage getWireMessage() {
    }

    public boolean isComplete() {
    }

    public boolean isCompletePending() {
    }

    public boolean isInUse() {
    }

    public boolean isNotified() {
    }

    public void markComplete(MqttWireMessage mqttWireMessage, MqttException mqttException) {
    }

    public void notifyComplete() {
    }

    public void notifySent() {
    }

    public void reset() throws MqttException {
    }

    public void setActionCallback(IMqttActionListener iMqttActionListener) {
    }

    public void setClient(IMqttAsyncClient iMqttAsyncClient) {
    }

    public void setException(MqttException mqttException) {
    }

    public void setKey(String str) {
    }

    public void setMessage(MqttMessage mqttMessage) {
    }

    public void setMessageID(int i2) {
    }

    public void setNotified(boolean z) {
    }

    public void setTopics(String[] strArr) {
    }

    public void setUserContext(Object obj) {
    }

    public String toString() {
    }

    public void waitForCompletion() throws MqttException {
    }

    public MqttWireMessage waitForResponse() throws MqttException {
    }

    public void waitUntilSent() throws MqttException {
    }

    public void waitForCompletion(long j2) throws MqttException {
    }

    public MqttWireMessage waitForResponse(long j2) throws MqttException {
    }
}
