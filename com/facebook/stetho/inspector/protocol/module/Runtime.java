package com.facebook.stetho.inspector.protocol.module;

import android.content.Context;
import com.facebook.stetho.inspector.console.RuntimeRepl;
import com.facebook.stetho.inspector.console.RuntimeReplFactory;
import com.facebook.stetho.inspector.helper.ObjectIdMapper;
import com.facebook.stetho.inspector.jsonrpc.DisconnectReceiver;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcException;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcResult;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsMethod;
import com.facebook.stetho.json.ObjectMapper;
import com.facebook.stetho.json.annotation.JsonProperty;
import com.facebook.stetho.json.annotation.JsonValue;
import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class Runtime implements ChromeDevtoolsDomain {
    private static final Map<JsonRpcPeer, Session> sSessions = null;
    private final ObjectMapper mObjectMapper;
    private final RuntimeReplFactory mReplFactory;

    /* renamed from: com.facebook.stetho.inspector.protocol.module.Runtime$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements RuntimeReplFactory {

        /* renamed from: com.facebook.stetho.inspector.protocol.module.Runtime$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class C00581 implements RuntimeRepl {
            public final /* synthetic */ AnonymousClass1 this$1;

            public C00581(AnonymousClass1 anonymousClass1) {
            }

            @Override // com.facebook.stetho.inspector.console.RuntimeRepl
            public Object evaluate(String str) throws Throwable {
            }
        }

        @Override // com.facebook.stetho.inspector.console.RuntimeReplFactory
        public RuntimeRepl newInstance() {
        }
    }

    /* renamed from: com.facebook.stetho.inspector.protocol.module.Runtime$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass2 implements DisconnectReceiver {
        public final /* synthetic */ JsonRpcPeer val$peer;

        public AnonymousClass2(JsonRpcPeer jsonRpcPeer) {
        }

        @Override // com.facebook.stetho.inspector.jsonrpc.DisconnectReceiver
        public void onDisconnect() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class CallArgument {
        @JsonProperty(required = false)
        public String objectId;
        @JsonProperty(required = false)
        public ObjectType type;
        @JsonProperty(required = false)
        public Object value;

        private CallArgument() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class CallFunctionOnRequest {
        @JsonProperty
        public List<CallArgument> arguments;
        @JsonProperty(required = false)
        public Boolean doNotPauseOnExceptionsAndMuteConsole;
        @JsonProperty
        public String functionDeclaration;
        @JsonProperty(required = false)
        public Boolean generatePreview;
        @JsonProperty
        public String objectId;
        @JsonProperty(required = false)
        public Boolean returnByValue;

        private CallFunctionOnRequest() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class CallFunctionOnResponse implements JsonRpcResult {
        @JsonProperty
        public RemoteObject result;
        @JsonProperty(required = false)
        public Boolean wasThrown;

        private CallFunctionOnResponse() {
        }

        public /* synthetic */ CallFunctionOnResponse(AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class EvaluateRequest implements JsonRpcResult {
        @JsonProperty(required = true)
        public String expression;
        @JsonProperty(required = true)
        public String objectGroup;

        private EvaluateRequest() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class EvaluateResponse implements JsonRpcResult {
        @JsonProperty
        public ExceptionDetails exceptionDetails;
        @JsonProperty(required = true)
        public RemoteObject result;
        @JsonProperty(required = true)
        public boolean wasThrown;

        private EvaluateResponse() {
        }

        public /* synthetic */ EvaluateResponse(AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class ExceptionDetails {
        @JsonProperty(required = true)
        public String text;

        private ExceptionDetails() {
        }

        public /* synthetic */ ExceptionDetails(AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class GetPropertiesRequest implements JsonRpcResult {
        @JsonProperty(required = true)
        public String objectId;
        @JsonProperty(required = true)
        public boolean ownProperties;

        private GetPropertiesRequest() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class GetPropertiesResponse implements JsonRpcResult {
        @JsonProperty(required = true)
        public List<PropertyDescriptor> result;

        private GetPropertiesResponse() {
        }

        public /* synthetic */ GetPropertiesResponse(AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class ObjectProtoContainer {
        public final Object object;

        public ObjectProtoContainer(Object obj) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class ObjectSubType {
        private static final /* synthetic */ ObjectSubType[] $VALUES = null;
        public static final ObjectSubType ARRAY = null;
        public static final ObjectSubType DATE = null;
        public static final ObjectSubType ERROR = null;
        public static final ObjectSubType GENERATOR = null;
        public static final ObjectSubType ITERATOR = null;
        public static final ObjectSubType MAP = null;
        public static final ObjectSubType NODE = null;
        public static final ObjectSubType NULL = null;
        public static final ObjectSubType REGEXP = null;
        public static final ObjectSubType SET = null;
        private final String mProtocolValue;

        private ObjectSubType(String str, int i2, String str2) {
        }

        public static ObjectSubType valueOf(String str) {
        }

        public static ObjectSubType[] values() {
        }

        @JsonValue
        public String getProtocolValue() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class ObjectType {
        private static final /* synthetic */ ObjectType[] $VALUES = null;
        public static final ObjectType BOOLEAN = null;
        public static final ObjectType FUNCTION = null;
        public static final ObjectType NUMBER = null;
        public static final ObjectType OBJECT = null;
        public static final ObjectType STRING = null;
        public static final ObjectType SYMBOL = null;
        public static final ObjectType UNDEFINED = null;
        private final String mProtocolValue;

        private ObjectType(String str, int i2, String str2) {
        }

        public static ObjectType valueOf(String str) {
        }

        public static ObjectType[] values() {
        }

        @JsonValue
        public String getProtocolValue() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class RemoteObject {
        @JsonProperty
        public String className;
        @JsonProperty
        public String description;
        @JsonProperty
        public String objectId;
        @JsonProperty
        public ObjectSubType subtype;
        @JsonProperty(required = true)
        public ObjectType type;
        @JsonProperty
        public Object value;
    }

    @Deprecated
    public Runtime() {
    }

    public static /* synthetic */ Map access$100() {
    }

    public static /* synthetic */ String access$300(Object obj) {
    }

    private static String getPropertyClassName(Object obj) {
    }

    @Nonnull
    private static synchronized Session getSession(JsonRpcPeer jsonRpcPeer) {
    }

    public static int mapObject(JsonRpcPeer jsonRpcPeer, Object obj) {
    }

    public static void releaseObject(JsonRpcPeer jsonRpcPeer, Integer num) throws JSONException {
    }

    @ChromeDevtoolsMethod
    public JsonRpcResult callFunctionOn(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) throws JsonRpcException {
    }

    @ChromeDevtoolsMethod
    public JsonRpcResult evaluate(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
    }

    @ChromeDevtoolsMethod
    public JsonRpcResult getProperties(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) throws JsonRpcException {
    }

    @ChromeDevtoolsMethod
    public void releaseObjectGroup(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
    }

    public Runtime(Context context) {
    }

    @ChromeDevtoolsMethod
    public void releaseObject(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) throws JSONException {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class Session {
        private final ObjectMapper mObjectMapper;
        private final ObjectIdMapper mObjects;
        @Nullable
        private RuntimeRepl mRepl;

        private Session() {
        }

        private List<?> arrayToList(Object obj) {
        }

        private EvaluateResponse buildExceptionResponse(Object obj) {
        }

        private EvaluateResponse buildNormalResponse(Object obj) {
        }

        private GetPropertiesResponse getPropertiesForIterable(Iterable<?> iterable, boolean z) {
        }

        private GetPropertiesResponse getPropertiesForMap(Object obj) {
        }

        private GetPropertiesResponse getPropertiesForObject(Object obj) {
        }

        private GetPropertiesResponse getPropertiesForProtoContainer(ObjectProtoContainer objectProtoContainer) {
        }

        @Nonnull
        private synchronized RuntimeRepl getRepl(RuntimeReplFactory runtimeReplFactory) {
        }

        public EvaluateResponse evaluate(RuntimeReplFactory runtimeReplFactory, JSONObject jSONObject) {
        }

        public Object getObjectOrThrow(String str) throws JsonRpcException {
        }

        public ObjectIdMapper getObjects() {
        }

        public GetPropertiesResponse getProperties(JSONObject jSONObject) throws JsonRpcException {
        }

        public RemoteObject objectForRemote(Object obj) {
        }

        public /* synthetic */ Session(AnonymousClass1 anonymousClass1) {
        }
    }

    public Runtime(RuntimeReplFactory runtimeReplFactory) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class PropertyDescriptor {
        @JsonProperty(required = true)
        public final boolean configurable;
        @JsonProperty(required = true)
        public final boolean enumerable;
        @JsonProperty(required = true)
        public final boolean isOwn;
        @JsonProperty(required = true)
        public String name;
        @JsonProperty(required = true)
        public RemoteObject value;
        @JsonProperty(required = true)
        public final boolean writable;

        private PropertyDescriptor() {
        }

        public /* synthetic */ PropertyDescriptor(AnonymousClass1 anonymousClass1) {
        }
    }
}
