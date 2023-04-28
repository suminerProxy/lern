package com.showstartfans.activity.crop.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class CropImageView extends TransformImageView {
    public static final int D = 0;
    public static final long E = 500;
    public static final float F = 10.0f;
    public static final String G = "1:1";
    private int A;
    private int B;
    private long C;
    private final RectF r;
    private final Matrix s;
    private float t;
    private float u;
    private a v;
    private Runnable w;
    private Runnable x;
    private float y;
    private float z;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface a {
        void a(float f2);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class b implements Runnable {
        private final WeakReference<CropImageView> b;
        private final long c;

        /* renamed from: d  reason: collision with root package name */
        private final long f6499d;

        /* renamed from: e  reason: collision with root package name */
        private final float f6500e;

        /* renamed from: f  reason: collision with root package name */
        private final float f6501f;

        /* renamed from: g  reason: collision with root package name */
        private final float f6502g;

        /* renamed from: h  reason: collision with root package name */
        private final float f6503h;

        /* renamed from: i  reason: collision with root package name */
        private final float f6504i;

        /* renamed from: j  reason: collision with root package name */
        private final float f6505j;

        /* renamed from: k  reason: collision with root package name */
        private final boolean f6506k;

        public b(CropImageView cropImageView, long j2, float f2, float f3, float f4, float f5, float f6, float f7, boolean z) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class c implements Runnable {
        private final WeakReference<CropImageView> b;
        private final long c;

        /* renamed from: d  reason: collision with root package name */
        private final long f6507d;

        /* renamed from: e  reason: collision with root package name */
        private final float f6508e;

        /* renamed from: f  reason: collision with root package name */
        private final float f6509f;

        /* renamed from: g  reason: collision with root package name */
        private final float f6510g;

        /* renamed from: h  reason: collision with root package name */
        private final float f6511h;

        public c(CropImageView cropImageView, long j2, float f2, float f3, float f4, float f5) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public CropImageView(Context context) {
    }

    public static /* synthetic */ RectF m(CropImageView cropImageView) {
    }

    private float[] n() {
    }

    private void v() {
    }

    private void w(float f2, float f3) {
    }

    public void A(float f2) {
    }

    public void B(float f2, float f3, float f4) {
    }

    @Override // com.showstartfans.activity.crop.view.TransformImageView
    public void g() {
    }

    @Nullable
    public a getCropBoundsChangeListener() {
    }

    public float getMaxScale() {
    }

    public float getMinScale() {
    }

    public float getTargetAspectRatio() {
    }

    @Override // com.showstartfans.activity.crop.view.TransformImageView
    public void i(float f2, float f3, float f4) {
    }

    public void o() {
    }

    @Nullable
    public Bitmap p() {
    }

    public boolean q() {
    }

    public boolean r(float[] fArr) {
    }

    public void s(float f2) {
    }

    public void setCropBoundsChangeListener(@Nullable a aVar) {
    }

    public void setImageToWrapCropBounds(boolean z) {
    }

    public void setImageToWrapCropBoundsAnimDuration(@IntRange(from = 100) long j2) {
    }

    public void setMaxResultImageSizeX(@IntRange(from = 10) int i2) {
    }

    public void setMaxResultImageSizeY(@IntRange(from = 10) int i2) {
    }

    public void setMaxScaleMultiplier(float f2) {
    }

    public void setTargetAspectRatio(float f2) {
    }

    public void t(@NonNull TypedArray typedArray) {
    }

    public void u() {
    }

    public void x(float f2, float f3, float f4, long j2) {
    }

    public void y(float f2) {
    }

    public void z(float f2, float f3, float f4) {
    }

    public CropImageView(Context context, AttributeSet attributeSet) {
    }

    public CropImageView(Context context, AttributeSet attributeSet, int i2) {
    }
}
