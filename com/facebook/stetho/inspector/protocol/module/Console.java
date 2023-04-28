package com.facebook.stetho.inspector.protocol.module;

import android.annotation.SuppressLint;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsMethod;
import com.facebook.stetho.json.annotation.JsonProperty;
import com.facebook.stetho.json.annotation.JsonValue;
import org.json.JSONObject;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class Console implements ChromeDevtoolsDomain {

    @SuppressLint({"UsingDefaultJsonDeserializer", "EmptyJsonPropertyUse"})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class CallFrame {
        @JsonProperty(required = true)
        public int columnNumber;
        @JsonProperty(required = true)
        public String functionName;
        @JsonProperty(required = true)
        public int lineNumber;
        @JsonProperty(required = true)
        public String url;

        public CallFrame() {
        }

        public CallFrame(String str, String str2, int i2, int i3) {
        }
    }

    @SuppressLint({"UsingDefaultJsonDeserializer", "EmptyJsonPropertyUse"})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class ConsoleMessage {
        @JsonProperty(required = true)
        public MessageLevel level;
        @JsonProperty(required = true)
        public MessageSource source;
        @JsonProperty(required = true)
        public String text;
    }

    @SuppressLint({"UsingDefaultJsonDeserializer", "EmptyJsonPropertyUse"})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class MessageAddedRequest {
        @JsonProperty(required = true)
        public ConsoleMessage message;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class MessageLevel {
        private static final /* synthetic */ MessageLevel[] $VALUES = null;
        public static final MessageLevel DEBUG = null;
        public static final MessageLevel ERROR = null;
        public static final MessageLevel LOG = null;
        public static final MessageLevel WARNING = null;
        private final String mProtocolValue;

        private MessageLevel(String str, int i2, String str2) {
        }

        public static MessageLevel valueOf(String str) {
        }

        public static MessageLevel[] values() {
        }

        @JsonValue
        public String getProtocolValue() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class MessageSource {
        private static final /* synthetic */ MessageSource[] $VALUES = null;
        public static final MessageSource APPCACHE = null;
        public static final MessageSource CONSOLE_API = null;
        public static final MessageSource CSS = null;
        public static final MessageSource JAVASCRIPT = null;
        public static final MessageSource NETWORK = null;
        public static final MessageSource OTHER = null;
        public static final MessageSource RENDERING = null;
        public static final MessageSource SECURITY = null;
        public static final MessageSource STORAGE = null;
        public static final MessageSource XML = null;
        private final String mProtocolValue;

        private MessageSource(String str, int i2, String str2) {
        }

        public static MessageSource valueOf(String str) {
        }

        public static MessageSource[] values() {
        }

        @JsonValue
        public String getProtocolValue() {
        }
    }

    @ChromeDevtoolsMethod
    public void disable(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
    }

    @ChromeDevtoolsMethod
    public void enable(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
    }
}
