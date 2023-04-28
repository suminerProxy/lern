package com.showstartfans.activity.view.videocut;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class RangeSeekBarView extends View {
    private static final String K = null;
    public static final int L = 255;
    public static final int M = 65280;
    public static final int N = 8;
    private static int O;
    private static int P;
    private float A;
    private boolean B;
    private b C;
    private boolean D;
    private double E;
    private boolean F;
    private a G;
    private int H;
    private int I;
    private int J;
    private int b;
    private long c;

    /* renamed from: d  reason: collision with root package name */
    private double f7274d;

    /* renamed from: e  reason: collision with root package name */
    private double f7275e;

    /* renamed from: f  reason: collision with root package name */
    private double f7276f;

    /* renamed from: g  reason: collision with root package name */
    private double f7277g;

    /* renamed from: h  reason: collision with root package name */
    private double f7278h;

    /* renamed from: i  reason: collision with root package name */
    private double f7279i;

    /* renamed from: j  reason: collision with root package name */
    private int f7280j;

    /* renamed from: k  reason: collision with root package name */
    private Bitmap f7281k;

    /* renamed from: l  reason: collision with root package name */
    private Bitmap f7282l;

    /* renamed from: m  reason: collision with root package name */
    private Bitmap f7283m;

    /* renamed from: n  reason: collision with root package name */
    private Paint f7284n;

    /* renamed from: o  reason: collision with root package name */
    private Paint f7285o;

    /* renamed from: p  reason: collision with root package name */
    private Paint f7286p;
    private final Paint q;
    private final Paint r;
    private final Paint s;
    private int t;
    private float u;
    private final float v;
    private long w;
    private long x;
    private float y;
    private boolean z;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface a {
        void a(RangeSeekBarView rangeSeekBarView, long j2, long j3, int i2, boolean z, b bVar);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b {
        private static final /* synthetic */ b[] $VALUES = null;
        public static final b MAX = null;
        public static final b MIN = null;

        private b(String str, int i2) {
        }

        public static b valueOf(String str) {
        }

        public static b[] values() {
        }
    }

    public RangeSeekBarView(Context context) {
    }

    private void a() {
    }

    private void b(float f2, boolean z, Canvas canvas, boolean z2) {
    }

    private void c(Canvas canvas) {
    }

    private b d(float f2) {
    }

    private void e() {
    }

    private boolean f(float f2, double d2, double d3) {
    }

    private boolean g(float f2, double d2, double d3) {
    }

    private int getValueLength() {
    }

    private Bitmap i(int i2) {
    }

    private float j(double d2) {
    }

    private long k(double d2) {
    }

    private void l(MotionEvent motionEvent) {
    }

    private double o(float f2, int i2) {
    }

    private void q(MotionEvent motionEvent) {
    }

    private double r(long j2) {
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
    }

    public double getNormalizedMaxValue() {
    }

    public double getNormalizedMinValue() {
    }

    public long getSelectedMaxValue() {
    }

    public long getSelectedMinValue() {
    }

    public boolean h() {
    }

    public void m() {
    }

    public void n() {
    }

    @Override // android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    public void p(long j2, long j3) {
    }

    public void setMinShootTime(long j2) {
    }

    public void setNormalizedMaxValue(double d2) {
    }

    public void setNormalizedMinValue(double d2) {
    }

    public void setNotifyWhileDragging(boolean z) {
    }

    public void setOnRangeSeekBarChangeListener(a aVar) {
    }

    public void setSelectedMaxValue(long j2) {
    }

    public void setSelectedMinValue(long j2) {
    }

    public void setTouchDown(boolean z) {
    }

    public RangeSeekBarView(Context context, @Nullable AttributeSet attributeSet) {
    }

    public RangeSeekBarView(Context context, @Nullable AttributeSet attributeSet, int i2) {
    }

    public RangeSeekBarView(Context context, long j2, long j3) {
    }
}
