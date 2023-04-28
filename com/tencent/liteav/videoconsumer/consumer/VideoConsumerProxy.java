package com.tencent.liteav.videoconsumer.consumer;

import androidx.annotation.NonNull;
import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.base.TakeSnapshotListener;
import com.tencent.liteav.videobase.common.EncodedVideoFrame;
import com.tencent.liteav.videobase.common.SnapshotSourceType;
import com.tencent.liteav.videobase.utils.Rotation;
import com.tencent.liteav.videobase.videobase.DisplayTarget;
import com.tencent.liteav.videobase.videobase.IVideoReporter;
import com.tencent.liteav.videoconsumer.decoder.VideoDecodeController;
import com.tencent.liteav.videoconsumer.decoder.VideoDecoderDef;
import com.tencent.liteav.videoconsumer.renderer.VideoRenderListener;

@JNINamespace("liteav::video")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class VideoConsumerProxy {
    private final i mConsumer;

    @CalledByNative
    public VideoConsumerProxy(@NonNull IVideoReporter iVideoReporter) {
    }

    @CalledByNative
    public static VideoDecoderDef.DecodeAbility getDecodeAbility() {
    }

    @CalledByNative
    public void appendNALPacket(EncodedVideoFrame encodedVideoFrame) {
    }

    @CalledByNative
    public long getCurrentRenderTimeStamp() {
    }

    @CalledByNative
    public void initialize() {
    }

    @CalledByNative
    public void pause() {
    }

    @CalledByNative
    public void resume() {
    }

    @CalledByNative
    public void setCustomRenderListener(GLConstants.PixelFormatType pixelFormatType, GLConstants.PixelBufferType pixelBufferType, VideoRenderListener videoRenderListener) {
    }

    @CalledByNative
    public void setDecoderStrategy(VideoDecodeController.DecodeStrategy decodeStrategy) {
    }

    @CalledByNative
    public void setDisplayTarget(DisplayTarget displayTarget) {
    }

    @CalledByNative
    public void setHWDecoderDeviceRelatedParams(String str) {
    }

    @CalledByNative
    public void setRenderMirrorEnabled(boolean z) {
    }

    @CalledByNative
    public void setRenderRotation(Rotation rotation) {
    }

    @CalledByNative
    public void setScaleType(GLConstants.GLScaleType gLScaleType) {
    }

    @CalledByNative
    public void setScene(VideoDecoderDef.ConsumerScene consumerScene) {
    }

    @CalledByNative
    public void setServerConfig(ServerVideoConsumerConfig serverVideoConsumerConfig) {
    }

    @CalledByNative
    public void setSharedEGLContext(Object obj) {
    }

    @CalledByNative
    public void start() {
    }

    @CalledByNative
    public void stop(boolean z) {
    }

    @CalledByNative
    public void takeSnapshot(SnapshotSourceType snapshotSourceType, TakeSnapshotListener takeSnapshotListener) {
    }

    @CalledByNative
    public void uninitialize() {
    }
}
