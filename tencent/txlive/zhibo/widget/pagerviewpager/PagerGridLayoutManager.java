package tencent.txlive.zhibo.widget.pagerviewpager;

import android.annotation.SuppressLint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import androidx.annotation.IntRange;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class PagerGridLayoutManager extends RecyclerView.LayoutManager implements RecyclerView.SmoothScroller.ScrollVectorProvider {
    public static final int HORIZONTAL = 1;
    private static final String TAG = "PagerGridLayoutManager";
    public static final int VERTICAL = 0;
    private boolean mAllowContinuousScroll;
    private boolean mChangeSelectInScrolling;
    private int mColumns;
    private int mHeightUsed;
    private SparseArray<Rect> mItemFrames;
    private int mItemHeight;
    private int mItemWidth;
    private int mLastPageCount;
    private int mLastPageIndex;
    private int mMaxScrollX;
    private int mMaxScrollY;
    private int mOffsetX;
    private int mOffsetY;
    private int mOnePageSize;
    @OrientationType
    private int mOrientation;
    private PageListener mPageListener;
    private RecyclerView mRecyclerView;
    private int mRows;
    private int mScrollState;
    private int mWidthUsed;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public @interface OrientationType {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface PageListener {
        void onPageSelect(int i2);

        void onPageSizeChanged(int i2);
    }

    public PagerGridLayoutManager(@IntRange(from = 1, to = 100) int i2, @IntRange(from = 1, to = 100) int i3, @OrientationType int i4) {
    }

    private void addOrRemove(RecyclerView.Recycler recycler, Rect rect, int i2) {
    }

    private Rect getItemFrameByPosition(int i2) {
    }

    private int getPageIndexByOffset() {
    }

    private int getPageIndexByPos(int i2) {
    }

    private int[] getPageLeftTopByPosition(int i2) {
    }

    private int getTotalPageCount() {
    }

    private int getUsableHeight() {
    }

    private int getUsableWidth() {
    }

    @SuppressLint({"CheckResult"})
    private void recycleAndFillItems(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
    }

    private void setPageCount(int i2) {
    }

    private void setPageIndex(int i2, boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    public PointF computeScrollVectorForPosition(int i2) {
    }

    public int findNextPageFirstPos() {
    }

    public int findPrePageFirstPos() {
    }

    public View findSnapView() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
    }

    public int getOffsetX() {
    }

    public int getOffsetY() {
    }

    public int[] getSnapOffset(int i2) {
    }

    public boolean isAllowContinuousScroll() {
    }

    public void nextPage() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(RecyclerView recyclerView) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onMeasure(RecyclerView.Recycler recycler, RecyclerView.State state, int i2, int i3) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onScrollStateChanged(int i2) {
    }

    public void prePage() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
    }

    public void scrollToPage(int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
    }

    public void setAllowContinuousScroll(boolean z) {
    }

    public void setChangeSelectInScrolling(boolean z) {
    }

    @OrientationType
    public int setOrientationType(@OrientationType int i2) {
    }

    public void setPageListener(PageListener pageListener) {
    }

    public void smoothNextPage() {
    }

    public void smoothPrePage() {
    }

    public void smoothScrollToPage(int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i2) {
    }
}
