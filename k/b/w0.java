package k.b;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CoroutineScope.kt */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b\u001a\u0006\u0010\t\u001a\u00020\u0002\u001aM\u0010\n\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u000b2'\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\r¢\u0006\u0002\b\u0010H\u0086@ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u0011\u001a\u0011\u0010\u0012\u001a\u00020\bH\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u0013\u001a\u001e\u0010\u0014\u001a\u00020\u0015*\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u001a\u001c\u0010\u0014\u001a\u00020\u0015*\u00020\u00022\u0010\b\u0002\u0010\u0018\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001b\u001a\n\u0010\u001c\u001a\u00020\u0015*\u00020\u0002\u001a\u0015\u0010\u001d\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0086\u0002\"\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0000\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"isActive", "", "Lkotlinx/coroutines/CoroutineScope;", "isActive$annotations", "(Lkotlinx/coroutines/CoroutineScope;)V", "(Lkotlinx/coroutines/CoroutineScope;)Z", "CoroutineScope", "context", "Lkotlin/coroutines/CoroutineContext;", "MainScope", "coroutineScope", "R", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "currentCoroutineContext", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancel", "", "message", "", "cause", "", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "ensureActive", "plus", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class w0 {
    @NotNull
    public static final v0 a(@NotNull CoroutineContext coroutineContext) {
        if (coroutineContext.get(n2.v0) == null) {
            coroutineContext = coroutineContext.plus(r2.c(null, 1, null));
        }
        return new k.b.j4.j(coroutineContext);
    }

    @NotNull
    public static final v0 b() {
        return new k.b.j4.j(r3.c(null, 1, null).plus(m1.e()));
    }

    public static final void c(@NotNull v0 v0Var, @NotNull String str, @Nullable Throwable th) {
        d(v0Var, y1.a(str, th));
    }

    public static final void d(@NotNull v0 v0Var, @Nullable CancellationException cancellationException) {
        n2 n2Var = (n2) v0Var.S().get(n2.v0);
        if (n2Var != null) {
            n2Var.b(cancellationException);
            return;
        }
        throw new IllegalStateException(Intrinsics.stringPlus("Scope cannot be cancelled because it does not have a job: ", v0Var).toString());
    }

    public static /* synthetic */ void e(v0 v0Var, String str, Throwable th, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            th = null;
        }
        c(v0Var, str, th);
    }

    public static /* synthetic */ void f(v0 v0Var, CancellationException cancellationException, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            cancellationException = null;
        }
        d(v0Var, cancellationException);
    }

    @Nullable
    public static final <R> Object g(@NotNull Function2<? super v0, ? super Continuation<? super R>, ? extends Object> function2, @NotNull Continuation<? super R> continuation) {
        k.b.j4.m0 m0Var = new k.b.j4.m0(continuation.getContext(), continuation);
        Object f2 = k.b.k4.b.f(m0Var, m0Var, function2);
        if (f2 == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return f2;
    }

    @Nullable
    public static final Object h(@NotNull Continuation<? super CoroutineContext> continuation) {
        return continuation.getContext();
    }

    private static final Object i(Continuation<? super CoroutineContext> continuation) {
        InlineMarker.mark(3);
        Continuation continuation2 = null;
        return continuation2.getContext();
    }

    public static final void j(@NotNull v0 v0Var) {
        r2.z(v0Var.S());
    }

    public static final boolean k(@NotNull v0 v0Var) {
        n2 n2Var = (n2) v0Var.S().get(n2.v0);
        if (n2Var == null) {
            return true;
        }
        return n2Var.isActive();
    }

    public static /* synthetic */ void l(v0 v0Var) {
    }

    @NotNull
    public static final v0 m(@NotNull v0 v0Var, @NotNull CoroutineContext coroutineContext) {
        return new k.b.j4.j(v0Var.S().plus(coroutineContext));
    }
}
