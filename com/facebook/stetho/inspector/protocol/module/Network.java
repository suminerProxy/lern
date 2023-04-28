package com.facebook.stetho.inspector.protocol.module;

import android.content.Context;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcException;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcResult;
import com.facebook.stetho.inspector.network.AsyncPrettyPrinterInitializer;
import com.facebook.stetho.inspector.network.NetworkPeerManager;
import com.facebook.stetho.inspector.network.ResponseBodyFileManager;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsMethod;
import com.facebook.stetho.inspector.protocol.module.Console;
import com.facebook.stetho.inspector.protocol.module.Page;
import com.facebook.stetho.json.annotation.JsonProperty;
import com.facebook.stetho.json.annotation.JsonValue;
import java.io.IOException;
import java.util.List;
import org.json.JSONObject;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class Network implements ChromeDevtoolsDomain {
    private final NetworkPeerManager mNetworkPeerManager;
    private final ResponseBodyFileManager mResponseBodyFileManager;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class DataReceivedParams {
        @JsonProperty(required = true)
        public int dataLength;
        @JsonProperty(required = true)
        public int encodedDataLength;
        @JsonProperty(required = true)
        public String requestId;
        @JsonProperty(required = true)
        public double timestamp;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class GetResponseBodyResponse implements JsonRpcResult {
        @JsonProperty(required = true)
        public boolean base64Encoded;
        @JsonProperty(required = true)
        public String body;

        private GetResponseBodyResponse() {
        }

        public /* synthetic */ GetResponseBodyResponse(AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class Initiator {
        @JsonProperty
        public List<Console.CallFrame> stackTrace;
        @JsonProperty(required = true)
        public InitiatorType type;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class InitiatorType {
        private static final /* synthetic */ InitiatorType[] $VALUES = null;
        public static final InitiatorType OTHER = null;
        public static final InitiatorType PARSER = null;
        public static final InitiatorType SCRIPT = null;
        private final String mProtocolValue;

        private InitiatorType(String str, int i2, String str2) {
        }

        public static InitiatorType valueOf(String str) {
        }

        public static InitiatorType[] values() {
        }

        @JsonValue
        public String getProtocolValue() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class LoadingFailedParams {
        @JsonProperty(required = true)
        public String errorText;
        @JsonProperty(required = true)
        public String requestId;
        @JsonProperty(required = true)
        public double timestamp;
        @JsonProperty
        public Page.ResourceType type;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class LoadingFinishedParams {
        @JsonProperty(required = true)
        public String requestId;
        @JsonProperty(required = true)
        public double timestamp;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class Request {
        @JsonProperty(required = true)
        public JSONObject headers;
        @JsonProperty(required = true)
        public String method;
        @JsonProperty
        public String postData;
        @JsonProperty(required = true)
        public String url;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class RequestWillBeSentParams {
        @JsonProperty(required = true)
        public String documentURL;
        @JsonProperty(required = true)
        public String frameId;
        @JsonProperty(required = true)
        public Initiator initiator;
        @JsonProperty(required = true)
        public String loaderId;
        @JsonProperty
        public Response redirectResponse;
        @JsonProperty(required = true)
        public Request request;
        @JsonProperty(required = true)
        public String requestId;
        @JsonProperty(required = true)
        public double timestamp;
        @JsonProperty
        public Page.ResourceType type;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class ResourceTiming {
        @JsonProperty(required = true)
        public double connectionEnd;
        @JsonProperty(required = true)
        public double connectionStart;
        @JsonProperty(required = true)
        public double dnsEnd;
        @JsonProperty(required = true)
        public double dnsStart;
        @JsonProperty(required = true)
        public double proxyEnd;
        @JsonProperty(required = true)
        public double proxyStart;
        @JsonProperty(required = true)
        public double receivedHeadersEnd;
        @JsonProperty(required = true)
        public double requestTime;
        @JsonProperty(required = true)
        public double sendEnd;
        @JsonProperty(required = true)
        public double sendStart;
        @JsonProperty(required = true)
        public double sslEnd;
        @JsonProperty(required = true)
        public double sslStart;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class Response {
        @JsonProperty(required = true)
        public int connectionId;
        @JsonProperty(required = true)
        public boolean connectionReused;
        @JsonProperty(required = true)
        public Boolean fromDiskCache;
        @JsonProperty(required = true)
        public JSONObject headers;
        @JsonProperty
        public String headersText;
        @JsonProperty(required = true)
        public String mimeType;
        @JsonProperty
        public JSONObject requestHeaders;
        @JsonProperty
        public String requestHeadersTest;
        @JsonProperty(required = true)
        public int status;
        @JsonProperty(required = true)
        public String statusText;
        @JsonProperty
        public ResourceTiming timing;
        @JsonProperty(required = true)
        public String url;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class ResponseReceivedParams {
        @JsonProperty(required = true)
        public String frameId;
        @JsonProperty(required = true)
        public String loaderId;
        @JsonProperty(required = true)
        public String requestId;
        @JsonProperty(required = true)
        public Response response;
        @JsonProperty(required = true)
        public double timestamp;
        @JsonProperty(required = true)
        public Page.ResourceType type;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class WebSocketClosedParams {
        @JsonProperty(required = true)
        public String requestId;
        @JsonProperty(required = true)
        public double timestamp;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class WebSocketCreatedParams {
        @JsonProperty(required = true)
        public String requestId;
        @JsonProperty(required = true)
        public String url;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class WebSocketFrame {
        @JsonProperty(required = true)
        public boolean mask;
        @JsonProperty(required = true)
        public int opcode;
        @JsonProperty(required = true)
        public String payloadData;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class WebSocketFrameErrorParams {
        @JsonProperty(required = true)
        public String errorMessage;
        @JsonProperty(required = true)
        public String requestId;
        @JsonProperty(required = true)
        public double timestamp;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class WebSocketFrameReceivedParams {
        @JsonProperty(required = true)
        public String requestId;
        @JsonProperty(required = true)
        public WebSocketFrame response;
        @JsonProperty(required = true)
        public double timestamp;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class WebSocketFrameSentParams {
        @JsonProperty(required = true)
        public String requestId;
        @JsonProperty(required = true)
        public WebSocketFrame response;
        @JsonProperty(required = true)
        public double timestamp;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class WebSocketHandshakeResponseReceivedParams {
        @JsonProperty(required = true)
        public String requestId;
        @JsonProperty(required = true)
        public WebSocketResponse response;
        @JsonProperty(required = true)
        public double timestamp;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class WebSocketRequest {
        @JsonProperty(required = true)
        public JSONObject headers;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class WebSocketResponse {
        @JsonProperty(required = true)
        public JSONObject headers;
        @JsonProperty
        public String headersText;
        @JsonProperty
        public JSONObject requestHeaders;
        @JsonProperty
        public String requestHeadersText;
        @JsonProperty(required = true)
        public int status;
        @JsonProperty(required = true)
        public String statusText;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class WebSocketWillSendHandshakeRequestParams {
        @JsonProperty(required = true)
        public WebSocketRequest request;
        @JsonProperty(required = true)
        public String requestId;
        @JsonProperty(required = true)
        public double timestamp;
        @JsonProperty(required = true)
        public double wallTime;
    }

    public Network(Context context) {
    }

    private GetResponseBodyResponse readResponseBody(String str) throws IOException, JsonRpcException {
    }

    @ChromeDevtoolsMethod
    public void disable(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
    }

    @ChromeDevtoolsMethod
    public void enable(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
    }

    @ChromeDevtoolsMethod
    public JsonRpcResult getResponseBody(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) throws JsonRpcException {
    }

    public void setPrettyPrinterInitializer(AsyncPrettyPrinterInitializer asyncPrettyPrinterInitializer) {
    }

    @ChromeDevtoolsMethod
    public void setUserAgentOverride(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
    }
}
