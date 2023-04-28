package com.tencent.rtmp.downloader;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface ITXVodDownloadListener {
    int hlsKeyVerify(TXVodDownloadMediaInfo tXVodDownloadMediaInfo, String str, byte[] bArr);

    void onDownloadError(TXVodDownloadMediaInfo tXVodDownloadMediaInfo, int i2, String str);

    void onDownloadFinish(TXVodDownloadMediaInfo tXVodDownloadMediaInfo);

    void onDownloadProgress(TXVodDownloadMediaInfo tXVodDownloadMediaInfo);

    void onDownloadStart(TXVodDownloadMediaInfo tXVodDownloadMediaInfo);

    void onDownloadStop(TXVodDownloadMediaInfo tXVodDownloadMediaInfo);
}
