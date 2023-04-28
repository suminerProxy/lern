package com.tencent.thumbplayer.core.player;

import java.util.HashMap;
import java.util.Vector;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TPNativePlayerInitConfig {
    public static final int BOOL_ENABLE_ASYNC_MEDIA_CODEC = 206;
    public static final int BOOL_ENABLE_AUDIO_FRAME_CALLBACK = 402;
    public static final int BOOL_ENABLE_AUDIO_PASSTHROUGH = 210;
    public static final int BOOL_ENABLE_AUDIO_RENDERER_LATENCY_COMPENSATION = 401;
    public static final int BOOL_ENABLE_AUDIO_SYNC_FREE_RUN = 415;
    public static final int BOOL_ENABLE_AV_SYNC = 400;
    public static final int BOOL_ENABLE_COLOR_MANAGEMENT = 407;
    public static final int BOOL_ENABLE_DROPFRAME_BY_REFRESHRATE = 406;
    public static final int BOOL_ENABLE_HEVC_OPTIMIZATION = 115;
    public static final int BOOL_ENABLE_MEDIA_CODEC_REUSE = 213;
    public static final int BOOL_ENABLE_MEDIA_CODEC_SET_OPERATE_RATE = 212;
    public static final int BOOL_ENABLE_MULTI_RECEIVE_FRAMES = 209;
    public static final int BOOL_ENABLE_NATIVE_MEDIA_CODEC = 204;
    @Deprecated
    public static final int BOOL_ENABLE_REFACTOR_RENDER = 444;
    public static final int BOOL_ENABLE_SET_OUTPUT_SURFACE_API = 205;
    public static final int BOOL_ENABLE_VIDEO_DROP_NON_REFERENCE = 216;
    public static final int BOOL_ENABLE_VIDEO_FRAME_CALLBACK = 403;
    public static final int BOOL_HLS_HTTP_KEEP_ALIVE = 110;
    public static final int BOOL_HLS_SWITCH_BY_SEGMENT = 111;
    public static final int BOOL_KEEP_ORIGINAL_PTS = 112;
    public static final int BOOL_RELEASE_MEDIA_CODEC_WHEN_SET_SURFACE = 211;
    public static final int BOOL_RESET_DECODER_ON_PARAMETER_CHANGE = 201;
    public static final int BOOL_START_PLAYING_TIME_ACCURATE_SEEK = 101;
    public static final int BOOL_VIDEO_KEEP_MEDIA_CODEC_PTS = 215;
    public static final int FLOAT_REDUCE_LATENCY_SPEED_UP_RATE = 120;
    public static final int FLOAT_VIDEO_DROP_FRAME_DETECT_MIN_RATE = 208;
    public static final int INT_AUDIO_DECODE_THREAD_PRIORITY = 218;
    public static final int INT_AUDIO_RENDERER_TYPE = 404;
    public static final int INT_AUDIO_RENDER_THREAD_PRIORITY = 413;
    public static final int INT_BUFFER_STRATEGY = 125;
    public static final int INT_DECODER_MAX_TOLERATED_ERROR_COUNT = 200;
    public static final int INT_DEMUX_THREAD_PRIORITY = 127;
    public static final int INT_DEMXUER_TYPE = 114;
    public static final int INT_FRAME_SIZE_BYTE = 303;
    public static final int INT_HEIGHT = 312;
    public static final int INT_HLS_PROGRAM_DEFAULT_PLAY_INDEX = 122;
    public static final int INT_HLS_PROGRAM_PREFER_LUMASAMPLES = 123;
    public static final int INT_PIXEL_FORMAT = 310;
    public static final int INT_PLAYER_SCHEDULING_THREAD_PRIORITY = 80;
    public static final int INT_REDUCE_LIVE_LATENCY_ACTION = 119;
    public static final int INT_ROTATION = 313;
    public static final int INT_SAMPLE_FORMAT = 300;
    public static final int INT_SAMPLE_RATE_HZ = 302;
    public static final int INT_STREAM_DEMUXER_FORMAT = 116;
    public static final int INT_SUBTITLE_OUTPUT_TYPE = 450;
    public static final int INT_TCP_RETRY_COUNT = 109;
    public static final int INT_VIDEO_DECODE_THREAD_PRIORITY = 217;
    public static final int INT_VIDEO_RENDERER_TYPE = 405;
    public static final int INT_WIDTH = 311;
    public static final int LONG_AUDIO_NON_BLUETOOTH_MAX_LIMIT_LATENCY_MS = 409;
    public static final int LONG_BUFFERING_TIMEOUT_MS = 107;
    public static final int LONG_BUFFER_PACKET_MAX_TOTAL_DURATION_MS = 117;
    public static final int LONG_BUFFER_PACKET_MIN_TOTAL_DURATION_MS = 102;
    public static final int LONG_CHANNEL_LAYOUT = 301;
    public static final int LONG_HLS_PROGRAM_PREFER_BANDWIDTH = 124;
    public static final int LONG_MAX_ANALYZE_DURATION_MS = 121;
    public static final int LONG_MAX_BUFFERING_TIME_MS = 106;
    public static final int LONG_MIN_BUFFERING_PACKET_DURATION_MS = 104;
    public static final int LONG_MIN_BUFFERING_TIME_MS = 105;
    public static final int LONG_PRELOAD_PACKET_TOTAL_DURATION_MS = 103;
    public static final int LONG_PREPARE_TIMEOUT_MS = 118;
    public static final int LONG_START_PLAYING_TIME_MS = 100;
    public static final int LONG_TCP_TIMEOUT_MS = 108;
    public static final int LONG_VIDEO_DROP_FRAME_TIME_UNIT_MS = 207;
    public static final int OBJECT_AUDIO_ATTRIBUTES = 414;
    public static final int OBJECT_JITTER_BUFFER_CONFIG = 126;
    public static final int QUEUE_INT_AUDIO_DECODER_TYPE = 202;
    public static final int QUEUE_INT_AUDIO_RENDERER_TYPE = 411;
    public static final int QUEUE_INT_SPECIAL_SEI_TYPES_CALLBACK = 128;
    public static final int QUEUE_INT_VIDEO_DECODER_TYPE = 203;
    public static final int QUEUE_INT_VIDEO_RENDERER_TYPE = 412;
    public static final int QUEUE_STRING_HLS_TAG_CALLBACK = 113;
    public static final int STRING_HLS_OVERLAY_IV = 181;
    public static final int STRING_HLS_OVERLAY_KEY = 180;
    private HashMap<Integer, Boolean> mBoolMap;
    private HashMap<Integer, Float> mFloatMap;
    private HashMap<Integer, Integer> mIntMap;
    private HashMap<Integer, Long> mLongMap;
    private HashMap<Integer, Object> mObjectMap;
    private HashMap<Integer, Vector<Integer>> mQueueIntMap;
    private HashMap<Integer, Vector<String>> mQueueStringMap;
    private HashMap<Integer, String> mStringMap;

    public void addQueueInt(int i2, int i3) {
    }

    public void addQueueString(int i2, String str) {
    }

    public HashMap<Integer, Boolean> getBoolMap() {
    }

    public HashMap<Integer, Float> getFloatMap() {
    }

    public HashMap<Integer, Integer> getIntMap() {
    }

    public HashMap<Integer, Long> getLongMap() {
    }

    public HashMap<Integer, Object> getObjectMap() {
    }

    public HashMap<Integer, Vector<Integer>> getQueueIntMap() {
    }

    public HashMap<Integer, Vector<String>> getQueueStringMap() {
    }

    public HashMap<Integer, String> getStringMap() {
    }

    public void setBool(int i2, boolean z) {
    }

    public void setFloat(int i2, float f2) {
    }

    public void setInt(int i2, int i3) {
    }

    public void setLong(int i2, long j2) {
    }

    public void setObject(int i2, Object obj) {
    }

    public void setString(int i2, String str) {
    }
}
