package com.tencent.liteav.videoproducer.encoder;

import androidx.annotation.NonNull;
import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.videobase.base.TakeSnapshotListener;
import com.tencent.liteav.videobase.common.EncodedVideoFrame;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.utils.Rotation;
import com.tencent.liteav.videobase.videobase.IVideoReporter;
import com.tencent.liteav.videobase.videobase.e;
import com.tencent.liteav.videoproducer.encoder.VideoEncoderDef;
import com.tencent.liteav.videoproducer.encoder.be;
import com.tencent.liteav.videoproducer.producer.ServerVideoProducerConfig;
import com.tencent.liteav.videoproducer.producer.VideoProducerDef;
import java.nio.ByteBuffer;

@JNINamespace("liteav::video")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class SoftwareVideoEncoder implements e.a, be {
    private com.tencent.liteav.videobase.b.e mEGLCore;
    private VideoEncodeParams mEncodeParams;
    private com.tencent.liteav.videobase.videobase.e mFrameConverter;
    private com.tencent.liteav.videobase.frame.e mGLTexturePool;
    private be.a mListener;
    private long mNativeEncodeWrapper;
    private com.tencent.liteav.videobase.frame.j mPixelFrameRenderer;
    private final IVideoReporter mReporter;
    private final com.tencent.liteav.videobase.utils.l mSnapshotTaker;
    private final String mTAG;

    public SoftwareVideoEncoder(@NonNull IVideoReporter iVideoReporter, VideoProducerDef.StreamType streamType) {
    }

    @CalledByNative
    private static EncodedVideoFrame createEncodedVideoFrameCallFromNative(ByteBuffer byteBuffer, int i2, int i3, int i4, long j2, long j3, long j4, int i5, int i6, long j5, long j6, long j7) {
    }

    private boolean initOpenGLComponents(Object obj) {
    }

    private static native long nativeCreate(SoftwareVideoEncoder softwareVideoEncoder);

    private static native void nativeDestroy(long j2);

    private static native int nativeEncodeFrame(long j2, byte[] bArr, int i2, int i3, long j3);

    private static native void nativeRestartIDR(long j2);

    private static native void nativeSetBitrate(long j2, int i2);

    private static native void nativeSetFps(long j2, int i2);

    private static native int nativeSetNearestRPS(long j2, int i2);

    private static native int nativeSetRPSRefBitmap(long j2, int i2, int i3);

    private static native void nativeSetRpsIdrFps(long j2, int i2);

    private static native int nativeStart(long j2, VideoEncodeParams videoEncodeParams);

    private static native int nativeStop(long j2);

    @CalledByNative
    private void onEncodedError(int i2) {
    }

    @CalledByNative
    private void onEncodedNAL(EncodedVideoFrame encodedVideoFrame) {
    }

    @CalledByNative
    private void onRpsFrameRateChanged(boolean z, int i2) {
    }

    private void uninitializeOpenGLComponents() {
    }

    @Override // com.tencent.liteav.videoproducer.encoder.be
    public void ackRPSRecvFrameIndex(int i2, int i3) {
    }

    @Override // com.tencent.liteav.videoproducer.encoder.be
    public void encodeFrame(PixelFrame pixelFrame, Rotation rotation, boolean z) {
    }

    @Override // com.tencent.liteav.videoproducer.encoder.be
    public VideoEncodeParams getEncodeParams() {
    }

    @Override // com.tencent.liteav.videoproducer.encoder.be
    public VideoEncoderDef.a getEncoderType() {
    }

    @Override // com.tencent.liteav.videoproducer.encoder.be
    public void initialize() {
    }

    @Override // com.tencent.liteav.videobase.videobase.e.a
    public void onFrameConverted(int i2, PixelFrame pixelFrame) {
    }

    @Override // com.tencent.liteav.videoproducer.encoder.be
    public void restartIDRFrame() {
    }

    @Override // com.tencent.liteav.videoproducer.encoder.be
    public void setBitrate(int i2) {
    }

    @Override // com.tencent.liteav.videoproducer.encoder.be
    public void setFps(int i2) {
    }

    @Override // com.tencent.liteav.videoproducer.encoder.be
    public void setRPSIFrameFPS(int i2) {
    }

    @Override // com.tencent.liteav.videoproducer.encoder.be
    public void setRPSNearestREFSize(int i2) {
    }

    @Override // com.tencent.liteav.videoproducer.encoder.be
    public void setServerConfig(ServerVideoProducerConfig serverVideoProducerConfig) {
    }

    @Override // com.tencent.liteav.videoproducer.encoder.be
    public void signalEndOfStream() {
    }

    @Override // com.tencent.liteav.videoproducer.encoder.be
    public boolean start(VideoEncodeParams videoEncodeParams, be.a aVar) {
    }

    @Override // com.tencent.liteav.videoproducer.encoder.be
    public void stop() {
    }

    @Override // com.tencent.liteav.videoproducer.encoder.be
    public void takeSnapshot(TakeSnapshotListener takeSnapshotListener) {
    }

    @Override // com.tencent.liteav.videoproducer.encoder.be
    public void uninitialize() {
    }
}
