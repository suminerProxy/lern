package com.tencent.tpns.baseapi.core.c;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class a {

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.tpns.baseapi.core.c.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public enum EnumC0259a {
        CLUSTER_DEFAULT("default", "tpns.tencent.com"),
        CLUSTER_SGP("sgp", "tpns.sgp.tencent.com"),
        CLUSTER_HK("hk", "tpns.hk.tencent.com");
        

        /* renamed from: d  reason: collision with root package name */
        private String f13700d;

        /* renamed from: e  reason: collision with root package name */
        private String f13701e;

        EnumC0259a(String str, String str2) {
            this.f13700d = str;
            this.f13701e = str2;
        }

        public String a() {
            return this.f13700d;
        }

        public String b() {
            return this.f13701e;
        }
    }
}
