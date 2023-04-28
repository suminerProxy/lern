package com.tencent.thumbplayer.api;

import android.content.Context;
import androidx.annotation.NonNull;
import com.tencent.thumbplayer.core.common.ITPNativeLibraryExternalLoader;
import com.tencent.thumbplayer.core.common.ITPNativeLogCallback;
import com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyNativeLibLoader;
import com.tencent.thumbplayer.core.downloadproxy.api.ITPProxyAdapter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TPPlayerMgr {
    public static final String BEACON_LOG_HOST_KEY = "beacon_log_host";
    public static final String BEACON_POLICY_HOST_KEY = "beacon_policy_host";
    public static final int EVENT_ID_APP_ENTER_BACKGROUND = 100001;
    public static final int EVENT_ID_APP_ENTER_FOREGROUND = 100002;
    public static final int INVALID_SUGGEST_BITRATE = -1;
    public static final String PLYAER_HOST_KEY = "player_host_config";
    public static final String PROPERTY_MEDIA_DRM_REUSE_BEFORE_INIT_SDK = "PROPERTY_MediaDrmReuse";
    public static final String PROPERTY_VIDEO_MEDIACODEC_CO_EXIST_MAX_CNT = "PROPERTY_VideoMediaCodecCoexistMaxCnt";
    public static final String PROXY_HOST_KEY = "httpproxy_config";
    private static final String TAG = "TPThumbPlayer[TPPlayerMgr.java]";
    public static final String TP_DOWNLOAD_PROXY_MODULE_NAME = "DownloadProxy";
    public static final String TP_PLAYERCORE_MODULE_NAME = "TPCore";
    private static Context mAppContext;
    private static boolean mIsInit;

    /* renamed from: com.tencent.thumbplayer.api.TPPlayerMgr$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class AnonymousClass1 implements ITPNativeLogCallback {
        @Override // com.tencent.thumbplayer.core.common.ITPNativeLogCallback
        public final void onPrintLog(int i2, String str, String str2) {
        }
    }

    /* renamed from: com.tencent.thumbplayer.api.TPPlayerMgr$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class AnonymousClass2 implements Callable<Boolean> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public final Boolean call() {
        }

        @Override // java.util.concurrent.Callable
        public final /* bridge */ /* synthetic */ Boolean call() {
        }
    }

    /* renamed from: com.tencent.thumbplayer.api.TPPlayerMgr$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class AnonymousClass3 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    /* renamed from: com.tencent.thumbplayer.api.TPPlayerMgr$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class AnonymousClass4 implements ITPNativeLibraryExternalLoader {
        public final /* synthetic */ ITPModuleLoader val$loader;

        public AnonymousClass4(ITPModuleLoader iTPModuleLoader) {
        }

        @Override // com.tencent.thumbplayer.core.common.ITPNativeLibraryExternalLoader
        public final boolean loadLib(String str, String str2) {
        }
    }

    /* renamed from: com.tencent.thumbplayer.api.TPPlayerMgr$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class AnonymousClass5 implements ITPDLProxyNativeLibLoader {
        public final /* synthetic */ ITPModuleLoader val$loader;

        public AnonymousClass5(ITPModuleLoader iTPModuleLoader) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyNativeLibLoader
        public final boolean loadLib(String str, String str2) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public @interface BooleanProperty {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public @interface EventId {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public @interface IntegerProperty {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface OnLogListener {
        int d(String str, String str2);

        int e(String str, String str2);

        int i(String str, String str2);

        int v(String str, String str2);

        int w(String str, String str2);
    }

    public static /* synthetic */ void access$000() {
    }

    public static /* synthetic */ Context access$100() {
    }

    public static Context getAppContext() {
    }

    public static String getLibVersion(String str) {
    }

    public static int getOfflineRecordDurationMs(String str, String str2) {
    }

    public static String getOfflineRecordVinfo(String str, String str2) {
    }

    public static boolean getPropertyBoolean(@NonNull String str) {
    }

    public static int getPropertyInteger(@NonNull String str) {
    }

    public static int getSuggestedBitrate() {
    }

    public static String getThumbPlayerVersion() {
    }

    private static Future<Boolean> initAsyncWithWait() {
    }

    private static void initAsyncWithoutWait() {
    }

    private static void initInAsyncThread() {
    }

    public static void initSdk(Context context, String str, int i2) {
    }

    private static void initSync() {
    }

    public static boolean isProxyEnable() {
    }

    public static boolean isThumbPlayerEnable() {
    }

    public static void postEvent(int i2, int i3, int i4, Object obj) {
    }

    private static void preInitSync(Context context, String str, int i2) {
    }

    public static void setDataReportEnable(boolean z) {
    }

    public static void setDebugEnable(boolean z) {
    }

    public static void setHost(String str) {
    }

    public static void setLibLoader(ITPModuleLoader iTPModuleLoader) {
    }

    public static void setOnLogListener(OnLogListener onLogListener) {
    }

    public static void setOutNetIP(String str) {
    }

    public static void setPropertyBool(@NonNull String str, boolean z) {
    }

    public static void setPropertyInteger(@NonNull String str, int i2) {
    }

    public static void setProxyEnable(boolean z) {
    }

    public static void setProxyMaxStorageSizeMB(long j2) {
    }

    public static void setProxyServiceType(int i2) {
    }

    public static void setTPProxyAdapter(ITPProxyAdapter iTPProxyAdapter) {
    }

    public static void setUpcInfo(String str, int i2) {
    }

    public static void setUserInfo(String str, boolean z) {
    }
}
