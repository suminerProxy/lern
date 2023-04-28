package com.tencent.liteav.videoproducer.capture;

import android.content.Context;
import android.graphics.SurfaceTexture;
import androidx.annotation.NonNull;
import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.utils.Rotation;
import com.tencent.liteav.videoproducer.capture.CaptureSourceInterface;
import com.tencent.liteav.videoproducer.capture.af;
import com.tencent.liteav.videoproducer.producer.ServerVideoProducerConfig;
import java.util.concurrent.atomic.AtomicBoolean;

@JNINamespace("liteav::video")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class CameraCaptureSingleton implements SurfaceTexture.OnFrameAvailableListener, CaptureSourceInterface, ae {
    private static final int DELAY_FOR_RESTART_CAMERA = 2000;
    private static final int DELAY_FOR_SWITCH_TO_CAMERA1 = 1000;
    private static final int HOLD_POOL_MAX_SIZE = 1;
    private static final String TAG = "CameraCaptureSingleton";
    private static final boolean USE_DEFAULT_FRONT_CAMERA = true;
    private static volatile CameraCaptureSingleton sInstance;
    private ad mCameraController;
    private volatile Rotation mCameraRotation;
    private final af mCameraSupervisor;
    public CameraCaptureParams mCurrentCaptureParams;
    public com.tencent.liteav.videobase.b.e mEGLCore;
    private boolean mEnableTapToFocus;
    private boolean mEnableZoom;
    private final AtomicBoolean mExpectFrontCamera;
    private float mExposureCompensation;
    public com.tencent.liteav.videobase.frame.e mGLTexturePool;
    private boolean mIsCameraAutoFocusFaceModeSupported;
    private boolean mIsCameraInRestarting;
    private boolean mIsCameraInSwitching;
    private boolean mIsFirstFrameCaptured;
    private boolean mIsFocusPositionInPreviewSupported;
    private boolean mIsTorchSupported;
    private boolean mIsZoomSupported;
    private final aq mListenerManager;
    private final float[] mMatrix;
    private int mMaxZoomLevel;
    private int mOESTextureId;
    public int mPausedCount;
    private PixelFrame mPixelFrame;
    private final Runnable mRestartCameraRunnable;
    private final com.tencent.liteav.base.util.l mSequenceTaskRunner;
    private ServerVideoProducerConfig mServerConfig;
    private Object mSharedContext;
    private SurfaceTexture mSurfaceTexture;
    private final Runnable mSwitchToCamera1Runnable;
    private com.tencent.liteav.videobase.frame.l mTextureHolderPool;
    private float mZoomPercent;

    /* renamed from: com.tencent.liteav.videoproducer.capture.CameraCaptureSingleton$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CameraCaptureSingleton f12338a;

        public AnonymousClass1(CameraCaptureSingleton cameraCaptureSingleton) {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    /* renamed from: com.tencent.liteav.videoproducer.capture.CameraCaptureSingleton$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CameraCaptureSingleton f12339a;

        public AnonymousClass2(CameraCaptureSingleton cameraCaptureSingleton) {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    /* renamed from: com.tencent.liteav.videoproducer.capture.CameraCaptureSingleton$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f12340a = null;
    }

    private CameraCaptureSingleton(Context context) {
    }

    public static /* synthetic */ boolean access$002(CameraCaptureSingleton cameraCaptureSingleton, boolean z) {
    }

    public static /* synthetic */ ad access$100(CameraCaptureSingleton cameraCaptureSingleton) {
    }

    public static /* synthetic */ boolean access$200(CameraCaptureSingleton cameraCaptureSingleton, CameraCaptureParams cameraCaptureParams) {
    }

    public static /* synthetic */ Runnable access$300(CameraCaptureSingleton cameraCaptureSingleton) {
    }

    public static /* synthetic */ com.tencent.liteav.base.util.l access$400(CameraCaptureSingleton cameraCaptureSingleton) {
    }

    public static /* synthetic */ boolean access$502(CameraCaptureSingleton cameraCaptureSingleton, boolean z) {
    }

    public static /* synthetic */ Runnable access$600(CameraCaptureSingleton cameraCaptureSingleton) {
    }

    private void checkFirstFrameCaptured() {
    }

    private void closeCamera() {
    }

    private ad createCameraController(af.a aVar) {
    }

    @CalledByNative
    public static CameraCaptureSingleton getInstance() {
    }

    private void handleCameraStartFailed() {
    }

    private void handleCameraStartSuccess() {
    }

    private void initGLComponents(Object obj) {
    }

    private static PixelFrame initOutputPixelFrame(com.tencent.liteav.base.util.p pVar, Rotation rotation, Object obj, int i2) {
    }

    private boolean isNeedRestartCamera(CameraCaptureParams cameraCaptureParams) {
    }

    public static /* synthetic */ void lambda$enableCameraZoom$6(CameraCaptureSingleton cameraCaptureSingleton, boolean z) {
    }

    public static /* synthetic */ void lambda$enableTapToFocus$4(CameraCaptureSingleton cameraCaptureSingleton, boolean z) {
    }

    public static /* synthetic */ void lambda$onCameraError$10(CameraCaptureSingleton cameraCaptureSingleton, ad adVar) {
    }

    public static /* synthetic */ void lambda$onFrameAvailable$11(CameraCaptureSingleton cameraCaptureSingleton, SurfaceTexture surfaceTexture) {
    }

    public static /* synthetic */ void lambda$removeListener$0(CameraCaptureSingleton cameraCaptureSingleton, CaptureSourceInterface.a aVar) {
    }

    public static /* synthetic */ void lambda$resume$14(CameraCaptureSingleton cameraCaptureSingleton) {
    }

    public static /* synthetic */ void lambda$setExposureCompensation$9(CameraCaptureSingleton cameraCaptureSingleton, float f2) {
    }

    public static /* synthetic */ void lambda$setPercentOfMaxZoomLevel$8(CameraCaptureSingleton cameraCaptureSingleton, float f2) {
    }

    public static /* synthetic */ void lambda$setServerConfig$1(CameraCaptureSingleton cameraCaptureSingleton, ServerVideoProducerConfig serverVideoProducerConfig) {
    }

    public static /* synthetic */ void lambda$setZoomLevel$7(CameraCaptureSingleton cameraCaptureSingleton, float f2) {
    }

    public static /* synthetic */ void lambda$start$12(CameraCaptureSingleton cameraCaptureSingleton, CaptureSourceInterface.a aVar, CameraCaptureParams cameraCaptureParams) {
    }

    public static /* synthetic */ void lambda$startAutoFocusAtPosition$5(CameraCaptureSingleton cameraCaptureSingleton, int i2, int i3) {
    }

    public static /* synthetic */ void lambda$stop$13(CameraCaptureSingleton cameraCaptureSingleton) {
    }

    public static /* synthetic */ void lambda$switchCamera$2(CameraCaptureSingleton cameraCaptureSingleton) {
    }

    public static /* synthetic */ void lambda$turnOnTorch$3(CameraCaptureSingleton cameraCaptureSingleton, boolean z) {
    }

    public static /* synthetic */ void lambda$updateParams$15(CameraCaptureSingleton cameraCaptureSingleton, CameraCaptureParams cameraCaptureParams) {
    }

    private void onCaptureFrameAvailable() {
    }

    private boolean openCamera(@NonNull CameraCaptureParams cameraCaptureParams) {
    }

    private boolean openCameraInternal(@NonNull CameraCaptureParams cameraCaptureParams) {
    }

    private void setZoomInternal(float f2) {
    }

    private void updateParamsInternal(CameraCaptureParams cameraCaptureParams) {
    }

    @CalledByNative
    public void enableCameraZoom(boolean z) {
    }

    @CalledByNative
    public void enableMockCamera(boolean z) {
    }

    @CalledByNative
    public void enableTapToFocus(boolean z) {
    }

    public af.a getCameraAPIType() {
    }

    public Rotation getCameraRotation() {
    }

    @CalledByNative
    public int getMaxZoomLevel() {
    }

    @CalledByNative
    public boolean isAutoFocusEnabled() {
    }

    @CalledByNative
    public boolean isCameraAutoFocusFaceModeSupported() {
    }

    @CalledByNative
    public boolean isCameraFocusPositionInPreviewSupported() {
    }

    @CalledByNative
    public boolean isFrontCamera() {
    }

    @CalledByNative
    public boolean isTorchSupported() {
    }

    @CalledByNative
    public boolean isZoomSupported() {
    }

    public boolean makeCurrent() {
    }

    @Override // com.tencent.liteav.videoproducer.capture.ae
    public void onCameraError(ad adVar) {
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
    }

    @Override // com.tencent.liteav.videoproducer.capture.CaptureSourceInterface
    public void pause() {
    }

    public void pauseInternal() {
    }

    public void removeListener(CaptureSourceInterface.a aVar) {
    }

    @Override // com.tencent.liteav.videoproducer.capture.CaptureSourceInterface
    public void resume() {
    }

    public void resumeInternal(CameraCaptureParams cameraCaptureParams) {
    }

    public void runInGLThread(Runnable runnable) {
    }

    public void setExposureCompensation(float f2) {
    }

    public void setPercentOfMaxZoomLevel(float f2) {
    }

    public void setServerConfig(ServerVideoProducerConfig serverVideoProducerConfig) {
    }

    @CalledByNative
    public void setZoomLevel(float f2) {
    }

    @Override // com.tencent.liteav.videoproducer.capture.CaptureSourceInterface
    public void start(Object obj, CaptureSourceInterface.CaptureParams captureParams, CaptureSourceInterface.a aVar) {
    }

    @CalledByNative
    public void startAutoFocusAtPosition(int i2, int i3) {
    }

    @Override // com.tencent.liteav.videoproducer.capture.CaptureSourceInterface
    public void stop() {
    }

    @CalledByNative
    public void switchCamera(boolean z) {
    }

    @CalledByNative
    public void turnOnTorch(boolean z) {
    }

    public void uninitGLComponents() {
    }

    public void updateCamera(@NonNull CameraCaptureParams cameraCaptureParams) {
    }

    @Override // com.tencent.liteav.videoproducer.capture.CaptureSourceInterface
    public void updateParams(CaptureSourceInterface.CaptureParams captureParams) {
    }
}
