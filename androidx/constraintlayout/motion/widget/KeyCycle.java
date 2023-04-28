package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class KeyCycle extends Key {
    public static final int KEY_TYPE = 4;
    public static final String NAME = "KeyCycle";
    private static final String TAG = "KeyCycle";
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
    private int mWaveVariesBy;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Loader {
        private static final int ANDROID_ALPHA = 9;
        private static final int ANDROID_ELEVATION = 10;
        private static final int ANDROID_ROTATION = 11;
        private static final int ANDROID_ROTATION_X = 12;
        private static final int ANDROID_ROTATION_Y = 13;
        private static final int ANDROID_SCALE_X = 15;
        private static final int ANDROID_SCALE_Y = 16;
        private static final int ANDROID_TRANSLATION_X = 17;
        private static final int ANDROID_TRANSLATION_Y = 18;
        private static final int ANDROID_TRANSLATION_Z = 19;
        private static final int CURVE_FIT = 4;
        private static final int FRAME_POSITION = 2;
        private static final int PROGRESS = 20;
        private static final int TARGET_ID = 1;
        private static final int TRANSITION_EASING = 3;
        private static final int TRANSITION_PATH_ROTATE = 14;
        private static final int WAVE_OFFSET = 7;
        private static final int WAVE_PERIOD = 6;
        private static final int WAVE_SHAPE = 5;
        private static final int WAVE_VARIES_BY = 8;
        private static SparseIntArray mAttrMap;

        private Loader() {
        }

        public static /* synthetic */ void access$000(KeyCycle keyCycle, TypedArray typedArray) {
        }

        private static void read(KeyCycle keyCycle, TypedArray typedArray) {
        }
    }

    public static /* synthetic */ float access$1000(KeyCycle keyCycle) {
    }

    public static /* synthetic */ float access$1002(KeyCycle keyCycle, float f2) {
    }

    public static /* synthetic */ String access$102(KeyCycle keyCycle, String str) {
    }

    public static /* synthetic */ float access$1100(KeyCycle keyCycle) {
    }

    public static /* synthetic */ float access$1102(KeyCycle keyCycle, float f2) {
    }

    public static /* synthetic */ float access$1200(KeyCycle keyCycle) {
    }

    public static /* synthetic */ float access$1202(KeyCycle keyCycle, float f2) {
    }

    public static /* synthetic */ float access$1300(KeyCycle keyCycle) {
    }

    public static /* synthetic */ float access$1302(KeyCycle keyCycle, float f2) {
    }

    public static /* synthetic */ float access$1400(KeyCycle keyCycle) {
    }

    public static /* synthetic */ float access$1402(KeyCycle keyCycle, float f2) {
    }

    public static /* synthetic */ float access$1500(KeyCycle keyCycle) {
    }

    public static /* synthetic */ float access$1502(KeyCycle keyCycle, float f2) {
    }

    public static /* synthetic */ float access$1600(KeyCycle keyCycle) {
    }

    public static /* synthetic */ float access$1602(KeyCycle keyCycle, float f2) {
    }

    public static /* synthetic */ float access$1700(KeyCycle keyCycle) {
    }

    public static /* synthetic */ float access$1702(KeyCycle keyCycle, float f2) {
    }

    public static /* synthetic */ float access$1800(KeyCycle keyCycle) {
    }

    public static /* synthetic */ float access$1802(KeyCycle keyCycle, float f2) {
    }

    public static /* synthetic */ int access$200(KeyCycle keyCycle) {
    }

    public static /* synthetic */ int access$202(KeyCycle keyCycle, int i2) {
    }

    public static /* synthetic */ int access$300(KeyCycle keyCycle) {
    }

    public static /* synthetic */ int access$302(KeyCycle keyCycle, int i2) {
    }

    public static /* synthetic */ float access$400(KeyCycle keyCycle) {
    }

    public static /* synthetic */ float access$402(KeyCycle keyCycle, float f2) {
    }

    public static /* synthetic */ float access$500(KeyCycle keyCycle) {
    }

    public static /* synthetic */ float access$502(KeyCycle keyCycle, float f2) {
    }

    public static /* synthetic */ int access$600(KeyCycle keyCycle) {
    }

    public static /* synthetic */ int access$602(KeyCycle keyCycle, int i2) {
    }

    public static /* synthetic */ float access$700(KeyCycle keyCycle) {
    }

    public static /* synthetic */ float access$702(KeyCycle keyCycle, float f2) {
    }

    public static /* synthetic */ float access$800(KeyCycle keyCycle) {
    }

    public static /* synthetic */ float access$802(KeyCycle keyCycle, float f2) {
    }

    public static /* synthetic */ float access$900(KeyCycle keyCycle) {
    }

    public static /* synthetic */ float access$902(KeyCycle keyCycle, float f2) {
    }

    public void addCycleValues(HashMap<String, KeyCycleOscillator> hashMap) {
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void addValues(HashMap<String, SplineSet> hashMap) {
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void getAttributeNames(HashSet<String> hashSet) {
    }

    public float getValue(String str) {
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void load(Context context, AttributeSet attributeSet) {
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void setValue(String str, Object obj) {
    }
}
