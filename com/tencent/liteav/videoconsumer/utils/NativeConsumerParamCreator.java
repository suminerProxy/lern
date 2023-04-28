package com.tencent.liteav.videoconsumer.utils;

import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.common.SnapshotSourceType;
import com.tencent.liteav.videobase.utils.Rotation;
import com.tencent.liteav.videobase.videobase.IVideoReporter;
import com.tencent.liteav.videobase.videobase.NativeVideoReporter;
import com.tencent.liteav.videoconsumer.decoder.VideoDecodeController;
import com.tencent.liteav.videoconsumer.decoder.VideoDecoderDef;

@JNINamespace("liteav::video")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class NativeConsumerParamCreator {
    @CalledByNative
    public static VideoDecoderDef.ConsumerScene createConsumerScene(int i2) {
    }

    @CalledByNative
    private static VideoDecodeController.DecodeStrategy createDecodeStrategy(int i2) {
    }

    @CalledByNative
    private static IVideoReporter createNativeReporter(long j2) {
    }

    @CalledByNative
    public static GLConstants.PixelBufferType createPixelBufferType(int i2) {
    }

    @CalledByNative
    public static GLConstants.PixelFormatType createPixelFormatType(int i2) {
    }

    @CalledByNative
    private static GLConstants.GLScaleType createScaleType(int i2) {
    }

    @CalledByNative
    public static SnapshotSourceType createSnapshotSourceType(int i2) {
    }

    @CalledByNative
    public static Rotation fromInt(int i2) {
    }

    @CalledByNative
    private static void resetNativeReporter(NativeVideoReporter nativeVideoReporter) {
    }
}
