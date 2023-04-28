package com.tencent.thumbplayer.api.composition;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface ITPMediaAssetOrderedMap extends ITPMediaAssetObjectParam {
    public static final String TP_PLAYER_EXTRA_PARAM_HLS_TRACK_BANDWIDTH = "hls_track_bandwidth";
    public static final String TP_PLAYER_EXTRA_PARAM_HLS_TRACK_CODECS = "hls_track_codecs";
    public static final String TP_PLAYER_EXTRA_PARAM_HLS_TRACK_FRAME_RATE = "hls_track_framerate";
    public static final String TP_PLAYER_EXTRA_PARAM_HLS_TRACK_GROUPID = "hls_track_groupid";
    public static final String TP_PLAYER_EXTRA_PARAM_HLS_TRACK_LANGUAGE = "hls_track_language";
    public static final String TP_PLAYER_EXTRA_PARAM_HLS_TRACK_NAME = "hls_track_name";
    public static final String TP_PLAYER_EXTRA_PARAM_HLS_TRACK_RESOLUTION = "hls_track_resolution";

    void addKeyValue(String str, String str2);

    String getKeyValueStr();
}
