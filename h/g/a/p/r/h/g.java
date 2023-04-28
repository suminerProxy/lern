package h.g.a.p.r.h;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.Glide;
import h.g.a.k;
import h.g.a.p.n;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: GifFrameLoader.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private final h.g.a.o.a f17104a;
    private final Handler b;
    private final List<b> c;

    /* renamed from: d  reason: collision with root package name */
    public final k f17105d;

    /* renamed from: e  reason: collision with root package name */
    private final h.g.a.p.p.a0.e f17106e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f17107f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f17108g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f17109h;

    /* renamed from: i  reason: collision with root package name */
    private h.g.a.j<Bitmap> f17110i;

    /* renamed from: j  reason: collision with root package name */
    private a f17111j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f17112k;

    /* renamed from: l  reason: collision with root package name */
    private a f17113l;

    /* renamed from: m  reason: collision with root package name */
    private Bitmap f17114m;

    /* renamed from: n  reason: collision with root package name */
    private n<Bitmap> f17115n;

    /* renamed from: o  reason: collision with root package name */
    private a f17116o;
    @Nullable

    /* renamed from: p  reason: collision with root package name */
    private d f17117p;
    private int q;
    private int r;
    private int s;

    /* compiled from: GifFrameLoader.java */
    @VisibleForTesting
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class a extends h.g.a.t.l.e<Bitmap> {
        private final Handler b;
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        private final long f17118d;

        /* renamed from: e  reason: collision with root package name */
        private Bitmap f17119e;

        public a(Handler handler, int i2, long j2) {
        }

        public Bitmap a() {
        }

        @Override // h.g.a.t.l.p
        public void onLoadCleared(@Nullable Drawable drawable) {
        }

        @Override // h.g.a.t.l.p
        public /* bridge */ /* synthetic */ void onResourceReady(@NonNull Object obj, @Nullable h.g.a.t.m.f fVar) {
        }

        public void onResourceReady(@NonNull Bitmap bitmap, @Nullable h.g.a.t.m.f<? super Bitmap> fVar) {
        }
    }

    /* compiled from: GifFrameLoader.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface b {
        void a();
    }

    /* compiled from: GifFrameLoader.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class c implements Handler.Callback {
        public static final int c = 1;

        /* renamed from: d  reason: collision with root package name */
        public static final int f17120d = 2;
        public final /* synthetic */ g b;

        public c(g gVar) {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
        }
    }

    /* compiled from: GifFrameLoader.java */
    @VisibleForTesting
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface d {
        void a();
    }

    public g(Glide glide, h.g.a.o.a aVar, int i2, int i3, n<Bitmap> nVar, Bitmap bitmap) {
    }

    private static h.g.a.p.g g() {
    }

    private static h.g.a.j<Bitmap> k(k kVar, int i2, int i3) {
    }

    private void n() {
    }

    private void p() {
    }

    private void s() {
    }

    private void t() {
    }

    public void a() {
    }

    public ByteBuffer b() {
    }

    public Bitmap c() {
    }

    public int d() {
    }

    public Bitmap e() {
    }

    public int f() {
    }

    public n<Bitmap> h() {
    }

    public int i() {
    }

    public int j() {
    }

    public int l() {
    }

    public int m() {
    }

    @VisibleForTesting
    public void o(a aVar) {
    }

    public void q(n<Bitmap> nVar, Bitmap bitmap) {
    }

    public void r() {
    }

    @VisibleForTesting
    public void setOnEveryFrameReadyListener(@Nullable d dVar) {
    }

    public void u(b bVar) {
    }

    public void v(b bVar) {
    }

    public g(h.g.a.p.p.a0.e eVar, k kVar, h.g.a.o.a aVar, Handler handler, h.g.a.j<Bitmap> jVar, n<Bitmap> nVar, Bitmap bitmap) {
    }
}
