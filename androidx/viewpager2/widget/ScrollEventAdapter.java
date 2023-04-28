package androidx.viewpager2.widget;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class ScrollEventAdapter extends RecyclerView.OnScrollListener {
    private static final int NO_POSITION = -1;
    private static final int STATE_IDLE = 0;
    private static final int STATE_IN_PROGRESS_FAKE_DRAG = 4;
    private static final int STATE_IN_PROGRESS_IMMEDIATE_SCROLL = 3;
    private static final int STATE_IN_PROGRESS_MANUAL_DRAG = 1;
    private static final int STATE_IN_PROGRESS_SMOOTH_SCROLL = 2;
    private int mAdapterState;
    private ViewPager2.OnPageChangeCallback mCallback;
    private boolean mDataSetChangeHappened;
    private boolean mDispatchSelected;
    private int mDragStartPosition;
    private boolean mFakeDragging;
    @NonNull
    private final LinearLayoutManager mLayoutManager;
    @NonNull
    private final RecyclerView mRecyclerView;
    private boolean mScrollHappened;
    private int mScrollState;
    private ScrollEventValues mScrollValues;
    private int mTarget;
    @NonNull
    private final ViewPager2 mViewPager;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class ScrollEventValues {
        public float mOffset;
        public int mOffsetPx;
        public int mPosition;

        public void reset() {
        }
    }

    public ScrollEventAdapter(@NonNull ViewPager2 viewPager2) {
    }

    private void dispatchScrolled(int i2, float f2, int i3) {
    }

    private void dispatchSelected(int i2) {
    }

    private void dispatchStateChanged(int i2) {
    }

    private int getPosition() {
    }

    private boolean isInAnyDraggingState() {
    }

    private void resetState() {
    }

    private void startDrag(boolean z) {
    }

    private void updateScrollEventValues() {
    }

    public double getRelativeScrollPosition() {
    }

    public int getScrollState() {
    }

    public boolean isDragging() {
    }

    public boolean isFakeDragging() {
    }

    public boolean isIdle() {
    }

    public void notifyBeginFakeDrag() {
    }

    public void notifyDataSetChangeHappened() {
    }

    public void notifyEndFakeDrag() {
    }

    public void notifyProgrammaticScroll(int i2, boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(@NonNull RecyclerView recyclerView, int i2, int i3) {
    }

    public void setOnPageChangeCallback(ViewPager2.OnPageChangeCallback onPageChangeCallback) {
    }
}
