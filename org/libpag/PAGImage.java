package org.libpag;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Matrix;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class PAGImage {
    public long nativeContext;

    public PAGImage(long j2) {
    }

    public static PAGImage FromAssets(AssetManager assetManager, String str) {
    }

    public static PAGImage FromBitmap(Bitmap bitmap) {
    }

    public static PAGImage FromBytes(byte[] bArr) {
    }

    public static PAGImage FromPath(String str) {
    }

    public static PAGImage FromTexture(int i2, int i3, int i4, int i5) {
    }

    private static native long LoadFromAssets(AssetManager assetManager, String str);

    private static native long LoadFromBitmap(Bitmap bitmap);

    private static native long LoadFromBytes(byte[] bArr, int i2);

    private static native long LoadFromPath(String str);

    private static native long LoadFromTexture(int i2, int i3, int i4, int i5, boolean z);

    private native void nativeFinalize();

    private native void nativeGetMatrix(float[] fArr);

    private static final native void nativeInit();

    private final native void nativeRelease();

    private native void nativeSetMatrix(float f2, float f3, float f4, float f5, float f6, float f7);

    public void finalize() {
    }

    public native int height();

    public Matrix matrix() {
    }

    public void release() {
    }

    public native int scaleMode();

    public void setMatrix(Matrix matrix) {
    }

    public native void setScaleMode(int i2);

    public native int width();

    public static PAGImage FromTexture(int i2, int i3, int i4, int i5, boolean z) {
    }
}
