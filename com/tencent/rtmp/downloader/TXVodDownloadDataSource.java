package com.tencent.rtmp.downloader;

import com.tencent.rtmp.TXPlayerAuthBuilder;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TXVodDownloadDataSource {
    public static final int QUALITY_2K = 5;
    public static final int QUALITY_4K = 6;
    public static final int QUALITY_FHD = 4;
    public static final int QUALITY_FLU = 1;
    public static final int QUALITY_HD = 3;
    public static final int QUALITY_OD = 0;
    public static final int QUALITY_SD = 2;
    public static final int QUALITY_UNK = 1000;
    public int appId;
    public TXPlayerAuthBuilder authBuilder;
    public String fileId;
    public String overlayIv;
    public String overlayKey;
    public String pSign;
    public int quality;
    public String templateName;
    public String token;
    public String userName;

    public TXVodDownloadDataSource(int i2, String str, int i3, String str2, String str3) {
    }

    public int getAppId() {
    }

    @Deprecated
    public TXPlayerAuthBuilder getAuthBuilder() {
    }

    public String getFileId() {
    }

    public String getOverlayIv() {
    }

    public String getOverlayKey() {
    }

    public String getPSign() {
    }

    public int getQuality() {
    }

    @Deprecated
    public String getTemplateName() {
    }

    public String getToken() {
    }

    public String getUserName() {
    }

    public void setQuality(int i2) {
    }

    public void setToken(String str) {
    }

    @Deprecated
    public TXVodDownloadDataSource(TXPlayerAuthBuilder tXPlayerAuthBuilder, int i2) {
    }

    @Deprecated
    public TXVodDownloadDataSource(TXPlayerAuthBuilder tXPlayerAuthBuilder, String str) {
    }

    public TXVodDownloadDataSource() {
    }
}
