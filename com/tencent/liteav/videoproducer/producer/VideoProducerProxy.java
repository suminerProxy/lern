package com.tencent.liteav.videoproducer.producer;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.base.TakeSnapshotListener;
import com.tencent.liteav.videobase.common.SnapshotSourceType;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.utils.Rotation;
import com.tencent.liteav.videobase.videobase.DisplayTarget;
import com.tencent.liteav.videobase.videobase.IVideoReporter;
import com.tencent.liteav.videoconsumer.renderer.VideoRenderListener;
import com.tencent.liteav.videoproducer.capture.CaptureSourceInterface;
import com.tencent.liteav.videoproducer.encoder.VideoEncodeParams;
import com.tencent.liteav.videoproducer.encoder.VideoEncoderDef;
import com.tencent.liteav.videoproducer.preprocessor.BeautyProcessor;
import com.tencent.liteav.videoproducer.preprocessor.VideoPreprocessor;
import com.tencent.liteav.videoproducer.producer.VideoProducerDef;

@JNINamespace("liteav::video")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class VideoProducerProxy {
    private final f mProducer;

    @CalledByNative
    public VideoProducerProxy(boolean z, @NonNull IVideoReporter iVideoReporter) {
    }

    @CalledByNative
    public static VideoEncoderDef.EncodeAbility getEncodeAbility() {
    }

    @CalledByNative
    public void ackRPSRecvFrameIndex(VideoProducerDef.StreamType streamType, int i2, int i3) {
    }

    @CalledByNative
    public void appendCustomCaptureFrame(PixelFrame pixelFrame) {
    }

    @CalledByNative
    public BeautyProcessor getBeautyProcessor() {
    }

    @CalledByNative
    public VideoPreprocessor getVideoPreprocessor() {
    }

    @CalledByNative
    public void initialize() {
    }

    @CalledByNative
    public void pauseCapture() {
    }

    @CalledByNative
    public void requestKeyFrame(VideoProducerDef.StreamType streamType) {
    }

    @CalledByNative
    public void resumeCapture() {
    }

    @CalledByNative
    public int setCameraFocusPosition(int i2, int i3) {
    }

    @CalledByNative
    public void setCaptureParams(CaptureSourceInterface.SourceType sourceType, VideoProducerDef.ProducerMode producerMode, CaptureSourceInterface.CaptureParams captureParams) {
    }

    @CalledByNative
    public void setCustomRenderListener(GLConstants.PixelFormatType pixelFormatType, GLConstants.PixelBufferType pixelBufferType, VideoRenderListener videoRenderListener) {
    }

    @CalledByNative
    public void setCustomVideoProcessListener(GLConstants.PixelFormatType pixelFormatType, GLConstants.PixelBufferType pixelBufferType, CustomVideoProcessListener customVideoProcessListener) {
    }

    @CalledByNative
    public void setDisplayView(DisplayTarget displayTarget) {
    }

    @CalledByNative
    public void setEncodeMirrorEnabled(boolean z) {
    }

    @CalledByNative
    public void setEncodeParams(VideoProducerDef.StreamType streamType, VideoEncodeParams videoEncodeParams, GLConstants.Orientation orientation) {
    }

    @CalledByNative
    public void setEncodeRotation(Rotation rotation) {
    }

    @CalledByNative
    public void setEncodeStrategy(VideoProducerDef.StreamType streamType, VideoEncoderDef.EncodeStrategy encodeStrategy) {
    }

    @CalledByNative
    public void setGSensorMode(VideoProducerDef.GSensorMode gSensorMode) {
    }

    @CalledByNative
    public void setHWEncoderDeviceRelatedParams(String str) {
    }

    @CalledByNative
    public void setHomeOrientation(VideoProducerDef.HomeOrientation homeOrientation) {
    }

    @CalledByNative
    public void setPausedImage(Bitmap bitmap, int i2) {
    }

    @CalledByNative
    public void setRPSIFrameFPS(VideoProducerDef.StreamType streamType, int i2) {
    }

    @CalledByNative
    public void setRPSNearestREFSize(VideoProducerDef.StreamType streamType, int i2) {
    }

    @CalledByNative
    public void setRenderMirrorMode(GLConstants.MirrorMode mirrorMode) {
    }

    @CalledByNative
    public void setRenderRotation(Rotation rotation) {
    }

    @CalledByNative
    public void setRenderScaleType(GLConstants.GLScaleType gLScaleType) {
    }

    @CalledByNative
    public void setServerConfig(ServerVideoProducerConfig serverVideoProducerConfig) {
    }

    @CalledByNative
    public void setWatermark(Bitmap bitmap, float f2, float f3, float f4) {
    }

    @CalledByNative
    public void startCapture(CaptureSourceInterface.SourceType sourceType, VideoProducerDef.ProducerMode producerMode, CaptureSourceInterface.CaptureParams captureParams) {
    }

    @CalledByNative
    public void startCustomCapture() {
    }

    @CalledByNative
    public void startEncodeStream(VideoProducerDef.StreamType streamType, VideoEncodeParams videoEncodeParams, VideoEncoderDef.VideoEncoderDataListener videoEncoderDataListener) {
    }

    @CalledByNative
    public void stopCapture() {
    }

    @CalledByNative
    public void stopCustomCapture() {
    }

    @CalledByNative
    public void stopEncodeStream(VideoProducerDef.StreamType streamType) {
    }

    @CalledByNative
    public void takeSnapshot(SnapshotSourceType snapshotSourceType, TakeSnapshotListener takeSnapshotListener) {
    }

    @CalledByNative
    public void uninitialize() {
    }

    public VideoProducerProxy(@NonNull Context context, boolean z, @NonNull IVideoReporter iVideoReporter) {
    }
}
