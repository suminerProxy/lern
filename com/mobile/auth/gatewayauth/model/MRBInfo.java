package com.mobile.auth.gatewayauth.model;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class MRBInfo {
    private AlibabaAliqinPnsMobileGetResponse alibaba_aliqin_pns_mobile_get_response;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AlibabaAliqinPnsMobileGetResponse {
        private String request_id;
        private Result result;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static class Result {
            private String code;
            private String message;
            private Module module;

            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
            public static class Module {
                private String mobile;

                public String getMobile() {
                }

                public void setMobile(String str) {
                }

                public String toString() {
                }
            }

            public String getCode() {
            }

            public String getMessage() {
            }

            public Module getModule() {
            }

            public void setCode(String str) {
            }

            public void setMessage(String str) {
            }

            public void setModule(Module module) {
            }

            public String toString() {
            }
        }

        public String getRequest_id() {
        }

        public Result getResult() {
        }

        public void setRequest_id(String str) {
        }

        public void setResult(Result result) {
        }
    }

    public AlibabaAliqinPnsMobileGetResponse getAlibaba_aliqin_pns_mobile_get_response() {
    }

    public void setAlibaba_aliqin_pns_mobile_get_response(AlibabaAliqinPnsMobileGetResponse alibabaAliqinPnsMobileGetResponse) {
    }

    public String toString() {
    }
}
