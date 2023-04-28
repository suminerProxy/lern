package com.nineoldandroids.animation;

import android.view.animation.Interpolator;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class KeyframeSet {
    public TypeEvaluator mEvaluator;
    public Keyframe mFirstKeyframe;
    public Interpolator mInterpolator;
    public ArrayList<Keyframe> mKeyframes;
    public Keyframe mLastKeyframe;
    public int mNumKeyframes;

    public KeyframeSet(Keyframe... keyframeArr) {
    }

    public static KeyframeSet ofFloat(float... fArr) {
    }

    public static KeyframeSet ofInt(int... iArr) {
    }

    public static KeyframeSet ofKeyframe(Keyframe... keyframeArr) {
    }

    public static KeyframeSet ofObject(Object... objArr) {
    }

    /* renamed from: clone */
    public /* bridge */ /* synthetic */ Object mo13clone() throws CloneNotSupportedException {
    }

    public Object getValue(float f2) {
    }

    public void setEvaluator(TypeEvaluator typeEvaluator) {
    }

    public String toString() {
    }

    public KeyframeSet clone() {
    }
}
