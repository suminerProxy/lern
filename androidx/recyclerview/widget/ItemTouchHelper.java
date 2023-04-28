package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.GestureDetectorCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ItemTouchHelper extends RecyclerView.ItemDecoration implements RecyclerView.OnChildAttachStateChangeListener {
    public static final int ACTION_MODE_DRAG_MASK = 16711680;
    private static final int ACTION_MODE_IDLE_MASK = 255;
    public static final int ACTION_MODE_SWIPE_MASK = 65280;
    public static final int ACTION_STATE_DRAG = 2;
    public static final int ACTION_STATE_IDLE = 0;
    public static final int ACTION_STATE_SWIPE = 1;
    private static final int ACTIVE_POINTER_ID_NONE = -1;
    public static final int ANIMATION_TYPE_DRAG = 8;
    public static final int ANIMATION_TYPE_SWIPE_CANCEL = 4;
    public static final int ANIMATION_TYPE_SWIPE_SUCCESS = 2;
    private static final boolean DEBUG = false;
    public static final int DIRECTION_FLAG_COUNT = 8;
    public static final int DOWN = 2;
    public static final int END = 32;
    public static final int LEFT = 4;
    private static final int PIXELS_PER_SECOND = 1000;
    public static final int RIGHT = 8;
    public static final int START = 16;
    private static final String TAG = "ItemTouchHelper";
    public static final int UP = 1;
    private int mActionState;
    public int mActivePointerId;
    @NonNull
    public Callback mCallback;
    private RecyclerView.ChildDrawingOrderCallback mChildDrawingOrderCallback;
    private List<Integer> mDistances;
    private long mDragScrollStartTimeInMs;
    public float mDx;
    public float mDy;
    public GestureDetectorCompat mGestureDetector;
    public float mInitialTouchX;
    public float mInitialTouchY;
    private ItemTouchHelperGestureListener mItemTouchHelperGestureListener;
    private float mMaxSwipeVelocity;
    private final RecyclerView.OnItemTouchListener mOnItemTouchListener;
    public View mOverdrawChild;
    public int mOverdrawChildPosition;
    public final List<View> mPendingCleanup;
    @VisibleForTesting
    public List<RecoverAnimation> mRecoverAnimations;
    public RecyclerView mRecyclerView;
    public final Runnable mScrollRunnable;
    public RecyclerView.ViewHolder mSelected;
    public int mSelectedFlags;
    private float mSelectedStartX;
    private float mSelectedStartY;
    private int mSlop;
    private List<RecyclerView.ViewHolder> mSwapTargets;
    private float mSwipeEscapeVelocity;
    private final float[] mTmpPosition;
    private Rect mTmpRect;
    public VelocityTracker mVelocityTracker;

    /* renamed from: androidx.recyclerview.widget.ItemTouchHelper$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ ItemTouchHelper this$0;

        public AnonymousClass1(ItemTouchHelper itemTouchHelper) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: androidx.recyclerview.widget.ItemTouchHelper$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements RecyclerView.OnItemTouchListener {
        public final /* synthetic */ ItemTouchHelper this$0;

        public AnonymousClass2(ItemTouchHelper itemTouchHelper) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public boolean onInterceptTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public void onRequestDisallowInterceptTouchEvent(boolean z) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public void onTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.ItemTouchHelper$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass3 extends RecoverAnimation {
        public final /* synthetic */ ItemTouchHelper this$0;
        public final /* synthetic */ RecyclerView.ViewHolder val$prevSelected;
        public final /* synthetic */ int val$swipeDir;

        public AnonymousClass3(ItemTouchHelper itemTouchHelper, RecyclerView.ViewHolder viewHolder, int i2, int i3, float f2, float f3, float f4, float f5, int i4, RecyclerView.ViewHolder viewHolder2) {
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.ItemTouchHelper$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass4 implements Runnable {
        public final /* synthetic */ ItemTouchHelper this$0;
        public final /* synthetic */ RecoverAnimation val$anim;
        public final /* synthetic */ int val$swipeDir;

        public AnonymousClass4(ItemTouchHelper itemTouchHelper, RecoverAnimation recoverAnimation, int i2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: androidx.recyclerview.widget.ItemTouchHelper$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass5 implements RecyclerView.ChildDrawingOrderCallback {
        public final /* synthetic */ ItemTouchHelper this$0;

        public AnonymousClass5(ItemTouchHelper itemTouchHelper) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ChildDrawingOrderCallback
        public int onGetChildDrawingOrder(int i2, int i3) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static abstract class Callback {
        private static final int ABS_HORIZONTAL_DIR_FLAGS = 789516;
        public static final int DEFAULT_DRAG_ANIMATION_DURATION = 200;
        public static final int DEFAULT_SWIPE_ANIMATION_DURATION = 250;
        private static final long DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS = 2000;
        public static final int RELATIVE_DIR_FLAGS = 3158064;
        private static final Interpolator sDragScrollInterpolator = null;
        private static final Interpolator sDragViewScrollCapInterpolator = null;
        private int mCachedMaxScrollSpeed;

        /* renamed from: androidx.recyclerview.widget.ItemTouchHelper$Callback$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass1 implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f2) {
            }
        }

        /* renamed from: androidx.recyclerview.widget.ItemTouchHelper$Callback$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass2 implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f2) {
            }
        }

        public static int convertToRelativeDirection(int i2, int i3) {
        }

        @NonNull
        public static ItemTouchUIUtil getDefaultUIUtil() {
        }

        private int getMaxDragScroll(RecyclerView recyclerView) {
        }

        public static int makeFlag(int i2, int i3) {
        }

        public static int makeMovementFlags(int i2, int i3) {
        }

        public boolean canDropOver(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder viewHolder2) {
        }

        public RecyclerView.ViewHolder chooseDropTarget(@NonNull RecyclerView.ViewHolder viewHolder, @NonNull List<RecyclerView.ViewHolder> list, int i2, int i3) {
        }

        public void clearView(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder) {
        }

        public int convertToAbsoluteDirection(int i2, int i3) {
        }

        public final int getAbsoluteMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        }

        public long getAnimationDuration(@NonNull RecyclerView recyclerView, int i2, float f2, float f3) {
        }

        public int getBoundingBoxMargin() {
        }

        public float getMoveThreshold(@NonNull RecyclerView.ViewHolder viewHolder) {
        }

        public abstract int getMovementFlags(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder);

        public float getSwipeEscapeVelocity(float f2) {
        }

        public float getSwipeThreshold(@NonNull RecyclerView.ViewHolder viewHolder) {
        }

        public float getSwipeVelocityThreshold(float f2) {
        }

        public boolean hasDragFlag(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        }

        public boolean hasSwipeFlag(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        }

        public int interpolateOutOfBoundsScroll(@NonNull RecyclerView recyclerView, int i2, int i3, int i4, long j2) {
        }

        public boolean isItemViewSwipeEnabled() {
        }

        public boolean isLongPressDragEnabled() {
        }

        public void onChildDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, float f2, float f3, int i2, boolean z) {
        }

        public void onChildDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f2, float f3, int i2, boolean z) {
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, List<RecoverAnimation> list, int i2, float f2, float f3) {
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, List<RecoverAnimation> list, int i2, float f2, float f3) {
        }

        public abstract boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder viewHolder2);

        public void onMoved(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, int i2, @NonNull RecyclerView.ViewHolder viewHolder2, int i3, int i4, int i5) {
        }

        public void onSelectedChanged(@Nullable RecyclerView.ViewHolder viewHolder, int i2) {
        }

        public abstract void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int i2);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class ItemTouchHelperGestureListener extends GestureDetector.SimpleOnGestureListener {
        private boolean mShouldReactToLongPress;
        public final /* synthetic */ ItemTouchHelper this$0;

        public ItemTouchHelperGestureListener(ItemTouchHelper itemTouchHelper) {
        }

        public void doNotReactToLongPress() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
        }
    }

    @VisibleForTesting
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class RecoverAnimation implements Animator.AnimatorListener {
        public final int mActionState;
        public final int mAnimationType;
        public boolean mEnded;
        private float mFraction;
        public boolean mIsPendingCleanup;
        public boolean mOverridden;
        public final float mStartDx;
        public final float mStartDy;
        public final float mTargetX;
        public final float mTargetY;
        @VisibleForTesting
        public final ValueAnimator mValueAnimator;
        public final RecyclerView.ViewHolder mViewHolder;
        public float mX;
        public float mY;

        /* renamed from: androidx.recyclerview.widget.ItemTouchHelper$RecoverAnimation$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass1 implements ValueAnimator.AnimatorUpdateListener {
            public final /* synthetic */ RecoverAnimation this$0;

            public AnonymousClass1(RecoverAnimation recoverAnimation) {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
            }
        }

        public RecoverAnimation(RecyclerView.ViewHolder viewHolder, int i2, int i3, float f2, float f3, float f4, float f5) {
        }

        public void cancel() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        public void setDuration(long j2) {
        }

        public void setFraction(float f2) {
        }

        public void start() {
        }

        public void update() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static abstract class SimpleCallback extends Callback {
        private int mDefaultDragDirs;
        private int mDefaultSwipeDirs;

        public SimpleCallback(int i2, int i3) {
        }

        public int getDragDirs(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder) {
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public int getMovementFlags(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder) {
        }

        public int getSwipeDirs(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder) {
        }

        public void setDefaultDragDirs(int i2) {
        }

        public void setDefaultSwipeDirs(int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface ViewDropHandler {
        void prepareForDrop(@NonNull View view, @NonNull View view2, int i2, int i3);
    }

    public ItemTouchHelper(@NonNull Callback callback) {
    }

    private void addChildDrawingOrderCallback() {
    }

    private int checkHorizontalSwipe(RecyclerView.ViewHolder viewHolder, int i2) {
    }

    private int checkVerticalSwipe(RecyclerView.ViewHolder viewHolder, int i2) {
    }

    private void destroyCallbacks() {
    }

    private List<RecyclerView.ViewHolder> findSwapTargets(RecyclerView.ViewHolder viewHolder) {
    }

    private RecyclerView.ViewHolder findSwipedView(MotionEvent motionEvent) {
    }

    private void getSelectedDxDy(float[] fArr) {
    }

    private static boolean hitTest(View view, float f2, float f3, float f4, float f5) {
    }

    private void releaseVelocityTracker() {
    }

    private void setupCallbacks() {
    }

    private void startGestureDetection() {
    }

    private void stopGestureDetection() {
    }

    private int swipeIfNecessary(RecyclerView.ViewHolder viewHolder) {
    }

    public void attachToRecyclerView(@Nullable RecyclerView recyclerView) {
    }

    public void checkSelectForSwipe(int i2, MotionEvent motionEvent, int i3) {
    }

    public void endRecoverAnimation(RecyclerView.ViewHolder viewHolder, boolean z) {
    }

    public RecoverAnimation findAnimation(MotionEvent motionEvent) {
    }

    public View findChildView(MotionEvent motionEvent) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
    }

    public boolean hasRunningRecoverAnim() {
    }

    public void moveIfNecessary(RecyclerView.ViewHolder viewHolder) {
    }

    public void obtainVelocityTracker() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public void onChildViewAttachedToWindow(@NonNull View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public void onChildViewDetachedFromWindow(@NonNull View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
    }

    public void postDispatchSwipe(RecoverAnimation recoverAnimation, int i2) {
    }

    public void removeChildDrawingOrderCallbackIfNecessary(View view) {
    }

    public boolean scrollIfNecessary() {
    }

    public void select(@Nullable RecyclerView.ViewHolder viewHolder, int i2) {
    }

    public void startDrag(@NonNull RecyclerView.ViewHolder viewHolder) {
    }

    public void startSwipe(@NonNull RecyclerView.ViewHolder viewHolder) {
    }

    public void updateDxDy(MotionEvent motionEvent, int i2, int i3) {
    }
}
