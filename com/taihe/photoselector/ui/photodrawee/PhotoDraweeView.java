package com.taihe.photoselector.ui.photodrawee;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.image.ImageInfo;
import h.x.e.d.l.c;
import h.x.e.d.l.g;
import h.x.e.d.l.h;
import h.x.e.d.l.j;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class PhotoDraweeView extends SimpleDraweeView implements c {
    private h.x.e.d.l.a b;
    private boolean c;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a extends BaseControllerListener<ImageInfo> {
        public final /* synthetic */ PhotoDraweeView b;

        public a(PhotoDraweeView photoDraweeView) {
        }

        @Override // com.facebook.drawee.controller.BaseControllerListener, com.facebook.drawee.controller.ControllerListener
        public void onFailure(String str, Throwable th) {
        }

        @Override // com.facebook.drawee.controller.BaseControllerListener, com.facebook.drawee.controller.ControllerListener
        public /* bridge */ /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
        }

        @Override // com.facebook.drawee.controller.BaseControllerListener, com.facebook.drawee.controller.ControllerListener
        public void onIntermediateImageFailed(String str, Throwable th) {
        }

        @Override // com.facebook.drawee.controller.BaseControllerListener, com.facebook.drawee.controller.ControllerListener
        public /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, Object obj) {
        }

        public void onFinalImageSet(String str, ImageInfo imageInfo, Animatable animatable) {
        }

        public void onIntermediateImageSet(String str, ImageInfo imageInfo) {
        }
    }

    public PhotoDraweeView(Context context, GenericDraweeHierarchy genericDraweeHierarchy) {
    }

    public static /* synthetic */ boolean c(PhotoDraweeView photoDraweeView, boolean z) {
    }

    private int e(float f2) {
    }

    @Override // h.x.e.d.l.c
    public void a(float f2, float f3, float f4, boolean z) {
    }

    @Override // h.x.e.d.l.c
    public void b(int i2, int i3) {
    }

    @Override // h.x.e.d.l.c
    public void d(float f2, boolean z) {
    }

    public void f() {
    }

    public boolean g() {
    }

    public h.x.e.d.l.a getAttacher() {
    }

    @Override // h.x.e.d.l.c
    public float getMaximumScale() {
    }

    @Override // h.x.e.d.l.c
    public float getMediumScale() {
    }

    @Override // h.x.e.d.l.c
    public float getMinimumScale() {
    }

    @Override // h.x.e.d.l.c
    public g getOnPhotoTapListener() {
    }

    @Override // h.x.e.d.l.c
    public j getOnViewTapListener() {
    }

    @Override // h.x.e.d.l.c
    public float getScale() {
    }

    public void h(Uri uri, Uri uri2, @Nullable Context context, boolean z) {
    }

    public void i(String str, String str2, boolean z) {
    }

    public void j(String str, boolean z) {
    }

    public void k(boolean z) {
    }

    @Override // com.facebook.drawee.view.DraweeView, android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
    }

    @Override // com.facebook.drawee.view.DraweeView, android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(@NonNull Canvas canvas) {
    }

    @Override // h.x.e.d.l.c
    public void setAllowParentInterceptOnEdge(boolean z) {
    }

    public void setEnableDraweeMatrix(boolean z) {
    }

    @Override // h.x.e.d.l.c
    public void setMaximumScale(float f2) {
    }

    @Override // h.x.e.d.l.c
    public void setMediumScale(float f2) {
    }

    @Override // h.x.e.d.l.c
    public void setMinimumScale(float f2) {
    }

    @Override // h.x.e.d.l.c
    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
    }

    @Override // android.view.View, h.x.e.d.l.c
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
    }

    @Override // h.x.e.d.l.c
    public void setOnPhotoTapListener(g gVar) {
    }

    @Override // h.x.e.d.l.c
    public void setOnScaleChangeListener(h hVar) {
    }

    @Override // h.x.e.d.l.c
    public void setOnViewTapListener(j jVar) {
    }

    public void setPhotoUri(String str) {
    }

    @Override // h.x.e.d.l.c
    public void setScale(float f2) {
    }

    @Override // h.x.e.d.l.c
    public void setZoomTransitionDuration(long j2) {
    }

    public PhotoDraweeView(Context context) {
    }

    public PhotoDraweeView(Context context, AttributeSet attributeSet) {
    }

    public PhotoDraweeView(Context context, AttributeSet attributeSet, int i2) {
    }
}
