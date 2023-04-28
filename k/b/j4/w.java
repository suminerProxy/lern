package k.b.j4;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LockFreeLinkedList.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J-\u0010\u0007\u001a\u00020\b\"\u000e\b\u0000\u0010\t\u0018\u0001*\u00060\u0001j\u0002`\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u00020\b0\fH\u0086\bJ\u0010\u0010\r\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\nH\u0014J\u0006\u0010\u000e\u001a\u00020\u000fJ\r\u0010\u0010\u001a\u00020\bH\u0000¢\u0006\u0002\b\u0011R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0005¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "()V", "isEmpty", "", "()Z", "isRemoved", "forEach", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/internal/Node;", "block", "Lkotlin/Function1;", "nextIfRemoved", "remove", "", com.alipay.sdk.cons.c.f679j, "validate$kotlinx_coroutines_core", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class w extends y {
    @Override // k.b.j4.y
    public boolean U() {
        return false;
    }

    @Override // k.b.j4.y
    @Nullable
    public y W() {
        return null;
    }

    @Override // k.b.j4.y
    public /* bridge */ /* synthetic */ boolean X() {
        return ((Boolean) h0()).booleanValue();
    }

    public final /* synthetic */ <T extends y> void f0(Function1<? super T, Unit> function1) {
        for (y yVar = (y) M(); !Intrinsics.areEqual(yVar, this); yVar = yVar.Q()) {
            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
            if (yVar instanceof y) {
                function1.invoke(yVar);
            }
        }
    }

    public final boolean g0() {
        return M() == this;
    }

    @NotNull
    public final Void h0() {
        throw new IllegalStateException("head cannot be removed".toString());
    }

    public final void i0() {
        y yVar = (y) M();
        y yVar2 = this;
        while (!Intrinsics.areEqual(yVar, this)) {
            y Q = yVar.Q();
            yVar.e0(yVar2, Q);
            yVar2 = yVar;
            yVar = Q;
        }
        e0(yVar2, (y) M());
    }
}
