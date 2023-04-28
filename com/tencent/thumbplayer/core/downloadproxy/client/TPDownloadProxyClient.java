package com.tencent.thumbplayer.core.downloadproxy.client;

import android.content.Context;
import android.os.RemoteException;
import com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl;
import com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl;
import com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl;
import com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener;
import com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy;
import com.tencent.thumbplayer.core.downloadproxy.api.ITPOfflineDownloadListener;
import com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener;
import com.tencent.thumbplayer.core.downloadproxy.api.ITPPreLoadListener;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDLProxyInitParam;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadParam;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TPDownloadProxyClient implements ITPDownloadProxy {
    private static final String FILE_NAME = "TPDownloadProxyClient";
    private ITPDownloadProxyAidl downloadProxyAidl;

    /* renamed from: com.tencent.thumbplayer.core.downloadproxy.client.TPDownloadProxyClient$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 extends ITPPlayListenerAidl.Stub {
        public final /* synthetic */ TPDownloadProxyClient this$0;
        public final /* synthetic */ ITPPlayListener val$playListener;

        public AnonymousClass1(TPDownloadProxyClient tPDownloadProxyClient, ITPPlayListener iTPPlayListener) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public long getAdvRemainTime() {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public String getContentType(int i2, String str) throws RemoteException {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public int getCurrentPlayClipNo() {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public long getCurrentPlayOffset() {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public long getCurrentPosition() {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public String getDataFilePath(int i2, String str) throws RemoteException {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public long getDataTotalSize(int i2, String str) throws RemoteException {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public String getPlayInfo(String str) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public long getPlayerBufferLength() {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public void onDownloadCdnUrlExpired(Map map) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public void onDownloadCdnUrlInfoUpdate(String str, String str2, String str3, String str4) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public void onDownloadCdnUrlUpdate(String str) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public void onDownloadError(int i2, int i3, String str) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public void onDownloadFinish() {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public void onDownloadProgressUpdate(int i2, int i3, long j2, long j3, String str) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public void onDownloadProtocolUpdate(String str, String str2) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public void onDownloadStatusUpdate(int i2) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public int onPlayCallback(int i2, List list) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public int onReadData(int i2, String str, long j2, long j3) throws RemoteException {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public int onStartReadData(int i2, String str, long j2, long j3) throws RemoteException {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public int onStopReadData(int i2, String str, int i3) throws RemoteException {
        }
    }

    /* renamed from: com.tencent.thumbplayer.core.downloadproxy.client.TPDownloadProxyClient$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 extends ITPPlayListenerAidl.Stub {
        public final /* synthetic */ TPDownloadProxyClient this$0;
        public final /* synthetic */ ITPPlayListener val$playListener;

        public AnonymousClass2(TPDownloadProxyClient tPDownloadProxyClient, ITPPlayListener iTPPlayListener) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public long getAdvRemainTime() {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public String getContentType(int i2, String str) throws RemoteException {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public int getCurrentPlayClipNo() {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public long getCurrentPlayOffset() {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public long getCurrentPosition() {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public String getDataFilePath(int i2, String str) throws RemoteException {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public long getDataTotalSize(int i2, String str) throws RemoteException {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public String getPlayInfo(String str) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public long getPlayerBufferLength() {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public void onDownloadCdnUrlExpired(Map map) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public void onDownloadCdnUrlInfoUpdate(String str, String str2, String str3, String str4) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public void onDownloadCdnUrlUpdate(String str) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public void onDownloadError(int i2, int i3, String str) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public void onDownloadFinish() {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public void onDownloadProgressUpdate(int i2, int i3, long j2, long j3, String str) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public void onDownloadProtocolUpdate(String str, String str2) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public void onDownloadStatusUpdate(int i2) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public int onPlayCallback(int i2, List list) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public int onReadData(int i2, String str, long j2, long j3) throws RemoteException {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public int onStartReadData(int i2, String str, long j2, long j3) throws RemoteException {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public int onStopReadData(int i2, String str, int i3) throws RemoteException {
        }
    }

    /* renamed from: com.tencent.thumbplayer.core.downloadproxy.client.TPDownloadProxyClient$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 extends ITPPreLoadListenerAidl.Stub {
        public final /* synthetic */ TPDownloadProxyClient this$0;
        public final /* synthetic */ ITPPreLoadListener val$itpPreLoadListener;

        public AnonymousClass3(TPDownloadProxyClient tPDownloadProxyClient, ITPPreLoadListener iTPPreLoadListener) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl
        public void onPrepareDownloadProgressUpdate(int i2, int i3, long j2, long j3, String str) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl
        public void onPrepareError(int i2, int i3, String str) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl
        public void onPrepareOK() {
        }
    }

    /* renamed from: com.tencent.thumbplayer.core.downloadproxy.client.TPDownloadProxyClient$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 extends ITPPreLoadListenerAidl.Stub {
        public final /* synthetic */ TPDownloadProxyClient this$0;
        public final /* synthetic */ ITPPreLoadListener val$itpPreLoadListener;

        public AnonymousClass4(TPDownloadProxyClient tPDownloadProxyClient, ITPPreLoadListener iTPPreLoadListener) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl
        public void onPrepareDownloadProgressUpdate(int i2, int i3, long j2, long j3, String str) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl
        public void onPrepareError(int i2, int i3, String str) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl
        public void onPrepareOK() {
        }
    }

    public TPDownloadProxyClient(ITPDownloadProxyAidl iTPDownloadProxyAidl) {
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public int checkResourceStatus(String str, String str2, int i2) {
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public int deinit() {
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public String getClipPlayUrl(int i2, int i3, int i4) {
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public String getNativeInfo(int i2) {
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public String getPlayErrorCodeStr(int i2) {
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public String getPlayUrl(int i2, int i3) {
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public long getResourceSize(String str, String str2) {
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public int init(Context context, TPDLProxyInitParam tPDLProxyInitParam) {
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public int pauseDownload(int i2) {
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public void pushEvent(int i2) {
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public int removeStorageCache(String str) {
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public int resumeDownload(int i2) {
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public boolean setClipInfo(int i2, int i3, String str, TPDownloadParam tPDownloadParam) {
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public void setLogListener(ITPDLProxyLogListener iTPDLProxyLogListener) {
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public void setMaxStorageSizeMB(long j2) {
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public void setPlayState(int i2, int i3) {
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public void setUserData(String str, Object obj) {
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public int startClipOfflineDownload(String str, int i2, ITPOfflineDownloadListener iTPOfflineDownloadListener) {
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public int startClipPlay(String str, int i2, ITPPlayListener iTPPlayListener) {
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public int startClipPreload(String str, int i2, ITPPreLoadListener iTPPreLoadListener) {
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public int startOfflineDownload(String str, TPDownloadParam tPDownloadParam, ITPOfflineDownloadListener iTPOfflineDownloadListener) {
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public int startPlay(String str, TPDownloadParam tPDownloadParam, ITPPlayListener iTPPlayListener) {
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public int startPreload(String str, TPDownloadParam tPDownloadParam, ITPPreLoadListener iTPPreLoadListener) {
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public void startTask(int i2) {
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public void stopOfflineDownload(int i2) {
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public void stopPlay(int i2) {
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public void stopPreload(int i2) {
    }

    public void updateAidl(ITPDownloadProxyAidl iTPDownloadProxyAidl) {
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public void updateStoragePath(String str) {
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public void updateTaskInfo(int i2, String str, Object obj) {
    }
}
