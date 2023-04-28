package com.facebook.stetho.inspector.jsonrpc.protocol;

import android.annotation.SuppressLint;
import com.facebook.stetho.json.annotation.JsonProperty;
import com.facebook.stetho.json.annotation.JsonValue;
import javax.annotation.Nullable;
import org.json.JSONObject;

@SuppressLint({"UsingDefaultJsonDeserializer", "EmptyJsonPropertyUse"})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class JsonRpcError {
    @JsonProperty(required = true)
    public ErrorCode code;
    @JsonProperty
    public JSONObject data;
    @JsonProperty(required = true)
    public String message;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class ErrorCode {
        private static final /* synthetic */ ErrorCode[] $VALUES = null;
        public static final ErrorCode INTERNAL_ERROR = null;
        public static final ErrorCode INVALID_PARAMS = null;
        public static final ErrorCode INVALID_REQUEST = null;
        public static final ErrorCode METHOD_NOT_FOUND = null;
        public static final ErrorCode PARSER_ERROR = null;
        private final int mProtocolValue;

        private ErrorCode(String str, int i2, int i3) {
        }

        public static ErrorCode valueOf(String str) {
        }

        public static ErrorCode[] values() {
        }

        @JsonValue
        public int getProtocolValue() {
        }
    }

    public JsonRpcError() {
    }

    public JsonRpcError(ErrorCode errorCode, String str, @Nullable JSONObject jSONObject) {
    }
}
