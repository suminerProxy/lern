package com.flyco.tablayout;

import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.flyco.tablayout.widget.MsgView;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class SegmentTabLayout extends FrameLayout implements ValueAnimator.AnimatorUpdateListener {
    private static final int U = 0;
    private static final int V = 1;
    private static final int W = 2;
    private float A;
    private float B;
    private int C;
    private int D;
    private int E;
    private boolean F;
    private int G;
    private int H;
    private float I;
    private int J;
    private ValueAnimator K;
    private OvershootInterpolator L;
    private h.k.a.c.a M;
    private float[] N;
    private boolean O;
    private Paint P;
    private SparseArray<Boolean> Q;
    private h.k.a.b.b R;
    private b S;
    private b T;
    private Context b;
    private String[] c;

    /* renamed from: d  reason: collision with root package name */
    private LinearLayout f3308d;

    /* renamed from: e  reason: collision with root package name */
    private int f3309e;

    /* renamed from: f  reason: collision with root package name */
    private int f3310f;

    /* renamed from: g  reason: collision with root package name */
    private int f3311g;

    /* renamed from: h  reason: collision with root package name */
    private Rect f3312h;

    /* renamed from: i  reason: collision with root package name */
    private GradientDrawable f3313i;

    /* renamed from: j  reason: collision with root package name */
    private GradientDrawable f3314j;

    /* renamed from: k  reason: collision with root package name */
    private Paint f3315k;

    /* renamed from: l  reason: collision with root package name */
    private float f3316l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f3317m;

    /* renamed from: n  reason: collision with root package name */
    private float f3318n;

    /* renamed from: o  reason: collision with root package name */
    private int f3319o;

    /* renamed from: p  reason: collision with root package name */
    private float f3320p;
    private float q;
    private float r;
    private float s;
    private float t;
    private float u;
    private long v;
    private boolean w;
    private boolean x;
    private int y;
    private float z;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ SegmentTabLayout b;

        public a(SegmentTabLayout segmentTabLayout) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public float f3321a;
        public float b;
        public final /* synthetic */ SegmentTabLayout c;

        public b(SegmentTabLayout segmentTabLayout) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class c implements TypeEvaluator<b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SegmentTabLayout f3322a;

        public c(SegmentTabLayout segmentTabLayout) {
        }

        public b a(float f2, b bVar, b bVar2) {
        }

        @Override // android.animation.TypeEvaluator
        public /* bridge */ /* synthetic */ b evaluate(float f2, b bVar, b bVar2) {
        }
    }

    public SegmentTabLayout(Context context) {
    }

    public static /* synthetic */ int a(SegmentTabLayout segmentTabLayout) {
    }

    public static /* synthetic */ h.k.a.b.b b(SegmentTabLayout segmentTabLayout) {
    }

    private void c(int i2, View view) {
    }

    private void d() {
    }

    private void e() {
    }

    private void o(Context context, AttributeSet attributeSet) {
    }

    private void v(int i2) {
    }

    private void w() {
    }

    public int f(float f2) {
    }

    public MsgView g(int i2) {
    }

    public int getCurrentTab() {
    }

    public int getDividerColor() {
    }

    public float getDividerPadding() {
    }

    public float getDividerWidth() {
    }

    public long getIndicatorAnimDuration() {
    }

    public int getIndicatorColor() {
    }

    public float getIndicatorCornerRadius() {
    }

    public float getIndicatorHeight() {
    }

    public float getIndicatorMarginBottom() {
    }

    public float getIndicatorMarginLeft() {
    }

    public float getIndicatorMarginRight() {
    }

    public float getIndicatorMarginTop() {
    }

    public int getTabCount() {
    }

    public float getTabPadding() {
    }

    public float getTabWidth() {
    }

    public int getTextBold() {
    }

    public int getTextSelectColor() {
    }

    public int getTextUnselectColor() {
    }

    public float getTextsize() {
    }

    public TextView h(int i2) {
    }

    public void i(int i2) {
    }

    public boolean j() {
    }

    public boolean k() {
    }

    public boolean l() {
    }

    public boolean m() {
    }

    public void n() {
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
    }

    public void p(float f2, float f3, float f4, float f5) {
    }

    public void q(int i2, float f2, float f3) {
    }

    public void r(String[] strArr, FragmentActivity fragmentActivity, int i2, ArrayList<Fragment> arrayList) {
    }

    public void s(int i2) {
    }

    public void setCurrentTab(int i2) {
    }

    public void setDividerColor(int i2) {
    }

    public void setDividerPadding(float f2) {
    }

    public void setDividerWidth(float f2) {
    }

    public void setIndicatorAnimDuration(long j2) {
    }

    public void setIndicatorAnimEnable(boolean z) {
    }

    public void setIndicatorBounceEnable(boolean z) {
    }

    public void setIndicatorColor(int i2) {
    }

    public void setIndicatorCornerRadius(float f2) {
    }

    public void setIndicatorHeight(float f2) {
    }

    public void setOnTabSelectListener(h.k.a.b.b bVar) {
    }

    public void setTabData(String[] strArr) {
    }

    public void setTabPadding(float f2) {
    }

    public void setTabSpaceEqual(boolean z) {
    }

    public void setTabWidth(float f2) {
    }

    public void setTextAllCaps(boolean z) {
    }

    public void setTextBold(int i2) {
    }

    public void setTextSelectColor(int i2) {
    }

    public void setTextUnselectColor(int i2) {
    }

    public void setTextsize(float f2) {
    }

    public void t(int i2, int i3) {
    }

    public int u(float f2) {
    }

    public SegmentTabLayout(Context context, AttributeSet attributeSet) {
    }

    public SegmentTabLayout(Context context, AttributeSet attributeSet, int i2) {
    }
}
