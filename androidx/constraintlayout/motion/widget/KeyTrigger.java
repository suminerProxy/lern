package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class KeyTrigger extends Key {
    public static final int KEY_TYPE = 5;
    public static final String NAME = "KeyTrigger";
    private static final String TAG = "KeyTrigger";
    public RectF mCollisionRect;
    private String mCross;
    private int mCurveFit;
    private Method mFireCross;
    private boolean mFireCrossReset;
    private float mFireLastPos;
    private Method mFireNegativeCross;
    private boolean mFireNegativeReset;
    private Method mFirePositiveCross;
    private boolean mFirePositiveReset;
    private float mFireThreshold;
    private String mNegativeCross;
    private String mPositiveCross;
    private boolean mPostLayout;
    public RectF mTargetRect;
    private int mTriggerCollisionId;
    private View mTriggerCollisionView;
    private int mTriggerID;
    private int mTriggerReceiver;
    public float mTriggerSlack;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Loader {
        private static final int COLLISION = 9;
        private static final int CROSS = 4;
        private static final int FRAME_POS = 8;
        private static final int NEGATIVE_CROSS = 1;
        private static final int POSITIVE_CROSS = 2;
        private static final int POST_LAYOUT = 10;
        private static final int TARGET_ID = 7;
        private static final int TRIGGER_ID = 6;
        private static final int TRIGGER_RECEIVER = 11;
        private static final int TRIGGER_SLACK = 5;
        private static SparseIntArray mAttrMap;

        private Loader() {
        }

        public static void read(KeyTrigger keyTrigger, TypedArray typedArray, Context context) {
        }
    }

    public static /* synthetic */ float access$002(KeyTrigger keyTrigger, float f2) {
    }

    public static /* synthetic */ String access$102(KeyTrigger keyTrigger, String str) {
    }

    public static /* synthetic */ String access$202(KeyTrigger keyTrigger, String str) {
    }

    public static /* synthetic */ String access$302(KeyTrigger keyTrigger, String str) {
    }

    public static /* synthetic */ int access$400(KeyTrigger keyTrigger) {
    }

    public static /* synthetic */ int access$402(KeyTrigger keyTrigger, int i2) {
    }

    public static /* synthetic */ int access$500(KeyTrigger keyTrigger) {
    }

    public static /* synthetic */ int access$502(KeyTrigger keyTrigger, int i2) {
    }

    public static /* synthetic */ boolean access$600(KeyTrigger keyTrigger) {
    }

    public static /* synthetic */ boolean access$602(KeyTrigger keyTrigger, boolean z) {
    }

    public static /* synthetic */ int access$700(KeyTrigger keyTrigger) {
    }

    public static /* synthetic */ int access$702(KeyTrigger keyTrigger, int i2) {
    }

    private void setUpRect(RectF rectF, View view, boolean z) {
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void addValues(HashMap<String, SplineSet> hashMap) {
    }

    public void conditionallyFire(float f2, View view) {
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
    public void setValue(String str, Object obj) {
    }
}
