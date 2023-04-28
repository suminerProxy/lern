package k.b.l4;

import androidx.exifinterface.media.ExifInterface;
import com.google.common.math.DoubleMath;
import com.umeng.analytics.pro.am;
import k.b.r;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* compiled from: Await.kt */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u0018\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a!\u0010\t\u001a\u0002H\n\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\f\u001a)\u0010\r\u001a\u0002H\n\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000b2\u0006\u0010\u000e\u001a\u0002H\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a/\u0010\u0010\u001a\u0002H\n\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\n0\u0012H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0013\u001a#\u0010\u0014\u001a\u0004\u0018\u0001H\n\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\f\u001a!\u0010\u0015\u001a\u0002H\n\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\f\u001a5\u0010\u0016\u001a\u0002H\n\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000b2\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u0001H\nH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0017\u001a!\u0010\u0018\u001a\u0002H\n\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\f\u001a)\u0010\u0019\u001a\u0002H\n\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000b2\u0006\u0010\u000e\u001a\u0002H\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a/\u0010\u001a\u001a\u0002H\n\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\n0\u0012H\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u0013\u001a#\u0010\u001b\u001a\u0004\u0018\u0001H\n\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000bH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"gotSignalInTerminalStateException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "signalName", "", "moreThanOneValueProvidedException", h.c.a.a.a.f16081l, "Lkotlinx/coroutines/reactive/Mode;", "awaitFirst", ExifInterface.GPS_DIRECTION_TRUE, "Lorg/reactivestreams/Publisher;", "(Lorg/reactivestreams/Publisher;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitFirstOrDefault", "default", "(Lorg/reactivestreams/Publisher;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitFirstOrElse", "defaultValue", "Lkotlin/Function0;", "(Lorg/reactivestreams/Publisher;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitFirstOrNull", "awaitLast", "awaitOne", "(Lorg/reactivestreams/Publisher;Lkotlinx/coroutines/reactive/Mode;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitSingle", "awaitSingleOrDefault", "awaitSingleOrElse", "awaitSingleOrNull", "kotlinx-coroutines-reactive"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class b {

    /* compiled from: Await.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.reactive.AwaitKt", f = "Await.kt", i = {0}, l = {56}, m = "awaitFirstOrElse", n = {"defaultValue"}, s = {"L$0"})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public a(Continuation<? super a> continuation) {
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Await.kt */
    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0015\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0006H\u0016J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\b¨\u0006\u0016"}, d2 = {"kotlinx/coroutines/reactive/AwaitKt$awaitOne$2$1", "Lorg/reactivestreams/Subscriber;", "inTerminalState", "", "seenValue", "subscription", "Lorg/reactivestreams/Subscription;", "value", "Ljava/lang/Object;", "onComplete", "", "onError", "e", "", "onNext", am.aI, "(Ljava/lang/Object;)V", "onSubscribe", "sub", "tryEnterTerminalState", "signalName", "", "kotlinx-coroutines-reactive"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* renamed from: k.b.l4.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class C0643b<T> implements Subscriber<T> {
        @Nullable
        private Subscription b;
        @Nullable
        private T c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f29486d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f29487e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ r<T> f29488f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ j f29489g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ T f29490h;

        /* compiled from: Await.kt */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        /* renamed from: k.b.l4.b$b$a */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f29491a = null;
        }

        /* compiled from: Await.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
        /* renamed from: k.b.l4.b$b$b  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public static final class C0644b extends Lambda implements Function1<Throwable, Unit> {
            public final /* synthetic */ Subscription $sub;

            public C0644b(Subscription subscription) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Throwable th) {
            }
        }

        public C0643b(r<? super T> rVar, j jVar, T t) {
        }

        private final boolean a(String str) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(@NotNull Throwable th) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
        }

        @Override // org.reactivestreams.Subscriber, i.a.q
        public void onSubscribe(@NotNull Subscription subscription) {
        }
    }

    /* compiled from: Await.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.reactive.AwaitKt", f = "Await.kt", i = {0}, l = {DoubleMath.MAX_FACTORIAL}, m = "awaitSingleOrElse", n = {"defaultValue"}, s = {"L$0"})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class c<T> extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public c(Continuation<? super c> continuation) {
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
        }
    }

    public static final /* synthetic */ Object a(Publisher publisher, j jVar, Object obj, Continuation continuation) {
    }

    public static final /* synthetic */ void b(CoroutineContext coroutineContext, String str) {
    }

    public static final /* synthetic */ void c(CoroutineContext coroutineContext, j jVar) {
    }

    @Nullable
    public static final <T> Object d(@NotNull Publisher<T> publisher, @NotNull Continuation<? super T> continuation) {
    }

    @Nullable
    public static final <T> Object e(@NotNull Publisher<T> publisher, T t, @NotNull Continuation<? super T> continuation) {
    }

    @Nullable
    public static final <T> Object f(@NotNull Publisher<T> publisher, @NotNull Function0<? extends T> function0, @NotNull Continuation<? super T> continuation) {
    }

    @Nullable
    public static final <T> Object g(@NotNull Publisher<T> publisher, @NotNull Continuation<? super T> continuation) {
    }

    @Nullable
    public static final <T> Object h(@NotNull Publisher<T> publisher, @NotNull Continuation<? super T> continuation) {
    }

    private static final <T> Object i(Publisher<T> publisher, j jVar, T t, Continuation<? super T> continuation) {
    }

    public static /* synthetic */ Object j(Publisher publisher, j jVar, Object obj, Continuation continuation, int i2, Object obj2) {
    }

    @Nullable
    public static final <T> Object k(@NotNull Publisher<T> publisher, @NotNull Continuation<? super T> continuation) {
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated without a replacement due to its name incorrectly conveying the behavior. Please consider using awaitFirstOrDefault().")
    @Nullable
    public static final <T> Object l(@NotNull Publisher<T> publisher, T t, @NotNull Continuation<? super T> continuation) {
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated without a replacement due to its name incorrectly conveying the behavior. Please consider using awaitFirstOrElse().")
    @Nullable
    public static final <T> Object m(@NotNull Publisher<T> publisher, @NotNull Function0<? extends T> function0, @NotNull Continuation<? super T> continuation) {
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated without a replacement due to its name incorrectly conveying the behavior. There is a specialized version for Reactor's Mono, please use that where applicable. Alternatively, please consider using awaitFirstOrNull().", replaceWith = @ReplaceWith(expression = "this.awaitSingleOrNull()", imports = {"kotlinx.coroutines.reactor"}))
    @Nullable
    public static final <T> Object n(@NotNull Publisher<T> publisher, @NotNull Continuation<? super T> continuation) {
    }

    private static final void o(CoroutineContext coroutineContext, String str) {
    }

    private static final void p(CoroutineContext coroutineContext, j jVar) {
    }
}
