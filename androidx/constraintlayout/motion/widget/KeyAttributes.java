package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class KeyAttributes extends Key {
    public static final int KEY_TYPE = 1;
    public static final String NAME = "KeyAttribute";
    private static final String TAG = "KeyAttribute";
    private float mAlpha;
    private int mCurveFit;
    private float mElevation;
    private float mPivotX;
    private float mPivotY;
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
    private boolean mVisibility;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Loader {
        private static final int ANDROID_ALPHA = 1;
        private static final int ANDROID_ELEVATION = 2;
        private static final int ANDROID_PIVOT_X = 19;
        private static final int ANDROID_PIVOT_Y = 20;
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
        private static SparseIntArray mAttrMap;

        private Loader() {
        }

        public static void read(KeyAttributes keyAttributes, TypedArray typedArray) {
        }
    }

    public static /* synthetic */ float access$000(KeyAttributes keyAttributes) {
    }

    public static /* synthetic */ float access$002(KeyAttributes keyAttributes, float f2) {
    }

    public static /* synthetic */ float access$100(KeyAttributes keyAttributes) {
    }

    public static /* synthetic */ float access$1000(KeyAttributes keyAttributes) {
    }

    public static /* synthetic */ float access$1002(KeyAttributes keyAttributes, float f2) {
    }

    public static /* synthetic */ float access$102(KeyAttributes keyAttributes, float f2) {
    }

    public static /* synthetic */ float access$1100(KeyAttributes keyAttributes) {
    }

    public static /* synthetic */ float access$1102(KeyAttributes keyAttributes, float f2) {
    }

    public static /* synthetic */ float access$1200(KeyAttributes keyAttributes) {
    }

    public static /* synthetic */ float access$1202(KeyAttributes keyAttributes, float f2) {
    }

    public static /* synthetic */ float access$1300(KeyAttributes keyAttributes) {
    }

    public static /* synthetic */ float access$1302(KeyAttributes keyAttributes, float f2) {
    }

    public static /* synthetic */ float access$1400(KeyAttributes keyAttributes) {
    }

    public static /* synthetic */ float access$1402(KeyAttributes keyAttributes, float f2) {
    }

    public static /* synthetic */ float access$1500(KeyAttributes keyAttributes) {
    }

    public static /* synthetic */ float access$1502(KeyAttributes keyAttributes, float f2) {
    }

    public static /* synthetic */ float access$200(KeyAttributes keyAttributes) {
    }

    public static /* synthetic */ float access$202(KeyAttributes keyAttributes, float f2) {
    }

    public static /* synthetic */ int access$300(KeyAttributes keyAttributes) {
    }

    public static /* synthetic */ int access$302(KeyAttributes keyAttributes, int i2) {
    }

    public static /* synthetic */ float access$400(KeyAttributes keyAttributes) {
    }

    public static /* synthetic */ float access$402(KeyAttributes keyAttributes, float f2) {
    }

    public static /* synthetic */ float access$500(KeyAttributes keyAttributes) {
    }

    public static /* synthetic */ float access$502(KeyAttributes keyAttributes, float f2) {
    }

    public static /* synthetic */ float access$600(KeyAttributes keyAttributes) {
    }

    public static /* synthetic */ float access$602(KeyAttributes keyAttributes, float f2) {
    }

    public static /* synthetic */ float access$700(KeyAttributes keyAttributes) {
    }

    public static /* synthetic */ float access$702(KeyAttributes keyAttributes, float f2) {
    }

    public static /* synthetic */ float access$800(KeyAttributes keyAttributes) {
    }

    public static /* synthetic */ float access$802(KeyAttributes keyAttributes, float f2) {
    }

    public static /* synthetic */ String access$902(KeyAttributes keyAttributes, String str) {
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void addValues(HashMap<String, SplineSet> hashMap) {
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void getAttributeNames(HashSet<String> hashSet) {
    }

    public int getCurveFit() {
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
