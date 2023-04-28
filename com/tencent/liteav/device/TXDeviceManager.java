package com.tencent.liteav.device;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface TXDeviceManager {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class TXAudioRoute {
        private static final /* synthetic */ TXAudioRoute[] $VALUES = null;
        public static final TXAudioRoute TXAudioRouteEarpiece = null;
        public static final TXAudioRoute TXAudioRouteSpeakerphone = null;

        private TXAudioRoute(String str, int i2) {
        }

        public static TXAudioRoute valueOf(String str) {
        }

        public static TXAudioRoute[] values() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class TXCameraCaptureMode {
        private static final /* synthetic */ TXCameraCaptureMode[] $VALUES = null;
        public static final TXCameraCaptureMode TXCameraCaptureManual = null;
        public static final TXCameraCaptureMode TXCameraResolutionStrategyAuto = null;
        public static final TXCameraCaptureMode TXCameraResolutionStrategyHighQuality = null;
        public static final TXCameraCaptureMode TXCameraResolutionStrategyPerformance = null;

        private TXCameraCaptureMode(String str, int i2) {
        }

        public static TXCameraCaptureMode valueOf(String str) {
        }

        public static TXCameraCaptureMode[] values() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class TXCameraCaptureParam {
        public int height;
        public TXCameraCaptureMode mode;
        public int width;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class TXSystemVolumeType {
        private static final /* synthetic */ TXSystemVolumeType[] $VALUES = null;
        public static final TXSystemVolumeType TXSystemVolumeTypeAuto = null;
        public static final TXSystemVolumeType TXSystemVolumeTypeMedia = null;
        public static final TXSystemVolumeType TXSystemVolumeTypeVOIP = null;

        private TXSystemVolumeType(String str, int i2) {
        }

        public static TXSystemVolumeType valueOf(String str) {
        }

        public static TXSystemVolumeType[] values() {
        }
    }

    int enableCameraAutoFocus(boolean z);

    boolean enableCameraTorch(boolean z);

    float getCameraZoomMaxRatio();

    boolean isAutoFocusEnabled();

    boolean isFrontCamera();

    int setAudioRoute(TXAudioRoute tXAudioRoute);

    void setCameraCapturerParam(TXCameraCaptureParam tXCameraCaptureParam);

    int setCameraFocusPosition(int i2, int i3);

    int setCameraZoomRatio(float f2);

    int setSystemVolumeType(TXSystemVolumeType tXSystemVolumeType);

    int switchCamera(boolean z);
}
