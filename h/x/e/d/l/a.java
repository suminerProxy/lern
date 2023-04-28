package h.x.e.d.l;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.annotation.Nullable;
import androidx.core.view.GestureDetectorCompat;
import androidx.core.widget.ScrollerCompat;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.view.DraweeView;
import java.lang.ref.WeakReference;

/* compiled from: Attacher.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class a implements h.x.e.d.l.c, View.OnTouchListener, i {
    private static final int w = -1;
    private static final int x = 0;
    private static final int y = 1;
    private static final int z = 2;
    private final float[] b;
    private final RectF c;

    /* renamed from: d  reason: collision with root package name */
    private final Interpolator f25863d;

    /* renamed from: e  reason: collision with root package name */
    private float f25864e;

    /* renamed from: f  reason: collision with root package name */
    private float f25865f;

    /* renamed from: g  reason: collision with root package name */
    private float f25866g;

    /* renamed from: h  reason: collision with root package name */
    private long f25867h;

    /* renamed from: i  reason: collision with root package name */
    private k f25868i;

    /* renamed from: j  reason: collision with root package name */
    private GestureDetectorCompat f25869j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f25870k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f25871l;

    /* renamed from: m  reason: collision with root package name */
    private int f25872m;

    /* renamed from: n  reason: collision with root package name */
    private final Matrix f25873n;

    /* renamed from: o  reason: collision with root package name */
    private int f25874o;

    /* renamed from: p  reason: collision with root package name */
    private int f25875p;
    private c q;
    private WeakReference<DraweeView<GenericDraweeHierarchy>> r;
    private g s;
    private j t;
    private View.OnLongClickListener u;
    private h v;

    /* compiled from: Attacher.java */
    /* renamed from: h.x.e.d.l.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class C0411a extends GestureDetector.SimpleOnGestureListener {
        public final /* synthetic */ a b;

        public C0411a(a aVar) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
        }
    }

    /* compiled from: Attacher.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b implements Runnable {
        private final float b;
        private final float c;

        /* renamed from: d  reason: collision with root package name */
        private final long f25876d;

        /* renamed from: e  reason: collision with root package name */
        private final float f25877e;

        /* renamed from: f  reason: collision with root package name */
        private final float f25878f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ a f25879g;

        public b(a aVar, float f2, float f3, float f4, float f5) {
        }

        private float a() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: Attacher.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class c implements Runnable {
        private final ScrollerCompat b;
        private int c;

        /* renamed from: d  reason: collision with root package name */
        private int f25880d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ a f25881e;

        public c(a aVar, Context context) {
        }

        public void a() {
        }

        public void b(int i2, int i3, int i4, int i5) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public a(DraweeView<GenericDraweeHierarchy> draweeView) {
    }

    public static /* synthetic */ View.OnLongClickListener e(a aVar) {
    }

    public static /* synthetic */ void f(a aVar, View view, Runnable runnable) {
    }

    public static /* synthetic */ long g(a aVar) {
    }

    public static /* synthetic */ Interpolator h(a aVar) {
    }

    public static /* synthetic */ Matrix i(a aVar) {
    }

    private void j() {
    }

    private void m() {
    }

    private static void n(float f2, float f3, float f4) {
    }

    private RectF p(Matrix matrix) {
    }

    private float s(Matrix matrix, int i2) {
    }

    private int t() {
    }

    private int u() {
    }

    private void w(View view, Runnable runnable) {
    }

    private void x() {
    }

    private void y() {
    }

    @Override // h.x.e.d.l.c
    public void a(float f2, float f3, float f4, boolean z2) {
    }

    @Override // h.x.e.d.l.c
    public void b(int i2, int i3) {
    }

    @Override // h.x.e.d.l.i
    public void c() {
    }

    @Override // h.x.e.d.l.c
    public void d(float f2, boolean z2) {
    }

    @Override // h.x.e.d.l.c
    public float getMaximumScale() {
    }

    @Override // h.x.e.d.l.c
    public float getMediumScale() {
    }

    @Override // h.x.e.d.l.c
    public float getMinimumScale() {
    }

    @Override // h.x.e.d.l.c
    public g getOnPhotoTapListener() {
    }

    @Override // h.x.e.d.l.c
    public j getOnViewTapListener() {
    }

    @Override // h.x.e.d.l.c
    public float getScale() {
    }

    public void k() {
    }

    public boolean l() {
    }

    public RectF o() {
    }

    @Override // h.x.e.d.l.i
    public void onDrag(float f2, float f3) {
    }

    @Override // h.x.e.d.l.i
    public void onFling(float f2, float f3, float f4, float f5) {
    }

    @Override // h.x.e.d.l.i
    public void onScale(float f2, float f3, float f4) {
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
    }

    public Matrix q() {
    }

    @Nullable
    public DraweeView<GenericDraweeHierarchy> r() {
    }

    @Override // h.x.e.d.l.c
    public void setAllowParentInterceptOnEdge(boolean z2) {
    }

    @Override // h.x.e.d.l.c
    public void setMaximumScale(float f2) {
    }

    @Override // h.x.e.d.l.c
    public void setMediumScale(float f2) {
    }

    @Override // h.x.e.d.l.c
    public void setMinimumScale(float f2) {
    }

    @Override // h.x.e.d.l.c
    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
    }

    @Override // h.x.e.d.l.c
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
    }

    @Override // h.x.e.d.l.c
    public void setOnPhotoTapListener(g gVar) {
    }

    @Override // h.x.e.d.l.c
    public void setOnScaleChangeListener(h hVar) {
    }

    @Override // h.x.e.d.l.c
    public void setOnViewTapListener(j jVar) {
    }

    @Override // h.x.e.d.l.c
    public void setScale(float f2) {
    }

    @Override // h.x.e.d.l.c
    public void setZoomTransitionDuration(long j2) {
    }

    public void v() {
    }
}
