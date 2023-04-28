package k.b.i4;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: StateFlow.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0013B\u0007¢\u0006\u0004\b\u0001\u0010\u0002J\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ)\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\f0\u000b2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0002J\r\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/flow/StateFlowSlot;", "<init>", "()V", "Lkotlinx/coroutines/flow/StateFlowImpl;", "flow", "", "allocateLocked", "(Lkotlinx/coroutines/flow/StateFlowImpl;)Z", "", "awaitPending", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lkotlin/coroutines/Continuation;", "freeLocked", "(Lkotlinx/coroutines/flow/StateFlowImpl;)[Lkotlin/coroutines/Continuation;", "makePending", "takePending", "()Z", "kotlinx-coroutines-core", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class w0 extends k.b.i4.a1.d<u0<?>> {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f29406a = AtomicReferenceFieldUpdater.newUpdater(w0.class, Object.class, "_state");
    @NotNull
    public volatile /* synthetic */ Object _state = null;

    @Override // k.b.i4.a1.d
    /* renamed from: c */
    public boolean a(@NotNull u0<?> u0Var) {
        k.b.j4.q0 q0Var;
        if (this._state != null) {
            return false;
        }
        q0Var = v0.f29404a;
        this._state = q0Var;
        return true;
    }

    @Nullable
    public final Object d(@NotNull Continuation<? super Unit> continuation) {
        k.b.j4.q0 q0Var;
        k.b.j4.q0 q0Var2;
        k.b.s sVar = new k.b.s(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        sVar.P();
        if (!k.b.z0.b() || (!(this._state instanceof k.b.s))) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29406a;
            q0Var = v0.f29404a;
            if (!atomicReferenceFieldUpdater.compareAndSet(this, q0Var, sVar)) {
                if (k.b.z0.b()) {
                    Object obj = this._state;
                    q0Var2 = v0.b;
                    if (!(obj == q0Var2)) {
                        throw new AssertionError();
                    }
                }
                Result.Companion companion = Result.Companion;
                sVar.resumeWith(Result.m57constructorimpl(Unit.INSTANCE));
            }
            Object x = sVar.x();
            if (x == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return x == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? x : Unit.INSTANCE;
        }
        throw new AssertionError();
    }

    @Override // k.b.i4.a1.d
    @NotNull
    /* renamed from: e */
    public Continuation<Unit>[] b(@NotNull u0<?> u0Var) {
        this._state = null;
        return k.b.i4.a1.c.f29355a;
    }

    public final void f() {
        k.b.j4.q0 q0Var;
        k.b.j4.q0 q0Var2;
        k.b.j4.q0 q0Var3;
        k.b.j4.q0 q0Var4;
        while (true) {
            Object obj = this._state;
            if (obj == null) {
                return;
            }
            q0Var = v0.b;
            if (obj == q0Var) {
                return;
            }
            q0Var2 = v0.f29404a;
            if (obj == q0Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29406a;
                q0Var3 = v0.b;
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, q0Var3)) {
                    return;
                }
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f29406a;
                q0Var4 = v0.f29404a;
                if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, q0Var4)) {
                    Result.Companion companion = Result.Companion;
                    ((k.b.s) obj).resumeWith(Result.m57constructorimpl(Unit.INSTANCE));
                    return;
                }
            }
        }
    }

    public final boolean g() {
        k.b.j4.q0 q0Var;
        k.b.j4.q0 q0Var2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29406a;
        q0Var = v0.f29404a;
        Object andSet = atomicReferenceFieldUpdater.getAndSet(this, q0Var);
        Intrinsics.checkNotNull(andSet);
        if (!k.b.z0.b() || (!(andSet instanceof k.b.s))) {
            q0Var2 = v0.b;
            return andSet == q0Var2;
        }
        throw new AssertionError();
    }
}
