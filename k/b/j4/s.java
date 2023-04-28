package k.b.j4;

import k.b.c2;
import k.b.f1;
import k.b.i2;
import k.b.p1;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LimitedDispatcher.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u00032\u00020\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0014\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u00060\u0002j\u0002`\u0003H\u0002J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0097Aø\u0001\u0000¢\u0006\u0002\u0010\u0013J\u001c\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00162\n\u0010\u000e\u001a\u00060\u0002j\u0002`\u0003H\u0016J#\u0010\u0017\u001a\u00020\u00102\n\u0010\u000e\u001a\u00060\u0002j\u0002`\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u0018H\u0082\bJ\u001c\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00162\n\u0010\u000e\u001a\u00060\u0002j\u0002`\u0003H\u0017J%\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00122\n\u0010\u000e\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0015\u001a\u00020\u0016H\u0096\u0001J\u0010\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\b\u0010\u001e\u001a\u00020\u0010H\u0016J\u001f\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00122\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100!H\u0096\u0001J\b\u0010\"\u001a\u00020\rH\u0002R\u000e\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, d2 = {"Lkotlinx/coroutines/internal/LimitedDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lkotlinx/coroutines/Delay;", "dispatcher", "parallelism", "", "(Lkotlinx/coroutines/CoroutineDispatcher;I)V", "queue", "Lkotlinx/coroutines/internal/LockFreeTaskQueue;", "runningWorkers", "addAndTryDispatching", "", "block", "delay", "", "time", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatch", "context", "Lkotlin/coroutines/CoroutineContext;", "dispatchInternal", "Lkotlin/Function0;", "dispatchYield", "invokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "timeMillis", "limitedParallelism", "run", "scheduleResumeAfterDelay", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "tryAllocateWorker", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class s extends k.b.p0 implements Runnable, f1 {
    @NotNull
    private final k.b.p0 c;

    /* renamed from: d  reason: collision with root package name */
    private final int f29461d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ f1 f29462e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final a0<Runnable> f29463f;
    private volatile int runningWorkers;

    public s(@NotNull k.b.p0 p0Var, int i2) {
        this.c = p0Var;
        this.f29461d = i2;
        f1 f1Var = p0Var instanceof f1 ? (f1) p0Var : null;
        this.f29462e = f1Var == null ? k.b.c1.a() : f1Var;
        this.f29463f = new a0<>(false);
    }

    private final void B(Runnable runnable, Function0<Unit> function0) {
        if (!y(runnable) && D()) {
            function0.invoke();
        }
    }

    private final boolean D() {
        synchronized (this) {
            if (this.runningWorkers >= this.f29461d) {
                return false;
            }
            this.runningWorkers++;
            return true;
        }
    }

    private final boolean y(Runnable runnable) {
        this.f29463f.a(runnable);
        return this.runningWorkers >= this.f29461d;
    }

    @Override // k.b.f1
    public void c(long j2, @NotNull k.b.r<? super Unit> rVar) {
        this.f29462e.c(j2, rVar);
    }

    @Override // k.b.f1
    @NotNull
    public p1 f(long j2, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        return this.f29462e.f(j2, runnable, coroutineContext);
    }

    @Override // k.b.f1
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @Nullable
    public Object n(long j2, @NotNull Continuation<? super Unit> continuation) {
        return this.f29462e.n(j2, continuation);
    }

    @Override // k.b.p0
    public void q(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        if (!y(runnable) && D()) {
            this.c.q(this, this);
        }
    }

    @Override // k.b.p0
    @i2
    public void r(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        if (!y(runnable) && D()) {
            this.c.r(this, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002b, code lost:
        r4.runningWorkers--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
        if (r4.f29463f.c() != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
        r4.runningWorkers++;
        r1 = kotlin.Unit.INSTANCE;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            r4 = this;
            r0 = 0
        L1:
            r1 = r0
        L2:
            k.b.j4.a0<java.lang.Runnable> r2 = r4.f29463f
            java.lang.Object r2 = r2.g()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 == 0) goto L2a
            r2.run()     // Catch: java.lang.Throwable -> L10
            goto L16
        L10:
            r2 = move-exception
            kotlin.coroutines.EmptyCoroutineContext r3 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            k.b.s0.b(r3, r2)
        L16:
            int r1 = r1 + 1
            r2 = 16
            if (r1 < r2) goto L2
            k.b.p0 r2 = r4.c
            boolean r2 = r2.s(r4)
            if (r2 == 0) goto L2
            k.b.p0 r0 = r4.c
            r0.q(r4, r4)
            return
        L2a:
            monitor-enter(r4)
            int r1 = r4.runningWorkers     // Catch: java.lang.Throwable -> L45
            int r1 = r1 + (-1)
            r4.runningWorkers = r1     // Catch: java.lang.Throwable -> L45
            k.b.j4.a0<java.lang.Runnable> r1 = r4.f29463f     // Catch: java.lang.Throwable -> L45
            int r1 = r1.c()     // Catch: java.lang.Throwable -> L45
            if (r1 != 0) goto L3b
            monitor-exit(r4)
            return
        L3b:
            int r1 = r4.runningWorkers     // Catch: java.lang.Throwable -> L45
            int r1 = r1 + 1
            r4.runningWorkers = r1     // Catch: java.lang.Throwable -> L45
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L45
            monitor-exit(r4)
            goto L1
        L45:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k.b.j4.s.run():void");
    }

    @Override // k.b.p0
    @c2
    @NotNull
    public k.b.p0 t(int i2) {
        t.a(i2);
        return i2 >= this.f29461d ? this : super.t(i2);
    }
}
