package com.tai.danmuku.danmu.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import h.w.a.e.a.c;
import h.w.a.e.b.b.d;
import h.w.a.e.b.b.f;
import h.w.a.e.b.b.m;
import h.w.a.e.b.b.n;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class FakeDanmakuView extends DanmakuView implements c.d {
    private f b;
    private boolean c;

    /* renamed from: d  reason: collision with root package name */
    private c f7813d;

    /* renamed from: e  reason: collision with root package name */
    private int f7814e;

    /* renamed from: f  reason: collision with root package name */
    private int f7815f;

    /* renamed from: g  reason: collision with root package name */
    private float f7816g;

    /* renamed from: h  reason: collision with root package name */
    private f f7817h;

    /* renamed from: i  reason: collision with root package name */
    private long f7818i;

    /* renamed from: j  reason: collision with root package name */
    private long f7819j;

    /* renamed from: k  reason: collision with root package name */
    private long f7820k;

    /* renamed from: l  reason: collision with root package name */
    private Bitmap f7821l;

    /* renamed from: m  reason: collision with root package name */
    private Canvas f7822m;

    /* renamed from: n  reason: collision with root package name */
    private int f7823n;

    /* renamed from: o  reason: collision with root package name */
    private long f7824o;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements Runnable {
        public final /* synthetic */ int b;
        public final /* synthetic */ FakeDanmakuView c;

        public a(FakeDanmakuView fakeDanmakuView, int i2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b extends h.w.a.e.b.c.a {

        /* renamed from: a  reason: collision with root package name */
        private final h.w.a.e.b.c.a f7825a;
        private final long b;
        private final long c;

        /* renamed from: d  reason: collision with root package name */
        private float f7826d;

        /* renamed from: e  reason: collision with root package name */
        private float f7827e;

        /* renamed from: f  reason: collision with root package name */
        private int f7828f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ FakeDanmakuView f7829g;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class a extends m.b<d, Object> {

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ m f7830e;

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ b f7831f;

            public a(b bVar, m mVar) {
            }

            @Override // h.w.a.e.b.b.m.b
            public /* bridge */ /* synthetic */ int a(d dVar) {
            }

            public int e(d dVar) {
            }
        }

        public b(FakeDanmakuView fakeDanmakuView, h.w.a.e.b.c.a aVar, long j2, long j3) {
        }

        public static /* synthetic */ long a(b bVar) {
        }

        public static /* synthetic */ long b(b bVar) {
        }

        public static /* synthetic */ h.w.a.e.b.b.s.d c(b bVar) {
        }

        public static /* synthetic */ h.w.a.e.b.b.s.d d(b bVar) {
        }

        public static /* synthetic */ float e(b bVar) {
        }

        public static /* synthetic */ float f(b bVar) {
        }

        public static /* synthetic */ h.w.a.e.b.b.s.d g(b bVar) {
        }

        public static /* synthetic */ h.w.a.e.b.b.s.d h(b bVar) {
        }

        public static /* synthetic */ f i(b bVar) {
        }

        public static /* synthetic */ h.w.a.e.b.b.s.d j(b bVar) {
        }

        @Override // h.w.a.e.b.c.a
        public float getViewportSizeFactor() {
        }

        @Override // h.w.a.e.b.c.a
        public m parse() {
        }

        @Override // h.w.a.e.b.c.a
        public h.w.a.e.b.c.a setDisplayer(n nVar) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface c {
        void a(long j2);

        void b(long j2, Bitmap bitmap);

        void c(int i2, String str);

        void d(h.w.a.e.b.b.s.d dVar);
    }

    public FakeDanmakuView(Context context) {
    }

    public void a(int i2) {
    }

    public void b(int i2, int i3) {
    }

    public void c(long j2, long j3) {
    }

    @Override // h.w.a.e.a.c.d
    public void danmakuShown(d dVar) {
    }

    @Override // com.tai.danmuku.danmu.widget.DanmakuView, h.w.a.e.a.g
    public long drawDanmakus() {
    }

    @Override // h.w.a.e.a.c.d
    public void drawingFinished() {
    }

    @Override // com.tai.danmuku.danmu.widget.DanmakuView, h.w.a.e.a.g
    public int getViewHeight() {
    }

    @Override // com.tai.danmuku.danmu.widget.DanmakuView, h.w.a.e.a.g
    public int getViewWidth() {
    }

    @Override // com.tai.danmuku.danmu.widget.DanmakuView, android.view.View, h.w.a.e.a.f
    public boolean isShown() {
    }

    @Override // com.tai.danmuku.danmu.widget.DanmakuView, h.w.a.e.a.g
    public boolean isViewReady() {
    }

    @Override // com.tai.danmuku.danmu.widget.DanmakuView, android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // com.tai.danmuku.danmu.widget.DanmakuView, h.w.a.e.a.f
    public void prepare(h.w.a.e.b.c.a aVar, h.w.a.e.b.b.s.d dVar) {
    }

    @Override // h.w.a.e.a.c.d
    public void prepared() {
    }

    @Override // com.tai.danmuku.danmu.widget.DanmakuView, h.w.a.e.a.f
    public void release() {
    }

    public void setOnFrameAvailableListener(c cVar) {
    }

    @Override // h.w.a.e.a.c.d
    public void updateTimer(f fVar) {
    }

    public FakeDanmakuView(Context context, int i2, int i3, float f2) {
    }
}
