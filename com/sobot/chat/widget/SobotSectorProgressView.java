package com.sobot.chat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotSectorProgressView extends ImageView {
    private static final float maxConstant = 100.0f;
    private RectF dstRect;
    private int fgColor;
    private Paint fgPaint;
    private float mMax;
    private Paint mPaint;
    private Xfermode mXfermode;
    private RectF oval;
    private float progress;
    private float rangePercent;
    private float startAngle;

    public SobotSectorProgressView(Context context, AttributeSet attributeSet) {
    }

    private void init() {
    }

    public float getProgress() {
    }

    public float getStartAngle() {
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
    }

    public void setMax(int i2) {
    }

    public void setProgress(float f2) {
    }

    public void setStartAngle(float f2) {
    }
}
