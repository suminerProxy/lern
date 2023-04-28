package com.tencent.thumbplayer.core.downloadproxy.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface ITPPlayListenerAidl extends IInterface {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static abstract class Stub extends Binder implements ITPPlayListenerAidl {
        private static final String DESCRIPTOR = "com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl";
        public static final int TRANSACTION_getAdvRemainTime = 14;
        public static final int TRANSACTION_getContentType = 21;
        public static final int TRANSACTION_getCurrentPlayClipNo = 13;
        public static final int TRANSACTION_getCurrentPlayOffset = 12;
        public static final int TRANSACTION_getCurrentPosition = 11;
        public static final int TRANSACTION_getDataFilePath = 20;
        public static final int TRANSACTION_getDataTotalSize = 19;
        public static final int TRANSACTION_getPlayInfo = 15;
        public static final int TRANSACTION_getPlayerBufferLength = 10;
        public static final int TRANSACTION_onDownloadCdnUrlExpired = 7;
        public static final int TRANSACTION_onDownloadCdnUrlInfoUpdate = 6;
        public static final int TRANSACTION_onDownloadCdnUrlUpdate = 5;
        public static final int TRANSACTION_onDownloadError = 3;
        public static final int TRANSACTION_onDownloadFinish = 2;
        public static final int TRANSACTION_onDownloadProgressUpdate = 1;
        public static final int TRANSACTION_onDownloadProtocolUpdate = 9;
        public static final int TRANSACTION_onDownloadStatusUpdate = 8;
        public static final int TRANSACTION_onPlayCallback = 4;
        public static final int TRANSACTION_onReadData = 17;
        public static final int TRANSACTION_onStartReadData = 16;
        public static final int TRANSACTION_onStopReadData = 18;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public static class Proxy implements ITPPlayListenerAidl {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
            public long getAdvRemainTime() throws RemoteException {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
            public String getContentType(int i2, String str) throws RemoteException {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
            public int getCurrentPlayClipNo() throws RemoteException {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
            public long getCurrentPlayOffset() throws RemoteException {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
            public long getCurrentPosition() throws RemoteException {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
            public String getDataFilePath(int i2, String str) throws RemoteException {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
            public long getDataTotalSize(int i2, String str) throws RemoteException {
            }

            public String getInterfaceDescriptor() {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
            public String getPlayInfo(String str) throws RemoteException {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
            public long getPlayerBufferLength() throws RemoteException {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
            public void onDownloadCdnUrlExpired(Map map) throws RemoteException {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
            public void onDownloadCdnUrlInfoUpdate(String str, String str2, String str3, String str4) throws RemoteException {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
            public void onDownloadCdnUrlUpdate(String str) throws RemoteException {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
            public void onDownloadError(int i2, int i3, String str) throws RemoteException {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
            public void onDownloadFinish() throws RemoteException {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
            public void onDownloadProgressUpdate(int i2, int i3, long j2, long j3, String str) throws RemoteException {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
            public void onDownloadProtocolUpdate(String str, String str2) throws RemoteException {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
            public void onDownloadStatusUpdate(int i2) throws RemoteException {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
            public int onPlayCallback(int i2, List list) throws RemoteException {
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

        public static ITPPlayListenerAidl asInterface(IBinder iBinder) {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        }
    }

    long getAdvRemainTime() throws RemoteException;

    String getContentType(int i2, String str) throws RemoteException;

    int getCurrentPlayClipNo() throws RemoteException;

    long getCurrentPlayOffset() throws RemoteException;

    long getCurrentPosition() throws RemoteException;

    String getDataFilePath(int i2, String str) throws RemoteException;

    long getDataTotalSize(int i2, String str) throws RemoteException;

    String getPlayInfo(String str) throws RemoteException;

    long getPlayerBufferLength() throws RemoteException;

    void onDownloadCdnUrlExpired(Map map) throws RemoteException;

    void onDownloadCdnUrlInfoUpdate(String str, String str2, String str3, String str4) throws RemoteException;

    void onDownloadCdnUrlUpdate(String str) throws RemoteException;

    void onDownloadError(int i2, int i3, String str) throws RemoteException;

    void onDownloadFinish() throws RemoteException;

    void onDownloadProgressUpdate(int i2, int i3, long j2, long j3, String str) throws RemoteException;

    void onDownloadProtocolUpdate(String str, String str2) throws RemoteException;

    void onDownloadStatusUpdate(int i2) throws RemoteException;

    int onPlayCallback(int i2, List list) throws RemoteException;

    int onReadData(int i2, String str, long j2, long j3) throws RemoteException;

    int onStartReadData(int i2, String str, long j2, long j3) throws RemoteException;

    int onStopReadData(int i2, String str, int i3) throws RemoteException;
}
