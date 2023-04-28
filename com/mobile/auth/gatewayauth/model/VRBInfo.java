package com.mobile.auth.gatewayauth.model;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class VRBInfo {
    private AlibabaAliqinPnsNumberVerifyResponse alibaba_aliqin_pns_number_verify_response;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AlibabaAliqinPnsNumberVerifyResponse {
        private String request_id;
        private Result result;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static class Result {
            private String code;
            private String message;
            private Module module;

            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
            public static class Module {
                private String verify_id;
                private String verify_result;

                public String getVerify_id() {
                }

                public String getVerify_result() {
                }

                public void setVerify_id(String str) {
                }

                public void setVerify_result(String str) {
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

    public AlibabaAliqinPnsNumberVerifyResponse getAlibaba_aliqin_pns_number_verify_response() {
    }

    public void setAlibaba_aliqin_pns_number_verify_response(AlibabaAliqinPnsNumberVerifyResponse alibabaAliqinPnsNumberVerifyResponse) {
    }
}
