package com.showstartfans.activity.crop.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import h.u.a.f.b.a;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class TransformImageView extends ImageView {

    /* renamed from: n  reason: collision with root package name */
    private static final String f6526n = "TransformImageView";

    /* renamed from: o  reason: collision with root package name */
    private static final int f6527o = 8;

    /* renamed from: p  reason: collision with root package name */
    private static final int f6528p = 2;
    private static final int q = 9;
    public final float[] b;
    public final float[] c;

    /* renamed from: d  reason: collision with root package name */
    private final float[] f6529d;

    /* renamed from: e  reason: collision with root package name */
    public Matrix f6530e;

    /* renamed from: f  reason: collision with root package name */
    public int f6531f;

    /* renamed from: g  reason: collision with root package name */
    public int f6532g;

    /* renamed from: h  reason: collision with root package name */
    public c f6533h;

    /* renamed from: i  reason: collision with root package name */
    private float[] f6534i;

    /* renamed from: j  reason: collision with root package name */
    private float[] f6535j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f6536k;

    /* renamed from: l  reason: collision with root package name */
    private int f6537l;

    /* renamed from: m  reason: collision with root package name */
    private Uri f6538m;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements a.InterfaceC0358a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TransformImageView f6539a;

        public a(TransformImageView transformImageView) {
        }

        @Override // h.u.a.f.b.a.InterfaceC0358a
        public void a(@NonNull Bitmap bitmap) {
        }

        @Override // h.u.a.f.b.a.InterfaceC0358a
        public void b(@NonNull Exception exc) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static abstract class b implements c {
        @Override // com.showstartfans.activity.crop.view.TransformImageView.c
        public void a() {
        }

        @Override // com.showstartfans.activity.crop.view.TransformImageView.c
        public void b(@NonNull Exception exc) {
        }

        @Override // com.showstartfans.activity.crop.view.TransformImageView.c
        public void c(float f2) {
        }

        @Override // com.showstartfans.activity.crop.view.TransformImageView.c
        public void d(float f2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface c {
        void a();

        void b(@NonNull Exception exc);

        void c(float f2);

        void d(float f2);
    }

    public TransformImageView(Context context) {
    }

    public static /* synthetic */ boolean a(TransformImageView transformImageView, boolean z) {
    }

    private void l() {
    }

    public int b() {
    }

    public float c(@NonNull Matrix matrix) {
    }

    public float d(@NonNull Matrix matrix) {
    }

    public float e(@NonNull Matrix matrix, @IntRange(from = 0, to = 9) int i2) {
    }

    public void f() {
    }

    public void g() {
    }

    public float getCurrentAngle() {
    }

    public float getCurrentScale() {
    }

    @Nullable
    public Uri getImageUri() {
    }

    public int getMaxBitmapSize() {
    }

    @Nullable
    public Bitmap getViewBitmap() {
    }

    public void h(float f2, float f3, float f4) {
    }

    public void i(float f2, float f3, float f4) {
    }

    public void j(float f2, float f3) {
    }

    public void k(@NonNull String str, @NonNull Matrix matrix) {
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
    }

    @Override // android.widget.ImageView
    public void setImageMatrix(Matrix matrix) {
    }

    public void setImageUri(@NonNull Uri uri) throws Exception {
    }

    public void setMaxBitmapSize(int i2) {
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
    }

    public void setTransformImageListener(c cVar) {
    }

    public TransformImageView(Context context, AttributeSet attributeSet) {
    }

    public TransformImageView(Context context, AttributeSet attributeSet, int i2) {
    }
}
