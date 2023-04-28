package h.g.a.p.p.c0;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: GlideExecutor.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class a implements ExecutorService {
    private static final String c = "source";

    /* renamed from: d  reason: collision with root package name */
    private static final String f16719d = "disk-cache";

    /* renamed from: e  reason: collision with root package name */
    private static final int f16720e = 1;

    /* renamed from: f  reason: collision with root package name */
    private static final String f16721f = "GlideExecutor";

    /* renamed from: g  reason: collision with root package name */
    private static final String f16722g = "source-unlimited";

    /* renamed from: h  reason: collision with root package name */
    private static final String f16723h = "animation";

    /* renamed from: i  reason: collision with root package name */
    private static final long f16724i = 0;

    /* renamed from: j  reason: collision with root package name */
    private static final int f16725j = 4;

    /* renamed from: k  reason: collision with root package name */
    private static volatile int f16726k;
    private final ExecutorService b;

    /* compiled from: GlideExecutor.java */
    /* renamed from: h.g.a.p.p.c0.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class C0312a {

        /* renamed from: g  reason: collision with root package name */
        public static final long f16727g = 0;

        /* renamed from: a  reason: collision with root package name */
        private final boolean f16728a;
        private int b;
        private int c;
        @NonNull

        /* renamed from: d  reason: collision with root package name */
        private c f16729d;

        /* renamed from: e  reason: collision with root package name */
        private String f16730e;

        /* renamed from: f  reason: collision with root package name */
        private long f16731f;

        public C0312a(boolean z) {
        }

        public a a() {
        }

        public C0312a b(String str) {
        }

        public C0312a c(@IntRange(from = 1) int i2) {
        }

        public C0312a d(long j2) {
        }

        public C0312a e(@NonNull c cVar) {
        }
    }

    /* compiled from: GlideExecutor.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class b implements ThreadFactory {

        /* renamed from: f  reason: collision with root package name */
        private static final int f16732f = 9;
        private final String b;
        public final c c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f16733d;

        /* renamed from: e  reason: collision with root package name */
        private int f16734e;

        /* compiled from: GlideExecutor.java */
        /* renamed from: h.g.a.p.p.c0.a$b$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class C0313a extends Thread {
            public final /* synthetic */ b b;

            public C0313a(b bVar, Runnable runnable, String str) {
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
            }
        }

        public b(String str, c cVar, boolean z) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(@NonNull Runnable runnable) {
        }
    }

    /* compiled from: GlideExecutor.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface c {

        /* renamed from: a  reason: collision with root package name */
        public static final c f16735a = null;
        public static final c b = null;
        public static final c c = null;

        /* renamed from: d  reason: collision with root package name */
        public static final c f16736d = null;

        /* compiled from: GlideExecutor.java */
        /* renamed from: h.g.a.p.p.c0.a$c$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class C0314a implements c {
            @Override // h.g.a.p.p.c0.a.c
            public void a(Throwable th) {
            }
        }

        /* compiled from: GlideExecutor.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class b implements c {
            @Override // h.g.a.p.p.c0.a.c
            public void a(Throwable th) {
            }
        }

        /* compiled from: GlideExecutor.java */
        /* renamed from: h.g.a.p.p.c0.a$c$c  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class C0315c implements c {
            @Override // h.g.a.p.p.c0.a.c
            public void a(Throwable th) {
            }
        }

        void a(Throwable th);
    }

    @VisibleForTesting
    public a(ExecutorService executorService) {
    }

    public static int a() {
    }

    public static C0312a b() {
    }

    public static a c() {
    }

    @Deprecated
    public static a d(int i2, c cVar) {
    }

    public static C0312a e() {
    }

    public static a f() {
    }

    @Deprecated
    public static a g(int i2, String str, c cVar) {
    }

    @Deprecated
    public static a h(c cVar) {
    }

    public static C0312a i() {
    }

    public static a j() {
    }

    @Deprecated
    public static a k(int i2, String str, c cVar) {
    }

    @Deprecated
    public static a l(c cVar) {
    }

    public static a m() {
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j2, @NonNull TimeUnit timeUnit) throws InterruptedException {
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NonNull Runnable runnable) {
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection) throws InterruptedException {
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public List<Runnable> shutdownNow() {
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public Future<?> submit(@NonNull Runnable runnable) {
    }

    public String toString() {
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection, long j2, @NonNull TimeUnit timeUnit) throws InterruptedException {
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection, long j2, @NonNull TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> Future<T> submit(@NonNull Runnable runnable, T t) {
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(@NonNull Callable<T> callable) {
    }
}
