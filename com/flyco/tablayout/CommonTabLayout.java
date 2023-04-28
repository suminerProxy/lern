package com.flyco.tablayout;

import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.flyco.tablayout.widget.MsgView;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class CommonTabLayout extends FrameLayout implements ValueAnimator.AnimatorUpdateListener {
    private static final int J0 = 0;
    private static final int K0 = 1;
    private static final int L0 = 2;
    private static final int M0 = 0;
    private static final int N0 = 1;
    private static final int O0 = 2;
    private boolean A;
    private boolean B;
    private int C;
    private int D;
    private boolean D0;
    private float E;
    private Paint E0;
    private int F;
    private SparseArray<Boolean> F0;
    private int G;
    private h.k.a.b.b G0;
    private float H;
    private b H0;
    private float I;
    private b I0;
    private float J;
    private float K;
    private int L;
    private int M;
    private int N;
    private boolean O;
    private boolean P;
    private int Q;
    private float R;
    private float S;
    private float T;
    private int U;
    private ValueAnimator V;
    private OvershootInterpolator W;
    private Context b;
    private ArrayList<h.k.a.b.a> c;

    /* renamed from: d  reason: collision with root package name */
    private LinearLayout f3292d;

    /* renamed from: e  reason: collision with root package name */
    private int f3293e;

    /* renamed from: f  reason: collision with root package name */
    private int f3294f;

    /* renamed from: g  reason: collision with root package name */
    private int f3295g;

    /* renamed from: h  reason: collision with root package name */
    private Rect f3296h;

    /* renamed from: i  reason: collision with root package name */
    private GradientDrawable f3297i;

    /* renamed from: j  reason: collision with root package name */
    private Paint f3298j;

    /* renamed from: k  reason: collision with root package name */
    private Paint f3299k;
    private h.k.a.c.a k0;

    /* renamed from: l  reason: collision with root package name */
    private Paint f3300l;

    /* renamed from: m  reason: collision with root package name */
    private Path f3301m;

    /* renamed from: n  reason: collision with root package name */
    private int f3302n;

    /* renamed from: o  reason: collision with root package name */
    private float f3303o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f3304p;
    private float q;
    private int r;
    private float s;
    private float t;
    private float u;
    private float v;
    private float w;
    private float x;
    private float y;
    private long z;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ CommonTabLayout b;

        public a(CommonTabLayout commonTabLayout) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public float f3305a;
        public float b;
        public final /* synthetic */ CommonTabLayout c;

        public b(CommonTabLayout commonTabLayout) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class c implements TypeEvaluator<b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CommonTabLayout f3306a;

        public c(CommonTabLayout commonTabLayout) {
        }

        public b a(float f2, b bVar, b bVar2) {
        }

        @Override // android.animation.TypeEvaluator
        public /* bridge */ /* synthetic */ b evaluate(float f2, b bVar, b bVar2) {
        }
    }

    public CommonTabLayout(Context context) {
    }

    public static /* synthetic */ int a(CommonTabLayout commonTabLayout) {
    }

    public static /* synthetic */ h.k.a.b.b b(CommonTabLayout commonTabLayout) {
    }

    private void c(int i2, View view) {
    }

    private void d() {
    }

    private void e() {
    }

    private void q(Context context, AttributeSet attributeSet) {
    }

    private void x(int i2) {
    }

    private void y() {
    }

    public int f(float f2) {
    }

    public ImageView g(int i2) {
    }

    public int getCurrentTab() {
    }

    public int getDividerColor() {
    }

    public float getDividerPadding() {
    }

    public float getDividerWidth() {
    }

    public int getIconGravity() {
    }

    public float getIconHeight() {
    }

    public float getIconMargin() {
    }

    public float getIconWidth() {
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

    public int getIndicatorStyle() {
    }

    public float getIndicatorWidth() {
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

    public float getUnSelectTextSize() {
    }

    public int getUnderlineColor() {
    }

    public float getUnderlineHeight() {
    }

    public MsgView h(int i2) {
    }

    public TextView i(int i2) {
    }

    public void j(int i2) {
    }

    public boolean k() {
    }

    public boolean l() {
    }

    public boolean m() {
    }

    public boolean n() {
    }

    public boolean o() {
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

    public void p() {
    }

    public void r(float f2, float f3, float f4, float f5) {
    }

    public void s(int i2, float f2, float f3) {
    }

    public void setCurrentTab(int i2) {
    }

    public void setDividerColor(int i2) {
    }

    public void setDividerPadding(float f2) {
    }

    public void setDividerWidth(float f2) {
    }

    public void setIconGravity(int i2) {
    }

    public void setIconHeight(float f2) {
    }

    public void setIconMargin(float f2) {
    }

    public void setIconVisible(boolean z) {
    }

    public void setIconWidth(float f2) {
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

    public void setIndicatorGravity(int i2) {
    }

    public void setIndicatorHeight(float f2) {
    }

    public void setIndicatorStyle(int i2) {
    }

    public void setIndicatorWidth(float f2) {
    }

    public void setOnTabSelectListener(h.k.a.b.b bVar) {
    }

    public void setTabData(ArrayList<h.k.a.b.a> arrayList) {
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

    public void setUnSelectTextSize(float f2) {
    }

    public void setUnderlineColor(int i2) {
    }

    public void setUnderlineGravity(int i2) {
    }

    public void setUnderlineHeight(float f2) {
    }

    public void t(ArrayList<h.k.a.b.a> arrayList, FragmentActivity fragmentActivity, int i2, ArrayList<Fragment> arrayList2) {
    }

    public void u(int i2) {
    }

    public void v(int i2, int i3) {
    }

    public int w(float f2) {
    }

    public CommonTabLayout(Context context, AttributeSet attributeSet) {
    }

    public CommonTabLayout(Context context, AttributeSet attributeSet, int i2) {
    }
}
