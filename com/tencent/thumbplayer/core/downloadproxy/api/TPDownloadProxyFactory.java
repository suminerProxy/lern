package com.tencent.thumbplayer.core.downloadproxy.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl;
import com.tencent.thumbplayer.core.downloadproxy.client.TPDownloadProxyClient;
import java.util.HashMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TPDownloadProxyFactory {
    private static final String FILE_NAME = "TPDownloadProxyFactory";
    private static TPDownloadProxyFactoryAidl downloadProxyFactoryAidl;
    private static TPDLProxyBindServiceCallback mCallback;
    private static boolean mCanUseAIDL;
    private static ServiceConnection mConnection;
    private static boolean mIsReadyForDownload;
    private static Object mMapObject;
    private static boolean mUseService;
    private static HashMap<Integer, TPDownloadProxyClient> mvTPDownloadProxyClientMap;
    private static HashMap<Integer, ITPDownloadProxy> mvTPDownloadProxyMap;

    /* renamed from: com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyFactory$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class AnonymousClass1 implements ServiceConnection {
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public static /* synthetic */ TPDownloadProxyFactoryAidl access$000() {
    }

    public static /* synthetic */ TPDownloadProxyFactoryAidl access$002(TPDownloadProxyFactoryAidl tPDownloadProxyFactoryAidl) {
    }

    public static /* synthetic */ HashMap access$100() {
    }

    public static /* synthetic */ void access$200(boolean z) {
    }

    public static /* synthetic */ TPDLProxyBindServiceCallback access$300() {
    }

    public static synchronized boolean canUseService() {
    }

    public static boolean ensurePlayManagerService(TPDLProxyBindServiceCallback tPDLProxyBindServiceCallback) {
    }

    public static synchronized boolean getCanUseAIDL() {
    }

    public static String getNativeVersion() {
    }

    public static ITPDownloadProxy getTPDownloadProxy(int i2) {
    }

    private static synchronized ITPDownloadProxy getTPDownloadProxyService(int i2) {
    }

    public static boolean getUseService() {
    }

    public static synchronized boolean isReadyForDownload() {
    }

    public static synchronized boolean isReadyForPlay() {
    }

    private static synchronized void setCanUseAIDL(boolean z) {
    }

    public static synchronized void setReadyForDownload(boolean z) {
    }

    public static void setUseService(boolean z) {
    }
}
