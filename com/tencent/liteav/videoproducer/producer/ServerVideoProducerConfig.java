package com.tencent.liteav.videoproducer.producer;

import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.videobase.utils.Rotation;

@JNINamespace("liteav::video")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ServerVideoProducerConfig {
    private Rotation backCameraRealRotation;
    private int camera2SupportMinApiLevel;
    private Rotation frontCameraRealRotation;
    private int hardwareEncodeType;
    private boolean hardwareEncoderHighProfileEnable;
    private boolean hardwareEncoderHighProfileSupport;

    public static boolean isHWHevcEncodeAllowed() {
    }

    private static native boolean nativeIsHardwareHevcEncodeAllowed();

    public int getCamera2SupportMinApiLevel() {
    }

    public Rotation getCameraRealRotation(boolean z) {
    }

    public boolean isHardwareEncoderAllowed() {
    }

    public boolean isHardwareEncoderHighProfileAllowed() {
    }

    @CalledByNative
    public void setCamera2SupportMinApiLevel(int i2) {
    }

    @CalledByNative
    public void setCameraRealRotation(int i2, int i3) {
    }

    @CalledByNative
    public void setHardwareEncodeType(int i2) {
    }

    @CalledByNative
    public void setHardwareEncoderHighProfileEnable(boolean z) {
    }

    @CalledByNative
    public void setHardwareEncoderHighProfileSupport(boolean z) {
    }
}
