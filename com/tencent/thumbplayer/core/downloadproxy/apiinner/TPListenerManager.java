package com.tencent.thumbplayer.core.downloadproxy.apiinner;

import android.net.Network;
import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadListener;
import com.tencent.thumbplayer.core.downloadproxy.api.ITPOfflineDownloadListener;
import com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener;
import com.tencent.thumbplayer.core.downloadproxy.api.ITPPreLoadListener;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TPListenerManager {
    private static final String FILE_NAME = "TPListenerManager";
    private static final int MSG_CONFIG_URL = 2011;
    private static final int MSG_CURRENT_CDN_URL = 5;
    private static final int MSG_CURRENT_CDN_URL_INFO = 6;
    private static final int MSG_DOWNLOAD_PROTOCOL = 9;
    private static final int MSG_DOWNLOAD_STATUS = 8;
    private static final int MSG_ERROR = 4;
    private static final int MSG_FINISH = 3;
    private static final int MSG_MULTI_NETWORK = 2012;
    private static final int MSG_NOTIFY_FLV_PRELOAD_STATUS = 2009;
    private static final int MSG_NOTIFY_HTTP_HEADER = 2006;
    private static final int MSG_NOTIFY_LOSE_PACKAGE_CEHCK = 2004;
    private static final int MSG_NOTIFY_M3U8_CONTENT = 2007;
    private static final int MSG_NOTIFY_PLAYER_SWITCH_DEFINITION = 2003;
    private static final int MSG_NOTIFY_SOCKET_FD = 2008;
    private static final int MSG_PLAY_VIDEO_NOT_FOUND = 101;
    private static final int MSG_PREPARE_FINISH = 50;
    private static final int MSG_PROGRESS = 2;
    private static final int MSG_PROXY_CANCEL_READ_DATA = 202;
    private static final int MSG_PROXY_GET_CONTENT_TYPE = 205;
    private static final int MSG_PROXY_GET_DATA_FILE_PATH = 204;
    private static final int MSG_PROXY_GET_DATA_TOTAL_SIZE = 203;
    private static final int MSG_PROXY_READ_DATA = 201;
    private static final int MSG_PROXY_START_READ_DATA = 200;
    private static final int MSG_QUIC_DOWNLOAD_STATUS = 3001;
    private static final int MSG_REPORT_QUIC_QUALITY = 3002;
    private static final int MSG_REPORT_URL = 2010;
    private static final int MSG_URL_EXPIRED = 7;
    private static final int MSG_WUJI_CONFIG_URL = 2013;
    private static final Object OFFLINE_LISTENER_MAP_MUTEX = null;
    private static final Object PLAY_LISTENER_MAP_MUTEX = null;
    private static final Object PRELOAD_LISTENER_MAP_MUTEX = null;
    private static final String THREAD_NAME = "TVKDL-Listener";
    private ITPDownloadListener mITPDownloadListener;
    private Handler mMsgHandler;
    private HandlerThread mMsgHandlerThread;
    private Network mNetwork;
    private Map<Integer, ITPOfflineDownloadListener> mOfflineDownloadListenerMap;
    private Map<Integer, ITPPlayListener> mPlayListenerMap;
    private Map<Integer, ITPPreLoadListener> mPreLoadListenerMap;
    private Runnable updatePlayerInfo;

    /* renamed from: com.tencent.thumbplayer.core.downloadproxy.apiinner.TPListenerManager$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ TPListenerManager this$0;

        public AnonymousClass1(TPListenerManager tPListenerManager) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.thumbplayer.core.downloadproxy.apiinner.TPListenerManager$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements Runnable {
        public final /* synthetic */ TPListenerManager this$0;
        public final /* synthetic */ Object val$arg1;
        public final /* synthetic */ Object val$arg2;
        public final /* synthetic */ Object val$arg3;
        public final /* synthetic */ Object val$arg4;
        public final /* synthetic */ Object val$arg5;
        public final /* synthetic */ int val$message;
        public final /* synthetic */ int val$taskId;

        public AnonymousClass2(TPListenerManager tPListenerManager, int i2, int i3, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.thumbplayer.core.downloadproxy.apiinner.TPListenerManager$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements Runnable {
        public final /* synthetic */ TPListenerManager this$0;
        public final /* synthetic */ int val$sendPackageCount;

        public AnonymousClass3(TPListenerManager tPListenerManager, int i2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class SingletonHolder {
        private static final TPListenerManager INSTANCE = null;

        private SingletonHolder() {
        }

        public static /* synthetic */ TPListenerManager access$100() {
        }
    }

    public /* synthetic */ TPListenerManager(AnonymousClass1 anonymousClass1) {
    }

    public static /* synthetic */ Object access$200() {
    }

    public static /* synthetic */ Map access$300(TPListenerManager tPListenerManager) {
    }

    public static /* synthetic */ Runnable access$400(TPListenerManager tPListenerManager) {
    }

    public static /* synthetic */ Handler access$500(TPListenerManager tPListenerManager) {
    }

    public static /* synthetic */ void access$600(TPListenerManager tPListenerManager, int i2, int i3, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
    }

    private void dispatchCallbackMessage(int i2, int i3, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
    }

    private void dispatchOfflineDownloadMessage(ITPOfflineDownloadListener iTPOfflineDownloadListener, int i2, int i3, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
    }

    private void dispatchPlayMessage(ITPPlayListener iTPPlayListener, int i2, int i3, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
    }

    private void dispatchPreLoadMessage(ITPPreLoadListener iTPPreLoadListener, int i2, int i3, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
    }

    public static TPListenerManager getInstance() {
    }

    public ITPOfflineDownloadListener getOfflineDownloadListener(int i2) {
    }

    public ITPPlayListener getPlaylistener(int i2) {
    }

    public ITPPreLoadListener getPreLoadListener(int i2) {
    }

    public synchronized void handleCallbackMessage(int i2, int i3, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
    }

    public int handleIntCallbackMessage(int i2, int i3, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
    }

    public String handleStringCallbackMessage(int i2, int i3, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
    }

    public void initHandler() {
    }

    public void removeAllPlayListener() {
    }

    public void removeAllPreLoadListener() {
    }

    public void removeOfflineDownloadListener(int i2) {
    }

    public void removePlayListener(int i2) {
    }

    public void removePreLoadListener(int i2) {
    }

    public void setITPDownloadListener(ITPDownloadListener iTPDownloadListener) {
    }

    public void setNetwork(Network network) {
    }

    public void setOfflineDownloadListener(int i2, ITPOfflineDownloadListener iTPOfflineDownloadListener) {
    }

    public void setPlayListener(int i2, ITPPlayListener iTPPlayListener) {
    }

    public void setPreLoadListener(int i2, ITPPreLoadListener iTPPreLoadListener) {
    }

    private TPListenerManager() {
    }
}
