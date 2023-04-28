package com.mobile.auth.gatewayauth.utils;

import android.content.Context;
import com.mobile.auth.gatewayauth.annotations.SafeProtector;
import com.mobile.auth.gatewayauth.manager.SystemManager;
import com.mobile.auth.gatewayauth.manager.VendorSdkInfoManager;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class TokenGenerator {

    /* renamed from: a  reason: collision with root package name */
    private com.mobile.auth.s.a f5074a;
    private SystemManager b;
    private VendorSdkInfoManager c;

    public TokenGenerator(com.mobile.auth.s.a aVar, SystemManager systemManager, VendorSdkInfoManager vendorSdkInfoManager) {
    }

    @SafeProtector
    private native String assembleCustomizeToken(Context context, String str, String str2, String str3, String str4, String str5, String str6);

    @SafeProtector
    private native String generateCsrf(String str);

    public String a(Context context, String str, String str2, String str3, boolean z, String str4, String str5, String str6, boolean z2) {
    }

    @SafeProtector
    public native String assembleToken(Context context, String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, String str8, String str9, boolean z2);
}
