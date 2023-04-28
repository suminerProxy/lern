package com.mobile.auth.gatewayauth.model.psc_sdk_config;

import com.mobile.auth.gatewayauth.model.TopErrorResponse;
import com.mobile.auth.x.e;
import com.mobile.auth.x.f;
import org.json.JSONObject;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class ConfigRB implements f {
    private static final String KEY_RESPONSE = "alibaba_aliqin_psc_query_config_response";
    private static final String KEY_TOP_ERROR_RESPONSE = "error_response";
    private TopErrorResponse errorResponse;
    private PscQueryConfigResponse response;

    /* renamed from: com.mobile.auth.gatewayauth.model.psc_sdk_config.ConfigRB$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1 extends e<ConfigRB> {
    }

    /* renamed from: com.mobile.auth.gatewayauth.model.psc_sdk_config.ConfigRB$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 extends e<PscQueryConfigResponse> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ConfigRB f5066a;

        public AnonymousClass2(ConfigRB configRB) {
        }
    }

    /* renamed from: com.mobile.auth.gatewayauth.model.psc_sdk_config.ConfigRB$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass3 extends e<TopErrorResponse> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ConfigRB f5067a;

        public AnonymousClass3(ConfigRB configRB) {
        }
    }

    public static ConfigRB fromJson(String str) {
    }

    @Override // com.mobile.auth.x.f
    public void fromJson(JSONObject jSONObject) {
    }

    public TopErrorResponse getErrorResponse() {
    }

    public PscQueryConfigResponse getResponse() {
    }

    public void setErrorResponse(TopErrorResponse topErrorResponse) {
    }

    public void setResponse(PscQueryConfigResponse pscQueryConfigResponse) {
    }

    @Override // com.mobile.auth.x.f
    public JSONObject toJson() {
    }
}
