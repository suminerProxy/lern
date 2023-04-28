package com.tencent.bugly.proguard;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: BUGLY */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class ak {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicInteger f9710a = new AtomicInteger(1);
    private static ak b;
    private ScheduledExecutorService c;

    public ak() {
        this.c = null;
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(3, new ThreadFactory(this) { // from class: com.tencent.bugly.proguard.ak.1

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ak f9711a;

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
            }
        });
        this.c = newScheduledThreadPool;
        if (newScheduledThreadPool == null || newScheduledThreadPool.isShutdown()) {
            al.d("[AsyncTaskHandler] ScheduledExecutorService is not valiable!", new Object[0]);
        }
    }

    public static synchronized ak a() {
        ak akVar;
        synchronized (ak.class) {
            if (b == null) {
                b = new ak();
            }
            akVar = b;
        }
        return akVar;
    }

    public final synchronized void b() {
        ScheduledExecutorService scheduledExecutorService = this.c;
        if (scheduledExecutorService != null && !scheduledExecutorService.isShutdown()) {
            al.c("[AsyncTaskHandler] Close async handler.", new Object[0]);
            this.c.shutdownNow();
        }
    }

    public final synchronized boolean c() {
        boolean z;
        ScheduledExecutorService scheduledExecutorService = this.c;
        if (scheduledExecutorService != null) {
            z = scheduledExecutorService.isShutdown() ? false : true;
        }
        return z;
    }

    public final synchronized boolean a(Runnable runnable, long j2) {
        if (!c()) {
            al.d("[AsyncTaskHandler] Async handler was closed, should not post task.", new Object[0]);
            return false;
        }
        if (j2 <= 0) {
            j2 = 0;
        }
        al.c("[AsyncTaskHandler] Post a delay(time: %dms) task: %s", Long.valueOf(j2), runnable.getClass().getName());
        this.c.schedule(runnable, j2, TimeUnit.MILLISECONDS);
        return true;
    }

    public final synchronized boolean a(Runnable runnable) {
        if (!c()) {
            al.d("[AsyncTaskHandler] Async handler was closed, should not post task.", new Object[0]);
            return false;
        } else if (runnable == null) {
            al.d("[AsyncTaskHandler] Task input is null.", new Object[0]);
            return false;
        } else {
            al.c("[AsyncTaskHandler] Post a normal task: %s", runnable.getClass().getName());
            this.c.execute(runnable);
            return true;
        }
    }
}
