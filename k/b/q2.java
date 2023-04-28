package k.b;

import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: JobSupport.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0000\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\f\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0003R\u0014\u0010\u0006\u001a\u00020\u0007X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/JobImpl;", "Lkotlinx/coroutines/JobSupport;", "Lkotlinx/coroutines/CompletableJob;", "parent", "Lkotlinx/coroutines/Job;", "(Lkotlinx/coroutines/Job;)V", "handlesException", "", "getHandlesException$kotlinx_coroutines_core", "()Z", "onCancelComplete", "getOnCancelComplete$kotlinx_coroutines_core", "complete", "completeExceptionally", "exception", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class q2 extends v2 implements d0 {
    private final boolean c;

    public q2(@Nullable n2 n2Var) {
        super(true);
        I0(n2Var);
        this.c = r1();
    }

    private final boolean r1() {
        x E0 = E0();
        y yVar = E0 instanceof y ? (y) E0 : null;
        v2 g0 = yVar == null ? null : yVar.g0();
        if (g0 == null) {
            return false;
        }
        while (!g0.B0()) {
            x E02 = g0.E0();
            y yVar2 = E02 instanceof y ? (y) E02 : null;
            if (yVar2 == null) {
                g0 = null;
                continue;
            } else {
                g0 = yVar2.g0();
                continue;
            }
            if (g0 == null) {
                return false;
            }
        }
        return true;
    }

    @Override // k.b.v2
    public boolean B0() {
        return this.c;
    }

    @Override // k.b.v2
    public boolean C0() {
        return true;
    }

    @Override // k.b.d0
    public boolean complete() {
        return Q0(Unit.INSTANCE);
    }

    @Override // k.b.d0
    public boolean d(@NotNull Throwable th) {
        return Q0(new f0(th, false, 2, null));
    }
}
