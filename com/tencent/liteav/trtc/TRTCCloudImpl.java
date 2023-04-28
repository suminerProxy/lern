package com.tencent.liteav.trtc;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import androidx.annotation.NonNull;
import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.liteav.audio.TXAudioEffectManagerImpl;
import com.tencent.liteav.beauty.TXBeautyManager;
import com.tencent.liteav.device.TXDeviceManager;
import com.tencent.liteav.device.TXDeviceManagerImpl;
import com.tencent.rtmp.ui.TXCloudVideoView;
import com.tencent.trtc.TRTCCloud;
import com.tencent.trtc.TRTCCloudDef;
import com.tencent.trtc.TRTCCloudListener;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TRTCCloudImpl extends TRTCCloud implements TXAudioEffectManager.TXMusicPlayObserver {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f11642a;
    private static TRTCCloudImpl b;
    private Context c;

    /* renamed from: d  reason: collision with root package name */
    private TRTCCloudListener f11643d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    private TrtcCloudJni f11644e;

    /* renamed from: f  reason: collision with root package name */
    private TRTCCloud.BGMNotify f11645f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    private TXAudioEffectManagerImpl f11646g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    private TXDeviceManagerImpl f11647h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    private TXBeautyManager f11648i;

    /* renamed from: j  reason: collision with root package name */
    private int f11649j;

    /* renamed from: k  reason: collision with root package name */
    private ArrayList<TRTCCloudImpl> f11650k;

    /* renamed from: com.tencent.liteav.trtc.TRTCCloudImpl$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements TXAudioEffectManager.TXMusicPlayObserver {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f11651a;
        public final /* synthetic */ TRTCCloudImpl b;

        public AnonymousClass1(TRTCCloudImpl tRTCCloudImpl, int i2) {
        }

        @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
        public final void onComplete(int i2, int i3) {
        }

        @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
        public final void onPlayProgress(int i2, long j2, long j3) {
        }

        @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
        public final void onStart(int i2, int i3) {
        }
    }

    private TRTCCloudImpl(Context context) {
    }

    public static /* synthetic */ TRTCCloudListener a(TRTCCloudImpl tRTCCloudImpl) {
    }

    private static void b(@NonNull Context context) {
    }

    public static TRTCCloud createInstance(Context context) {
    }

    public static void destroyInstance(TRTCCloud tRTCCloud) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void ConnectOtherRoom(String str) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void DisconnectOtherRoom() {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void callExperimentalAPI(String str) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int checkAudioCapabilitySupport(int i2) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public TRTCCloud createSubCloud() {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void destroySubCloud(TRTCCloud tRTCCloud) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void enableAudioEarMonitoring(boolean z) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void enableAudioVolumeEvaluation(int i2) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void enableCustomAudioCapture(boolean z) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void enableCustomAudioRendering(boolean z) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void enableCustomVideoCapture(int i2, boolean z) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int enableEncSmallVideoStream(boolean z, TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void enableMixExternalAudioFrame(boolean z, boolean z2) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public boolean enableTorch(boolean z) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void enterRoom(TRTCCloudDef.TRTCParams tRTCParams, int i2) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void exitRoom() {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public long generateCustomPTS() {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int getAudioCaptureVolume() {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public TXAudioEffectManager getAudioEffectManager() {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int getAudioPlayoutVolume() {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int getBGMDuration(String str) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public TXBeautyManager getBeautyManager() {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void getCustomAudioRenderingFrame(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public TXDeviceManager getDeviceManager() {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public boolean isCameraAutoFocusFaceModeSupported() {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public boolean isCameraFocusPositionInPreviewSupported() {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public boolean isCameraTorchSupported() {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public boolean isCameraZoomSupported() {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int mixExternalAudioFrame(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void muteAllRemoteAudio(boolean z) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void muteAllRemoteVideoStreams(boolean z) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void muteLocalAudio(boolean z) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void muteLocalVideo(int i2, boolean z) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void muteRemoteAudio(String str, boolean z) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void muteRemoteVideoStream(String str, int i2, boolean z) {
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onComplete(int i2, int i3) {
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onPlayProgress(int i2, long j2, long j3) {
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onStart(int i2, int i3) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void pauseAudioEffect(int i2) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void pauseBGM() {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void pauseScreenCapture() {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void playAudioEffect(TRTCCloudDef.TRTCAudioEffectParam tRTCAudioEffectParam) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void playBGM(String str, TRTCCloud.BGMNotify bGMNotify) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void resumeAudioEffect(int i2) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void resumeBGM() {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void resumeScreenCapture() {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void selectMotionTmpl(String str) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void sendCustomAudioData(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public boolean sendCustomCmdMsg(int i2, byte[] bArr, boolean z, boolean z2) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void sendCustomVideoData(int i2, TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public boolean sendSEIMsg(byte[] bArr, int i2) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setAllAudioEffectsVolume(int i2) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setAudioCaptureVolume(int i2) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setAudioEffectVolume(int i2, int i3) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setAudioFrameListener(TRTCCloudListener.TRTCAudioFrameListener tRTCAudioFrameListener) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setAudioPlayoutVolume(int i2) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setAudioQuality(int i2) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setAudioRoute(int i2) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setBGMPlayoutVolume(int i2) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int setBGMPosition(int i2) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setBGMPublishVolume(int i2) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setBGMVolume(int i2) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setBeautyStyle(int i2, int i3, int i4, int i5) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int setCapturedRawAudioFrameCallbackFormat(TRTCCloudDef.TRTCAudioFrameCallbackFormat tRTCAudioFrameCallbackFormat) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setChinLevel(int i2) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setDebugViewMargin(String str, TRTCCloud.TRTCViewMargin tRTCViewMargin) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setDefaultStreamRecvMode(boolean z, boolean z2) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setEyeScaleLevel(int i2) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setFaceShortLevel(int i2) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setFaceSlimLevel(int i2) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setFaceVLevel(int i2) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setFilter(Bitmap bitmap) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setFilterConcentration(float f2) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setFocusPosition(int i2, int i3) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setGSensorMode(int i2) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public boolean setGreenScreenFile(String str) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setListener(TRTCCloudListener tRTCCloudListener) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setListenerHandler(Handler handler) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int setLocalProcessedAudioFrameCallbackFormat(TRTCCloudDef.TRTCAudioFrameCallbackFormat tRTCAudioFrameCallbackFormat) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setLocalRenderParams(TRTCCloudDef.TRTCRenderParams tRTCRenderParams) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int setLocalVideoProcessListener(int i2, int i3, TRTCCloudListener.TRTCVideoFrameListener tRTCVideoFrameListener) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int setLocalVideoRenderListener(int i2, int i3, TRTCCloudListener.TRTCVideoRenderListener tRTCVideoRenderListener) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setLocalViewFillMode(int i2) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setLocalViewMirror(int i2) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setLocalViewRotation(int i2) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setMicVolumeOnMixing(int i2) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setMixExternalAudioVolume(int i2, int i3) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setMixTranscodingConfig(TRTCCloudDef.TRTCTranscodingConfig tRTCTranscodingConfig) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int setMixedPlayAudioFrameCallbackFormat(TRTCCloudDef.TRTCAudioFrameCallbackFormat tRTCAudioFrameCallbackFormat) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setMotionMute(boolean z) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setNetworkQosParam(TRTCCloudDef.TRTCNetworkQosParam tRTCNetworkQosParam) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setNoseSlimLevel(int i2) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int setPriorRemoteVideoStreamType(int i2) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setRemoteAudioParallelParams(TRTCCloudDef.TRTCAudioParallelParams tRTCAudioParallelParams) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setRemoteAudioVolume(String str, int i2) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setRemoteRenderParams(String str, int i2, TRTCCloudDef.TRTCRenderParams tRTCRenderParams) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setRemoteSubStreamViewFillMode(String str, int i2) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setRemoteSubStreamViewRotation(String str, int i2) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int setRemoteVideoRenderListener(String str, int i2, int i3, TRTCCloudListener.TRTCVideoRenderListener tRTCVideoRenderListener) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int setRemoteVideoStreamType(String str, int i2) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setRemoteViewFillMode(String str, int i2) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setRemoteViewRotation(String str, int i2) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setReverbType(int i2) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setSubStreamEncoderParam(TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setSystemVolumeType(int i2) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setVideoEncoderMirror(boolean z) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setVideoEncoderParam(TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setVideoEncoderRotation(int i2) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setVideoMuteImage(Bitmap bitmap, int i2) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public boolean setVoiceChangerType(int i2) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setWatermark(Bitmap bitmap, int i2, float f2, float f3, float f4) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setZoom(int i2) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void showDebugView(int i2) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void snapshotVideo(String str, int i2, TRTCCloudListener.TRTCSnapshotListener tRTCSnapshotListener) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int startAudioRecording(TRTCCloudDef.TRTCAudioRecordingParams tRTCAudioRecordingParams) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void startLocalAudio(int i2) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void startLocalPreview(boolean z, TXCloudVideoView tXCloudVideoView) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void startLocalRecording(TRTCCloudDef.TRTCLocalRecordingParams tRTCLocalRecordingParams) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void startPublishCDNStream(TRTCCloudDef.TRTCPublishCDNParam tRTCPublishCDNParam) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void startPublishing(String str, int i2) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void startRemoteSubStreamView(String str, TXCloudVideoView tXCloudVideoView) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void startRemoteView(String str, int i2, TXCloudVideoView tXCloudVideoView) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void startScreenCapture(int i2, TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam, TRTCCloudDef.TRTCScreenShareParams tRTCScreenShareParams) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int startSpeedTest(TRTCCloudDef.TRTCSpeedTestParams tRTCSpeedTestParams) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void startSystemAudioLoopback() {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopAllAudioEffects() {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopAllRemoteView() {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopAudioEffect(int i2) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopAudioRecording() {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopBGM() {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopLocalAudio() {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopLocalPreview() {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopLocalRecording() {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopPublishCDNStream() {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopPublishing() {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopRemoteSubStreamView(String str) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopRemoteView(String str, int i2) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopScreenCapture() {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopSpeedTest() {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopSystemAudioLoopback() {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void switchCamera() {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void switchRole(int i2) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void switchRoom(TRTCCloudDef.TRTCSwitchRoomConfig tRTCSwitchRoomConfig) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void updateLocalView(TXCloudVideoView tXCloudVideoView) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void updateRemoteView(String str, int i2, TXCloudVideoView tXCloudVideoView) {
    }

    public static TRTCCloud a(Context context) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void enableCustomVideoCapture(boolean z) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void muteLocalVideo(boolean z) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void muteRemoteVideoStream(String str, boolean z) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void startLocalAudio() {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void startRemoteView(String str, TXCloudVideoView tXCloudVideoView) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void startSpeedTest(int i2, String str, String str2) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopRemoteView(String str) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void switchRole(int i2, String str) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void startScreenCapture(TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam, TRTCCloudDef.TRTCScreenShareParams tRTCScreenShareParams) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void sendCustomVideoData(TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
    }

    private TRTCCloudImpl(Context context, long j2) {
    }

    public static void a() {
    }

    public static void b(boolean z) {
    }

    private String b() {
    }

    private String b(String str) {
    }

    private void a(Context context, long j2) {
    }

    public static void a(int i2) {
    }

    public static void a(boolean z) {
    }

    public static void a(String str) {
    }

    private static int b(int i2) {
    }
}
