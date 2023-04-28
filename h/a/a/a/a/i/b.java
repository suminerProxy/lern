package h.a.a.a.a.i;

import java.util.Queue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: LogThreadPoolManager.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class b {

    /* renamed from: g  reason: collision with root package name */
    private static final int f15643g = 1;

    /* renamed from: h  reason: collision with root package name */
    private static final int f15644h = 1;

    /* renamed from: i  reason: collision with root package name */
    private static final int f15645i = 5000;

    /* renamed from: j  reason: collision with root package name */
    private static final int f15646j = 500;

    /* renamed from: k  reason: collision with root package name */
    private static final int f15647k = 1000;

    /* renamed from: l  reason: collision with root package name */
    private static final int f15648l = 200;

    /* renamed from: m  reason: collision with root package name */
    private static b f15649m;

    /* renamed from: a  reason: collision with root package name */
    private final Queue<Runnable> f15650a;
    private final RejectedExecutionHandler b;
    private final ScheduledExecutorService c;

    /* renamed from: d  reason: collision with root package name */
    private final ThreadPoolExecutor f15651d;

    /* renamed from: e  reason: collision with root package name */
    private final Runnable f15652e;

    /* renamed from: f  reason: collision with root package name */
    public final ScheduledFuture<?> f15653f;

    /* compiled from: LogThreadPoolManager.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class a implements RejectedExecutionHandler {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f15654a;

        public a(b bVar) {
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        }
    }

    /* compiled from: LogThreadPoolManager.java */
    /* renamed from: h.a.a.a.a.i.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class ThreadFactoryC0293b implements ThreadFactory {
        public final /* synthetic */ b b;

        public ThreadFactoryC0293b(b bVar) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
        }
    }

    /* compiled from: LogThreadPoolManager.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class c implements Runnable {
        public final /* synthetic */ b b;

        public c(b bVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    private b() {
    }

    public static /* synthetic */ Queue a(b bVar) {
    }

    public static /* synthetic */ boolean b(b bVar) {
    }

    public static /* synthetic */ ThreadPoolExecutor c(b bVar) {
    }

    private boolean e() {
    }

    public static b f() {
    }

    public void d(Runnable runnable) {
    }
}
