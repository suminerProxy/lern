package com.tencent.liteav.videoproducer.utils;

import android.graphics.Bitmap;
import android.media.projection.MediaProjection;
import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.common.SnapshotSourceType;
import com.tencent.liteav.videobase.utils.Rotation;
import com.tencent.liteav.videobase.videobase.IVideoReporter;
import com.tencent.liteav.videobase.videobase.NativeVideoReporter;
import com.tencent.liteav.videoproducer.capture.CameraCaptureParams;
import com.tencent.liteav.videoproducer.capture.CaptureSourceInterface;
import com.tencent.liteav.videoproducer.capture.ScreenCapturer;
import com.tencent.liteav.videoproducer.capture.VirtualCamera;
import com.tencent.liteav.videoproducer.encoder.NativeEncoderDataListener;
import com.tencent.liteav.videoproducer.encoder.VideoEncoderDef;
import com.tencent.liteav.videoproducer.producer.VideoProducerDef;

@JNINamespace("liteav::video")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class NativeProducerParamCreator {
    private static final String TAG = "CaptureParamsHelper";

    @CalledByNative
    public static Boolean createBooleanWithValue(boolean z) {
    }

    @CalledByNative
    public static CameraCaptureParams createCameraParams(Boolean bool, int i2, int i3, int i4) {
    }

    @CalledByNative
    public static VideoEncoderDef.EncodeStrategy createEncoderStrategy(int i2) {
    }

    @CalledByNative
    public static VideoProducerDef.GSensorMode createGSensorMode(int i2) {
    }

    @CalledByNative
    public static VideoProducerDef.HomeOrientation createHomeOrientation(int i2) {
    }

    @CalledByNative
    public static GLConstants.MirrorMode createMirrorMode(int i2) {
    }

    @CalledByNative
    public static NativeEncoderDataListener createNativeEncoderDataListener(long j2, int i2) {
    }

    @CalledByNative
    private static IVideoReporter createNativeReporter(long j2) {
    }

    @CalledByNative
    public static GLConstants.Orientation createOrientation(int i2) {
    }

    @CalledByNative
    public static GLConstants.PixelBufferType createPixelBufferType(int i2) {
    }

    @CalledByNative
    public static GLConstants.PixelFormatType createPixelFormatType(int i2) {
    }

    @CalledByNative
    public static VideoProducerDef.ProducerMode createProducerMode(int i2) {
    }

    @CalledByNative
    public static Rotation createRotation(int i2) {
    }

    @CalledByNative
    public static GLConstants.GLScaleType createScaleType(int i2) {
    }

    @CalledByNative
    public static ScreenCapturer.ScreenCaptureParams createScreenParams(boolean z, int i2, int i3, int i4, MediaProjection mediaProjection) {
    }

    @CalledByNative
    public static SnapshotSourceType createSnapshotSourceType(int i2) {
    }

    @CalledByNative
    public static CaptureSourceInterface.SourceType createSourceType(int i2) {
    }

    @CalledByNative
    public static VideoProducerDef.StreamType createStreamType(int i2) {
    }

    @CalledByNative
    public static VirtualCamera.VirtualCameraParams createVirtualParams(Bitmap bitmap, int i2, int i3, int i4) {
    }

    @CalledByNative
    private static void resetNativeReporter(NativeVideoReporter nativeVideoReporter) {
    }
}
