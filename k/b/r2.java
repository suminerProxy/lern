package k.b;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"kotlinx/coroutines/JobKt__FutureKt", "kotlinx/coroutines/JobKt__JobKt"}, k = 4, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class r2 {
    public static final void A(@NotNull n2 n2Var) {
        t2.y(n2Var);
    }

    @NotNull
    public static final n2 B(@NotNull CoroutineContext coroutineContext) {
        return t2.z(coroutineContext);
    }

    public static final boolean C(@NotNull CoroutineContext coroutineContext) {
        return t2.A(coroutineContext);
    }

    @NotNull
    public static final d0 a(@Nullable n2 n2Var) {
        return t2.a(n2Var);
    }

    public static /* synthetic */ d0 c(n2 n2Var, int i2, Object obj) {
        return t2.c(n2Var, i2, obj);
    }

    public static final void f(@NotNull CoroutineContext coroutineContext, @Nullable CancellationException cancellationException) {
        t2.f(coroutineContext, cancellationException);
    }

    public static final void g(@NotNull n2 n2Var, @NotNull String str, @Nullable Throwable th) {
        t2.g(n2Var, str, th);
    }

    @Nullable
    public static final Object l(@NotNull n2 n2Var, @NotNull Continuation<? super Unit> continuation) {
        return t2.l(n2Var, continuation);
    }

    public static final void o(@NotNull CoroutineContext coroutineContext, @Nullable CancellationException cancellationException) {
        t2.o(coroutineContext, cancellationException);
    }

    public static final void r(@NotNull n2 n2Var, @Nullable CancellationException cancellationException) {
        t2.r(n2Var, cancellationException);
    }

    public static final void w(@NotNull r<?> rVar, @NotNull Future<?> future) {
        s2.a(rVar, future);
    }

    @i2
    @NotNull
    public static final p1 x(@NotNull n2 n2Var, @NotNull Future<?> future) {
        return s2.b(n2Var, future);
    }

    @NotNull
    public static final p1 y(@NotNull n2 n2Var, @NotNull p1 p1Var) {
        return t2.w(n2Var, p1Var);
    }

    public static final void z(@NotNull CoroutineContext coroutineContext) {
        t2.x(coroutineContext);
    }
}
