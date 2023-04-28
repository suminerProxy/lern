package com.facebook.stetho.inspector.network;

import com.facebook.stetho.inspector.network.NetworkEventReporter;
import com.facebook.stetho.inspector.protocol.module.Network;
import com.facebook.stetho.inspector.protocol.module.Page;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.json.JSONObject;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class NetworkEventReporterImpl implements NetworkEventReporter {
    private static NetworkEventReporter sInstance;
    private final AtomicInteger mNextRequestId;
    @Nullable
    private ResourceTypeHelper mResourceTypeHelper;

    private NetworkEventReporterImpl() {
    }

    private static Network.WebSocketFrame convertFrame(NetworkEventReporter.InspectorWebSocketFrame inspectorWebSocketFrame) {
    }

    @Nullable
    public static AsyncPrettyPrinter createPrettyPrinterForResponse(NetworkEventReporter.InspectorResponse inspectorResponse, @Nullable AsyncPrettyPrinterRegistry asyncPrettyPrinterRegistry) {
    }

    private static Page.ResourceType determineResourceType(AsyncPrettyPrinter asyncPrettyPrinter, String str, ResourceTypeHelper resourceTypeHelper) {
    }

    private static JSONObject formatHeadersAsJSON(NetworkEventReporter.InspectorHeaders inspectorHeaders) {
    }

    public static synchronized NetworkEventReporter get() {
    }

    @Nullable
    private String getContentType(NetworkEventReporter.InspectorHeaders inspectorHeaders) {
    }

    @Nullable
    private NetworkPeerManager getPeerManagerIfEnabled() {
    }

    @Nonnull
    private ResourceTypeHelper getResourceTypeHelper() {
    }

    @Nullable
    private static AsyncPrettyPrinter initAsyncPrettyPrinterForResponse(NetworkEventReporter.InspectorResponse inspectorResponse, NetworkPeerManager networkPeerManager) {
    }

    private void loadingFailed(String str, String str2) {
    }

    private void loadingFinished(String str) {
    }

    @Nullable
    private static String readBodyAsString(NetworkPeerManager networkPeerManager, NetworkEventReporter.InspectorRequest inspectorRequest) {
    }

    private static long stethoNow() {
    }

    @Override // com.facebook.stetho.inspector.network.NetworkEventReporter
    public void dataReceived(String str, int i2, int i3) {
    }

    @Override // com.facebook.stetho.inspector.network.NetworkEventReporter
    public void dataSent(String str, int i2, int i3) {
    }

    @Override // com.facebook.stetho.inspector.network.NetworkEventReporter
    public void httpExchangeFailed(String str, String str2) {
    }

    @Override // com.facebook.stetho.inspector.network.NetworkEventReporter
    public InputStream interpretResponseStream(String str, @Nullable String str2, @Nullable String str3, @Nullable InputStream inputStream, ResponseHandler responseHandler) {
    }

    @Override // com.facebook.stetho.inspector.network.NetworkEventReporter
    public boolean isEnabled() {
    }

    @Override // com.facebook.stetho.inspector.network.NetworkEventReporter
    public String nextRequestId() {
    }

    @Override // com.facebook.stetho.inspector.network.NetworkEventReporter
    public void requestWillBeSent(NetworkEventReporter.InspectorRequest inspectorRequest) {
    }

    @Override // com.facebook.stetho.inspector.network.NetworkEventReporter
    public void responseHeadersReceived(NetworkEventReporter.InspectorResponse inspectorResponse) {
    }

    @Override // com.facebook.stetho.inspector.network.NetworkEventReporter
    public void responseReadFailed(String str, String str2) {
    }

    @Override // com.facebook.stetho.inspector.network.NetworkEventReporter
    public void responseReadFinished(String str) {
    }

    @Override // com.facebook.stetho.inspector.network.NetworkEventReporter
    public void webSocketClosed(String str) {
    }

    @Override // com.facebook.stetho.inspector.network.NetworkEventReporter
    public void webSocketCreated(String str, String str2) {
    }

    @Override // com.facebook.stetho.inspector.network.NetworkEventReporter
    public void webSocketFrameError(String str, String str2) {
    }

    @Override // com.facebook.stetho.inspector.network.NetworkEventReporter
    public void webSocketFrameReceived(NetworkEventReporter.InspectorWebSocketFrame inspectorWebSocketFrame) {
    }

    @Override // com.facebook.stetho.inspector.network.NetworkEventReporter
    public void webSocketFrameSent(NetworkEventReporter.InspectorWebSocketFrame inspectorWebSocketFrame) {
    }

    @Override // com.facebook.stetho.inspector.network.NetworkEventReporter
    public void webSocketHandshakeResponseReceived(NetworkEventReporter.InspectorWebSocketResponse inspectorWebSocketResponse) {
    }

    @Override // com.facebook.stetho.inspector.network.NetworkEventReporter
    public void webSocketWillSendHandshakeRequest(NetworkEventReporter.InspectorWebSocketRequest inspectorWebSocketRequest) {
    }
}
