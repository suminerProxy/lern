package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class StaggeredGridLayoutManager extends RecyclerView.LayoutManager implements RecyclerView.SmoothScroller.ScrollVectorProvider {
    public static final boolean DEBUG = false;
    @Deprecated
    public static final int GAP_HANDLING_LAZY = 1;
    public static final int GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS = 2;
    public static final int GAP_HANDLING_NONE = 0;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "StaggeredGridLManager";
    public static final int VERTICAL = 1;
    private final AnchorInfo mAnchorInfo;
    private final Runnable mCheckForGapsRunnable;
    private int mFullSizeSpec;
    private int mGapStrategy;
    private boolean mLaidOutInvalidFullSpan;
    private boolean mLastLayoutFromEnd;
    private boolean mLastLayoutRTL;
    @NonNull
    private final LayoutState mLayoutState;
    public LazySpanLookup mLazySpanLookup;
    private int mOrientation;
    private SavedState mPendingSavedState;
    public int mPendingScrollPosition;
    public int mPendingScrollPositionOffset;
    private int[] mPrefetchDistances;
    @NonNull
    public OrientationHelper mPrimaryOrientation;
    private BitSet mRemainingSpans;
    public boolean mReverseLayout;
    @NonNull
    public OrientationHelper mSecondaryOrientation;
    public boolean mShouldReverseLayout;
    private int mSizePerSpan;
    private boolean mSmoothScrollbarEnabled;
    private int mSpanCount;
    public Span[] mSpans;
    private final Rect mTmpRect;

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ StaggeredGridLayoutManager this$0;

        public AnonymousClass1(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class LayoutParams extends RecyclerView.LayoutParams {
        public static final int INVALID_SPAN_ID = -1;
        public boolean mFullSpan;
        public Span mSpan;

        public LayoutParams(Context context, AttributeSet attributeSet) {
        }

        public final int getSpanIndex() {
        }

        public boolean isFullSpan() {
        }

        public void setFullSpan(boolean z) {
        }

        public LayoutParams(int i2, int i3) {
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
        }

        public LayoutParams(RecyclerView.LayoutParams layoutParams) {
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = null;
        public boolean mAnchorLayoutFromEnd;
        public int mAnchorPosition;
        public List<LazySpanLookup.FullSpanItem> mFullSpanItems;
        public boolean mLastLayoutRTL;
        public boolean mReverseLayout;
        public int[] mSpanLookup;
        public int mSpanLookupSize;
        public int[] mSpanOffsets;
        public int mSpanOffsetsSize;
        public int mVisibleAnchorPosition;

        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState$1  reason: invalid class name */
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

        public void invalidateAnchorPositionInfo() {
        }

        public void invalidateSpanInfo() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
        }

        public SavedState(Parcel parcel) {
        }

        public SavedState(SavedState savedState) {
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
    }

    private void appendViewToAllSpans(View view) {
    }

    private void applyPendingSavedState(AnchorInfo anchorInfo) {
    }

    private void attachViewToSpans(View view, LayoutParams layoutParams, LayoutState layoutState) {
    }

    private int calculateScrollDirectionForPosition(int i2) {
    }

    private boolean checkSpanForGap(Span span) {
    }

    private int computeScrollExtent(RecyclerView.State state) {
    }

    private int computeScrollOffset(RecyclerView.State state) {
    }

    private int computeScrollRange(RecyclerView.State state) {
    }

    private int convertFocusDirectionToLayoutDirection(int i2) {
    }

    private LazySpanLookup.FullSpanItem createFullSpanItemFromEnd(int i2) {
    }

    private LazySpanLookup.FullSpanItem createFullSpanItemFromStart(int i2) {
    }

    private void createOrientationHelpers() {
    }

    private int fill(RecyclerView.Recycler recycler, LayoutState layoutState, RecyclerView.State state) {
    }

    private int findFirstReferenceChildPosition(int i2) {
    }

    private int findLastReferenceChildPosition(int i2) {
    }

    private void fixEndGap(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
    }

    private void fixStartGap(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
    }

    private int getMaxEnd(int i2) {
    }

    private int getMaxStart(int i2) {
    }

    private int getMinEnd(int i2) {
    }

    private int getMinStart(int i2) {
    }

    private Span getNextSpan(LayoutState layoutState) {
    }

    private void handleUpdate(int i2, int i3, int i4) {
    }

    private void measureChildWithDecorationsAndMargin(View view, LayoutParams layoutParams, boolean z) {
    }

    private boolean preferLastSpan(int i2) {
    }

    private void prependViewToAllSpans(View view) {
    }

    private void recycle(RecyclerView.Recycler recycler, LayoutState layoutState) {
    }

    private void recycleFromEnd(RecyclerView.Recycler recycler, int i2) {
    }

    private void recycleFromStart(RecyclerView.Recycler recycler, int i2) {
    }

    private void repositionToWrapContentIfNecessary() {
    }

    private void resolveShouldLayoutReverse() {
    }

    private void setLayoutStateDirection(int i2) {
    }

    private void updateAllRemainingSpans(int i2, int i3) {
    }

    private boolean updateAnchorFromChildren(RecyclerView.State state, AnchorInfo anchorInfo) {
    }

    private void updateLayoutState(int i2, RecyclerView.State state) {
    }

    private void updateRemainingSpans(Span span, int i2, int i3) {
    }

    private int updateSpecWithExtra(int i2, int i3, int i4) {
    }

    public boolean areAllEndsEqual() {
    }

    public boolean areAllStartsEqual() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void assertNotInLayoutOrScroll(String str) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
    }

    public boolean checkForGaps() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void collectAdjacentPrefetchPositions(int i2, int i3, RecyclerView.State state, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
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

    public int[] findFirstCompletelyVisibleItemPositions(int[] iArr) {
    }

    public View findFirstVisibleItemClosestToEnd(boolean z) {
    }

    public View findFirstVisibleItemClosestToStart(boolean z) {
    }

    public int findFirstVisibleItemPositionInt() {
    }

    public int[] findFirstVisibleItemPositions(int[] iArr) {
    }

    public int[] findLastCompletelyVisibleItemPositions(int[] iArr) {
    }

    public int[] findLastVisibleItemPositions(int[] iArr) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
    }

    public int getFirstChildPosition() {
    }

    public int getGapStrategy() {
    }

    public int getLastChildPosition() {
    }

    public int getOrientation() {
    }

    public boolean getReverseLayout() {
    }

    public int getSpanCount() {
    }

    public View hasGapsToFix() {
    }

    public void invalidateSpanAssignments() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isAutoMeasureEnabled() {
    }

    public boolean isLayoutRTL() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void offsetChildrenHorizontal(int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void offsetChildrenVertical(int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAdapterChanged(@Nullable RecyclerView.Adapter adapter, @Nullable RecyclerView.Adapter adapter2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @Nullable
    public View onFocusSearchFailed(View view, int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(RecyclerView recyclerView, int i2, int i3) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsChanged(RecyclerView recyclerView) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsMoved(RecyclerView recyclerView, int i2, int i3, int i4) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(RecyclerView recyclerView, int i2, int i3) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(RecyclerView recyclerView, int i2, int i3, Object obj) {
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

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onScrollStateChanged(int i2) {
    }

    public void prepareLayoutStateForDelta(int i2, RecyclerView.State state) {
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

    public void setGapStrategy(int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void setMeasuredDimension(Rect rect, int i2, int i3) {
    }

    public void setOrientation(int i2) {
    }

    public void setReverseLayout(boolean z) {
    }

    public void setSpanCount(int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
    }

    public boolean updateAnchorFromPendingData(RecyclerView.State state, AnchorInfo anchorInfo) {
    }

    public void updateAnchorInfoForLayout(RecyclerView.State state, AnchorInfo anchorInfo) {
    }

    public void updateMeasureSpecs(int i2) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnchorInfo {
        public boolean mInvalidateOffsets;
        public boolean mLayoutFromEnd;
        public int mOffset;
        public int mPosition;
        public int[] mSpanReferenceLines;
        public boolean mValid;
        public final /* synthetic */ StaggeredGridLayoutManager this$0;

        public AnchorInfo(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        }

        public void assignCoordinateFromPadding() {
        }

        public void reset() {
        }

        public void saveSpanReferenceLines(Span[] spanArr) {
        }

        public void assignCoordinateFromPadding(int i2) {
        }
    }

    private void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class Span {
        public static final int INVALID_LINE = Integer.MIN_VALUE;
        public int mCachedEnd;
        public int mCachedStart;
        public int mDeletedSize;
        public final int mIndex;
        public ArrayList<View> mViews;
        public final /* synthetic */ StaggeredGridLayoutManager this$0;

        public Span(StaggeredGridLayoutManager staggeredGridLayoutManager, int i2) {
        }

        public void appendToSpan(View view) {
        }

        public void cacheReferenceLineAndClear(boolean z, int i2) {
        }

        public void calculateCachedEnd() {
        }

        public void calculateCachedStart() {
        }

        public void clear() {
        }

        public int findFirstCompletelyVisibleItemPosition() {
        }

        public int findFirstPartiallyVisibleItemPosition() {
        }

        public int findFirstVisibleItemPosition() {
        }

        public int findLastCompletelyVisibleItemPosition() {
        }

        public int findLastPartiallyVisibleItemPosition() {
        }

        public int findLastVisibleItemPosition() {
        }

        public int findOnePartiallyOrCompletelyVisibleChild(int i2, int i3, boolean z, boolean z2, boolean z3) {
        }

        public int findOnePartiallyVisibleChild(int i2, int i3, boolean z) {
        }

        public int findOneVisibleChild(int i2, int i3, boolean z) {
        }

        public int getDeletedSize() {
        }

        public int getEndLine(int i2) {
        }

        public View getFocusableViewAfter(int i2, int i3) {
        }

        public LayoutParams getLayoutParams(View view) {
        }

        public int getStartLine(int i2) {
        }

        public void invalidateCache() {
        }

        public void onOffset(int i2) {
        }

        public void popEnd() {
        }

        public void popStart() {
        }

        public void prependToSpan(View view) {
        }

        public void setLine(int i2) {
        }

        public int getEndLine() {
        }

        public int getStartLine() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class LazySpanLookup {
        private static final int MIN_SIZE = 10;
        public int[] mData;
        public List<FullSpanItem> mFullSpanItems;

        private int invalidateFullSpansAfter(int i2) {
        }

        private void offsetFullSpansForAddition(int i2, int i3) {
        }

        private void offsetFullSpansForRemoval(int i2, int i3) {
        }

        public void addFullSpanItem(FullSpanItem fullSpanItem) {
        }

        public void clear() {
        }

        public void ensureSize(int i2) {
        }

        public int forceInvalidateAfter(int i2) {
        }

        public FullSpanItem getFirstFullSpanItemInRange(int i2, int i3, int i4, boolean z) {
        }

        public FullSpanItem getFullSpanItem(int i2) {
        }

        public int getSpan(int i2) {
        }

        public int invalidateAfter(int i2) {
        }

        public void offsetForAddition(int i2, int i3) {
        }

        public void offsetForRemoval(int i2, int i3) {
        }

        public void setSpan(int i2, Span span) {
        }

        public int sizeForPosition(int i2) {
        }

        @SuppressLint({"BanParcelableUsage"})
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = null;
            public int mGapDir;
            public int[] mGapPerSpan;
            public boolean mHasUnwantedGapAfter;
            public int mPosition;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1  reason: invalid class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
            public class AnonymousClass1 implements Parcelable.Creator<FullSpanItem> {
                @Override // android.os.Parcelable.Creator
                public /* bridge */ /* synthetic */ FullSpanItem createFromParcel(Parcel parcel) {
                }

                @Override // android.os.Parcelable.Creator
                public /* bridge */ /* synthetic */ FullSpanItem[] newArray(int i2) {
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public FullSpanItem createFromParcel(Parcel parcel) {
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public FullSpanItem[] newArray(int i2) {
                }
            }

            public FullSpanItem(Parcel parcel) {
            }

            @Override // android.os.Parcelable
            public int describeContents() {
            }

            public int getGapForSpan(int i2) {
            }

            public String toString() {
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i2) {
            }

            public FullSpanItem() {
            }
        }
    }

    public StaggeredGridLayoutManager(int i2, int i3) {
    }

    private void measureChildWithDecorationsAndMargin(View view, int i2, int i3, boolean z) {
    }
}
