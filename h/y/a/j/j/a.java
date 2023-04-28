package h.y.a.j.j;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: DispatcherExecutor.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static ThreadPoolExecutor f26224a = null;
    private static ExecutorService b = null;
    private static final int c = 0;

    /* renamed from: d  reason: collision with root package name */
    public static final int f26225d = 0;

    /* renamed from: e  reason: collision with root package name */
    private static final int f26226e = 0;

    /* renamed from: f  reason: collision with root package name */
    private static final int f26227f = 5;

    /* renamed from: g  reason: collision with root package name */
    private static final BlockingQueue<Runnable> f26228g = null;

    /* renamed from: h  reason: collision with root package name */
    private static final b f26229h = null;

    /* renamed from: i  reason: collision with root package name */
    private static final RejectedExecutionHandler f26230i = null;

    /* compiled from: DispatcherExecutor.java */
    /* renamed from: h.y.a.j.j.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class RejectedExecutionHandlerC0418a implements RejectedExecutionHandler {
        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        }
    }

    /* compiled from: DispatcherExecutor.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class b implements ThreadFactory {

        /* renamed from: e  reason: collision with root package name */
        private static final AtomicInteger f26231e = null;
        private final ThreadGroup b;
        private final AtomicInteger c;

        /* renamed from: d  reason: collision with root package name */
        private final String f26232d;

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
        }
    }

    public static ThreadPoolExecutor a() {
    }

    public static ExecutorService b() {
    }
}
