package com.facebook.stetho.inspector;

import com.facebook.stetho.inspector.jsonrpc.JsonRpcException;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;
import com.facebook.stetho.json.ObjectMapper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;
import org.json.JSONException;
import org.json.JSONObject;

@ThreadSafe
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class MethodDispatcher {
    private final Iterable<ChromeDevtoolsDomain> mDomainHandlers;
    @GuardedBy("this")
    private Map<String, MethodDispatchHelper> mMethods;
    private final ObjectMapper mObjectMapper;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class MethodDispatchHelper {
        private final ChromeDevtoolsDomain mInstance;
        private final Method mMethod;
        private final ObjectMapper mObjectMapper;

        public MethodDispatchHelper(ObjectMapper objectMapper, ChromeDevtoolsDomain chromeDevtoolsDomain, Method method) {
        }

        public JSONObject invoke(JsonRpcPeer jsonRpcPeer, @Nullable JSONObject jSONObject) throws InvocationTargetException, IllegalAccessException, JSONException, JsonRpcException {
        }
    }

    public MethodDispatcher(ObjectMapper objectMapper, Iterable<ChromeDevtoolsDomain> iterable) {
    }

    private static Map<String, MethodDispatchHelper> buildDispatchTable(ObjectMapper objectMapper, Iterable<ChromeDevtoolsDomain> iterable) {
    }

    private synchronized MethodDispatchHelper findMethodDispatcher(String str) {
    }

    private static boolean isDevtoolsMethod(Method method) throws IllegalArgumentException {
    }

    public JSONObject dispatch(JsonRpcPeer jsonRpcPeer, String str, @Nullable JSONObject jSONObject) throws JsonRpcException {
    }
}
