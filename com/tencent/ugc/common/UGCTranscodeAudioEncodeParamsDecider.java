package com.tencent.ugc.common;

import android.media.MediaFormat;
import com.tencent.ugc.AudioEncodeParams;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class UGCTranscodeAudioEncodeParamsDecider {
    private static final int DEFAULT_BITRATE = 98304;
    private static final int DEFAULT_BIT_PER_CHANNEL = 16;
    private static final int DEFAULT_CHANNEL_COUNT = 1;
    private static final int DEFAULT_SAMPLE_RATE = 48000;
    private static final String TAG = "UGCTranscodeAudioEncodeParamsDecider";
    private List<MediaFormat> mAudioMediaFormatList;
    private MediaFormat mBGMMediaFormat;
    private int mEncodeBitrate;

    private int getDecidedBitRate() {
    }

    private int getDecidedChannels() {
    }

    private int getDecidedSampleRate() {
    }

    private MediaFormat getFirstValidMediaFormat() {
    }

    private int getIntValueFromFormat(MediaFormat mediaFormat, String str, int i2) {
    }

    private int getMaxAudioBitRate(List<MediaFormat> list) {
    }

    public AudioEncodeParams getDecidedEncodeParams() {
    }

    public void setBGMMediaFormat(MediaFormat mediaFormat) {
    }

    public void setEncodeBitrate(int i2) {
    }

    public void setInputAudioMediaFormat(List<MediaFormat> list) {
    }
}
