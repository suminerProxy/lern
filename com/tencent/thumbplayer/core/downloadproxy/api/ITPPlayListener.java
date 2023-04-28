package com.tencent.thumbplayer.core.downloadproxy.api;

import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface ITPPlayListener {
    public static final int MESSAGE_FLV_PRELOAD_STATUS = 5;
    public static final int MESSAGE_HTTP_HEADER = 3;
    public static final int MESSAGE_MULTI_NETWORK = 7;
    public static final int MESSAGE_NOTIFY_M3U8_CONTENT = 4;
    public static final int MESSAGE_NOTIFY_PLAYER_SWITCH_DEFINITION = 2;
    public static final int MESSAGE_PLAY_VIDEO_NO_MORE_CACHE = 1;
    public static final int MESSAGE_QUIC_DOWNLOAD_STATUS = 6;

    long getAdvRemainTime();

    String getContentType(int i2, String str);

    int getCurrentPlayClipNo();

    long getCurrentPlayOffset();

    long getCurrentPosition();

    String getDataFilePath(int i2, String str);

    long getDataTotalSize(int i2, String str);

    Object getPlayInfo(long j2);

    Object getPlayInfo(String str);

    long getPlayerBufferLength();

    void onDownloadCdnUrlExpired(Map<String, String> map);

    void onDownloadCdnUrlInfoUpdate(String str, String str2, String str3, String str4);

    void onDownloadCdnUrlUpdate(String str);

    void onDownloadError(int i2, int i3, String str);

    void onDownloadFinish();

    void onDownloadProgressUpdate(int i2, int i3, long j2, long j3, String str);

    void onDownloadProtocolUpdate(String str, String str2);

    void onDownloadStatusUpdate(int i2);

    Object onPlayCallback(int i2, Object obj, Object obj2, Object obj3, Object obj4);

    int onReadData(int i2, String str, long j2, long j3);

    int onStartReadData(int i2, String str, long j2, long j3);

    int onStopReadData(int i2, String str, int i3);
}
