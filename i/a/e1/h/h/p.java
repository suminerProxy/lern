package i.a.e1.h.h;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SchedulerPoolFactory.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final String f27842a = "rx3.purge-enabled";
    public static final boolean b;
    public static final String c = "rx3.purge-period-seconds";

    /* renamed from: d  reason: collision with root package name */
    public static final int f27843d;

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicReference<ScheduledExecutorService> f27844e = new AtomicReference<>();

    /* renamed from: f  reason: collision with root package name */
    public static final Map<ScheduledThreadPoolExecutor, Object> f27845f = new ConcurrentHashMap();

    /* compiled from: SchedulerPoolFactory.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            Iterator it = new ArrayList(p.f27845f.keySet()).iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    p.f27845f.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    /* compiled from: SchedulerPoolFactory.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b implements i.a.e1.g.o<String, String> {
        @Override // i.a.e1.g.o
        /* renamed from: a */
        public String apply(String t) {
            return System.getProperty(t);
        }
    }

    static {
        b bVar = new b();
        boolean b2 = b(true, f27842a, true, true, bVar);
        b = b2;
        f27843d = c(b2, c, 1, 1, bVar);
        e();
    }

    private p() {
        throw new IllegalStateException("No instances!");
    }

    public static ScheduledExecutorService a(ThreadFactory factory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, factory);
        f(b, newScheduledThreadPool);
        return newScheduledThreadPool;
    }

    public static boolean b(boolean enabled, String key, boolean defaultNotFound, boolean defaultNotEnabled, i.a.e1.g.o<String, String> propertyAccessor) {
        if (enabled) {
            try {
                String apply = propertyAccessor.apply(key);
                return apply == null ? defaultNotFound : "true".equals(apply);
            } catch (Throwable th) {
                i.a.e1.e.b.b(th);
                return defaultNotFound;
            }
        }
        return defaultNotEnabled;
    }

    public static int c(boolean enabled, String key, int defaultNotFound, int defaultNotEnabled, i.a.e1.g.o<String, String> propertyAccessor) {
        if (enabled) {
            try {
                String apply = propertyAccessor.apply(key);
                return apply == null ? defaultNotFound : Integer.parseInt(apply);
            } catch (Throwable th) {
                i.a.e1.e.b.b(th);
                return defaultNotFound;
            }
        }
        return defaultNotEnabled;
    }

    public static void d() {
        ScheduledExecutorService andSet = f27844e.getAndSet(null);
        if (andSet != null) {
            andSet.shutdownNow();
        }
        f27845f.clear();
    }

    public static void e() {
        g(b);
    }

    public static void f(boolean purgeEnabled, ScheduledExecutorService exec) {
        if (purgeEnabled && (exec instanceof ScheduledThreadPoolExecutor)) {
            f27845f.put((ScheduledThreadPoolExecutor) exec, exec);
        }
    }

    public static void g(boolean purgeEnabled) {
        if (!purgeEnabled) {
            return;
        }
        while (true) {
            AtomicReference<ScheduledExecutorService> atomicReference = f27844e;
            ScheduledExecutorService scheduledExecutorService = atomicReference.get();
            if (scheduledExecutorService != null) {
                return;
            }
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new k("RxSchedulerPurge"));
            if (atomicReference.compareAndSet(scheduledExecutorService, newScheduledThreadPool)) {
                a aVar = new a();
                int i2 = f27843d;
                newScheduledThreadPool.scheduleAtFixedRate(aVar, i2, i2, TimeUnit.SECONDS);
                return;
            }
            newScheduledThreadPool.shutdownNow();
        }
    }
}
