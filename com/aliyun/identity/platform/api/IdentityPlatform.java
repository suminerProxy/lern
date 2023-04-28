package com.aliyun.identity.platform.api;

import android.content.Context;
import com.aliyun.identity.platform.network.NetworkEnv;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class IdentityPlatform {
    public static final String CLOUD_AUTH_BJ = "https://cloudauth.cn-beijing.aliyuncs.com";
    public static final String CLOUD_AUTH_IPV6_BJ = "https://cloudauth-dualstack.cn-beijing.aliyuncs.com";
    public static final String CLOUD_AUTH_IPV6_SH = "https://cloudauth-dualstack.aliyuncs.com";
    public static final String CLOUD_AUTH_SH = "https://cloudauth.aliyuncs.com";
    private static boolean isBusy = false;
    public static final String kIdentityParamKeyIdCardFaceOnly = "kIdentityParamKeyIdCardFaceOnly";
    public static final String kIdentityParamKeyNextButtonColor = "kIdentityParamKeyNextButtonColor";
    public static final String kIdentityParamKeyOcrMode = "kIdentityParamKeyOcrMode";
    public static final String kIdentityParamKeyRoundProgressColor = "kIdentityParamKeyRoundProgressColor";
    public static final String kIdentityParamKeyScanMaxTime = "kIdentityParamKeyScanMaxTime";
    public static final String kIdentityParamKeyShowBlbumIcon = "kIdentityParamKeyShowBlbumIcon";
    public static final String kIdentityParamKeyShowResult = "kIdentityParamKeyShowResult";
    public static final String kIdentityParamKeyUIMode = "kIdentityParamKeyUIMode";
    public static final String kIdentityParamKeyValidIdCardDate = "kIdentityParamKeyValidIdCardDate";
    public static final String kIdentityParamKeyVideo = "kIdentityParamKeyVideo";
    public static final String kIdentityParamKeyWaterMark = "kIdentityParamKeyWaterMark";
    private static IdentityPlatform s_instance;
    private Context ctx;
    private IdentityCallback identityCallback;
    private long verifyStartTime;

    /* renamed from: com.aliyun.identity.platform.api.IdentityPlatform$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 extends Thread {
        public final /* synthetic */ IdentityPlatform this$0;

        public AnonymousClass1(IdentityPlatform identityPlatform) {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.aliyun.identity.platform.api.IdentityPlatform$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements IdentityRetCallback {
        public final /* synthetic */ IdentityPlatform this$0;

        public AnonymousClass2(IdentityPlatform identityPlatform) {
        }

        @Override // com.aliyun.identity.platform.api.IdentityRetCallback
        public void onIdentityFinish(String str) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class IdentityType {
        private static final /* synthetic */ IdentityType[] $VALUES = null;
        public static final IdentityType IT_BANK = null;
        public static final IdentityType IT_IDCARD = null;
        public static final IdentityType IT_NONE = null;

        private IdentityType(String str, int i2) {
        }

        public static IdentityType valueOf(String str) {
        }

        public static IdentityType[] values() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class IdentityVerifyType {
        private static final /* synthetic */ IdentityVerifyType[] $VALUES = null;
        public static final IdentityVerifyType IVT_SMART_CARD = null;
        public static final IdentityVerifyType IVT_SMART_COMPARE = null;
        public static final IdentityVerifyType IVT_SMART_DETECT = null;
        public static final IdentityVerifyType IVT_SMART_VERIFY = null;
        public static final IdentityVerifyType IVT_UNKNOW = null;

        private IdentityVerifyType(String str, int i2) {
        }

        public static IdentityVerifyType valueOf(String str) {
        }

        public static IdentityVerifyType[] values() {
        }
    }

    private IdentityPlatform() {
    }

    public static /* synthetic */ void access$000(IdentityPlatform identityPlatform, String str) {
    }

    private int errCode2ClientCode(String str) {
    }

    private static String getApDidToken(Context context) {
    }

    public static IdentityPlatform getInstance() {
    }

    public static String getMetaInfo(Context context) {
    }

    public static NetworkEnv getNetworkEnv() {
    }

    private void initCustomParams(Map<String, String> map) {
    }

    private void initLogService(Context context, String str) {
    }

    private void install(Context context, boolean z) {
    }

    public static void reportCrash(String str, IdentityCrashCallback identityCrashCallback) {
    }

    private void sendResponse(String str) {
    }

    public static void setNetworkEnv(NetworkEnv networkEnv) {
    }

    private void verifyStart(String str, Map<String, String> map, IdentityType identityType, IdentityCallback identityCallback) {
    }

    public void faceCompare(String str, Map<String, String> map, IdentityCallback identityCallback) {
    }

    public void faceDetect(String str, Map<String, String> map, IdentityCallback identityCallback) {
    }

    public void faceVerify(String str, Map<String, String> map, IdentityCallback identityCallback) {
    }

    public void installIPv6(Context context) {
    }

    public void verify(String str, Map<String, String> map, IdentityType identityType, IdentityCallback identityCallback) {
    }

    public void install(Context context) {
    }
}
