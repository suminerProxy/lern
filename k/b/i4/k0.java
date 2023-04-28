package k.b.i4;

import androidx.exifinterface.media.ExifInterface;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.baidu.platform.comapi.map.MapController;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: SharedFlow.kt */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a0\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0000\u0010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b\u001a6\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00060\r\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00060\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0000\u001a#\u0010\u0012\u001a\u0004\u0018\u00010\u0013*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002¢\u0006\u0002\u0010\u0017\u001a+\u0010\u0018\u001a\u00020\u0019*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0002\u0010\u001b\"\u0016\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003¨\u0006\u001c"}, d2 = {"NO_VALUE", "Lkotlinx/coroutines/internal/Symbol;", "getNO_VALUE$annotations", "()V", "MutableSharedFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", ExifInterface.GPS_DIRECTION_TRUE, "replay", "", "extraBufferCapacity", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "fuseSharedFlow", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/SharedFlow;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "getBufferAt", "", "", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "", "([Ljava/lang/Object;J)Ljava/lang/Object;", "setBufferAt", "", MapController.ITEM_LAYER_TAG, "([Ljava/lang/Object;JLjava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class k0 {
    @JvmField
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final k.b.j4.q0 f29393a = new k.b.j4.q0("NO_VALUE");

    @NotNull
    public static final <T> d0<T> a(int i2, int i3, @NotNull k.b.g4.m mVar) {
        boolean z = true;
        if (i2 >= 0) {
            if (i3 >= 0) {
                if (i2 <= 0 && i3 <= 0 && mVar != k.b.g4.m.SUSPEND) {
                    z = false;
                }
                if (z) {
                    int i4 = i3 + i2;
                    if (i4 < 0) {
                        i4 = Integer.MAX_VALUE;
                    }
                    return new j0(i2, i4, mVar);
                }
                throw new IllegalArgumentException(Intrinsics.stringPlus("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ", mVar).toString());
            }
            throw new IllegalArgumentException(Intrinsics.stringPlus("extraBufferCapacity cannot be negative, but was ", Integer.valueOf(i3)).toString());
        }
        throw new IllegalArgumentException(Intrinsics.stringPlus("replay cannot be negative, but was ", Integer.valueOf(i2)).toString());
    }

    public static /* synthetic */ d0 b(int i2, int i3, k.b.g4.m mVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        if ((i4 & 4) != 0) {
            mVar = k.b.g4.m.SUSPEND;
        }
        return a(i2, i3, mVar);
    }

    public static final /* synthetic */ Object c(Object[] objArr, long j2) {
        return f(objArr, j2);
    }

    public static final /* synthetic */ void d(Object[] objArr, long j2, Object obj) {
        h(objArr, j2, obj);
    }

    @NotNull
    public static final <T> i<T> e(@NotNull i0<? extends T> i0Var, @NotNull CoroutineContext coroutineContext, int i2, @NotNull k.b.g4.m mVar) {
        return ((i2 == 0 || i2 == -3) && mVar == k.b.g4.m.SUSPEND) ? i0Var : new k.b.i4.a1.i(i0Var, coroutineContext, i2, mVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object f(Object[] objArr, long j2) {
        return objArr[((int) j2) & (objArr.length - 1)];
    }

    public static /* synthetic */ void g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(Object[] objArr, long j2, Object obj) {
        objArr[((int) j2) & (objArr.length - 1)] = obj;
    }
}
