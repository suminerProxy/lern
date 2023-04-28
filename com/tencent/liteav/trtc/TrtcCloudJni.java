package com.tencent.liteav.trtc;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.annotation.NonNull;
import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.videobase.DisplayTarget;
import com.tencent.rtmp.ui.TXCloudVideoView;
import com.tencent.trtc.TRTCCloudDef;
import com.tencent.trtc.TRTCCloudListener;
import com.tencent.trtc.TRTCStatistics;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

@JNINamespace("liteav::trtc")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TrtcCloudJni {
    private static final Object INIT_LOCK = null;
    private static final String TAG = "TrtcCloudJni";
    private static boolean mHasInited;
    private TRTCCloudListener.TRTCAudioFrameListener mAudioFrameListener;
    private TRTCCloudListener.TRTCVideoFrameListener mCalledGLCreatedFrameListener;
    private View mFloatingWindow;
    private final ReentrantReadWriteLock.ReadLock mJniReadLock;
    private final ReentrantReadWriteLock.WriteLock mJniWriteLock;
    private TRTCCloudListener mListener;
    private Handler mListenerHandler;
    private String mLocalUserId;
    private final a<TRTCCloudListener.TRTCVideoRenderListener> mLocalVideoRenderListenerWrapper;
    private long mNativeTrtcCloudJni;
    private final ReentrantReadWriteLock mReadWriteLock;
    private final Map<String, a<TRTCCloudListener.TRTCVideoRenderListener>> mRemoteVideoRenderListenerMap;
    private TRTCCloudListener.TRTCSnapshotListener mSnapshotListener;
    private final a<TRTCCloudListener.TRTCVideoFrameListener> mVideoFrameListenerWrapper;

    /* renamed from: com.tencent.liteav.trtc.TrtcCloudJni$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TRTCCloudDef.TRTCScreenShareParams f11652a;
        public final /* synthetic */ TrtcCloudJni b;

        public AnonymousClass1(TrtcCloudJni trtcCloudJni, TRTCCloudDef.TRTCScreenShareParams tRTCScreenShareParams) {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    /* renamed from: com.tencent.liteav.trtc.TrtcCloudJni$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TrtcCloudJni f11653a;

        public AnonymousClass2(TrtcCloudJni trtcCloudJni) {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class AudioFrame {

        /* renamed from: a  reason: collision with root package name */
        private TRTCCloudDef.TRTCAudioFrame f11654a;

        public AudioFrame(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
        }

        @CalledByNative("AudioFrame")
        public int getChannel() {
        }

        @CalledByNative("AudioFrame")
        public byte[] getData() {
        }

        @CalledByNative("AudioFrame")
        public int getSampleRate() {
        }

        @CalledByNative("AudioFrame")
        public long getTimestamp() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class AudioParallelParams {

        /* renamed from: a  reason: collision with root package name */
        private TRTCCloudDef.TRTCAudioParallelParams f11655a;

        public AudioParallelParams(TRTCCloudDef.TRTCAudioParallelParams tRTCAudioParallelParams) {
        }

        @CalledByNative("AudioParallelParams")
        public String[] getIncludeUsers() {
        }

        @CalledByNative("AudioParallelParams")
        public int getMaxCount() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class AudioRecordingParams {

        /* renamed from: a  reason: collision with root package name */
        private final TRTCCloudDef.TRTCAudioRecordingParams f11656a;

        public AudioRecordingParams(TRTCCloudDef.TRTCAudioRecordingParams tRTCAudioRecordingParams) {
        }

        @CalledByNative("AudioRecordingParams")
        public int getContent() {
        }

        @CalledByNative("AudioRecordingParams")
        public String getFilePath() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class EnterRoomParams {

        /* renamed from: a  reason: collision with root package name */
        private TRTCCloudDef.TRTCParams f11657a;

        public EnterRoomParams(TRTCCloudDef.TRTCParams tRTCParams) {
        }

        @CalledByNative("EnterRoomParams")
        public String getBusinessInfo() {
        }

        @CalledByNative("EnterRoomParams")
        public String getPrivateMapKey() {
        }

        @CalledByNative("EnterRoomParams")
        public String getRecordId() {
        }

        @CalledByNative("EnterRoomParams")
        public int getRole() {
        }

        @CalledByNative("EnterRoomParams")
        public int getRoomId() {
        }

        @CalledByNative("EnterRoomParams")
        public int getSdkAppId() {
        }

        @CalledByNative("EnterRoomParams")
        public String getStrRoomId() {
        }

        @CalledByNative("EnterRoomParams")
        public String getStreamId() {
        }

        @CalledByNative("EnterRoomParams")
        public String getUserId() {
        }

        @CalledByNative("EnterRoomParams")
        public String getUserSig() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class LocalRecordingParams {

        /* renamed from: a  reason: collision with root package name */
        private final TRTCCloudDef.TRTCLocalRecordingParams f11658a;

        public LocalRecordingParams(TRTCCloudDef.TRTCLocalRecordingParams tRTCLocalRecordingParams) {
        }

        @CalledByNative("LocalRecordingParams")
        public String getFilePath() {
        }

        @CalledByNative("LocalRecordingParams")
        public int getInterval() {
        }

        @CalledByNative("LocalRecordingParams")
        public int getRecordType() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class LocalStatistics {

        /* renamed from: a  reason: collision with root package name */
        private TRTCStatistics.TRTCLocalStatistics f11659a;

        public static /* synthetic */ TRTCStatistics.TRTCLocalStatistics a(LocalStatistics localStatistics) {
        }

        @CalledByNative("LocalStatistics")
        public static void addLocalStatistics(LocalStatistics localStatistics, ArrayList<LocalStatistics> arrayList) {
        }

        @CalledByNative("LocalStatistics")
        public static LocalStatistics createLocalStatistics(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        }

        @CalledByNative("LocalStatistics")
        public static ArrayList<LocalStatistics> createLocalStatisticsArray() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class MixUser {

        /* renamed from: a  reason: collision with root package name */
        private TRTCCloudDef.TRTCMixUser f11660a;

        public /* synthetic */ MixUser(TRTCCloudDef.TRTCMixUser tRTCMixUser, byte b) {
        }

        @CalledByNative("MixUser")
        public int getHeight() {
        }

        @CalledByNative("MixUser")
        public String getImage() {
        }

        @CalledByNative("MixUser")
        public int getInputType() {
        }

        @CalledByNative("MixUser")
        public boolean getPureAudio() {
        }

        @CalledByNative("MixUser")
        public int getRenderMode() {
        }

        @CalledByNative("MixUser")
        public String getRoomId() {
        }

        @CalledByNative("MixUser")
        public int getStreamType() {
        }

        @CalledByNative("MixUser")
        public String getUserId() {
        }

        @CalledByNative("MixUser")
        public int getWidth() {
        }

        @CalledByNative("MixUser")
        public int getX() {
        }

        @CalledByNative("MixUser")
        public int getY() {
        }

        @CalledByNative("MixUser")
        public int getZOrder() {
        }

        private MixUser(TRTCCloudDef.TRTCMixUser tRTCMixUser) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class PublishCDNParams {

        /* renamed from: a  reason: collision with root package name */
        private TRTCCloudDef.TRTCPublishCDNParam f11661a;

        public PublishCDNParams(TRTCCloudDef.TRTCPublishCDNParam tRTCPublishCDNParam) {
        }

        @CalledByNative("PublishCDNParams")
        public int getAppId() {
        }

        @CalledByNative("PublishCDNParams")
        public int getBizId() {
        }

        @CalledByNative("PublishCDNParams")
        public String getUrl() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class RemoteStatistics {

        /* renamed from: a  reason: collision with root package name */
        public TRTCStatistics.TRTCRemoteStatistics f11662a;

        @CalledByNative("RemoteStatistics")
        public static void addRemoteStatistics(RemoteStatistics remoteStatistics, ArrayList<RemoteStatistics> arrayList) {
        }

        @CalledByNative("RemoteStatistics")
        public static RemoteStatistics createRemoteStatistics(String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        }

        @CalledByNative("RemoteStatistics")
        public static ArrayList<RemoteStatistics> createRemoteStatisticsArray() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class ScreenShareParams {

        /* renamed from: a  reason: collision with root package name */
        private final TRTCCloudDef.TRTCScreenShareParams f11663a;

        public ScreenShareParams(TRTCCloudDef.TRTCScreenShareParams tRTCScreenShareParams) {
        }

        @CalledByNative("ScreenShareParams")
        public Object getMediaProjection() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class SpeedTestParams {

        /* renamed from: a  reason: collision with root package name */
        private final TRTCCloudDef.TRTCSpeedTestParams f11664a;

        public SpeedTestParams(TRTCCloudDef.TRTCSpeedTestParams tRTCSpeedTestParams) {
        }

        @CalledByNative("SpeedTestParams")
        public int getExpectedDownBandwidth() {
        }

        @CalledByNative("SpeedTestParams")
        public int getExpectedUpBandwidth() {
        }

        @CalledByNative("SpeedTestParams")
        public int getSDKAppId() {
        }

        @CalledByNative("SpeedTestParams")
        public String getUserId() {
        }

        @CalledByNative("SpeedTestParams")
        public String getUserSig() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class SpeedTestResult {

        /* renamed from: a  reason: collision with root package name */
        private TRTCCloudDef.TRTCSpeedTestResult f11665a;

        public static /* synthetic */ TRTCCloudDef.TRTCSpeedTestResult a(SpeedTestResult speedTestResult) {
        }

        @CalledByNative("SpeedTestResult")
        public static SpeedTestResult createSpeedTestResult(boolean z, String str, String str2, int i2, float f2, float f3, int i3, int i4, int i5) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class Statistics {

        /* renamed from: a  reason: collision with root package name */
        private TRTCStatistics f11666a;

        public static /* synthetic */ TRTCStatistics a(Statistics statistics) {
        }

        @CalledByNative("Statistics")
        public static Statistics createStatistics(int i2, int i3, int i4, int i5, int i6, int i7, long j2, long j3, ArrayList<LocalStatistics> arrayList, ArrayList<RemoteStatistics> arrayList2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class SwitchRoomConfig {

        /* renamed from: a  reason: collision with root package name */
        private TRTCCloudDef.TRTCSwitchRoomConfig f11667a;

        public SwitchRoomConfig(TRTCCloudDef.TRTCSwitchRoomConfig tRTCSwitchRoomConfig) {
        }

        @CalledByNative("SwitchRoomConfig")
        public String getPrivateMapKey() {
        }

        @CalledByNative("SwitchRoomConfig")
        public int getRoomId() {
        }

        @CalledByNative("SwitchRoomConfig")
        public String getStringRoomId() {
        }

        @CalledByNative("SwitchRoomConfig")
        public String getUserSig() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class TranscodingConfig {

        /* renamed from: a  reason: collision with root package name */
        private TRTCCloudDef.TRTCTranscodingConfig f11668a;

        public TranscodingConfig(TRTCCloudDef.TRTCTranscodingConfig tRTCTranscodingConfig) {
        }

        @CalledByNative("TranscodingConfig")
        public int getAppId() {
        }

        @CalledByNative("TranscodingConfig")
        public int getAudioBitrate() {
        }

        @CalledByNative("TranscodingConfig")
        public int getAudioChannels() {
        }

        @CalledByNative("TranscodingConfig")
        public int getAudioSampleRate() {
        }

        @CalledByNative("TranscodingConfig")
        public int getBackgroundColor() {
        }

        @CalledByNative("TranscodingConfig")
        public String getBackgroundImage() {
        }

        @CalledByNative("TranscodingConfig")
        public int getBizId() {
        }

        @CalledByNative("TranscodingConfig")
        public MixUser[] getMixUsers() {
        }

        @CalledByNative("TranscodingConfig")
        public int getMode() {
        }

        @CalledByNative("TranscodingConfig")
        public String getStreamId() {
        }

        @CalledByNative("TranscodingConfig")
        public int getVideoBitrate() {
        }

        @CalledByNative("TranscodingConfig")
        public int getVideoFramerate() {
        }

        @CalledByNative("TranscodingConfig")
        public int getVideoGOP() {
        }

        @CalledByNative("TranscodingConfig")
        public int getVideoHeight() {
        }

        @CalledByNative("TranscodingConfig")
        public int getVideoWidth() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class VideoEncParams {

        /* renamed from: a  reason: collision with root package name */
        private TRTCCloudDef.TRTCVideoEncParam f11669a;

        public VideoEncParams(TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam) {
        }

        @CalledByNative("VideoEncParams")
        public int getMinVideoBitrate() {
        }

        @CalledByNative("VideoEncParams")
        public int getVideoBitrate() {
        }

        @CalledByNative("VideoEncParams")
        public int getVideoFps() {
        }

        @CalledByNative("VideoEncParams")
        public int getVideoResolution() {
        }

        @CalledByNative("VideoEncParams")
        public int getVideoResolutionMode() {
        }

        @CalledByNative("VideoEncParams")
        public boolean isEnableAdjustRes() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class a<T> {

        /* renamed from: a  reason: collision with root package name */
        public int f11670a;
        public GLConstants.PixelFormatType b;
        public GLConstants.PixelBufferType c;

        /* renamed from: d  reason: collision with root package name */
        public T f11671d;

        private a() {
        }

        public /* synthetic */ a(byte b) {
        }
    }

    public TrtcCloudJni() {
    }

    public static /* synthetic */ void access$300(TrtcCloudJni trtcCloudJni, View view) {
    }

    public static /* synthetic */ void access$400(TrtcCloudJni trtcCloudJni) {
    }

    private static int convertPixelBufferTypeToTRTCBufferType(GLConstants.PixelBufferType pixelBufferType) {
    }

    private static int convertPixelFormatTypeToTRTCFormatType(GLConstants.PixelFormatType pixelFormatType) {
    }

    private static GLConstants.PixelBufferType convertTRTCBufferTypeToPixelBufferType(int i2) {
    }

    private static GLConstants.PixelFormatType convertTRTCFormatTypeToPixelFormatType(int i2) {
    }

    @CalledByNative
    public static Bundle createExtraInfoBundle(String str, int i2) {
    }

    private void hideFloatingWindow() {
    }

    public static void init(int i2) {
    }

    private static boolean isCustomPreprocessSupportedBufferType(GLConstants.PixelBufferType pixelBufferType) {
    }

    private static boolean isCustomPreprocessSupportedFormatType(GLConstants.PixelFormatType pixelFormatType) {
    }

    private static boolean isCustomRenderSupportedBufferType(GLConstants.PixelBufferType pixelBufferType) {
    }

    private static boolean isCustomRenderSupportedFormatType(GLConstants.PixelFormatType pixelFormatType) {
    }

    public static /* synthetic */ void lambda$enterRoom$0(TrtcCloudJni trtcCloudJni) {
    }

    public static /* synthetic */ void lambda$onSnapshotComplete$1(TrtcCloudJni trtcCloudJni, Bitmap bitmap) {
    }

    private static native void nativeCallExperimentalAPI(long j2, String str);

    private static native void nativeConnectOtherRoom(long j2, String str);

    private static native long nativeCreateAudioEffectManager(long j2);

    private static native long nativeCreateBeautyManager(long j2);

    private static native long nativeCreateDeviceManager(long j2);

    private static native long nativeCreatePipeline(TrtcCloudJni trtcCloudJni);

    private static native long nativeCreateSubCloud(TrtcCloudJni trtcCloudJni, long j2);

    private static native void nativeDestroyPipeline(long j2);

    private static native void nativeDisconnectOtherRoom(long j2);

    private static native void nativeEnableAudioFrameNotification(long j2, boolean z);

    private static native void nativeEnableAudioVolumeEvaluation(long j2, int i2);

    private static native void nativeEnableCustomAudioCapture(long j2, boolean z);

    private static native void nativeEnableCustomAudioRendering(long j2, boolean z);

    private static native void nativeEnableCustomVideoCapture(long j2, int i2, boolean z);

    private static native void nativeEnableEncSmallVideoStream(long j2, boolean z, VideoEncParams videoEncParams);

    private static native void nativeEnableMixExternalAudioFrame(long j2, boolean z, boolean z2);

    private static native void nativeEnableVideoCustomPreprocess(long j2, boolean z, int i2, int i3, int i4);

    private static native void nativeEnableVideoCustomRender(long j2, boolean z, String str, int i2, int i3, int i4);

    private static native void nativeEnterRoom(long j2, EnterRoomParams enterRoomParams, int i2);

    private static native void nativeExitRoom(long j2);

    private static native int nativeGetAudioCaptureVolume(long j2);

    private static native int nativeGetAudioPlayoutVolume(long j2);

    private static native void nativeGetCustomAudioRenderingFrame(long j2, byte[] bArr, int i2, int i3);

    private static native void nativeGlobalInit(int i2);

    private static native void nativeGlobalUninit();

    private static native int nativeMixExternalAudioFrame(long j2, AudioFrame audioFrame);

    private static native void nativeMuteAllRemoteAudio(long j2, boolean z);

    private static native void nativeMuteAllRemoteVideoStreams(long j2, boolean z);

    private static native void nativeMuteLocalAudio(long j2, boolean z);

    private static native void nativeMuteLocalVideo(long j2, int i2, boolean z);

    private static native void nativeMuteRemoteAudio(long j2, String str, boolean z);

    private static native void nativeMuteRemoteVideoStream(long j2, String str, int i2, boolean z);

    private static native void nativePauseScreenCapture(long j2, int i2);

    private static native void nativeResumeScreenCapture(long j2, int i2);

    private static native void nativeSendCustomAudioData(long j2, AudioFrame audioFrame);

    private static native boolean nativeSendCustomCmdMsg(long j2, int i2, byte[] bArr, boolean z, boolean z2);

    private static native void nativeSendCustomVideoData(long j2, int i2, PixelFrame pixelFrame);

    private static native boolean nativeSendSEIMsg(long j2, byte[] bArr, int i2);

    private static native void nativeSetAudioCaptureVolume(long j2, int i2);

    private static native void nativeSetAudioPlayoutVolume(long j2, int i2);

    private static native void nativeSetAudioQuality(long j2, int i2);

    private static native int nativeSetCapturedRawAudioFrameCallbackFormat(long j2, int i2, int i3, int i4);

    private static native void nativeSetConsoleEnabled(boolean z);

    private static native void nativeSetDefaultStreamRecvMode(long j2, boolean z, boolean z2);

    private static native void nativeSetGSensorMode(long j2, int i2, int i3);

    private static native void nativeSetListenerHandler(long j2, Handler handler);

    private static native int nativeSetLocalProcessedAudioFrameCallbackFormat(long j2, int i2, int i3, int i4);

    private static native void nativeSetLocalViewFillMode(long j2, int i2);

    private static native void nativeSetLocalViewMirror(long j2, int i2);

    private static native void nativeSetLocalViewRotation(long j2, int i2);

    private static native void nativeSetLogCompressEnabled(boolean z);

    private static native void nativeSetLogLevel(int i2);

    private static native void nativeSetLogPath(String str);

    private static native void nativeSetMixExternalAudioVolume(long j2, int i2, int i3);

    private static native void nativeSetMixTranscodingConfig(long j2, TranscodingConfig transcodingConfig);

    private static native int nativeSetMixedPlayAudioFrameCallbackFormat(long j2, int i2, int i3, int i4);

    private static native void nativeSetNetworkQosParam(long j2, int i2, int i3);

    private static native void nativeSetPriorRemoteVideoStreamType(long j2, int i2);

    private static native void nativeSetRemoteAudioParallelParams(long j2, AudioParallelParams audioParallelParams);

    private static native void nativeSetRemoteAudioVolume(long j2, String str, int i2);

    private static native void nativeSetRemoteVideoStreamType(long j2, String str, int i2);

    private static native void nativeSetRemoteViewFillMode(long j2, String str, int i2, int i3);

    private static native void nativeSetRemoteViewMirror(long j2, String str, int i2, int i3);

    private static native void nativeSetRemoteViewRotation(long j2, String str, int i2, int i3);

    private static native void nativeSetVideoEncoderMirror(long j2, boolean z);

    private static native void nativeSetVideoEncoderParams(long j2, int i2, VideoEncParams videoEncParams);

    private static native void nativeSetVideoEncoderRotation(long j2, int i2);

    private static native void nativeSetVideoMuteImage(long j2, int i2, Bitmap bitmap, int i3);

    private static native void nativeSetWatermark(long j2, Bitmap bitmap, int i2, float f2, float f3, float f4);

    private static native void nativeShowDashboardManager(long j2, int i2);

    private static native void nativeSnapshotVideo(long j2, String str, int i2);

    private static native int nativeStartAudioRecording(long j2, AudioRecordingParams audioRecordingParams);

    private static native void nativeStartLocalAudio(long j2);

    private static native void nativeStartLocalAudioWithQuality(long j2, int i2);

    private static native void nativeStartLocalPreview(long j2, boolean z, DisplayTarget displayTarget);

    private static native void nativeStartLocalRecording(long j2, LocalRecordingParams localRecordingParams);

    private static native void nativeStartPublishCDNStream(long j2, PublishCDNParams publishCDNParams);

    private static native void nativeStartPublishing(long j2, String str, int i2);

    private static native void nativeStartRemoteView(long j2, String str, int i2, DisplayTarget displayTarget);

    private static native void nativeStartRemoteViewWithoutStreamType(long j2, String str, DisplayTarget displayTarget);

    private static native void nativeStartScreenCapture(long j2, int i2, VideoEncParams videoEncParams, ScreenShareParams screenShareParams);

    private static native void nativeStartSpeedTest(long j2, boolean z, SpeedTestParams speedTestParams);

    private static native void nativeStartSystemAudioLoopback(long j2);

    private static native void nativeStopAllRemoteView(long j2);

    private static native void nativeStopAudioRecording(long j2);

    private static native void nativeStopLocalAudio(long j2);

    private static native void nativeStopLocalPreview(long j2);

    private static native void nativeStopLocalRecording(long j2);

    private static native void nativeStopPublishCDNStream(long j2);

    private static native void nativeStopPublishing(long j2);

    private static native void nativeStopRemoteView(long j2, String str, int i2);

    private static native void nativeStopRemoteViewWithoutStreamType(long j2, String str);

    private static native void nativeStopScreenCapture(long j2, int i2);

    private static native void nativeStopSpeedTest(long j2);

    private static native void nativeStopSystemAudioLoopback(long j2);

    private static native void nativeSwitchRole(long j2, int i2);

    private static native void nativeSwitchRoleWithPrivateMapKey(long j2, int i2, String str);

    private static native void nativeSwitchRoom(long j2, SwitchRoomConfig switchRoomConfig);

    private static native void nativeUpdateLocalView(long j2, DisplayTarget displayTarget);

    private static native void nativeUpdateRemoteView(long j2, String str, int i2, DisplayTarget displayTarget);

    private void runOnListenerThread(Runnable runnable) {
    }

    public static void setConsoleEnabled(boolean z) {
    }

    public static void setLogCompressEnabled(boolean z) {
    }

    public static void setLogDirPath(String str) {
    }

    public static void setLogLevel(int i2) {
    }

    private static void shadowCopy(@NonNull PixelFrame pixelFrame, @NonNull TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
    }

    private void showFloatingWindow(View view) {
    }

    public static void uninit() {
    }

    public void callExperimentalAPI(String str) {
    }

    public void connectOtherRoom(String str) {
    }

    public long createAudioEffectManager() {
    }

    public long createBeautyManager() {
    }

    public long createDeviceManager() {
    }

    public void destroy() {
    }

    public void disconnectOtherRoom() {
    }

    public void enableAudioVolumeEvaluation(int i2) {
    }

    public void enableCustomAudioCapture(boolean z) {
    }

    public void enableCustomAudioRendering(boolean z) {
    }

    public void enableCustomVideoCapture(int i2, boolean z) {
    }

    public int enableEncSmallVideoStream(boolean z, TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam) {
    }

    public void enableMixExternalAudioFrame(boolean z, boolean z2) {
    }

    public void enterRoom(TRTCCloudDef.TRTCParams tRTCParams, int i2) {
    }

    public void exitRoom() {
    }

    public int getAudioCaptureVolume() {
    }

    public int getAudioPlayoutVolume() {
    }

    public void getCustomAudioRenderingFrame(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
    }

    public long getTrtcCloudJni() {
    }

    public int mixExternalAudioFrame(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
    }

    public void muteAllRemoteAudio(boolean z) {
    }

    public void muteAllRemoteVideoStreams(boolean z) {
    }

    public void muteLocalAudio(boolean z) {
    }

    public void muteLocalVideo(int i2, boolean z) {
    }

    public void muteRemoteAudio(String str, boolean z) {
    }

    public void muteRemoteVideoStream(String str, int i2, boolean z) {
    }

    @CalledByNative
    public void onAudioCaptureProcessedData(byte[] bArr, long j2, int i2, int i3) {
    }

    @CalledByNative
    public void onAudioMixedAllData(byte[] bArr, int i2, int i3) {
    }

    @CalledByNative
    public void onAudioPlayoutData(byte[] bArr, long j2, int i2, int i3) {
    }

    @CalledByNative
    public void onAudioRemoteStreamData(String str, byte[] bArr, long j2, int i2, int i3, byte[] bArr2) {
    }

    @CalledByNative
    public void onAudioRouteChanged(int i2, int i3) {
    }

    @CalledByNative
    public void onCameraDidReady() {
    }

    @CalledByNative
    public void onConnectOtherRoom(String str, int i2, String str2) {
    }

    @CalledByNative
    public void onConnectionLost() {
    }

    @CalledByNative
    public void onConnectionRecovery() {
    }

    @CalledByNative
    public void onDisConnectOtherRoom(int i2, String str) {
    }

    @CalledByNative
    public void onEnterRoom(int i2) {
    }

    @CalledByNative
    public void onError(int i2, String str) {
    }

    @CalledByNative
    public void onExitRoom(int i2) {
    }

    @CalledByNative
    public void onFirstAudioFrame(String str) {
    }

    @CalledByNative
    public void onFirstVideoFrame(String str, int i2, int i3, int i4) {
    }

    @CalledByNative
    public void onGLContextCreated() {
    }

    @CalledByNative
    public void onGLContextDestroy() {
    }

    @CalledByNative
    public byte[] onLocalAudioStreamData(byte[] bArr, long j2, int i2, int i3) {
    }

    @CalledByNative
    public void onLocalRecordBegin(int i2, String str) {
    }

    @CalledByNative
    public void onLocalRecordComplete(int i2, String str) {
    }

    @CalledByNative
    public void onLocalRecording(long j2, String str) {
    }

    @CalledByNative
    public void onMicDidReady() {
    }

    @CalledByNative
    public void onMissCustomCmdMsg(String str, int i2, int i3, int i4) {
    }

    @CalledByNative
    public void onNetworkQuality(int i2, String[] strArr, int[] iArr) {
    }

    @CalledByNative
    public void onPreprocessVideoFrame(int i2, PixelFrame pixelFrame, PixelFrame pixelFrame2) {
    }

    @CalledByNative
    public void onRecvCustomCmdMsg(String str, int i2, int i3, byte[] bArr) {
    }

    @CalledByNative
    public void onRemoteVideoStatusUpdated(String str, int i2, int i3) {
    }

    @CalledByNative
    public void onRenderVideoFrame(String str, int i2, PixelFrame pixelFrame) {
    }

    @CalledByNative
    public void onSEIMessageReceived(byte[] bArr, String str) {
    }

    @CalledByNative
    public void onScreenCapturePaused() {
    }

    @CalledByNative
    public void onScreenCaptureResumed() {
    }

    @CalledByNative
    public void onScreenCaptureStarted() {
    }

    @CalledByNative
    public void onScreenCaptureStopped(int i2) {
    }

    @CalledByNative
    public void onSendFirstLocalAudioFrame() {
    }

    @CalledByNative
    public void onSendFirstLocalVideoFrame(int i2) {
    }

    @CalledByNative
    public void onSetMixTranscodingConfig(int i2, String str) {
    }

    @CalledByNative
    public void onSnapshotComplete(Bitmap bitmap) {
    }

    @CalledByNative
    public void onSpeedTest(SpeedTestResult speedTestResult, int i2, int i3) {
    }

    @CalledByNative
    public void onSpeedTestResult(SpeedTestResult speedTestResult) {
    }

    @CalledByNative
    public void onStartPublishCDNStream(int i2, String str) {
    }

    @CalledByNative
    public void onStartPublishing(int i2, String str) {
    }

    @CalledByNative
    public void onStatistics(Statistics statistics) {
    }

    @CalledByNative
    public void onStopPublishCDNStream(int i2, String str) {
    }

    @CalledByNative
    public void onStopPublishing(int i2, String str) {
    }

    @CalledByNative
    public void onSwitchRole(int i2, String str) {
    }

    @CalledByNative
    public void onSwitchRoom(int i2, String str) {
    }

    @CalledByNative
    public void onTryToReconnect() {
    }

    @CalledByNative
    public void onUserAudioAvailable(String str, boolean z) {
    }

    @CalledByNative
    public void onUserEnter(String str) {
    }

    @CalledByNative
    public void onUserExit(String str) {
    }

    @CalledByNative
    public void onUserOffline(String str, int i2) {
    }

    @CalledByNative
    public void onUserOnline(String str) {
    }

    @CalledByNative
    public void onUserSubStreamAvailable(String str, boolean z) {
    }

    @CalledByNative
    public void onUserVideoAvailable(String str, boolean z) {
    }

    @CalledByNative
    public void onUserVideoSizeChanged(String str, int i2, int i3, int i4) {
    }

    @CalledByNative
    public void onUserVoiceVolume(String[] strArr, int[] iArr, int i2) {
    }

    @CalledByNative
    public void onWarning(int i2, String str, Bundle bundle) {
    }

    public void pauseScreenCapture(int i2) {
    }

    public void resumeScreenCapture(int i2) {
    }

    public void sendCustomAudioData(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
    }

    public boolean sendCustomCmdMsg(int i2, byte[] bArr, boolean z, boolean z2) {
    }

    public void sendCustomVideoData(int i2, TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
    }

    public boolean sendSEIMsg(byte[] bArr, int i2) {
    }

    public void setAudioCaptureVolume(int i2) {
    }

    public void setAudioFrameListener(TRTCCloudListener.TRTCAudioFrameListener tRTCAudioFrameListener) {
    }

    public void setAudioPlayoutVolume(int i2) {
    }

    public void setAudioQuality(int i2) {
    }

    public int setCapturedRawAudioFrameCallbackFormat(int i2, int i3, int i4) {
    }

    public void setDefaultStreamRecvMode(boolean z, boolean z2) {
    }

    public void setGSensorMode(int i2, int i3) {
    }

    public void setListener(TRTCCloudListener tRTCCloudListener) {
    }

    public void setListenerHandler(Handler handler) {
    }

    public int setLocalProcessedAudioFrameCallbackFormat(int i2, int i3, int i4) {
    }

    public int setLocalVideoProcessListener(int i2, int i3, int i4, TRTCCloudListener.TRTCVideoFrameListener tRTCVideoFrameListener) {
    }

    public int setLocalVideoRenderListener(int i2, int i3, TRTCCloudListener.TRTCVideoRenderListener tRTCVideoRenderListener) {
    }

    public void setLocalViewFillMode(int i2) {
    }

    public void setLocalViewMirror(int i2) {
    }

    public void setLocalViewRotation(int i2) {
    }

    public void setMixExternalAudioVolume(int i2, int i3) {
    }

    public void setMixTranscodingConfig(TRTCCloudDef.TRTCTranscodingConfig tRTCTranscodingConfig) {
    }

    public int setMixedPlayAudioFrameCallbackFormat(int i2, int i3, int i4) {
    }

    public void setNetworkQosParam(TRTCCloudDef.TRTCNetworkQosParam tRTCNetworkQosParam) {
    }

    public int setPriorRemoteVideoStreamType(int i2) {
    }

    public void setRemoteAudioParallelParams(TRTCCloudDef.TRTCAudioParallelParams tRTCAudioParallelParams) {
    }

    public void setRemoteAudioVolume(String str, int i2) {
    }

    public int setRemoteVideoRenderListener(String str, int i2, int i3, TRTCCloudListener.TRTCVideoRenderListener tRTCVideoRenderListener) {
    }

    public int setRemoteVideoStreamType(String str, int i2) {
    }

    public void setRemoteViewFillMode(String str, int i2, int i3) {
    }

    public void setRemoteViewMirror(String str, int i2, int i3) {
    }

    public void setRemoteViewRotation(String str, int i2, int i3) {
    }

    public void setVideoEncoderMirror(boolean z) {
    }

    public void setVideoEncoderParams(int i2, TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam) {
    }

    public void setVideoEncoderRotation(int i2) {
    }

    public void setVideoMuteImage(int i2, Bitmap bitmap, int i3) {
    }

    public void setWatermark(Bitmap bitmap, int i2, float f2, float f3, float f4) {
    }

    public void showDashboardManager(int i2) {
    }

    public void snapshotVideo(String str, int i2, TRTCCloudListener.TRTCSnapshotListener tRTCSnapshotListener) {
    }

    public int startAudioRecording(TRTCCloudDef.TRTCAudioRecordingParams tRTCAudioRecordingParams) {
    }

    public void startLocalAudio(int i2) {
    }

    public void startLocalPreview(boolean z, TXCloudVideoView tXCloudVideoView) {
    }

    public void startLocalRecording(TRTCCloudDef.TRTCLocalRecordingParams tRTCLocalRecordingParams) {
    }

    public void startPublishCDNStream(TRTCCloudDef.TRTCPublishCDNParam tRTCPublishCDNParam) {
    }

    public void startPublishing(String str, int i2) {
    }

    public void startRemoteView(String str, int i2, TXCloudVideoView tXCloudVideoView) {
    }

    public void startScreenCapture(int i2, TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam, TRTCCloudDef.TRTCScreenShareParams tRTCScreenShareParams) {
    }

    public void startSpeedTest(boolean z, TRTCCloudDef.TRTCSpeedTestParams tRTCSpeedTestParams) {
    }

    public void startSystemAudioLoopback() {
    }

    public void stopAllRemoteView() {
    }

    public void stopAudioRecording() {
    }

    public void stopLocalAudio() {
    }

    public void stopLocalPreview() {
    }

    public void stopLocalRecording() {
    }

    public void stopPublishCDNStream() {
    }

    public void stopPublishing() {
    }

    public void stopRemoteView(String str, int i2) {
    }

    public void stopScreenCapture(int i2) {
    }

    public void stopSpeedTest() {
    }

    public void stopSystemAudioLoopback() {
    }

    public void switchRole(int i2) {
    }

    public void switchRoom(TRTCCloudDef.TRTCSwitchRoomConfig tRTCSwitchRoomConfig) {
    }

    public void updateLocalView(TXCloudVideoView tXCloudVideoView) {
    }

    public void updateRemoteView(String str, int i2, TXCloudVideoView tXCloudVideoView) {
    }

    public TrtcCloudJni(long j2) {
    }

    public void startLocalAudio() {
    }

    public void startRemoteView(String str, TXCloudVideoView tXCloudVideoView) {
    }

    public void stopRemoteView(String str) {
    }

    public void switchRole(int i2, String str) {
    }

    private static void shadowCopy(@NonNull TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame, @NonNull PixelFrame pixelFrame) {
    }
}
