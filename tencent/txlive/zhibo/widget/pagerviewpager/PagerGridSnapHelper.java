package tencent.txlive.zhibo.widget.pagerviewpager;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class PagerGridSnapHelper extends SnapHelper {
    private RecyclerView mRecyclerView;

    private boolean snapFromFling(@NonNull RecyclerView.LayoutManager layoutManager, int i2, int i3) {
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public void attachToRecyclerView(@Nullable RecyclerView recyclerView) throws IllegalStateException {
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    @Nullable
    public int[] calculateDistanceToFinalSnap(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull View view) {
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public /* bridge */ /* synthetic */ RecyclerView.SmoothScroller createScroller(RecyclerView.LayoutManager layoutManager) {
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    @Nullable
    public View findSnapView(RecyclerView.LayoutManager layoutManager) {
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i2, int i3) {
    }

    @Override // androidx.recyclerview.widget.SnapHelper, androidx.recyclerview.widget.RecyclerView.OnFlingListener
    public boolean onFling(int i2, int i3) {
    }

    public void setFlingThreshold(int i2) {
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public LinearSmoothScroller createScroller(RecyclerView.LayoutManager layoutManager) {
    }
}
