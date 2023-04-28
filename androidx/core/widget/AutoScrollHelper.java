package androidx.core.widget;

import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class AutoScrollHelper implements View.OnTouchListener {
    private static final int DEFAULT_ACTIVATION_DELAY = 0;
    private static final int DEFAULT_EDGE_TYPE = 1;
    private static final float DEFAULT_MAXIMUM_EDGE = Float.MAX_VALUE;
    private static final int DEFAULT_MAXIMUM_VELOCITY_DIPS = 1575;
    private static final int DEFAULT_MINIMUM_VELOCITY_DIPS = 315;
    private static final int DEFAULT_RAMP_DOWN_DURATION = 500;
    private static final int DEFAULT_RAMP_UP_DURATION = 500;
    private static final float DEFAULT_RELATIVE_EDGE = 0.2f;
    private static final float DEFAULT_RELATIVE_VELOCITY = 1.0f;
    public static final int EDGE_TYPE_INSIDE = 0;
    public static final int EDGE_TYPE_INSIDE_EXTEND = 1;
    public static final int EDGE_TYPE_OUTSIDE = 2;
    private static final int HORIZONTAL = 0;
    public static final float NO_MAX = Float.MAX_VALUE;
    public static final float NO_MIN = 0.0f;
    public static final float RELATIVE_UNSPECIFIED = 0.0f;
    private static final int VERTICAL = 1;
    private int mActivationDelay;
    private boolean mAlreadyDelayed;
    public boolean mAnimating;
    private final Interpolator mEdgeInterpolator;
    private int mEdgeType;
    private boolean mEnabled;
    private boolean mExclusive;
    private float[] mMaximumEdges;
    private float[] mMaximumVelocity;
    private float[] mMinimumVelocity;
    public boolean mNeedsCancel;
    public boolean mNeedsReset;
    private float[] mRelativeEdges;
    private float[] mRelativeVelocity;
    private Runnable mRunnable;
    public final ClampedScroller mScroller;
    public final View mTarget;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class ClampedScroller {
        private long mDeltaTime;
        private int mDeltaX;
        private int mDeltaY;
        private int mEffectiveRampDown;
        private int mRampDownDuration;
        private int mRampUpDuration;
        private long mStartTime;
        private long mStopTime;
        private float mStopValue;
        private float mTargetVelocityX;
        private float mTargetVelocityY;

        private float getValueAt(long j2) {
        }

        private float interpolateValue(float f2) {
        }

        public void computeScrollDelta() {
        }

        public int getDeltaX() {
        }

        public int getDeltaY() {
        }

        public int getHorizontalDirection() {
        }

        public int getVerticalDirection() {
        }

        public boolean isFinished() {
        }

        public void requestStop() {
        }

        public void setRampDownDuration(int i2) {
        }

        public void setRampUpDuration(int i2) {
        }

        public void setTargetVelocity(float f2, float f3) {
        }

        public void start() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class ScrollAnimationRunnable implements Runnable {
        public final /* synthetic */ AutoScrollHelper this$0;

        public ScrollAnimationRunnable(AutoScrollHelper autoScrollHelper) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public AutoScrollHelper(@NonNull View view) {
    }

    private float computeTargetVelocity(int i2, float f2, float f3, float f4) {
    }

    public static float constrain(float f2, float f3, float f4) {
    }

    public static int constrain(int i2, int i3, int i4) {
    }

    private float constrainEdgeValue(float f2, float f3) {
    }

    private float getEdgeValue(float f2, float f3, float f4, float f5) {
    }

    private void requestStop() {
    }

    private void startAnimating() {
    }

    public abstract boolean canTargetScrollHorizontally(int i2);

    public abstract boolean canTargetScrollVertically(int i2);

    public void cancelTargetTouch() {
    }

    public boolean isEnabled() {
    }

    public boolean isExclusive() {
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
    }

    public abstract void scrollTargetBy(int i2, int i3);

    @NonNull
    public AutoScrollHelper setActivationDelay(int i2) {
    }

    @NonNull
    public AutoScrollHelper setEdgeType(int i2) {
    }

    public AutoScrollHelper setEnabled(boolean z) {
    }

    public AutoScrollHelper setExclusive(boolean z) {
    }

    @NonNull
    public AutoScrollHelper setMaximumEdges(float f2, float f3) {
    }

    @NonNull
    public AutoScrollHelper setMaximumVelocity(float f2, float f3) {
    }

    @NonNull
    public AutoScrollHelper setMinimumVelocity(float f2, float f3) {
    }

    @NonNull
    public AutoScrollHelper setRampDownDuration(int i2) {
    }

    @NonNull
    public AutoScrollHelper setRampUpDuration(int i2) {
    }

    @NonNull
    public AutoScrollHelper setRelativeEdges(float f2, float f3) {
    }

    @NonNull
    public AutoScrollHelper setRelativeVelocity(float f2, float f3) {
    }

    public boolean shouldAnimate() {
    }
}
