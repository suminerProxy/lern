package k.b.m4;

import androidx.exifinterface.media.ExifInterface;
import i.a.e1.c.k0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import k.b.g4.g0;
import k.b.g4.m0;
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

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* compiled from: RxObservable.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00020\u00120?2\b\u0012\u0004\u0012\u00028\u00000@2\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000#09B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\u00122\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0018\u001a\u00020\u00172\u0014\u0010\u0016\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00120\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001a\u0010\u0014J\u0017\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJX\u0010&\u001a\u00020\u0012\"\u0004\b\u0001\u0010\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010\u001f2\u0006\u0010!\u001a\u00028\u00002(\u0010%\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000#\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010$\u0012\u0006\u0012\u0004\u0018\u00010\u00010\"H\u0016ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u001b\u0010(\u001a\u00020\u00122\u0006\u0010!\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b(\u0010)J!\u0010*\u001a\u00020\u00122\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b*\u0010\u0014J&\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00120+2\u0006\u0010!\u001a\u00028\u0000H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020\u0012H\u0002¢\u0006\u0004\b/\u00100R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00104\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R&\u0010<\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000#098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010=\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006>"}, d2 = {"Lkotlinx/coroutines/rx3/RxObservableCoroutine;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/coroutines/CoroutineContext;", "parentContext", "Lio/reactivex/rxjava3/core/ObservableEmitter;", "subscriber", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lio/reactivex/rxjava3/core/ObservableEmitter;)V", "", "cause", "", "close", "(Ljava/lang/Throwable;)Z", "elem", "doLockedNext", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "handled", "", "doLockedSignalCompleted", "(Ljava/lang/Throwable;Z)V", "Lkotlin/Function1;", "handler", "", "invokeOnClose", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Void;", "onCancelled", "value", "onCompleted", "(Lkotlin/Unit;)V", "R", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "element", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/SendChannel;", "Lkotlin/coroutines/Continuation;", "block", "registerSelectClause2", "(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "send", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signalCompleted", "Lkotlinx/coroutines/channels/ChannelResult;", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "trySend", "unlockAndCheckCompleted", "()V", "getChannel", "()Lkotlinx/coroutines/channels/SendChannel;", "channel", "isClosedForSend", "()Z", "Lkotlinx/coroutines/sync/Mutex;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlinx/coroutines/selects/SelectClause2;", "getOnSend", "()Lkotlinx/coroutines/selects/SelectClause2;", "onSend", "Lio/reactivex/rxjava3/core/ObservableEmitter;", "kotlinx-coroutines-rx3", "Lkotlinx/coroutines/AbstractCoroutine;", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class s<T> extends k.b.b<Unit> implements g0<T>, k.b.o4.e<T, m0<? super T>> {

    /* renamed from: f  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f29527f = null;
    @NotNull
    private volatile /* synthetic */ int _signal;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private final k0<T> f29528d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private final k.b.p4.c f29529e;

    /* compiled from: RxObservable.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u0004*\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "R", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.rx3.RxObservableCoroutine$registerSelectClause2$1", f = "RxObservable.kt", i = {}, l = {106}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a extends SuspendLambda implements Function2<v0, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Function1<Continuation<? super R>, Object> $clause;
        public final /* synthetic */ k.b.o4.f<R> $select;
        public int label;
        public final /* synthetic */ s<T> this$0;

        public a(s<T> sVar, k.b.o4.f<? super R> fVar, Function1<? super Continuation<? super R>, ? extends Object> function1, Continuation<? super a> continuation) {
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
    /* compiled from: RxObservable.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0003\n\u0002\u0010\u0000\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\b\b\u0001\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "R", ExifInterface.GPS_DIRECTION_TRUE, ""}, k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.rx3.RxObservableCoroutine$registerSelectClause2$clause$1", f = "RxObservable.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<R> extends SuspendLambda implements Function1<Continuation<? super R>, Object> {
        public final /* synthetic */ Function2<m0<? super T>, Continuation<? super R>, Object> $block;
        public final /* synthetic */ T $element;
        public int label;
        public final /* synthetic */ s<T> this$0;

        public b(s<T> sVar, T t, Function2<? super m0<? super T>, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super b> continuation) {
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

    /* compiled from: RxObservable.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.rx3.RxObservableCoroutine", f = "RxObservable.kt", i = {0, 0}, l = {85}, m = "send", n = {"this", "element"}, s = {"L$0", "L$1"})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class c extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;
        public final /* synthetic */ s<T> this$0;

        public c(s<T> sVar, Continuation<? super c> continuation) {
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
        }
    }

    static {
    }

    public s(@NotNull CoroutineContext coroutineContext, @NotNull k0<T> k0Var) {
    }

    private final void C1(Throwable th, boolean z) {
    }

    private final void D1() {
    }

    public static final /* synthetic */ Throwable w1(s sVar, Object obj) {
    }

    public static final /* synthetic */ k.b.p4.c x1(s sVar) {
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
    public Object D(@NotNull T t) {
    }

    @Override // k.b.o4.e
    public <R> void E(@NotNull k.b.o4.f<? super R> fVar, @NotNull T t, @NotNull Function2<? super m0<? super T>, ? super Continuation<? super R>, ? extends Object> function2) {
    }

    @Override // k.b.g4.m0
    public boolean R(@Nullable Throwable th) {
    }

    @Override // k.b.g4.m0
    @Nullable
    public Object U(@NotNull T t, @NotNull Continuation<? super Unit> continuation) {
    }

    @Override // k.b.g4.m0
    public boolean V() {
    }

    @Override // k.b.g4.g0
    @NotNull
    public m0<T> c() {
    }

    @Override // k.b.g4.m0
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(@NotNull T t) {
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
