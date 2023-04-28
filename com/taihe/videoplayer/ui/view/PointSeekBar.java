package com.taihe.videoplayer.ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class PointSeekBar extends RelativeLayout {
    private e A;
    private boolean B;
    private d C;
    private int b;
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private int f7934d;

    /* renamed from: e  reason: collision with root package name */
    private int f7935e;

    /* renamed from: f  reason: collision with root package name */
    private int f7936f;

    /* renamed from: g  reason: collision with root package name */
    private int f7937g;

    /* renamed from: h  reason: collision with root package name */
    private int f7938h;

    /* renamed from: i  reason: collision with root package name */
    private int f7939i;

    /* renamed from: j  reason: collision with root package name */
    private Paint f7940j;

    /* renamed from: k  reason: collision with root package name */
    private Paint f7941k;

    /* renamed from: l  reason: collision with root package name */
    private Paint f7942l;

    /* renamed from: m  reason: collision with root package name */
    private Drawable f7943m;

    /* renamed from: n  reason: collision with root package name */
    private int f7944n;

    /* renamed from: o  reason: collision with root package name */
    private float f7945o;

    /* renamed from: p  reason: collision with root package name */
    private float f7946p;
    private float q;
    private float r;
    private boolean s;
    private float t;
    private float u;
    private int v;
    private int w;
    private float x;
    private h y;
    private List<f> z;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements Runnable {
        public final /* synthetic */ PointSeekBar b;

        public a(PointSeekBar pointSeekBar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b implements Runnable {
        public final /* synthetic */ PointSeekBar b;

        public b(PointSeekBar pointSeekBar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class c implements View.OnClickListener {
        public final /* synthetic */ g b;
        public final /* synthetic */ int c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ PointSeekBar f7947d;

        public c(PointSeekBar pointSeekBar, g gVar, int i2) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface d {
        void a(PointSeekBar pointSeekBar, int i2, boolean z);

        void b(PointSeekBar pointSeekBar);

        void c(PointSeekBar pointSeekBar);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface e {
        void a(View view, int i2);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public int f7948a;
        public int b;

        public f(int i2, int i3) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class h extends View {
        private final Paint b;
        private final Rect c;

        /* renamed from: d  reason: collision with root package name */
        private final Drawable f7950d;

        public h(Context context, Drawable drawable) {
        }

        @Override // android.view.View
        public void onDraw(Canvas canvas) {
        }

        @Override // android.view.View
        public void onSizeChanged(int i2, int i3, int i4, int i5) {
        }
    }

    public PointSeekBar(Context context) {
    }

    public static /* synthetic */ void a(PointSeekBar pointSeekBar) {
    }

    public static /* synthetic */ boolean b(PointSeekBar pointSeekBar) {
    }

    public static /* synthetic */ boolean c(PointSeekBar pointSeekBar, boolean z) {
    }

    public static /* synthetic */ List d(PointSeekBar pointSeekBar) {
    }

    public static /* synthetic */ boolean e(PointSeekBar pointSeekBar) {
    }

    public static /* synthetic */ void f(PointSeekBar pointSeekBar) {
    }

    public static /* synthetic */ void g(PointSeekBar pointSeekBar) {
    }

    public static /* synthetic */ e h(PointSeekBar pointSeekBar) {
    }

    private void j() {
    }

    private void k() {
    }

    private void l() {
    }

    private void m() {
    }

    private void n() {
    }

    private void o(int i2, boolean z) {
    }

    private void p() {
    }

    private float q(float f2) {
    }

    private boolean r(MotionEvent motionEvent) {
    }

    private boolean s(MotionEvent motionEvent) {
    }

    private boolean t(MotionEvent motionEvent) {
    }

    private void u(AttributeSet attributeSet) {
    }

    public int getMax() {
    }

    public int getProgress() {
    }

    public void i(f fVar, int i2) {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    public void setMax(int i2) {
    }

    public void setOnPointClickListener(e eVar) {
    }

    public void setOnSeekBarChangeListener(d dVar) {
    }

    public void setPointList(List<f> list) {
    }

    public void setProgress(int i2) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class g extends View {
        private int b;
        private Paint c;

        /* renamed from: d  reason: collision with root package name */
        private RectF f7949d;

        public g(Context context) {
        }

        private void a() {
        }

        public void b(int i2) {
        }

        public void c(float f2, float f3, float f4, float f5) {
        }

        @Override // android.view.View
        public void onDraw(Canvas canvas) {
        }

        public g(Context context, AttributeSet attributeSet) {
        }

        public g(Context context, AttributeSet attributeSet, int i2) {
        }
    }

    public PointSeekBar(Context context, AttributeSet attributeSet) {
    }

    public PointSeekBar(Context context, AttributeSet attributeSet, int i2) {
    }
}
