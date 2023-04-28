package com.mobile.auth.gatewayauth.model;

import com.mobile.auth.x.f;
import org.json.JSONObject;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class LoginPhoneInfo implements f {
    private String phoneNumber;
    private String protocolName;
    private String protocolUrl;
    private String vendor;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Builder {
        private String phoneNumber;
        private String protocolName;
        private String protocolUrl;
        private String vendor;

        private Builder() {
        }

        public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
        }

        public static /* synthetic */ String access$000(Builder builder) {
        }

        public static /* synthetic */ String access$100(Builder builder) {
        }

        public static /* synthetic */ String access$200(Builder builder) {
        }

        public static /* synthetic */ String access$300(Builder builder) {
        }

        public LoginPhoneInfo build() {
        }

        public Builder phoneNumber(String str) {
        }

        public Builder protocolName(String str) {
        }

        public Builder protocolUrl(String str) {
        }

        public Builder vendor(String str) {
        }
    }

    public LoginPhoneInfo() {
    }

    private LoginPhoneInfo(Builder builder) {
    }

    public /* synthetic */ LoginPhoneInfo(Builder builder, AnonymousClass1 anonymousClass1) {
    }

    public static Builder newLoginPhoneInfo() {
    }

    @Override // com.mobile.auth.x.f
    public void fromJson(JSONObject jSONObject) {
    }

    public String getPhoneNumber() {
    }

    public String getProtocolName() {
    }

    public String getProtocolUrl() {
    }

    public String getVendor() {
    }

    public void setPhoneNumber(String str) {
    }

    public void setProtocolName(String str) {
    }

    public void setProtocolUrl(String str) {
    }

    public void setVendor(String str) {
    }

    @Override // com.mobile.auth.x.f
    public JSONObject toJson() {
    }

    public String toString() {
    }
}
