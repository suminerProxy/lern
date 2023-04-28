package k.b;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"kotlinx/coroutines/BuildersKt__BuildersKt", "kotlinx/coroutines/BuildersKt__Builders_commonKt"}, k = 4, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class k {
    @NotNull
    public static final <T> d1<T> a(@NotNull v0 v0Var, @NotNull CoroutineContext coroutineContext, @NotNull x0 x0Var, @NotNull Function2<? super v0, ? super Continuation<? super T>, ? extends Object> function2) {
        return m.a(v0Var, coroutineContext, x0Var, function2);
    }

    @Nullable
    public static final <T> Object c(@NotNull p0 p0Var, @NotNull Function2<? super v0, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        return m.c(p0Var, function2, continuation);
    }

    @NotNull
    public static final n2 d(@NotNull v0 v0Var, @NotNull CoroutineContext coroutineContext, @NotNull x0 x0Var, @NotNull Function2<? super v0, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return m.e(v0Var, coroutineContext, x0Var, function2);
    }

    public static /* synthetic */ n2 e(v0 v0Var, CoroutineContext coroutineContext, x0 x0Var, Function2 function2, int i2, Object obj) {
        return m.f(v0Var, coroutineContext, x0Var, function2, i2, obj);
    }

    public static final <T> T f(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super v0, ? super Continuation<? super T>, ? extends Object> function2) throws InterruptedException {
        return (T) l.a(coroutineContext, function2);
    }

    @Nullable
    public static final <T> Object h(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super v0, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        return m.g(coroutineContext, function2, continuation);
    }
}
