package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class LinearLayoutManager extends RecyclerView.LayoutManager implements ItemTouchHelper.ViewDropHandler, RecyclerView.SmoothScroller.ScrollVectorProvider {
    public static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    public final AnchorInfo mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final LayoutChunkResult mLayoutChunkResult;
    private LayoutState mLayoutState;
    public int mOrientation;
    public OrientationHelper mOrientationHelper;
    public SavedState mPendingSavedState;
    public int mPendingScrollPosition;
    public int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private int[] mReusableIntPair;
    private boolean mReverseLayout;
    public boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnchorInfo {
        public int mCoordinate;
        public boolean mLayoutFromEnd;
        public OrientationHelper mOrientationHelper;
        public int mPosition;
        public boolean mValid;

        public void assignCoordinateFromPadding() {
        }

        public void assignFromView(View view, int i2) {
        }

        public void assignFromViewAndKeepVisibleRect(View view, int i2) {
        }

        public boolean isViewValidAsAnchor(View view, RecyclerView.State state) {
        }

        public void reset() {
        }

        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class LayoutChunkResult {
        public int mConsumed;
        public boolean mFinished;
        public boolean mFocusable;
        public boolean mIgnoreConsumed;

        public void resetInternal() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class LayoutState {
        public static final int INVALID_LAYOUT = Integer.MIN_VALUE;
        public static final int ITEM_DIRECTION_HEAD = -1;
        public static final int ITEM_DIRECTION_TAIL = 1;
        public static final int LAYOUT_END = 1;
        public static final int LAYOUT_START = -1;
        public static final int SCROLLING_OFFSET_NaN = Integer.MIN_VALUE;
        public static final String TAG = "LLM#LayoutState";
        public int mAvailable;
        public int mCurrentPosition;
        public int mExtraFillSpace;
        public boolean mInfinite;
        public boolean mIsPreLayout;
        public int mItemDirection;
        public int mLastScrollDelta;
        public int mLayoutDirection;
        public int mNoRecycleSpace;
        public int mOffset;
        public boolean mRecycle;
        public List<RecyclerView.ViewHolder> mScrapList;
        public int mScrollingOffset;

        private View nextViewFromScrapList() {
        }

        public void assignPositionFromScrapList() {
        }

        public boolean hasMore(RecyclerView.State state) {
        }

        public void log() {
        }

        public View next(RecyclerView.Recycler recycler) {
        }

        public View nextViewInLimitedList(View view) {
        }

        public void assignPositionFromScrapList(View view) {
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = null;
        public boolean mAnchorLayoutFromEnd;
        public int mAnchorOffset;
        public int mAnchorPosition;

        /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$SavedState$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass1 implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ SavedState createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ SavedState[] newArray(int i2) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i2) {
            }
        }

        public SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
        }

        public boolean hasValidAnchor() {
        }

        public void invalidateAnchor() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
        }

        public SavedState(Parcel parcel) {
        }

        public SavedState(SavedState savedState) {
        }
    }

    public LinearLayoutManager(Context context) {
    }

    private int computeScrollExtent(RecyclerView.State state) {
    }

    private int computeScrollOffset(RecyclerView.State state) {
    }

    private int computeScrollRange(RecyclerView.State state) {
    }

    private View findFirstPartiallyOrCompletelyInvisibleChild() {
    }

    private View findLastPartiallyOrCompletelyInvisibleChild() {
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToEnd() {
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToStart() {
    }

    private int fixLayoutEndGap(int i2, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
    }

    private int fixLayoutStartGap(int i2, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
    }

    private View getChildClosestToEnd() {
    }

    private View getChildClosestToStart() {
    }

    private void layoutForPredictiveAnimations(RecyclerView.Recycler recycler, RecyclerView.State state, int i2, int i3) {
    }

    private void logChildren() {
    }

    private void recycleByLayoutState(RecyclerView.Recycler recycler, LayoutState layoutState) {
    }

    private void recycleChildren(RecyclerView.Recycler recycler, int i2, int i3) {
    }

    private void recycleViewsFromEnd(RecyclerView.Recycler recycler, int i2, int i3) {
    }

    private void recycleViewsFromStart(RecyclerView.Recycler recycler, int i2, int i3) {
    }

    private void resolveShouldLayoutReverse() {
    }

    private boolean updateAnchorFromChildren(RecyclerView.Recycler recycler, RecyclerView.State state, AnchorInfo anchorInfo) {
    }

    private boolean updateAnchorFromPendingData(RecyclerView.State state, AnchorInfo anchorInfo) {
    }

    private void updateAnchorInfoForLayout(RecyclerView.Recycler recycler, RecyclerView.State state, AnchorInfo anchorInfo) {
    }

    private void updateLayoutState(int i2, int i3, boolean z, RecyclerView.State state) {
    }

    private void updateLayoutStateToFillEnd(AnchorInfo anchorInfo) {
    }

    private void updateLayoutStateToFillStart(AnchorInfo anchorInfo) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void assertNotInLayoutOrScroll(String str) {
    }

    public void calculateExtraLayoutSpace(@NonNull RecyclerView.State state, @NonNull int[] iArr) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void collectAdjacentPrefetchPositions(int i2, int i3, RecyclerView.State state, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void collectInitialPrefetchPositions(int i2, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
    }

    public void collectPrefetchPositionsForLayoutState(RecyclerView.State state, LayoutState layoutState, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(RecyclerView.State state) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(RecyclerView.State state) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(RecyclerView.State state) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    public PointF computeScrollVectorForPosition(int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(RecyclerView.State state) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.State state) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(RecyclerView.State state) {
    }

    public int convertFocusDirectionToLayoutDirection(int i2) {
    }

    public LayoutState createLayoutState() {
    }

    public void ensureLayoutState() {
    }

    public int fill(RecyclerView.Recycler recycler, LayoutState layoutState, RecyclerView.State state, boolean z) {
    }

    public int findFirstCompletelyVisibleItemPosition() {
    }

    public View findFirstVisibleChildClosestToEnd(boolean z, boolean z2) {
    }

    public View findFirstVisibleChildClosestToStart(boolean z, boolean z2) {
    }

    public int findFirstVisibleItemPosition() {
    }

    public int findLastCompletelyVisibleItemPosition() {
    }

    public int findLastVisibleItemPosition() {
    }

    public View findOnePartiallyOrCompletelyInvisibleChild(int i2, int i3) {
    }

    public View findOneVisibleChild(int i2, int i3, boolean z, boolean z2) {
    }

    public View findReferenceChild(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z, boolean z2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public View findViewByPosition(int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
    }

    @Deprecated
    public int getExtraLayoutSpace(RecyclerView.State state) {
    }

    public int getInitialPrefetchItemCount() {
    }

    public int getOrientation() {
    }

    public boolean getRecycleChildrenOnDetach() {
    }

    public boolean getReverseLayout() {
    }

    public boolean getStackFromEnd() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isAutoMeasureEnabled() {
    }

    public boolean isLayoutRTL() {
    }

    public boolean isSmoothScrollbarEnabled() {
    }

    public void layoutChunk(RecyclerView.Recycler recycler, RecyclerView.State state, LayoutState layoutState, LayoutChunkResult layoutChunkResult) {
    }

    public void onAnchorReady(RecyclerView.Recycler recycler, RecyclerView.State state, AnchorInfo anchorInfo, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public View onFocusSearchFailed(View view, int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public Parcelable onSaveInstanceState() {
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.ViewDropHandler
    public void prepareForDrop(@NonNull View view, @NonNull View view2, int i2, int i3) {
    }

    public boolean resolveIsInfinite() {
    }

    public int scrollBy(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i2) {
    }

    public void scrollToPositionWithOffset(int i2, int i3) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
    }

    public void setInitialPrefetchItemCount(int i2) {
    }

    public void setOrientation(int i2) {
    }

    public void setRecycleChildrenOnDetach(boolean z) {
    }

    public void setReverseLayout(boolean z) {
    }

    public void setSmoothScrollbarEnabled(boolean z) {
    }

    public void setStackFromEnd(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean shouldMeasureTwice() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
    }

    public void validateChildOrder() {
    }

    public LinearLayoutManager(Context context, int i2, boolean z) {
    }

    private void updateLayoutStateToFillEnd(int i2, int i3) {
    }

    private void updateLayoutStateToFillStart(int i2, int i3) {
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
    }
}
