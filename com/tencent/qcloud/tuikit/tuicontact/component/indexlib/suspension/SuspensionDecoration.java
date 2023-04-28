package com.tencent.qcloud.tuikit.tuicontact.component.indexlib.suspension;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class SuspensionDecoration extends RecyclerView.ItemDecoration {
    private static int COLOR_TITLE_BG = 0;
    private static int COLOR_TITLE_BOTTOM_LINE = 0;
    private static int COLOR_TITLE_FONT = 0;
    private static final String TAG = "SuspensionDecoration";
    private Rect mBounds;
    private List<? extends ISuspensionInterface> mDatas;
    private int mHeaderViewCount;
    private Paint mPaint;
    private int mTitleFontSize;
    private int mTitleHeight;

    public SuspensionDecoration(Context context, List<? extends ISuspensionInterface> list) {
    }

    private void drawTitleArea(Canvas canvas, int i2, int i3, View view, RecyclerView.LayoutParams layoutParams, int i4) {
    }

    public int getHeaderViewCount() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
    }

    public SuspensionDecoration setColorTitleBg(int i2) {
    }

    public SuspensionDecoration setColorTitleFont(int i2) {
    }

    public SuspensionDecoration setDatas(List<? extends ISuspensionInterface> list) {
    }

    public SuspensionDecoration setHeaderViewCount(int i2) {
    }

    public SuspensionDecoration setTitleFontSize(int i2) {
    }

    public SuspensionDecoration setTitleHeight(int i2) {
    }
}
