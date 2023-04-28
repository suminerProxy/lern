package com.mobile.auth.gatewayauth.model.psc_certify_id;

import com.alipay.sdk.util.l;
import com.mobile.auth.x.e;
import com.mobile.auth.x.f;
import com.mobile.auth.x.g;
import org.json.JSONObject;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class GetCertifyIdTopResponse implements f {
    @g(a = "request_id")
    private String requestId;
    @g(a = l.c)
    private GetCertifyIdResult result;

    /* renamed from: com.mobile.auth.gatewayauth.model.psc_certify_id.GetCertifyIdTopResponse$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends e<GetCertifyIdResult> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ GetCertifyIdTopResponse f5060a;

        public AnonymousClass1(GetCertifyIdTopResponse getCertifyIdTopResponse) {
        }
    }

    @Override // com.mobile.auth.x.f
    public void fromJson(JSONObject jSONObject) {
    }

    public String getRequestId() {
    }

    public GetCertifyIdResult getResult() {
    }

    public void setRequestId(String str) {
    }

    public void setResult(GetCertifyIdResult getCertifyIdResult) {
    }

    @Override // com.mobile.auth.x.f
    public JSONObject toJson() {
    }
}
