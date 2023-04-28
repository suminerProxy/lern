package k.b.g4;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k.b.e3;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"kotlinx/coroutines/channels/ChannelsKt__ChannelsKt", "kotlinx/coroutines/channels/ChannelsKt__Channels_commonKt", "kotlinx/coroutines/channels/ChannelsKt__DeprecatedKt"}, k = 4, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class s {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final String f29294a = "Channel was closed";

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object A(i0 i0Var, m0 m0Var, Continuation continuation) {
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object B(i0 i0Var, Continuation continuation) {
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object C(i0 i0Var, Continuation continuation) {
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ i0 D(i0 i0Var, CoroutineContext coroutineContext, Function2 function2) {
    }

    public static /* synthetic */ i0 E(i0 i0Var, CoroutineContext coroutineContext, Function2 function2, int i2, Object obj) {
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object F(i0 i0Var, Object obj, Continuation continuation) {
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object G(i0 i0Var, Continuation continuation) {
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object H(i0 i0Var, Object obj, Continuation continuation) {
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object I(i0 i0Var, Continuation continuation) {
    }

    @PublishedApi
    @NotNull
    public static final <E, R> i0<R> J(@NotNull i0<? extends E> i0Var, @NotNull CoroutineContext coroutineContext, @NotNull Function2<? super E, ? super Continuation<? super R>, ? extends Object> function2) {
    }

    public static /* synthetic */ i0 K(i0 i0Var, CoroutineContext coroutineContext, Function2 function2, int i2, Object obj) {
    }

    @PublishedApi
    @NotNull
    public static final <E, R> i0<R> L(@NotNull i0<? extends E> i0Var, @NotNull CoroutineContext coroutineContext, @NotNull Function3<? super Integer, ? super E, ? super Continuation<? super R>, ? extends Object> function3) {
    }

    public static /* synthetic */ i0 M(i0 i0Var, CoroutineContext coroutineContext, Function3 function3, int i2, Object obj) {
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ i0 N(i0 i0Var, CoroutineContext coroutineContext, Function3 function3) {
    }

    public static /* synthetic */ i0 O(i0 i0Var, CoroutineContext coroutineContext, Function3 function3, int i2, Object obj) {
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ i0 P(i0 i0Var, CoroutineContext coroutineContext, Function2 function2) {
    }

    public static /* synthetic */ i0 Q(i0 i0Var, CoroutineContext coroutineContext, Function2 function2, int i2, Object obj) {
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object R(i0 i0Var, Comparator comparator, Continuation continuation) {
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object S(i0 i0Var, Comparator comparator, Continuation continuation) {
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object T(i0 i0Var, Continuation continuation) {
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'onReceiveCatching'")
    @NotNull
    public static final <E> k.b.o4.d<E> U(@NotNull i0<? extends E> i0Var) {
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'receiveCatching'", replaceWith = @ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
    @Nullable
    public static final <E> Object V(@NotNull i0<? extends E> i0Var, @NotNull Continuation<? super E> continuation) {
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Left for binary compatibility")
    public static final /* synthetic */ i0 W(i0 i0Var) {
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySendBlocking'. Consider handling the result of 'trySendBlocking' explicitly and rethrow exception if necessary", replaceWith = @ReplaceWith(expression = "trySendBlocking(element)", imports = {}))
    public static final <E> void X(@NotNull m0<? super E> m0Var, E e2) {
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object Y(i0 i0Var, Continuation continuation) {
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object Z(i0 i0Var, Continuation continuation) {
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object a(i0 i0Var, Continuation continuation) {
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ i0 a0(i0 i0Var, int i2, CoroutineContext coroutineContext) {
    }

    @PublishedApi
    public static final void b(@NotNull i0<?> i0Var, @Nullable Throwable th) {
    }

    public static /* synthetic */ i0 b0(i0 i0Var, int i2, CoroutineContext coroutineContext, int i3, Object obj) {
    }

    @e3
    public static final <E, R> R c(@NotNull i<E> iVar, @NotNull Function1<? super i0<? extends E>, ? extends R> function1) {
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ i0 c0(i0 i0Var, CoroutineContext coroutineContext, Function2 function2) {
    }

    public static final <E, R> R d(@NotNull i0<? extends E> i0Var, @NotNull Function1<? super i0<? extends E>, ? extends R> function1) {
    }

    public static /* synthetic */ i0 d0(i0 i0Var, CoroutineContext coroutineContext, Function2 function2, int i2, Object obj) {
    }

    @e3
    @Nullable
    public static final <E> Object e(@NotNull i<E> iVar, @NotNull Function1<? super E, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
    }

    @PublishedApi
    @Nullable
    public static final <E, C extends m0<? super E>> Object e0(@NotNull i0<? extends E> i0Var, @NotNull C c, @NotNull Continuation<? super C> continuation) {
    }

    @Nullable
    public static final <E> Object f(@NotNull i0<? extends E> i0Var, @NotNull Function1<? super E, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
    }

    @PublishedApi
    @Nullable
    public static final <E, C extends Collection<? super E>> Object f0(@NotNull i0<? extends E> i0Var, @NotNull C c, @NotNull Continuation<? super C> continuation) {
    }

    @PublishedApi
    @NotNull
    public static final Function1<Throwable, Unit> g(@NotNull i0<?> i0Var) {
    }

    @Nullable
    public static final <E> Object g0(@NotNull i0<? extends E> i0Var, @NotNull Continuation<? super List<? extends E>> continuation) {
    }

    @PublishedApi
    @NotNull
    public static final Function1<Throwable, Unit> h(@NotNull i0<?>... i0VarArr) {
    }

    @PublishedApi
    @Nullable
    public static final <K, V, M extends Map<? super K, ? super V>> Object h0(@NotNull i0<? extends Pair<? extends K, ? extends V>> i0Var, @NotNull M m2, @NotNull Continuation<? super M> continuation) {
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object i(i0 i0Var, Continuation continuation) {
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object i0(i0 i0Var, Continuation continuation) {
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ i0 j(i0 i0Var) {
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object j0(i0 i0Var, Continuation continuation) {
    }

    @PublishedApi
    @NotNull
    public static final <E, K> i0<E> k(@NotNull i0<? extends E> i0Var, @NotNull CoroutineContext coroutineContext, @NotNull Function2<? super E, ? super Continuation<? super K>, ? extends Object> function2) {
    }

    @PublishedApi
    @Nullable
    public static final <E> Object k0(@NotNull i0<? extends E> i0Var, @NotNull Continuation<? super Set<E>> continuation) {
    }

    public static /* synthetic */ i0 l(i0 i0Var, CoroutineContext coroutineContext, Function2 function2, int i2, Object obj) {
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object l0(i0 i0Var, Continuation continuation) {
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ i0 m(i0 i0Var, int i2, CoroutineContext coroutineContext) {
    }

    @NotNull
    public static final <E> Object m0(@NotNull m0<? super E> m0Var, E e2) {
    }

    public static /* synthetic */ i0 n(i0 i0Var, int i2, CoroutineContext coroutineContext, int i3, Object obj) {
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ i0 n0(i0 i0Var, CoroutineContext coroutineContext) {
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ i0 o(i0 i0Var, CoroutineContext coroutineContext, Function2 function2) {
    }

    public static /* synthetic */ i0 o0(i0 i0Var, CoroutineContext coroutineContext, int i2, Object obj) {
    }

    public static /* synthetic */ i0 p(i0 i0Var, CoroutineContext coroutineContext, Function2 function2, int i2, Object obj) {
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ i0 p0(i0 i0Var, i0 i0Var2) {
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object q(i0 i0Var, int i2, Continuation continuation) {
    }

    @PublishedApi
    @NotNull
    public static final <E, R, V> i0<V> q0(@NotNull i0<? extends E> i0Var, @NotNull i0<? extends R> i0Var2, @NotNull CoroutineContext coroutineContext, @NotNull Function2<? super E, ? super R, ? extends V> function2) {
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object r(i0 i0Var, int i2, Continuation continuation) {
    }

    public static /* synthetic */ i0 r0(i0 i0Var, i0 i0Var2, CoroutineContext coroutineContext, Function2 function2, int i2, Object obj) {
    }

    @PublishedApi
    @NotNull
    public static final <E> i0<E> s(@NotNull i0<? extends E> i0Var, @NotNull CoroutineContext coroutineContext, @NotNull Function2<? super E, ? super Continuation<? super Boolean>, ? extends Object> function2) {
    }

    public static /* synthetic */ i0 t(i0 i0Var, CoroutineContext coroutineContext, Function2 function2, int i2, Object obj) {
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ i0 u(i0 i0Var, CoroutineContext coroutineContext, Function3 function3) {
    }

    public static /* synthetic */ i0 v(i0 i0Var, CoroutineContext coroutineContext, Function3 function3, int i2, Object obj) {
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ i0 w(i0 i0Var, CoroutineContext coroutineContext, Function2 function2) {
    }

    public static /* synthetic */ i0 x(i0 i0Var, CoroutineContext coroutineContext, Function2 function2, int i2, Object obj) {
    }

    @PublishedApi
    @NotNull
    public static final <E> i0<E> y(@NotNull i0<? extends E> i0Var) {
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object z(i0 i0Var, Collection collection, Continuation continuation) {
    }
}
