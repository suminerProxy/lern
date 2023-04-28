package com.tencent.liteav.videoconsumer.decoder;

import androidx.annotation.NonNull;
import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.videobase.common.EncodedVideoFrame;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.videobase.IVideoReporter;
import com.tencent.liteav.videobase.videobase.h;
import com.tencent.liteav.videoconsumer.consumer.ServerVideoConsumerConfig;
import com.tencent.liteav.videoconsumer.decoder.VideoDecoderDef;
import com.tencent.liteav.videoconsumer.decoder.av;
import java.nio.ByteBuffer;

@JNINamespace("liteav::video")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class SoftwareVideoDecoder implements av {
    private static final String TAG = "SoftwareVideoDecoder";
    private aw mListener;
    private long mNativeVideoDecoderWrapper;
    private com.tencent.liteav.videobase.frame.i mPixelFramePool;
    @NonNull
    private final IVideoReporter mReporter;
    private Object mSharedEGLContext;

    public SoftwareVideoDecoder(@NonNull IVideoReporter iVideoReporter) {
    }

    @CalledByNative
    private ByteBuffer getByteBufferFromPixelFrame(PixelFrame pixelFrame) {
    }

    private void handleDecoderError(h.c cVar, String str, Object... objArr) {
    }

    private static native void nativeAbandonDecodingFrames(long j2);

    private static native long nativeCreate(SoftwareVideoDecoder softwareVideoDecoder);

    private static native int nativeDecodeFrame(long j2, EncodedVideoFrame encodedVideoFrame, ByteBuffer byteBuffer, int i2, int i3, int i4, long j3, long j4);

    private static native void nativeDestroy(long j2);

    private static native int nativeStart(long j2);

    private static native int nativeStop(long j2);

    @CalledByNative
    private PixelFrame obtainPixelFrame(int i2, int i3, int i4, int i5, long j2) {
    }

    @CalledByNative
    private void onDecodedFrame(PixelFrame pixelFrame, long j2) {
    }

    @Override // com.tencent.liteav.videoconsumer.decoder.av
    public void abandonDecodingFrames() {
    }

    @Override // com.tencent.liteav.videoconsumer.decoder.av
    public void decode(EncodedVideoFrame encodedVideoFrame) {
    }

    @Override // com.tencent.liteav.videoconsumer.decoder.av
    public av.a getDecoderType() {
    }

    @Override // com.tencent.liteav.videoconsumer.decoder.av
    public void initialize() {
    }

    @Override // com.tencent.liteav.videoconsumer.decoder.av
    public void setScene(VideoDecoderDef.ConsumerScene consumerScene) {
    }

    @Override // com.tencent.liteav.videoconsumer.decoder.av
    public void setServerConfig(ServerVideoConsumerConfig serverVideoConsumerConfig) {
    }

    @Override // com.tencent.liteav.videoconsumer.decoder.av
    public void signalEndOfStream() {
    }

    @Override // com.tencent.liteav.videoconsumer.decoder.av
    public void start(Object obj, aw awVar) {
    }

    @Override // com.tencent.liteav.videoconsumer.decoder.av
    public void stop() {
    }

    @Override // com.tencent.liteav.videoconsumer.decoder.av
    public void uninitialize() {
    }
}
