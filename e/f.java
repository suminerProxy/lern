package e;

import java.io.Closeable;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: CancellationTokenSource.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class f implements Closeable {
    private final Object b;
    private final List<e> c;

    /* renamed from: d  reason: collision with root package name */
    private final ScheduledExecutorService f15538d;

    /* renamed from: e  reason: collision with root package name */
    private ScheduledFuture<?> f15539e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f15540f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f15541g;

    /* compiled from: CancellationTokenSource.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class a implements Runnable {
        public final /* synthetic */ f b;

        public a(f fVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public static /* synthetic */ Object a(f fVar) {
    }

    public static /* synthetic */ ScheduledFuture b(f fVar, ScheduledFuture scheduledFuture) {
    }

    private void e(long j2, TimeUnit timeUnit) {
    }

    private void f() {
    }

    private void i(List<e> list) {
    }

    private void l() {
    }

    public void c() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public void d(long j2) {
    }

    public d g() {
    }

    public boolean h() {
    }

    public e j(Runnable runnable) {
    }

    public void k() throws CancellationException {
    }

    public void m(e eVar) {
    }

    public String toString() {
    }
}
