package com.tencent.thumbplayer.core.downloadproxy.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl;
import com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl;
import com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl;
import com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadParamAidl;
import com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl;
import com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy;
import com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener;
import com.tencent.thumbplayer.core.downloadproxy.api.ITPPreLoadListener;
import java.util.HashMap;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TPDownloadProxyService extends Service {
    private static final String FILE_NAME = "TPDownloadProxyService";
    private TPDownloadProxyFactoryAidl.Stub downloadProxyFactory;
    private int pid;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class DownloadProxy extends ITPDownloadProxyAidl.Stub {
        private ITPDownloadProxy downloadProxy;
        public final /* synthetic */ TPDownloadProxyService this$0;

        /* renamed from: com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService$DownloadProxy$3  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass3 implements ITPPreLoadListener {
            public final /* synthetic */ DownloadProxy this$1;
            public final /* synthetic */ ITPPreLoadListenerAidl val$preloadListener;

            public AnonymousClass3(DownloadProxy downloadProxy, ITPPreLoadListenerAidl iTPPreLoadListenerAidl) {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPreLoadListener
            public void onPrepareDownloadProgressUpdate(int i2, int i3, long j2, long j3, String str) {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPreLoadListener
            public void onPrepareError(int i2, int i3, String str) {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPreLoadListener
            public void onPrepareOK() {
            }
        }

        /* renamed from: com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService$DownloadProxy$4  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass4 implements ITPPreLoadListener {
            public final /* synthetic */ DownloadProxy this$1;
            public final /* synthetic */ ITPPreLoadListenerAidl val$preloadListener;

            public AnonymousClass4(DownloadProxy downloadProxy, ITPPreLoadListenerAidl iTPPreLoadListenerAidl) {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPreLoadListener
            public void onPrepareDownloadProgressUpdate(int i2, int i3, long j2, long j3, String str) {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPreLoadListener
            public void onPrepareError(int i2, int i3, String str) {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPreLoadListener
            public void onPrepareOK() {
            }
        }

        public DownloadProxy(TPDownloadProxyService tPDownloadProxyService, int i2) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public int checkResourceStatus(String str, String str2, int i2) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public String getClipPlayUrl(int i2, int i3, int i4) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public String getNativeInfo(int i2) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public String getPlayErrorCodeStr(int i2) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public String getPlayUrl(int i2, int i3) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public long getResourceSize(String str, String str2) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public int init(String str) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public int pauseDownload(int i2) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public void pushEvent(int i2) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public int resumeDownload(int i2) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public boolean setClipInfo(int i2, int i3, String str, TPDownloadParamAidl tPDownloadParamAidl) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public void setMaxStorageSizeMB(long j2) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public void setPlayState(int i2, int i3) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public void setUserData(Map map) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public int startClipPlay(String str, int i2, ITPPlayListenerAidl iTPPlayListenerAidl) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public int startClipPreload(String str, int i2, ITPPreLoadListenerAidl iTPPreLoadListenerAidl) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public int startPlay(String str, TPDownloadParamAidl tPDownloadParamAidl, ITPPlayListenerAidl iTPPlayListenerAidl) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public int startPreload(String str, TPDownloadParamAidl tPDownloadParamAidl, ITPPreLoadListenerAidl iTPPreLoadListenerAidl) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public void startTask(int i2) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public void stopPlay(int i2) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public void stopPreload(int i2) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public void updateTaskInfo(int i2, Map map) {
        }

        /* renamed from: com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService$DownloadProxy$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 implements ITPPlayListener {
            public final /* synthetic */ DownloadProxy this$1;
            public final /* synthetic */ ITPPlayListenerAidl val$playListener;

            public AnonymousClass1(DownloadProxy downloadProxy, ITPPlayListenerAidl iTPPlayListenerAidl) {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
            public long getAdvRemainTime() {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
            public String getContentType(int i2, String str) {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
            public int getCurrentPlayClipNo() {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
            public long getCurrentPlayOffset() {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
            public long getCurrentPosition() {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
            public String getDataFilePath(int i2, String str) {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
            public long getDataTotalSize(int i2, String str) {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
            public Object getPlayInfo(long j2) {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
            public long getPlayerBufferLength() {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
            public void onDownloadCdnUrlExpired(Map<String, String> map) {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
            public void onDownloadCdnUrlInfoUpdate(String str, String str2, String str3, String str4) {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
            public void onDownloadCdnUrlUpdate(String str) {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
            public void onDownloadError(int i2, int i3, String str) {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
            public void onDownloadFinish() {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
            public void onDownloadProgressUpdate(int i2, int i3, long j2, long j3, String str) {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
            public void onDownloadProtocolUpdate(String str, String str2) {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
            public void onDownloadStatusUpdate(int i2) {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
            public Object onPlayCallback(int i2, Object obj, Object obj2, Object obj3, Object obj4) {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
            public int onReadData(int i2, String str, long j2, long j3) {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
            public int onStartReadData(int i2, String str, long j2, long j3) {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
            public int onStopReadData(int i2, String str, int i3) {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
            public Object getPlayInfo(String str) {
            }
        }

        /* renamed from: com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService$DownloadProxy$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass2 implements ITPPlayListener {
            public final /* synthetic */ DownloadProxy this$1;
            public final /* synthetic */ ITPPlayListenerAidl val$playListener;

            public AnonymousClass2(DownloadProxy downloadProxy, ITPPlayListenerAidl iTPPlayListenerAidl) {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
            public long getAdvRemainTime() {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
            public String getContentType(int i2, String str) {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
            public int getCurrentPlayClipNo() {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
            public long getCurrentPlayOffset() {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
            public long getCurrentPosition() {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
            public String getDataFilePath(int i2, String str) {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
            public long getDataTotalSize(int i2, String str) {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
            public Object getPlayInfo(long j2) {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
            public long getPlayerBufferLength() {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
            public void onDownloadCdnUrlExpired(Map<String, String> map) {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
            public void onDownloadCdnUrlInfoUpdate(String str, String str2, String str3, String str4) {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
            public void onDownloadCdnUrlUpdate(String str) {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
            public void onDownloadError(int i2, int i3, String str) {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
            public void onDownloadFinish() {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
            public void onDownloadProgressUpdate(int i2, int i3, long j2, long j3, String str) {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
            public void onDownloadProtocolUpdate(String str, String str2) {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
            public void onDownloadStatusUpdate(int i2) {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
            public Object onPlayCallback(int i2, Object obj, Object obj2, Object obj3, Object obj4) {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
            public int onReadData(int i2, String str, long j2, long j3) {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
            public int onStartReadData(int i2, String str, long j2, long j3) {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
            public int onStopReadData(int i2, String str, int i3) {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
            public Object getPlayInfo(String str) {
            }
        }
    }

    private boolean isExistMainProcess() {
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class DownloadProxyFactory extends TPDownloadProxyFactoryAidl.Stub {
        private HashMap<Integer, ITPDownloadProxyAidl> mvTPDownloadProxyMap;
        public final /* synthetic */ TPDownloadProxyService this$0;

        private DownloadProxyFactory(TPDownloadProxyService tPDownloadProxyService) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl
        public String getNativeVersion() {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl
        public synchronized ITPDownloadProxyAidl getTPDownloadProxy(int i2) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl
        public boolean isReadyForDownload() {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl
        public boolean isReadyForPlay() {
        }

        public /* synthetic */ DownloadProxyFactory(TPDownloadProxyService tPDownloadProxyService, AnonymousClass1 anonymousClass1) {
        }
    }
}
