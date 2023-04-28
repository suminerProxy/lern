package com.tencent.bugly.proguard;

import android.content.Context;
import android.os.Process;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: BUGLY */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class ai {
    private static ai b;

    /* renamed from: a  reason: collision with root package name */
    public ah f9684a;

    /* renamed from: d  reason: collision with root package name */
    private final Context f9685d;

    /* renamed from: f  reason: collision with root package name */
    private long f9687f;

    /* renamed from: g  reason: collision with root package name */
    private long f9688g;

    /* renamed from: e  reason: collision with root package name */
    private Map<Integer, Long> f9686e = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    private LinkedBlockingQueue<Runnable> f9689h = new LinkedBlockingQueue<>();

    /* renamed from: i  reason: collision with root package name */
    private LinkedBlockingQueue<Runnable> f9690i = new LinkedBlockingQueue<>();

    /* renamed from: j  reason: collision with root package name */
    private final Object f9691j = new Object();

    /* renamed from: k  reason: collision with root package name */
    private long f9692k = 0;

    /* renamed from: l  reason: collision with root package name */
    private int f9693l = 0;
    private final w c = w.a();

    private ai(Context context) {
        this.f9685d = context;
    }

    public static /* synthetic */ int b(ai aiVar) {
        int i2 = aiVar.f9693l - 1;
        aiVar.f9693l = i2;
        return i2;
    }

    public static synchronized ai a(Context context) {
        ai aiVar;
        synchronized (ai.class) {
            if (b == null) {
                b = new ai(context);
            }
            aiVar = b;
        }
        return aiVar;
    }

    public final boolean b(int i2) {
        if (p.c) {
            al.c("Uploading frequency will not be checked if SDK is in debug mode.", new Object[0]);
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis() - a(i2);
        al.c("[UploadManager] Time interval is %d seconds since last uploading(ID: %d).", Long.valueOf(currentTimeMillis / 1000), Integer.valueOf(i2));
        if (currentTimeMillis < 30000) {
            al.a("[UploadManager] Data only be uploaded once in %d seconds.", 30L);
            return false;
        }
        return true;
    }

    public static synchronized ai a() {
        ai aiVar;
        synchronized (ai.class) {
            aiVar = b;
        }
        return aiVar;
    }

    public final void a(int i2, bq bqVar, String str, String str2, ah ahVar, long j2, boolean z) {
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            a(new aj(this.f9685d, i2, bqVar.f9870g, ae.a((Object) bqVar), str, str2, ahVar, z), true, true, j2);
        } catch (Throwable th2) {
            th = th2;
            if (al.a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    private void b() {
        ak a2 = ak.a();
        LinkedBlockingQueue<Runnable> linkedBlockingQueue = new LinkedBlockingQueue<>();
        LinkedBlockingQueue linkedBlockingQueue2 = new LinkedBlockingQueue();
        synchronized (this.f9691j) {
            al.c("[UploadManager] Try to poll all upload task need and put them into temp queue (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
            int size = this.f9689h.size();
            int size2 = this.f9690i.size();
            if (size == 0 && size2 == 0) {
                al.c("[UploadManager] There is no upload task in queue.", new Object[0]);
                return;
            }
            if (a2 == null || !a2.c()) {
                size2 = 0;
            }
            a(this.f9689h, linkedBlockingQueue, size);
            a(this.f9690i, linkedBlockingQueue2, size2);
            a(size, linkedBlockingQueue);
            if (size2 > 0) {
                al.c("[UploadManager] Execute upload tasks of queue which has %d tasks (pid=%d | tid=%d)", Integer.valueOf(size2), Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
            }
            ak a3 = ak.a();
            if (a3 != null) {
                a3.a(new Runnable(this, size2, linkedBlockingQueue2) { // from class: com.tencent.bugly.proguard.ai.2

                    /* renamed from: a  reason: collision with root package name */
                    public final /* synthetic */ int f9695a;
                    public final /* synthetic */ LinkedBlockingQueue b;
                    public final /* synthetic */ ai c;

                    @Override // java.lang.Runnable
                    public final void run() {
                    }
                });
            }
        }
    }

    private void a(int i2, int i3, byte[] bArr, String str, String str2, ah ahVar, boolean z) {
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            a(new aj(this.f9685d, i2, i3, bArr, str, str2, ahVar, 0, 0, false), z, false, 0L);
        } catch (Throwable th2) {
            th = th2;
            if (al.a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    public final void a(int i2, bq bqVar, String str, String str2, ah ahVar, boolean z) {
        a(i2, bqVar.f9870g, ae.a((Object) bqVar), str, str2, ahVar, z);
    }

    public final long a(boolean z) {
        long j2;
        long b2 = ap.b();
        int i2 = z ? 5 : 3;
        List<y> a2 = this.c.a(i2);
        if (a2 != null && a2.size() > 0) {
            j2 = 0;
            try {
                y yVar = a2.get(0);
                if (yVar.f9994e >= b2) {
                    j2 = ap.d(yVar.f9996g);
                    if (i2 == 3) {
                        this.f9687f = j2;
                    } else {
                        this.f9688g = j2;
                    }
                    a2.remove(yVar);
                }
            } catch (Throwable th) {
                al.a(th);
            }
            if (a2.size() > 0) {
                this.c.a(a2);
            }
        } else {
            j2 = z ? this.f9688g : this.f9687f;
        }
        al.c("[UploadManager] Local network consume: %d KB", Long.valueOf(j2 / 1024));
        return j2;
    }

    public final synchronized void a(long j2, boolean z) {
        int i2 = z ? 5 : 3;
        y yVar = new y();
        yVar.b = i2;
        yVar.f9994e = ap.b();
        yVar.c = "";
        yVar.f9993d = "";
        yVar.f9996g = ap.c(j2);
        this.c.b(i2);
        this.c.a(yVar);
        if (z) {
            this.f9688g = j2;
        } else {
            this.f9687f = j2;
        }
        al.c("[UploadManager] Network total consume: %d KB", Long.valueOf(j2 / 1024));
    }

    public final synchronized void a(int i2, long j2) {
        if (i2 < 0) {
            al.e("[UploadManager] Unknown uploading ID: %d", Integer.valueOf(i2));
            return;
        }
        this.f9686e.put(Integer.valueOf(i2), Long.valueOf(j2));
        y yVar = new y();
        yVar.b = i2;
        yVar.f9994e = j2;
        yVar.c = "";
        yVar.f9993d = "";
        yVar.f9996g = new byte[0];
        this.c.b(i2);
        this.c.a(yVar);
        al.c("[UploadManager] Uploading(ID:%d) time: %s", Integer.valueOf(i2), ap.a(j2));
    }

    public final synchronized long a(int i2) {
        if (i2 >= 0) {
            Long l2 = this.f9686e.get(Integer.valueOf(i2));
            if (l2 != null) {
                return l2.longValue();
            }
        } else {
            al.e("[UploadManager] Unknown upload ID: %d", Integer.valueOf(i2));
        }
        return 0L;
    }

    private static void a(LinkedBlockingQueue<Runnable> linkedBlockingQueue, LinkedBlockingQueue<Runnable> linkedBlockingQueue2, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            Runnable peek = linkedBlockingQueue.peek();
            if (peek == null) {
                return;
            }
            try {
                linkedBlockingQueue2.put(peek);
                linkedBlockingQueue.poll();
            } catch (Throwable th) {
                al.e("[UploadManager] Failed to add upload task to temp urgent queue: %s", th.getMessage());
            }
        }
    }

    private void a(int i2, LinkedBlockingQueue<Runnable> linkedBlockingQueue) {
        ak a2 = ak.a();
        if (i2 > 0) {
            al.c("[UploadManager] Execute urgent upload tasks of queue which has %d tasks (pid=%d | tid=%d)", Integer.valueOf(i2), Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        }
        for (int i3 = 0; i3 < i2; i3++) {
            Runnable poll = linkedBlockingQueue.poll();
            if (poll == null) {
                return;
            }
            synchronized (this.f9691j) {
                if (this.f9693l >= 2 && a2 != null) {
                    a2.a(poll);
                } else {
                    al.a("[UploadManager] Create and start a new thread to execute a upload task: %s", "BUGLY_ASYNC_UPLOAD");
                    if (ap.a(new Runnable(this, poll) { // from class: com.tencent.bugly.proguard.ai.1

                        /* renamed from: a  reason: collision with root package name */
                        public final /* synthetic */ Runnable f9694a;
                        public final /* synthetic */ ai b;

                        @Override // java.lang.Runnable
                        public final void run() {
                        }
                    }, "BUGLY_ASYNC_UPLOAD") != null) {
                        synchronized (this.f9691j) {
                            this.f9693l++;
                        }
                    } else {
                        al.d("[UploadManager] Failed to start a thread to execute asynchronous upload task,will try again next time.", new Object[0]);
                        a(poll, true);
                    }
                }
            }
        }
    }

    private boolean a(Runnable runnable, boolean z) {
        if (runnable == null) {
            al.a("[UploadManager] Upload task should not be null", new Object[0]);
            return false;
        }
        try {
            al.c("[UploadManager] Add upload task to queue (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
            synchronized (this.f9691j) {
                if (z) {
                    this.f9689h.put(runnable);
                } else {
                    this.f9690i.put(runnable);
                }
            }
            return true;
        } catch (Throwable th) {
            al.e("[UploadManager] Failed to add upload task to queue: %s", th.getMessage());
            return false;
        }
    }

    private void a(Runnable runnable, long j2) {
        if (runnable == null) {
            al.d("[UploadManager] Upload task should not be null", new Object[0]);
            return;
        }
        al.c("[UploadManager] Execute synchronized upload task (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        Thread a2 = ap.a(runnable, "BUGLY_SYNC_UPLOAD");
        if (a2 == null) {
            al.e("[UploadManager] Failed to start a thread to execute synchronized upload task, add it to queue.", new Object[0]);
            a(runnable, true);
            return;
        }
        try {
            a2.join(j2);
        } catch (Throwable th) {
            al.e("[UploadManager] Failed to join upload synchronized task with message: %s. Add it to queue.", th.getMessage());
            a(runnable, true);
            b();
        }
    }

    private void a(Runnable runnable, boolean z, boolean z2, long j2) {
        al.c("[UploadManager] Add upload task (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        if (z2) {
            a(runnable, j2);
            return;
        }
        a(runnable, z);
        b();
    }
}
