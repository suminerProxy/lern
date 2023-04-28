package com.tencent.liteav.live;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.Surface;
import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.videobase.DisplayTarget;
import com.tencent.rtmp.ITXLivePlayListener;
import com.tencent.rtmp.TXLivePlayConfig;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.ui.TXCloudVideoView;
import com.tencent.ugc.TXRecordCommon;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

@JNINamespace("liteav")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TXLivePlayerJni implements com.tencent.rtmp.a, TXCloudVideoView.b {
    private static final String TAG = "TXLivePlayerJni";
    private String mAESIV;
    private String mAESKey;
    private Integer mAESMode;
    private String mAESURL;
    private TXLivePlayer.ITXAudioRawDataListener mAudioRawDataListener;
    private Integer mAudioRoute;
    private TXLivePlayer.ITXAudioVolumeEvaluationListener mAudioVolumeEvaluationListener;
    private TXLivePlayConfig mConfig;
    private DisplayTarget mDisplayTarget;
    private Boolean mEnableHardwareDecoder;
    private Object mGLContext;
    private Boolean mIsAudioMuted;
    private ITXLivePlayListener mListener;
    private Long mNativeAudioJitterBufferControllerFactory;
    public long mNativeTXLivePlayerJni;
    private Integer mRenderMode;
    private Integer mRenderRotate;
    private Boolean mShowDebugView;
    private TXLivePlayer.ITXSnapshotListener mSnapshotListener;
    private Surface mSurface;
    private int mSurfaceHeight;
    private int mSurfaceWidth;
    private TXLivePlayer.ITXVideoRawDataListener mVideoRawDataListener;
    private TXRecordCommon.ITXVideoRecordListener mVideoRecordListener;
    private TXLivePlayer.ITXLivePlayVideoRenderListener mVideoRenderListener;
    private Integer mVolume;
    private Integer mVolumeIntervalMs;

    public TXLivePlayerJni(Context context) {
    }

    private static String genFilePath(Context context, String str) {
    }

    private static String getDiskFileDir(Context context) {
    }

    @CalledByNative
    public static String[] getMapKeys(Map<String, String> map) {
    }

    @CalledByNative
    public static String[] getMapValues(Map<String, String> map, String[] strArr) {
    }

    private boolean isNativeValid() {
    }

    private static native long nativeCreate(WeakReference<TXLivePlayerJni> weakReference);

    private static native void nativeDestroy(long j2);

    private static native void nativeEnableAudioVolumeEvaluation(long j2, int i2);

    private static native void nativeEnableCustomAudioProcess(long j2, boolean z);

    private static native void nativeEnableCustomRenderI420(long j2, boolean z);

    private static native void nativeEnableCustomRenderTexture(long j2, boolean z, Object obj);

    private static native void nativeEnableHardwareDecode(long j2, boolean z);

    private static native long nativeGetCurrentRenderPts(long j2);

    private static native boolean nativeIsPlaying(long j2);

    private static native void nativePause(long j2);

    private static native void nativeResume(long j2);

    private static native void nativeSetAESCodecParams(long j2, String str, int i2, String str2, String str3);

    private static native void nativeSetAudioJitterBufferControllerFactory(long j2, long j3);

    private static native void nativeSetAudioRoute(long j2, int i2);

    private static native void nativeSetConfig(long j2, float f2, float f3, float f4, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, String str, Map map);

    private static native void nativeSetMute(long j2, boolean z);

    private static native void nativeSetPlayerView(long j2, DisplayTarget displayTarget);

    private static native void nativeSetRenderMode(long j2, int i2);

    private static native void nativeSetRenderRotation(long j2, int i2);

    private static native void nativeSetVolume(long j2, int i2);

    private static native void nativeShowDebugView(long j2, boolean z);

    private static native void nativeSnapshot(long j2);

    private static native int nativeStartPlay(long j2, String str, int i2);

    private static native void nativeStartRecord(long j2, int i2, String str);

    private static native void nativeStopPlay(long j2, boolean z);

    private static native void nativeStopRecord(long j2);

    private static native int nativeSwitchStream(long j2, String str);

    private void setAudioJitterBufferFactory(JSONObject jSONObject) {
    }

    private void setEncryptionParams(JSONObject jSONObject) {
    }

    @CalledByNative
    public static TXLivePlayerJni weakToStrongReference(WeakReference<TXLivePlayerJni> weakReference) {
    }

    @Override // com.tencent.rtmp.a
    public boolean addVideoRawData(byte[] bArr) {
    }

    @Override // com.tencent.rtmp.a
    public void callExperimentalAPI(String str) {
    }

    @Override // com.tencent.rtmp.a
    public void enableAudioVolumeEvaluation(int i2) {
    }

    @Override // com.tencent.rtmp.a
    public boolean enableHardwareDecode(boolean z) {
    }

    @Override // com.tencent.rtmp.a
    public long getCurrentRenderPts() {
    }

    @Override // com.tencent.rtmp.a
    public boolean isPlaying() {
    }

    @CalledByNative
    public void onAudioInfoChanged(int i2, int i3, int i4) {
    }

    @CalledByNative
    public void onAudioVolumeEvaluationNotify(int i2) {
    }

    @CalledByNative
    public void onNetStatus(Bundle bundle) {
    }

    @CalledByNative
    public void onPcmDataAvailable(byte[] bArr, long j2) {
    }

    @CalledByNative
    public void onPlayEvent(int i2, Bundle bundle) {
    }

    @CalledByNative
    public void onRecordComplete(int i2, String str, String str2, String str3) {
    }

    @CalledByNative
    public void onRecordEvent(int i2, Bundle bundle) {
    }

    @CalledByNative
    public void onRecordProgress(long j2) {
    }

    @CalledByNative
    public void onRenderVideoFrame(PixelFrame pixelFrame) {
    }

    @Override // com.tencent.rtmp.ui.TXCloudVideoView.b
    public void onShowLog(boolean z) {
    }

    @CalledByNative
    public void onSnapshot(Bitmap bitmap) {
    }

    @Override // com.tencent.rtmp.a
    public void pause() {
    }

    @Override // com.tencent.rtmp.a
    public int prepareLiveSeek(String str, int i2) {
    }

    @Override // com.tencent.rtmp.a
    public void resume() {
    }

    @Override // com.tencent.rtmp.a
    public int resumeLive() {
    }

    @Override // com.tencent.rtmp.a
    public void seek(int i2) {
    }

    @Override // com.tencent.rtmp.a
    public void setAudioRawDataListener(TXLivePlayer.ITXAudioRawDataListener iTXAudioRawDataListener) {
    }

    @Override // com.tencent.rtmp.a
    public void setAudioRoute(int i2) {
    }

    @Override // com.tencent.rtmp.a
    public void setAudioVolumeEvaluationListener(TXLivePlayer.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener) {
    }

    @Override // com.tencent.rtmp.a
    public void setAutoPlay(boolean z) {
    }

    @Override // com.tencent.rtmp.a
    public void setConfig(TXLivePlayConfig tXLivePlayConfig) {
    }

    @Override // com.tencent.rtmp.a
    public void setMute(boolean z) {
    }

    @Override // com.tencent.rtmp.a
    public void setPlayListener(ITXLivePlayListener iTXLivePlayListener) {
    }

    @Override // com.tencent.rtmp.a
    public void setPlayerView(TXCloudVideoView tXCloudVideoView) {
    }

    @Override // com.tencent.rtmp.a
    public void setRate(float f2) {
    }

    @Override // com.tencent.rtmp.a
    public void setRenderMode(int i2) {
    }

    @Override // com.tencent.rtmp.a
    public void setRenderRotation(int i2) {
    }

    @Override // com.tencent.rtmp.a
    public void setSurface(Surface surface) {
    }

    @Override // com.tencent.rtmp.a
    public void setSurfaceSize(int i2, int i3) {
    }

    @Override // com.tencent.rtmp.a
    public void setVideoRawDataListener(TXLivePlayer.ITXVideoRawDataListener iTXVideoRawDataListener) {
    }

    @Override // com.tencent.rtmp.a
    public void setVideoRecordListener(TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener) {
    }

    @Override // com.tencent.rtmp.a
    public int setVideoRenderListener(TXLivePlayer.ITXLivePlayVideoRenderListener iTXLivePlayVideoRenderListener, Object obj) {
    }

    @Override // com.tencent.rtmp.a
    public void setVolume(int i2) {
    }

    @Override // com.tencent.rtmp.a
    public void showDebugView(boolean z) {
    }

    @Override // com.tencent.rtmp.a
    public void snapshot(TXLivePlayer.ITXSnapshotListener iTXSnapshotListener) {
    }

    @Override // com.tencent.rtmp.a
    public int startPlay(String str, int i2) {
    }

    @Override // com.tencent.rtmp.a
    public int startRecord(int i2) {
    }

    @Override // com.tencent.rtmp.a
    public int stopPlay(boolean z) {
    }

    @Override // com.tencent.rtmp.a
    public int stopRecord() {
    }

    @Override // com.tencent.rtmp.a
    public int switchStream(String str) {
    }
}
