package com.tencent.thumbplayer.core.downloadproxy.jni;

import android.content.Context;
import com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyNativeLibLoader;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TPDownloadProxyNative {
    private static final String FILE_NAME = "TPDownloadProxyNative";
    private static Context appContext;
    private static boolean isLoadDownloadProxySucceed;
    private ITPDLProxyNativeLibLoader mLibLoader;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class SingletonHolder {
        private static final TPDownloadProxyNative INSTANCE = null;

        private SingletonHolder() {
        }

        public static /* synthetic */ TPDownloadProxyNative access$100() {
        }
    }

    public /* synthetic */ TPDownloadProxyNative(AnonymousClass1 anonymousClass1) {
    }

    public static TPDownloadProxyNative getInstance() {
    }

    private static int nativeIntMessageCallback(int i2, int i3, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
    }

    private static void nativeLogCallback(int i2, byte[] bArr, int i3, byte[] bArr2, byte[] bArr3) {
    }

    private static void nativeMessageCallback(int i2, int i3, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
    }

    private static String nativeStringMessageCallback(int i2, int i3, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
    }

    public native int checkResourceStatus(String str, String str2, int i2);

    public native int createDownloadTask(int i2, String str, int i3, int i4);

    public native int deInitService(int i2);

    public native int deleteCache(String str, String str2);

    public Context getAppContext() {
    }

    public native byte[] getClipPlayUrl(int i2, int i3, int i4);

    public native byte[] getErrorCodeStr(int i2);

    public native byte[] getHLSOfflineExttag(String str, String str2, int i2, long j2);

    public native byte[] getNativeInfo(int i2);

    public String getNativeVersion() {
    }

    public native long getResourceSize(String str, String str2);

    public native byte[] getVersion();

    public native int initService(int i2, String str, String str2, String str3);

    public boolean isNativeLoaded() {
    }

    public native boolean isNativeReadyForWork();

    public boolean isReadyForWork() {
    }

    public native int pauseDownload(int i2);

    public native void pushEvent(int i2);

    public native int resumeDownload(int i2);

    public void setAppContext(Context context) {
    }

    public native int setClipInfo(int i2, int i3, String str, int i4, String str2, String str3, String str4);

    public void setLibLoader(ITPDLProxyNativeLibLoader iTPDLProxyNativeLibLoader) {
    }

    public native int setMaxStorageSizeMB(int i2, long j2);

    public native void setPlayerState(int i2, int i3);

    public native void setUserData(String str, String str2);

    public native int startDownload(int i2);

    public native int stopAllDownload(int i2);

    public native int stopDownload(int i2);

    public native void updatePlayerPlayMsg(int i2, int i3, int i4, int i5);

    public native int updateStoragePath(int i2, String str);

    public native void updateTaskInfo(int i2, String str, String str2);

    public native long verifyOfflineCacheSync(String str, int i2, String str2, String str3);

    private TPDownloadProxyNative() {
    }
}
