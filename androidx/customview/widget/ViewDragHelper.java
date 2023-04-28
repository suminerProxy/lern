package androidx.customview.widget;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ViewDragHelper {
    private static final int BASE_SETTLE_DURATION = 256;
    public static final int DIRECTION_ALL = 3;
    public static final int DIRECTION_HORIZONTAL = 1;
    public static final int DIRECTION_VERTICAL = 2;
    public static final int EDGE_ALL = 15;
    public static final int EDGE_BOTTOM = 8;
    public static final int EDGE_LEFT = 1;
    public static final int EDGE_RIGHT = 2;
    private static final int EDGE_SIZE = 20;
    public static final int EDGE_TOP = 4;
    public static final int INVALID_POINTER = -1;
    private static final int MAX_SETTLE_DURATION = 600;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    private static final String TAG = "ViewDragHelper";
    private static final Interpolator sInterpolator = null;
    private int mActivePointerId;
    private final Callback mCallback;
    private View mCapturedView;
    private int mDragState;
    private int[] mEdgeDragsInProgress;
    private int[] mEdgeDragsLocked;
    private int mEdgeSize;
    private int[] mInitialEdgesTouched;
    private float[] mInitialMotionX;
    private float[] mInitialMotionY;
    private float[] mLastMotionX;
    private float[] mLastMotionY;
    private float mMaxVelocity;
    private float mMinVelocity;
    private final ViewGroup mParentView;
    private int mPointersDown;
    private boolean mReleaseInProgress;
    private OverScroller mScroller;
    private final Runnable mSetIdleRunnable;
    private int mTouchSlop;
    private int mTrackingEdges;
    private VelocityTracker mVelocityTracker;

    /* renamed from: androidx.customview.widget.ViewDragHelper$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass1 implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
        }
    }

    /* renamed from: androidx.customview.widget.ViewDragHelper$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements Runnable {
        public final /* synthetic */ ViewDragHelper this$0;

        public AnonymousClass2(ViewDragHelper viewDragHelper) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static abstract class Callback {
        public int clampViewPositionHorizontal(@NonNull View view, int i2, int i3) {
        }

        public int clampViewPositionVertical(@NonNull View view, int i2, int i3) {
        }

        public int getOrderedChildIndex(int i2) {
        }

        public int getViewHorizontalDragRange(@NonNull View view) {
        }

        public int getViewVerticalDragRange(@NonNull View view) {
        }

        public void onEdgeDragStarted(int i2, int i3) {
        }

        public boolean onEdgeLock(int i2) {
        }

        public void onEdgeTouched(int i2, int i3) {
        }

        public void onViewCaptured(@NonNull View view, int i2) {
        }

        public void onViewDragStateChanged(int i2) {
        }

        public void onViewPositionChanged(@NonNull View view, int i2, int i3, @Px int i4, @Px int i5) {
        }

        public void onViewReleased(@NonNull View view, float f2, float f3) {
        }

        public abstract boolean tryCaptureView(@NonNull View view, int i2);
    }

    private ViewDragHelper(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull Callback callback) {
    }

    private boolean checkNewEdgeDrag(float f2, float f3, int i2, int i3) {
    }

    private boolean checkTouchSlop(View view, float f2, float f3) {
    }

    private int clampMag(int i2, int i3, int i4) {
    }

    private void clearMotionHistory() {
    }

    private int computeAxisDuration(int i2, int i3, int i4) {
    }

    private int computeSettleDuration(View view, int i2, int i3, int i4, int i5) {
    }

    public static ViewDragHelper create(@NonNull ViewGroup viewGroup, @NonNull Callback callback) {
    }

    private void dispatchViewReleased(float f2, float f3) {
    }

    private float distanceInfluenceForSnapDuration(float f2) {
    }

    private void dragTo(int i2, int i3, int i4, int i5) {
    }

    private void ensureMotionHistorySizeForId(int i2) {
    }

    private boolean forceSettleCapturedViewAt(int i2, int i3, int i4, int i5) {
    }

    private int getEdgesTouched(int i2, int i3) {
    }

    private boolean isValidPointerForActionMove(int i2) {
    }

    private void releaseViewForPointerUp() {
    }

    private void reportNewEdgeDrags(float f2, float f3, int i2) {
    }

    private void saveInitialMotion(float f2, float f3, int i2) {
    }

    private void saveLastMotion(MotionEvent motionEvent) {
    }

    public void abort() {
    }

    public boolean canScroll(@NonNull View view, boolean z, int i2, int i3, int i4, int i5) {
    }

    public void cancel() {
    }

    public void captureChildView(@NonNull View view, int i2) {
    }

    public boolean continueSettling(boolean z) {
    }

    @Nullable
    public View findTopChildUnder(int i2, int i3) {
    }

    public void flingCapturedView(int i2, int i3, int i4, int i5) {
    }

    public int getActivePointerId() {
    }

    @Nullable
    public View getCapturedView() {
    }

    @Px
    public int getEdgeSize() {
    }

    public float getMinVelocity() {
    }

    @Px
    public int getTouchSlop() {
    }

    public int getViewDragState() {
    }

    public boolean isCapturedViewUnder(int i2, int i3) {
    }

    public boolean isEdgeTouched(int i2) {
    }

    public boolean isPointerDown(int i2) {
    }

    public boolean isViewUnder(@Nullable View view, int i2, int i3) {
    }

    public void processTouchEvent(@NonNull MotionEvent motionEvent) {
    }

    public void setDragState(int i2) {
    }

    public void setEdgeTrackingEnabled(int i2) {
    }

    public void setMinVelocity(float f2) {
    }

    public boolean settleCapturedViewAt(int i2, int i3) {
    }

    public boolean shouldInterceptTouchEvent(@NonNull MotionEvent motionEvent) {
    }

    public boolean smoothSlideViewTo(@NonNull View view, int i2, int i3) {
    }

    public boolean tryCaptureViewForDrag(View view, int i2) {
    }

    private float clampMag(float f2, float f3, float f4) {
    }

    public static ViewDragHelper create(@NonNull ViewGroup viewGroup, float f2, @NonNull Callback callback) {
    }

    public boolean isEdgeTouched(int i2, int i3) {
    }

    public boolean checkTouchSlop(int i2) {
    }

    public boolean checkTouchSlop(int i2, int i3) {
    }

    private void clearMotionHistory(int i2) {
    }
}
