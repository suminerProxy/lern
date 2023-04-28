package androidx.viewpager2.widget;

import android.view.VelocityTracker;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class FakeDrag {
    private int mActualDraggedDistance;
    private long mFakeDragBeginTime;
    private int mMaximumVelocity;
    private final RecyclerView mRecyclerView;
    private float mRequestedDragDistance;
    private final ScrollEventAdapter mScrollEventAdapter;
    private VelocityTracker mVelocityTracker;
    private final ViewPager2 mViewPager;

    public FakeDrag(ViewPager2 viewPager2, ScrollEventAdapter scrollEventAdapter, RecyclerView recyclerView) {
    }

    private void addFakeMotionEvent(long j2, int i2, float f2, float f3) {
    }

    private void beginFakeVelocityTracker() {
    }

    @UiThread
    public boolean beginFakeDrag() {
    }

    @UiThread
    public boolean endFakeDrag() {
    }

    @UiThread
    public boolean fakeDragBy(float f2) {
    }

    public boolean isFakeDragging() {
    }
}
