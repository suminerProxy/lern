package k.b;

import androidx.exifinterface.media.ExifInterface;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DispatchedTask.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000e\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00060\u0002j\u0002`\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0010¢\u0006\u0002\b\u0011J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0010¢\u0006\u0002\b\u0014J\u001f\u0010\u0015\u001a\u0002H\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u0010J\u0006\u0010\u001b\u001a\u00020\fJ\u000f\u0010\u001c\u001a\u0004\u0018\u00010\u000eH ¢\u0006\u0002\b\u001dR\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX \u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lkotlinx/coroutines/DispatchedTask;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/scheduling/Task;", "Lkotlinx/coroutines/SchedulerTask;", "resumeMode", "", "(I)V", "delegate", "Lkotlin/coroutines/Continuation;", "getDelegate$kotlinx_coroutines_core", "()Lkotlin/coroutines/Continuation;", "cancelCompletedResult", "", "takenState", "", "cause", "", "cancelCompletedResult$kotlinx_coroutines_core", "getExceptionalResult", "state", "getExceptionalResult$kotlinx_coroutines_core", "getSuccessfulResult", "getSuccessfulResult$kotlinx_coroutines_core", "(Ljava/lang/Object;)Ljava/lang/Object;", "handleFatalException", "exception", "finallyException", "run", "takeState", "takeState$kotlinx_coroutines_core", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public abstract class j1<T> extends k.b.n4.k {
    @JvmField

    /* renamed from: d  reason: collision with root package name */
    public int f29410d;

    public j1(int i2) {
        this.f29410d = i2;
    }

    public void c(@Nullable Object obj, @NotNull Throwable th) {
    }

    @NotNull
    public abstract Continuation<T> d();

    @Nullable
    public Throwable g(@Nullable Object obj) {
        f0 f0Var = obj instanceof f0 ? (f0) obj : null;
        if (f0Var == null) {
            return null;
        }
        return f0Var.f29231a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T h(@Nullable Object obj) {
        return obj;
    }

    public final void i(@Nullable Throwable th, @Nullable Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            ExceptionsKt__ExceptionsKt.addSuppressed(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        Intrinsics.checkNotNull(th);
        s0.b(d().getContext(), new y0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    @Nullable
    public abstract Object j();

    @Override // java.lang.Runnable
    public final void run() {
        Object m57constructorimpl;
        Object m57constructorimpl2;
        if (z0.b()) {
            if (!(this.f29410d != -1)) {
                throw new AssertionError();
            }
        }
        k.b.n4.l lVar = this.c;
        try {
            k.b.j4.l lVar2 = (k.b.j4.l) d();
            Continuation<T> continuation = lVar2.f29446f;
            Object obj = lVar2.f29448h;
            CoroutineContext context = continuation.getContext();
            Object c = k.b.j4.v0.c(context, obj);
            b4<?> e2 = c != k.b.j4.v0.f29465a ? o0.e(continuation, context, c) : null;
            CoroutineContext context2 = continuation.getContext();
            Object j2 = j();
            Throwable g2 = g(j2);
            n2 n2Var = (g2 == null && k1.c(this.f29410d)) ? (n2) context2.get(n2.v0) : null;
            if (n2Var != null && !n2Var.isActive()) {
                Throwable m2 = n2Var.m();
                c(j2, m2);
                Result.Companion companion = Result.Companion;
                if (z0.e() && (continuation instanceof CoroutineStackFrame)) {
                    m2 = k.b.j4.p0.c(m2, (CoroutineStackFrame) continuation);
                }
                continuation.resumeWith(Result.m57constructorimpl(ResultKt.createFailure(m2)));
            } else if (g2 != null) {
                Result.Companion companion2 = Result.Companion;
                continuation.resumeWith(Result.m57constructorimpl(ResultKt.createFailure(g2)));
            } else {
                T h2 = h(j2);
                Result.Companion companion3 = Result.Companion;
                continuation.resumeWith(Result.m57constructorimpl(h2));
            }
            Unit unit = Unit.INSTANCE;
            if (e2 == null || e2.x1()) {
                k.b.j4.v0.a(context, c);
            }
            try {
                Result.Companion companion4 = Result.Companion;
                lVar.h();
                m57constructorimpl2 = Result.m57constructorimpl(unit);
            } catch (Throwable th) {
                Result.Companion companion5 = Result.Companion;
                m57constructorimpl2 = Result.m57constructorimpl(ResultKt.createFailure(th));
            }
            i(null, Result.m60exceptionOrNullimpl(m57constructorimpl2));
        } catch (Throwable th2) {
            try {
                Result.Companion companion6 = Result.Companion;
                lVar.h();
                m57constructorimpl = Result.m57constructorimpl(Unit.INSTANCE);
            } catch (Throwable th3) {
                Result.Companion companion7 = Result.Companion;
                m57constructorimpl = Result.m57constructorimpl(ResultKt.createFailure(th3));
            }
            i(th2, Result.m60exceptionOrNullimpl(m57constructorimpl));
        }
    }
}
