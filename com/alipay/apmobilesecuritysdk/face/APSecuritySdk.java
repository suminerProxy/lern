package com.alipay.apmobilesecuritysdk.face;

import android.content.Context;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class APSecuritySdk {

    /* renamed from: a  reason: collision with root package name */
    private static APSecuritySdk f571a;
    private static Object c;
    private Context b;

    /* renamed from: com.alipay.apmobilesecuritysdk.face.APSecuritySdk$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f572a;
        public final /* synthetic */ InitResultListener b;
        public final /* synthetic */ APSecuritySdk c;

        public AnonymousClass1(APSecuritySdk aPSecuritySdk, Map map, InitResultListener initResultListener) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface InitResultListener {
        void onResult(TokenResult tokenResult);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class TokenResult {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ APSecuritySdk f573a;
        public String apdid;
        public String apdidToken;
        public String clientKey;
        public String umidToken;

        public TokenResult(APSecuritySdk aPSecuritySdk) {
        }
    }

    private APSecuritySdk(Context context) {
    }

    public static /* synthetic */ Context a(APSecuritySdk aPSecuritySdk) {
    }

    public static APSecuritySdk getInstance(Context context) {
    }

    public static String getUtdid(Context context) {
    }

    public String getApdidToken() {
    }

    public String getSdkName() {
    }

    public String getSdkVersion() {
    }

    public synchronized TokenResult getTokenResult() {
    }

    public void initToken(int i2, Map<String, String> map, InitResultListener initResultListener) {
    }
}
