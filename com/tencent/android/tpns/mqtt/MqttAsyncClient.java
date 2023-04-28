package com.tencent.android.tpns.mqtt;

import com.tencent.android.tpns.mqtt.internal.ClientComms;
import com.tencent.android.tpns.mqtt.internal.NetworkModule;
import com.tencent.android.tpns.mqtt.logging.Logger;
import com.tencent.android.tpns.mqtt.util.Debug;
import java.util.Hashtable;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class MqttAsyncClient implements IMqttAsyncClient {
    private static final String CLASS_NAME = "MqttAsyncClient";
    private static final String CLIENT_ID_PREFIX = "paho";
    private static final long DISCONNECT_TIMEOUT = 10000;
    private static final char MAX_HIGH_SURROGATE = 56319;
    private static final char MIN_HIGH_SURROGATE = 55296;
    private static final long QUIESCE_TIMEOUT = 30000;
    private static final String TAG = "MqttAsyncClient";
    private static Object clientLock;
    private static final Logger log = null;
    private static int reconnectDelay;
    private String clientId;
    public ClientComms comms;
    private MqttConnectOptions connOpts;
    private ScheduledExecutorService executorService;
    private MqttCallback mqttCallback;
    private MqttClientPersistence persistence;
    private Timer reconnectTimer;
    private boolean reconnecting;
    private String serverURI;
    private Hashtable topics;
    private Object userContext;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class MqttReconnectActionListener implements IMqttActionListener {
        public final String methodName;
        public final /* synthetic */ MqttAsyncClient this$0;

        public MqttReconnectActionListener(MqttAsyncClient mqttAsyncClient, String str) {
        }

        private void rescheduleReconnectCycle(int i2) {
        }

        @Override // com.tencent.android.tpns.mqtt.IMqttActionListener
        public void onFailure(IMqttToken iMqttToken, Throwable th) {
        }

        @Override // com.tencent.android.tpns.mqtt.IMqttActionListener
        public void onSuccess(IMqttToken iMqttToken) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class MqttReconnectCallback implements MqttCallbackExtended {
        public final boolean automaticReconnect;
        public final /* synthetic */ MqttAsyncClient this$0;

        public MqttReconnectCallback(MqttAsyncClient mqttAsyncClient, boolean z) {
        }

        @Override // com.tencent.android.tpns.mqtt.MqttCallbackExtended
        public void connectComplete(boolean z, String str) {
        }

        @Override // com.tencent.android.tpns.mqtt.MqttCallback
        public void connectionLost(Throwable th) {
        }

        @Override // com.tencent.android.tpns.mqtt.MqttCallback
        public void deliveryComplete(IMqttDeliveryToken iMqttDeliveryToken) {
        }

        @Override // com.tencent.android.tpns.mqtt.MqttCallback
        public void messageArrived(String str, MqttMessage mqttMessage) throws Exception {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class ReconnectTask extends TimerTask {
        private static final String methodName = "ReconnectTask.run";
        public final /* synthetic */ MqttAsyncClient this$0;

        private ReconnectTask(MqttAsyncClient mqttAsyncClient) {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
        }

        public /* synthetic */ ReconnectTask(MqttAsyncClient mqttAsyncClient, AnonymousClass1 anonymousClass1) {
        }
    }

    public MqttAsyncClient(String str, String str2) throws MqttException {
    }

    public static boolean Character_isHighSurrogate(char c) {
    }

    public static /* synthetic */ Logger access$100() {
    }

    public static /* synthetic */ Timer access$1000(MqttAsyncClient mqttAsyncClient) {
    }

    public static /* synthetic */ void access$200(MqttAsyncClient mqttAsyncClient) {
    }

    public static /* synthetic */ boolean access$302(MqttAsyncClient mqttAsyncClient, boolean z) {
    }

    public static /* synthetic */ void access$400(MqttAsyncClient mqttAsyncClient) {
    }

    public static /* synthetic */ void access$500(MqttAsyncClient mqttAsyncClient) {
    }

    public static /* synthetic */ int access$600() {
    }

    public static /* synthetic */ int access$602(int i2) {
    }

    public static /* synthetic */ String access$700(MqttAsyncClient mqttAsyncClient) {
    }

    public static /* synthetic */ Object access$800() {
    }

    public static /* synthetic */ MqttConnectOptions access$900(MqttAsyncClient mqttAsyncClient) {
    }

    private void attemptReconnect() {
    }

    private NetworkModule createNetworkModule(String str, MqttConnectOptions mqttConnectOptions) throws MqttException, MqttSecurityException {
    }

    public static String generateClientId() {
    }

    private String getHostName(String str) {
    }

    private void startReconnectCycle() {
    }

    private void stopReconnectCycle() {
    }

    public IMqttToken checkPing(Object obj, IMqttActionListener iMqttActionListener) throws MqttException {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttAsyncClient
    public void close() throws MqttException {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttAsyncClient
    public IMqttToken connect(Object obj, IMqttActionListener iMqttActionListener) throws MqttException, MqttSecurityException {
    }

    public NetworkModule[] createNetworkModules(String str, MqttConnectOptions mqttConnectOptions) throws MqttException, MqttSecurityException {
    }

    public void deleteBufferedMessage(int i2) {
    }

    public void destroy() throws MqttException {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttAsyncClient
    public IMqttToken disconnect(Object obj, IMqttActionListener iMqttActionListener) throws MqttException {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttAsyncClient
    public void disconnectForcibly() throws MqttException {
    }

    public MqttMessage getBufferedMessage(int i2) {
    }

    public int getBufferedMessageCount() {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttAsyncClient
    public String getClientId() {
    }

    public String getCurrentServerURI() {
    }

    public Debug getDebug() {
    }

    public int getInFlightMessageCount() {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttAsyncClient
    public IMqttDeliveryToken[] getPendingDeliveryTokens() {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttAsyncClient
    public String getServerURI() {
    }

    public MqttTopic getTopic(String str) {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttAsyncClient
    public boolean isConnected() {
    }

    public boolean isConnecting() {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttAsyncClient
    public void messageArrivedComplete(int i2, int i3) throws MqttException {
    }

    public MqttToken ping(IMqttActionListener iMqttActionListener) throws MqttException {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttAsyncClient
    public IMqttDeliveryToken publish(String str, byte[] bArr, int i2, boolean z, Object obj, IMqttActionListener iMqttActionListener) throws MqttException, MqttPersistenceException {
    }

    public void reconnect() throws MqttException {
    }

    public void setBufferOpts(DisconnectedBufferOptions disconnectedBufferOptions) {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttAsyncClient
    public void setCallback(MqttCallback mqttCallback) {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttAsyncClient
    public void setManualAcks(boolean z) {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttAsyncClient
    public IMqttToken subscribe(String str, int i2, Object obj, IMqttActionListener iMqttActionListener) throws MqttException {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttAsyncClient
    public IMqttToken unsubscribe(String str, Object obj, IMqttActionListener iMqttActionListener) throws MqttException {
    }

    public MqttAsyncClient(String str, String str2, MqttClientPersistence mqttClientPersistence) throws MqttException {
    }

    public void close(boolean z) throws MqttException {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttAsyncClient
    public IMqttToken connect() throws MqttException, MqttSecurityException {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttAsyncClient
    public IMqttToken disconnect() throws MqttException {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttAsyncClient
    public void disconnectForcibly(long j2) throws MqttException {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttAsyncClient
    public IMqttToken subscribe(String str, int i2) throws MqttException {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttAsyncClient
    public IMqttToken unsubscribe(String str) throws MqttException {
    }

    public MqttAsyncClient(String str, String str2, MqttClientPersistence mqttClientPersistence, MqttPingSender mqttPingSender) throws MqttException {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttAsyncClient
    public IMqttToken connect(MqttConnectOptions mqttConnectOptions) throws MqttException, MqttSecurityException {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttAsyncClient
    public IMqttToken disconnect(long j2) throws MqttException {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttAsyncClient
    public void disconnectForcibly(long j2, long j3) throws MqttException {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttAsyncClient
    public IMqttToken subscribe(String[] strArr, int[] iArr) throws MqttException {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttAsyncClient
    public IMqttToken unsubscribe(String[] strArr) throws MqttException {
    }

    public MqttAsyncClient(String str, String str2, MqttClientPersistence mqttClientPersistence, MqttPingSender mqttPingSender, ScheduledExecutorService scheduledExecutorService) throws MqttException {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttAsyncClient
    public IMqttToken connect(MqttConnectOptions mqttConnectOptions, Object obj, IMqttActionListener iMqttActionListener) throws MqttException, MqttSecurityException {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttAsyncClient
    public IMqttToken disconnect(long j2, Object obj, IMqttActionListener iMqttActionListener) throws MqttException {
    }

    public void disconnectForcibly(long j2, long j3, boolean z) throws MqttException {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttAsyncClient
    public IMqttToken subscribe(String[] strArr, int[] iArr, Object obj, IMqttActionListener iMqttActionListener) throws MqttException {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttAsyncClient
    public IMqttToken unsubscribe(String[] strArr, Object obj, IMqttActionListener iMqttActionListener) throws MqttException {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttAsyncClient
    public IMqttDeliveryToken publish(String str, byte[] bArr, int i2, boolean z) throws MqttException, MqttPersistenceException {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttAsyncClient
    public IMqttDeliveryToken publish(String str, MqttMessage mqttMessage) throws MqttException, MqttPersistenceException {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttAsyncClient
    public IMqttDeliveryToken publish(String str, MqttMessage mqttMessage, Object obj, IMqttActionListener iMqttActionListener) throws MqttException, MqttPersistenceException {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttAsyncClient
    public IMqttToken subscribe(String str, int i2, Object obj, IMqttActionListener iMqttActionListener, IMqttMessageListener iMqttMessageListener) throws MqttException {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttAsyncClient
    public IMqttToken subscribe(String str, int i2, IMqttMessageListener iMqttMessageListener) throws MqttException {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttAsyncClient
    public IMqttToken subscribe(String[] strArr, int[] iArr, IMqttMessageListener[] iMqttMessageListenerArr) throws MqttException {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttAsyncClient
    public IMqttToken subscribe(String[] strArr, int[] iArr, Object obj, IMqttActionListener iMqttActionListener, IMqttMessageListener[] iMqttMessageListenerArr) throws MqttException {
    }
}
