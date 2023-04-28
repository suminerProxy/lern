package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Scroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class SnapHelper extends RecyclerView.OnFlingListener {
    public static final float MILLISECONDS_PER_INCH = 100.0f;
    private Scroller mGravityScroller;
    public RecyclerView mRecyclerView;
    private final RecyclerView.OnScrollListener mScrollListener;

    /* renamed from: androidx.recyclerview.widget.SnapHelper$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 extends RecyclerView.OnScrollListener {
        public boolean mScrolled;
        public final /* synthetic */ SnapHelper this$0;

        public AnonymousClass1(SnapHelper snapHelper) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.SnapHelper$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 extends LinearSmoothScroller {
        public final /* synthetic */ SnapHelper this$0;

        public AnonymousClass2(SnapHelper snapHelper, Context context) {
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
        public void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
        }
    }

    private void destroyCallbacks() {
    }

    private void setupCallbacks() throws IllegalStateException {
    }

    private boolean snapFromFling(@NonNull RecyclerView.LayoutManager layoutManager, int i2, int i3) {
    }

    public void attachToRecyclerView(@Nullable RecyclerView recyclerView) throws IllegalStateException {
    }

    @Nullable
    public abstract int[] calculateDistanceToFinalSnap(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull View view);

    public int[] calculateScrollDistance(int i2, int i3) {
    }

    @Nullable
    public RecyclerView.SmoothScroller createScroller(@NonNull RecyclerView.LayoutManager layoutManager) {
    }

    @Nullable
    @Deprecated
    public LinearSmoothScroller createSnapScroller(@NonNull RecyclerView.LayoutManager layoutManager) {
    }

    @Nullable
    public abstract View findSnapView(RecyclerView.LayoutManager layoutManager);

    public abstract int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i2, int i3);

    @Override // androidx.recyclerview.widget.RecyclerView.OnFlingListener
    public boolean onFling(int i2, int i3) {
    }

    public void snapToTargetExistingView() {
    }
}
