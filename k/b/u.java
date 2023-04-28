package k.b;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CancellableContinuation.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0000\u001a3\u0010\u0005\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u00022\u001a\b\u0004\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\n\u001a3\u0010\u000b\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u00022\u001a\b\u0004\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0080Hø\u0001\u0000¢\u0006\u0002\u0010\n\u001a\u0018\u0010\f\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\r\u001a\u00020\u000eH\u0007\u001a\u0018\u0010\u000f\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"getOrCreateCancellableContinuation", "Lkotlinx/coroutines/CancellableContinuationImpl;", ExifInterface.GPS_DIRECTION_TRUE, "delegate", "Lkotlin/coroutines/Continuation;", "suspendCancellableCoroutine", "block", "Lkotlin/Function1;", "Lkotlinx/coroutines/CancellableContinuation;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "suspendCancellableCoroutineReusable", "disposeOnCancellation", "handle", "Lkotlinx/coroutines/DisposableHandle;", "removeOnCancellation", "node", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class u {
    @i2
    public static final void a(@NotNull r<?> rVar, @NotNull p1 p1Var) {
        rVar.q(new q1(p1Var));
    }

    @NotNull
    public static final <T> s<T> b(@NotNull Continuation<? super T> continuation) {
        if (!(continuation instanceof k.b.j4.l)) {
            return new s<>(continuation, 1);
        }
        s<T> l2 = ((k.b.j4.l) continuation).l();
        if (l2 == null || !l2.I()) {
            l2 = null;
        }
        return l2 == null ? new s<>(continuation, 2) : l2;
    }

    public static final void c(@NotNull r<?> rVar, @NotNull k.b.j4.y yVar) {
        rVar.q(new g3(yVar));
    }

    @Nullable
    public static final <T> Object d(@NotNull Function1<? super r<? super T>, Unit> function1, @NotNull Continuation<? super T> continuation) {
        s sVar = new s(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        sVar.P();
        function1.invoke(sVar);
        Object x = sVar.x();
        if (x == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return x;
    }

    private static final <T> Object e(Function1<? super r<? super T>, Unit> function1, Continuation<? super T> continuation) {
        InlineMarker.mark(0);
        s sVar = new s(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        sVar.P();
        function1.invoke(sVar);
        Object x = sVar.x();
        if (x == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        InlineMarker.mark(1);
        return x;
    }

    @Nullable
    public static final <T> Object f(@NotNull Function1<? super r<? super T>, Unit> function1, @NotNull Continuation<? super T> continuation) {
        s b = b(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        function1.invoke(b);
        Object x = b.x();
        if (x == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return x;
    }

    private static final <T> Object g(Function1<? super r<? super T>, Unit> function1, Continuation<? super T> continuation) {
        InlineMarker.mark(0);
        s b = b(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        function1.invoke(b);
        Object x = b.x();
        if (x == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        InlineMarker.mark(1);
        return x;
    }
}
