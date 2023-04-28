package com.mobile.auth.gatewayauth.model.psc_certify_id;

import com.mobile.auth.gatewayauth.model.TopErrorResponse;
import com.mobile.auth.x.e;
import com.mobile.auth.x.f;
import com.mobile.auth.x.g;
import org.json.JSONObject;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class GetCertifyIdRB implements f {
    private static final String KEY_RESPONSE = "alibaba_aliqin_ta_pns_living_create_response";
    private static final String KEY_TOP_ERROR_RESPONSE = "error_response";
    @g(a = KEY_TOP_ERROR_RESPONSE)
    private TopErrorResponse errorResponse;
    @g(a = KEY_RESPONSE)
    private GetCertifyIdTopResponse response;

    /* renamed from: com.mobile.auth.gatewayauth.model.psc_certify_id.GetCertifyIdRB$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends e<GetCertifyIdTopResponse> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ GetCertifyIdRB f5057a;

        public AnonymousClass1(GetCertifyIdRB getCertifyIdRB) {
        }
    }

    /* renamed from: com.mobile.auth.gatewayauth.model.psc_certify_id.GetCertifyIdRB$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 extends e<TopErrorResponse> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ GetCertifyIdRB f5058a;

        public AnonymousClass2(GetCertifyIdRB getCertifyIdRB) {
        }
    }

    @Override // com.mobile.auth.x.f
    public void fromJson(JSONObject jSONObject) {
    }

    public TopErrorResponse getErrorResponse() {
    }

    public GetCertifyIdTopResponse getResponse() {
    }

    public void setErrorResponse(TopErrorResponse topErrorResponse) {
    }

    public void setResponse(GetCertifyIdTopResponse getCertifyIdTopResponse) {
    }

    @Override // com.mobile.auth.x.f
    public JSONObject toJson() {
    }
}
