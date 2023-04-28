package com.tencent.rtmp.downloader;

import com.tencent.rtmp.downloader.a.b;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TXVodDownloadManager {
    public static final int DOWNLOAD_403FORBIDDEN = -5008;
    public static final int DOWNLOAD_AUTH_FAILED = -5001;
    public static final int DOWNLOAD_DISCONNECT = -5005;
    public static final int DOWNLOAD_FORMAT_ERROR = -5004;
    public static final int DOWNLOAD_HLS_KEY_ERROR = -5006;
    public static final int DOWNLOAD_NO_FILE = -5003;
    public static final int DOWNLOAD_PATH_ERROR = -5007;
    public static final int DOWNLOAD_SUCCESS = 0;
    private static final String TAG = "TXVodDownloadManager";
    private static b instance;

    public static TXVodDownloadManager getInstance() {
    }

    @Deprecated
    public boolean deleteDownloadFile(String str) {
    }

    public boolean deleteDownloadMediaInfo(TXVodDownloadMediaInfo tXVodDownloadMediaInfo) {
    }

    public TXVodDownloadMediaInfo getDownloadMediaInfo(int i2, String str, int i3) {
    }

    public List<TXVodDownloadMediaInfo> getDownloadMediaInfoList() {
    }

    public void setDownloadPath(String str) {
    }

    public void setHeaders(Map<String, String> map) {
    }

    public void setListener(ITXVodDownloadListener iTXVodDownloadListener) {
    }

    public TXVodDownloadMediaInfo startDownload(TXVodDownloadDataSource tXVodDownloadDataSource) {
    }

    @Deprecated
    public TXVodDownloadMediaInfo startDownloadUrl(String str) {
    }

    public void stopDownload(TXVodDownloadMediaInfo tXVodDownloadMediaInfo) {
    }

    public TXVodDownloadMediaInfo getDownloadMediaInfo(String str) {
    }

    public TXVodDownloadMediaInfo startDownloadUrl(String str, String str2) {
    }
}
