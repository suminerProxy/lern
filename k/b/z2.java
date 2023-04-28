package k.b;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MainCoroutineDispatcher.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0005R\u0012\u0010\u0003\u001a\u00020\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/MainCoroutineDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "()V", "immediate", "getImmediate", "()Lkotlinx/coroutines/MainCoroutineDispatcher;", "limitedParallelism", "parallelism", "", "toString", "", "toStringInternalImpl", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public abstract class z2 extends p0 {
    @i2
    @Nullable
    public final String B() {
        z2 z2Var;
        z2 e2 = m1.e();
        if (this == e2) {
            return "Dispatchers.Main";
        }
        try {
            z2Var = e2.y();
        } catch (UnsupportedOperationException unused) {
            z2Var = null;
        }
        if (this == z2Var) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override // k.b.p0
    @NotNull
    public p0 t(int i2) {
        k.b.j4.t.a(i2);
        return this;
    }

    @Override // k.b.p0
    @NotNull
    public String toString() {
        String B = B();
        if (B == null) {
            return a1.a(this) + '@' + a1.b(this);
        }
        return B;
    }

    @NotNull
    public abstract z2 y();
}
