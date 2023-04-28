package com.tencent.youtu.liveness;

import android.content.res.AssetManager;
import android.graphics.Rect;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class YTFaceTracker {
    private static IYtLoggerListener loggerListener;
    private long nativePtr;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface IYtLoggerListener {
        void log(String str, String str2);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class Param {
        public int biggerFaceMode;
        public int detInterval;
        public int maxFaceSize;
        public int minFaceSize;
        public boolean nonSquareRect;
        public float threshold;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class TrackedFace {
        public Rect faceRect;
        public float[] faceShape;
        public float[] faceVisible;
        public int frameId;
        public float pitch;
        public float roll;
        public int traceId;
        public float yaw;
    }

    public YTFaceTracker(AssetManager assetManager, String str, String str2) throws Exception {
    }

    public YTFaceTracker(String str, String str2) throws Exception {
    }

    private native int NativeConstructor(AssetManager assetManager, String str, String str2);

    private native int NativeConstructor(String str, String str2);

    private native void NativeDestructor();

    public static native String getVersion();

    public static void nativeLog(int i2, String str) {
    }

    public static native void setLoggerLevel(int i2);

    public static void setLoggerListener(IYtLoggerListener iYtLoggerListener) {
    }

    public void destroy() {
    }

    public void finalize() {
    }

    public native Param getParam();

    public native void reset();

    public native void setParam(Param param);

    public native TrackedFace[] track(int i2, byte[] bArr, int i3, int i4, int i5, boolean z, byte[] bArr2) throws Exception;
}
