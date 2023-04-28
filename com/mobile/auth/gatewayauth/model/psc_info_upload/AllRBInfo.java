package com.mobile.auth.gatewayauth.model.psc_info_upload;

import com.mobile.auth.gatewayauth.model.TopErrorResponse;
import com.mobile.auth.x.e;
import com.mobile.auth.x.f;
import org.json.JSONObject;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class AllRBInfo implements f {
    private static final String KEY_RESPONSE = "alibaba_aliqin_pns_vendor_querylist_response";
    private static final String KEY_TOP_ERROR_RESPONSE = "error_response";
    private TopErrorResponse errorResponse;
    private PnsVendorQueryResponse response;

    /* renamed from: com.mobile.auth.gatewayauth.model.psc_info_upload.AllRBInfo$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1 extends e<AllRBInfo> {
    }

    /* renamed from: com.mobile.auth.gatewayauth.model.psc_info_upload.AllRBInfo$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 extends e<PnsVendorQueryResponse> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AllRBInfo f5061a;

        public AnonymousClass2(AllRBInfo allRBInfo) {
        }
    }

    /* renamed from: com.mobile.auth.gatewayauth.model.psc_info_upload.AllRBInfo$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass3 extends e<TopErrorResponse> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AllRBInfo f5062a;

        public AnonymousClass3(AllRBInfo allRBInfo) {
        }
    }

    public static AllRBInfo fromJson(String str) {
    }

    @Override // com.mobile.auth.x.f
    public void fromJson(JSONObject jSONObject) {
    }

    public TopErrorResponse getErrorResponse() {
    }

    public PnsVendorQueryResponse getResponse() {
    }

    public void setErrorResponse(TopErrorResponse topErrorResponse) {
    }

    public void setResponse(PnsVendorQueryResponse pnsVendorQueryResponse) {
    }

    @Override // com.mobile.auth.x.f
    public JSONObject toJson() {
    }
}
