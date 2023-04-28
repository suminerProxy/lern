package com.tencent.qcloud.tuicore.component.gatherimage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.widget.ImageView;
import androidx.annotation.Nullable;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ShadeImageView extends ImageView {
    private static SparseArray<Bitmap> sRoundBitmapArray;
    private Bitmap mRoundBitmap;
    private Paint mShadePaint;
    private int radius;

    public ShadeImageView(Context context) {
    }

    private Bitmap getRoundBitmap() {
    }

    private void init(Context context, AttributeSet attributeSet) {
    }

    public int getRadius() {
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
    }

    public void setRadius(int i2) {
    }

    public ShadeImageView(Context context, @Nullable AttributeSet attributeSet) {
    }

    public ShadeImageView(Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
