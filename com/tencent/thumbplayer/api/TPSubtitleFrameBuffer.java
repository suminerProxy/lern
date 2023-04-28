package com.tencent.thumbplayer.api;

import com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TPSubtitleFrameBuffer {
    @TPNativeKeyMap.MapSubtitleFormat(-1)
    public static final int TP_PLAYER_SUBTITLE_OUTPUT_FORMAT_NONE = -1;
    @TPNativeKeyMap.MapSubtitleFormat(26)
    public static final int TP_PLAYER_SUBTITLE_OUTPUT_FORMAT_RGBA = 26;
    public byte[][] data;
    public int dstHeight;
    public int dstWidth;
    public int flags;
    public int format;
    public int[] lineSize;
    public long ptsMs;
    public int rotation;
    public int srcHeight;
    public int srcWidth;
    public int trackID;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public @interface TP_SUBTITLE_FRAME_FORMAT_ID {
    }

    public byte[][] getData() {
    }

    public int getDstHeight() {
    }

    public int getDstWidth() {
    }

    public int getFlags() {
    }

    public int getFormat() {
    }

    public int[] getLineSize() {
    }

    public long getPtsMs() {
    }

    public int getRotation() {
    }

    public int getSrcHeight() {
    }

    public int getSrcWidth() {
    }

    public int getTrackID() {
    }
}
