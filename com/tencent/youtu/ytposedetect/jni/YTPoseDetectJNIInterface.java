package com.tencent.youtu.ytposedetect.jni;

import android.graphics.Bitmap;
import com.tencent.youtu.ytposedetect.data.YTActRefData;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class YTPoseDetectJNIInterface {
    private static IYtLoggerListener loggerListener;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface IYtLoggerListener {
        void log(String str, String str2);
    }

    public static native boolean canReflect();

    public static native void configNativeLog(boolean z);

    public static byte[] encodeJpeg(Bitmap bitmap) {
    }

    public static native YTActRefData getActionReflectData(int i2);

    public static native byte[] getBestImage(int i2);

    public static native byte[] getEyeImage(int i2);

    public static native byte[][] getFrameList();

    public static native byte[] getMouthImage(int i2);

    public static native String getVersion();

    public static native int initModel(String str);

    public static native boolean isRecordingDone();

    public static void nativeLog(int i2, String str) {
    }

    public static void nativeLog(String str, String str2) {
    }

    public static native int poseDetect(float[] fArr, float[] fArr2, int i2, byte[] bArr, int i3, int i4, int i5, float f2, float f3, float f4, int i6);

    public static native void releaseAll();

    public static native void resetDetect();

    public static native byte[] rotateYuv(byte[] bArr, int i2, int i3, int i4);

    public static void setLoggerListener(IYtLoggerListener iYtLoggerListener) {
    }

    public static native void setSafetyLevel(int i2);

    public static native int updateParam(String str, String str2);
}
