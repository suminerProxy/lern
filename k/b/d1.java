package k.b;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Deferred.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0000\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u0011\u0010\u0007\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0002\u0010\bJ\r\u0010\t\u001a\u00028\u0000H'¢\u0006\u0002\u0010\nJ\n\u0010\u000b\u001a\u0004\u0018\u00010\fH'R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/Deferred;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/Job;", "onAwait", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnAwait", "()Lkotlinx/coroutines/selects/SelectClause1;", "await", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCompleted", "()Ljava/lang/Object;", "getCompletionExceptionOrNull", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public interface d1<T> extends n2 {

    /* compiled from: Deferred.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a {
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
        public static /* synthetic */ void a(d1 d1Var) {
        }

        public static <T, R> R b(@NotNull d1<? extends T> d1Var, R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        }

        @Nullable
        public static <T, E extends CoroutineContext.Element> E c(@NotNull d1<? extends T> d1Var, @NotNull CoroutineContext.Key<E> key) {
        }

        @NotNull
        public static <T> CoroutineContext d(@NotNull d1<? extends T> d1Var, @NotNull CoroutineContext.Key<?> key) {
        }

        @NotNull
        public static <T> CoroutineContext e(@NotNull d1<? extends T> d1Var, @NotNull CoroutineContext coroutineContext) {
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @NotNull
        public static <T> n2 f(@NotNull d1<? extends T> d1Var, @NotNull n2 n2Var) {
        }
    }

    @NotNull
    k.b.o4.d<T> F();

    @c2
    T g();

    @c2
    @Nullable
    Throwable k();

    @Nullable
    Object o(@NotNull Continuation<? super T> continuation);
}
