package com.aliyun.identity.ocr.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import java.lang.ref.WeakReference;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class RectMaskView extends AppCompatImageView {
    private static final Xfermode SXFERMODE = null;
    private Bitmap mMaskBitmap;
    private Paint mRectHolePaint;
    private Paint mRectStrokePaint;
    private WeakReference<Bitmap> mWeakBitmap;
    private int rectColor;
    private boolean rectHCenter;
    private float rectHeight;
    private float rectLeft;
    private int rectRoundCx;
    private float rectTop;
    private boolean rectVCenter;
    private float rectWidth;
    private int strokeWidth;

    public RectMaskView(Context context) {
    }

    private void initRectAttrs(Context context, AttributeSet attributeSet) {
    }

    private void sharedConstructor() {
    }

    public Bitmap createMask1() {
    }

    public int getRectColor() {
    }

    public float getRectHeigth() {
    }

    public float getRectLeft() {
    }

    public int getRectRoundCx() {
    }

    public float getRectTop() {
    }

    public float getRectWidth() {
    }

    public int getStrokeWidth() {
    }

    @Override // android.view.View
    public void invalidate() {
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
    }

    public void setRectColor(int i2) {
    }

    public void setRectHeight(int i2) {
    }

    public void setRectLeft(int i2) {
    }

    public void setRectRoundCx(int i2) {
    }

    public void setRectTop(int i2) {
    }

    public void setRectWidth(int i2) {
    }

    public void setStrokeWidth(int i2) {
    }

    public RectMaskView(Context context, AttributeSet attributeSet) {
    }

    public RectMaskView(Context context, AttributeSet attributeSet, int i2) {
    }
}
