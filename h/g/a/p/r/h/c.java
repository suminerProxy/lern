package h.g.a.p.r.h;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import h.g.a.p.n;
import h.g.a.p.r.h.g;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: GifDrawable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class c extends Drawable implements g.b, Animatable, Animatable2Compat {

    /* renamed from: m  reason: collision with root package name */
    public static final int f17090m = -1;

    /* renamed from: n  reason: collision with root package name */
    public static final int f17091n = 0;

    /* renamed from: o  reason: collision with root package name */
    private static final int f17092o = 119;
    private final a b;
    private boolean c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f17093d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f17094e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f17095f;

    /* renamed from: g  reason: collision with root package name */
    private int f17096g;

    /* renamed from: h  reason: collision with root package name */
    private int f17097h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f17098i;

    /* renamed from: j  reason: collision with root package name */
    private Paint f17099j;

    /* renamed from: k  reason: collision with root package name */
    private Rect f17100k;

    /* renamed from: l  reason: collision with root package name */
    private List<Animatable2Compat.AnimationCallback> f17101l;

    /* compiled from: GifDrawable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class a extends Drawable.ConstantState {
        @VisibleForTesting

        /* renamed from: a  reason: collision with root package name */
        public final g f17102a;

        public a(g gVar) {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable(Resources resources) {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
        }
    }

    @Deprecated
    public c(Context context, h.g.a.o.a aVar, h.g.a.p.p.a0.e eVar, n<Bitmap> nVar, int i2, int i3, Bitmap bitmap) {
    }

    private Drawable.Callback b() {
    }

    private Rect d() {
    }

    private Paint i() {
    }

    private void l() {
    }

    private void n() {
    }

    private void s() {
    }

    private void t() {
    }

    @Override // h.g.a.p.r.h.g.b
    public void a() {
    }

    public ByteBuffer c() {
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void clearAnimationCallbacks() {
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
    }

    public Bitmap e() {
    }

    public int f() {
    }

    public int g() {
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
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

    public n<Bitmap> h() {
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
    }

    public int j() {
    }

    public boolean k() {
    }

    public void m() {
    }

    public void o(n<Bitmap> nVar, Bitmap bitmap) {
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
    }

    public void p(boolean z) {
    }

    public void q(int i2) {
    }

    public void r() {
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void registerAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public boolean unregisterAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
    }

    public c(Context context, h.g.a.o.a aVar, n<Bitmap> nVar, int i2, int i3, Bitmap bitmap) {
    }

    public c(a aVar) {
    }

    @VisibleForTesting
    public c(g gVar, Paint paint) {
    }
}
