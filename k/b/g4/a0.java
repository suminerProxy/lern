package k.b.g4;

import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.locks.ReentrantLock;
import k.b.g4.c;
import k.b.j4.c1;
import k.b.z0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ConflatedChannel.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B'\u0012 \u0010\u0003\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\u0018\u001a\u00020\r2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0014J\u0015\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u001dJ!\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00028\u00002\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030 H\u0014¢\u0006\u0002\u0010!J\u0010\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\rH\u0014J\n\u0010$\u001a\u0004\u0018\u00010\u0017H\u0014J\u0016\u0010%\u001a\u0004\u0018\u00010\u00172\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030 H\u0014J\u0014\u0010&\u001a\u0004\u0018\u00010'2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0017H\u0002R\u0014\u0010\b\u001a\u00020\t8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\r8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\r8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\r8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u0012\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lkotlinx/coroutines/channels/ConflatedChannel;", ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/channels/AbstractChannel;", "onUndeliveredElement", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "(Lkotlin/jvm/functions/Function1;)V", "bufferDebugString", "", "getBufferDebugString", "()Ljava/lang/String;", "isBufferAlwaysEmpty", "", "()Z", "isBufferAlwaysFull", "isBufferEmpty", "isBufferFull", "isEmpty", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "value", "", "enqueueReceiveInternal", "receive", "Lkotlinx/coroutines/channels/Receive;", "offerInternal", "element", "(Ljava/lang/Object;)Ljava/lang/Object;", "offerSelectInternal", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;)Ljava/lang/Object;", "onCancelIdempotent", "wasClosed", "pollInternal", "pollSelectInternal", "updateValueLocked", "Lkotlinx/coroutines/internal/UndeliveredElementException;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class a0<E> extends a<E> {
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private final ReentrantLock f29249e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private Object f29250f;

    public a0(@Nullable Function1<? super E, Unit> function1) {
        super(function1);
        this.f29249e = new ReentrantLock();
        this.f29250f = b.c;
    }

    private final c1 s0(Object obj) {
        Function1<E, Unit> function1;
        Object obj2 = this.f29250f;
        c1 c1Var = null;
        if (obj2 != b.c && (function1 = this.b) != null) {
            c1Var = k.b.j4.i0.d(function1, obj2, null, 2, null);
        }
        this.f29250f = obj;
        return c1Var;
    }

    @Override // k.b.g4.c
    @NotNull
    public Object C(E e2) {
        j0<E> P;
        k.b.j4.q0 v;
        ReentrantLock reentrantLock = this.f29249e;
        reentrantLock.lock();
        try {
            w<?> o2 = o();
            if (o2 == null) {
                if (this.f29250f == b.c) {
                    do {
                        P = P();
                        if (P != null) {
                            if (P instanceof w) {
                                return P;
                            }
                            v = P.v(e2, null);
                        }
                    } while (v == null);
                    if (z0.b()) {
                        if (!(v == k.b.t.f29646d)) {
                            throw new AssertionError();
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                    reentrantLock.unlock();
                    P.k(e2);
                    return P.c();
                }
                c1 s0 = s0(e2);
                if (s0 == null) {
                    return b.f29252d;
                }
                throw s0;
            }
            return o2;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // k.b.g4.c
    @NotNull
    public Object E(E e2, @NotNull k.b.o4.f<?> fVar) {
        ReentrantLock reentrantLock = this.f29249e;
        reentrantLock.lock();
        try {
            w<?> o2 = o();
            if (o2 == null) {
                if (this.f29250f == b.c) {
                    while (true) {
                        c.d<E> k2 = k(e2);
                        Object u = fVar.u(k2);
                        if (u == null) {
                            j0<? super E> o3 = k2.o();
                            Unit unit = Unit.INSTANCE;
                            reentrantLock.unlock();
                            Intrinsics.checkNotNull(o3);
                            j0<? super E> j0Var = o3;
                            j0Var.k(e2);
                            return j0Var.c();
                        } else if (u == b.f29253e) {
                            break;
                        } else if (u != k.b.j4.c.b) {
                            if (u != k.b.o4.g.d() && !(u instanceof w)) {
                                throw new IllegalStateException(Intrinsics.stringPlus("performAtomicTrySelect(describeTryOffer) returned ", u).toString());
                            }
                            return u;
                        }
                    }
                }
                if (!fVar.o()) {
                    return k.b.o4.g.d();
                }
                c1 s0 = s0(e2);
                if (s0 == null) {
                    return b.f29252d;
                }
                throw s0;
            }
            return o2;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // k.b.g4.a
    public boolean c0(@NotNull h0<? super E> h0Var) {
        ReentrantLock reentrantLock = this.f29249e;
        reentrantLock.lock();
        try {
            return super.c0(h0Var);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // k.b.g4.a
    public final boolean f0() {
        return false;
    }

    @Override // k.b.g4.a
    public final boolean g0() {
        return this.f29250f == b.c;
    }

    @Override // k.b.g4.a
    public void i0(boolean z) {
        ReentrantLock reentrantLock = this.f29249e;
        reentrantLock.lock();
        try {
            c1 s0 = s0(b.c);
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            super.i0(z);
            if (s0 != null) {
                throw s0;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // k.b.g4.a, k.b.g4.i0
    public boolean isEmpty() {
        ReentrantLock reentrantLock = this.f29249e;
        reentrantLock.lock();
        try {
            return h0();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // k.b.g4.c
    @NotNull
    public String m() {
        return "(value=" + this.f29250f + ')';
    }

    @Override // k.b.g4.a
    @Nullable
    public Object m0() {
        ReentrantLock reentrantLock = this.f29249e;
        reentrantLock.lock();
        try {
            Object obj = this.f29250f;
            k.b.j4.q0 q0Var = b.c;
            if (obj != q0Var) {
                this.f29250f = q0Var;
                Unit unit = Unit.INSTANCE;
                return obj;
            }
            Object o2 = o();
            if (o2 == null) {
                o2 = b.f29254f;
            }
            return o2;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // k.b.g4.a
    @Nullable
    public Object n0(@NotNull k.b.o4.f<?> fVar) {
        ReentrantLock reentrantLock = this.f29249e;
        reentrantLock.lock();
        try {
            Object obj = this.f29250f;
            k.b.j4.q0 q0Var = b.c;
            if (obj == q0Var) {
                Object o2 = o();
                if (o2 == null) {
                    o2 = b.f29254f;
                }
                return o2;
            } else if (!fVar.o()) {
                return k.b.o4.g.d();
            } else {
                Object obj2 = this.f29250f;
                this.f29250f = q0Var;
                Unit unit = Unit.INSTANCE;
                return obj2;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // k.b.g4.c
    public final boolean y() {
        return false;
    }

    @Override // k.b.g4.c
    public final boolean z() {
        return false;
    }
}
