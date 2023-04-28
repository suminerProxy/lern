package com.mob.commons;

import android.text.TextUtils;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.commons.cli.HelpFormatter;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class v {

    /* renamed from: a  reason: collision with root package name */
    public static final String f3695a = "M-" + p.a("002<hdhi");
    public static final String b = "M-" + p.a("003%ghekhi");
    public static final ThreadPoolExecutor c;

    /* renamed from: d  reason: collision with root package name */
    public static final ThreadPoolExecutor f3696d;

    /* renamed from: e  reason: collision with root package name */
    public static final ExecutorService f3697e;

    /* renamed from: f  reason: collision with root package name */
    public static final ExecutorService f3698f;

    /* renamed from: g  reason: collision with root package name */
    public static final ExecutorService f3699g;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class a implements RejectedExecutionHandler {
        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            try {
                com.mob.commons.a.o.a().d(500L, runnable);
            } catch (Throwable unused) {
            }
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class b implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private static final AtomicInteger f3700a = new AtomicInteger(1);
        private final ThreadGroup b;
        private final AtomicInteger c = new AtomicInteger(1);

        /* renamed from: d  reason: collision with root package name */
        private final String f3701d;

        public b(int i2) {
            SecurityManager securityManager = System.getSecurityManager();
            this.b = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
            if (TextUtils.isEmpty("M-")) {
                this.f3701d = p.a("005e6ececedhi") + f3700a.getAndIncrement() + p.a("008>hi@dcNdh>i.dfWhWhi");
                return;
            }
            this.f3701d = v.b + i2 + HelpFormatter.DEFAULT_OPT_PREFIX + f3700a.getAndIncrement() + HelpFormatter.DEFAULT_OPT_PREFIX;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            ThreadGroup threadGroup = this.b;
            Thread thread = new Thread(threadGroup, runnable, this.f3701d + this.c.getAndIncrement(), 0L);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            return thread;
        }
    }

    static {
        int max = Math.max(2, 5);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        c = new ThreadPoolExecutor(2, max, 60L, timeUnit, new SynchronousQueue(), new b(0), new a());
        f3696d = new ThreadPoolExecutor(1, 1, 120L, timeUnit, new LinkedBlockingQueue(), new b(1));
        f3697e = Executors.newCachedThreadPool(new b(2));
        f3698f = Executors.newCachedThreadPool(new b(3));
        f3699g = Executors.newCachedThreadPool(new b(4));
    }
}
