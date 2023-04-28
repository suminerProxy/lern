package com.alipay.zoloz.toyger.algorithm;

import android.graphics.RectF;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class TGFaceAttr {
    public float brightness;
    public float confidence;
    public float deepLiveness;
    public float depthQuality;
    public short distance;
    public boolean eyeBlink;
    public boolean eyeOpen;
    public int faceId;
    public RectF faceRegion;
    public float gaussian;
    public boolean hasFace;
    public float integrity;
    public float iodRatio;
    public float[] keypts10;
    public float leftEyeBlinkRatio;
    public float leftEyeBlinkRatioMax;
    public float leftEyeBlinkRatioMin;
    public float motion;
    public float pitch;
    public float quality;
    public float rightEyeBlinkRatio;
    public float rightEyeBlinkRatioMax;
    public float rightEyeBlinkRatioMin;
    public float roll;
    public float yaw;

    public TGFaceAttr() {
    }

    public String toString() {
    }

    public TGFaceAttr(boolean z, int i2, boolean z2, boolean z3, RectF rectF, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, short s, float[] fArr, float f15, float f16, float f17, float f18, float f19) {
    }

    public TGFaceAttr(TGFaceAttr tGFaceAttr) {
    }
}
