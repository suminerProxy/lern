package k.b.g4;

import androidx.exifinterface.media.ExifInterface;
import k.b.a1;
import k.b.j4.y;
import k.b.z0;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AbstractChannel.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u000f\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0012H\u0016J\u0014\u0010\u0016\u001a\u00020\u00122\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u001f\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00028\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0002\u0010\u001eJ\u0012\u0010\u001f\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e¨\u0006 "}, d2 = {"Lkotlinx/coroutines/channels/Closed;", ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/channels/Send;", "Lkotlinx/coroutines/channels/ReceiveOrClosed;", "closeCause", "", "(Ljava/lang/Throwable;)V", "offerResult", "getOfferResult", "()Lkotlinx/coroutines/channels/Closed;", "pollResult", "getPollResult", "receiveException", "getReceiveException", "()Ljava/lang/Throwable;", "sendException", "getSendException", "completeResumeReceive", "", "value", "(Ljava/lang/Object;)V", "completeResumeSend", "resumeSendClosed", "closed", "toString", "", "tryResumeReceive", "Lkotlinx/coroutines/internal/Symbol;", "otherOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;)Lkotlinx/coroutines/internal/Symbol;", "tryResumeSend", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class w<E> extends l0 implements j0<E> {
    @JvmField
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public final Throwable f29295e;

    public w(@Nullable Throwable th) {
        this.f29295e = th;
    }

    @Override // k.b.g4.l0
    public void f0() {
    }

    @Override // k.b.g4.l0
    public void h0(@NotNull w<?> wVar) {
        if (z0.b()) {
            throw new AssertionError();
        }
    }

    @Override // k.b.g4.l0
    @NotNull
    public k.b.j4.q0 i0(@Nullable y.d dVar) {
        k.b.j4.q0 q0Var = k.b.t.f29646d;
        if (dVar != null) {
            dVar.d();
        }
        return q0Var;
    }

    @Override // k.b.g4.j0
    public void k(E e2) {
    }

    @Override // k.b.g4.j0
    @NotNull
    /* renamed from: k0 */
    public w<E> c() {
        return this;
    }

    @Override // k.b.g4.l0
    @NotNull
    /* renamed from: l0 */
    public w<E> g0() {
        return this;
    }

    @NotNull
    public final Throwable m0() {
        Throwable th = this.f29295e;
        return th == null ? new x(s.f29294a) : th;
    }

    @NotNull
    public final Throwable n0() {
        Throwable th = this.f29295e;
        return th == null ? new y(s.f29294a) : th;
    }

    @Override // k.b.j4.y
    @NotNull
    public String toString() {
        return "Closed@" + a1.b(this) + '[' + this.f29295e + ']';
    }

    @Override // k.b.g4.j0
    @NotNull
    public k.b.j4.q0 v(E e2, @Nullable y.d dVar) {
        k.b.j4.q0 q0Var = k.b.t.f29646d;
        if (dVar != null) {
            dVar.d();
        }
        return q0Var;
    }
}
