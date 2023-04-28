package h.w.a.e.b.b.s;

import android.graphics.Canvas;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import h.w.a.e.b.b.s.a;
import h.w.a.e.b.b.s.l.a;
import java.util.List;

/* compiled from: ViewCacheStuffer.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public abstract class l<VH extends a> extends b {
    public static final int CACHE_VIEW_TYPE = -3;
    public static final int DRAW_VIEW_TYPE = -3;
    public static final int INVALID_TYPE = -1;
    public static final int MEASURE_VIEW_TYPE = -2;
    private final int mMaximumHeightPixels;
    private final int mMaximumWidthPixels;
    private SparseArray<List<VH>> mViewHolderArray;

    /* compiled from: ViewCacheStuffer.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public final View f25736a;

        public a(View view) {
        }

        public void a(Canvas canvas, a.C0402a c0402a) {
        }

        public int b() {
        }

        public int c() {
        }

        public void d(int i2, int i3, int i4, int i5) {
        }

        public void e(int i2, int i3) {
        }
    }

    @Override // h.w.a.e.b.b.s.b
    public void clearCaches() {
    }

    @Override // h.w.a.e.b.b.s.b
    public void drawDanmaku(h.w.a.e.b.b.d dVar, Canvas canvas, float f2, float f3, boolean z, a.C0402a c0402a) {
    }

    public int getItemViewType(int i2, h.w.a.e.b.b.d dVar) {
    }

    @Override // h.w.a.e.b.b.s.b
    public void measure(h.w.a.e.b.b.d dVar, TextPaint textPaint, boolean z) {
    }

    public abstract void onBindViewHolder(int i2, VH vh, h.w.a.e.b.b.d dVar, a.C0402a c0402a, TextPaint textPaint);

    public abstract VH onCreateViewHolder(int i2);

    @Override // h.w.a.e.b.b.s.b
    public void releaseResource(h.w.a.e.b.b.d dVar) {
    }
}
