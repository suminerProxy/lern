package com.tencent.qcloud.tuikit.tuichat.component.photoview.view;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.tencent.qcloud.tuikit.tuichat.component.photoview.listener.OnMatrixChangedListener;
import com.tencent.qcloud.tuikit.tuichat.component.photoview.listener.OnOutsidePhotoTapListener;
import com.tencent.qcloud.tuikit.tuichat.component.photoview.listener.OnPhotoTapListener;
import com.tencent.qcloud.tuikit.tuichat.component.photoview.listener.OnScaleChangedListener;
import com.tencent.qcloud.tuikit.tuichat.component.photoview.listener.OnSingleFlingListener;
import com.tencent.qcloud.tuikit.tuichat.component.photoview.listener.OnViewDragListener;
import com.tencent.qcloud.tuikit.tuichat.component.photoview.listener.OnViewTapListener;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class PhotoView extends AppCompatImageView {
    private PhotoViewAttacher attacher;
    private ImageView.ScaleType pendingScaleType;

    public PhotoView(Context context) {
    }

    private void init() {
    }

    public PhotoViewAttacher getAttacher() {
    }

    public void getDisplayMatrix(Matrix matrix) {
    }

    public RectF getDisplayRect() {
    }

    @Override // android.widget.ImageView
    public Matrix getImageMatrix() {
    }

    public float getMaximumScale() {
    }

    public float getMediumScale() {
    }

    public float getMinimumScale() {
    }

    public float getScale() {
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
    }

    public void getSuppMatrix(Matrix matrix) {
    }

    public boolean isZoomable() {
    }

    public void setAllowParentInterceptOnEdge(boolean z) {
    }

    public boolean setDisplayMatrix(Matrix matrix) {
    }

    @Override // android.widget.ImageView
    public boolean setFrame(int i2, int i3, int i4, int i5) {
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i2) {
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
    }

    public void setMaximumScale(float f2) {
    }

    public void setMediumScale(float f2) {
    }

    public void setMinimumScale(float f2) {
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
    }

    public void setOnMatrixChangeListener(OnMatrixChangedListener onMatrixChangedListener) {
    }

    public void setOnOutsidePhotoTapListener(OnOutsidePhotoTapListener onOutsidePhotoTapListener) {
    }

    public void setOnPhotoTapListener(OnPhotoTapListener onPhotoTapListener) {
    }

    public void setOnScaleChangeListener(OnScaleChangedListener onScaleChangedListener) {
    }

    public void setOnSingleFlingListener(OnSingleFlingListener onSingleFlingListener) {
    }

    public void setOnViewDragListener(OnViewDragListener onViewDragListener) {
    }

    public void setOnViewTapListener(OnViewTapListener onViewTapListener) {
    }

    public void setRotationBy(float f2) {
    }

    public void setRotationTo(float f2) {
    }

    public void setScale(float f2) {
    }

    public void setScaleLevels(float f2, float f3, float f4) {
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
    }

    public boolean setSuppMatrix(Matrix matrix) {
    }

    public void setZoomTransitionDuration(int i2) {
    }

    public void setZoomable(boolean z) {
    }

    public PhotoView(Context context, AttributeSet attributeSet) {
    }

    public void setScale(float f2, boolean z) {
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i2) {
    }

    public void setScale(float f2, float f3, float f4, boolean z) {
    }
}
