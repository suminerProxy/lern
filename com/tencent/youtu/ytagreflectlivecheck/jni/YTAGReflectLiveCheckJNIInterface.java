package com.tencent.youtu.ytagreflectlivecheck.jni;

import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.youtu.ytagreflectlivecheck.jni.cppDefine.FullPack;
import com.tencent.youtu.ytagreflectlivecheck.jni.cppDefine.RawYuvData;
import com.tencent.youtu.ytagreflectlivecheck.jni.cppDefine.Timeval;
import java.util.concurrent.locks.Lock;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class YTAGReflectLiveCheckJNIInterface {
    public static int TIME_REGULATION_LOOSE = 1;
    public static int TIME_REGULATION_STRICT;
    private static YTAGReflectLiveCheckJNIInterface instance;
    private static Lock instanceLock;
    private static IYtLoggerListener loggerListener;
    private long FRnativePtr;
    public Context context;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface IYtLoggerListener {
        void log(String str, String str2);
    }

    private YTAGReflectLiveCheckJNIInterface() {
    }

    public static native String FRGenConfigData(int i2, String str);

    public static native String FRVersion();

    public static synchronized void clearInstance() {
    }

    public static void compressTest(Bitmap bitmap, int i2) {
    }

    public static native void configNativeLog(boolean z);

    public static byte[] encodeJpeg(Bitmap bitmap) {
    }

    public static byte[] encodeJpeg(Bitmap bitmap, int i2) {
    }

    public static synchronized YTAGReflectLiveCheckJNIInterface getInstance() {
    }

    public static String modelVersion() {
    }

    public static void nativeLog(int i2, String str) {
    }

    public static void nativeLog(String str, String str2) {
    }

    public static String sdkVersion() {
    }

    public static void setLoggerListener(IYtLoggerListener iYtLoggerListener) {
    }

    public static native int updateParam(String str, String str2);

    public native int FRDoDetectionYuvs(boolean z, int i2);

    public native FullPack FRGetAGin();

    public native int FRGetChangePoint();

    public native int FRGetConfigBegin();

    public native int FRGetConfigEnd();

    public native int FRGetISOCaptureTimeVecSize();

    public native double FRGetISObackup();

    public native int FRGetISOchangeFrame();

    public native double FRGetISOmin();

    public native RawYuvData[] FRGetRawYuvDatas();

    public native int FRGetTriggerTime();

    public native int FRInit(boolean z, String str, int i2, long[] jArr, float f2);

    public native void FRNativeConstructor();

    public native void FRNativeDestructor();

    public native void FRPushCaptureTime(Timeval timeval);

    public native void FRPushISOCaptureTime(Timeval timeval);

    public native void FRPushISOImgYuv(byte[] bArr, int i2, int i3);

    public native void FRPushYuv(byte[] bArr, int i2, int i3, long j2, int i4, float[] fArr);

    public native int FRRelease();

    public native void FRSetBegin(Timeval timeval);

    public native void FRSetChangePointTime(Timeval timeval);

    public native void FRSetDoingDelayCalc(boolean z);

    public native void FRSetEnd(Timeval timeval);

    public native void FRSetISObackup(double d2);

    public native void FRSetISOchangeFrame(int i2);

    public native void FRSetISOchangeTime(Timeval timeval);

    public native void FRSetSafetyLevel(int i2);
}
