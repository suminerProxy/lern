package com.tencent.rtmp;

import android.content.Context;
import com.tencent.liteav.TXLiteAVExternalDecoderFactoryInterface;
import com.tencent.liteav.base.util.CommonUtil;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.sdk.common.LicenseChecker;
import com.tencent.liteav.videoconsumer.decoder.m;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TXLiveBase {
    private static final String TAG = "TXLiveBase";
    private static TXLiveBase instance;
    private static TXLiveBaseListener listener;
    private static c networkTimeCallback;

    /* renamed from: com.tencent.rtmp.TXLiveBase$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class AnonymousClass1 implements LicenseChecker.b {
        @Override // com.tencent.liteav.sdk.common.LicenseChecker.b
        public final void a(int i2, String str) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class b implements LiteavLog.a {
        private b() {
        }

        @Override // com.tencent.liteav.base.util.LiteavLog.a
        public final void a(LiteavLog.b bVar, String str, String str2) {
        }

        public /* synthetic */ b(byte b) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class c implements CommonUtil.a {
        private c() {
        }

        @Override // com.tencent.liteav.base.util.CommonUtil.a
        public final void a(int i2, String str) {
        }

        public /* synthetic */ c(byte b) {
        }
    }

    private TXLiveBase() {
    }

    public static /* synthetic */ TXLiveBaseListener access$200() {
    }

    public static TXLiveBase getInstance() {
    }

    public static long getNetworkTimestamp() {
    }

    public static String getPituSDKVersion() {
    }

    public static String getSDKVersionStr() {
    }

    public static boolean isLibraryPathValid(String str) {
    }

    public static void onUpdateNetworkTime(int i2, String str) {
    }

    public static void setAppID(String str) {
    }

    public static void setAppVersion(String str) {
    }

    public static void setConsoleEnabled(boolean z) {
    }

    public static boolean setExtID(String str, String str2) {
    }

    public static void setExternalDecoderFactory(TXLiteAVExternalDecoderFactoryInterface tXLiteAVExternalDecoderFactoryInterface) {
    }

    public static int setGlobalEnv(String str) {
    }

    public static void setLibraryPath(String str) {
    }

    public static void setListener(TXLiveBaseListener tXLiveBaseListener) {
    }

    public static void setLogLevel(int i2) {
    }

    public static void setPituLicencePath(String str) {
    }

    public static void setUserId(String str) {
    }

    public static int updateNetworkTime() {
    }

    public String getLicenceInfo(Context context) {
    }

    public void setLicence(Context context, String str, String str2) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class a implements m {

        /* renamed from: a  reason: collision with root package name */
        private TXLiteAVExternalDecoderFactoryInterface f12905a;

        public a(TXLiteAVExternalDecoderFactoryInterface tXLiteAVExternalDecoderFactoryInterface) {
        }

        @Override // com.tencent.liteav.videoconsumer.decoder.m
        public final long a() {
        }

        @Override // com.tencent.liteav.videoconsumer.decoder.m
        public final void a(long j2) {
        }
    }
}
