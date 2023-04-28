package com.facebook.stetho.inspector.protocol.module;

import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcResult;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsMethod;
import com.facebook.stetho.json.annotation.JsonProperty;
import java.util.List;
import org.json.JSONObject;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class HeapProfiler implements ChromeDevtoolsDomain {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class ProfileHeader {
        @JsonProperty(required = true)
        public String title;
        @JsonProperty(required = true)
        public int uid;

        private ProfileHeader() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class ProfileHeaderResponse implements JsonRpcResult {
        @JsonProperty(required = true)
        public List<ProfileHeader> headers;

        private ProfileHeaderResponse() {
        }

        public /* synthetic */ ProfileHeaderResponse(AnonymousClass1 anonymousClass1) {
        }
    }

    @ChromeDevtoolsMethod
    public JsonRpcResult getProfileHeaders(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
    }
}
