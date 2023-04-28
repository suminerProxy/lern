package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class LinearSmoothScroller extends RecyclerView.SmoothScroller {
    private static final boolean DEBUG = false;
    private static final float MILLISECONDS_PER_INCH = 25.0f;
    public static final int SNAP_TO_ANY = 0;
    public static final int SNAP_TO_END = 1;
    public static final int SNAP_TO_START = -1;
    private static final float TARGET_SEEK_EXTRA_SCROLL_RATIO = 1.2f;
    private static final int TARGET_SEEK_SCROLL_DISTANCE_PX = 10000;
    public final DecelerateInterpolator mDecelerateInterpolator;
    private final DisplayMetrics mDisplayMetrics;
    private boolean mHasCalculatedMillisPerPixel;
    public int mInterimTargetDx;
    public int mInterimTargetDy;
    public final LinearInterpolator mLinearInterpolator;
    private float mMillisPerPixel;
    public PointF mTargetVector;

    public LinearSmoothScroller(Context context) {
    }

    private int clampApplyScroll(int i2, int i3) {
    }

    private float getSpeedPerPixel() {
    }

    public int calculateDtToFit(int i2, int i3, int i4, int i5, int i6) {
    }

    public int calculateDxToMakeVisible(View view, int i2) {
    }

    public int calculateDyToMakeVisible(View view, int i2) {
    }

    public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
    }

    public int calculateTimeForDeceleration(int i2) {
    }

    public int calculateTimeForScrolling(int i2) {
    }

    public int getHorizontalSnapPreference() {
    }

    public int getVerticalSnapPreference() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public void onSeekTargetStep(int i2, int i3, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public void onStart() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public void onStop() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
    }

    public void updateActionForInterimTarget(RecyclerView.SmoothScroller.Action action) {
    }
}
