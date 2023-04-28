package h.g.a.p.p.a0;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Set;

/* compiled from: LruBitmapPool.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class k implements e {

    /* renamed from: k  reason: collision with root package name */
    private static final String f16651k = "LruBitmapPool";

    /* renamed from: l  reason: collision with root package name */
    private static final Bitmap.Config f16652l = null;

    /* renamed from: a  reason: collision with root package name */
    private final l f16653a;
    private final Set<Bitmap.Config> b;
    private final long c;

    /* renamed from: d  reason: collision with root package name */
    private final a f16654d;

    /* renamed from: e  reason: collision with root package name */
    private long f16655e;

    /* renamed from: f  reason: collision with root package name */
    private long f16656f;

    /* renamed from: g  reason: collision with root package name */
    private int f16657g;

    /* renamed from: h  reason: collision with root package name */
    private int f16658h;

    /* renamed from: i  reason: collision with root package name */
    private int f16659i;

    /* renamed from: j  reason: collision with root package name */
    private int f16660j;

    /* compiled from: LruBitmapPool.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface a {
        void a(Bitmap bitmap);

        void b(Bitmap bitmap);
    }

    /* compiled from: LruBitmapPool.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class b implements a {
        @Override // h.g.a.p.p.a0.k.a
        public void a(Bitmap bitmap) {
        }

        @Override // h.g.a.p.p.a0.k.a
        public void b(Bitmap bitmap) {
        }
    }

    /* compiled from: LruBitmapPool.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class c implements a {

        /* renamed from: a  reason: collision with root package name */
        private final Set<Bitmap> f16661a;

        private c() {
        }

        @Override // h.g.a.p.p.a0.k.a
        public void a(Bitmap bitmap) {
        }

        @Override // h.g.a.p.p.a0.k.a
        public void b(Bitmap bitmap) {
        }
    }

    public k(long j2, l lVar, Set<Bitmap.Config> set) {
    }

    @TargetApi(26)
    private static void h(Bitmap.Config config) {
    }

    @NonNull
    private static Bitmap i(int i2, int i3, @Nullable Bitmap.Config config) {
    }

    private void j() {
    }

    private void k() {
    }

    private void l() {
    }

    @TargetApi(26)
    private static Set<Bitmap.Config> o() {
    }

    private static l p() {
    }

    @Nullable
    private synchronized Bitmap q(int i2, int i3, @Nullable Bitmap.Config config) {
    }

    @TargetApi(19)
    private static void s(Bitmap bitmap) {
    }

    private static void u(Bitmap bitmap) {
    }

    private synchronized void v(long j2) {
    }

    @Override // h.g.a.p.p.a0.e
    @SuppressLint({"InlinedApi"})
    public void a(int i2) {
    }

    @Override // h.g.a.p.p.a0.e
    public void b() {
    }

    @Override // h.g.a.p.p.a0.e
    public synchronized void c(float f2) {
    }

    @Override // h.g.a.p.p.a0.e
    public synchronized void d(Bitmap bitmap) {
    }

    @Override // h.g.a.p.p.a0.e
    public long e() {
    }

    @Override // h.g.a.p.p.a0.e
    @NonNull
    public Bitmap f(int i2, int i3, Bitmap.Config config) {
    }

    @Override // h.g.a.p.p.a0.e
    @NonNull
    public Bitmap g(int i2, int i3, Bitmap.Config config) {
    }

    public long m() {
    }

    public long n() {
    }

    public long r() {
    }

    public long t() {
    }

    public k(long j2) {
    }

    public k(long j2, Set<Bitmap.Config> set) {
    }
}
