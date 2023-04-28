package com.showstartfans.activity.crop.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class OverlayView extends View {
    public static final boolean q = false;
    public static final boolean r = false;
    public static final boolean s = true;
    public static final int t = 2;
    public static final int u = 2;
    public final RectF b;
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private int f6513d;

    /* renamed from: e  reason: collision with root package name */
    private float f6514e;

    /* renamed from: f  reason: collision with root package name */
    private float[] f6515f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f6516g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f6517h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f6518i;

    /* renamed from: j  reason: collision with root package name */
    private int f6519j;

    /* renamed from: k  reason: collision with root package name */
    private Path f6520k;

    /* renamed from: l  reason: collision with root package name */
    private Paint f6521l;

    /* renamed from: m  reason: collision with root package name */
    private Paint f6522m;

    /* renamed from: n  reason: collision with root package name */
    private Paint f6523n;

    /* renamed from: o  reason: collision with root package name */
    public int f6524o;

    /* renamed from: p  reason: collision with root package name */
    public int f6525p;

    public OverlayView(Context context) {
    }

    private void c(@NonNull TypedArray typedArray) {
    }

    private void d(@NonNull TypedArray typedArray) {
    }

    public void a(@NonNull Canvas canvas) {
    }

    public void b(@NonNull Canvas canvas) {
    }

    public void e(@NonNull TypedArray typedArray) {
    }

    public void f() {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    public void setCropFrameColor(@ColorInt int i2) {
    }

    public void setCropFrameStrokeWidth(@IntRange(from = 0) int i2) {
    }

    public void setCropGridColor(@ColorInt int i2) {
    }

    public void setCropGridColumnCount(@IntRange(from = 0) int i2) {
    }

    public void setCropGridRowCount(@IntRange(from = 0) int i2) {
    }

    public void setCropGridStrokeWidth(@IntRange(from = 0) int i2) {
    }

    public void setDimmedColor(@ColorInt int i2) {
    }

    public void setOvalDimmedLayer(boolean z) {
    }

    public void setShowCropFrame(boolean z) {
    }

    public void setShowCropGrid(boolean z) {
    }

    public void setTargetAspectRatio(float f2) {
    }

    public OverlayView(Context context, AttributeSet attributeSet) {
    }

    public OverlayView(Context context, AttributeSet attributeSet, int i2) {
    }
}
