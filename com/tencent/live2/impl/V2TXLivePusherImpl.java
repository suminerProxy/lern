package com.tencent.live2.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.Display;
import android.view.OrientationEventListener;
import android.view.SurfaceView;
import android.view.TextureView;
import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.liteav.beauty.TXBeautyManager;
import com.tencent.liteav.device.TXDeviceManager;
import com.tencent.liteav.live.V2TXLivePusherJni;
import com.tencent.live2.V2TXLiveDef;
import com.tencent.live2.V2TXLivePusher;
import com.tencent.live2.V2TXLivePusherObserver;
import com.tencent.rtmp.ui.TXCloudVideoView;
import java.lang.ref.WeakReference;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class V2TXLivePusherImpl extends V2TXLivePusher {
    private static final String TAG = "V2TXLivePusherImpl";
    private DisplayOrientationListener mDisplayOrientationListener;
    private V2TXLivePusherJni mImpl;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class DisplayOrientationListener extends OrientationEventListener {
        private Display mDisplay;
        private Orientation mOrientation;
        private WeakReference<V2TXLivePusherImpl> mWeakPusher;

        public DisplayOrientationListener(Context context, WeakReference<V2TXLivePusherImpl> weakReference) {
        }

        private Orientation convert(int i2) {
        }

        public Orientation getOrientation() {
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i2) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class Orientation {
        private static final /* synthetic */ Orientation[] $VALUES = null;
        public static final Orientation kDown = null;
        public static final Orientation kLeft = null;
        public static final Orientation kRight = null;
        public static final Orientation kUp = null;
        private int index;

        private Orientation(String str, int i2, int i3) {
        }

        public static Orientation valueOf(String str) {
        }

        public static Orientation[] values() {
        }

        public final int getIndex() {
        }
    }

    public V2TXLivePusherImpl(Context context, V2TXLiveDef.V2TXLiveMode v2TXLiveMode) {
    }

    public static /* synthetic */ void access$000(V2TXLivePusherImpl v2TXLivePusherImpl, Orientation orientation) {
    }

    private synchronized void setDisplayOrientation(Orientation orientation) {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int enableCustomAudioCapture(boolean z) {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int enableCustomVideoCapture(boolean z) {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int enableCustomVideoProcess(boolean z, V2TXLiveDef.V2TXLivePixelFormat v2TXLivePixelFormat, V2TXLiveDef.V2TXLiveBufferType v2TXLiveBufferType) {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int enableVolumeEvaluation(int i2) {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized TXAudioEffectManager getAudioEffectManager() {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized TXBeautyManager getBeautyManager() {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized TXDeviceManager getDeviceManager() {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int isPushing() {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int pauseAudio() {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int pauseVideo() {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized void release() {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int resumeAudio() {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int resumeVideo() {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int sendCustomAudioFrame(V2TXLiveDef.V2TXLiveAudioFrame v2TXLiveAudioFrame) {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int sendCustomVideoFrame(V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int sendSeiMessage(int i2, byte[] bArr) {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int setAudioQuality(V2TXLiveDef.V2TXLiveAudioQuality v2TXLiveAudioQuality) {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int setEncoderMirror(boolean z) {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int setMixTranscodingConfig(V2TXLiveDef.V2TXLiveTranscodingConfig v2TXLiveTranscodingConfig) {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized void setObserver(V2TXLivePusherObserver v2TXLivePusherObserver) {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int setProperty(String str, Object obj) {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int setRenderMirror(V2TXLiveDef.V2TXLiveMirrorType v2TXLiveMirrorType) {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int setRenderRotation(V2TXLiveDef.V2TXLiveRotation v2TXLiveRotation) {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int setRenderView(TXCloudVideoView tXCloudVideoView) {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int setVideoQuality(V2TXLiveDef.V2TXLiveVideoEncoderParam v2TXLiveVideoEncoderParam) {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int setWatermark(Bitmap bitmap, float f2, float f3, float f4) {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized void showDebugView(boolean z) {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int snapshot() {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int startCamera(boolean z) {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int startMicrophone() {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int startPush(String str) {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int startScreenCapture() {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int startVirtualCamera(Bitmap bitmap) {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int stopCamera() {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int stopMicrophone() {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int stopPush() {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int stopScreenCapture() {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int stopVirtualCamera() {
    }

    private V2TXLivePusherImpl(Context context, int i2) {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int setRenderView(TextureView textureView) {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int setRenderView(SurfaceView surfaceView) {
    }
}
