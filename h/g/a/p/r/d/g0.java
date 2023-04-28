package h.g.a.p.r.d;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* compiled from: TransformationUtils.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    private static final String f16988a = "TransformationUtils";
    public static final int b = 6;
    private static final Paint c = null;

    /* renamed from: d  reason: collision with root package name */
    private static final int f16989d = 7;

    /* renamed from: e  reason: collision with root package name */
    private static final Paint f16990e = null;

    /* renamed from: f  reason: collision with root package name */
    private static final Paint f16991f = null;

    /* renamed from: g  reason: collision with root package name */
    private static final Set<String> f16992g = null;

    /* renamed from: h  reason: collision with root package name */
    private static final Lock f16993h = null;

    /* compiled from: TransformationUtils.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class a implements c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f16994a;

        public a(int i2) {
        }

        @Override // h.g.a.p.r.d.g0.c
        public void a(Canvas canvas, Paint paint, RectF rectF) {
        }
    }

    /* compiled from: TransformationUtils.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class b implements c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f16995a;
        public final /* synthetic */ float b;
        public final /* synthetic */ float c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ float f16996d;

        public b(float f2, float f3, float f4, float f5) {
        }

        @Override // h.g.a.p.r.d.g0.c
        public void a(Canvas canvas, Paint paint, RectF rectF) {
        }
    }

    /* compiled from: TransformationUtils.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface c {
        void a(Canvas canvas, Paint paint, RectF rectF);
    }

    /* compiled from: TransformationUtils.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class d implements Lock {
        @Override // java.util.concurrent.locks.Lock
        public void lock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
        }

        @Override // java.util.concurrent.locks.Lock
        @NonNull
        public Condition newCondition() {
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock(long j2, @NonNull TimeUnit timeUnit) throws InterruptedException {
        }

        @Override // java.util.concurrent.locks.Lock
        public void unlock() {
        }
    }

    private g0() {
    }

    private static void a(@NonNull Bitmap bitmap, @NonNull Bitmap bitmap2, Matrix matrix) {
    }

    public static Bitmap b(@NonNull h.g.a.p.p.a0.e eVar, @NonNull Bitmap bitmap, int i2, int i3) {
    }

    public static Bitmap c(@NonNull h.g.a.p.p.a0.e eVar, @NonNull Bitmap bitmap, int i2, int i3) {
    }

    public static Bitmap d(@NonNull h.g.a.p.p.a0.e eVar, @NonNull Bitmap bitmap, int i2, int i3) {
    }

    private static void e(Canvas canvas) {
    }

    public static Bitmap f(@NonNull h.g.a.p.p.a0.e eVar, @NonNull Bitmap bitmap, int i2, int i3) {
    }

    private static Bitmap g(@NonNull h.g.a.p.p.a0.e eVar, @NonNull Bitmap bitmap) {
    }

    @NonNull
    private static Bitmap.Config h(@NonNull Bitmap bitmap) {
    }

    public static Lock i() {
    }

    public static int j(int i2) {
    }

    @NonNull
    private static Bitmap.Config k(@NonNull Bitmap bitmap) {
    }

    @VisibleForTesting
    public static void l(int i2, Matrix matrix) {
    }

    public static boolean m(int i2) {
    }

    public static Bitmap n(@NonNull Bitmap bitmap, int i2) {
    }

    public static Bitmap o(@NonNull h.g.a.p.p.a0.e eVar, @NonNull Bitmap bitmap, int i2) {
    }

    public static Bitmap p(@NonNull h.g.a.p.p.a0.e eVar, @NonNull Bitmap bitmap, float f2, float f3, float f4, float f5) {
    }

    public static Bitmap q(@NonNull h.g.a.p.p.a0.e eVar, @NonNull Bitmap bitmap, int i2) {
    }

    @Deprecated
    public static Bitmap r(@NonNull h.g.a.p.p.a0.e eVar, @NonNull Bitmap bitmap, int i2, int i3, int i4) {
    }

    private static Bitmap s(@NonNull h.g.a.p.p.a0.e eVar, @NonNull Bitmap bitmap, c cVar) {
    }

    public static void t(Bitmap bitmap, Bitmap bitmap2) {
    }
}
