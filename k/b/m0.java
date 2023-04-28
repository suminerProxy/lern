package k.b;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ThreadContextElement.kt */
@c2
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H&¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/CopyableThreadContextElement;", ExifInterface.LATITUDE_SOUTH, "Lkotlinx/coroutines/ThreadContextElement;", "copyForChildCoroutine", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public interface m0<S> extends s3<S> {

    /* compiled from: ThreadContextElement.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a {
        public static <S, R> R a(@NotNull m0<S> m0Var, R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        }

        @Nullable
        public static <S, E extends CoroutineContext.Element> E b(@NotNull m0<S> m0Var, @NotNull CoroutineContext.Key<E> key) {
        }

        @NotNull
        public static <S> CoroutineContext c(@NotNull m0<S> m0Var, @NotNull CoroutineContext.Key<?> key) {
        }

        @NotNull
        public static <S> CoroutineContext d(@NotNull m0<S> m0Var, @NotNull CoroutineContext coroutineContext) {
        }
    }

    @NotNull
    m0<S> A();
}
