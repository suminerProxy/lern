package com.tencent.thumbplayer.core.downloadproxy.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface ITPDownloadProxyAidl extends IInterface {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static abstract class Stub extends Binder implements ITPDownloadProxyAidl {
        private static final String DESCRIPTOR = "com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl";
        public static final int TRANSACTION_checkResourceStatus = 17;
        public static final int TRANSACTION_getClipPlayUrl = 6;
        public static final int TRANSACTION_getNativeInfo = 16;
        public static final int TRANSACTION_getPlayErrorCodeStr = 7;
        public static final int TRANSACTION_getPlayUrl = 5;
        public static final int TRANSACTION_getResourceSize = 18;
        public static final int TRANSACTION_init = 1;
        public static final int TRANSACTION_pauseDownload = 9;
        public static final int TRANSACTION_pushEvent = 19;
        public static final int TRANSACTION_resumeDownload = 10;
        public static final int TRANSACTION_setClipInfo = 4;
        public static final int TRANSACTION_setMaxStorageSizeMB = 21;
        public static final int TRANSACTION_setPlayState = 20;
        public static final int TRANSACTION_setUserData = 15;
        public static final int TRANSACTION_startClipPlay = 3;
        public static final int TRANSACTION_startClipPreload = 12;
        public static final int TRANSACTION_startPlay = 2;
        public static final int TRANSACTION_startPreload = 11;
        public static final int TRANSACTION_startTask = 14;
        public static final int TRANSACTION_stopPlay = 8;
        public static final int TRANSACTION_stopPreload = 13;
        public static final int TRANSACTION_updateTaskInfo = 22;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public static class Proxy implements ITPDownloadProxyAidl {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public int checkResourceStatus(String str, String str2, int i2) throws RemoteException {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public String getClipPlayUrl(int i2, int i3, int i4) throws RemoteException {
            }

            public String getInterfaceDescriptor() {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public String getNativeInfo(int i2) throws RemoteException {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public String getPlayErrorCodeStr(int i2) throws RemoteException {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public String getPlayUrl(int i2, int i3) throws RemoteException {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public long getResourceSize(String str, String str2) throws RemoteException {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public int init(String str) throws RemoteException {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public int pauseDownload(int i2) throws RemoteException {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public void pushEvent(int i2) throws RemoteException {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public int resumeDownload(int i2) throws RemoteException {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public boolean setClipInfo(int i2, int i3, String str, TPDownloadParamAidl tPDownloadParamAidl) throws RemoteException {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public void setMaxStorageSizeMB(long j2) throws RemoteException {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public void setPlayState(int i2, int i3) throws RemoteException {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public void setUserData(Map map) throws RemoteException {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public int startClipPlay(String str, int i2, ITPPlayListenerAidl iTPPlayListenerAidl) throws RemoteException {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public int startClipPreload(String str, int i2, ITPPreLoadListenerAidl iTPPreLoadListenerAidl) throws RemoteException {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public int startPlay(String str, TPDownloadParamAidl tPDownloadParamAidl, ITPPlayListenerAidl iTPPlayListenerAidl) throws RemoteException {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public int startPreload(String str, TPDownloadParamAidl tPDownloadParamAidl, ITPPreLoadListenerAidl iTPPreLoadListenerAidl) throws RemoteException {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public void startTask(int i2) throws RemoteException {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public void stopPlay(int i2) throws RemoteException {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public void stopPreload(int i2) throws RemoteException {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public void updateTaskInfo(int i2, Map map) throws RemoteException {
            }
        }

        public static ITPDownloadProxyAidl asInterface(IBinder iBinder) {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        }
    }

    int checkResourceStatus(String str, String str2, int i2) throws RemoteException;

    String getClipPlayUrl(int i2, int i3, int i4) throws RemoteException;

    String getNativeInfo(int i2) throws RemoteException;

    String getPlayErrorCodeStr(int i2) throws RemoteException;

    String getPlayUrl(int i2, int i3) throws RemoteException;

    long getResourceSize(String str, String str2) throws RemoteException;

    int init(String str) throws RemoteException;

    int pauseDownload(int i2) throws RemoteException;

    void pushEvent(int i2) throws RemoteException;

    int resumeDownload(int i2) throws RemoteException;

    boolean setClipInfo(int i2, int i3, String str, TPDownloadParamAidl tPDownloadParamAidl) throws RemoteException;

    void setMaxStorageSizeMB(long j2) throws RemoteException;

    void setPlayState(int i2, int i3) throws RemoteException;

    void setUserData(Map map) throws RemoteException;

    int startClipPlay(String str, int i2, ITPPlayListenerAidl iTPPlayListenerAidl) throws RemoteException;

    int startClipPreload(String str, int i2, ITPPreLoadListenerAidl iTPPreLoadListenerAidl) throws RemoteException;

    int startPlay(String str, TPDownloadParamAidl tPDownloadParamAidl, ITPPlayListenerAidl iTPPlayListenerAidl) throws RemoteException;

    int startPreload(String str, TPDownloadParamAidl tPDownloadParamAidl, ITPPreLoadListenerAidl iTPPreLoadListenerAidl) throws RemoteException;

    void startTask(int i2) throws RemoteException;

    void stopPlay(int i2) throws RemoteException;

    void stopPreload(int i2) throws RemoteException;

    void updateTaskInfo(int i2, Map map) throws RemoteException;
}
