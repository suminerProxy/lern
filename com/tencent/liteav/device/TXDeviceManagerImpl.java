package com.tencent.liteav.device;

import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.device.TXDeviceManager;

@JNINamespace("liteav::manager")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TXDeviceManagerImpl implements TXDeviceManager {
    private long mNativeDeviceMgr;

    /* renamed from: com.tencent.liteav.device.TXDeviceManagerImpl$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$tencent$liteav$device$TXDeviceManager$TXAudioRoute = null;
        public static final /* synthetic */ int[] $SwitchMap$com$tencent$liteav$device$TXDeviceManager$TXCameraCaptureMode = null;
        public static final /* synthetic */ int[] $SwitchMap$com$tencent$liteav$device$TXDeviceManager$TXSystemVolumeType = null;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class CameraCaptureParam {
        private TXDeviceManager.TXCameraCaptureParam mParams;

        public CameraCaptureParam(TXDeviceManager.TXCameraCaptureParam tXCameraCaptureParam) {
        }

        @CalledByNative("CameraCaptureParam")
        public int getHeight() {
        }

        @CalledByNative("CameraCaptureParam")
        public int getMode() {
        }

        @CalledByNative("CameraCaptureParam")
        public int getWidth() {
        }
    }

    public TXDeviceManagerImpl(long j2) {
    }

    public static int audioRouteAsInt(TXDeviceManager.TXAudioRoute tXAudioRoute) {
    }

    public static TXDeviceManager.TXAudioRoute audioRouteFromInt(int i2) {
    }

    public static int cameraCaptureModeAsInt(TXDeviceManager.TXCameraCaptureMode tXCameraCaptureMode) {
    }

    public static TXDeviceManager.TXCameraCaptureMode cameraCaptureModeFromInt(int i2) {
    }

    private static native void nativeDestroy(long j2);

    private static native int nativeEnableCameraAutoFocus(long j2, boolean z);

    private static native boolean nativeEnableCameraTorch(long j2, boolean z);

    private static native float nativeGetCameraZoomMaxRatio(long j2);

    private static native boolean nativeIsAutoFocusEnabled(long j2);

    private static native boolean nativeIsCameraAutoFocusFaceModeSupported(long j2);

    private static native boolean nativeIsCameraFocusPositionInPreviewSupported(long j2);

    private static native boolean nativeIsCameraTorchSupported(long j2);

    private static native boolean nativeIsCameraZoomSupported(long j2);

    private static native boolean nativeIsFrontCamera(long j2);

    private static native boolean nativeIsLowLatencyEarMonitorSupported(long j2);

    private static native int nativeSetAudioRoute(long j2, int i2);

    private static native void nativeSetCameraCapturerParam(long j2, CameraCaptureParam cameraCaptureParam);

    private static native int nativeSetCameraFocusPosition(long j2, int i2, int i3);

    private static native int nativeSetCameraZoomRatio(long j2, float f2);

    private static native int nativeSetSystemVolumeType(long j2, int i2);

    private static native int nativeSwitchCamera(long j2, boolean z);

    public static int systemVolumeTypeAsInt(TXDeviceManager.TXSystemVolumeType tXSystemVolumeType) {
    }

    public static TXDeviceManager.TXSystemVolumeType systemVolumeTypefromInt(int i2) {
    }

    @Override // com.tencent.liteav.device.TXDeviceManager
    public int enableCameraAutoFocus(boolean z) {
    }

    @Override // com.tencent.liteav.device.TXDeviceManager
    public boolean enableCameraTorch(boolean z) {
    }

    public void finalize() throws Throwable {
    }

    @Override // com.tencent.liteav.device.TXDeviceManager
    public float getCameraZoomMaxRatio() {
    }

    @Override // com.tencent.liteav.device.TXDeviceManager
    public boolean isAutoFocusEnabled() {
    }

    public boolean isCameraAutoFocusFaceModeSupported() {
    }

    public boolean isCameraFocusPositionInPreviewSupported() {
    }

    public boolean isCameraTorchSupported() {
    }

    public boolean isCameraZoomSupported() {
    }

    @Override // com.tencent.liteav.device.TXDeviceManager
    public boolean isFrontCamera() {
    }

    public boolean isLowLatencyEarMonitorSupported() {
    }

    @Override // com.tencent.liteav.device.TXDeviceManager
    public int setAudioRoute(TXDeviceManager.TXAudioRoute tXAudioRoute) {
    }

    @Override // com.tencent.liteav.device.TXDeviceManager
    public void setCameraCapturerParam(TXDeviceManager.TXCameraCaptureParam tXCameraCaptureParam) {
    }

    @Override // com.tencent.liteav.device.TXDeviceManager
    public int setCameraFocusPosition(int i2, int i3) {
    }

    @Override // com.tencent.liteav.device.TXDeviceManager
    public int setCameraZoomRatio(float f2) {
    }

    @Override // com.tencent.liteav.device.TXDeviceManager
    public int setSystemVolumeType(TXDeviceManager.TXSystemVolumeType tXSystemVolumeType) {
    }

    @Override // com.tencent.liteav.device.TXDeviceManager
    public int switchCamera(boolean z) {
    }
}
