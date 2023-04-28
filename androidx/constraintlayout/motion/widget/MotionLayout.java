package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.motion.utils.StopLogic;
import androidx.constraintlayout.motion.widget.MotionScene;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.view.NestedScrollingParent3;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class MotionLayout extends ConstraintLayout implements NestedScrollingParent3 {
    private static final boolean DEBUG = false;
    public static final int DEBUG_SHOW_NONE = 0;
    public static final int DEBUG_SHOW_PATH = 2;
    public static final int DEBUG_SHOW_PROGRESS = 1;
    private static final float EPSILON = 1.0E-5f;
    public static boolean IS_IN_EDIT_MODE = false;
    public static final int MAX_KEY_FRAMES = 50;
    public static final String TAG = "MotionLayout";
    public static final int TOUCH_UP_COMPLETE = 0;
    public static final int TOUCH_UP_COMPLETE_TO_END = 2;
    public static final int TOUCH_UP_COMPLETE_TO_START = 1;
    public static final int TOUCH_UP_DECELERATE = 4;
    public static final int TOUCH_UP_DECELERATE_AND_COMPLETE = 5;
    public static final int TOUCH_UP_STOP = 3;
    public static final int VELOCITY_LAYOUT = 1;
    public static final int VELOCITY_POST_LAYOUT = 0;
    public static final int VELOCITY_STATIC_LAYOUT = 3;
    public static final int VELOCITY_STATIC_POST_LAYOUT = 2;
    public boolean firstDown;
    private float lastPos;
    private float lastY;
    private long mAnimationStartTime;
    private int mBeginState;
    private RectF mBoundsCheck;
    public int mCurrentState;
    public int mDebugPath;
    private DecelerateInterpolator mDecelerateLogic;
    private DesignTool mDesignTool;
    public DevModeDraw mDevModeDraw;
    private int mEndState;
    public int mEndWrapHeight;
    public int mEndWrapWidth;
    public HashMap<View, MotionController> mFrameArrayList;
    private int mFrames;
    public int mHeightMeasureMode;
    private boolean mInLayout;
    public boolean mInTransition;
    public boolean mIndirectTransition;
    private boolean mInteractionEnabled;
    public Interpolator mInterpolator;
    public boolean mIsAnimating;
    private boolean mKeepAnimating;
    private KeyCache mKeyCache;
    private long mLastDrawTime;
    private float mLastFps;
    private int mLastHeightMeasureSpec;
    public int mLastLayoutHeight;
    public int mLastLayoutWidth;
    public float mLastVelocity;
    private int mLastWidthMeasureSpec;
    private float mListenerPosition;
    private int mListenerState;
    public boolean mMeasureDuringTransition;
    public Model mModel;
    private boolean mNeedsFireTransitionCompleted;
    public int mOldHeight;
    public int mOldWidth;
    private ArrayList<MotionHelper> mOnHideHelpers;
    private ArrayList<MotionHelper> mOnShowHelpers;
    public float mPostInterpolationPosition;
    private View mRegionView;
    public MotionScene mScene;
    public float mScrollTargetDT;
    public float mScrollTargetDX;
    public float mScrollTargetDY;
    public long mScrollTargetTime;
    public int mStartWrapHeight;
    public int mStartWrapWidth;
    private StateCache mStateCache;
    private StopLogic mStopLogic;
    private boolean mTemporalInterpolator;
    public ArrayList<Integer> mTransitionCompleted;
    private float mTransitionDuration;
    public float mTransitionGoalPosition;
    private boolean mTransitionInstantly;
    public float mTransitionLastPosition;
    private long mTransitionLastTime;
    private TransitionListener mTransitionListener;
    private ArrayList<TransitionListener> mTransitionListeners;
    public float mTransitionPosition;
    public TransitionState mTransitionState;
    public boolean mUndergoingMotion;
    public int mWidthMeasureMode;

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ MotionLayout this$0;
        public final /* synthetic */ View val$target;

        public AnonymousClass1(MotionLayout motionLayout, View view) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$motion$widget$MotionLayout$TransitionState = null;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class DecelerateInterpolator extends MotionInterpolator {
        public float currentP;
        public float initalV;
        public float maxA;
        public final /* synthetic */ MotionLayout this$0;

        public DecelerateInterpolator(MotionLayout motionLayout) {
        }

        public void config(float f2, float f3, float f4) {
        }

        @Override // androidx.constraintlayout.motion.widget.MotionInterpolator, android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
        }

        @Override // androidx.constraintlayout.motion.widget.MotionInterpolator
        public float getVelocity() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class DevModeDraw {
        private static final int DEBUG_PATH_TICKS_PER_MS = 16;
        public final int DIAMOND_SIZE;
        public final int GRAPH_COLOR;
        public final int KEYFRAME_COLOR;
        public final int RED_COLOR;
        public final int SHADOW_COLOR;
        public Rect mBounds;
        public DashPathEffect mDashPathEffect;
        public Paint mFillPaint;
        public int mKeyFrameCount;
        public float[] mKeyFramePoints;
        public Paint mPaint;
        public Paint mPaintGraph;
        public Paint mPaintKeyframes;
        public Path mPath;
        public int[] mPathMode;
        public float[] mPoints;
        public boolean mPresentationMode;
        private float[] mRectangle;
        public int mShadowTranslate;
        public Paint mTextPaint;
        public final /* synthetic */ MotionLayout this$0;

        public DevModeDraw(MotionLayout motionLayout) {
        }

        private void drawBasicPath(Canvas canvas) {
        }

        private void drawPathAsConfigured(Canvas canvas) {
        }

        private void drawPathCartesian(Canvas canvas) {
        }

        private void drawPathCartesianTicks(Canvas canvas, float f2, float f3) {
        }

        private void drawPathRelative(Canvas canvas) {
        }

        private void drawPathRelativeTicks(Canvas canvas, float f2, float f3) {
        }

        private void drawPathScreenTicks(Canvas canvas, float f2, float f3, int i2, int i3) {
        }

        private void drawRectangle(Canvas canvas, MotionController motionController) {
        }

        private void drawTicks(Canvas canvas, int i2, int i3, MotionController motionController) {
        }

        private void drawTranslation(Canvas canvas, float f2, float f3, float f4, float f5) {
        }

        public void draw(Canvas canvas, HashMap<View, MotionController> hashMap, int i2, int i3) {
        }

        public void drawAll(Canvas canvas, int i2, int i3, MotionController motionController) {
        }

        public void getTextBounds(String str, Paint paint) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class Model {
        public ConstraintSet mEnd;
        public int mEndId;
        public ConstraintWidgetContainer mLayoutEnd;
        public ConstraintWidgetContainer mLayoutStart;
        public ConstraintSet mStart;
        public int mStartId;
        public final /* synthetic */ MotionLayout this$0;

        public Model(MotionLayout motionLayout) {
        }

        private void debugLayout(String str, ConstraintWidgetContainer constraintWidgetContainer) {
        }

        private void debugLayoutParam(String str, ConstraintLayout.LayoutParams layoutParams) {
        }

        private void debugWidget(String str, ConstraintWidget constraintWidget) {
        }

        private void setupConstraintWidget(ConstraintWidgetContainer constraintWidgetContainer, ConstraintSet constraintSet) {
        }

        public void build() {
        }

        public void copy(ConstraintWidgetContainer constraintWidgetContainer, ConstraintWidgetContainer constraintWidgetContainer2) {
        }

        public ConstraintWidget getWidget(ConstraintWidgetContainer constraintWidgetContainer, View view) {
        }

        public void initFrom(ConstraintWidgetContainer constraintWidgetContainer, ConstraintSet constraintSet, ConstraintSet constraintSet2) {
        }

        public boolean isNotConfiguredWith(int i2, int i3) {
        }

        public void measure(int i2, int i3) {
        }

        public void reEvaluateState() {
        }

        public void setMeasuredId(int i2, int i3) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface MotionTracker {
        void addMovement(MotionEvent motionEvent);

        void clear();

        void computeCurrentVelocity(int i2);

        void computeCurrentVelocity(int i2, float f2);

        float getXVelocity();

        float getXVelocity(int i2);

        float getYVelocity();

        float getYVelocity(int i2);

        void recycle();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class StateCache {
        public final String KeyEndState;
        public final String KeyProgress;
        public final String KeyStartState;
        public final String KeyVelocity;
        public int endState;
        public float mProgress;
        public float mVelocity;
        public int startState;
        public final /* synthetic */ MotionLayout this$0;

        public StateCache(MotionLayout motionLayout) {
        }

        public void apply() {
        }

        public Bundle getTransitionState() {
        }

        public void recordState() {
        }

        public void setEndState(int i2) {
        }

        public void setProgress(float f2) {
        }

        public void setStartState(int i2) {
        }

        public void setTransitionState(Bundle bundle) {
        }

        public void setVelocity(float f2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface TransitionListener {
        void onTransitionChange(MotionLayout motionLayout, int i2, int i3, float f2);

        void onTransitionCompleted(MotionLayout motionLayout, int i2);

        void onTransitionStarted(MotionLayout motionLayout, int i2, int i3);

        void onTransitionTrigger(MotionLayout motionLayout, int i2, boolean z, float f2);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class TransitionState {
        private static final /* synthetic */ TransitionState[] $VALUES = null;
        public static final TransitionState FINISHED = null;
        public static final TransitionState MOVING = null;
        public static final TransitionState SETUP = null;
        public static final TransitionState UNDEFINED = null;

        private TransitionState(String str, int i2) {
        }

        public static TransitionState valueOf(String str) {
        }

        public static TransitionState[] values() {
        }
    }

    public MotionLayout(@NonNull Context context) {
    }

    public static /* synthetic */ int access$000(MotionLayout motionLayout) {
    }

    public static /* synthetic */ int access$100(MotionLayout motionLayout) {
    }

    public static /* synthetic */ int access$1000(MotionLayout motionLayout) {
    }

    public static /* synthetic */ void access$1100(MotionLayout motionLayout) {
    }

    public static /* synthetic */ void access$1200(MotionLayout motionLayout, ConstraintWidgetContainer constraintWidgetContainer, int i2, int i3, int i4) {
    }

    public static /* synthetic */ void access$1300(MotionLayout motionLayout, ConstraintWidgetContainer constraintWidgetContainer, int i2, int i3, int i4) {
    }

    public static /* synthetic */ void access$1400(MotionLayout motionLayout, ConstraintWidgetContainer constraintWidgetContainer, int i2, int i3, int i4) {
    }

    public static /* synthetic */ void access$1500(MotionLayout motionLayout, ConstraintWidgetContainer constraintWidgetContainer, int i2, int i3, int i4) {
    }

    public static /* synthetic */ void access$1600(MotionLayout motionLayout, ConstraintWidgetContainer constraintWidgetContainer, int i2, int i3, int i4) {
    }

    public static /* synthetic */ void access$1700(MotionLayout motionLayout, ConstraintWidgetContainer constraintWidgetContainer, int i2, int i3, int i4) {
    }

    public static /* synthetic */ void access$1800(MotionLayout motionLayout, ConstraintWidgetContainer constraintWidgetContainer, int i2, int i3, int i4) {
    }

    public static /* synthetic */ void access$1900(MotionLayout motionLayout, ConstraintWidgetContainer constraintWidgetContainer, int i2, int i3, int i4) {
    }

    public static /* synthetic */ ConstraintWidgetContainer access$200(MotionLayout motionLayout) {
    }

    public static /* synthetic */ void access$2000(MotionLayout motionLayout, int i2, int i3, int i4, int i5, boolean z, boolean z2) {
    }

    public static /* synthetic */ ConstraintWidgetContainer access$300(MotionLayout motionLayout) {
    }

    public static /* synthetic */ ConstraintWidgetContainer access$400(MotionLayout motionLayout) {
    }

    public static /* synthetic */ ConstraintWidgetContainer access$500(MotionLayout motionLayout) {
    }

    public static /* synthetic */ boolean access$600(MotionLayout motionLayout) {
    }

    public static /* synthetic */ boolean access$700(MotionLayout motionLayout) {
    }

    public static /* synthetic */ void access$800(MotionLayout motionLayout, boolean z, View view, ConstraintWidget constraintWidget, ConstraintLayout.LayoutParams layoutParams, SparseArray sparseArray) {
    }

    public static /* synthetic */ int access$900(MotionLayout motionLayout) {
    }

    private void checkStructure() {
    }

    private void computeCurrentPositions() {
    }

    private void debugPos() {
    }

    private void evaluateLayout() {
    }

    private void fireTransitionChange() {
    }

    private void fireTransitionStarted(MotionLayout motionLayout, int i2, int i3) {
    }

    private boolean handlesTouchEvent(float f2, float f3, View view, MotionEvent motionEvent) {
    }

    private void init(AttributeSet attributeSet) {
    }

    private void processTransitionCompleted() {
    }

    private void setupMotionViews() {
    }

    private static boolean willJump(float f2, float f3, float f4) {
    }

    public void addTransitionListener(TransitionListener transitionListener) {
    }

    public void animateTo(float f2) {
    }

    public void disableAutoTransition(boolean z) {
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    public void enableTransition(int i2, boolean z) {
    }

    public void evaluate(boolean z) {
    }

    public void fireTransitionCompleted() {
    }

    public void fireTrigger(int i2, boolean z, float f2) {
    }

    public void getAnchorDpDt(int i2, float f2, float f3, float f4, float[] fArr) {
    }

    public ConstraintSet getConstraintSet(int i2) {
    }

    public int[] getConstraintSetIds() {
    }

    public String getConstraintSetNames(int i2) {
    }

    public int getCurrentState() {
    }

    public void getDebugMode(boolean z) {
    }

    public ArrayList<MotionScene.Transition> getDefinedTransitions() {
    }

    public DesignTool getDesignTool() {
    }

    public int getEndState() {
    }

    public long getNanoTime() {
    }

    public float getProgress() {
    }

    public int getStartState() {
    }

    public float getTargetPosition() {
    }

    public MotionScene.Transition getTransition(int i2) {
    }

    public Bundle getTransitionState() {
    }

    public long getTransitionTimeMs() {
    }

    public float getVelocity() {
    }

    public void getViewVelocity(View view, float f2, float f3, float[] fArr, int i2) {
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
    }

    public boolean isInteractionEnabled() {
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void loadLayoutDescription(int i2) {
    }

    public int lookUpConstraintId(String str) {
    }

    public MotionTracker obtainVelocityTracker() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View view, float f2, float f3) {
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr, int i4) {
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5, int i6) {
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(View view, View view2, int i2, int i3) {
    }

    public void onNewStateAttachHandlers() {
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i2) {
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(View view, View view2, int i2, int i3) {
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(View view, int i2) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void parseLayoutDescription(int i2) {
    }

    @Deprecated
    public void rebuildMotion() {
    }

    public void rebuildScene() {
    }

    public boolean removeTransitionListener(TransitionListener transitionListener) {
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
    }

    public void setDebugMode(int i2) {
    }

    public void setInteractionEnabled(boolean z) {
    }

    public void setInterpolatedProgress(float f2) {
    }

    public void setOnHide(float f2) {
    }

    public void setOnShow(float f2) {
    }

    public void setProgress(float f2, float f3) {
    }

    public void setScene(MotionScene motionScene) {
    }

    public void setState(TransitionState transitionState) {
    }

    public void setTransition(int i2, int i3) {
    }

    public void setTransitionDuration(int i2) {
    }

    public void setTransitionListener(TransitionListener transitionListener) {
    }

    public void setTransitionState(Bundle bundle) {
    }

    @Override // android.view.View
    public String toString() {
    }

    public void touchAnimateTo(int i2, float f2, float f3) {
    }

    public void transitionToEnd() {
    }

    public void transitionToStart() {
    }

    public void transitionToState(int i2) {
    }

    public void updateState(int i2, ConstraintSet constraintSet) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class MyTracker implements MotionTracker {
        private static MyTracker me;
        public VelocityTracker tracker;

        private MyTracker() {
        }

        public static MyTracker obtain() {
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public void addMovement(MotionEvent motionEvent) {
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public void clear() {
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public void computeCurrentVelocity(int i2) {
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public float getXVelocity() {
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public float getYVelocity() {
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public void recycle() {
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public void computeCurrentVelocity(int i2, float f2) {
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public float getXVelocity(int i2) {
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public float getYVelocity(int i2) {
        }
    }

    public void transitionToState(int i2, int i3, int i4) {
    }

    public void updateState() {
    }

    public void setProgress(float f2) {
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void setState(int i2, int i3, int i4) {
    }

    public void setTransition(int i2) {
    }

    private void checkStructure(int i2, ConstraintSet constraintSet) {
    }

    public void setTransition(MotionScene.Transition transition) {
    }

    private void checkStructure(MotionScene.Transition transition) {
    }

    public MotionLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public MotionLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
