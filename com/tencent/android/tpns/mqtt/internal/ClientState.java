package com.tencent.android.tpns.mqtt.internal;

import com.tencent.android.tpns.mqtt.IMqttActionListener;
import com.tencent.android.tpns.mqtt.MqttClientPersistence;
import com.tencent.android.tpns.mqtt.MqttException;
import com.tencent.android.tpns.mqtt.MqttPersistable;
import com.tencent.android.tpns.mqtt.MqttPersistenceException;
import com.tencent.android.tpns.mqtt.MqttPingSender;
import com.tencent.android.tpns.mqtt.MqttToken;
import com.tencent.android.tpns.mqtt.internal.wire.MqttAck;
import com.tencent.android.tpns.mqtt.internal.wire.MqttPublish;
import com.tencent.android.tpns.mqtt.internal.wire.MqttWireMessage;
import com.tencent.android.tpns.mqtt.logging.Logger;
import java.util.Hashtable;
import java.util.Properties;
import java.util.Vector;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class ClientState {
    private static final String CLASS_NAME = "ClientState";
    private static final int MAX_MSG_ID = 65535;
    private static final int MIN_MSG_ID = 1;
    private static final String PERSISTENCE_CONFIRMED_PREFIX = "sc-";
    private static final String PERSISTENCE_RECEIVED_PREFIX = "r-";
    private static final String PERSISTENCE_SENT_BUFFERED_PREFIX = "sb-";
    private static final String PERSISTENCE_SENT_PREFIX = "s-";
    private static final Logger log = null;
    private int actualInFlight;
    private CommsCallback callback;
    private boolean cleanSession;
    private ClientComms clientComms;
    private boolean connected;
    private int inFlightPubRels;
    private Hashtable inUseMsgIds;
    private Hashtable inboundQoS2;
    private long keepAlive;
    private long lastInboundActivity;
    private long lastOutboundActivity;
    private long lastPing;
    private int maxInflight;
    private int nextMsgId;
    private Hashtable outboundQoS0;
    private Hashtable outboundQoS1;
    private Hashtable outboundQoS2;
    private volatile Vector pendingFlows;
    private volatile Vector pendingMessages;
    private MqttClientPersistence persistence;
    private MqttWireMessage pingCommand;
    private int pingOutstanding;
    private Object pingOutstandingLock;
    private MqttPingSender pingSender;
    private Object queueLock;
    private Object quiesceLock;
    private boolean quiescing;
    private CommsTokenStore tokenStore;

    public ClientState(MqttClientPersistence mqttClientPersistence, CommsTokenStore commsTokenStore, CommsCallback commsCallback, ClientComms clientComms, MqttPingSender mqttPingSender) throws MqttException {
    }

    private void decrementInFlight() {
    }

    private synchronized int getNextMessageId() throws MqttException {
    }

    private String getReceivedPersistenceKey(MqttWireMessage mqttWireMessage) {
    }

    private String getSendBufferedPersistenceKey(MqttWireMessage mqttWireMessage) {
    }

    private String getSendConfirmPersistenceKey(MqttWireMessage mqttWireMessage) {
    }

    private String getSendPersistenceKey(MqttWireMessage mqttWireMessage) {
    }

    private void insertInOrder(Vector vector, MqttWireMessage mqttWireMessage) {
    }

    private Vector reOrder(Vector vector) {
    }

    private synchronized void releaseMessageId(int i2) {
    }

    private void restoreInflightMessages() {
    }

    private MqttWireMessage restoreMessage(String str, MqttPersistable mqttPersistable) throws MqttException {
    }

    public MqttToken checkForActivity(IMqttActionListener iMqttActionListener) throws MqttException {
    }

    public boolean checkQuiesceLock() {
    }

    public void clearState() throws MqttException {
    }

    public void close() {
    }

    public void connected() {
    }

    public void deliveryComplete(MqttPublish mqttPublish) throws MqttPersistenceException {
    }

    public void disconnected(MqttException mqttException) {
    }

    public MqttWireMessage get() throws MqttException {
    }

    public int getActualInFlight() {
    }

    public boolean getCleanSession() {
    }

    public Properties getDebug() {
    }

    public long getKeepAlive() {
    }

    public int getMaxInFlight() {
    }

    public void notifyComplete(MqttToken mqttToken) throws MqttException {
    }

    public void notifyQueueLock() {
    }

    public void notifyReceivedAck(MqttAck mqttAck) throws MqttException {
    }

    public void notifyReceivedBytes(int i2) {
    }

    public void notifyReceivedMsg(MqttWireMessage mqttWireMessage) throws MqttException {
    }

    public void notifyResult(MqttWireMessage mqttWireMessage, MqttToken mqttToken, MqttException mqttException) {
    }

    public void notifySent(MqttWireMessage mqttWireMessage) {
    }

    public void notifySentBytes(int i2) {
    }

    public void persistBufferedMessage(MqttWireMessage mqttWireMessage) {
    }

    public void quiesce(long j2) {
    }

    public Vector resolveOldTokens(MqttException mqttException) {
    }

    public void restoreState() throws MqttException {
    }

    public void send(MqttWireMessage mqttWireMessage, MqttToken mqttToken) throws MqttException {
    }

    public void setCleanSession(boolean z) {
    }

    public void setKeepAliveInterval(long j2) {
    }

    public void setKeepAliveSecs(long j2) {
    }

    public void setMaxInflight(int i2) {
    }

    public void unPersistBufferedMessage(MqttWireMessage mqttWireMessage) {
    }

    public void undo(MqttPublish mqttPublish) throws MqttPersistenceException {
    }

    private String getReceivedPersistenceKey(int i2) {
    }

    public void deliveryComplete(int i2) throws MqttPersistenceException {
    }
}
