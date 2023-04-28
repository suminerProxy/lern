package com.tencent.liteav.videoconsumer.consumer;

import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videoconsumer.renderer.VideoRenderListener;

@JNINamespace("liteav::video")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class NativeCustomRenderListener implements VideoRenderListener {
    public static final String TAG = "NativeCustomRenderListener";
    private long mNativeVideoCustomRenderListener;

    @CalledByNative
    private NativeCustomRenderListener(long j2) {
    }

    private native void nativeOnCustomRenderFrame(long j2, PixelFrame pixelFrame, int i2, int i3, long j3, int i4);

    @CalledByNative
    private synchronized void reset() {
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.VideoRenderListener
    public synchronized void onRenderFrame(PixelFrame pixelFrame) {
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.VideoRenderListener
    public void onRenderTargetSizeChanged(int i2, int i3) {
    }
}
