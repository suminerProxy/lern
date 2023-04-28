package k.b.j4;

import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k.b.b4;
import k.b.j1;
import k.b.n2;
import k.b.t1;
import k.b.u3;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DispatchedContinuation.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000O2\u00060?j\u0002`@2\b\u0012\u0004\u0012\u00028\u00000\u0004B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ!\u0010\u0011\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\n\u0018\u00010\u001bj\u0004\u0018\u0001`\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010 \u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u001f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\b¢\u0006\u0004\b$\u0010\nJH\u0010+\u001a\u00020\b2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%2%\b\b\u0010*\u001a\u001f\u0012\u0013\u0012\u00110\r¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\b\u0018\u00010'H\u0086\bø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u001a\u0010.\u001a\u00020\u001f2\b\u0010-\u001a\u0004\u0018\u00010\u000bH\u0086\b¢\u0006\u0004\b.\u0010/J!\u00100\u001a\u00020\b2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0086\bø\u0001\u0000¢\u0006\u0004\b0\u00101J \u00102\u001a\u00020\b2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0016ø\u0001\u0000¢\u0006\u0004\b2\u00101J\u0011\u00105\u001a\u0004\u0018\u00010\u000bH\u0010¢\u0006\u0004\b3\u00104J\u000f\u00107\u001a\u000206H\u0016¢\u0006\u0004\b7\u00108J\u001b\u0010:\u001a\u0004\u0018\u00010\r2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u000309¢\u0006\u0004\b:\u0010;R\u001e\u0010<\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b<\u0010=\u0012\u0004\b>\u0010\nR\u001c\u0010C\u001a\n\u0018\u00010?j\u0004\u0018\u0001`@8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0014\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bD\u0010ER\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010FR\u0014\u0010G\u001a\u00020\u000b8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\bG\u0010=R\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010KR\u001a\u0010M\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006N"}, d2 = {"Lkotlinx/coroutines/internal/DispatchedContinuation;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "Lkotlin/coroutines/Continuation;", "continuation", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/coroutines/Continuation;)V", "", "awaitReusability", "()V", "", "takenState", "", "cause", "cancelCompletedResult$kotlinx_coroutines_core", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "cancelCompletedResult", "Lkotlinx/coroutines/CancellableContinuationImpl;", "claimReusableCancellableContinuation", "()Lkotlinx/coroutines/CancellableContinuationImpl;", "Lkotlin/coroutines/CoroutineContext;", "context", "value", "dispatchYield$kotlinx_coroutines_core", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "dispatchYield", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "", "isReusable", "()Z", "postponeCancellation", "(Ljava/lang/Throwable;)Z", "release", "Lkotlin/Result;", com.alipay.sdk.util.l.c, "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "onCancellation", "resumeCancellableWith", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "state", "resumeCancelled", "(Ljava/lang/Object;)Z", "resumeUndispatchedWith", "(Ljava/lang/Object;)V", "resumeWith", "takeState$kotlinx_coroutines_core", "()Ljava/lang/Object;", "takeState", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/CancellableContinuation;", "tryReleaseClaimedContinuation", "(Lkotlinx/coroutines/CancellableContinuation;)Ljava/lang/Throwable;", "_state", "Ljava/lang/Object;", "get_state$kotlinx_coroutines_core$annotations", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/Continuation;", "countOrElement", "getDelegate$kotlinx_coroutines_core", "()Lkotlin/coroutines/Continuation;", "delegate", "Lkotlinx/coroutines/CoroutineDispatcher;", "getReusableCancellableContinuation", "reusableCancellableContinuation", "kotlinx-coroutines-core", "Lkotlinx/coroutines/DispatchedTask;"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class l<T> extends j1<T> implements CoroutineStackFrame, Continuation<T> {

    /* renamed from: i  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f29444i = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_reusableCancellableContinuation");
    @NotNull
    private volatile /* synthetic */ Object _reusableCancellableContinuation;
    @JvmField
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public final k.b.p0 f29445e;
    @JvmField
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public final Continuation<T> f29446f;
    @JvmField
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    public Object f29447g;
    @JvmField
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    public final Object f29448h;

    /* JADX WARN: Multi-variable type inference failed */
    public l(@NotNull k.b.p0 p0Var, @NotNull Continuation<? super T> continuation) {
        super(-1);
        this.f29445e = p0Var;
        this.f29446f = continuation;
        this.f29447g = m.a();
        this.f29448h = v0.b(getContext());
        this._reusableCancellableContinuation = null;
    }

    private final k.b.s<?> n() {
        Object obj = this._reusableCancellableContinuation;
        if (obj instanceof k.b.s) {
            return (k.b.s) obj;
        }
        return null;
    }

    public static /* synthetic */ void o() {
    }

    @Override // k.b.j1
    public void c(@Nullable Object obj, @NotNull Throwable th) {
        if (obj instanceof k.b.g0) {
            ((k.b.g0) obj).b.invoke(th);
        }
    }

    @Override // k.b.j1
    @NotNull
    public Continuation<T> d() {
        return this;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.f29446f;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    @NotNull
    public CoroutineContext getContext() {
        return this.f29446f.getContext();
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // k.b.j1
    @Nullable
    public Object j() {
        Object obj = this.f29447g;
        if (k.b.z0.b()) {
            if (!(obj != m.a())) {
                throw new AssertionError();
            }
        }
        this.f29447g = m.a();
        return obj;
    }

    public final void k() {
        do {
        } while (this._reusableCancellableContinuation == m.b);
    }

    @Nullable
    public final k.b.s<T> l() {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            if (obj == null) {
                this._reusableCancellableContinuation = m.b;
                return null;
            } else if (obj instanceof k.b.s) {
                if (f29444i.compareAndSet(this, obj, m.b)) {
                    return (k.b.s) obj;
                }
            } else if (obj != m.b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(Intrinsics.stringPlus("Inconsistent state ", obj).toString());
            }
        }
    }

    public final void m(@NotNull CoroutineContext coroutineContext, T t) {
        this.f29447g = t;
        this.f29410d = 1;
        this.f29445e.r(coroutineContext, this);
    }

    public final boolean p() {
        return this._reusableCancellableContinuation != null;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(@NotNull Object obj) {
        CoroutineContext context = this.f29446f.getContext();
        Object d2 = k.b.l0.d(obj, null, 1, null);
        if (this.f29445e.s(context)) {
            this.f29447g = d2;
            this.f29410d = 0;
            this.f29445e.q(context, this);
            return;
        }
        k.b.z0.b();
        t1 b = u3.f29656a.b();
        if (b.L()) {
            this.f29447g = d2;
            this.f29410d = 0;
            b.E(this);
            return;
        }
        b.I(true);
        try {
            CoroutineContext context2 = getContext();
            Object c = v0.c(context2, this.f29448h);
            this.f29446f.resumeWith(obj);
            Unit unit = Unit.INSTANCE;
            v0.a(context2, c);
            do {
            } while (b.O());
        } finally {
            try {
            } finally {
            }
        }
    }

    public final boolean t(@NotNull Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            q0 q0Var = m.b;
            if (Intrinsics.areEqual(obj, q0Var)) {
                if (f29444i.compareAndSet(this, q0Var, th)) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                if (f29444i.compareAndSet(this, obj, null)) {
                    return false;
                }
            }
        }
    }

    @NotNull
    public String toString() {
        return "DispatchedContinuation[" + this.f29445e + ", " + k.b.a1.c(this.f29446f) + ']';
    }

    public final void u() {
        k();
        k.b.s<?> n2 = n();
        if (n2 == null) {
            return;
        }
        n2.t();
    }

    public final void v(@NotNull Object obj, @Nullable Function1<? super Throwable, Unit> function1) {
        boolean z;
        Object b = k.b.l0.b(obj, function1);
        if (this.f29445e.s(getContext())) {
            this.f29447g = b;
            this.f29410d = 1;
            this.f29445e.q(getContext(), this);
            return;
        }
        k.b.z0.b();
        t1 b2 = u3.f29656a.b();
        if (b2.L()) {
            this.f29447g = b;
            this.f29410d = 1;
            b2.E(this);
            return;
        }
        b2.I(true);
        try {
            n2 n2Var = (n2) getContext().get(n2.v0);
            if (n2Var == null || n2Var.isActive()) {
                z = false;
            } else {
                CancellationException m2 = n2Var.m();
                c(b, m2);
                Result.Companion companion = Result.Companion;
                resumeWith(Result.m57constructorimpl(ResultKt.createFailure(m2)));
                z = true;
            }
            if (!z) {
                Continuation<T> continuation = this.f29446f;
                Object obj2 = this.f29448h;
                CoroutineContext context = continuation.getContext();
                Object c = v0.c(context, obj2);
                b4<?> e2 = c != v0.f29465a ? k.b.o0.e(continuation, context, c) : null;
                this.f29446f.resumeWith(obj);
                Unit unit = Unit.INSTANCE;
                InlineMarker.finallyStart(1);
                if (e2 == null || e2.x1()) {
                    v0.a(context, c);
                }
                InlineMarker.finallyEnd(1);
            }
            do {
            } while (b2.O());
            InlineMarker.finallyStart(1);
        } catch (Throwable th) {
            try {
                i(th, null);
                InlineMarker.finallyStart(1);
            } catch (Throwable th2) {
                InlineMarker.finallyStart(1);
                b2.y(true);
                InlineMarker.finallyEnd(1);
                throw th2;
            }
        }
        b2.y(true);
        InlineMarker.finallyEnd(1);
    }

    public final boolean w(@Nullable Object obj) {
        n2 n2Var = (n2) getContext().get(n2.v0);
        if (n2Var == null || n2Var.isActive()) {
            return false;
        }
        CancellationException m2 = n2Var.m();
        c(obj, m2);
        Result.Companion companion = Result.Companion;
        resumeWith(Result.m57constructorimpl(ResultKt.createFailure(m2)));
        return true;
    }

    public final void x(@NotNull Object obj) {
        Continuation<T> continuation = this.f29446f;
        Object obj2 = this.f29448h;
        CoroutineContext context = continuation.getContext();
        Object c = v0.c(context, obj2);
        b4<?> e2 = c != v0.f29465a ? k.b.o0.e(continuation, context, c) : null;
        try {
            this.f29446f.resumeWith(obj);
            Unit unit = Unit.INSTANCE;
        } finally {
            InlineMarker.finallyStart(1);
            if (e2 == null || e2.x1()) {
                v0.a(context, c);
            }
            InlineMarker.finallyEnd(1);
        }
    }

    @Nullable
    public final Throwable z(@NotNull k.b.r<?> rVar) {
        q0 q0Var;
        do {
            Object obj = this._reusableCancellableContinuation;
            q0Var = m.b;
            if (obj != q0Var) {
                if (obj instanceof Throwable) {
                    if (f29444i.compareAndSet(this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalStateException(Intrinsics.stringPlus("Inconsistent state ", obj).toString());
            }
        } while (!f29444i.compareAndSet(this, q0Var, rVar));
        return null;
    }
}
