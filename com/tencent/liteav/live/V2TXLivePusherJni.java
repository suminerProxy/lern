package com.tencent.liteav.live;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.beauty.TXBeautyManager;
import com.tencent.liteav.device.TXDeviceManager;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.videobase.DisplayTarget;
import com.tencent.live2.V2TXLiveDef;
import com.tencent.live2.V2TXLivePusher;
import com.tencent.live2.V2TXLivePusherObserver;
import com.tencent.live2.impl.V2TXLiveDefInner;
import com.tencent.rtmp.ui.TXCloudVideoView;
import java.lang.ref.WeakReference;
import java.util.HashMap;

@JNINamespace("liteav")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class V2TXLivePusherJni extends V2TXLivePusher {
    private static final String TAG = "V2TXLivePusherJni";
    private TXAudioEffectManager mAudioEffectManager;
    private TXBeautyManager mBeautyManager;
    private TXDeviceManager mDeviceManager;
    private long mNativeV2TXLivePusherJni;
    private V2TXLivePusherObserver mObserver;
    private Surface mSurface;
    private V2TXLiveDefInner.SurfaceSize mSurfaceSize;

    /* renamed from: com.tencent.liteav.live.V2TXLivePusherJni$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f11607a = null;
        public static final /* synthetic */ int[] b = null;
        public static final /* synthetic */ int[] c = null;

        /* renamed from: d  reason: collision with root package name */
        public static final /* synthetic */ int[] f11608d = null;

        /* renamed from: e  reason: collision with root package name */
        public static final /* synthetic */ int[] f11609e = null;
    }

    public V2TXLivePusherJni(Context context, int i2) {
    }

    private int enable3A(String str, Object obj) {
    }

    private static native long nativeCreate(WeakReference<V2TXLivePusherJni> weakReference, int i2);

    private static native long nativeCreateAudioEffectManager(long j2);

    private static native long nativeCreateBeautyManager(long j2);

    private static native long nativeCreateDeviceManager(long j2);

    private static native void nativeDestroy(long j2);

    private static native void nativeEnableAGC(long j2, boolean z, int i2);

    private static native void nativeEnableANS(long j2, boolean z, int i2);

    private static native int nativeEnableCustomAudioCapture(long j2, boolean z);

    private static native int nativeEnableCustomVideoCapture(long j2, boolean z);

    private static native int nativeEnableCustomVideoProcess(long j2, boolean z, int i2, int i3);

    private static native void nativeEnableExtensionCallback(long j2, boolean z);

    private static native void nativeEnableRealtimeMode(long j2, boolean z);

    private static native int nativeEnableVolumeEvaluation(long j2, int i2);

    private static native int nativeIsPushing(long j2);

    private static native int nativePauseAudio(long j2);

    private static native int nativePauseVideo(long j2);

    private static native int nativeResumeAudio(long j2);

    private static native int nativeResumeVideo(long j2);

    private static native int nativeSendCustomAudioFrame(long j2, byte[] bArr, int i2, int i3);

    private static native int nativeSendCustomVideoFrame(long j2, PixelFrame pixelFrame);

    private static native int nativeSendSeiMessage(long j2, int i2, byte[] bArr);

    private static native int nativeSetAudioQuality(long j2, int i2);

    private static native void nativeSetDisplayOrientation(long j2, int i2);

    private static native int nativeSetEncoderMirror(long j2, boolean z);

    private static native void nativeSetFramework(long j2, int i2, int i3);

    private static native void nativeSetMetaData(long j2, HashMap<String, String> hashMap);

    private static native int nativeSetMixTranscodingConfig(long j2, String str);

    private static native int nativeSetRenderMirror(long j2, int i2);

    private static native int nativeSetRenderRotation(long j2, int i2);

    private static native int nativeSetRenderView(long j2, DisplayTarget displayTarget);

    private static native int nativeSetVideoQuality(long j2, int i2, int i3, int i4, int i5, int i6);

    private static native int nativeSetVideoQualityEx(long j2, int i2, int i3, int i4, int i5, int i6, int i7);

    private static native int nativeSetWatermark(long j2, Bitmap bitmap, float f2, float f3, float f4);

    private static native void nativeShowDebugView(long j2, boolean z);

    private static native int nativeSnapshot(long j2);

    private static native int nativeStartCamera(long j2, boolean z);

    private static native int nativeStartMicrophone(long j2);

    private static native int nativeStartPush(long j2, String str);

    private static native int nativeStartScreenCapture(long j2);

    private static native int nativeStartVirtualCamera(long j2, Bitmap bitmap);

    private static native int nativeStopCamera(long j2);

    private static native int nativeStopMicrophone(long j2);

    private static native int nativeStopPush(long j2);

    private static native int nativeStopScreenCapture(long j2);

    private static native int nativeStopVirtualCamera(long j2);

    private static boolean pixelFrameToV2VideoFrame(PixelFrame pixelFrame, V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
    }

    private static boolean v2VideoFrameToPixelFrame(V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame, PixelFrame pixelFrame) {
    }

    @CalledByNative
    public static V2TXLivePusherJni weakToStrongReference(WeakReference<V2TXLivePusherJni> weakReference) {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int enableCustomAudioCapture(boolean z) {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int enableCustomVideoCapture(boolean z) {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int enableCustomVideoProcess(boolean z, V2TXLiveDef.V2TXLivePixelFormat v2TXLivePixelFormat, V2TXLiveDef.V2TXLiveBufferType v2TXLiveBufferType) {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int enableVolumeEvaluation(int i2) {
    }

    public void finalize() throws Throwable {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public TXAudioEffectManager getAudioEffectManager() {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public TXBeautyManager getBeautyManager() {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public TXDeviceManager getDeviceManager() {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int isPushing() {
    }

    @CalledByNative
    public void onCaptureFirstAudioFrame() {
    }

    @CalledByNative
    public void onCaptureFirstVideoFrame() {
    }

    @CalledByNative
    public int onCustomPreprocessFrame(PixelFrame pixelFrame, PixelFrame pixelFrame2) {
    }

    @CalledByNative
    public void onEnterRoom(int i2, String str) {
    }

    @CalledByNative
    public void onError(int i2, String str, Bundle bundle) {
    }

    @CalledByNative
    public void onExitRoom(int i2, String str) {
    }

    @CalledByNative
    public void onGLContextCreated() {
    }

    @CalledByNative
    public void onGLContextDestroyed() {
    }

    @CalledByNative
    public void onMicrophoneVolumeUpdate(int i2) {
    }

    @CalledByNative
    public void onNetworkQuality(int i2) {
    }

    @CalledByNative
    public void onPushEvent(int i2, Bundle bundle) {
    }

    @CalledByNative
    public void onPushNetStatus(Bundle bundle) {
    }

    @CalledByNative
    public void onPushStatusUpdate(int i2, String str, Bundle bundle) {
    }

    @CalledByNative
    public void onSetMixTranscodingConfig(int i2, String str) {
    }

    @CalledByNative
    public void onSnapshotComplete(Bitmap bitmap) {
    }

    @CalledByNative
    public void onStatisticsUpdate(int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
    }

    @CalledByNative
    public void onUserAudioAvailable(String str, boolean z) {
    }

    @CalledByNative
    public void onUserOffline(String str) {
    }

    @CalledByNative
    public void onUserOnline(String str) {
    }

    @CalledByNative
    public void onUserVideoAvailable(String str, int i2, boolean z) {
    }

    @CalledByNative
    public void onWarning(int i2, String str, Bundle bundle) {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int pauseAudio() {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int pauseVideo() {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public void release() {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int resumeAudio() {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int resumeVideo() {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int sendCustomAudioFrame(V2TXLiveDef.V2TXLiveAudioFrame v2TXLiveAudioFrame) {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int sendCustomVideoFrame(V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int sendSeiMessage(int i2, byte[] bArr) {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int setAudioQuality(V2TXLiveDef.V2TXLiveAudioQuality v2TXLiveAudioQuality) {
    }

    public void setDisplayOrientation(int i2) {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int setEncoderMirror(boolean z) {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int setMixTranscodingConfig(V2TXLiveDef.V2TXLiveTranscodingConfig v2TXLiveTranscodingConfig) {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public void setObserver(V2TXLivePusherObserver v2TXLivePusherObserver) {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int setProperty(String str, Object obj) {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int setRenderMirror(V2TXLiveDef.V2TXLiveMirrorType v2TXLiveMirrorType) {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int setRenderRotation(V2TXLiveDef.V2TXLiveRotation v2TXLiveRotation) {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int setRenderView(TXCloudVideoView tXCloudVideoView) {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int setVideoQuality(V2TXLiveDef.V2TXLiveVideoEncoderParam v2TXLiveVideoEncoderParam) {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int setWatermark(Bitmap bitmap, float f2, float f3, float f4) {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public void showDebugView(boolean z) {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int snapshot() {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int startCamera(boolean z) {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int startMicrophone() {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int startPush(String str) {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int startScreenCapture() {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int startVirtualCamera(Bitmap bitmap) {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int stopCamera() {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int stopMicrophone() {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int stopPush() {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int stopScreenCapture() {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int stopVirtualCamera() {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int setRenderView(TextureView textureView) {
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int setRenderView(SurfaceView surfaceView) {
    }
}
