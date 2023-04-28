package k.b.g4;

import androidx.exifinterface.media.ExifInterface;
import k.b.a1;
import k.b.j4.y;
import k.b.z0;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AbstractChannel.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\u0014\u0010\f\u001a\u00020\u00062\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0003\u001a\u00028\u0000X\u0096\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\t¨\u0006\u0015"}, d2 = {"Lkotlinx/coroutines/channels/SendElement;", ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/channels/Send;", "pollResult", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "", "(Ljava/lang/Object;Lkotlinx/coroutines/CancellableContinuation;)V", "getPollResult", "()Ljava/lang/Object;", "Ljava/lang/Object;", "completeResumeSend", "resumeSendClosed", "closed", "Lkotlinx/coroutines/channels/Closed;", "toString", "", "tryResumeSend", "Lkotlinx/coroutines/internal/Symbol;", "otherOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class n0<E> extends l0 {

    /* renamed from: e  reason: collision with root package name */
    private final E f29287e;
    @JvmField
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public final k.b.r<Unit> f29288f;

    /* JADX WARN: Multi-variable type inference failed */
    public n0(E e2, @NotNull k.b.r<? super Unit> rVar) {
        this.f29287e = e2;
        this.f29288f = rVar;
    }

    @Override // k.b.g4.l0
    public void f0() {
        this.f29288f.Y(k.b.t.f29646d);
    }

    @Override // k.b.g4.l0
    public E g0() {
        return this.f29287e;
    }

    @Override // k.b.g4.l0
    public void h0(@NotNull w<?> wVar) {
        k.b.r<Unit> rVar = this.f29288f;
        Result.Companion companion = Result.Companion;
        rVar.resumeWith(Result.m57constructorimpl(ResultKt.createFailure(wVar.n0())));
    }

    @Override // k.b.g4.l0
    @Nullable
    public k.b.j4.q0 i0(@Nullable y.d dVar) {
        Object f2 = this.f29288f.f(Unit.INSTANCE, dVar == null ? null : dVar.c);
        if (f2 == null) {
            return null;
        }
        if (z0.b()) {
            if (!(f2 == k.b.t.f29646d)) {
                throw new AssertionError();
            }
        }
        if (dVar != null) {
            dVar.d();
        }
        return k.b.t.f29646d;
    }

    @Override // k.b.j4.y
    @NotNull
    public String toString() {
        return a1.a(this) + '@' + a1.b(this) + '(' + g0() + ')';
    }
}
