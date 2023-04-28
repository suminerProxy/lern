package com.taihe.photoselector.ui.photodrawee;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.Nullable;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.view.DraweeHolder;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.ImageInfo;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class ScaleImageView extends SubsamplingScaleImageView {
    private DraweeHolder<GenericDraweeHierarchy> b;
    private CloseableReference<CloseableImage> c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f7871d;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a extends BaseControllerListener<ImageInfo> {
        public final /* synthetic */ DataSource b;
        public final /* synthetic */ ScaleImageView c;

        public a(ScaleImageView scaleImageView, DataSource dataSource) {
        }

        @Override // com.facebook.drawee.controller.BaseControllerListener, com.facebook.drawee.controller.ControllerListener
        public /* bridge */ /* synthetic */ void onFinalImageSet(String str, @Nullable Object obj, @Nullable Animatable animatable) {
        }

        public void onFinalImageSet(String str, @Nullable ImageInfo imageInfo, @Nullable Animatable animatable) {
        }
    }

    public ScaleImageView(Context context) {
    }

    public static /* synthetic */ CloseableReference a(ScaleImageView scaleImageView) {
    }

    public static /* synthetic */ CloseableReference b(ScaleImageView scaleImageView, CloseableReference closeableReference) {
    }

    public static /* synthetic */ boolean c(ScaleImageView scaleImageView, boolean z) {
    }

    private void d() {
    }

    public void e(Uri uri, Uri uri2, @Nullable Context context, boolean z) {
    }

    public void f(String str, String str2, boolean z) {
    }

    public void g(String str, boolean z) {
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
    }

    @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView, android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
    }

    @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
    }

    public ScaleImageView(Context context, AttributeSet attributeSet) {
    }
}
