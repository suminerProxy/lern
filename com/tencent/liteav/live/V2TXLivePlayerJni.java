package com.tencent.liteav.live;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.utils.Rotation;
import com.tencent.liteav.videobase.videobase.DisplayTarget;
import com.tencent.live2.V2TXLiveDef;
import com.tencent.live2.V2TXLivePlayer;
import com.tencent.live2.V2TXLivePlayerObserver;
import com.tencent.live2.impl.V2TXLiveDefInner;
import com.tencent.live2.impl.V2TXLivePlayerImpl;
import com.tencent.rtmp.ui.TXCloudVideoView;
import java.lang.ref.WeakReference;
import java.util.Set;

@JNINamespace("liteav")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class V2TXLivePlayerJni extends V2TXLivePlayer {
    private static final String TAG = "V2TXLivePlayerJni";
    private Integer mAudioRoute;
    private GLConstants.PixelBufferType mBufferType;
    private Integer mComponent;
    private DisplayTarget mDisplayTarget;
    private Boolean mEnableCustomRendering;
    private Boolean mEnableExtensionCallback;
    private Boolean mEnableHardwareDecode;
    private Boolean mEnableRTMPAcc;
    private Integer mFramework;
    private Boolean mIsPauseAudio;
    private Boolean mIsPauseVideo;
    private String mLEBEnv;
    private Float mMax;
    private Float mMin;
    public long mNativeV2TXLivePlayerJni;
    private V2TXLivePlayerObserver mObserver;
    private GLConstants.PixelFormatType mPixelFormatType;
    private V2TXLivePlayerImpl mProxy;
    private Integer mRetryInterval;
    private Integer mRetryLimits;
    private Rotation mRotation;
    private Set<Integer> mSEIPayloadSet;
    private GLConstants.GLScaleType mScaleType;
    private Boolean mShowDebugView;
    private Surface mSurface;
    private V2TXLiveDefInner.SurfaceSize mSurfaceSize;
    private Integer mVolume;
    private Integer mVolumeIntervalMs;

    /* renamed from: com.tencent.liteav.live.V2TXLivePlayerJni$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f11604a = null;
        public static final /* synthetic */ int[] b = null;
        public static final /* synthetic */ int[] c = null;

        /* renamed from: d  reason: collision with root package name */
        public static final /* synthetic */ int[] f11605d = null;

        /* renamed from: e  reason: collision with root package name */
        public static final /* synthetic */ int[] f11606e = null;
    }

    public V2TXLivePlayerJni(Context context, V2TXLivePlayerImpl v2TXLivePlayerImpl) {
    }

    private void enableExtensionCallback(boolean z) {
    }

    @CalledByNative
    public static V2TXLiveDef.V2TXLivePlayerStatistics getJavaV2TXLivePlayerStatistics(int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
    }

    private boolean isNativeValid() {
    }

    private static native long nativeCreate(WeakReference<V2TXLivePlayerJni> weakReference);

    private static native void nativeDestroy(long j2);

    private static native int nativeEnableCustomRendering(long j2, boolean z, int i2, int i3);

    private static native void nativeEnableExtensionCallback(long j2, boolean z);

    private static native void nativeEnableHardwareDecode(long j2, boolean z);

    private static native void nativeEnableRTMPAcc(long j2, boolean z);

    private static native int nativeEnableReceiveSeiMessage(long j2, boolean z, int i2);

    private static native int nativeEnableVolumeEvaluation(long j2, int i2);

    private static native int nativeIsPlaying(long j2);

    private static native int nativePauseAudio(long j2);

    private static native int nativePauseVideo(long j2);

    private static native int nativeResumeAudio(long j2);

    private static native int nativeResumeVideo(long j2);

    private static native void nativeSetAudioRoute(long j2, int i2);

    private static native int nativeSetCacheParams(long j2, float f2, float f3);

    private static native void nativeSetFramework(long j2, int i2, int i3);

    private static native void nativeSetLEBEnv(long j2, String str);

    private static native int nativeSetPlayoutVolume(long j2, int i2);

    private static native int nativeSetRenderFillMode(long j2, int i2);

    private static native int nativeSetRenderRotation(long j2, int i2);

    private static native int nativeSetRenderView(long j2, DisplayTarget displayTarget);

    private static native void nativeSetRetryInterval(long j2, int i2);

    private static native void nativeSetRetryLimits(long j2, int i2);

    private static native void nativeShowDebugView(long j2, boolean z);

    private static native int nativeSnapshot(long j2);

    private static native int nativeStartPlay(long j2, String str);

    private static native int nativeStopPlay(long j2);

    private static native int nativeSwitchStream(long j2, String str);

    @CalledByNative
    public static V2TXLivePlayerJni weakToStrongReference(WeakReference<V2TXLivePlayerJni> weakReference) {
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int enableObserveVideoFrame(boolean z, V2TXLiveDef.V2TXLivePixelFormat v2TXLivePixelFormat, V2TXLiveDef.V2TXLiveBufferType v2TXLiveBufferType) {
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int enableReceiveSeiMessage(boolean z, int i2) {
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int enableVolumeEvaluation(int i2) {
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int isPlaying() {
    }

    @CalledByNative
    public void onAudioLoading(Bundle bundle) {
    }

    @CalledByNative
    public void onAudioPlaying(boolean z, Bundle bundle) {
    }

    @CalledByNative
    public void onConnected(Bundle bundle) {
    }

    @CalledByNative
    public void onError(int i2, String str, Bundle bundle) {
    }

    @CalledByNative
    public void onNetworkQuality(int i2) {
    }

    @CalledByNative
    public void onPlayEvent(int i2, Bundle bundle) {
    }

    @CalledByNative
    public void onPlayNetStatus(Bundle bundle) {
    }

    @CalledByNative
    public void onPlayoutVolumeUpdate(int i2) {
    }

    @CalledByNative
    public void onReceiveSeiMessage(int i2, byte[] bArr) {
    }

    @CalledByNative
    public void onRenderVideoFrame(PixelFrame pixelFrame) {
    }

    @CalledByNative
    public void onSnapshotComplete(Bitmap bitmap) {
    }

    @CalledByNative
    public void onStatisticsUpdate(V2TXLiveDef.V2TXLivePlayerStatistics v2TXLivePlayerStatistics) {
    }

    @CalledByNative
    public void onVideoLoading(Bundle bundle) {
    }

    @CalledByNative
    public void onVideoPlaying(boolean z, Bundle bundle) {
    }

    @CalledByNative
    public void onVideoResolutionChanged(int i2, int i3) {
    }

    @CalledByNative
    public void onWarning(int i2, String str, Bundle bundle) {
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int pauseAudio() {
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int pauseVideo() {
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int resumeAudio() {
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int resumeVideo() {
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int setCacheParams(float f2, float f3) {
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public void setObserver(V2TXLivePlayerObserver v2TXLivePlayerObserver) {
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int setPlayoutVolume(int i2) {
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int setProperty(String str, Object obj) {
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int setRenderFillMode(V2TXLiveDef.V2TXLiveFillMode v2TXLiveFillMode) {
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int setRenderRotation(V2TXLiveDef.V2TXLiveRotation v2TXLiveRotation) {
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int setRenderView(TXCloudVideoView tXCloudVideoView) {
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public void showDebugView(boolean z) {
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int snapshot() {
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int startPlay(String str) {
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int stopPlay() {
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int switchStream(String str) {
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int setRenderView(TextureView textureView) {
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int setRenderView(SurfaceView surfaceView) {
    }
}
