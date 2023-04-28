package com.tencent.android.tpns.mqtt.internal;

import com.tencent.android.tpns.mqtt.BufferedMessage;
import com.tencent.android.tpns.mqtt.IMqttActionListener;
import com.tencent.android.tpns.mqtt.IMqttAsyncClient;
import com.tencent.android.tpns.mqtt.IMqttMessageListener;
import com.tencent.android.tpns.mqtt.MqttCallback;
import com.tencent.android.tpns.mqtt.MqttCallbackExtended;
import com.tencent.android.tpns.mqtt.MqttClientPersistence;
import com.tencent.android.tpns.mqtt.MqttConnectOptions;
import com.tencent.android.tpns.mqtt.MqttDeliveryToken;
import com.tencent.android.tpns.mqtt.MqttException;
import com.tencent.android.tpns.mqtt.MqttMessage;
import com.tencent.android.tpns.mqtt.MqttPersistenceException;
import com.tencent.android.tpns.mqtt.MqttPingSender;
import com.tencent.android.tpns.mqtt.MqttToken;
import com.tencent.android.tpns.mqtt.MqttTopic;
import com.tencent.android.tpns.mqtt.internal.wire.MqttConnack;
import com.tencent.android.tpns.mqtt.internal.wire.MqttConnect;
import com.tencent.android.tpns.mqtt.internal.wire.MqttDisconnect;
import com.tencent.android.tpns.mqtt.internal.wire.MqttPublish;
import com.tencent.android.tpns.mqtt.internal.wire.MqttWireMessage;
import com.tencent.android.tpns.mqtt.logging.Logger;
import com.tencent.tpns.baseapi.base.util.TTask;
import java.util.Properties;
import java.util.concurrent.ExecutorService;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class ClientComms {
    public static String BUILD_LEVEL = "L${build.level}";
    private static final String CLASS_NAME = "ClientComms";
    private static final byte CLOSED = 4;
    private static final byte CONNECTED = 0;
    private static final byte CONNECTING = 1;
    private static final byte DISCONNECTED = 3;
    private static final byte DISCONNECTING = 2;
    private static final String TAG = "ClientComms";
    public static String VERSION = "${project.version}";
    private static final Logger log = null;
    private CommsCallback callback;
    private IMqttAsyncClient client;
    private ClientState clientState;
    private boolean closePending;
    private Object conLock;
    private MqttConnectOptions conOptions;
    private byte conState;
    private DisconnectedMessageBuffer disconnectedMessageBuffer;
    private ExecutorService executorService;
    private int networkModuleIndex;
    private NetworkModule[] networkModules;
    private MqttClientPersistence persistence;
    private MqttPingSender pingSender;
    private CommsReceiver receiver;
    private boolean resting;
    private CommsSender sender;
    private boolean stoppingComms;
    private CommsTokenStore tokenStore;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class ConnectBG extends TTask {
        public ClientComms clientComms;
        public MqttConnect conPacket;
        public MqttToken conToken;
        public final /* synthetic */ ClientComms this$0;
        private String threadName;

        public ConnectBG(ClientComms clientComms, ClientComms clientComms2, MqttToken mqttToken, MqttConnect mqttConnect, ExecutorService executorService) {
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
        }

        public void start() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class DisconnectBG extends TTask {
        public MqttDisconnect disconnect;
        public long quiesceTimeout;
        public final /* synthetic */ ClientComms this$0;
        private String threadName;
        public MqttToken token;

        public DisconnectBG(ClientComms clientComms, MqttDisconnect mqttDisconnect, long j2, MqttToken mqttToken, ExecutorService executorService) {
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
        }

        public void start() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class ReconnectDisconnectedBufferCallback implements IDisconnectedBufferCallback {
        public final String methodName;
        public final /* synthetic */ ClientComms this$0;

        public ReconnectDisconnectedBufferCallback(ClientComms clientComms, String str) {
        }

        @Override // com.tencent.android.tpns.mqtt.internal.IDisconnectedBufferCallback
        public void publishBufferedMessage(BufferedMessage bufferedMessage) throws MqttException {
        }
    }

    public ClientComms(IMqttAsyncClient iMqttAsyncClient, MqttClientPersistence mqttClientPersistence, MqttPingSender mqttPingSender, ExecutorService executorService) throws MqttException {
    }

    public static /* synthetic */ ExecutorService access$000(ClientComms clientComms) {
    }

    public static /* synthetic */ Logger access$100() {
    }

    public static /* synthetic */ CommsTokenStore access$200(ClientComms clientComms) {
    }

    public static /* synthetic */ NetworkModule[] access$300(ClientComms clientComms) {
    }

    public static /* synthetic */ int access$400(ClientComms clientComms) {
    }

    public static /* synthetic */ CommsReceiver access$500(ClientComms clientComms) {
    }

    public static /* synthetic */ CommsReceiver access$502(ClientComms clientComms, CommsReceiver commsReceiver) {
    }

    public static /* synthetic */ ClientState access$600(ClientComms clientComms) {
    }

    public static /* synthetic */ CommsSender access$700(ClientComms clientComms) {
    }

    public static /* synthetic */ CommsSender access$702(ClientComms clientComms, CommsSender commsSender) {
    }

    public static /* synthetic */ CommsCallback access$800(ClientComms clientComms) {
    }

    private MqttToken handleOldTokens(MqttToken mqttToken, MqttException mqttException) {
    }

    private void handleRunException(Exception exc) {
    }

    private void shutdownExecutorService() {
    }

    public MqttToken checkForActivity() {
    }

    public void close(boolean z) throws MqttException {
    }

    public void connect(MqttConnectOptions mqttConnectOptions, MqttToken mqttToken) throws MqttException {
    }

    public void connectComplete(MqttConnack mqttConnack, MqttException mqttException) throws MqttException {
    }

    public void deleteBufferedMessage(int i2) {
    }

    public void deliveryComplete(MqttPublish mqttPublish) throws MqttPersistenceException {
    }

    public void disconnect(MqttDisconnect mqttDisconnect, long j2, MqttToken mqttToken) throws MqttException {
    }

    public void disconnectForcibly(long j2, long j3) throws MqttException {
    }

    public int getActualInFlight() {
    }

    public MqttMessage getBufferedMessage(int i2) {
    }

    public int getBufferedMessageCount() {
    }

    public IMqttAsyncClient getClient() {
    }

    public ClientState getClientState() {
    }

    public MqttConnectOptions getConOptions() {
    }

    public Properties getDebug() {
    }

    public long getKeepAlive() {
    }

    public int getNetworkModuleIndex() {
    }

    public NetworkModule[] getNetworkModules() {
    }

    public MqttDeliveryToken[] getPendingDeliveryTokens() {
    }

    public CommsReceiver getReceiver() {
    }

    public MqttTopic getTopic(String str) {
    }

    public void internalSend(MqttWireMessage mqttWireMessage, MqttToken mqttToken) throws MqttException {
    }

    public boolean isClosed() {
    }

    public boolean isConnected() {
    }

    public boolean isConnecting() {
    }

    public boolean isDisconnected() {
    }

    public boolean isDisconnecting() {
    }

    public boolean isResting() {
    }

    public void messageArrivedComplete(int i2, int i3) throws MqttException {
    }

    public void notifyConnect() {
    }

    public void removeMessageListener(String str) {
    }

    public void sendNoWait(MqttWireMessage mqttWireMessage, MqttToken mqttToken) throws MqttException {
    }

    public void setCallback(MqttCallback mqttCallback) {
    }

    public void setDisconnectedMessageBuffer(DisconnectedMessageBuffer disconnectedMessageBuffer) {
    }

    public void setManualAcks(boolean z) {
    }

    public void setMessageListener(String str, IMqttMessageListener iMqttMessageListener) {
    }

    public void setNetworkModuleIndex(int i2) {
    }

    public void setNetworkModules(NetworkModule[] networkModuleArr) {
    }

    public void setReconnectCallback(MqttCallbackExtended mqttCallbackExtended) {
    }

    public void setRestingState(boolean z) {
    }

    public void shutdownConnection(MqttToken mqttToken, MqttException mqttException) {
    }

    public MqttToken checkForActivity(IMqttActionListener iMqttActionListener) {
    }

    public void deliveryComplete(int i2) throws MqttPersistenceException {
    }

    public void disconnectForcibly(long j2, long j3, boolean z) throws MqttException {
    }
}
