package com.aliyun.identity.face.ui.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import java.lang.ref.WeakReference;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class CircleHoleView extends AppCompatImageView {
    private static final Xfermode SXFERMODE = null;
    private int floodColor;
    public float heightAttr;
    private boolean holeHCenter;
    private boolean holeVCenter;
    public float leftAttr;
    public Context mContext;
    private Bitmap mMaskBitmap;
    private Paint mPaint;
    private WeakReference<Bitmap> mWeakBitmap;
    public float topAttr;
    public float widthAttr;

    public CircleHoleView(Context context) {
    }

    private void initHoleAttrs(Context context, AttributeSet attributeSet) {
    }

    private void sharedConstructor() {
    }

    public void changeBackColor(int i2) {
    }

    public Bitmap createMask1() {
    }

    @Override // android.view.View
    public void invalidate() {
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
    }

    public CircleHoleView(Context context, AttributeSet attributeSet) {
    }

    public CircleHoleView(Context context, AttributeSet attributeSet, int i2) {
    }
}
