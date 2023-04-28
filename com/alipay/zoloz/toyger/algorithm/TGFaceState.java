package com.alipay.zoloz.toyger.algorithm;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class TGFaceState {
    public static final int TG_MESSAGE_BAD_BRIGHTNESS = 8;
    public static final int TG_MESSAGE_BAD_EYE_OPENNESS = 10;
    public static final int TG_MESSAGE_BAD_PITCH = 5;
    public static final int TG_MESSAGE_BAD_QUALITY = 9;
    public static final int TG_MESSAGE_BAD_YAW = 6;
    public static final int TG_MESSAGE_BLINK_OPENNESS = 11;
    public static final int TG_MESSAGE_DEPTH_DAMAGE = 13;
    public static final int TG_MESSAGE_DISTANCE_TOO_CLOSE = 3;
    public static final int TG_MESSAGE_DISTANCE_TOO_FAR = 2;
    public static final int TG_MESSAGE_FACE_NOT_IN_CENTER = 4;
    public static final int TG_MESSAGE_IMAGE_PERFECT = 0;
    public static final int TG_MESSAGE_IS_MOVING = 7;
    public static final int TG_MESSAGE_NO_FACE = 1;
    public static final int TG_MESSAGE_STACK_TIME = 12;
    public static final int TG_STATIC_MESSAGE_BLINK_LIVENESS = 1;
    public static final int TG_STATIC_MESSAGE_NOLIVENESS = 0;
    @Deprecated
    public int brightness;
    @Deprecated
    public int distance;
    @Deprecated
    public boolean faceInCenter;
    @Deprecated
    public int goodPitch;
    @Deprecated
    public boolean goodQuality;
    @Deprecated
    public int goodYaw;
    @Deprecated
    public boolean hasFace;
    @Deprecated
    public boolean isMoving;
    public int messageCode;
    public float progress;
    public int staticMessage;

    public TGFaceState() {
    }

    public String toString() {
    }

    public TGFaceState(float f2, int i2) {
    }

    @Deprecated
    public TGFaceState(boolean z, int i2, int i3, boolean z2, int i4, int i5, boolean z3, boolean z4, float f2) {
    }
}
