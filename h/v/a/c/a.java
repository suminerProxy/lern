package h.v.a.c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;
import java.util.ArrayList;

/* compiled from: MaterialProgressDrawable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class a extends Drawable implements Animatable {
    private static final float A = 3.0f;
    private static final int B = 1333;
    private static final float C = 5.0f;
    private static final int D = 10;
    private static final int E = 5;
    private static final float F = 5.0f;
    private static final int G = 12;
    private static final int H = 6;
    private static final float I = 0.8f;
    private static final int J = 503316480;
    private static final int K = 1023410176;
    private static final float L = 3.5f;
    private static final float M = 0.0f;
    private static final float N = 1.75f;

    /* renamed from: p  reason: collision with root package name */
    public static final int f25398p = 0;
    public static final int q = 1;
    private static final Interpolator r = null;
    private static final Interpolator s = null;
    private static final Interpolator t = null;
    private static final Interpolator u = null;
    private static final int v = 40;
    private static final float w = 8.75f;
    private static final float x = 2.5f;
    private static final int y = 56;
    private static final float z = 12.5f;
    private final int[] b;
    private final ArrayList<Animation> c;

    /* renamed from: d  reason: collision with root package name */
    private final h f25399d;

    /* renamed from: e  reason: collision with root package name */
    private final Drawable.Callback f25400e;

    /* renamed from: f  reason: collision with root package name */
    private float f25401f;

    /* renamed from: g  reason: collision with root package name */
    private Resources f25402g;

    /* renamed from: h  reason: collision with root package name */
    private View f25403h;

    /* renamed from: i  reason: collision with root package name */
    private Animation f25404i;

    /* renamed from: j  reason: collision with root package name */
    private float f25405j;

    /* renamed from: k  reason: collision with root package name */
    private double f25406k;

    /* renamed from: l  reason: collision with root package name */
    private double f25407l;

    /* renamed from: m  reason: collision with root package name */
    private Animation f25408m;

    /* renamed from: n  reason: collision with root package name */
    private int f25409n;

    /* renamed from: o  reason: collision with root package name */
    private ShapeDrawable f25410o;

    /* compiled from: MaterialProgressDrawable.java */
    /* renamed from: h.v.a.c.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class C0389a implements Drawable.Callback {
        public final /* synthetic */ a b;

        public C0389a(a aVar) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        }
    }

    /* compiled from: MaterialProgressDrawable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b extends Animation {
        public final /* synthetic */ h b;
        public final /* synthetic */ a c;

        public b(a aVar, h hVar) {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f2, Transformation transformation) {
        }
    }

    /* compiled from: MaterialProgressDrawable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class c implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h f25411a;
        public final /* synthetic */ a b;

        public c(a aVar, h hVar) {
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

    /* compiled from: MaterialProgressDrawable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class d extends Animation {
        public final /* synthetic */ h b;
        public final /* synthetic */ a c;

        public d(a aVar, h hVar) {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f2, Transformation transformation) {
        }
    }

    /* compiled from: MaterialProgressDrawable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class e implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h f25412a;
        public final /* synthetic */ a b;

        public e(a aVar, h hVar) {
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

    /* compiled from: MaterialProgressDrawable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class f extends AccelerateDecelerateInterpolator {
        private f() {
        }

        @Override // android.view.animation.AccelerateDecelerateInterpolator, android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
        }

        public /* synthetic */ f(C0389a c0389a) {
        }
    }

    /* compiled from: MaterialProgressDrawable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class g extends OvalShape {
        private RadialGradient b;
        private int c;

        /* renamed from: d  reason: collision with root package name */
        private Paint f25413d;

        /* renamed from: e  reason: collision with root package name */
        private int f25414e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ a f25415f;

        public g(a aVar, int i2, int i3) {
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
        }
    }

    /* compiled from: MaterialProgressDrawable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class h {

        /* renamed from: a  reason: collision with root package name */
        private final RectF f25416a;
        private final Paint b;
        private final Paint c;

        /* renamed from: d  reason: collision with root package name */
        private final Drawable.Callback f25417d;

        /* renamed from: e  reason: collision with root package name */
        private final Paint f25418e;

        /* renamed from: f  reason: collision with root package name */
        private float f25419f;

        /* renamed from: g  reason: collision with root package name */
        private float f25420g;

        /* renamed from: h  reason: collision with root package name */
        private float f25421h;

        /* renamed from: i  reason: collision with root package name */
        private float f25422i;

        /* renamed from: j  reason: collision with root package name */
        private float f25423j;

        /* renamed from: k  reason: collision with root package name */
        private int[] f25424k;

        /* renamed from: l  reason: collision with root package name */
        private int f25425l;

        /* renamed from: m  reason: collision with root package name */
        private float f25426m;

        /* renamed from: n  reason: collision with root package name */
        private float f25427n;

        /* renamed from: o  reason: collision with root package name */
        private float f25428o;

        /* renamed from: p  reason: collision with root package name */
        private boolean f25429p;
        private Path q;
        private float r;
        private double s;
        private int t;
        private int u;
        private int v;
        private int w;

        public h(Drawable.Callback callback) {
        }

        private void b(Canvas canvas, float f2, float f3, Rect rect) {
        }

        private void n() {
        }

        public void A(boolean z) {
        }

        public void B(float f2) {
        }

        public void C(float f2) {
        }

        public void D() {
        }

        public void a(Canvas canvas, Rect rect) {
        }

        public int c() {
        }

        public double d() {
        }

        public float e() {
        }

        public float f() {
        }

        public float g() {
        }

        public float h() {
        }

        public float i() {
        }

        public float j() {
        }

        public float k() {
        }

        public float l() {
        }

        public void m() {
        }

        public void o() {
        }

        public void p(int i2) {
        }

        public void q(float f2, float f3) {
        }

        public void r(float f2) {
        }

        public void s(int i2) {
        }

        public void t(double d2) {
        }

        public void u(ColorFilter colorFilter) {
        }

        public void v(int i2) {
        }

        public void w(int[] iArr) {
        }

        public void x(float f2) {
        }

        public void y(int i2, int i3) {
        }

        public void z(float f2) {
        }
    }

    /* compiled from: MaterialProgressDrawable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class i extends AccelerateDecelerateInterpolator {
        private i() {
        }

        @Override // android.view.animation.AccelerateDecelerateInterpolator, android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
        }

        public /* synthetic */ i(C0389a c0389a) {
        }
    }

    public a(Context context, View view) {
    }

    public static /* synthetic */ Animation a(a aVar) {
    }

    public static /* synthetic */ View b(a aVar) {
    }

    public static /* synthetic */ Interpolator c() {
    }

    public static /* synthetic */ Interpolator d() {
    }

    public static /* synthetic */ float e(a aVar) {
    }

    public static /* synthetic */ float f(a aVar, float f2) {
    }

    private float g() {
    }

    private void m(double d2, double d3, double d4, double d5, float f2, float f3) {
    }

    private void o(double d2) {
    }

    private void p() {
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
    }

    public void h(float f2) {
    }

    public void i(int i2) {
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
    }

    public void j(int... iArr) {
    }

    public void k(float f2) {
    }

    public void l(float f2) {
    }

    public void n(float f2, float f3) {
    }

    public void q(boolean z2) {
    }

    public void r(int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
    }
}
