package h.s.a.l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.ImageView;
import com.tencent.ugc.videoprocessor.watermark.data.AnimatedPasterJsonConfig;
import com.umeng.analytics.pro.am;
import h.s.a.g;
import h.s.a.j;
import h.s.a.l.a;
import h.s.a.m.d;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: SVGACanvasDrawer.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0002'FB\u0017\u0012\u0006\u0010C\u001a\u00020B\u0012\u0006\u0010-\u001a\u00020)¢\u0006\u0004\bD\u0010EJ)\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u00060\u0005R\u00020\u00010\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ)\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u00060\u0005R\u00020\u00010\u0004H\u0002¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0016\u001a\u00020\f2\n\u0010\u0013\u001a\u00060\u0005R\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0018\u001a\u00020\f2\n\u0010\u0013\u001a\u00060\u0005R\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J3\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001a2\n\u0010\u0013\u001a\u00060\u0005R\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010\u001f\u001a\u00020\f2\n\u0010\u0013\u001a\u00060\u0005R\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001f\u0010\u0019J\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u000fH\u0002¢\u0006\u0004\b\"\u0010#J+\u0010$\u001a\u00020\f2\n\u0010\u0013\u001a\u00060\u0005R\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b$\u0010\u0017J'\u0010'\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(R\u0019\u0010-\u001a\u00020)8\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010*\u001a\u0004\b+\u0010,R2\u00103\u001a\u001e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u001a0.j\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u001a`08\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001e\u00106\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u00105R\u001e\u00107\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u00105R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010>\u001a\u00020<8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010=R\u0016\u0010A\u001a\u00020?8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010@¨\u0006G"}, d2 = {"Lh/s/a/l/b;", "Lh/s/a/l/a;", "", "spriteIndex", "", "Lh/s/a/l/a$a;", "sprites", "", "k", "(ILjava/util/List;)Z", "l", "frameIndex", "", "n", "(I)V", "Landroid/graphics/Matrix;", "transform", "o", "(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;", "sprite", "Landroid/graphics/Canvas;", "canvas", "h", "(Lh/s/a/l/a$a;Landroid/graphics/Canvas;I)V", "f", "(Lh/s/a/l/a$a;Landroid/graphics/Canvas;)V", "Landroid/graphics/Bitmap;", "drawingBitmap", "frameMatrix", "i", "(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;Lh/s/a/l/a$a;Landroid/graphics/Matrix;)V", "g", "matrix", "", "m", "(Landroid/graphics/Matrix;)F", "e", "Landroid/widget/ImageView$ScaleType;", "scaleType", "a", "(Landroid/graphics/Canvas;ILandroid/widget/ImageView$ScaleType;)V", "Lh/s/a/g;", "Lh/s/a/g;", "j", "()Lh/s/a/g;", "dynamicItem", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "d", "Ljava/util/HashMap;", "drawTextCache", "", "[Ljava/lang/Boolean;", "beginIndexList", "endIndexList", "Lh/s/a/l/b$b;", am.aF, "Lh/s/a/l/b$b;", "sharedValues", "Lh/s/a/l/b$a;", "Lh/s/a/l/b$a;", "pathCache", "", "[F", "matrixScaleTempValues", "Lh/s/a/j;", "videoItem", "<init>", "(Lh/s/a/j;Lh/s/a/g;)V", "b", h.s.a.a.b}, k = 1, mv = {1, 4, 0})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class b extends h.s.a.l.a {
    private final C0343b c;

    /* renamed from: d  reason: collision with root package name */
    private final HashMap<String, Bitmap> f17825d;

    /* renamed from: e  reason: collision with root package name */
    private final a f17826e;

    /* renamed from: f  reason: collision with root package name */
    private Boolean[] f17827f;

    /* renamed from: g  reason: collision with root package name */
    private Boolean[] f17828g;

    /* renamed from: h  reason: collision with root package name */
    private final float[] f17829h;
    @NotNull

    /* renamed from: i  reason: collision with root package name */
    private final g f17830i;

    /* compiled from: SVGACanvasDrawer.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\rR2\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u000fj\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t`\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\r¨\u0006\u0017"}, d2 = {"h/s/a/l/b$a", "", "Landroid/graphics/Canvas;", "canvas", "", "b", "(Landroid/graphics/Canvas;)V", "Lh/s/a/m/d;", "shape", "Landroid/graphics/Path;", "a", "(Lh/s/a/m/d;)Landroid/graphics/Path;", "", "I", "canvasWidth", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", am.aF, "Ljava/util/HashMap;", "cache", "canvasHeight", "<init>", "()V", h.s.a.a.b}, k = 1, mv = {1, 4, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private int f17831a;
        private int b;
        private final HashMap<d, Path> c;

        @NotNull
        public final Path a(@NotNull d dVar) {
        }

        public final void b(@NotNull Canvas canvas) {
        }
    }

    /* compiled from: SVGACanvasDrawer.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b$\u0010%J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\u0007J\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u0004J\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001eR\u0016\u0010!\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010 R\u0016\u0010\"\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0016\u0010#\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0017¨\u0006&"}, d2 = {"h/s/a/l/b$b", "", "Landroid/graphics/Paint;", "f", "()Landroid/graphics/Paint;", "Landroid/graphics/Path;", "g", "()Landroid/graphics/Path;", "h", "Landroid/graphics/Matrix;", am.aF, "()Landroid/graphics/Matrix;", "d", "b", "Landroid/graphics/Bitmap;", "e", "()Landroid/graphics/Bitmap;", "", AnimatedPasterJsonConfig.CONFIG_WIDTH, AnimatedPasterJsonConfig.CONFIG_HEIGHT, "Landroid/graphics/Canvas;", "a", "(II)Landroid/graphics/Canvas;", "Landroid/graphics/Path;", "sharedPath", "Landroid/graphics/Matrix;", "sharedMatrix2", "sharedMatrix", "Landroid/graphics/Canvas;", "shareMatteCanvas", "Landroid/graphics/Bitmap;", "sharedMatteBitmap", "Landroid/graphics/Paint;", "sharedPaint", "shareMattePaint", "sharedPath2", "<init>", "()V", h.s.a.a.b}, k = 1, mv = {1, 4, 0})
    /* renamed from: h.s.a.l.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class C0343b {

        /* renamed from: a  reason: collision with root package name */
        private final Paint f17832a;
        private final Path b;
        private final Path c;

        /* renamed from: d  reason: collision with root package name */
        private final Matrix f17833d;

        /* renamed from: e  reason: collision with root package name */
        private final Matrix f17834e;

        /* renamed from: f  reason: collision with root package name */
        private final Paint f17835f;

        /* renamed from: g  reason: collision with root package name */
        private Canvas f17836g;

        /* renamed from: h  reason: collision with root package name */
        private Bitmap f17837h;

        @NotNull
        public final Canvas a(int i2, int i3) {
        }

        @NotNull
        public final Paint b() {
        }

        @NotNull
        public final Matrix c() {
        }

        @NotNull
        public final Matrix d() {
        }

        @NotNull
        public final Bitmap e() {
        }

        @NotNull
        public final Paint f() {
        }

        @NotNull
        public final Path g() {
        }

        @NotNull
        public final Path h() {
        }
    }

    public b(@NotNull j jVar, @NotNull g gVar) {
    }

    private final void e(a.C0342a c0342a, Canvas canvas, int i2) {
    }

    private final void f(a.C0342a c0342a, Canvas canvas) {
    }

    private final void g(a.C0342a c0342a, Canvas canvas) {
    }

    private final void h(a.C0342a c0342a, Canvas canvas, int i2) {
    }

    private final void i(Canvas canvas, Bitmap bitmap, a.C0342a c0342a, Matrix matrix) {
    }

    private final boolean k(int i2, List<a.C0342a> list) {
    }

    private final boolean l(int i2, List<a.C0342a> list) {
    }

    private final float m(Matrix matrix) {
    }

    private final void n(int i2) {
    }

    private final Matrix o(Matrix matrix) {
    }

    @Override // h.s.a.l.a
    public void a(@NotNull Canvas canvas, int i2, @NotNull ImageView.ScaleType scaleType) {
    }

    @NotNull
    public final g j() {
    }
}
