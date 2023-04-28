package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class KeyTimeCycle extends Key {
    public static final int KEY_TYPE = 3;
    public static final String NAME = "KeyTimeCycle";
    private static final String TAG = "KeyTimeCycle";
    private float mAlpha;
    private int mCurveFit;
    private float mElevation;
    private float mProgress;
    private float mRotation;
    private float mRotationX;
    private float mRotationY;
    private float mScaleX;
    private float mScaleY;
    private String mTransitionEasing;
    private float mTransitionPathRotate;
    private float mTranslationX;
    private float mTranslationY;
    private float mTranslationZ;
    private float mWaveOffset;
    private float mWavePeriod;
    private int mWaveShape;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Loader {
        private static final int ANDROID_ALPHA = 1;
        private static final int ANDROID_ELEVATION = 2;
        private static final int ANDROID_ROTATION = 4;
        private static final int ANDROID_ROTATION_X = 5;
        private static final int ANDROID_ROTATION_Y = 6;
        private static final int ANDROID_SCALE_X = 7;
        private static final int ANDROID_SCALE_Y = 14;
        private static final int ANDROID_TRANSLATION_X = 15;
        private static final int ANDROID_TRANSLATION_Y = 16;
        private static final int ANDROID_TRANSLATION_Z = 17;
        private static final int CURVE_FIT = 13;
        private static final int FRAME_POSITION = 12;
        private static final int PROGRESS = 18;
        private static final int TARGET_ID = 10;
        private static final int TRANSITION_EASING = 9;
        private static final int TRANSITION_PATH_ROTATE = 8;
        private static final int WAVE_OFFSET = 21;
        private static final int WAVE_PERIOD = 20;
        private static final int WAVE_SHAPE = 19;
        private static SparseIntArray mAttrMap;

        private Loader() {
        }

        public static void read(KeyTimeCycle keyTimeCycle, TypedArray typedArray) {
        }
    }

    public static /* synthetic */ float access$000(KeyTimeCycle keyTimeCycle) {
    }

    public static /* synthetic */ float access$002(KeyTimeCycle keyTimeCycle, float f2) {
    }

    public static /* synthetic */ float access$100(KeyTimeCycle keyTimeCycle) {
    }

    public static /* synthetic */ String access$1002(KeyTimeCycle keyTimeCycle, String str) {
    }

    public static /* synthetic */ float access$102(KeyTimeCycle keyTimeCycle, float f2) {
    }

    public static /* synthetic */ float access$1100(KeyTimeCycle keyTimeCycle) {
    }

    public static /* synthetic */ float access$1102(KeyTimeCycle keyTimeCycle, float f2) {
    }

    public static /* synthetic */ float access$1200(KeyTimeCycle keyTimeCycle) {
    }

    public static /* synthetic */ float access$1202(KeyTimeCycle keyTimeCycle, float f2) {
    }

    public static /* synthetic */ float access$1300(KeyTimeCycle keyTimeCycle) {
    }

    public static /* synthetic */ float access$1302(KeyTimeCycle keyTimeCycle, float f2) {
    }

    public static /* synthetic */ float access$1400(KeyTimeCycle keyTimeCycle) {
    }

    public static /* synthetic */ float access$1402(KeyTimeCycle keyTimeCycle, float f2) {
    }

    public static /* synthetic */ float access$1500(KeyTimeCycle keyTimeCycle) {
    }

    public static /* synthetic */ float access$1502(KeyTimeCycle keyTimeCycle, float f2) {
    }

    public static /* synthetic */ float access$1600(KeyTimeCycle keyTimeCycle) {
    }

    public static /* synthetic */ float access$1602(KeyTimeCycle keyTimeCycle, float f2) {
    }

    public static /* synthetic */ float access$200(KeyTimeCycle keyTimeCycle) {
    }

    public static /* synthetic */ float access$202(KeyTimeCycle keyTimeCycle, float f2) {
    }

    public static /* synthetic */ int access$300(KeyTimeCycle keyTimeCycle) {
    }

    public static /* synthetic */ int access$302(KeyTimeCycle keyTimeCycle, int i2) {
    }

    public static /* synthetic */ int access$400(KeyTimeCycle keyTimeCycle) {
    }

    public static /* synthetic */ int access$402(KeyTimeCycle keyTimeCycle, int i2) {
    }

    public static /* synthetic */ float access$500(KeyTimeCycle keyTimeCycle) {
    }

    public static /* synthetic */ float access$502(KeyTimeCycle keyTimeCycle, float f2) {
    }

    public static /* synthetic */ float access$600(KeyTimeCycle keyTimeCycle) {
    }

    public static /* synthetic */ float access$602(KeyTimeCycle keyTimeCycle, float f2) {
    }

    public static /* synthetic */ float access$700(KeyTimeCycle keyTimeCycle) {
    }

    public static /* synthetic */ float access$702(KeyTimeCycle keyTimeCycle, float f2) {
    }

    public static /* synthetic */ float access$800(KeyTimeCycle keyTimeCycle) {
    }

    public static /* synthetic */ float access$802(KeyTimeCycle keyTimeCycle, float f2) {
    }

    public static /* synthetic */ float access$900(KeyTimeCycle keyTimeCycle) {
    }

    public static /* synthetic */ float access$902(KeyTimeCycle keyTimeCycle, float f2) {
    }

    public void addTimeValues(HashMap<String, TimeCycleSplineSet> hashMap) {
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void addValues(HashMap<String, SplineSet> hashMap) {
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void getAttributeNames(HashSet<String> hashSet) {
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void load(Context context, AttributeSet attributeSet) {
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void setInterpolation(HashMap<String, Integer> hashMap) {
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void setValue(String str, Object obj) {
    }
}
