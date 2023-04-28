package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.NestedScrollingChild2;
import androidx.core.view.NestedScrollingChild3;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.ScrollingView;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.AdapterHelper;
import androidx.recyclerview.widget.ChildHelper;
import androidx.recyclerview.widget.GapWorker;
import androidx.recyclerview.widget.ViewBoundsCheck;
import androidx.recyclerview.widget.ViewInfoStore;
import com.alipay.sdk.util.i;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.sourceforge.pinyin4j.ChineseToPinyinResource;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class RecyclerView extends ViewGroup implements ScrollingView, NestedScrollingChild2, NestedScrollingChild3 {
    public static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = false;
    public static final boolean ALLOW_THREAD_GAP_WORK = false;
    public static final boolean DEBUG = false;
    public static final int DEFAULT_ORIENTATION = 1;
    public static final boolean DISPATCH_TEMP_DETACH = false;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
    public static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    public static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = false;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = null;
    public static final int MAX_SCROLL_DURATION = 2000;
    private static final int[] NESTED_SCROLLING_ATTRS = null;
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    public static final boolean POST_UPDATES_ON_ANIMATION = false;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    public static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    public static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    public static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    public static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    public static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    public static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    public static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    public static final Interpolator sQuinticInterpolator = null;
    public RecyclerViewAccessibilityDelegate mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    public Adapter mAdapter;
    public AdapterHelper mAdapterHelper;
    public boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private ChildDrawingOrderCallback mChildDrawingOrderCallback;
    public ChildHelper mChildHelper;
    public boolean mClipToPadding;
    public boolean mDataSetHasChangedAfterLayout;
    public boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    @NonNull
    private EdgeEffectFactory mEdgeEffectFactory;
    public boolean mEnableFastScroller;
    @VisibleForTesting
    public boolean mFirstLayoutComplete;
    public GapWorker mGapWorker;
    public boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private OnItemTouchListener mInterceptingOnItemTouchListener;
    public boolean mIsAttached;
    public ItemAnimator mItemAnimator;
    private ItemAnimator.ItemAnimatorListener mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    public final ArrayList<ItemDecoration> mItemDecorations;
    public boolean mItemsAddedOrRemoved;
    public boolean mItemsChanged;
    private int mLastAutoMeasureNonExactMeasuredHeight;
    private int mLastAutoMeasureNonExactMeasuredWidth;
    private boolean mLastAutoMeasureSkippedDueToExact;
    private int mLastTouchX;
    private int mLastTouchY;
    @VisibleForTesting
    public LayoutManager mLayout;
    private int mLayoutOrScrollCounter;
    public boolean mLayoutSuppressed;
    public boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final RecyclerViewDataObserver mObserver;
    private List<OnChildAttachStateChangeListener> mOnChildAttachStateListeners;
    private OnFlingListener mOnFlingListener;
    private final ArrayList<OnItemTouchListener> mOnItemTouchListeners;
    @VisibleForTesting
    public final List<ViewHolder> mPendingAccessibilityImportanceChange;
    public SavedState mPendingSavedState;
    public boolean mPostedAnimatorRunner;
    public GapWorker.LayoutPrefetchRegistryImpl mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    public final Recycler mRecycler;
    public RecyclerListener mRecyclerListener;
    public final List<RecyclerListener> mRecyclerListeners;
    public final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private OnScrollListener mScrollListener;
    private List<OnScrollListener> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private NestedScrollingChildHelper mScrollingChildHelper;
    public final State mState;
    public final Rect mTempRect;
    private final Rect mTempRect2;
    public final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    public final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    public final ViewFlinger mViewFlinger;
    private final ViewInfoStore.ProcessCallback mViewInfoProcessCallback;
    public final ViewInfoStore mViewInfoStore;

    /* renamed from: androidx.recyclerview.widget.RecyclerView$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ RecyclerView this$0;

        public AnonymousClass1(RecyclerView recyclerView) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements Runnable {
        public final /* synthetic */ RecyclerView this$0;

        public AnonymousClass2(RecyclerView recyclerView) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass3 implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass4 implements ViewInfoStore.ProcessCallback {
        public final /* synthetic */ RecyclerView this$0;

        public AnonymousClass4(RecyclerView recyclerView) {
        }

        @Override // androidx.recyclerview.widget.ViewInfoStore.ProcessCallback
        public void processAppeared(ViewHolder viewHolder, ItemAnimator.ItemHolderInfo itemHolderInfo, ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        }

        @Override // androidx.recyclerview.widget.ViewInfoStore.ProcessCallback
        public void processDisappeared(ViewHolder viewHolder, @NonNull ItemAnimator.ItemHolderInfo itemHolderInfo, @Nullable ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        }

        @Override // androidx.recyclerview.widget.ViewInfoStore.ProcessCallback
        public void processPersistent(ViewHolder viewHolder, @NonNull ItemAnimator.ItemHolderInfo itemHolderInfo, @NonNull ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        }

        @Override // androidx.recyclerview.widget.ViewInfoStore.ProcessCallback
        public void unused(ViewHolder viewHolder) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass5 implements ChildHelper.Callback {
        public final /* synthetic */ RecyclerView this$0;

        public AnonymousClass5(RecyclerView recyclerView) {
        }

        @Override // androidx.recyclerview.widget.ChildHelper.Callback
        public void addView(View view, int i2) {
        }

        @Override // androidx.recyclerview.widget.ChildHelper.Callback
        public void attachViewToParent(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        }

        @Override // androidx.recyclerview.widget.ChildHelper.Callback
        public void detachViewFromParent(int i2) {
        }

        @Override // androidx.recyclerview.widget.ChildHelper.Callback
        public View getChildAt(int i2) {
        }

        @Override // androidx.recyclerview.widget.ChildHelper.Callback
        public int getChildCount() {
        }

        @Override // androidx.recyclerview.widget.ChildHelper.Callback
        public ViewHolder getChildViewHolder(View view) {
        }

        @Override // androidx.recyclerview.widget.ChildHelper.Callback
        public int indexOfChild(View view) {
        }

        @Override // androidx.recyclerview.widget.ChildHelper.Callback
        public void onEnteredHiddenState(View view) {
        }

        @Override // androidx.recyclerview.widget.ChildHelper.Callback
        public void onLeftHiddenState(View view) {
        }

        @Override // androidx.recyclerview.widget.ChildHelper.Callback
        public void removeAllViews() {
        }

        @Override // androidx.recyclerview.widget.ChildHelper.Callback
        public void removeViewAt(int i2) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass6 implements AdapterHelper.Callback {
        public final /* synthetic */ RecyclerView this$0;

        public AnonymousClass6(RecyclerView recyclerView) {
        }

        public void dispatchUpdate(AdapterHelper.UpdateOp updateOp) {
        }

        @Override // androidx.recyclerview.widget.AdapterHelper.Callback
        public ViewHolder findViewHolder(int i2) {
        }

        @Override // androidx.recyclerview.widget.AdapterHelper.Callback
        public void markViewHoldersUpdated(int i2, int i3, Object obj) {
        }

        @Override // androidx.recyclerview.widget.AdapterHelper.Callback
        public void offsetPositionsForAdd(int i2, int i3) {
        }

        @Override // androidx.recyclerview.widget.AdapterHelper.Callback
        public void offsetPositionsForMove(int i2, int i3) {
        }

        @Override // androidx.recyclerview.widget.AdapterHelper.Callback
        public void offsetPositionsForRemovingInvisible(int i2, int i3) {
        }

        @Override // androidx.recyclerview.widget.AdapterHelper.Callback
        public void offsetPositionsForRemovingLaidOutOrNewView(int i2, int i3) {
        }

        @Override // androidx.recyclerview.widget.AdapterHelper.Callback
        public void onDispatchFirstPass(AdapterHelper.UpdateOp updateOp) {
        }

        @Override // androidx.recyclerview.widget.AdapterHelper.Callback
        public void onDispatchSecondPass(AdapterHelper.UpdateOp updateOp) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static /* synthetic */ class AnonymousClass7 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$recyclerview$widget$RecyclerView$Adapter$StateRestorationPolicy = null;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static abstract class Adapter<VH extends ViewHolder> {
        private boolean mHasStableIds;
        private final AdapterDataObservable mObservable;
        private StateRestorationPolicy mStateRestorationPolicy;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unexpected branching in enum static init block */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public static final class StateRestorationPolicy {
            private static final /* synthetic */ StateRestorationPolicy[] $VALUES = null;
            public static final StateRestorationPolicy ALLOW = null;
            public static final StateRestorationPolicy PREVENT = null;
            public static final StateRestorationPolicy PREVENT_WHEN_EMPTY = null;

            private StateRestorationPolicy(String str, int i2) {
            }

            public static StateRestorationPolicy valueOf(String str) {
            }

            public static StateRestorationPolicy[] values() {
            }
        }

        public final void bindViewHolder(@NonNull VH vh, int i2) {
        }

        public boolean canRestoreState() {
        }

        @NonNull
        public final VH createViewHolder(@NonNull ViewGroup viewGroup, int i2) {
        }

        public int findRelativeAdapterPositionIn(@NonNull Adapter<? extends ViewHolder> adapter, @NonNull ViewHolder viewHolder, int i2) {
        }

        public abstract int getItemCount();

        public long getItemId(int i2) {
        }

        public int getItemViewType(int i2) {
        }

        @NonNull
        public final StateRestorationPolicy getStateRestorationPolicy() {
        }

        public final boolean hasObservers() {
        }

        public final boolean hasStableIds() {
        }

        public final void notifyDataSetChanged() {
        }

        public final void notifyItemChanged(int i2) {
        }

        public final void notifyItemInserted(int i2) {
        }

        public final void notifyItemMoved(int i2, int i3) {
        }

        public final void notifyItemRangeChanged(int i2, int i3) {
        }

        public final void notifyItemRangeInserted(int i2, int i3) {
        }

        public final void notifyItemRangeRemoved(int i2, int i3) {
        }

        public final void notifyItemRemoved(int i2) {
        }

        public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(@NonNull VH vh, int i2);

        public void onBindViewHolder(@NonNull VH vh, int i2, @NonNull List<Object> list) {
        }

        @NonNull
        public abstract VH onCreateViewHolder(@NonNull ViewGroup viewGroup, int i2);

        public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(@NonNull VH vh) {
        }

        public void onViewAttachedToWindow(@NonNull VH vh) {
        }

        public void onViewDetachedFromWindow(@NonNull VH vh) {
        }

        public void onViewRecycled(@NonNull VH vh) {
        }

        public void registerAdapterDataObserver(@NonNull AdapterDataObserver adapterDataObserver) {
        }

        public void setHasStableIds(boolean z) {
        }

        public void setStateRestorationPolicy(@NonNull StateRestorationPolicy stateRestorationPolicy) {
        }

        public void unregisterAdapterDataObserver(@NonNull AdapterDataObserver adapterDataObserver) {
        }

        public final void notifyItemChanged(int i2, @Nullable Object obj) {
        }

        public final void notifyItemRangeChanged(int i2, int i3, @Nullable Object obj) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AdapterDataObservable extends Observable<AdapterDataObserver> {
        public boolean hasObservers() {
        }

        public void notifyChanged() {
        }

        public void notifyItemMoved(int i2, int i3) {
        }

        public void notifyItemRangeChanged(int i2, int i3) {
        }

        public void notifyItemRangeInserted(int i2, int i3) {
        }

        public void notifyItemRangeRemoved(int i2, int i3) {
        }

        public void notifyStateRestorationPolicyChanged() {
        }

        public void notifyItemRangeChanged(int i2, int i3, @Nullable Object obj) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static abstract class AdapterDataObserver {
        public void onChanged() {
        }

        public void onItemRangeChanged(int i2, int i3) {
        }

        public void onItemRangeChanged(int i2, int i3, @Nullable Object obj) {
        }

        public void onItemRangeInserted(int i2, int i3) {
        }

        public void onItemRangeMoved(int i2, int i3, int i4) {
        }

        public void onItemRangeRemoved(int i2, int i3) {
        }

        public void onStateRestorationPolicyChanged() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface ChildDrawingOrderCallback {
        int onGetChildDrawingOrder(int i2, int i3);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class EdgeEffectFactory {
        public static final int DIRECTION_BOTTOM = 3;
        public static final int DIRECTION_LEFT = 0;
        public static final int DIRECTION_RIGHT = 2;
        public static final int DIRECTION_TOP = 1;

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public @interface EdgeDirection {
        }

        @NonNull
        public EdgeEffect createEdgeEffect(@NonNull RecyclerView recyclerView, int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static abstract class ItemAnimator {
        public static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        public static final int FLAG_CHANGED = 2;
        public static final int FLAG_INVALIDATED = 4;
        public static final int FLAG_MOVED = 2048;
        public static final int FLAG_REMOVED = 8;
        private long mAddDuration;
        private long mChangeDuration;
        private ArrayList<ItemAnimatorFinishedListener> mFinishedListeners;
        private ItemAnimatorListener mListener;
        private long mMoveDuration;
        private long mRemoveDuration;

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public @interface AdapterChanges {
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public interface ItemAnimatorFinishedListener {
            void onAnimationsFinished();
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public interface ItemAnimatorListener {
            void onAnimationFinished(@NonNull ViewHolder viewHolder);
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public static class ItemHolderInfo {
            public int bottom;
            public int changeFlags;
            public int left;
            public int right;

            /* renamed from: top  reason: collision with root package name */
            public int f33top;

            @NonNull
            public ItemHolderInfo setFrom(@NonNull ViewHolder viewHolder) {
            }

            @NonNull
            public ItemHolderInfo setFrom(@NonNull ViewHolder viewHolder, int i2) {
            }
        }

        public static int buildAdapterChangeFlagsForAnimations(ViewHolder viewHolder) {
        }

        public abstract boolean animateAppearance(@NonNull ViewHolder viewHolder, @Nullable ItemHolderInfo itemHolderInfo, @NonNull ItemHolderInfo itemHolderInfo2);

        public abstract boolean animateChange(@NonNull ViewHolder viewHolder, @NonNull ViewHolder viewHolder2, @NonNull ItemHolderInfo itemHolderInfo, @NonNull ItemHolderInfo itemHolderInfo2);

        public abstract boolean animateDisappearance(@NonNull ViewHolder viewHolder, @NonNull ItemHolderInfo itemHolderInfo, @Nullable ItemHolderInfo itemHolderInfo2);

        public abstract boolean animatePersistence(@NonNull ViewHolder viewHolder, @NonNull ItemHolderInfo itemHolderInfo, @NonNull ItemHolderInfo itemHolderInfo2);

        public boolean canReuseUpdatedViewHolder(@NonNull ViewHolder viewHolder) {
        }

        public boolean canReuseUpdatedViewHolder(@NonNull ViewHolder viewHolder, @NonNull List<Object> list) {
        }

        public final void dispatchAnimationFinished(@NonNull ViewHolder viewHolder) {
        }

        public final void dispatchAnimationStarted(@NonNull ViewHolder viewHolder) {
        }

        public final void dispatchAnimationsFinished() {
        }

        public abstract void endAnimation(@NonNull ViewHolder viewHolder);

        public abstract void endAnimations();

        public long getAddDuration() {
        }

        public long getChangeDuration() {
        }

        public long getMoveDuration() {
        }

        public long getRemoveDuration() {
        }

        public abstract boolean isRunning();

        public final boolean isRunning(@Nullable ItemAnimatorFinishedListener itemAnimatorFinishedListener) {
        }

        @NonNull
        public ItemHolderInfo obtainHolderInfo() {
        }

        public void onAnimationFinished(@NonNull ViewHolder viewHolder) {
        }

        public void onAnimationStarted(@NonNull ViewHolder viewHolder) {
        }

        @NonNull
        public ItemHolderInfo recordPostLayoutInformation(@NonNull State state, @NonNull ViewHolder viewHolder) {
        }

        @NonNull
        public ItemHolderInfo recordPreLayoutInformation(@NonNull State state, @NonNull ViewHolder viewHolder, int i2, @NonNull List<Object> list) {
        }

        public abstract void runPendingAnimations();

        public void setAddDuration(long j2) {
        }

        public void setChangeDuration(long j2) {
        }

        public void setListener(ItemAnimatorListener itemAnimatorListener) {
        }

        public void setMoveDuration(long j2) {
        }

        public void setRemoveDuration(long j2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class ItemAnimatorRestoreListener implements ItemAnimator.ItemAnimatorListener {
        public final /* synthetic */ RecyclerView this$0;

        public ItemAnimatorRestoreListener(RecyclerView recyclerView) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemAnimatorListener
        public void onAnimationFinished(ViewHolder viewHolder) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static abstract class ItemDecoration {
        @Deprecated
        public void getItemOffsets(@NonNull Rect rect, int i2, @NonNull RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        }

        public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull State state) {
        }

        @Deprecated
        public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        }

        public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull State state) {
        }

        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull State state) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static abstract class LayoutManager {
        public boolean mAutoMeasure;
        public ChildHelper mChildHelper;
        private int mHeight;
        private int mHeightMode;
        public ViewBoundsCheck mHorizontalBoundCheck;
        private final ViewBoundsCheck.Callback mHorizontalBoundCheckCallback;
        public boolean mIsAttachedToWindow;
        private boolean mItemPrefetchEnabled;
        private boolean mMeasurementCacheEnabled;
        public int mPrefetchMaxCountObserved;
        public boolean mPrefetchMaxObservedInInitialPrefetch;
        public RecyclerView mRecyclerView;
        public boolean mRequestedSimpleAnimations;
        @Nullable
        public SmoothScroller mSmoothScroller;
        public ViewBoundsCheck mVerticalBoundCheck;
        private final ViewBoundsCheck.Callback mVerticalBoundCheckCallback;
        private int mWidth;
        private int mWidthMode;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$LayoutManager$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass1 implements ViewBoundsCheck.Callback {
            public final /* synthetic */ LayoutManager this$0;

            public AnonymousClass1(LayoutManager layoutManager) {
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
            public View getChildAt(int i2) {
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
            public int getChildEnd(View view) {
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
            public int getChildStart(View view) {
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
            public int getParentEnd() {
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
            public int getParentStart() {
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$LayoutManager$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass2 implements ViewBoundsCheck.Callback {
            public final /* synthetic */ LayoutManager this$0;

            public AnonymousClass2(LayoutManager layoutManager) {
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
            public View getChildAt(int i2) {
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
            public int getChildEnd(View view) {
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
            public int getChildStart(View view) {
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
            public int getParentEnd() {
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
            public int getParentStart() {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public interface LayoutPrefetchRegistry {
            void addPosition(int i2, int i3);
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public static class Properties {
            public int orientation;
            public boolean reverseLayout;
            public int spanCount;
            public boolean stackFromEnd;
        }

        private void addViewInt(View view, int i2, boolean z) {
        }

        public static int chooseSize(int i2, int i3, int i4) {
        }

        private void detachViewInternal(int i2, @NonNull View view) {
        }

        @Deprecated
        public static int getChildMeasureSpec(int i2, int i3, int i4, boolean z) {
        }

        private int[] getChildRectangleOnScreenScrollAmount(View view, Rect rect) {
        }

        public static Properties getProperties(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2, int i3) {
        }

        private boolean isFocusedChildVisibleAfterScrolling(RecyclerView recyclerView, int i2, int i3) {
        }

        private static boolean isMeasurementUpToDate(int i2, int i3, int i4) {
        }

        private void scrapOrRecycleView(Recycler recycler, int i2, View view) {
        }

        public void addDisappearingView(View view) {
        }

        public void addView(View view) {
        }

        public void assertInLayoutOrScroll(String str) {
        }

        public void assertNotInLayoutOrScroll(String str) {
        }

        public void attachView(@NonNull View view, int i2, LayoutParams layoutParams) {
        }

        public void calculateItemDecorationsForChild(@NonNull View view, @NonNull Rect rect) {
        }

        public boolean canScrollHorizontally() {
        }

        public boolean canScrollVertically() {
        }

        public boolean checkLayoutParams(LayoutParams layoutParams) {
        }

        public void collectAdjacentPrefetchPositions(int i2, int i3, State state, LayoutPrefetchRegistry layoutPrefetchRegistry) {
        }

        public void collectInitialPrefetchPositions(int i2, LayoutPrefetchRegistry layoutPrefetchRegistry) {
        }

        public int computeHorizontalScrollExtent(@NonNull State state) {
        }

        public int computeHorizontalScrollOffset(@NonNull State state) {
        }

        public int computeHorizontalScrollRange(@NonNull State state) {
        }

        public int computeVerticalScrollExtent(@NonNull State state) {
        }

        public int computeVerticalScrollOffset(@NonNull State state) {
        }

        public int computeVerticalScrollRange(@NonNull State state) {
        }

        public void detachAndScrapAttachedViews(@NonNull Recycler recycler) {
        }

        public void detachAndScrapView(@NonNull View view, @NonNull Recycler recycler) {
        }

        public void detachAndScrapViewAt(int i2, @NonNull Recycler recycler) {
        }

        public void detachView(@NonNull View view) {
        }

        public void detachViewAt(int i2) {
        }

        public void dispatchAttachedToWindow(RecyclerView recyclerView) {
        }

        public void dispatchDetachedFromWindow(RecyclerView recyclerView, Recycler recycler) {
        }

        public void endAnimation(View view) {
        }

        @Nullable
        public View findContainingItemView(@NonNull View view) {
        }

        @Nullable
        public View findViewByPosition(int i2) {
        }

        public abstract LayoutParams generateDefaultLayoutParams();

        public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        }

        public int getBaseline() {
        }

        public int getBottomDecorationHeight(@NonNull View view) {
        }

        @Nullable
        public View getChildAt(int i2) {
        }

        public int getChildCount() {
        }

        public boolean getClipToPadding() {
        }

        public int getColumnCountForAccessibility(@NonNull Recycler recycler, @NonNull State state) {
        }

        public int getDecoratedBottom(@NonNull View view) {
        }

        public void getDecoratedBoundsWithMargins(@NonNull View view, @NonNull Rect rect) {
        }

        public int getDecoratedLeft(@NonNull View view) {
        }

        public int getDecoratedMeasuredHeight(@NonNull View view) {
        }

        public int getDecoratedMeasuredWidth(@NonNull View view) {
        }

        public int getDecoratedRight(@NonNull View view) {
        }

        public int getDecoratedTop(@NonNull View view) {
        }

        @Nullable
        public View getFocusedChild() {
        }

        @Px
        public int getHeight() {
        }

        public int getHeightMode() {
        }

        public int getItemCount() {
        }

        public int getItemViewType(@NonNull View view) {
        }

        public int getLayoutDirection() {
        }

        public int getLeftDecorationWidth(@NonNull View view) {
        }

        @Px
        public int getMinimumHeight() {
        }

        @Px
        public int getMinimumWidth() {
        }

        @Px
        public int getPaddingBottom() {
        }

        @Px
        public int getPaddingEnd() {
        }

        @Px
        public int getPaddingLeft() {
        }

        @Px
        public int getPaddingRight() {
        }

        @Px
        public int getPaddingStart() {
        }

        @Px
        public int getPaddingTop() {
        }

        public int getPosition(@NonNull View view) {
        }

        public int getRightDecorationWidth(@NonNull View view) {
        }

        public int getRowCountForAccessibility(@NonNull Recycler recycler, @NonNull State state) {
        }

        public int getSelectionModeForAccessibility(@NonNull Recycler recycler, @NonNull State state) {
        }

        public int getTopDecorationHeight(@NonNull View view) {
        }

        public void getTransformedBoundingBox(@NonNull View view, boolean z, @NonNull Rect rect) {
        }

        @Px
        public int getWidth() {
        }

        public int getWidthMode() {
        }

        public boolean hasFlexibleChildInBothOrientations() {
        }

        public boolean hasFocus() {
        }

        public void ignoreView(@NonNull View view) {
        }

        public boolean isAttachedToWindow() {
        }

        public boolean isAutoMeasureEnabled() {
        }

        public boolean isFocused() {
        }

        public final boolean isItemPrefetchEnabled() {
        }

        public boolean isLayoutHierarchical(@NonNull Recycler recycler, @NonNull State state) {
        }

        public boolean isMeasurementCacheEnabled() {
        }

        public boolean isSmoothScrolling() {
        }

        public boolean isViewPartiallyVisible(@NonNull View view, boolean z, boolean z2) {
        }

        public void layoutDecorated(@NonNull View view, int i2, int i3, int i4, int i5) {
        }

        public void layoutDecoratedWithMargins(@NonNull View view, int i2, int i3, int i4, int i5) {
        }

        public void measureChild(@NonNull View view, int i2, int i3) {
        }

        public void measureChildWithMargins(@NonNull View view, int i2, int i3) {
        }

        public void moveView(int i2, int i3) {
        }

        public void offsetChildrenHorizontal(@Px int i2) {
        }

        public void offsetChildrenVertical(@Px int i2) {
        }

        public void onAdapterChanged(@Nullable Adapter adapter, @Nullable Adapter adapter2) {
        }

        public boolean onAddFocusables(@NonNull RecyclerView recyclerView, @NonNull ArrayList<View> arrayList, int i2, int i3) {
        }

        @CallSuper
        public void onAttachedToWindow(RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDetachedFromWindow(RecyclerView recyclerView) {
        }

        @CallSuper
        public void onDetachedFromWindow(RecyclerView recyclerView, Recycler recycler) {
        }

        @Nullable
        public View onFocusSearchFailed(@NonNull View view, int i2, @NonNull Recycler recycler, @NonNull State state) {
        }

        public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        }

        public void onInitializeAccessibilityNodeInfoForItem(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        }

        public void onInitializeAccessibilityNodeInfoForItem(@NonNull Recycler recycler, @NonNull State state, @NonNull View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        }

        @Nullable
        public View onInterceptFocusSearch(@NonNull View view, int i2) {
        }

        public void onItemsAdded(@NonNull RecyclerView recyclerView, int i2, int i3) {
        }

        public void onItemsChanged(@NonNull RecyclerView recyclerView) {
        }

        public void onItemsMoved(@NonNull RecyclerView recyclerView, int i2, int i3, int i4) {
        }

        public void onItemsRemoved(@NonNull RecyclerView recyclerView, int i2, int i3) {
        }

        public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i2, int i3) {
        }

        public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i2, int i3, @Nullable Object obj) {
        }

        public void onLayoutChildren(Recycler recycler, State state) {
        }

        public void onLayoutCompleted(State state) {
        }

        public void onMeasure(@NonNull Recycler recycler, @NonNull State state, int i2, int i3) {
        }

        @Deprecated
        public boolean onRequestChildFocus(@NonNull RecyclerView recyclerView, @NonNull View view, @Nullable View view2) {
        }

        public void onRestoreInstanceState(Parcelable parcelable) {
        }

        @Nullable
        public Parcelable onSaveInstanceState() {
        }

        public void onScrollStateChanged(int i2) {
        }

        public void onSmoothScrollerStopped(SmoothScroller smoothScroller) {
        }

        public boolean performAccessibilityAction(int i2, @Nullable Bundle bundle) {
        }

        public boolean performAccessibilityActionForItem(@NonNull View view, int i2, @Nullable Bundle bundle) {
        }

        public boolean performAccessibilityActionForItem(@NonNull Recycler recycler, @NonNull State state, @NonNull View view, int i2, @Nullable Bundle bundle) {
        }

        public void postOnAnimation(Runnable runnable) {
        }

        public void removeAllViews() {
        }

        public void removeAndRecycleAllViews(@NonNull Recycler recycler) {
        }

        public void removeAndRecycleScrapInt(Recycler recycler) {
        }

        public void removeAndRecycleView(@NonNull View view, @NonNull Recycler recycler) {
        }

        public void removeAndRecycleViewAt(int i2, @NonNull Recycler recycler) {
        }

        public boolean removeCallbacks(Runnable runnable) {
        }

        public void removeDetachedView(@NonNull View view) {
        }

        public void removeView(View view) {
        }

        public void removeViewAt(int i2) {
        }

        public boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z) {
        }

        public void requestLayout() {
        }

        public void requestSimpleAnimationsInNextLayout() {
        }

        public int scrollHorizontallyBy(int i2, Recycler recycler, State state) {
        }

        public void scrollToPosition(int i2) {
        }

        public int scrollVerticallyBy(int i2, Recycler recycler, State state) {
        }

        @Deprecated
        public void setAutoMeasureEnabled(boolean z) {
        }

        public void setExactMeasureSpecsFrom(RecyclerView recyclerView) {
        }

        public final void setItemPrefetchEnabled(boolean z) {
        }

        public void setMeasureSpecs(int i2, int i3) {
        }

        public void setMeasuredDimension(Rect rect, int i2, int i3) {
        }

        public void setMeasuredDimensionFromChildren(int i2, int i3) {
        }

        public void setMeasurementCacheEnabled(boolean z) {
        }

        public void setRecyclerView(RecyclerView recyclerView) {
        }

        public boolean shouldMeasureChild(View view, int i2, int i3, LayoutParams layoutParams) {
        }

        public boolean shouldMeasureTwice() {
        }

        public boolean shouldReMeasureChild(View view, int i2, int i3, LayoutParams layoutParams) {
        }

        public void smoothScrollToPosition(RecyclerView recyclerView, State state, int i2) {
        }

        public void startSmoothScroll(SmoothScroller smoothScroller) {
        }

        public void stopIgnoringView(@NonNull View view) {
        }

        public void stopSmoothScroller() {
        }

        public boolean supportsPredictiveItemAnimations() {
        }

        public void addDisappearingView(View view, int i2) {
        }

        public void addView(View view, int i2) {
        }

        public void onInitializeAccessibilityEvent(@NonNull Recycler recycler, @NonNull State state, @NonNull AccessibilityEvent accessibilityEvent) {
        }

        public void onInitializeAccessibilityNodeInfo(@NonNull Recycler recycler, @NonNull State state, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        }

        public boolean onRequestChildFocus(@NonNull RecyclerView recyclerView, @NonNull State state, @NonNull View view, @Nullable View view2) {
        }

        public boolean performAccessibilityAction(@NonNull Recycler recycler, @NonNull State state, int i2, @Nullable Bundle bundle) {
        }

        public boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z, boolean z2) {
        }

        public static int getChildMeasureSpec(int i2, int i3, int i4, int i5, boolean z) {
        }

        public void attachView(@NonNull View view, int i2) {
        }

        public LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        }

        public void setMeasuredDimension(int i2, int i3) {
        }

        public void attachView(@NonNull View view) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface OnChildAttachStateChangeListener {
        void onChildViewAttachedToWindow(@NonNull View view);

        void onChildViewDetachedFromWindow(@NonNull View view);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static abstract class OnFlingListener {
        public abstract boolean onFling(int i2, int i3);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface OnItemTouchListener {
        boolean onInterceptTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent);

        void onRequestDisallowInterceptTouchEvent(boolean z);

        void onTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static abstract class OnScrollListener {
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i2) {
        }

        public void onScrolled(@NonNull RecyclerView recyclerView, int i2, int i3) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public @interface Orientation {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class RecycledViewPool {
        private static final int DEFAULT_MAX_SCRAP = 5;
        private int mAttachCount;
        public SparseArray<ScrapData> mScrap;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public static class ScrapData {
            public long mBindRunningAverageNs;
            public long mCreateRunningAverageNs;
            public int mMaxScrap;
            public final ArrayList<ViewHolder> mScrapHeap;
        }

        private ScrapData getScrapDataForType(int i2) {
        }

        public void attach() {
        }

        public void clear() {
        }

        public void detach() {
        }

        public void factorInBindTime(int i2, long j2) {
        }

        public void factorInCreateTime(int i2, long j2) {
        }

        @Nullable
        public ViewHolder getRecycledView(int i2) {
        }

        public int getRecycledViewCount(int i2) {
        }

        public void onAdapterChanged(Adapter adapter, Adapter adapter2, boolean z) {
        }

        public void putRecycledView(ViewHolder viewHolder) {
        }

        public long runningAverage(long j2, long j3) {
        }

        public void setMaxRecycledViews(int i2, int i3) {
        }

        public int size() {
        }

        public boolean willBindInTime(int i2, long j2, long j3) {
        }

        public boolean willCreateInTime(int i2, long j2, long j3) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public final class Recycler {
        public static final int DEFAULT_CACHE_SIZE = 2;
        public final ArrayList<ViewHolder> mAttachedScrap;
        public final ArrayList<ViewHolder> mCachedViews;
        public ArrayList<ViewHolder> mChangedScrap;
        public RecycledViewPool mRecyclerPool;
        private int mRequestedCacheMax;
        private final List<ViewHolder> mUnmodifiableAttachedScrap;
        private ViewCacheExtension mViewCacheExtension;
        public int mViewCacheMax;
        public final /* synthetic */ RecyclerView this$0;

        public Recycler(RecyclerView recyclerView) {
        }

        private void attachAccessibilityDelegateOnBind(ViewHolder viewHolder) {
        }

        private void invalidateDisplayListInt(ViewHolder viewHolder) {
        }

        private boolean tryBindViewHolderByDeadline(@NonNull ViewHolder viewHolder, int i2, int i3, long j2) {
        }

        public void addViewHolderToRecycledViewPool(@NonNull ViewHolder viewHolder, boolean z) {
        }

        public void bindViewToPosition(@NonNull View view, int i2) {
        }

        public void clear() {
        }

        public void clearOldPositions() {
        }

        public void clearScrap() {
        }

        public int convertPreLayoutPositionToPostLayout(int i2) {
        }

        public void dispatchViewRecycled(@NonNull ViewHolder viewHolder) {
        }

        public ViewHolder getChangedScrapViewForPosition(int i2) {
        }

        public RecycledViewPool getRecycledViewPool() {
        }

        public int getScrapCount() {
        }

        @NonNull
        public List<ViewHolder> getScrapList() {
        }

        public ViewHolder getScrapOrCachedViewForId(long j2, int i2, boolean z) {
        }

        public ViewHolder getScrapOrHiddenOrCachedHolderForPosition(int i2, boolean z) {
        }

        public View getScrapViewAt(int i2) {
        }

        @NonNull
        public View getViewForPosition(int i2) {
        }

        public void markItemDecorInsetsDirty() {
        }

        public void markKnownViewsInvalid() {
        }

        public void offsetPositionRecordsForInsert(int i2, int i3) {
        }

        public void offsetPositionRecordsForMove(int i2, int i3) {
        }

        public void offsetPositionRecordsForRemove(int i2, int i3, boolean z) {
        }

        public void onAdapterChanged(Adapter adapter, Adapter adapter2, boolean z) {
        }

        public void quickRecycleScrapView(View view) {
        }

        public void recycleAndClearCachedViews() {
        }

        public void recycleCachedViewAt(int i2) {
        }

        public void recycleView(@NonNull View view) {
        }

        public void recycleViewHolderInternal(ViewHolder viewHolder) {
        }

        public void scrapView(View view) {
        }

        public void setRecycledViewPool(RecycledViewPool recycledViewPool) {
        }

        public void setViewCacheExtension(ViewCacheExtension viewCacheExtension) {
        }

        public void setViewCacheSize(int i2) {
        }

        @Nullable
        public ViewHolder tryGetViewHolderForPositionByDeadline(int i2, boolean z, long j2) {
        }

        public void unscrapView(ViewHolder viewHolder) {
        }

        public void updateViewCacheSize() {
        }

        public boolean validateViewHolderForOffsetPosition(ViewHolder viewHolder) {
        }

        public void viewRangeUpdate(int i2, int i3) {
        }

        public View getViewForPosition(int i2, boolean z) {
        }

        private void invalidateDisplayListInt(ViewGroup viewGroup, boolean z) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface RecyclerListener {
        void onViewRecycled(@NonNull ViewHolder viewHolder);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class RecyclerViewDataObserver extends AdapterDataObserver {
        public final /* synthetic */ RecyclerView this$0;

        public RecyclerViewDataObserver(RecyclerView recyclerView) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i2, int i3, Object obj) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i2, int i3) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i2, int i3, int i4) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i2, int i3) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onStateRestorationPolicyChanged() {
        }

        public void triggerUpdateProcessor() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class SimpleOnItemTouchListener implements OnItemTouchListener {
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

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static abstract class SmoothScroller {
        private LayoutManager mLayoutManager;
        private boolean mPendingInitialRun;
        private RecyclerView mRecyclerView;
        private final Action mRecyclingAction;
        private boolean mRunning;
        private boolean mStarted;
        private int mTargetPosition;
        private View mTargetView;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public static class Action {
            public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
            private boolean mChanged;
            private int mConsecutiveUpdates;
            private int mDuration;
            private int mDx;
            private int mDy;
            private Interpolator mInterpolator;
            private int mJumpToPosition;

            public Action(@Px int i2, @Px int i3) {
            }

            private void validate() {
            }

            public int getDuration() {
            }

            @Px
            public int getDx() {
            }

            @Px
            public int getDy() {
            }

            @Nullable
            public Interpolator getInterpolator() {
            }

            public boolean hasJumpTarget() {
            }

            public void jumpTo(int i2) {
            }

            public void runIfNecessary(RecyclerView recyclerView) {
            }

            public void setDuration(int i2) {
            }

            public void setDx(@Px int i2) {
            }

            public void setDy(@Px int i2) {
            }

            public void setInterpolator(@Nullable Interpolator interpolator) {
            }

            public void update(@Px int i2, @Px int i3, int i4, @Nullable Interpolator interpolator) {
            }

            public Action(@Px int i2, @Px int i3, int i4) {
            }

            public Action(@Px int i2, @Px int i3, int i4, @Nullable Interpolator interpolator) {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public interface ScrollVectorProvider {
            @Nullable
            PointF computeScrollVectorForPosition(int i2);
        }

        @Nullable
        public PointF computeScrollVectorForPosition(int i2) {
        }

        public View findViewByPosition(int i2) {
        }

        public int getChildCount() {
        }

        public int getChildPosition(View view) {
        }

        @Nullable
        public LayoutManager getLayoutManager() {
        }

        public int getTargetPosition() {
        }

        @Deprecated
        public void instantScrollToPosition(int i2) {
        }

        public boolean isPendingInitialRun() {
        }

        public boolean isRunning() {
        }

        public void normalize(@NonNull PointF pointF) {
        }

        public void onAnimation(int i2, int i3) {
        }

        public void onChildAttachedToWindow(View view) {
        }

        public abstract void onSeekTargetStep(@Px int i2, @Px int i3, @NonNull State state, @NonNull Action action);

        public abstract void onStart();

        public abstract void onStop();

        public abstract void onTargetFound(@NonNull View view, @NonNull State state, @NonNull Action action);

        public void setTargetPosition(int i2) {
        }

        public void start(RecyclerView recyclerView, LayoutManager layoutManager) {
        }

        public final void stop() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class State {
        public static final int STEP_ANIMATIONS = 4;
        public static final int STEP_LAYOUT = 2;
        public static final int STEP_START = 1;
        private SparseArray<Object> mData;
        public int mDeletedInvisibleItemCountSincePreviousLayout;
        public long mFocusedItemId;
        public int mFocusedItemPosition;
        public int mFocusedSubChildId;
        public boolean mInPreLayout;
        public boolean mIsMeasuring;
        public int mItemCount;
        public int mLayoutStep;
        public int mPreviousLayoutItemCount;
        public int mRemainingScrollHorizontal;
        public int mRemainingScrollVertical;
        public boolean mRunPredictiveAnimations;
        public boolean mRunSimpleAnimations;
        public boolean mStructureChanged;
        public int mTargetPosition;
        public boolean mTrackOldChangeHolders;

        public void assertLayoutStep(int i2) {
        }

        public boolean didStructureChange() {
        }

        public <T> T get(int i2) {
        }

        public int getItemCount() {
        }

        public int getRemainingScrollHorizontal() {
        }

        public int getRemainingScrollVertical() {
        }

        public int getTargetScrollPosition() {
        }

        public boolean hasTargetScrollPosition() {
        }

        public boolean isMeasuring() {
        }

        public boolean isPreLayout() {
        }

        public void prepareForNestedPrefetch(Adapter adapter) {
        }

        public void put(int i2, Object obj) {
        }

        public void remove(int i2) {
        }

        public String toString() {
        }

        public boolean willRunPredictiveAnimations() {
        }

        public boolean willRunSimpleAnimations() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static abstract class ViewCacheExtension {
        @Nullable
        public abstract View getViewForPositionAndType(@NonNull Recycler recycler, int i2, int i3);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class ViewFlinger implements Runnable {
        private boolean mEatRunOnAnimationRequest;
        public Interpolator mInterpolator;
        private int mLastFlingX;
        private int mLastFlingY;
        public OverScroller mOverScroller;
        private boolean mReSchedulePostAnimationCallback;
        public final /* synthetic */ RecyclerView this$0;

        public ViewFlinger(RecyclerView recyclerView) {
        }

        private int computeScrollDuration(int i2, int i3) {
        }

        private void internalPostOnAnimation() {
        }

        public void fling(int i2, int i3) {
        }

        public void postOnAnimation() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        public void smoothScrollBy(int i2, int i3, int i4, @Nullable Interpolator interpolator) {
        }

        public void stop() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static abstract class ViewHolder {
        public static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        public static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        public static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        public static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        public static final int FLAG_BOUND = 1;
        public static final int FLAG_IGNORE = 128;
        public static final int FLAG_INVALID = 4;
        public static final int FLAG_MOVED = 2048;
        public static final int FLAG_NOT_RECYCLABLE = 16;
        public static final int FLAG_REMOVED = 8;
        public static final int FLAG_RETURNED_FROM_SCRAP = 32;
        public static final int FLAG_TMP_DETACHED = 256;
        public static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
        public static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        @NonNull
        public final View itemView;
        public Adapter<? extends ViewHolder> mBindingAdapter;
        public int mFlags;
        public WeakReference<RecyclerView> mNestedRecyclerView;
        public RecyclerView mOwnerRecyclerView;
        public int mPosition = -1;
        public int mOldPosition = -1;
        public long mItemId = -1;
        public int mItemViewType = -1;
        public int mPreLayoutPosition = -1;
        public ViewHolder mShadowedHolder = null;
        public ViewHolder mShadowingHolder = null;
        public List<Object> mPayloads = null;
        public List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        public Recycler mScrapContainer = null;
        public boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;
        @VisibleForTesting
        public int mPendingAccessibilityState = -1;

        public ViewHolder(@NonNull View view) {
            if (view != null) {
                this.itemView = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
            } else if ((1024 & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        public void addFlags(int i2) {
            this.mFlags = i2 | this.mFlags;
        }

        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        public void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        public boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & 16) == 0 && ViewCompat.hasTransientState(this.itemView);
        }

        public void flagRemovedAndOffsetPosition(int i2, int i3, boolean z) {
            addFlags(8);
            offsetPosition(i3, z);
            this.mPosition = i2;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionInRecyclerView(this);
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        @Nullable
        public final Adapter<? extends ViewHolder> getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            Adapter adapter;
            int adapterPositionInRecyclerView;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (adapterPositionInRecyclerView = this.mOwnerRecyclerView.getAdapterPositionInRecyclerView(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, adapterPositionInRecyclerView);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i2 = this.mPreLayoutPosition;
            return i2 == -1 ? this.mPosition : i2;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i2 = this.mPreLayoutPosition;
            return i2 == -1 ? this.mPosition : i2;
        }

        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) == 0) {
                List<Object> list = this.mPayloads;
                if (list != null && list.size() != 0) {
                    return this.mUnmodifiedPayloads;
                }
                return FULLUPDATE_PAYLOADS;
            }
            return FULLUPDATE_PAYLOADS;
        }

        public boolean hasAnyOfTheFlags(int i2) {
            return (i2 & this.mFlags) != 0;
        }

        public boolean isAdapterPositionUnknown() {
            return (this.mFlags & 512) != 0 || isInvalid();
        }

        public boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            return (this.mFlags & 16) == 0 && !ViewCompat.hasTransientState(this.itemView);
        }

        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        public boolean isScrap() {
            return this.mScrapContainer != null;
        }

        public boolean isTmpDetached() {
            return (this.mFlags & 256) != 0;
        }

        public boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        public boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        public void offsetPosition(int i2, boolean z) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z) {
                this.mPreLayoutPosition += i2;
            }
            this.mPosition += i2;
            if (this.itemView.getLayoutParams() != null) {
                ((LayoutParams) this.itemView.getLayoutParams()).mInsetsDirty = true;
            }
        }

        public void onEnteredHiddenState(RecyclerView recyclerView) {
            int i2 = this.mPendingAccessibilityState;
            if (i2 != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i2;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = ViewCompat.getImportantForAccessibility(this.itemView);
            }
            recyclerView.setChildImportantForAccessibilityInternal(this, 4);
        }

        public void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.setChildImportantForAccessibilityInternal(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        public void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        public void setFlags(int i2, int i3) {
            this.mFlags = (i2 & i3) | (this.mFlags & (~i3));
        }

        public final void setIsRecyclable(boolean z) {
            int i2 = this.mIsRecyclableCount;
            int i3 = z ? i2 - 1 : i2 + 1;
            this.mIsRecyclableCount = i3;
            if (i3 < 0) {
                this.mIsRecyclableCount = 0;
                String str = "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this;
            } else if (!z && i3 == 1) {
                this.mFlags |= 16;
            } else if (z && i3 == 0) {
                this.mFlags &= -17;
            }
        }

        public void setScrapContainer(Recycler recycler, boolean z) {
            this.mScrapContainer = recycler;
            this.mInChangeScrap = z;
        }

        public boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        public boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        public void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            String simpleName = getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName();
            StringBuilder sb = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.mPosition + " id=" + this.mItemId + ", oldPos=" + this.mOldPosition + ", pLpos:" + this.mPreLayoutPosition);
            if (isScrap()) {
                sb.append(" scrap ");
                sb.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb.append(" invalid");
            }
            if (!isBound()) {
                sb.append(" unbound");
            }
            if (needsUpdate()) {
                sb.append(" update");
            }
            if (isRemoved()) {
                sb.append(" removed");
            }
            if (shouldIgnore()) {
                sb.append(" ignored");
            }
            if (isTmpDetached()) {
                sb.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb.append(" not recyclable(" + this.mIsRecyclableCount + ChineseToPinyinResource.Field.RIGHT_BRACKET);
            }
            if (isAdapterPositionUnknown()) {
                sb.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append(i.f803d);
            return sb.toString();
        }

        public void unScrap() {
            this.mScrapContainer.unscrapView(this);
        }

        public boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    public RecyclerView(@NonNull Context context) {
    }

    public static /* synthetic */ void access$000(RecyclerView recyclerView, View view, int i2, ViewGroup.LayoutParams layoutParams) {
    }

    public static /* synthetic */ void access$100(RecyclerView recyclerView, int i2) {
    }

    public static /* synthetic */ boolean access$200(RecyclerView recyclerView) {
    }

    public static /* synthetic */ void access$300(RecyclerView recyclerView, int i2, int i3) {
    }

    private void addAnimatingView(ViewHolder viewHolder) {
    }

    private void animateChange(@NonNull ViewHolder viewHolder, @NonNull ViewHolder viewHolder2, @NonNull ItemAnimator.ItemHolderInfo itemHolderInfo, @NonNull ItemAnimator.ItemHolderInfo itemHolderInfo2, boolean z, boolean z2) {
    }

    private void cancelScroll() {
    }

    public static void clearNestedRecyclerViewIfNotNested(@NonNull ViewHolder viewHolder) {
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i2, int i3) {
    }

    private boolean didChildRangeChange(int i2, int i3) {
    }

    private void dispatchContentChangedIfNecessary() {
    }

    private void dispatchLayoutStep1() {
    }

    private void dispatchLayoutStep2() {
    }

    private void dispatchLayoutStep3() {
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
    }

    @Nullable
    public static RecyclerView findNestedRecyclerView(@NonNull View view) {
    }

    @Nullable
    private View findNextViewToFocus() {
    }

    public static ViewHolder getChildViewHolderInt(View view) {
    }

    public static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
    }

    private int getDeepestFocusedViewWithId(View view) {
    }

    private String getFullClassName(Context context, String str) {
    }

    private NestedScrollingChildHelper getScrollingChildHelper() {
    }

    private void handleMissingPreInfoForChangeError(long j2, ViewHolder viewHolder, ViewHolder viewHolder2) {
    }

    private boolean hasUpdatedView() {
    }

    @SuppressLint({"InlinedApi"})
    private void initAutofill() {
    }

    private void initChildrenHelper() {
    }

    private boolean isPreferredNextFocus(View view, View view2, int i2) {
    }

    private void nestedScrollByInternal(int i2, int i3, @Nullable MotionEvent motionEvent, int i4) {
    }

    private void onPointerUp(MotionEvent motionEvent) {
    }

    private boolean predictiveItemAnimationsEnabled() {
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
    }

    private void pullGlows(float f2, float f3, float f4, float f5) {
    }

    private void recoverFocusFromState() {
    }

    private void releaseGlows() {
    }

    private void requestChildOnScreen(@NonNull View view, @Nullable View view2) {
    }

    private void resetFocusInfo() {
    }

    private void resetScroll() {
    }

    private void saveFocusInfo() {
    }

    private void setAdapterInternal(@Nullable Adapter adapter, boolean z, boolean z2) {
    }

    private void stopScrollersInternal() {
    }

    public void absorbGlows(int i2, int i3) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
    }

    public void addItemDecoration(@NonNull ItemDecoration itemDecoration, int i2) {
    }

    public void addOnChildAttachStateChangeListener(@NonNull OnChildAttachStateChangeListener onChildAttachStateChangeListener) {
    }

    public void addOnItemTouchListener(@NonNull OnItemTouchListener onItemTouchListener) {
    }

    public void addOnScrollListener(@NonNull OnScrollListener onScrollListener) {
    }

    public void addRecyclerListener(@NonNull RecyclerListener recyclerListener) {
    }

    public void animateAppearance(@NonNull ViewHolder viewHolder, @Nullable ItemAnimator.ItemHolderInfo itemHolderInfo, @NonNull ItemAnimator.ItemHolderInfo itemHolderInfo2) {
    }

    public void animateDisappearance(@NonNull ViewHolder viewHolder, @NonNull ItemAnimator.ItemHolderInfo itemHolderInfo, @Nullable ItemAnimator.ItemHolderInfo itemHolderInfo2) {
    }

    public void assertInLayoutOrScroll(String str) {
    }

    public void assertNotInLayoutOrScroll(String str) {
    }

    public boolean canReuseUpdatedViewHolder(ViewHolder viewHolder) {
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    public void clearOldPositions() {
    }

    public void clearOnChildAttachStateChangeListeners() {
    }

    public void clearOnScrollListeners() {
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollExtent() {
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollOffset() {
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollRange() {
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollExtent() {
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollOffset() {
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollRange() {
    }

    public void considerReleasingGlowsOnScroll(int i2, int i3) {
    }

    public void consumePendingUpdateOperations() {
    }

    public void defaultOnMeasure(int i2, int i3) {
    }

    public void dispatchChildAttached(View view) {
    }

    public void dispatchChildDetached(View view) {
    }

    public void dispatchLayout() {
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f2, float f3, boolean z) {
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f2, float f3) {
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
    }

    public void dispatchOnScrollStateChanged(int i2) {
    }

    public void dispatchOnScrolled(int i2, int i3) {
    }

    public void dispatchPendingImportantForAccessibilityChanges() {
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j2) {
    }

    public void ensureBottomGlow() {
    }

    public void ensureLeftGlow() {
    }

    public void ensureRightGlow() {
    }

    public void ensureTopGlow() {
    }

    public String exceptionLabel() {
    }

    public final void fillRemainingScrollValues(State state) {
    }

    @Nullable
    public View findChildViewUnder(float f2, float f3) {
    }

    @Nullable
    public View findContainingItemView(@NonNull View view) {
    }

    @Nullable
    public ViewHolder findContainingViewHolder(@NonNull View view) {
    }

    @Nullable
    public ViewHolder findViewHolderForAdapterPosition(int i2) {
    }

    public ViewHolder findViewHolderForItemId(long j2) {
    }

    @Nullable
    public ViewHolder findViewHolderForLayoutPosition(int i2) {
    }

    @Nullable
    @Deprecated
    public ViewHolder findViewHolderForPosition(int i2) {
    }

    public boolean fling(int i2, int i3) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i2) {
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
    }

    @Nullable
    public Adapter getAdapter() {
    }

    public int getAdapterPositionInRecyclerView(ViewHolder viewHolder) {
    }

    @Override // android.view.View
    public int getBaseline() {
    }

    public long getChangedHolderKey(ViewHolder viewHolder) {
    }

    public int getChildAdapterPosition(@NonNull View view) {
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i2, int i3) {
    }

    public long getChildItemId(@NonNull View view) {
    }

    public int getChildLayoutPosition(@NonNull View view) {
    }

    @Deprecated
    public int getChildPosition(@NonNull View view) {
    }

    public ViewHolder getChildViewHolder(@NonNull View view) {
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
    }

    @Nullable
    public RecyclerViewAccessibilityDelegate getCompatAccessibilityDelegate() {
    }

    public void getDecoratedBoundsWithMargins(@NonNull View view, @NonNull Rect rect) {
    }

    @NonNull
    public EdgeEffectFactory getEdgeEffectFactory() {
    }

    @Nullable
    public ItemAnimator getItemAnimator() {
    }

    public Rect getItemDecorInsetsForChild(View view) {
    }

    @NonNull
    public ItemDecoration getItemDecorationAt(int i2) {
    }

    public int getItemDecorationCount() {
    }

    @Nullable
    public LayoutManager getLayoutManager() {
    }

    public int getMaxFlingVelocity() {
    }

    public int getMinFlingVelocity() {
    }

    public long getNanoTime() {
    }

    @Nullable
    public OnFlingListener getOnFlingListener() {
    }

    public boolean getPreserveFocusAfterLayout() {
    }

    @NonNull
    public RecycledViewPool getRecycledViewPool() {
    }

    public int getScrollState() {
    }

    public boolean hasFixedSize() {
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
    }

    public boolean hasPendingAdapterUpdates() {
    }

    public void initAdapterManager() {
    }

    @VisibleForTesting
    public void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
    }

    public void invalidateGlows() {
    }

    public void invalidateItemDecorations() {
    }

    public boolean isAccessibilityEnabled() {
    }

    public boolean isAnimating() {
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
    }

    public boolean isComputingLayout() {
    }

    @Deprecated
    public boolean isLayoutFrozen() {
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
    }

    public void jumpToPositionForSmoothScroller(int i2) {
    }

    public void markItemDecorInsetsDirty() {
    }

    public void markKnownViewsInvalid() {
    }

    public void nestedScrollBy(int i2, int i3) {
    }

    public void offsetChildrenHorizontal(@Px int i2) {
    }

    public void offsetChildrenVertical(@Px int i2) {
    }

    public void offsetPositionRecordsForInsert(int i2, int i3) {
    }

    public void offsetPositionRecordsForMove(int i2, int i3) {
    }

    public void offsetPositionRecordsForRemove(int i2, int i3, boolean z) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
    }

    public void onChildAttachedToWindow(@NonNull View view) {
    }

    public void onChildDetachedFromWindow(@NonNull View view) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    public void onEnterLayoutOrScroll() {
    }

    public void onExitLayoutOrScroll() {
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
    }

    public void onScrollStateChanged(int i2) {
    }

    public void onScrolled(@Px int i2, @Px int i3) {
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    public void postAnimationRunner() {
    }

    public void processDataSetCompletelyChanged(boolean z) {
    }

    public void recordAnimationInfoIfBouncedHiddenView(ViewHolder viewHolder, ItemAnimator.ItemHolderInfo itemHolderInfo) {
    }

    public void removeAndRecycleViews() {
    }

    public boolean removeAnimatingView(View view) {
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z) {
    }

    public void removeItemDecoration(@NonNull ItemDecoration itemDecoration) {
    }

    public void removeItemDecorationAt(int i2) {
    }

    public void removeOnChildAttachStateChangeListener(@NonNull OnChildAttachStateChangeListener onChildAttachStateChangeListener) {
    }

    public void removeOnItemTouchListener(@NonNull OnItemTouchListener onItemTouchListener) {
    }

    public void removeOnScrollListener(@NonNull OnScrollListener onScrollListener) {
    }

    public void removeRecyclerListener(@NonNull RecyclerListener recyclerListener) {
    }

    public void repositionShadowingViews() {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
    }

    public void saveOldPositions() {
    }

    @Override // android.view.View
    public void scrollBy(int i2, int i3) {
    }

    public boolean scrollByInternal(int i2, int i3, MotionEvent motionEvent, int i4) {
    }

    public void scrollStep(int i2, int i3, @Nullable int[] iArr) {
    }

    @Override // android.view.View
    public void scrollTo(int i2, int i3) {
    }

    public void scrollToPosition(int i2) {
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
    }

    public void setAccessibilityDelegateCompat(@Nullable RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate) {
    }

    public void setAdapter(@Nullable Adapter adapter) {
    }

    public void setChildDrawingOrderCallback(@Nullable ChildDrawingOrderCallback childDrawingOrderCallback) {
    }

    @VisibleForTesting
    public boolean setChildImportantForAccessibilityInternal(ViewHolder viewHolder, int i2) {
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
    }

    public void setEdgeEffectFactory(@NonNull EdgeEffectFactory edgeEffectFactory) {
    }

    public void setHasFixedSize(boolean z) {
    }

    public void setItemAnimator(@Nullable ItemAnimator itemAnimator) {
    }

    public void setItemViewCacheSize(int i2) {
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
    }

    public void setLayoutManager(@Nullable LayoutManager layoutManager) {
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z) {
    }

    public void setOnFlingListener(@Nullable OnFlingListener onFlingListener) {
    }

    @Deprecated
    public void setOnScrollListener(@Nullable OnScrollListener onScrollListener) {
    }

    public void setPreserveFocusAfterLayout(boolean z) {
    }

    public void setRecycledViewPool(@Nullable RecycledViewPool recycledViewPool) {
    }

    @Deprecated
    public void setRecyclerListener(@Nullable RecyclerListener recyclerListener) {
    }

    public void setScrollState(int i2) {
    }

    public void setScrollingTouchSlop(int i2) {
    }

    public void setViewCacheExtension(@Nullable ViewCacheExtension viewCacheExtension) {
    }

    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
    }

    public void smoothScrollBy(@Px int i2, @Px int i3) {
    }

    public void smoothScrollToPosition(int i2) {
    }

    public void startInterceptRequestLayout() {
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean startNestedScroll(int i2) {
    }

    public void stopInterceptRequestLayout(boolean z) {
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void stopNestedScroll() {
    }

    public void stopScroll() {
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
    }

    public void swapAdapter(@Nullable Adapter adapter, boolean z) {
    }

    public void viewRangeUpdate(int i2, int i3, Object obj) {
    }

    public RecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr, int i6) {
    }

    @Nullable
    public ViewHolder findViewHolderForPosition(int i2, boolean z) {
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean hasNestedScrollingParent(int i2) {
    }

    public void onExitLayoutOrScroll(boolean z) {
    }

    public void smoothScrollBy(@Px int i2, @Px int i3, @Nullable Interpolator interpolator) {
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean startNestedScroll(int i2, int i3) {
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public void stopNestedScroll(int i2) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = null;
        public Parcelable mLayoutState;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$SavedState$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass1 implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object[] newArray(int i2) {
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public /* bridge */ /* synthetic */ SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i2) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
        }

        public void copyFrom(SavedState savedState) {
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
        }

        public SavedState(Parcelable parcelable) {
        }
    }

    public RecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }

    @Override // androidx.core.view.NestedScrollingChild3
    public final void dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr, int i6, @NonNull int[] iArr2) {
    }

    public void smoothScrollBy(@Px int i2, @Px int i3, @Nullable Interpolator interpolator, int i4) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public final Rect mDecorInsets;
        public boolean mInsetsDirty;
        public boolean mPendingInvalidate;
        public ViewHolder mViewHolder;

        public LayoutParams(Context context, AttributeSet attributeSet) {
        }

        public int getAbsoluteAdapterPosition() {
        }

        public int getBindingAdapterPosition() {
        }

        @Deprecated
        public int getViewAdapterPosition() {
        }

        public int getViewLayoutPosition() {
        }

        @Deprecated
        public int getViewPosition() {
        }

        public boolean isItemChanged() {
        }

        public boolean isItemRemoved() {
        }

        public boolean isViewInvalid() {
        }

        public boolean viewNeedsUpdate() {
        }

        public LayoutParams(int i2, int i3) {
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
        }

        public LayoutParams(LayoutParams layoutParams) {
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    public void smoothScrollBy(@Px int i2, @Px int i3, @Nullable Interpolator interpolator, int i4, boolean z) {
    }

    public void addItemDecoration(@NonNull ItemDecoration itemDecoration) {
    }
}
