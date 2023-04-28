package com.taihebase.activity.widget.indicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class InkPageIndicator extends View implements View.OnAttachStateChangeListener {
    private static final float D0 = -1.0f;
    private static final float E0 = 1.0E-5f;
    private static final int T = 8;
    private static final int U = 12;
    private static final int V = 400;
    private static final int W = -2130706433;
    private static final int k0 = -1;
    private final Paint A;
    private Path B;
    private final Path C;
    private final Path D;
    private final Path E;
    private final RectF F;
    private ValueAnimator G;
    private AnimatorSet H;
    private g I;
    private h[] J;
    private final Interpolator K;
    public float L;
    public float M;
    public float N;
    public float O;
    public float P;
    public float Q;
    public float R;
    public float S;
    private int b;
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private long f8254d;

    /* renamed from: e  reason: collision with root package name */
    private int f8255e;

    /* renamed from: f  reason: collision with root package name */
    private int f8256f;

    /* renamed from: g  reason: collision with root package name */
    private float f8257g;

    /* renamed from: h  reason: collision with root package name */
    private float f8258h;

    /* renamed from: i  reason: collision with root package name */
    private long f8259i;

    /* renamed from: j  reason: collision with root package name */
    private float f8260j;

    /* renamed from: k  reason: collision with root package name */
    private float f8261k;

    /* renamed from: l  reason: collision with root package name */
    private float f8262l;

    /* renamed from: m  reason: collision with root package name */
    private ViewPager2 f8263m;

    /* renamed from: n  reason: collision with root package name */
    private int f8264n;

    /* renamed from: o  reason: collision with root package name */
    private int f8265o;

    /* renamed from: p  reason: collision with root package name */
    private int f8266p;
    private float q;
    private boolean r;
    private float[] s;
    private float[] t;
    private float u;
    private float v;
    private float[] w;
    private boolean x;
    private boolean y;
    private final Paint z;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = null;
        public int currentPage;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public static class a implements Parcelable.Creator<SavedState> {
            public SavedState a(Parcel parcel) {
            }

            public SavedState[] b(int i2) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ SavedState createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ SavedState[] newArray(int i2) {
            }
        }

        public /* synthetic */ SavedState(Parcel parcel, a aVar) {
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
        }

        public SavedState(Parcelable parcelable) {
        }

        private SavedState(Parcel parcel) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a extends ViewPager2.OnPageChangeCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ InkPageIndicator f8267a;

        public a(InkPageIndicator inkPageIndicator) {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i2) {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i2, float f2, int i3) {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b extends RecyclerView.AdapterDataObserver {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ InkPageIndicator f8268a;

        public b(InkPageIndicator inkPageIndicator) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class c extends AnimatorListenerAdapter {
        public final /* synthetic */ InkPageIndicator b;

        public c(InkPageIndicator inkPageIndicator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ InkPageIndicator b;

        public d(InkPageIndicator inkPageIndicator) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class e extends AnimatorListenerAdapter {
        public final /* synthetic */ InkPageIndicator b;

        public e(InkPageIndicator inkPageIndicator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class f extends k {
        public final /* synthetic */ InkPageIndicator c;

        public f(InkPageIndicator inkPageIndicator, float f2) {
        }

        @Override // com.taihebase.activity.widget.indicator.InkPageIndicator.k
        public boolean a(float f2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class g extends i {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ InkPageIndicator f8269e;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class a implements ValueAnimator.AnimatorUpdateListener {
            public final /* synthetic */ InkPageIndicator b;
            public final /* synthetic */ g c;

            public a(g gVar, InkPageIndicator inkPageIndicator) {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class b implements ValueAnimator.AnimatorUpdateListener {
            public final /* synthetic */ InkPageIndicator b;
            public final /* synthetic */ g c;

            public b(g gVar, InkPageIndicator inkPageIndicator) {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class c extends AnimatorListenerAdapter {
            public final /* synthetic */ InkPageIndicator b;
            public final /* synthetic */ int[] c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ float f8270d;

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ float f8271e;

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ g f8272f;

            public c(g gVar, InkPageIndicator inkPageIndicator, int[] iArr, float f2, float f3) {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        }

        public g(InkPageIndicator inkPageIndicator, int i2, int i3, int i4, k kVar) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class h extends i {

        /* renamed from: e  reason: collision with root package name */
        private int f8273e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ InkPageIndicator f8274f;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class a implements ValueAnimator.AnimatorUpdateListener {
            public final /* synthetic */ InkPageIndicator b;
            public final /* synthetic */ h c;

            public a(h hVar, InkPageIndicator inkPageIndicator) {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class b extends AnimatorListenerAdapter {
            public final /* synthetic */ InkPageIndicator b;
            public final /* synthetic */ h c;

            public b(h hVar, InkPageIndicator inkPageIndicator) {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }
        }

        public h(InkPageIndicator inkPageIndicator, int i2, k kVar) {
        }

        public static /* synthetic */ int b(h hVar) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public abstract class i extends ValueAnimator {
        public boolean b;
        public k c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ InkPageIndicator f8275d;

        public i(InkPageIndicator inkPageIndicator, k kVar) {
        }

        public void a(float f2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class j extends k {
        public final /* synthetic */ InkPageIndicator c;

        public j(InkPageIndicator inkPageIndicator, float f2) {
        }

        @Override // com.taihebase.activity.widget.indicator.InkPageIndicator.k
        public boolean a(float f2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public abstract class k {

        /* renamed from: a  reason: collision with root package name */
        public float f8276a;
        public final /* synthetic */ InkPageIndicator b;

        public k(InkPageIndicator inkPageIndicator, float f2) {
        }

        public abstract boolean a(float f2);
    }

    public InkPageIndicator(Context context) {
    }

    public static /* synthetic */ void A(InkPageIndicator inkPageIndicator, int i2) {
    }

    public static /* synthetic */ void B(InkPageIndicator inkPageIndicator) {
    }

    private void C(int i2, int i3) {
    }

    private void D() {
    }

    private void E() {
    }

    private ValueAnimator F(float f2, int i2, int i3, int i4) {
    }

    private void G(Canvas canvas) {
    }

    private void H(Canvas canvas) {
    }

    private Path I(int i2, float f2, float f3, float f4, float f5) {
    }

    private void J() {
    }

    private void K() {
    }

    private void L(int i2, float f2) {
    }

    private void M(int i2, float f2) {
    }

    public static /* synthetic */ boolean a(InkPageIndicator inkPageIndicator) {
    }

    public static /* synthetic */ boolean b(InkPageIndicator inkPageIndicator) {
    }

    public static /* synthetic */ float c(InkPageIndicator inkPageIndicator) {
    }

    public static /* synthetic */ float d(InkPageIndicator inkPageIndicator, float f2) {
    }

    public static /* synthetic */ boolean e(InkPageIndicator inkPageIndicator, boolean z) {
    }

    public static /* synthetic */ g f(InkPageIndicator inkPageIndicator) {
    }

    public static /* synthetic */ boolean g(InkPageIndicator inkPageIndicator, boolean z) {
    }

    private int getDesiredHeight() {
    }

    private int getDesiredWidth() {
    }

    private int getRequiredWidth() {
    }

    private Path getRetreatingJoinPath() {
    }

    public static /* synthetic */ long h(InkPageIndicator inkPageIndicator) {
    }

    public static /* synthetic */ Interpolator i(InkPageIndicator inkPageIndicator) {
    }

    public static /* synthetic */ float[] j(InkPageIndicator inkPageIndicator) {
    }

    public static /* synthetic */ float k(InkPageIndicator inkPageIndicator) {
    }

    public static /* synthetic */ h[] l(InkPageIndicator inkPageIndicator) {
    }

    public static /* synthetic */ h[] m(InkPageIndicator inkPageIndicator, h[] hVarArr) {
    }

    public static /* synthetic */ float n(InkPageIndicator inkPageIndicator) {
    }

    public static /* synthetic */ float o(InkPageIndicator inkPageIndicator, float f2) {
    }

    public static /* synthetic */ float p(InkPageIndicator inkPageIndicator) {
    }

    public static /* synthetic */ float q(InkPageIndicator inkPageIndicator, float f2) {
    }

    public static /* synthetic */ int r(InkPageIndicator inkPageIndicator) {
    }

    public static /* synthetic */ void s(InkPageIndicator inkPageIndicator) {
    }

    private void setPageCount(int i2) {
    }

    private void setSelectedPage(int i2) {
    }

    public static /* synthetic */ void t(InkPageIndicator inkPageIndicator) {
    }

    public static /* synthetic */ void u(InkPageIndicator inkPageIndicator, int i2, float f2) {
    }

    public static /* synthetic */ int v(InkPageIndicator inkPageIndicator) {
    }

    public static /* synthetic */ void w(InkPageIndicator inkPageIndicator, int i2, float f2) {
    }

    public static /* synthetic */ void x(InkPageIndicator inkPageIndicator, int i2) {
    }

    public static /* synthetic */ void y(InkPageIndicator inkPageIndicator) {
    }

    public static /* synthetic */ ViewPager2 z(InkPageIndicator inkPageIndicator) {
    }

    @Override // android.view.View
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

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
    }

    public void setViewPager(ViewPager2 viewPager2) {
    }

    public InkPageIndicator(Context context, AttributeSet attributeSet) {
    }

    public InkPageIndicator(Context context, AttributeSet attributeSet, int i2) {
    }
}
