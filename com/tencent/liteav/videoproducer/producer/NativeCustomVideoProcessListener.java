package com.tencent.liteav.videoproducer.producer;

import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.videobase.frame.PixelFrame;

@JNINamespace("liteav::video")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class NativeCustomVideoProcessListener implements CustomVideoProcessListener {
    private long mNativeVideoCustomProcessListener;

    @CalledByNative
    private NativeCustomVideoProcessListener(long j2) {
    }

    private native void nativeOnGLContextCreated(long j2);

    private native void nativeOnGLContextDestroy(long j2);

    private native void nativeOnProcessFrame(long j2, PixelFrame pixelFrame, PixelFrame pixelFrame2, int i2, int i3, long j3, int i4);

    @CalledByNative
    private synchronized void reset() {
    }

    @Override // com.tencent.liteav.videoproducer.producer.CustomVideoProcessListener
    public synchronized void onGLContextCreated() {
    }

    @Override // com.tencent.liteav.videoproducer.producer.CustomVideoProcessListener
    public synchronized void onGLContextDestroy() {
    }

    @Override // com.tencent.liteav.videoproducer.producer.CustomVideoProcessListener
    public synchronized void onProcessFrame(PixelFrame pixelFrame, PixelFrame pixelFrame2) {
    }
}
