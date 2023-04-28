package h.g.a.p.r.d;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/* compiled from: Downsampler.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class q {

    /* renamed from: f  reason: collision with root package name */
    public static final String f17035f = "Downsampler";

    /* renamed from: g  reason: collision with root package name */
    public static final h.g.a.p.i<h.g.a.p.b> f17036g = null;

    /* renamed from: h  reason: collision with root package name */
    public static final h.g.a.p.i<h.g.a.p.k> f17037h = null;
    @Deprecated

    /* renamed from: i  reason: collision with root package name */
    public static final h.g.a.p.i<p> f17038i = null;

    /* renamed from: j  reason: collision with root package name */
    public static final h.g.a.p.i<Boolean> f17039j = null;

    /* renamed from: k  reason: collision with root package name */
    public static final h.g.a.p.i<Boolean> f17040k = null;

    /* renamed from: l  reason: collision with root package name */
    private static final String f17041l = "image/vnd.wap.wbmp";

    /* renamed from: m  reason: collision with root package name */
    private static final String f17042m = "image/x-ico";

    /* renamed from: n  reason: collision with root package name */
    private static final Set<String> f17043n = null;

    /* renamed from: o  reason: collision with root package name */
    private static final b f17044o = null;

    /* renamed from: p  reason: collision with root package name */
    private static final Set<ImageHeaderParser.ImageType> f17045p = null;
    private static final Queue<BitmapFactory.Options> q = null;

    /* renamed from: a  reason: collision with root package name */
    private final h.g.a.p.p.a0.e f17046a;
    private final DisplayMetrics b;
    private final h.g.a.p.p.a0.b c;

    /* renamed from: d  reason: collision with root package name */
    private final List<ImageHeaderParser> f17047d;

    /* renamed from: e  reason: collision with root package name */
    private final w f17048e;

    /* compiled from: Downsampler.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class a implements b {
        @Override // h.g.a.p.r.d.q.b
        public void a(h.g.a.p.p.a0.e eVar, Bitmap bitmap) {
        }

        @Override // h.g.a.p.r.d.q.b
        public void b() {
        }
    }

    /* compiled from: Downsampler.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface b {
        void a(h.g.a.p.p.a0.e eVar, Bitmap bitmap) throws IOException;

        void b();
    }

    public q(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, h.g.a.p.p.a0.e eVar, h.g.a.p.p.a0.b bVar) {
    }

    private static int a(double d2) {
    }

    private void b(x xVar, h.g.a.p.b bVar, boolean z, boolean z2, BitmapFactory.Options options, int i2, int i3) {
    }

    private static void c(ImageHeaderParser.ImageType imageType, x xVar, b bVar, h.g.a.p.p.a0.e eVar, p pVar, int i2, int i3, int i4, int i5, int i6, BitmapFactory.Options options) throws IOException {
    }

    private h.g.a.p.p.v<Bitmap> e(x xVar, int i2, int i3, h.g.a.p.j jVar, b bVar) throws IOException {
    }

    private Bitmap h(x xVar, BitmapFactory.Options options, p pVar, h.g.a.p.b bVar, h.g.a.p.k kVar, boolean z, int i2, int i3, boolean z2, b bVar2) throws IOException {
    }

    private static Bitmap i(x xVar, BitmapFactory.Options options, b bVar, h.g.a.p.p.a0.e eVar) throws IOException {
    }

    @Nullable
    @TargetApi(19)
    private static String j(Bitmap bitmap) {
    }

    private static synchronized BitmapFactory.Options k() {
    }

    private static int l(double d2) {
    }

    private static int[] m(x xVar, BitmapFactory.Options options, b bVar, h.g.a.p.p.a0.e eVar) throws IOException {
    }

    private static String n(BitmapFactory.Options options) {
    }

    private static boolean r(int i2) {
    }

    private static boolean s(BitmapFactory.Options options) {
    }

    private static void t(int i2, int i3, String str, BitmapFactory.Options options, Bitmap bitmap, int i4, int i5, long j2) {
    }

    private static IOException u(IllegalArgumentException illegalArgumentException, int i2, int i3, String str, BitmapFactory.Options options) {
    }

    private static void v(BitmapFactory.Options options) {
    }

    private static void w(BitmapFactory.Options options) {
    }

    private static int x(double d2) {
    }

    @TargetApi(26)
    private static void y(BitmapFactory.Options options, h.g.a.p.p.a0.e eVar, int i2, int i3) {
    }

    private boolean z(ImageHeaderParser.ImageType imageType) {
    }

    @RequiresApi(21)
    public h.g.a.p.p.v<Bitmap> d(ParcelFileDescriptor parcelFileDescriptor, int i2, int i3, h.g.a.p.j jVar) throws IOException {
    }

    public h.g.a.p.p.v<Bitmap> f(InputStream inputStream, int i2, int i3, h.g.a.p.j jVar) throws IOException {
    }

    public h.g.a.p.p.v<Bitmap> g(InputStream inputStream, int i2, int i3, h.g.a.p.j jVar, b bVar) throws IOException {
    }

    public boolean o(ParcelFileDescriptor parcelFileDescriptor) {
    }

    public boolean p(InputStream inputStream) {
    }

    public boolean q(ByteBuffer byteBuffer) {
    }
}
