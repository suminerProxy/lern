package com.taihebase.activity.view.switchButton;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SwitchButton extends View implements Checkable {
    private static final int L0 = 0;
    private static final int M0 = 0;
    private float A;
    private int B;
    private int C;
    private float D;
    private boolean D0;
    private float E;
    private boolean E0;
    private float F;
    private boolean F0;
    private float G;
    private d G0;
    private int H;
    private long H0;
    private int I;
    private Runnable I0;
    private float J;
    private ValueAnimator.AnimatorUpdateListener J0;
    private float K;
    private Animator.AnimatorListener K0;
    private Paint L;
    private Paint M;
    private e N;
    private e O;
    private e P;
    private RectF Q;
    private int R;
    private ValueAnimator S;
    private final ArgbEvaluator T;
    private boolean U;
    private boolean V;
    private boolean W;
    private final int b;
    private final int c;

    /* renamed from: d  reason: collision with root package name */
    private final int f8126d;

    /* renamed from: e  reason: collision with root package name */
    private final int f8127e;

    /* renamed from: f  reason: collision with root package name */
    private final int f8128f;

    /* renamed from: g  reason: collision with root package name */
    private final int f8129g;

    /* renamed from: h  reason: collision with root package name */
    private int f8130h;

    /* renamed from: i  reason: collision with root package name */
    private int f8131i;

    /* renamed from: j  reason: collision with root package name */
    private int f8132j;

    /* renamed from: k  reason: collision with root package name */
    private float f8133k;
    private boolean k0;

    /* renamed from: l  reason: collision with root package name */
    private float f8134l;

    /* renamed from: m  reason: collision with root package name */
    private float f8135m;

    /* renamed from: n  reason: collision with root package name */
    private float f8136n;

    /* renamed from: o  reason: collision with root package name */
    private float f8137o;

    /* renamed from: p  reason: collision with root package name */
    private float f8138p;
    private float q;
    private float r;
    private float s;
    private float t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements Runnable {
        public final /* synthetic */ SwitchButton b;

        public a(SwitchButton switchButton) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ SwitchButton b;

        public b(SwitchButton switchButton) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class c implements Animator.AnimatorListener {
        public final /* synthetic */ SwitchButton b;

        public c(SwitchButton switchButton) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface d {
        void a(SwitchButton switchButton, boolean z);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public float f8139a;
        public int b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public float f8140d;

        public static /* synthetic */ void a(e eVar, e eVar2) {
        }

        private void b(e eVar) {
        }
    }

    public SwitchButton(Context context) {
    }

    private void B(Context context, AttributeSet attributeSet) {
    }

    private boolean C() {
    }

    private boolean D() {
    }

    private boolean E() {
    }

    private static boolean F(TypedArray typedArray, int i2, boolean z) {
    }

    private static int G(TypedArray typedArray, int i2, int i3) {
    }

    private static int H(TypedArray typedArray, int i2, int i3) {
    }

    private static float I(TypedArray typedArray, int i2, float f2) {
    }

    private static int J(TypedArray typedArray, int i2, int i3) {
    }

    private void K() {
    }

    private void L() {
    }

    private void M() {
    }

    private void O(boolean z, boolean z2) {
    }

    public static /* synthetic */ boolean a(SwitchButton switchButton) {
    }

    public static /* synthetic */ int b(SwitchButton switchButton) {
    }

    public static /* synthetic */ int c(SwitchButton switchButton) {
    }

    public static /* synthetic */ float d(SwitchButton switchButton) {
    }

    public static /* synthetic */ int e(SwitchButton switchButton) {
    }

    public static /* synthetic */ void f(SwitchButton switchButton) {
    }

    public static /* synthetic */ boolean g(SwitchButton switchButton) {
    }

    public static /* synthetic */ boolean h(SwitchButton switchButton, boolean z) {
    }

    public static /* synthetic */ void i(SwitchButton switchButton) {
    }

    public static /* synthetic */ int j(SwitchButton switchButton) {
    }

    public static /* synthetic */ int k(SwitchButton switchButton, int i2) {
    }

    public static /* synthetic */ e l(SwitchButton switchButton) {
    }

    public static /* synthetic */ e m(SwitchButton switchButton) {
    }

    public static /* synthetic */ e n(SwitchButton switchButton) {
    }

    public static /* synthetic */ ArgbEvaluator o(SwitchButton switchButton) {
    }

    public static /* synthetic */ float p(SwitchButton switchButton) {
    }

    public static /* synthetic */ float q(SwitchButton switchButton) {
    }

    private void r() {
    }

    private static float s(float f2) {
    }

    private void setCheckedViewState(e eVar) {
    }

    private void setUncheckViewState(e eVar) {
    }

    private static int t(float f2) {
    }

    private void u(Canvas canvas, float f2, float f3, float f4, float f5, float f6, float f7, Paint paint) {
    }

    private void v(Canvas canvas, float f2, float f3) {
    }

    private void y(Canvas canvas, float f2, float f3, float f4, float f5, float f6, Paint paint) {
    }

    private void z(Canvas canvas) {
    }

    public void A(Canvas canvas, int i2, float f2, float f3, float f4, float f5, Paint paint) {
    }

    public void N(boolean z) {
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
    }

    public void setEnableEffect(boolean z) {
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
    }

    public void setOnCheckedChangeListener(d dVar) {
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
    }

    @Override // android.view.View
    public final void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
    }

    @Override // android.view.View
    public final void setPadding(int i2, int i3, int i4, int i5) {
    }

    public void setShadowEffect(boolean z) {
    }

    @Override // android.widget.Checkable
    public void toggle() {
    }

    public void w(Canvas canvas) {
    }

    public void x(Canvas canvas, int i2, float f2, float f3, float f4, float f5, float f6, Paint paint) {
    }

    public SwitchButton(Context context, AttributeSet attributeSet) {
    }

    public SwitchButton(Context context, AttributeSet attributeSet, int i2) {
    }

    @TargetApi(21)
    public SwitchButton(Context context, AttributeSet attributeSet, int i2, int i3) {
    }
}
