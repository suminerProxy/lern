package k.b.i4.a1;

import k.b.i4.j0;
import k.b.i4.t0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: AbstractSharedFlow.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0002\u0010\u0005J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/flow/internal/SubscriptionCountStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lkotlinx/coroutines/flow/SharedFlowImpl;", "initialValue", "(I)V", "value", "getValue", "()Ljava/lang/Integer;", "increment", "", "delta", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class a0 extends j0<Integer> implements t0<Integer> {
    public a0(int i2) {
        super(1, Integer.MAX_VALUE, k.b.g4.m.DROP_OLDEST);
        b(Integer.valueOf(i2));
    }

    @Override // k.b.i4.t0
    @NotNull
    /* renamed from: d0 */
    public Integer getValue() {
        Integer valueOf;
        synchronized (this) {
            valueOf = Integer.valueOf(P().intValue());
        }
        return valueOf;
    }

    public final boolean e0(int i2) {
        boolean b;
        synchronized (this) {
            b = b(Integer.valueOf(P().intValue() + i2));
        }
        return b;
    }
}
