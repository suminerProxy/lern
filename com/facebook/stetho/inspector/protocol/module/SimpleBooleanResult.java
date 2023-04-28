package com.facebook.stetho.inspector.protocol.module;

import com.facebook.stetho.inspector.jsonrpc.JsonRpcResult;
import com.facebook.stetho.json.annotation.JsonProperty;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class SimpleBooleanResult implements JsonRpcResult {
    @JsonProperty(required = true)
    public boolean result;

    public SimpleBooleanResult() {
    }

    public SimpleBooleanResult(boolean z) {
    }
}
