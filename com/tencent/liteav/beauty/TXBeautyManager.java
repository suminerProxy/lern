package com.tencent.liteav.beauty;

import android.graphics.Bitmap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface TXBeautyManager {
    public static final int TXBeautyStyleNature = 1;
    public static final int TXBeautyStylePitu = 2;
    public static final int TXBeautyStyleSmooth = 0;

    void enableSharpnessEnhancement(boolean z);

    void setBeautyLevel(float f2);

    void setBeautyStyle(int i2);

    int setChinLevel(float f2);

    int setEyeAngleLevel(float f2);

    int setEyeDistanceLevel(float f2);

    int setEyeLightenLevel(float f2);

    int setEyeScaleLevel(float f2);

    int setFaceBeautyLevel(float f2);

    int setFaceNarrowLevel(float f2);

    int setFaceShortLevel(float f2);

    int setFaceSlimLevel(float f2);

    int setFaceVLevel(float f2);

    void setFilter(Bitmap bitmap);

    void setFilterStrength(float f2);

    int setForeheadLevel(float f2);

    int setGreenScreenFile(String str);

    int setLipsThicknessLevel(float f2);

    void setMotionMute(boolean z);

    void setMotionTmpl(String str);

    int setMouthShapeLevel(float f2);

    int setNosePositionLevel(float f2);

    int setNoseSlimLevel(float f2);

    int setNoseWingLevel(float f2);

    int setPounchRemoveLevel(float f2);

    void setRuddyLevel(float f2);

    int setSmileLinesRemoveLevel(float f2);

    int setToothWhitenLevel(float f2);

    void setWhitenessLevel(float f2);

    int setWrinkleRemoveLevel(float f2);
}
