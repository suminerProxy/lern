package com.tencent.liteav.videobase.common;

import android.media.MediaCodec;
import android.media.MediaFormat;
import androidx.annotation.NonNull;
import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;
import java.nio.ByteBuffer;

@JNINamespace("liteav::video")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class EncodedVideoFrame {
    private static final String TAG = "EncodedVideoFrame";
    public CodecType codecType;
    public ByteBuffer data;
    public long dts;
    public long frameIndex;
    public long gopFrameIndex;
    public long gopIndex;
    public int height;
    public MediaCodec.BufferInfo info;
    public a nalType;
    public long nativePtr;
    public b profileType;
    public long pts;
    public long refFrameIndex;
    public int rotation;
    public MediaFormat videoFormat;
    public int width;

    @CalledByNative
    public static EncodedVideoFrame createEncodedVideoFrame(ByteBuffer byteBuffer, int i2, int i3, int i4, long j2, long j3, long j4, long j5, long j6, long j7, int i5, long j8, int i6, int i7) {
    }

    private a getNalTypeFromH264NALHeader(ByteBuffer byteBuffer, int i2) {
    }

    private a getNalTypeFromH265NALHeader(ByteBuffer byteBuffer, int i2) {
    }

    public static int getNextNALHeaderPos(int i2, ByteBuffer byteBuffer) {
    }

    private native void nativeRelease(long j2);

    @CalledByNative
    public static long resetEncodedVideoFrame(EncodedVideoFrame encodedVideoFrame) {
    }

    public void finalize() throws Throwable {
    }

    public boolean isH265() {
    }

    public boolean isIDRFrame() {
    }

    public boolean isRPSEnable() {
    }

    public void release() {
    }

    @NonNull
    public String toString() {
    }

    public void updateNALTypeAccordingNALHeader() {
    }
}
