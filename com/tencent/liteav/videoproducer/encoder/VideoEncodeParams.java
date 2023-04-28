package com.tencent.liteav.videoproducer.encoder;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.videobase.common.CodecType;
import com.tencent.liteav.videoproducer.encoder.VideoEncoderDef;
import org.json.JSONArray;

@JNINamespace("liteav::video")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class VideoEncodeParams implements Cloneable {
    public boolean annexb;
    public long baseFrameIndex;
    public long baseGopIndex;
    public int bitrate;
    public VideoEncoderDef.BitrateMode bitrateMode;
    public CodecType codecType;
    public boolean enableBFrame;
    public VideoEncoderDef.EncoderProfile encoderProfile;
    public int fps;
    public boolean fullIFrame;
    public int gop;
    public int height;
    public boolean isTranscodingMode;
    public JSONArray mediaCodecDeviceRelatedParams;
    public VideoEncoderDef.ReferenceStrategy referenceStrategy;
    public int width;

    @CalledByNative
    public VideoEncodeParams() {
    }

    private int checkFieldDiffCounts(Object obj, Object obj2) {
    }

    @CalledByNative
    public static VideoEncoderDef.BitrateMode createEncoderBitrateMode(int i2) {
    }

    @CalledByNative
    public static VideoEncoderDef.EncoderProfile createEncoderProfileType(int i2) {
    }

    @CalledByNative
    public static CodecType createEncoderVideoCodec(int i2) {
    }

    @CalledByNative
    public static VideoEncoderDef.ReferenceStrategy createReferenceStrategy(int i2) {
    }

    public final boolean equals(@Nullable Object obj) {
    }

    @CalledByNative
    public final long getBaseFrameIndex() {
    }

    @CalledByNative
    public final long getBaseGopIndex() {
    }

    @CalledByNative
    public final int getBitrate() {
    }

    @CalledByNative
    public final int getBitrateMode() {
    }

    @CalledByNative
    public final int getCodecType() {
    }

    @CalledByNative
    public final int getEncoderProfile() {
    }

    @CalledByNative
    public final int getFps() {
    }

    @CalledByNative
    public final int getGop() {
    }

    @CalledByNative
    public final int getHeight() {
    }

    public final JSONArray getMediaCodecDeviceRelatedParams() {
    }

    public final VideoEncoderDef.ReferenceStrategy getReferenceStrategy() {
    }

    @CalledByNative
    public final int getWidth() {
    }

    @CalledByNative
    public final boolean isAnnexb() {
    }

    @CalledByNative
    public final boolean isEnablesBframe() {
    }

    @CalledByNative
    public final boolean isEnablesRps() {
    }

    @CalledByNative
    public final boolean isFullIFrame() {
    }

    @CalledByNative
    public final boolean isTranscodingMode() {
    }

    @CalledByNative
    public final void setAnnexb(boolean z) {
    }

    @CalledByNative
    public final void setBFrameEnabled(boolean z) {
    }

    @CalledByNative
    public final void setBaseFrameIndex(long j2) {
    }

    @CalledByNative
    public final void setBaseGopIndex(long j2) {
    }

    @CalledByNative
    public final void setBitrate(int i2) {
    }

    @CalledByNative
    public final void setBitrateMode(VideoEncoderDef.BitrateMode bitrateMode) {
    }

    @CalledByNative
    public final void setCodecType(CodecType codecType) {
    }

    @CalledByNative
    public final void setEncoderProfile(VideoEncoderDef.EncoderProfile encoderProfile) {
    }

    @CalledByNative
    public final void setFps(int i2) {
    }

    @CalledByNative
    public final void setFullIFrame(boolean z) {
    }

    @CalledByNative
    public final void setGop(int i2) {
    }

    @CalledByNative
    public final void setHeight(int i2) {
    }

    @CalledByNative
    public final void setMediaCodecDeviceRelatedParams(JSONArray jSONArray) {
    }

    @CalledByNative
    public final void setReferenceStrategy(VideoEncoderDef.ReferenceStrategy referenceStrategy) {
    }

    @CalledByNative
    public final void setTranscodingModeEnabled(boolean z) {
    }

    @CalledByNative
    public final void setWidth(int i2) {
    }

    @NonNull
    public final String toString() {
    }

    public VideoEncodeParams(VideoEncodeParams videoEncodeParams) {
    }
}
