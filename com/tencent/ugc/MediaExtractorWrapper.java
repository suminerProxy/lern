package com.tencent.ugc;

import android.annotation.TargetApi;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import com.tencent.liteav.videobase.common.EncodedVideoFrame;
import java.nio.ByteBuffer;

@TargetApi(16)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class MediaExtractorWrapper {
    private static final int INIT_SAMPLE_SIZE = 1048576;
    private static final int MAX_SAMPLE_SIZE = 10485760;
    private static final String TAG = "MediaExtractorWrapper";
    private MediaExtractor mAudioExtractor;
    private MediaFormat mAudioFormat;
    private boolean mIsReachEOF;
    private ByteBuffer mVideoBuffer;
    private MediaExtractor mVideoExtractor;
    private MediaFormat mVideoFormat;

    private int getIntegerFormatValue(MediaFormat mediaFormat, String str) {
    }

    private long getLongFormatValue(MediaFormat mediaFormat, String str) {
    }

    private String getStringFormatValue(MediaFormat mediaFormat, String str) {
    }

    private ByteBuffer readData(MediaExtractor mediaExtractor) {
    }

    private static MediaFormat selectFormat(MediaExtractor mediaExtractor, String str) {
    }

    public int getAudioBitrate() {
    }

    public long getAudioDuration() {
    }

    public MediaFormat getAudioFormat() {
    }

    public int getChannelCount() {
    }

    public int getHeight() {
    }

    public int getSampleRate() {
    }

    public int getVideoBitrate() {
    }

    public long getVideoDuration() {
    }

    public MediaFormat getVideoFormat() {
    }

    public int getVideoFrameRate() {
    }

    public String getVideoMimeType() {
    }

    public int getWidth() {
    }

    public EncodedVideoFrame readVideoSampleData() {
    }

    public void release() {
    }

    public void seekVideo(long j2) {
    }

    public boolean setDataSource(String str) {
    }
}
