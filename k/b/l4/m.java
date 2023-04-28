package k.b.l4;

import androidx.exifinterface.media.ExifInterface;
import com.sobot.network.http.model.SobotProgress;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import k.b.g4.g0;
import k.b.g4.m0;
import k.b.i2;
import k.b.v0;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
/* compiled from: Publish.kt */
@i2
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00020\b0H2\b\u0012\u0004\u0012\u00028\u00000I2\u00020J2\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000%0BB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0012\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0015\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001b\u001a\u00020\u001a2\u0014\u0010\u0019\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u001d\u0010\u0017J\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001f\u0010 JX\u0010)\u001a\u00020\b\"\u0004\b\u0001\u0010!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\"2\u0006\u0010$\u001a\u00028\u00002(\u0010(\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000%\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010&\u0012\u0006\u0012\u0004\u0018\u00010'0\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\b2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u001b\u0010/\u001a\u00020\b2\u0006\u0010$\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b/\u00100J!\u00101\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0015\u001a\u00020\u000fH\u0002¢\u0006\u0004\b1\u0010\u0017J&\u00105\u001a\b\u0012\u0004\u0012\u00020\b022\u0006\u0010$\u001a\u00028\u0000H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b3\u00104J\u000f\u00106\u001a\u00020\bH\u0002¢\u0006\u0004\b6\u0010\rR\u0016\u00107\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R&\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010<R\u0014\u0010=\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR&\u0010E\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000%0B8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\bX\u0088\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010F\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006G"}, d2 = {"Lkotlinx/coroutines/reactive/PublisherCoroutine;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/coroutines/CoroutineContext;", "parentContext", "Lorg/reactivestreams/Subscriber;", "subscriber", "Lkotlin/Function2;", "", "", "exceptionOnCancelHandler", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lorg/reactivestreams/Subscriber;Lkotlin/jvm/functions/Function2;)V", "cancel", "()V", "cause", "", "close", "(Ljava/lang/Throwable;)Z", "elem", "doLockedNext", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "handled", "doLockedSignalCompleted", "(Ljava/lang/Throwable;Z)V", "Lkotlin/Function1;", "handler", "", "invokeOnClose", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Void;", "onCancelled", "value", "onCompleted", "(Lkotlin/Unit;)V", "R", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "element", "Lkotlinx/coroutines/channels/SendChannel;", "Lkotlin/coroutines/Continuation;", "", "block", "registerSelectClause2", "(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "", "n", SobotProgress.REQUEST, "(J)V", "send", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signalCompleted", "Lkotlinx/coroutines/channels/ChannelResult;", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "trySend", "unlockAndCheckCompleted", "cancelled", "Z", "getChannel", "()Lkotlinx/coroutines/channels/SendChannel;", "channel", "Lkotlin/jvm/functions/Function2;", "isClosedForSend", "()Z", "Lkotlinx/coroutines/sync/Mutex;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlinx/coroutines/selects/SelectClause2;", "getOnSend", "()Lkotlinx/coroutines/selects/SelectClause2;", "onSend", "Lorg/reactivestreams/Subscriber;", "kotlinx-coroutines-reactive", "Lkotlinx/coroutines/AbstractCoroutine;", "Lkotlinx/coroutines/channels/ProducerScope;", "Lorg/reactivestreams/Subscription;"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class m<T> extends k.b.b<Unit> implements g0<T>, Subscription, k.b.o4.e<T, m0<? super T>> {

    /* renamed from: g  reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f29498g = null;
    @NotNull
    private volatile /* synthetic */ long _nRequested;
    private volatile boolean cancelled;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private final Subscriber<T> f29499d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private final Function2<Throwable, CoroutineContext, Unit> f29500e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final k.b.p4.c f29501f;

    /* compiled from: Publish.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0006\b\u0001\u0010\u0003 \u0000*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "R", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.reactive.PublisherCoroutine$registerSelectClause2$1", f = "Publish.kt", i = {}, l = {114}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a extends SuspendLambda implements Function2<v0, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Function1<Continuation<? super R>, Object> $clause;
        public final /* synthetic */ k.b.o4.f<R> $select;
        public int label;
        public final /* synthetic */ m<T> this$0;

        public a(m<? super T> mVar, k.b.o4.f<? super R> fVar, Function1<? super Continuation<? super R>, ? extends Object> function1, Continuation<? super a> continuation) {
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(v0 v0Var, Continuation<? super Unit> continuation) {
        }

        @Nullable
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull v0 v0Var, @Nullable Continuation<? super Unit> continuation) {
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: Publish.kt */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0006\b\u0001\u0010\u0002 \u0000H\u008a@"}, d2 = {"<anonymous>", "R", ExifInterface.GPS_DIRECTION_TRUE}, k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.reactive.PublisherCoroutine$registerSelectClause2$clause$1", f = "Publish.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<R> extends SuspendLambda implements Function1<Continuation<? super R>, Object> {
        public final /* synthetic */ Function2<m0<? super T>, Continuation<? super R>, Object> $block;
        public final /* synthetic */ T $element;
        public int label;
        public final /* synthetic */ m<T> this$0;

        public b(m<? super T> mVar, T t, Function2<? super m0<? super T>, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super b> continuation) {
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        }

        @Nullable
        public final Object invoke(@Nullable Continuation<? super R> continuation) {
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
        }
    }

    /* compiled from: Publish.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.reactive.PublisherCoroutine", f = "Publish.kt", i = {0, 0}, l = {98}, m = "send", n = {"this", "element"}, s = {"L$0", "L$1"})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class c extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;
        public final /* synthetic */ m<T> this$0;

        public c(m<? super T> mVar, Continuation<? super c> continuation) {
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
        }
    }

    static {
    }

    public m(@NotNull CoroutineContext coroutineContext, @NotNull Subscriber<T> subscriber, @NotNull Function2<? super Throwable, ? super CoroutineContext, Unit> function2) {
    }

    private final void C1(Throwable th, boolean z) {
    }

    private final void D1() {
    }

    public static final /* synthetic */ Throwable w1(m mVar, Object obj) {
    }

    public static final /* synthetic */ k.b.p4.c x1(m mVar) {
    }

    private final Throwable y1(T t) {
    }

    private final void z1(Throwable th, boolean z) {
    }

    @NotNull
    public Void A1(@NotNull Function1<? super Throwable, Unit> function1) {
    }

    @Override // k.b.g4.m0
    public /* bridge */ /* synthetic */ void B(Function1 function1) {
    }

    public void B1(@NotNull Unit unit) {
    }

    @Override // k.b.g4.m0
    @NotNull
    public Object D(T t) {
    }

    @Override // k.b.o4.e
    public <R> void E(@NotNull k.b.o4.f<? super R> fVar, T t, @NotNull Function2<? super m0<? super T>, ? super Continuation<? super R>, ? extends Object> function2) {
    }

    @Override // k.b.g4.m0
    public boolean R(@Nullable Throwable th) {
    }

    @Override // k.b.g4.m0
    @Nullable
    public Object U(T t, @NotNull Continuation<? super Unit> continuation) {
    }

    @Override // k.b.g4.m0
    public boolean V() {
    }

    @Override // k.b.g4.g0
    @NotNull
    public m0<T> c() {
    }

    @Override // k.b.v2, k.b.n2
    public void cancel() {
    }

    @Override // k.b.g4.m0
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(T t) {
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j2) {
    }

    @Override // k.b.g4.m0
    @NotNull
    public k.b.o4.e<T, m0<T>> t() {
    }

    @Override // k.b.b
    public void t1(@NotNull Throwable th, boolean z) {
    }

    @Override // k.b.b
    public /* bridge */ /* synthetic */ void u1(Unit unit) {
    }
}
