package k.b.m4;

import i.a.e1.c.q0;
import java.util.concurrent.TimeUnit;
import k.b.f1;
import k.b.p0;
import k.b.p1;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RxScheduler.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001c\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\n\u0010\f\u001a\u00060\rj\u0002`\u000eH\u0016J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J$\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\n\u0010\f\u001a\u00060\rj\u0002`\u000e2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001e\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001e"}, d2 = {"Lkotlinx/coroutines/rx3/SchedulerCoroutineDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/Delay;", "scheduler", "Lio/reactivex/rxjava3/core/Scheduler;", "(Lio/reactivex/rxjava3/core/Scheduler;)V", "getScheduler", "()Lio/reactivex/rxjava3/core/Scheduler;", "dispatch", "", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "equals", "", "other", "", "hashCode", "", "invokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "timeMillis", "", "scheduleResumeAfterDelay", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "toString", "", "kotlinx-coroutines-rx3"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class x extends p0 implements f1 {
    @NotNull
    private final q0 c;

    public x(@NotNull q0 q0Var) {
        this.c = q0Var;
    }

    public static final void B(i.a.e1.d.f fVar) {
        fVar.dispose();
    }

    public static /* synthetic */ void D(k.b.r rVar, x xVar) {
        H(rVar, xVar);
    }

    public static /* synthetic */ void E(i.a.e1.d.f fVar) {
        B(fVar);
    }

    public static final void H(k.b.r rVar, x xVar) {
        rVar.O(xVar, Unit.INSTANCE);
    }

    @Override // k.b.f1
    public void c(long j2, @NotNull final k.b.r<? super Unit> rVar) {
        i.p(rVar, this.c.f(new Runnable() { // from class: k.b.m4.f
            @Override // java.lang.Runnable
            public final void run() {
                x.D(k.b.r.this, this);
            }
        }, j2, TimeUnit.MILLISECONDS));
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof x) && ((x) obj).c == this.c;
    }

    @Override // k.b.f1
    @NotNull
    public p1 f(long j2, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        final i.a.e1.d.f f2 = this.c.f(runnable, j2, TimeUnit.MILLISECONDS);
        return new p1() { // from class: k.b.m4.g
            @Override // k.b.p1
            public final void dispose() {
                x.E(i.a.e1.d.f.this);
            }
        };
    }

    public int hashCode() {
        return System.identityHashCode(this.c);
    }

    @Override // k.b.f1
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @Nullable
    public Object n(long j2, @NotNull Continuation<? super Unit> continuation) {
        return f1.a.a(this, j2, continuation);
    }

    @Override // k.b.p0
    public void q(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        this.c.e(runnable);
    }

    @Override // k.b.p0
    @NotNull
    public String toString() {
        return this.c.toString();
    }

    @NotNull
    public final q0 y() {
        return this.c;
    }
}
