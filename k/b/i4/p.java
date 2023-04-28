package k.b.i4;

import androidx.exifinterface.media.ExifInterface;
import k.b.i4.a1.r;
import k.b.n2;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Context.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¢\u0006\u0002\b\u0004\u001a(\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tH\u0007\u001a0\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b\u001a\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u0006\u001a\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u0006\u001a$\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u00062\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u000f"}, d2 = {"checkFlowContext", "", "context", "Lkotlin/coroutines/CoroutineContext;", "checkFlowContext$FlowKt__ContextKt", "buffer", "Lkotlinx/coroutines/flow/Flow;", ExifInterface.GPS_DIRECTION_TRUE, "capacity", "", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "cancellable", "conflate", "flowOn", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final /* synthetic */ class p {
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.4.0, binary compatibility with earlier versions")
    public static final /* synthetic */ i a(i iVar, int i2) {
        i d2;
        d2 = d(iVar, i2, null, 2, null);
        return d2;
    }

    @NotNull
    public static final <T> i<T> b(@NotNull i<? extends T> iVar, int i2, @NotNull k.b.g4.m mVar) {
        int i3;
        k.b.g4.m mVar2;
        boolean z = true;
        if (i2 >= 0 || i2 == -2 || i2 == -1) {
            if (i2 == -1 && mVar != k.b.g4.m.SUSPEND) {
                z = false;
            }
            if (z) {
                if (i2 == -1) {
                    mVar2 = k.b.g4.m.DROP_OLDEST;
                    i3 = 0;
                } else {
                    i3 = i2;
                    mVar2 = mVar;
                }
                return iVar instanceof k.b.i4.a1.r ? r.a.a((k.b.i4.a1.r) iVar, null, i3, mVar2, 1, null) : new k.b.i4.a1.i(iVar, null, i3, mVar2, 2, null);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
        throw new IllegalArgumentException(Intrinsics.stringPlus("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ", Integer.valueOf(i2)).toString());
    }

    public static /* synthetic */ i c(i iVar, int i2, int i3, Object obj) {
        i a2;
        if ((i3 & 1) != 0) {
            i2 = -2;
        }
        a2 = a(iVar, i2);
        return a2;
    }

    public static /* synthetic */ i d(i iVar, int i2, k.b.g4.m mVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = -2;
        }
        if ((i3 & 2) != 0) {
            mVar = k.b.g4.m.SUSPEND;
        }
        return k.o(iVar, i2, mVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> i<T> e(@NotNull i<? extends T> iVar) {
        return iVar instanceof c ? iVar : new d(iVar);
    }

    private static final void f(CoroutineContext coroutineContext) {
        if (!(coroutineContext.get(n2.v0) == null)) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("Flow context cannot contain job in it. Had ", coroutineContext).toString());
        }
    }

    @NotNull
    public static final <T> i<T> g(@NotNull i<? extends T> iVar) {
        i<T> d2;
        d2 = d(iVar, -1, null, 2, null);
        return d2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> i<T> h(@NotNull i<? extends T> iVar, @NotNull CoroutineContext coroutineContext) {
        f(coroutineContext);
        return Intrinsics.areEqual(coroutineContext, EmptyCoroutineContext.INSTANCE) ? iVar : iVar instanceof k.b.i4.a1.r ? r.a.a((k.b.i4.a1.r) iVar, coroutineContext, 0, null, 6, null) : new k.b.i4.a1.i(iVar, coroutineContext, 0, null, 12, null);
    }
}
