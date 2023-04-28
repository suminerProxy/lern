package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior<View> {
    private int overlayTop;
    public final Rect tempRect1;
    public final Rect tempRect2;
    private int verticalLayoutGap;

    public HeaderScrollingViewBehavior() {
    }

    private static int resolveGravity(int i2) {
    }

    @Nullable
    public abstract View findFirstDependency(List<View> list);

    public final int getOverlapPixelsForOffset(View view) {
    }

    public float getOverlapRatioForOffset(View view) {
    }

    public final int getOverlayTop() {
    }

    public int getScrollRange(@NonNull View view) {
    }

    public final int getVerticalLayoutGap() {
    }

    @Override // com.google.android.material.appbar.ViewOffsetBehavior
    public void layoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i2) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i2, int i3, int i4, int i5) {
    }

    public final void setOverlayTop(int i2) {
    }

    public boolean shouldHeaderOverlapScrollingChild() {
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
    }
}
