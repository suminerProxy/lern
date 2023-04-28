package com.soli.pullupdownrefresh.Header;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.soli.pullupdownrefresh.ptr.PtrFrameLayout;
import h.v.a.f.e;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class MaterialHeader extends View implements h.v.a.f.c {
    private h.v.a.c.a b;
    private float c;

    /* renamed from: d  reason: collision with root package name */
    private PtrFrameLayout f7744d;

    /* renamed from: e  reason: collision with root package name */
    private Animation f7745e;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a extends Animation {
        public final /* synthetic */ MaterialHeader b;

        public a(MaterialHeader materialHeader) {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f2, Transformation transformation) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b extends e {

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ MaterialHeader f7746g;

        public b(MaterialHeader materialHeader) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class c implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f7747a;
        public final /* synthetic */ MaterialHeader b;

        public c(MaterialHeader materialHeader, e eVar) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public MaterialHeader(Context context) {
    }

    public static /* synthetic */ float f(MaterialHeader materialHeader) {
    }

    public static /* synthetic */ float g(MaterialHeader materialHeader, float f2) {
    }

    public static /* synthetic */ h.v.a.c.a h(MaterialHeader materialHeader) {
    }

    public static /* synthetic */ Animation i(MaterialHeader materialHeader) {
    }

    private void j() {
    }

    @Override // h.v.a.f.c
    public void a(PtrFrameLayout ptrFrameLayout) {
    }

    @Override // h.v.a.f.c
    public void b(PtrFrameLayout ptrFrameLayout, boolean z, byte b2, h.v.a.f.f.a aVar) {
    }

    @Override // h.v.a.f.c
    public void c(PtrFrameLayout ptrFrameLayout) {
    }

    @Override // h.v.a.f.c
    public void d(PtrFrameLayout ptrFrameLayout) {
    }

    @Override // h.v.a.f.c
    public void e(PtrFrameLayout ptrFrameLayout) {
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
    }

    public void setColorSchemeColors(int[] iArr) {
    }

    public void setPtrFrameLayout(PtrFrameLayout ptrFrameLayout) {
    }

    public MaterialHeader(Context context, AttributeSet attributeSet) {
    }

    public MaterialHeader(Context context, AttributeSet attributeSet, int i2) {
    }
}
