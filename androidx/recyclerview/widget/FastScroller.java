package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.recyclerview.widget.RecyclerView;

@VisibleForTesting
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class FastScroller extends RecyclerView.ItemDecoration implements RecyclerView.OnItemTouchListener {
    private static final int ANIMATION_STATE_FADING_IN = 1;
    private static final int ANIMATION_STATE_FADING_OUT = 3;
    private static final int ANIMATION_STATE_IN = 2;
    private static final int ANIMATION_STATE_OUT = 0;
    private static final int DRAG_NONE = 0;
    private static final int DRAG_X = 1;
    private static final int DRAG_Y = 2;
    private static final int[] EMPTY_STATE_SET = null;
    private static final int HIDE_DELAY_AFTER_DRAGGING_MS = 1200;
    private static final int HIDE_DELAY_AFTER_VISIBLE_MS = 1500;
    private static final int HIDE_DURATION_MS = 500;
    private static final int[] PRESSED_STATE_SET = null;
    private static final int SCROLLBAR_FULL_OPAQUE = 255;
    private static final int SHOW_DURATION_MS = 500;
    private static final int STATE_DRAGGING = 2;
    private static final int STATE_HIDDEN = 0;
    private static final int STATE_VISIBLE = 1;
    public int mAnimationState;
    private int mDragState;
    private final Runnable mHideRunnable;
    @VisibleForTesting
    public float mHorizontalDragX;
    private final int[] mHorizontalRange;
    @VisibleForTesting
    public int mHorizontalThumbCenterX;
    private final StateListDrawable mHorizontalThumbDrawable;
    private final int mHorizontalThumbHeight;
    @VisibleForTesting
    public int mHorizontalThumbWidth;
    private final Drawable mHorizontalTrackDrawable;
    private final int mHorizontalTrackHeight;
    private final int mMargin;
    private boolean mNeedHorizontalScrollbar;
    private boolean mNeedVerticalScrollbar;
    private final RecyclerView.OnScrollListener mOnScrollListener;
    private RecyclerView mRecyclerView;
    private int mRecyclerViewHeight;
    private int mRecyclerViewWidth;
    private final int mScrollbarMinimumRange;
    public final ValueAnimator mShowHideAnimator;
    private int mState;
    @VisibleForTesting
    public float mVerticalDragY;
    private final int[] mVerticalRange;
    @VisibleForTesting
    public int mVerticalThumbCenterY;
    public final StateListDrawable mVerticalThumbDrawable;
    @VisibleForTesting
    public int mVerticalThumbHeight;
    private final int mVerticalThumbWidth;
    public final Drawable mVerticalTrackDrawable;
    private final int mVerticalTrackWidth;

    /* renamed from: androidx.recyclerview.widget.FastScroller$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ FastScroller this$0;

        public AnonymousClass1(FastScroller fastScroller) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: androidx.recyclerview.widget.FastScroller$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 extends RecyclerView.OnScrollListener {
        public final /* synthetic */ FastScroller this$0;

        public AnonymousClass2(FastScroller fastScroller) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnimatorListener extends AnimatorListenerAdapter {
        private boolean mCanceled;
        public final /* synthetic */ FastScroller this$0;

        public AnimatorListener(FastScroller fastScroller) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnimatorUpdater implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ FastScroller this$0;

        public AnimatorUpdater(FastScroller fastScroller) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    public FastScroller(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i2, int i3, int i4) {
    }

    private void cancelHide() {
    }

    private void destroyCallbacks() {
    }

    private void drawHorizontalScrollbar(Canvas canvas) {
    }

    private void drawVerticalScrollbar(Canvas canvas) {
    }

    private int[] getHorizontalRange() {
    }

    private int[] getVerticalRange() {
    }

    private void horizontalScrollTo(float f2) {
    }

    private boolean isLayoutRTL() {
    }

    private void resetHideDelay(int i2) {
    }

    private int scrollTo(float f2, float f3, int[] iArr, int i2, int i3, int i4) {
    }

    private void setupCallbacks() {
    }

    private void verticalScrollTo(float f2) {
    }

    public void attachToRecyclerView(@Nullable RecyclerView recyclerView) {
    }

    @VisibleForTesting
    public Drawable getHorizontalThumbDrawable() {
    }

    @VisibleForTesting
    public Drawable getHorizontalTrackDrawable() {
    }

    @VisibleForTesting
    public Drawable getVerticalThumbDrawable() {
    }

    @VisibleForTesting
    public Drawable getVerticalTrackDrawable() {
    }

    @VisibleForTesting
    public void hide(int i2) {
    }

    public boolean isDragging() {
    }

    @VisibleForTesting
    public boolean isPointInsideHorizontalThumb(float f2, float f3) {
    }

    @VisibleForTesting
    public boolean isPointInsideVerticalThumb(float f2, float f3) {
    }

    @VisibleForTesting
    public boolean isVisible() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
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

    public void requestRedraw() {
    }

    public void setState(int i2) {
    }

    public void show() {
    }

    public void updateScrollPosition(int i2, int i3) {
    }
}
