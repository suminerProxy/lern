package com.sobot.chat.widget.attachment;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SpaceItemDecoration extends RecyclerView.ItemDecoration {
    public static final int GRIDLAYOUT = 1;
    public static final int LINEARLAYOUT = 0;
    public static final int STAGGEREDGRIDLAYOUT = 2;
    private int headItemCount;
    private boolean includeEdge;
    private int layoutManager;
    private int leftRight;
    private int space;
    private int spanCount;
    private int topBottom;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public @interface LayoutManager {
        int type() default 0;
    }

    public SpaceItemDecoration(int i2, int i3, int i4, int i5) {
    }

    private void setGridLayoutSpaceItemDecoration(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
    }

    private void setGridlayoutSpaceItemDecorition2(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
    }

    private void setLinearLayoutSpaceItemDecoration(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
    }

    private void setNGridLayoutSpaceItemDecoration(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
    }

    public SpaceItemDecoration(int i2, boolean z, int i3) {
    }

    public SpaceItemDecoration(int i2, int i3, boolean z, int i4) {
    }

    public SpaceItemDecoration(int i2, int i3, int i4) {
    }

    public SpaceItemDecoration(int i2, int i3) {
    }
}
