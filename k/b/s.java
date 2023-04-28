package k.b;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.android.tpush.common.Constants;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k.b.n2;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CancellableContinuationImpl.kt */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0011\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\t\u0012\u0004\u0012\u00028\u00000\u008a\u00012\t\u0012\u0004\u0012\u00028\u00000\u008b\u00012\u00060tj\u0002`uB\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013JB\u0010\u0012\u001a\u00020\u00112'\u0010\u000e\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u0014j\u0002`\u00172\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0018J\u001e\u0010\u001b\u001a\u00020\u00112\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u0019H\u0082\b¢\u0006\u0004\b\u001b\u0010\u001cJ8\u0010\u001e\u001a\u00020\u00112!\u0010\u001d\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u00142\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010\u0018J\u0019\u0010 \u001a\u00020\u001f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b \u0010!J!\u0010%\u001a\u00020\u00112\b\u0010\"\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0010¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u001f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b&\u0010!J\u0017\u0010(\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\bH\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010,\u001a\u00020\u0011H\u0000¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020\u0011H\u0002¢\u0006\u0004\b-\u0010+J\u0017\u0010/\u001a\u00020\u00112\u0006\u0010.\u001a\u00020\u0004H\u0002¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\u000f2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u001b\u00108\u001a\u0004\u0018\u00010\u000f2\b\u00105\u001a\u0004\u0018\u00010\bH\u0010¢\u0006\u0004\b6\u00107J\u0011\u00109\u001a\u0004\u0018\u00010\bH\u0001¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\n\u0018\u00010;j\u0004\u0018\u0001`<H\u0016¢\u0006\u0004\b=\u0010>J\u001f\u0010A\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u00105\u001a\u0004\u0018\u00010\bH\u0010¢\u0006\u0004\b?\u0010@J\u000f\u0010B\u001a\u00020\u0011H\u0016¢\u0006\u0004\bB\u0010+J\u0011\u0010D\u001a\u0004\u0018\u00010CH\u0002¢\u0006\u0004\bD\u0010EJ8\u0010F\u001a\u00020\u00112'\u0010\u000e\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u0014j\u0002`\u0017H\u0016¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u001fH\u0002¢\u0006\u0004\bH\u0010IJ8\u0010J\u001a\u00020\r2'\u0010\u000e\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u0014j\u0002`\u0017H\u0002¢\u0006\u0004\bJ\u0010KJB\u0010L\u001a\u00020\u00112'\u0010\u000e\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u0014j\u0002`\u00172\b\u00105\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\bL\u0010MJ\u000f\u0010O\u001a\u00020NH\u0014¢\u0006\u0004\bO\u0010PJ\u0017\u0010S\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\bQ\u0010RJ\u000f\u0010T\u001a\u00020\u0011H\u0002¢\u0006\u0004\bT\u0010+J\u000f\u0010U\u001a\u00020\u001fH\u0001¢\u0006\u0004\bU\u0010IJ<\u0010W\u001a\u00020\u00112\u0006\u0010V\u001a\u00028\u00002#\u0010\u001d\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0014H\u0016¢\u0006\u0004\bW\u0010XJH\u0010Y\u001a\u00020\u00112\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042%\b\u0002\u0010\u001d\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0014H\u0002¢\u0006\u0004\bY\u0010ZJ \u0010]\u001a\u00020\u00112\f\u0010\\\u001a\b\u0012\u0004\u0012\u00028\u00000[H\u0016ø\u0001\u0000¢\u0006\u0004\b]\u0010)JZ\u0010`\u001a\u0004\u0018\u00010\b2\u0006\u00105\u001a\u00020^2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042#\u0010\u001d\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00142\b\u0010_\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b`\u0010aJ\u0011\u0010c\u001a\u0004\u0018\u00010\bH\u0010¢\u0006\u0004\bb\u0010:J\u000f\u0010d\u001a\u00020NH\u0016¢\u0006\u0004\bd\u0010PJ\u000f\u0010e\u001a\u00020\u001fH\u0002¢\u0006\u0004\be\u0010IJ#\u0010e\u001a\u0004\u0018\u00010\b2\u0006\u0010V\u001a\u00028\u00002\b\u0010_\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\be\u0010fJH\u0010e\u001a\u0004\u0018\u00010\b2\u0006\u0010V\u001a\u00028\u00002\b\u0010_\u001a\u0004\u0018\u00010\b2#\u0010\u001d\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0014H\u0016¢\u0006\u0004\be\u0010gJJ\u0010i\u001a\u0004\u0018\u00010h2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010_\u001a\u0004\u0018\u00010\b2#\u0010\u001d\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0014H\u0002¢\u0006\u0004\bi\u0010jJ\u0019\u0010l\u001a\u0004\u0018\u00010\b2\u0006\u0010k\u001a\u00020\u000fH\u0016¢\u0006\u0004\bl\u0010mJ\u000f\u0010n\u001a\u00020\u001fH\u0002¢\u0006\u0004\bn\u0010IJ\u001b\u0010p\u001a\u00020\u0011*\u00020o2\u0006\u0010V\u001a\u00028\u0000H\u0016¢\u0006\u0004\bp\u0010qJ\u001b\u0010r\u001a\u00020\u0011*\u00020o2\u0006\u0010k\u001a\u00020\u000fH\u0016¢\u0006\u0004\br\u0010sR\u001c\u0010x\u001a\n\u0018\u00010tj\u0004\u0018\u0001`u8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bv\u0010wR\u001a\u0010z\u001a\u00020y8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}R!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0080\u0004¢\u0006\r\n\u0004\b\u0003\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0016\u0010\u0081\u0001\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010IR\u0016\u0010\u0082\u0001\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010IR\u0016\u0010\u0083\u0001\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010IR\u001b\u0010\u0084\u0001\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0017\u00105\u001a\u0004\u0018\u00010\b8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010:R\u0016\u0010\u0088\u0001\u001a\u00020N8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0087\u0001\u0010P\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0089\u0001"}, d2 = {"Lkotlinx/coroutines/CancellableContinuationImpl;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/coroutines/Continuation;", "delegate", "", "resumeMode", "<init>", "(Lkotlin/coroutines/Continuation;I)V", "", "proposedUpdate", "", "alreadyResumedError", "(Ljava/lang/Object;)Ljava/lang/Void;", "Lkotlinx/coroutines/CancelHandler;", "handler", "", "cause", "", "callCancelHandler", "(Lkotlinx/coroutines/CancelHandler;Ljava/lang/Throwable;)V", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)V", "Lkotlin/Function0;", "block", "callCancelHandlerSafely", "(Lkotlin/jvm/functions/Function0;)V", "onCancellation", "callOnCancellation", "", "cancel", "(Ljava/lang/Throwable;)Z", "takenState", "cancelCompletedResult$kotlinx_coroutines_core", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "cancelCompletedResult", "cancelLater", Constants.FLAG_TOKEN, "completeResume", "(Ljava/lang/Object;)V", "detachChild$kotlinx_coroutines_core", "()V", "detachChild", "detachChildIfNonResuable", h.c.a.a.a.f16081l, "dispatchResume", "(I)V", "Lkotlinx/coroutines/Job;", "parent", "getContinuationCancellationCause", "(Lkotlinx/coroutines/Job;)Ljava/lang/Throwable;", "state", "getExceptionalResult$kotlinx_coroutines_core", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "getExceptionalResult", "getResult", "()Ljava/lang/Object;", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "getSuccessfulResult$kotlinx_coroutines_core", "(Ljava/lang/Object;)Ljava/lang/Object;", "getSuccessfulResult", "initCancellability", "Lkotlinx/coroutines/DisposableHandle;", "installParentHandle", "()Lkotlinx/coroutines/DisposableHandle;", "invokeOnCancellation", "(Lkotlin/jvm/functions/Function1;)V", "isReusable", "()Z", "makeCancelHandler", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/CancelHandler;", "multipleHandlersError", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V", "", "nameString", "()Ljava/lang/String;", "parentCancelled$kotlinx_coroutines_core", "(Ljava/lang/Throwable;)V", "parentCancelled", "releaseClaimedReusableContinuation", "resetStateReusable", "value", "resume", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "resumeImpl", "(Ljava/lang/Object;ILkotlin/jvm/functions/Function1;)V", "Lkotlin/Result;", com.alipay.sdk.util.l.c, "resumeWith", "Lkotlinx/coroutines/NotCompleted;", "idempotent", "resumedState", "(Lkotlinx/coroutines/NotCompleted;Ljava/lang/Object;ILkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Object;", "takeState$kotlinx_coroutines_core", "takeState", "toString", "tryResume", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/Symbol;", "tryResumeImpl", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/internal/Symbol;", "exception", "tryResumeWithException", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "trySuspend", "Lkotlinx/coroutines/CoroutineDispatcher;", "resumeUndispatched", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Object;)V", "resumeUndispatchedWithException", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Throwable;)V", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/Continuation;", "getDelegate$kotlinx_coroutines_core", "()Lkotlin/coroutines/Continuation;", "isActive", "isCancelled", "isCompleted", "parentHandle", "Lkotlinx/coroutines/DisposableHandle;", "getState$kotlinx_coroutines_core", "getStateDebugRepresentation", "stateDebugRepresentation", "kotlinx-coroutines-core", "Lkotlinx/coroutines/DispatchedTask;", "Lkotlinx/coroutines/CancellableContinuation;"}, k = 1, mv = {1, 6, 0}, xi = 48)
@PublishedApi
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class s<T> extends j1<T> implements r<T>, CoroutineStackFrame {

    /* renamed from: h  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f29640h = AtomicIntegerFieldUpdater.newUpdater(s.class, "_decision");

    /* renamed from: i  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f29641i = AtomicReferenceFieldUpdater.newUpdater(s.class, Object.class, "_state");
    @NotNull
    private volatile /* synthetic */ int _decision;
    @NotNull
    private volatile /* synthetic */ Object _state;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private final Continuation<T> f29642e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final CoroutineContext f29643f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private p1 f29644g;

    /* JADX WARN: Multi-variable type inference failed */
    public s(@NotNull Continuation<? super T> continuation, int i2) {
        super(i2);
        this.f29642e = continuation;
        if (z0.b()) {
            if (!(i2 != -1)) {
                throw new AssertionError();
            }
        }
        this.f29643f = continuation.getContext();
        this._decision = 0;
        this._state = e.b;
    }

    private final String A() {
        Object z = z();
        return z instanceof d3 ? "Active" : z instanceof v ? "Cancelled" : "Completed";
    }

    private final p1 B() {
        n2 n2Var = (n2) getContext().get(n2.v0);
        if (n2Var == null) {
            return null;
        }
        p1 f2 = n2.a.f(n2Var, true, false, new w(this), 2, null);
        this.f29644g = f2;
        return f2;
    }

    private final boolean C() {
        return k1.d(this.f29410d) && ((k.b.j4.l) this.f29642e).p();
    }

    private final p D(Function1<? super Throwable, Unit> function1) {
        return function1 instanceof p ? (p) function1 : new k2(function1);
    }

    private final void E(Function1<? super Throwable, Unit> function1, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + function1 + ", already has " + obj).toString());
    }

    private final void H() {
        Continuation<T> continuation = this.f29642e;
        k.b.j4.l lVar = continuation instanceof k.b.j4.l ? (k.b.j4.l) continuation : null;
        Throwable z = lVar != null ? lVar.z(this) : null;
        if (z == null) {
            return;
        }
        t();
        a(z);
    }

    private final void J(Object obj, int i2, Function1<? super Throwable, Unit> function1) {
        Object obj2;
        do {
            obj2 = this._state;
            if (obj2 instanceof d3) {
            } else {
                if (obj2 instanceof v) {
                    v vVar = (v) obj2;
                    if (vVar.c()) {
                        if (function1 == null) {
                            return;
                        }
                        o(function1, vVar.f29231a);
                        return;
                    }
                }
                k(obj);
                throw new KotlinNothingValueException();
            }
        } while (!f29641i.compareAndSet(this, obj2, L((d3) obj2, obj, i2, function1, null)));
        u();
        v(i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void K(s sVar, Object obj, int i2, Function1 function1, int i3, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i3 & 4) != 0) {
            function1 = null;
        }
        sVar.J(obj, i2, function1);
    }

    private final Object L(d3 d3Var, Object obj, int i2, Function1<? super Throwable, Unit> function1, Object obj2) {
        if (obj instanceof f0) {
            if (z0.b()) {
                if (!(obj2 == null)) {
                    throw new AssertionError();
                }
            }
            if (z0.b()) {
                if (function1 == null) {
                    return obj;
                }
                throw new AssertionError();
            }
            return obj;
        } else if (k1.c(i2) || obj2 != null) {
            if (function1 != null || (((d3Var instanceof p) && !(d3Var instanceof h)) || obj2 != null)) {
                return new e0(obj, d3Var instanceof p ? (p) d3Var : null, function1, obj2, null, 16, null);
            }
            return obj;
        } else {
            return obj;
        }
    }

    private final boolean M() {
        do {
            int i2 = this._decision;
            if (i2 != 0) {
                if (i2 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f29640h.compareAndSet(this, 0, 2));
        return true;
    }

    private final k.b.j4.q0 Q(Object obj, Object obj2, Function1<? super Throwable, Unit> function1) {
        Object obj3;
        do {
            obj3 = this._state;
            if (obj3 instanceof d3) {
            } else if (!(obj3 instanceof e0) || obj2 == null) {
                return null;
            } else {
                e0 e0Var = (e0) obj3;
                if (e0Var.f29225d == obj2) {
                    if (!z0.b() || Intrinsics.areEqual(e0Var.f29224a, obj)) {
                        return t.f29646d;
                    }
                    throw new AssertionError();
                }
                return null;
            }
        } while (!f29641i.compareAndSet(this, obj3, L((d3) obj3, obj, this.f29410d, function1, obj2)));
        u();
        return t.f29646d;
    }

    private final boolean R() {
        do {
            int i2 = this._decision;
            if (i2 != 0) {
                if (i2 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f29640h.compareAndSet(this, 0, 1));
        return true;
    }

    private final Void k(Object obj) {
        throw new IllegalStateException(Intrinsics.stringPlus("Already resumed, but proposed with update ", obj).toString());
    }

    private final void l(Function1<? super Throwable, Unit> function1, Throwable th) {
        try {
            function1.invoke(th);
        } catch (Throwable th2) {
            s0.b(getContext(), new i0(Intrinsics.stringPlus("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    private final void n(Function0<Unit> function0) {
        try {
            function0.invoke();
        } catch (Throwable th) {
            s0.b(getContext(), new i0(Intrinsics.stringPlus("Exception in invokeOnCancellation handler for ", this), th));
        }
    }

    private final boolean p(Throwable th) {
        if (C()) {
            return ((k.b.j4.l) this.f29642e).t(th);
        }
        return false;
    }

    private final void u() {
        if (C()) {
            return;
        }
        t();
    }

    private final void v(int i2) {
        if (M()) {
            return;
        }
        k1.a(this, i2);
    }

    @NotNull
    public String F() {
        return "CancellableContinuation";
    }

    public final void G(@NotNull Throwable th) {
        if (p(th)) {
            return;
        }
        a(th);
        u();
    }

    @JvmName(name = "resetStateReusable")
    public final boolean I() {
        if (z0.b()) {
            if (!(this.f29410d == 2)) {
                throw new AssertionError();
            }
        }
        if (z0.b()) {
            if (!(this.f29644g != c3.b)) {
                throw new AssertionError();
            }
        }
        Object obj = this._state;
        if (!z0.b() || (!(obj instanceof d3))) {
            if ((obj instanceof e0) && ((e0) obj).f29225d != null) {
                t();
                return false;
            }
            this._decision = 0;
            this._state = e.b;
            return true;
        }
        throw new AssertionError();
    }

    @Override // k.b.r
    @Nullable
    public Object N(T t, @Nullable Object obj, @Nullable Function1<? super Throwable, Unit> function1) {
        return Q(t, obj, function1);
    }

    @Override // k.b.r
    public void O(@NotNull p0 p0Var, T t) {
        Continuation<T> continuation = this.f29642e;
        k.b.j4.l lVar = continuation instanceof k.b.j4.l ? (k.b.j4.l) continuation : null;
        K(this, t, (lVar != null ? lVar.f29445e : null) == p0Var ? 4 : this.f29410d, null, 4, null);
    }

    @Override // k.b.r
    public void P() {
        p1 B = B();
        if (B != null && e()) {
            B.dispose();
            this.f29644g = c3.b;
        }
    }

    @Override // k.b.r
    public void Y(@NotNull Object obj) {
        if (z0.b()) {
            if (!(obj == t.f29646d)) {
                throw new AssertionError();
            }
        }
        v(this.f29410d);
    }

    @Override // k.b.r
    public boolean a(@Nullable Throwable th) {
        Object obj;
        boolean z;
        do {
            obj = this._state;
            if (!(obj instanceof d3)) {
                return false;
            }
            z = obj instanceof p;
        } while (!f29641i.compareAndSet(this, obj, new v(this, th, z)));
        p pVar = z ? (p) obj : null;
        if (pVar != null) {
            m(pVar, th);
        }
        u();
        v(this.f29410d);
        return true;
    }

    @Override // k.b.j1
    public void c(@Nullable Object obj, @NotNull Throwable th) {
        while (true) {
            Object obj2 = this._state;
            if (!(obj2 instanceof d3)) {
                if (obj2 instanceof f0) {
                    return;
                }
                if (obj2 instanceof e0) {
                    e0 e0Var = (e0) obj2;
                    if (!e0Var.h()) {
                        if (f29641i.compareAndSet(this, obj2, e0.g(e0Var, null, null, null, null, th, 15, null))) {
                            e0Var.i(this, th);
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else if (f29641i.compareAndSet(this, obj2, new e0(obj2, null, null, null, th, 14, null))) {
                    return;
                }
            } else {
                throw new IllegalStateException("Not completed".toString());
            }
        }
    }

    @Override // k.b.j1
    @NotNull
    public final Continuation<T> d() {
        return this.f29642e;
    }

    @Override // k.b.r
    public boolean e() {
        return !(z() instanceof d3);
    }

    @Override // k.b.r
    @Nullable
    public Object f(T t, @Nullable Object obj) {
        return Q(t, obj, null);
    }

    @Override // k.b.j1
    @Nullable
    public Throwable g(@Nullable Object obj) {
        Throwable g2 = super.g(obj);
        if (g2 == null) {
            return null;
        }
        Continuation<T> d2 = d();
        return (z0.e() && (d2 instanceof CoroutineStackFrame)) ? k.b.j4.p0.o(g2, (CoroutineStackFrame) d2) : g2;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.f29642e;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    @NotNull
    public CoroutineContext getContext() {
        return this.f29643f;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k.b.j1
    public <T> T h(@Nullable Object obj) {
        return obj instanceof e0 ? (T) ((e0) obj).f29224a : obj;
    }

    @Override // k.b.r
    public boolean isActive() {
        return z() instanceof d3;
    }

    @Override // k.b.r
    public boolean isCancelled() {
        return z() instanceof v;
    }

    @Override // k.b.j1
    @Nullable
    public Object j() {
        return z();
    }

    public final void m(@NotNull p pVar, @Nullable Throwable th) {
        try {
            pVar.a(th);
        } catch (Throwable th2) {
            s0.b(getContext(), new i0(Intrinsics.stringPlus("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    public final void o(@NotNull Function1<? super Throwable, Unit> function1, @NotNull Throwable th) {
        try {
            function1.invoke(th);
        } catch (Throwable th2) {
            s0.b(getContext(), new i0(Intrinsics.stringPlus("Exception in resume onCancellation handler for ", this), th2));
        }
    }

    @Override // k.b.r
    public void q(@NotNull Function1<? super Throwable, Unit> function1) {
        p D = D(function1);
        while (true) {
            Object obj = this._state;
            if (obj instanceof e) {
                if (f29641i.compareAndSet(this, obj, D)) {
                    return;
                }
            } else if (obj instanceof p) {
                E(function1, obj);
            } else {
                boolean z = obj instanceof f0;
                if (z) {
                    f0 f0Var = (f0) obj;
                    if (!f0Var.b()) {
                        E(function1, obj);
                    }
                    if (obj instanceof v) {
                        if (!z) {
                            f0Var = null;
                        }
                        l(function1, f0Var != null ? f0Var.f29231a : null);
                        return;
                    }
                    return;
                } else if (obj instanceof e0) {
                    e0 e0Var = (e0) obj;
                    if (e0Var.b != null) {
                        E(function1, obj);
                    }
                    if (D instanceof h) {
                        return;
                    }
                    if (e0Var.h()) {
                        l(function1, e0Var.f29226e);
                        return;
                    } else {
                        if (f29641i.compareAndSet(this, obj, e0.g(e0Var, null, D, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else if (D instanceof h) {
                    return;
                } else {
                    if (f29641i.compareAndSet(this, obj, new e0(obj, D, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    @Override // k.b.r
    @Nullable
    public Object r(@NotNull Throwable th) {
        return Q(new f0(th, false, 2, null), null, null);
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(@NotNull Object obj) {
        K(this, l0.c(obj, this), this.f29410d, null, 4, null);
    }

    @Override // k.b.r
    public void s(@NotNull p0 p0Var, @NotNull Throwable th) {
        Continuation<T> continuation = this.f29642e;
        k.b.j4.l lVar = continuation instanceof k.b.j4.l ? (k.b.j4.l) continuation : null;
        K(this, new f0(th, false, 2, null), (lVar != null ? lVar.f29445e : null) == p0Var ? 4 : this.f29410d, null, 4, null);
    }

    public final void t() {
        p1 p1Var = this.f29644g;
        if (p1Var == null) {
            return;
        }
        p1Var.dispose();
        this.f29644g = c3.b;
    }

    @NotNull
    public String toString() {
        return F() + '(' + a1.c(this.f29642e) + "){" + A() + "}@" + a1.b(this);
    }

    @NotNull
    public Throwable w(@NotNull n2 n2Var) {
        return n2Var.m();
    }

    @PublishedApi
    @Nullable
    public final Object x() {
        n2 n2Var;
        boolean C = C();
        if (R()) {
            if (this.f29644g == null) {
                B();
            }
            if (C) {
                H();
            }
            return IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
        if (C) {
            H();
        }
        Object z = z();
        if (z instanceof f0) {
            Throwable th = ((f0) z).f29231a;
            if (z0.e()) {
                throw k.b.j4.p0.o(th, this);
            }
            throw th;
        } else if (k1.c(this.f29410d) && (n2Var = (n2) getContext().get(n2.v0)) != null && !n2Var.isActive()) {
            CancellationException m2 = n2Var.m();
            c(z, m2);
            if (z0.e()) {
                throw k.b.j4.p0.o(m2, this);
            }
            throw m2;
        } else {
            return h(z);
        }
    }

    @Override // k.b.r
    public void y(T t, @Nullable Function1<? super Throwable, Unit> function1) {
        J(t, this.f29410d, function1);
    }

    @Nullable
    public final Object z() {
        return this._state;
    }
}
