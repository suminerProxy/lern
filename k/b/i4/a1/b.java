package k.b.i4.a1;

import androidx.exifinterface.media.ExifInterface;
import com.baidu.platform.comapi.map.MapBundleKey;
import java.util.Arrays;
import k.b.i4.a1.d;
import k.b.i4.t0;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AbstractSharedFlow.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u00060\u0003j\u0002`\u0004B\u0005¢\u0006\u0002\u0010\u0005J\r\u0010\u0018\u001a\u00028\u0000H\u0004¢\u0006\u0002\u0010\u0019J\r\u0010\u001a\u001a\u00028\u0000H$¢\u0006\u0002\u0010\u0019J\u001d\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000e2\u0006\u0010\u001c\u001a\u00020\tH$¢\u0006\u0002\u0010\u001dJ\u001d\u0010\u001e\u001a\u00020\u001f2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001f0!H\u0084\bJ\u0015\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00028\u0000H\u0004¢\u0006\u0002\u0010$R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R:\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u000e2\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u000e@BX\u0084\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u0012\u0004\b\u0010\u0010\u0005\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lkotlinx/coroutines/flow/internal/AbstractSharedFlow;", ExifInterface.LATITUDE_SOUTH, "Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "()V", "_subscriptionCount", "Lkotlinx/coroutines/flow/internal/SubscriptionCountStateFlow;", "<set-?>", "", "nCollectors", "getNCollectors", "()I", "nextIndex", "", "slots", "getSlots$annotations", "getSlots", "()[Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "[Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "subscriptionCount", "Lkotlinx/coroutines/flow/StateFlow;", "getSubscriptionCount", "()Lkotlinx/coroutines/flow/StateFlow;", "allocateSlot", "()Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "createSlot", "createSlotArray", MapBundleKey.OfflineMapKey.OFFLINE_TOTAL_SIZE, "(I)[Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "forEachSlotLocked", "", "block", "Lkotlin/Function1;", "freeSlot", "slot", "(Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public abstract class b<S extends d<?>> {
    @Nullable
    private S[] b;
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private int f29352d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private a0 f29353e;

    public static final /* synthetic */ int e(b bVar) {
        return bVar.c;
    }

    public static final /* synthetic */ d[] f(b bVar) {
        return bVar.b;
    }

    public static /* synthetic */ void o() {
    }

    @NotNull
    public final t0<Integer> c() {
        a0 a0Var;
        synchronized (this) {
            a0Var = this.f29353e;
            if (a0Var == null) {
                a0Var = new a0(m());
                this.f29353e = a0Var;
            }
        }
        return a0Var;
    }

    @NotNull
    public final S h() {
        S s;
        a0 a0Var;
        synchronized (this) {
            S[] n2 = n();
            if (n2 == null) {
                n2 = j(2);
                this.b = n2;
            } else if (m() >= n2.length) {
                Object[] copyOf = Arrays.copyOf(n2, n2.length * 2);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
                this.b = (S[]) ((d[]) copyOf);
                n2 = (S[]) ((d[]) copyOf);
            }
            int i2 = this.f29352d;
            do {
                s = n2[i2];
                if (s == null) {
                    s = i();
                    n2[i2] = s;
                }
                i2++;
                if (i2 >= n2.length) {
                    i2 = 0;
                }
            } while (!s.a(this));
            this.f29352d = i2;
            this.c = m() + 1;
            a0Var = this.f29353e;
        }
        if (a0Var != null) {
            a0Var.e0(1);
        }
        return s;
    }

    @NotNull
    public abstract S i();

    @NotNull
    public abstract S[] j(int i2);

    public final void k(@NotNull Function1<? super S, Unit> function1) {
        d[] dVarArr;
        if (this.c == 0 || (dVarArr = this.b) == null) {
            return;
        }
        int i2 = 0;
        int length = dVarArr.length;
        while (i2 < length) {
            d dVar = dVarArr[i2];
            i2++;
            if (dVar != null) {
                function1.invoke(dVar);
            }
        }
    }

    public final void l(@NotNull S s) {
        a0 a0Var;
        int i2;
        Continuation<Unit>[] b;
        synchronized (this) {
            this.c = m() - 1;
            a0Var = this.f29353e;
            i2 = 0;
            if (m() == 0) {
                this.f29352d = 0;
            }
            b = s.b(this);
        }
        int length = b.length;
        while (i2 < length) {
            Continuation<Unit> continuation = b[i2];
            i2++;
            if (continuation != null) {
                Result.Companion companion = Result.Companion;
                continuation.resumeWith(Result.m57constructorimpl(Unit.INSTANCE));
            }
        }
        if (a0Var == null) {
            return;
        }
        a0Var.e0(-1);
    }

    public final int m() {
        return this.c;
    }

    @Nullable
    public final S[] n() {
        return this.b;
    }
}
