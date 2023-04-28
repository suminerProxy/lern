package com.tencent.liteav.beauty;

import android.graphics.Bitmap;
import com.tencent.liteav.base.annotations.JNINamespace;

@JNINamespace("liteav::manager")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TXBeautyManagerImpl implements TXBeautyManager {
    private long mNativeBeautyManager;

    public TXBeautyManagerImpl(long j2) {
    }

    private static native void nativeDestroy(long j2);

    private static native void nativeEnableSharpnessEnhancement(long j2, boolean z);

    private static native void nativeSetBeautyLevel(long j2, float f2);

    private static native void nativeSetBeautyStyle(long j2, int i2);

    private static native int nativeSetChinLevel(long j2, float f2);

    private static native int nativeSetEyeAngleLevel(long j2, float f2);

    private static native int nativeSetEyeDistanceLevel(long j2, float f2);

    private static native int nativeSetEyeLightenLevel(long j2, float f2);

    private static native int nativeSetEyeScaleLevel(long j2, float f2);

    private static native int nativeSetFaceBeautyLevel(long j2, float f2);

    private static native int nativeSetFaceNarrowLevel(long j2, float f2);

    private static native int nativeSetFaceShortLevel(long j2, float f2);

    private static native int nativeSetFaceSlimLevel(long j2, float f2);

    private static native int nativeSetFaceVLevel(long j2, float f2);

    private static native void nativeSetFilter(long j2, Bitmap bitmap);

    private static native void nativeSetFilterStrength(long j2, float f2);

    private static native int nativeSetForeheadLevel(long j2, float f2);

    private static native int nativeSetGreenScreenFile(long j2, String str);

    private static native int nativeSetLipsThicknessLevel(long j2, float f2);

    private static native void nativeSetMotionMute(long j2, boolean z);

    private static native void nativeSetMotionTmpl(long j2, String str);

    private static native int nativeSetMouthShapeLevel(long j2, float f2);

    private static native int nativeSetNosePositionLevel(long j2, float f2);

    private static native int nativeSetNoseSlimLevel(long j2, float f2);

    private static native int nativeSetNoseWingLevel(long j2, float f2);

    private static native int nativeSetPounchRemoveLevel(long j2, float f2);

    private static native void nativeSetRuddyLevel(long j2, float f2);

    private static native int nativeSetSmileLinesRemoveLevel(long j2, float f2);

    private static native int nativeSetToothWhitenLevel(long j2, float f2);

    private static native void nativeSetWhitenessLevel(long j2, float f2);

    private static native int nativeSetWrinkleRemoveLevel(long j2, float f2);

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void enableSharpnessEnhancement(boolean z) {
    }

    public void finalize() throws Throwable {
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setBeautyLevel(float f2) {
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setBeautyStyle(int i2) {
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setChinLevel(float f2) {
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setEyeAngleLevel(float f2) {
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setEyeDistanceLevel(float f2) {
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setEyeLightenLevel(float f2) {
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setEyeScaleLevel(float f2) {
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setFaceBeautyLevel(float f2) {
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setFaceNarrowLevel(float f2) {
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setFaceShortLevel(float f2) {
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setFaceSlimLevel(float f2) {
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setFaceVLevel(float f2) {
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setFilter(Bitmap bitmap) {
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setFilterStrength(float f2) {
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setForeheadLevel(float f2) {
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setGreenScreenFile(String str) {
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setLipsThicknessLevel(float f2) {
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setMotionMute(boolean z) {
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setMotionTmpl(String str) {
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setMouthShapeLevel(float f2) {
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setNosePositionLevel(float f2) {
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setNoseSlimLevel(float f2) {
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setNoseWingLevel(float f2) {
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setPounchRemoveLevel(float f2) {
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setRuddyLevel(float f2) {
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setSmileLinesRemoveLevel(float f2) {
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setToothWhitenLevel(float f2) {
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setWhitenessLevel(float f2) {
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setWrinkleRemoveLevel(float f2) {
    }
}
