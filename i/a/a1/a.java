package i.a.a1;

import i.a.a1.a;
import i.a.x0.r;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: BaseTestConsumer.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class a<T, U extends a<T, U>> implements i.a.u0.c {
    public final CountDownLatch b;
    public final List<T> c;

    /* renamed from: d  reason: collision with root package name */
    public final List<Throwable> f26625d;

    /* renamed from: e  reason: collision with root package name */
    public long f26626e;

    /* renamed from: f  reason: collision with root package name */
    public Thread f26627f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f26628g;

    /* renamed from: h  reason: collision with root package name */
    public int f26629h;

    /* renamed from: i  reason: collision with root package name */
    public int f26630i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f26631j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f26632k;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* compiled from: BaseTestConsumer.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static abstract class b implements Runnable {
        private static final /* synthetic */ b[] $VALUES = null;
        public static final b SLEEP_1000MS = null;
        public static final b SLEEP_100MS = null;
        public static final b SLEEP_10MS = null;
        public static final b SLEEP_1MS = null;
        public static final b SPIN = null;
        public static final b YIELD = null;

        /* compiled from: BaseTestConsumer.java */
        /* renamed from: i.a.a1.a$b$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public enum C0425a extends b {
            public C0425a(String str, int i2) {
            }

            @Override // i.a.a1.a.b, java.lang.Runnable
            public void run() {
            }
        }

        /* compiled from: BaseTestConsumer.java */
        /* renamed from: i.a.a1.a$b$b  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public enum C0426b extends b {
            public C0426b(String str, int i2) {
            }

            @Override // i.a.a1.a.b, java.lang.Runnable
            public void run() {
            }
        }

        /* compiled from: BaseTestConsumer.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public enum c extends b {
            public c(String str, int i2) {
            }

            @Override // i.a.a1.a.b, java.lang.Runnable
            public void run() {
            }
        }

        /* compiled from: BaseTestConsumer.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public enum d extends b {
            public d(String str, int i2) {
            }

            @Override // i.a.a1.a.b, java.lang.Runnable
            public void run() {
            }
        }

        /* compiled from: BaseTestConsumer.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public enum e extends b {
            public e(String str, int i2) {
            }

            @Override // i.a.a1.a.b, java.lang.Runnable
            public void run() {
            }
        }

        /* compiled from: BaseTestConsumer.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public enum f extends b {
            public f(String str, int i2) {
            }

            @Override // i.a.a1.a.b, java.lang.Runnable
            public void run() {
            }
        }

        private b(String str, int i2) {
        }

        public static void sleep(int i2) {
        }

        public static b valueOf(String str) {
        }

        public static b[] values() {
        }

        @Override // java.lang.Runnable
        public abstract void run();

        public /* synthetic */ b(String str, int i2, C0424a c0424a) {
        }
    }

    public static String X(Object obj) {
    }

    public final U A(Iterable<? extends T> iterable) {
    }

    public final U B(Iterable<? extends T> iterable) {
    }

    public final U C(Collection<? extends T> collection) {
    }

    public final U D(Collection<? extends T> collection) {
    }

    public final U E(T... tArr) {
    }

    public final U F(T... tArr) {
    }

    public final U G() throws InterruptedException {
    }

    public final boolean H(long j2, TimeUnit timeUnit) throws InterruptedException {
    }

    public final U I(int i2) {
    }

    public final U J(int i2, Runnable runnable) {
    }

    public final U K(int i2, Runnable runnable, long j2) {
    }

    public final U L(long j2, TimeUnit timeUnit) {
    }

    public final boolean M() {
    }

    public final boolean N(long j2, TimeUnit timeUnit) {
    }

    public final U O() {
    }

    public final long P() {
    }

    public final int Q() {
    }

    public final List<Throwable> R() {
    }

    public final AssertionError S(String str) {
    }

    public final List<List<Object>> T() {
    }

    public final boolean U() {
    }

    public final boolean V() {
    }

    public final Thread W() {
    }

    public final int Y() {
    }

    public final List<T> Z() {
    }

    public final U a() {
    }

    public final U a0(CharSequence charSequence) {
    }

    public final U b() {
    }

    public final U c(r<Throwable> rVar) {
    }

    public final U d(Class<? extends Throwable> cls) {
    }

    public final U e(Throwable th) {
    }

    public final U f(String str) {
    }

    public final U g(r<Throwable> rVar, T... tArr) {
    }

    public final U h(Class<? extends Throwable> cls, T... tArr) {
    }

    public final U i(Class<? extends Throwable> cls, String str, T... tArr) {
    }

    public final U j(r<? super T> rVar) {
    }

    public final U k(T t) {
    }

    public final U l() {
    }

    public final U m() {
    }

    public final U n() {
    }

    public final U o() {
    }

    public abstract U p();

    public final U q() {
    }

    public final U r(T... tArr) {
    }

    public abstract U s();

    public final U t() {
    }

    public final U u() {
    }

    public final U v(r<T> rVar) {
    }

    public final U w(T t) {
    }

    public final U x(int i2, r<T> rVar) {
    }

    public final U y(int i2, T t) {
    }

    public final U z(int i2) {
    }
}
