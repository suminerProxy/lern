package k.b;

import java.util.concurrent.CancellationException;
import k.b.n2;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Job.kt */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0012\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u001a\u0019\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0002\b\b\u001a\f\u0010\f\u001a\u00020\r*\u00020\u0002H\u0007\u001a\u0018\u0010\f\u001a\u00020\u0001*\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007\u001a\u001c\u0010\f\u001a\u00020\r*\u00020\u00022\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011\u001a\u001e\u0010\f\u001a\u00020\r*\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u001a\u0015\u0010\u0014\u001a\u00020\r*\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0015\u001a\f\u0010\u0016\u001a\u00020\r*\u00020\u0002H\u0007\u001a\u0018\u0010\u0016\u001a\u00020\r*\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007\u001a\u001c\u0010\u0016\u001a\u00020\r*\u00020\u00022\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011\u001a\f\u0010\u0016\u001a\u00020\r*\u00020\u0005H\u0007\u001a\u0018\u0010\u0016\u001a\u00020\r*\u00020\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007\u001a\u001c\u0010\u0016\u001a\u00020\r*\u00020\u00052\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011\u001a\u0014\u0010\u0017\u001a\u00020\u0018*\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0018H\u0000\u001a\n\u0010\u001a\u001a\u00020\r*\u00020\u0002\u001a\n\u0010\u001a\u001a\u00020\r*\u00020\u0005\u001a\u001b\u0010\u001b\u001a\u00020\u000f*\u0004\u0018\u00010\u000f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002¢\u0006\u0002\b\u001c\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\"\u0015\u0010\u0004\u001a\u00020\u0005*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"isActive", "", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/CoroutineContext;)Z", "job", "Lkotlinx/coroutines/Job;", "getJob", "(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/Job;", "Job", "Lkotlinx/coroutines/CompletableJob;", "parent", "Job0", "cancel", "", "cause", "", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "message", "", "cancelAndJoin", "(Lkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelChildren", "disposeOnCompletion", "Lkotlinx/coroutines/DisposableHandle;", "handle", "ensureActive", "orCancellation", "orCancellation$JobKt__JobKt", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xi = 48, xs = "kotlinx/coroutines/JobKt")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final /* synthetic */ class t2 {
    public static final boolean A(@NotNull CoroutineContext coroutineContext) {
        n2 n2Var = (n2) coroutineContext.get(n2.v0);
        return n2Var != null && n2Var.isActive();
    }

    private static final Throwable B(Throwable th, n2 n2Var) {
        return th == null ? new o2("Job was cancelled", null, n2Var) : th;
    }

    @NotNull
    public static final d0 a(@Nullable n2 n2Var) {
        return new q2(n2Var);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    @JvmName(name = "Job")
    public static final /* synthetic */ n2 b(n2 n2Var) {
        return r2.a(n2Var);
    }

    public static /* synthetic */ d0 c(n2 n2Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            n2Var = null;
        }
        return r2.a(n2Var);
    }

    public static /* synthetic */ n2 d(n2 n2Var, int i2, Object obj) {
        n2 b;
        if ((i2 & 1) != 0) {
            n2Var = null;
        }
        b = b(n2Var);
        return b;
    }

    public static final void f(@NotNull CoroutineContext coroutineContext, @Nullable CancellationException cancellationException) {
        n2 n2Var = (n2) coroutineContext.get(n2.v0);
        if (n2Var == null) {
            return;
        }
        n2Var.b(cancellationException);
    }

    public static final void g(@NotNull n2 n2Var, @NotNull String str, @Nullable Throwable th) {
        n2Var.b(y1.a(str, th));
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ boolean h(CoroutineContext coroutineContext, Throwable th) {
        CoroutineContext.Element element = coroutineContext.get(n2.v0);
        v2 v2Var = element instanceof v2 ? (v2) element : null;
        if (v2Var == null) {
            return false;
        }
        v2Var.k0(B(th, v2Var));
        return true;
    }

    public static /* synthetic */ void i(CoroutineContext coroutineContext, CancellationException cancellationException, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            cancellationException = null;
        }
        r2.f(coroutineContext, cancellationException);
    }

    public static /* synthetic */ void j(n2 n2Var, String str, Throwable th, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            th = null;
        }
        r2.g(n2Var, str, th);
    }

    public static /* synthetic */ boolean k(CoroutineContext coroutineContext, Throwable th, int i2, Object obj) {
        boolean h2;
        if ((i2 & 1) != 0) {
            th = null;
        }
        h2 = h(coroutineContext, th);
        return h2;
    }

    @Nullable
    public static final Object l(@NotNull n2 n2Var, @NotNull Continuation<? super Unit> continuation) {
        n2.a.b(n2Var, null, 1, null);
        Object G = n2Var.G(continuation);
        return G == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? G : Unit.INSTANCE;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void n(CoroutineContext coroutineContext, Throwable th) {
        n2 n2Var = (n2) coroutineContext.get(n2.v0);
        if (n2Var == null) {
            return;
        }
        for (n2 n2Var2 : n2Var.j()) {
            v2 v2Var = n2Var2 instanceof v2 ? (v2) n2Var2 : null;
            if (v2Var != null) {
                v2Var.k0(B(th, n2Var));
            }
        }
    }

    public static final void o(@NotNull CoroutineContext coroutineContext, @Nullable CancellationException cancellationException) {
        Sequence<n2> j2;
        n2 n2Var = (n2) coroutineContext.get(n2.v0);
        if (n2Var == null || (j2 = n2Var.j()) == null) {
            return;
        }
        for (n2 n2Var2 : j2) {
            n2Var2.b(cancellationException);
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void q(n2 n2Var, Throwable th) {
        for (n2 n2Var2 : n2Var.j()) {
            v2 v2Var = n2Var2 instanceof v2 ? (v2) n2Var2 : null;
            if (v2Var != null) {
                v2Var.k0(B(th, n2Var));
            }
        }
    }

    public static final void r(@NotNull n2 n2Var, @Nullable CancellationException cancellationException) {
        for (n2 n2Var2 : n2Var.j()) {
            n2Var2.b(cancellationException);
        }
    }

    public static /* synthetic */ void s(CoroutineContext coroutineContext, Throwable th, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            th = null;
        }
        n(coroutineContext, th);
    }

    public static /* synthetic */ void t(CoroutineContext coroutineContext, CancellationException cancellationException, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            cancellationException = null;
        }
        r2.o(coroutineContext, cancellationException);
    }

    public static /* synthetic */ void u(n2 n2Var, Throwable th, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            th = null;
        }
        q(n2Var, th);
    }

    public static /* synthetic */ void v(n2 n2Var, CancellationException cancellationException, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            cancellationException = null;
        }
        r2.r(n2Var, cancellationException);
    }

    @NotNull
    public static final p1 w(@NotNull n2 n2Var, @NotNull p1 p1Var) {
        return n2Var.v(new r1(p1Var));
    }

    public static final void x(@NotNull CoroutineContext coroutineContext) {
        n2 n2Var = (n2) coroutineContext.get(n2.v0);
        if (n2Var == null) {
            return;
        }
        r2.A(n2Var);
    }

    public static final void y(@NotNull n2 n2Var) {
        if (!n2Var.isActive()) {
            throw n2Var.m();
        }
    }

    @NotNull
    public static final n2 z(@NotNull CoroutineContext coroutineContext) {
        n2 n2Var = (n2) coroutineContext.get(n2.v0);
        if (n2Var != null) {
            return n2Var;
        }
        throw new IllegalStateException(Intrinsics.stringPlus("Current context doesn't contain Job in it: ", coroutineContext).toString());
    }
}
