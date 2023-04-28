package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.utils.Easing;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.StateSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class MotionScene {
    public static final int ANTICIPATE = 4;
    public static final int BOUNCE = 5;
    private static final boolean DEBUG = false;
    public static final int EASE_IN = 1;
    public static final int EASE_IN_OUT = 0;
    public static final int EASE_OUT = 2;
    private static final int INTERPOLATOR_REFRENCE_ID = -2;
    public static final int LAYOUT_HONOR_REQUEST = 1;
    public static final int LAYOUT_IGNORE_REQUEST = 0;
    public static final int LINEAR = 3;
    private static final int SPLINE_STRING = -1;
    public static final String TAG = "MotionScene";
    public static final int TRANSITION_BACKWARD = 0;
    public static final int TRANSITION_FORWARD = 1;
    public static final int UNSET = -1;
    private boolean DEBUG_DESKTOP;
    private ArrayList<Transition> mAbstractTransitionList;
    private HashMap<String, Integer> mConstraintSetIdMap;
    private SparseArray<ConstraintSet> mConstraintSetMap;
    public Transition mCurrentTransition;
    private int mDefaultDuration;
    private Transition mDefaultTransition;
    private SparseIntArray mDeriveMap;
    private boolean mDisableAutoTransition;
    private boolean mIgnoreTouch;
    private MotionEvent mLastTouchDown;
    public float mLastTouchX;
    public float mLastTouchY;
    private int mLayoutDuringTransition;
    private final MotionLayout mMotionLayout;
    private boolean mMotionOutsideRegion;
    private boolean mRtl;
    public StateSet mStateSet;
    private ArrayList<Transition> mTransitionList;
    private MotionLayout.MotionTracker mVelocityTracker;

    /* renamed from: androidx.constraintlayout.motion.widget.MotionScene$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements Interpolator {
        public final /* synthetic */ MotionScene this$0;
        public final /* synthetic */ Easing val$easing;

        public AnonymousClass1(MotionScene motionScene, Easing easing) {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
        }
    }

    public MotionScene(MotionLayout motionLayout) {
    }

    public static /* synthetic */ int access$1000(MotionScene motionScene) {
    }

    public static /* synthetic */ SparseArray access$1100(MotionScene motionScene) {
    }

    public static /* synthetic */ MotionLayout access$800(MotionScene motionScene) {
    }

    public static /* synthetic */ int access$900(MotionScene motionScene) {
    }

    private int getId(Context context, String str) {
    }

    private int getIndex(Transition transition) {
    }

    private int getRealID(int i2) {
    }

    private boolean hasCycleDependency(int i2) {
    }

    private boolean isProcessingTouch() {
    }

    private void load(Context context, int i2) {
    }

    private void parseConstraintSet(Context context, XmlPullParser xmlPullParser) {
    }

    private void parseMotionSceneTags(Context context, XmlPullParser xmlPullParser) {
    }

    private void readConstraintChain(int i2) {
    }

    public static String stripID(String str) {
    }

    public void addOnClickListeners(MotionLayout motionLayout, int i2) {
    }

    public void addTransition(Transition transition) {
    }

    public boolean autoTransition(MotionLayout motionLayout, int i2) {
    }

    public Transition bestTransitionFor(int i2, float f2, float f3, MotionEvent motionEvent) {
    }

    public void disableAutoTransition(boolean z) {
    }

    public int gatPathMotionArc() {
    }

    public ConstraintSet getConstraintSet(Context context, String str) {
    }

    public int[] getConstraintSetIds() {
    }

    public ArrayList<Transition> getDefinedTransitions() {
    }

    public int getDuration() {
    }

    public int getEndId() {
    }

    public Interpolator getInterpolator() {
    }

    public Key getKeyFrame(Context context, int i2, int i3, int i4) {
    }

    public void getKeyFrames(MotionController motionController) {
    }

    public float getMaxAcceleration() {
    }

    public float getMaxVelocity() {
    }

    public boolean getMoveWhenScrollAtTop() {
    }

    public float getPathPercent(View view, int i2) {
    }

    public float getProgressDirection(float f2, float f3) {
    }

    public float getStaggered() {
    }

    public int getStartId() {
    }

    public Transition getTransitionById(int i2) {
    }

    public int getTransitionDirection(int i2) {
    }

    public List<Transition> getTransitionsWithState(int i2) {
    }

    public boolean hasKeyFramePosition(View view, int i2) {
    }

    public int lookUpConstraintId(String str) {
    }

    public String lookUpConstraintName(int i2) {
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    public void processScrollMove(float f2, float f3) {
    }

    public void processScrollUp(float f2, float f3) {
    }

    public void processTouchEvent(MotionEvent motionEvent, int i2, MotionLayout motionLayout) {
    }

    public void readFallback(MotionLayout motionLayout) {
    }

    public void removeTransition(Transition transition) {
    }

    public void setConstraintSet(int i2, ConstraintSet constraintSet) {
    }

    public void setDuration(int i2) {
    }

    public void setKeyframe(View view, int i2, String str, Object obj) {
    }

    public void setRtl(boolean z) {
    }

    public void setTransition(int i2, int i3) {
    }

    public void setupTouch() {
    }

    public boolean supportTouch() {
    }

    public boolean validateLayout(MotionLayout motionLayout) {
    }

    public ConstraintSet getConstraintSet(int i2) {
    }

    public ConstraintSet getConstraintSet(int i2, int i3, int i4) {
    }

    public MotionScene(Context context, MotionLayout motionLayout, int i2) {
    }

    public void setTransition(Transition transition) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Transition {
        public static final int AUTO_ANIMATE_TO_END = 4;
        public static final int AUTO_ANIMATE_TO_START = 3;
        public static final int AUTO_JUMP_TO_END = 2;
        public static final int AUTO_JUMP_TO_START = 1;
        public static final int AUTO_NONE = 0;
        public static final int TRANSITION_FLAG_FIRST_DRAW = 1;
        private int mAutoTransition;
        private int mConstraintSetEnd;
        private int mConstraintSetStart;
        private int mDefaultInterpolator;
        private int mDefaultInterpolatorID;
        private String mDefaultInterpolatorString;
        private boolean mDisable;
        private int mDuration;
        private int mId;
        private boolean mIsAbstract;
        private ArrayList<KeyFrames> mKeyFramesList;
        private int mLayoutDuringTransition;
        private final MotionScene mMotionScene;
        private ArrayList<TransitionOnClick> mOnClicks;
        private int mPathMotionArc;
        private float mStagger;
        private TouchResponse mTouchResponse;
        private int mTransitionFlags;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public static class TransitionOnClick implements View.OnClickListener {
            public static final int ANIM_TOGGLE = 17;
            public static final int ANIM_TO_END = 1;
            public static final int ANIM_TO_START = 16;
            public static final int JUMP_TO_END = 256;
            public static final int JUMP_TO_START = 4096;
            public int mMode;
            public int mTargetId;
            private final Transition mTransition;

            public TransitionOnClick(Context context, Transition transition, XmlPullParser xmlPullParser) {
            }

            public void addOnClickListeners(MotionLayout motionLayout, int i2, Transition transition) {
            }

            public boolean isTransitionViable(Transition transition, MotionLayout motionLayout) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }

            public void removeOnClickListeners(MotionLayout motionLayout) {
            }
        }

        public Transition(MotionScene motionScene, Transition transition) {
        }

        public static /* synthetic */ int access$000(Transition transition) {
        }

        public static /* synthetic */ int access$002(Transition transition, int i2) {
        }

        public static /* synthetic */ int access$100(Transition transition) {
        }

        public static /* synthetic */ int access$102(Transition transition, int i2) {
        }

        public static /* synthetic */ boolean access$1200(Transition transition) {
        }

        public static /* synthetic */ ArrayList access$1300(Transition transition) {
        }

        public static /* synthetic */ int access$1400(Transition transition) {
        }

        public static /* synthetic */ String access$1500(Transition transition) {
        }

        public static /* synthetic */ int access$1600(Transition transition) {
        }

        public static /* synthetic */ int access$1700(Transition transition) {
        }

        public static /* synthetic */ int access$1800(Transition transition) {
        }

        public static /* synthetic */ float access$1900(Transition transition) {
        }

        public static /* synthetic */ TouchResponse access$200(Transition transition) {
        }

        public static /* synthetic */ TouchResponse access$202(Transition transition, TouchResponse touchResponse) {
        }

        public static /* synthetic */ int access$300(Transition transition) {
        }

        public static /* synthetic */ ArrayList access$400(Transition transition) {
        }

        public static /* synthetic */ boolean access$500(Transition transition) {
        }

        public static /* synthetic */ int access$600(Transition transition) {
        }

        public static /* synthetic */ MotionScene access$700(Transition transition) {
        }

        private void fill(MotionScene motionScene, Context context, TypedArray typedArray) {
        }

        private void fillFromAttributeList(MotionScene motionScene, Context context, AttributeSet attributeSet) {
        }

        public void addOnClick(Context context, XmlPullParser xmlPullParser) {
        }

        public String debugString(Context context) {
        }

        public int getAutoTransition() {
        }

        public int getDuration() {
        }

        public int getEndConstraintSetId() {
        }

        public int getId() {
        }

        public List<KeyFrames> getKeyFrameList() {
        }

        public int getLayoutDuringTransition() {
        }

        public List<TransitionOnClick> getOnClickList() {
        }

        public int getPathMotionArc() {
        }

        public float getStagger() {
        }

        public int getStartConstraintSetId() {
        }

        public TouchResponse getTouchResponse() {
        }

        public boolean isEnabled() {
        }

        public boolean isTransitionFlag(int i2) {
        }

        public void setAutoTransition(int i2) {
        }

        public void setDuration(int i2) {
        }

        public void setEnable(boolean z) {
        }

        public void setPathMotionArc(int i2) {
        }

        public void setStagger(float f2) {
        }

        public Transition(int i2, MotionScene motionScene, int i3, int i4) {
        }

        public Transition(MotionScene motionScene, Context context, XmlPullParser xmlPullParser) {
        }
    }
}
