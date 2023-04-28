package com.mob.tools.gui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class ScaledImageView extends ImageView implements View.OnTouchListener {
    private static final int DRAG_1 = 1;
    private static final int DRAG_2 = 2;
    private static final int NONE = 0;
    private static final int ZOOM = 3;
    private Bitmap bitmap;
    private float distSquare;
    private float[] downPoint;
    private int dragScrollMinDistSquare;
    private OnMatrixChangedListener listener;
    private Matrix matrix;
    private int mode;
    private Matrix savedMatrix;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface OnMatrixChangedListener {
        void onMactrixChage(Matrix matrix);
    }

    public ScaledImageView(Context context) {
    }

    private void init(Context context) {
    }

    public Bitmap getCropedBitmap(Rect rect) {
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
    }

    public void rotateLeft() {
    }

    public void rotateRight() {
    }

    public void setBitmap(Bitmap bitmap) {
    }

    public void setOnMatrixChangedListener(OnMatrixChangedListener onMatrixChangedListener) {
    }

    public void zoomIn() {
    }

    public void zoomOut() {
    }

    public ScaledImageView(Context context, AttributeSet attributeSet) {
    }

    public ScaledImageView(Context context, AttributeSet attributeSet, int i2) {
    }
}
