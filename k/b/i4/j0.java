package k.b.i4;

import androidx.exifinterface.media.ExifInterface;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.baidu.platform.comapi.map.MapController;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.sobot.network.http.model.SobotProgress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import k.b.p1;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SharedFlow.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00042\b\u0012\u0004\u0012\u0002H\u00010\u00052\b\u0012\u0004\u0012\u0002H\u00010\u0006:\u0001hB\u001d\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0019\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010.J\u0010\u0010/\u001a\u00020,2\u0006\u00100\u001a\u000201H\u0002J\b\u00102\u001a\u00020,H\u0002J\u001f\u00103\u001a\u0002042\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u000006H\u0096@ø\u0001\u0000¢\u0006\u0002\u00107J\u0010\u00108\u001a\u00020,2\u0006\u00109\u001a\u00020\u0012H\u0002J\b\u0010:\u001a\u00020\u0003H\u0014J\u001d\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000e2\u0006\u0010<\u001a\u00020\bH\u0014¢\u0006\u0002\u0010=J\b\u0010>\u001a\u00020,H\u0002J\u0019\u0010?\u001a\u00020,2\u0006\u0010@\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010AJ\u0019\u0010B\u001a\u00020,2\u0006\u0010@\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010AJ\u0012\u0010C\u001a\u00020,2\b\u0010D\u001a\u0004\u0018\u00010\u000fH\u0002J1\u0010E\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020,\u0018\u00010F0\u000e2\u0014\u0010G\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020,\u0018\u00010F0\u000eH\u0002¢\u0006\u0002\u0010HJ&\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000J2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010N\u001a\u0004\u0018\u00010\u000f2\u0006\u0010O\u001a\u00020\u0012H\u0002J7\u0010P\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e2\u0010\u0010Q\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000e2\u0006\u0010R\u001a\u00020\b2\u0006\u0010S\u001a\u00020\bH\u0002¢\u0006\u0002\u0010TJ\b\u0010U\u001a\u00020,H\u0016J\u0015\u0010V\u001a\u00020W2\u0006\u0010@\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010XJ\u0015\u0010Y\u001a\u00020W2\u0006\u0010@\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010XJ\u0015\u0010Z\u001a\u00020W2\u0006\u0010@\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010XJ\u0010\u0010[\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u0003H\u0002J\u0012\u0010\\\u001a\u0004\u0018\u00010\u000f2\u0006\u0010-\u001a\u00020\u0003H\u0002J(\u0010]\u001a\u00020,2\u0006\u0010^\u001a\u00020\u00122\u0006\u0010_\u001a\u00020\u00122\u0006\u0010`\u001a\u00020\u00122\u0006\u0010a\u001a\u00020\u0012H\u0002J%\u0010b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020,\u0018\u00010F0\u000e2\u0006\u0010c\u001a\u00020\u0012H\u0000¢\u0006\u0004\bd\u0010eJ\r\u0010f\u001a\u00020\u0012H\u0000¢\u0006\u0002\bgR\u001a\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0010R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0018\u001a\u00028\u00008DX\u0084\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0014R\u000e\u0010 \u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u000e\u0010%\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010(\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006i"}, d2 = {"Lkotlinx/coroutines/flow/SharedFlowImpl;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/internal/AbstractSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlowSlot;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/CancellableFlow;", "Lkotlinx/coroutines/flow/internal/FusibleFlow;", "replay", "", "bufferCapacity", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "(IILkotlinx/coroutines/channels/BufferOverflow;)V", "buffer", "", "", "[Ljava/lang/Object;", "bufferEndIndex", "", "getBufferEndIndex", "()J", "bufferSize", TtmlNode.TAG_HEAD, "getHead", "lastReplayedLocked", "getLastReplayedLocked$annotations", "()V", "getLastReplayedLocked", "()Ljava/lang/Object;", "minCollectorIndex", "queueEndIndex", "getQueueEndIndex", "queueSize", "replayCache", "", "getReplayCache", "()Ljava/util/List;", "replayIndex", "replaySize", "getReplaySize", "()I", SobotProgress.TOTAL_SIZE, "getTotalSize", "awaitValue", "", "slot", "(Lkotlinx/coroutines/flow/SharedFlowSlot;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelEmitter", "emitter", "Lkotlinx/coroutines/flow/SharedFlowImpl$Emitter;", "cleanupTailLocked", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "correctCollectorIndexesOnDropOldest", "newHead", "createSlot", "createSlotArray", MapBundleKey.OfflineMapKey.OFFLINE_TOTAL_SIZE, "(I)[Lkotlinx/coroutines/flow/SharedFlowSlot;", "dropOldestLocked", "emit", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emitSuspend", "enqueueLocked", MapController.ITEM_LAYER_TAG, "findSlotsToResumeLocked", "Lkotlin/coroutines/Continuation;", "resumesIn", "([Lkotlin/coroutines/Continuation;)[Lkotlin/coroutines/Continuation;", "fuse", "Lkotlinx/coroutines/flow/Flow;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "getPeekedValueLockedAt", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "growBuffer", "curBuffer", "curSize", "newSize", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "resetReplayCache", "tryEmit", "", "(Ljava/lang/Object;)Z", "tryEmitLocked", "tryEmitNoCollectorsLocked", "tryPeekLocked", "tryTakeValue", "updateBufferLocked", "newReplayIndex", "newMinCollectorIndex", "newBufferEndIndex", "newQueueEndIndex", "updateCollectorIndexLocked", "oldIndex", "updateCollectorIndexLocked$kotlinx_coroutines_core", "(J)[Lkotlin/coroutines/Continuation;", "updateNewCollectorIndexLocked", "updateNewCollectorIndexLocked$kotlinx_coroutines_core", "Emitter", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class j0<T> extends k.b.i4.a1.b<l0> implements d0<T>, k.b.i4.c<T>, k.b.i4.a1.r<T> {

    /* renamed from: f  reason: collision with root package name */
    private final int f29381f;

    /* renamed from: g  reason: collision with root package name */
    private final int f29382g;
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    private final k.b.g4.m f29383h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private Object[] f29384i;

    /* renamed from: j  reason: collision with root package name */
    private long f29385j;

    /* renamed from: k  reason: collision with root package name */
    private long f29386k;

    /* renamed from: l  reason: collision with root package name */
    private int f29387l;

    /* renamed from: m  reason: collision with root package name */
    private int f29388m;

    /* compiled from: SharedFlow.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B1\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\nH\u0016R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/flow/SharedFlowImpl$Emitter;", "Lkotlinx/coroutines/DisposableHandle;", "flow", "Lkotlinx/coroutines/flow/SharedFlowImpl;", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "", "value", "", "cont", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/flow/SharedFlowImpl;JLjava/lang/Object;Lkotlin/coroutines/Continuation;)V", "dispose", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a implements p1 {
        @JvmField
        @NotNull
        public final j0<?> b;
        @JvmField
        public long c;
        @JvmField
        @Nullable

        /* renamed from: d  reason: collision with root package name */
        public final Object f29389d;
        @JvmField
        @NotNull

        /* renamed from: e  reason: collision with root package name */
        public final Continuation<Unit> f29390e;

        public a(@NotNull j0<?> j0Var, long j2, @Nullable Object obj, @NotNull Continuation<? super Unit> continuation) {
        }

        @Override // k.b.p1
        public void dispose() {
        }
    }

    /* compiled from: SharedFlow.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f29391a = null;
    }

    /* compiled from: SharedFlow.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {362, 369, 372}, m = "collect$suspendImpl", n = {"this", "collector", "slot", "this", "collector", "slot", "collectorJob", "this", "collector", "slot", "collectorJob"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class c extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;
        public final /* synthetic */ j0<T> this$0;

        public c(j0<T> j0Var, Continuation<? super c> continuation) {
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
        }
    }

    public j0(int i2, int i3, @NotNull k.b.g4.m mVar) {
        this.f29381f = i2;
        this.f29382g = i3;
        this.f29383h = mVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object B(l0 l0Var, Continuation<? super Unit> continuation) {
        Unit unit;
        k.b.s sVar = new k.b.s(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        sVar.P();
        synchronized (this) {
            if (Y(l0Var) < 0) {
                l0Var.b = sVar;
                l0Var.b = sVar;
            } else {
                Result.Companion companion = Result.Companion;
                sVar.resumeWith(Result.m57constructorimpl(Unit.INSTANCE));
            }
            unit = Unit.INSTANCE;
        }
        Object x = sVar.x();
        if (x == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return x == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? x : unit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(a aVar) {
        synchronized (this) {
            if (aVar.c < O()) {
                return;
            }
            Object[] objArr = this.f29384i;
            Intrinsics.checkNotNull(objArr);
            if (k0.c(objArr, aVar.c) != aVar) {
                return;
            }
            k0.d(objArr, aVar.c, k0.f29393a);
            D();
            Unit unit = Unit.INSTANCE;
        }
    }

    private final void D() {
        if (this.f29382g != 0 || this.f29388m > 1) {
            Object[] objArr = this.f29384i;
            Intrinsics.checkNotNull(objArr);
            while (this.f29388m > 0 && k0.c(objArr, (O() + U()) - 1) == k0.f29393a) {
                this.f29388m--;
                k0.d(objArr, O() + U(), null);
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(3:(6:(1:(1:11)(2:42|43))(1:44)|12|13|14|15|(3:16|(4:26|(1:28)(1:34)|29|(2:31|32)(1:33))(3:18|19|(2:21|22)(1:24))|25))(4:45|46|47|48)|38|39)(5:54|55|56|(2:58|(1:60))|62)|49|50|15|(3:16|(0)(0)|25)))|65|6|(0)(0)|49|50|15|(3:16|(0)(0)|25)) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d3, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d4, code lost:
        r5 = r8;
        r8 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ab A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object E(k.b.i4.j0 r8, k.b.i4.j r9, kotlin.coroutines.Continuation r10) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k.b.i4.j0.E(k.b.i4.j0, k.b.i4.j, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void F(long j2) {
        k.b.i4.a1.d[] f2;
        if (k.b.i4.a1.b.e(this) != 0 && (f2 = k.b.i4.a1.b.f(this)) != null) {
            int i2 = 0;
            int length = f2.length;
            while (i2 < length) {
                k.b.i4.a1.d dVar = f2[i2];
                i2++;
                if (dVar != null) {
                    l0 l0Var = (l0) dVar;
                    long j3 = l0Var.f29394a;
                    if (j3 >= 0 && j3 < j2) {
                        l0Var.f29394a = j2;
                    }
                }
            }
        }
        this.f29386k = j2;
    }

    private final void I() {
        Object[] objArr = this.f29384i;
        Intrinsics.checkNotNull(objArr);
        k0.d(objArr, O(), null);
        this.f29387l--;
        long O = O() + 1;
        if (this.f29385j < O) {
            this.f29385j = O;
        }
        if (this.f29386k < O) {
            F(O);
        }
        if (k.b.z0.b()) {
            if (!(O() == O)) {
                throw new AssertionError();
            }
        }
    }

    public static /* synthetic */ Object J(j0 j0Var, Object obj, Continuation continuation) {
        Object K;
        return (!j0Var.b(obj) && (K = j0Var.K(obj, continuation)) == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? K : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object K(T t, Continuation<? super Unit> continuation) {
        Continuation<Unit>[] continuationArr;
        a aVar;
        k.b.s sVar = new k.b.s(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        sVar.P();
        Continuation<Unit>[] continuationArr2 = k.b.i4.a1.c.f29355a;
        synchronized (this) {
            if (W(t)) {
                Result.Companion companion = Result.Companion;
                sVar.resumeWith(Result.m57constructorimpl(Unit.INSTANCE));
                continuationArr = M(continuationArr2);
                aVar = null;
            } else {
                a aVar2 = new a(this, U() + O(), t, sVar);
                L(aVar2);
                this.f29388m++;
                if (this.f29382g == 0) {
                    continuationArr2 = M(continuationArr2);
                }
                continuationArr = continuationArr2;
                aVar = aVar2;
            }
        }
        if (aVar != null) {
            k.b.u.a(sVar, aVar);
        }
        int i2 = 0;
        int length = continuationArr.length;
        while (i2 < length) {
            Continuation<Unit> continuation2 = continuationArr[i2];
            i2++;
            if (continuation2 != null) {
                Result.Companion companion2 = Result.Companion;
                continuation2.resumeWith(Result.m57constructorimpl(Unit.INSTANCE));
            }
        }
        Object x = sVar.x();
        if (x == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return x == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? x : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(Object obj) {
        int U = U();
        Object[] objArr = this.f29384i;
        if (objArr == null) {
            objArr = V(null, 0, 2);
        } else if (U >= objArr.length) {
            objArr = V(objArr, U, objArr.length * 2);
        }
        k0.d(objArr, O() + U, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object[], java.lang.Object] */
    public final Continuation<Unit>[] M(Continuation<Unit>[] continuationArr) {
        k.b.i4.a1.d[] f2;
        l0 l0Var;
        Continuation<? super Unit> continuation;
        int length = continuationArr.length;
        if (k.b.i4.a1.b.e(this) != 0 && (f2 = k.b.i4.a1.b.f(this)) != null) {
            int i2 = 0;
            int length2 = f2.length;
            while (i2 < length2) {
                k.b.i4.a1.d dVar = f2[i2];
                i2++;
                if (dVar != null && (continuation = (l0Var = (l0) dVar).b) != null && Y(l0Var) >= 0) {
                    int length3 = continuationArr.length;
                    continuationArr = continuationArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(continuationArr, Math.max(2, continuationArr.length * 2));
                        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
                        continuationArr = copyOf;
                    }
                    continuationArr[length] = continuation;
                    l0Var.b = null;
                    length++;
                }
            }
        }
        return continuationArr;
    }

    private final long N() {
        return O() + this.f29387l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long O() {
        return Math.min(this.f29386k, this.f29385j);
    }

    public static /* synthetic */ void Q() {
    }

    private final Object R(long j2) {
        Object[] objArr = this.f29384i;
        Intrinsics.checkNotNull(objArr);
        Object c2 = k0.c(objArr, j2);
        return c2 instanceof a ? ((a) c2).f29389d : c2;
    }

    private final long S() {
        return O() + this.f29387l + this.f29388m;
    }

    private final int T() {
        return (int) ((O() + this.f29387l) - this.f29385j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int U() {
        return this.f29387l + this.f29388m;
    }

    private final Object[] V(Object[] objArr, int i2, int i3) {
        if (i3 > 0) {
            Object[] objArr2 = new Object[i3];
            this.f29384i = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long O = O();
            for (int i4 = 0; i4 < i2; i4++) {
                long j2 = i4 + O;
                k0.d(objArr2, j2, k0.c(objArr, j2));
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean W(T t) {
        if (m() == 0) {
            return X(t);
        }
        if (this.f29387l >= this.f29382g && this.f29386k <= this.f29385j) {
            int i2 = b.f29391a[this.f29383h.ordinal()];
            if (i2 == 1) {
                return false;
            }
            if (i2 == 2) {
                return true;
            }
        }
        L(t);
        int i3 = this.f29387l + 1;
        this.f29387l = i3;
        if (i3 > this.f29382g) {
            I();
        }
        if (T() > this.f29381f) {
            a0(this.f29385j + 1, this.f29386k, N(), S());
        }
        return true;
    }

    private final boolean X(T t) {
        if (k.b.z0.b()) {
            if (!(m() == 0)) {
                throw new AssertionError();
            }
        }
        if (this.f29381f == 0) {
            return true;
        }
        L(t);
        int i2 = this.f29387l + 1;
        this.f29387l = i2;
        if (i2 > this.f29381f) {
            I();
        }
        this.f29386k = O() + this.f29387l;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long Y(l0 l0Var) {
        long j2 = l0Var.f29394a;
        if (j2 < N()) {
            return j2;
        }
        if (this.f29382g <= 0 && j2 <= O() && this.f29388m != 0) {
            return j2;
        }
        return -1L;
    }

    private final Object Z(l0 l0Var) {
        Object obj;
        Continuation<Unit>[] continuationArr = k.b.i4.a1.c.f29355a;
        synchronized (this) {
            long Y = Y(l0Var);
            if (Y < 0) {
                obj = k0.f29393a;
            } else {
                long j2 = l0Var.f29394a;
                Object R = R(Y);
                l0Var.f29394a = Y + 1;
                continuationArr = b0(j2);
                obj = R;
            }
        }
        int i2 = 0;
        int length = continuationArr.length;
        while (i2 < length) {
            Continuation<Unit> continuation = continuationArr[i2];
            i2++;
            if (continuation != null) {
                Result.Companion companion = Result.Companion;
                continuation.resumeWith(Result.m57constructorimpl(Unit.INSTANCE));
            }
        }
        return obj;
    }

    private final void a0(long j2, long j3, long j4, long j5) {
        long min = Math.min(j3, j2);
        if (k.b.z0.b()) {
            if (!(min >= O())) {
                throw new AssertionError();
            }
        }
        for (long O = O(); O < min; O = 1 + O) {
            Object[] objArr = this.f29384i;
            Intrinsics.checkNotNull(objArr);
            k0.d(objArr, O, null);
        }
        this.f29385j = j2;
        this.f29386k = j3;
        this.f29387l = (int) (j4 - min);
        this.f29388m = (int) (j5 - j4);
        if (k.b.z0.b()) {
            if (!(this.f29387l >= 0)) {
                throw new AssertionError();
            }
        }
        if (k.b.z0.b()) {
            if (!(this.f29388m >= 0)) {
                throw new AssertionError();
            }
        }
        if (k.b.z0.b()) {
            if (!(this.f29385j <= O() + ((long) this.f29387l))) {
                throw new AssertionError();
            }
        }
    }

    @Override // k.b.i4.a1.b
    @NotNull
    /* renamed from: G */
    public l0 i() {
        return new l0();
    }

    @Override // k.b.i4.a1.b
    @NotNull
    /* renamed from: H */
    public l0[] j(int i2) {
        return new l0[i2];
    }

    public final T P() {
        Object[] objArr = this.f29384i;
        Intrinsics.checkNotNull(objArr);
        return (T) k0.c(objArr, (this.f29385j + T()) - 1);
    }

    @Override // k.b.i4.a1.r
    @NotNull
    public i<T> a(@NotNull CoroutineContext coroutineContext, int i2, @NotNull k.b.g4.m mVar) {
        return k0.e(this, coroutineContext, i2, mVar);
    }

    @Override // k.b.i4.d0
    public boolean b(T t) {
        int i2;
        boolean z;
        Continuation<Unit>[] continuationArr = k.b.i4.a1.c.f29355a;
        synchronized (this) {
            i2 = 0;
            if (W(t)) {
                continuationArr = M(continuationArr);
                z = true;
            } else {
                z = false;
            }
        }
        int length = continuationArr.length;
        while (i2 < length) {
            Continuation<Unit> continuation = continuationArr[i2];
            i2++;
            if (continuation != null) {
                Result.Companion companion = Result.Companion;
                continuation.resumeWith(Result.m57constructorimpl(Unit.INSTANCE));
            }
        }
        return z;
    }

    @NotNull
    public final Continuation<Unit>[] b0(long j2) {
        int i2;
        long j3;
        k.b.i4.a1.d[] f2;
        if (k.b.z0.b()) {
            if (!(j2 >= this.f29386k)) {
                throw new AssertionError();
            }
        }
        if (j2 > this.f29386k) {
            return k.b.i4.a1.c.f29355a;
        }
        long O = O();
        long j4 = this.f29387l + O;
        long j5 = 1;
        if (this.f29382g == 0 && this.f29388m > 0) {
            j4++;
        }
        if (k.b.i4.a1.b.e(this) != 0 && (f2 = k.b.i4.a1.b.f(this)) != null) {
            int length = f2.length;
            int i3 = 0;
            while (i3 < length) {
                k.b.i4.a1.d dVar = f2[i3];
                i3++;
                if (dVar != null) {
                    long j6 = ((l0) dVar).f29394a;
                    if (j6 >= 0 && j6 < j4) {
                        j4 = j6;
                    }
                }
            }
        }
        if (k.b.z0.b()) {
            if (!(j4 >= this.f29386k)) {
                throw new AssertionError();
            }
        }
        if (j4 <= this.f29386k) {
            return k.b.i4.a1.c.f29355a;
        }
        long N = N();
        if (m() > 0) {
            i2 = Math.min(this.f29388m, this.f29382g - ((int) (N - j4)));
        } else {
            i2 = this.f29388m;
        }
        Continuation<Unit>[] continuationArr = k.b.i4.a1.c.f29355a;
        long j7 = this.f29388m + N;
        if (i2 > 0) {
            continuationArr = new Continuation[i2];
            Object[] objArr = this.f29384i;
            Intrinsics.checkNotNull(objArr);
            long j8 = N;
            int i4 = 0;
            while (true) {
                if (N >= j7) {
                    j3 = j4;
                    break;
                }
                long j9 = N + j5;
                Object c2 = k0.c(objArr, N);
                k.b.j4.q0 q0Var = k0.f29393a;
                if (c2 != q0Var) {
                    j3 = j4;
                    Objects.requireNonNull(c2, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    a aVar = (a) c2;
                    int i5 = i4 + 1;
                    continuationArr[i4] = aVar.f29390e;
                    k0.d(objArr, N, q0Var);
                    k0.d(objArr, j8, aVar.f29389d);
                    j8++;
                    if (i5 >= i2) {
                        break;
                    }
                    i4 = i5;
                    N = j9;
                    j4 = j3;
                } else {
                    N = j9;
                }
                j5 = 1;
            }
            N = j8;
        } else {
            j3 = j4;
        }
        int i6 = (int) (N - O);
        long j10 = m() == 0 ? N : j3;
        long max = Math.max(this.f29385j, N - Math.min(this.f29381f, i6));
        if (this.f29382g == 0 && max < j7) {
            Object[] objArr2 = this.f29384i;
            Intrinsics.checkNotNull(objArr2);
            if (Intrinsics.areEqual(k0.c(objArr2, max), k0.f29393a)) {
                N++;
                max++;
            }
        }
        a0(max, j10, N, j7);
        D();
        return true ^ (continuationArr.length == 0) ? M(continuationArr) : continuationArr;
    }

    public final long c0() {
        long j2 = this.f29385j;
        if (j2 < this.f29386k) {
            this.f29386k = j2;
        }
        return j2;
    }

    @Override // k.b.i4.i0, k.b.i4.i
    @Nullable
    public Object collect(@NotNull j<? super T> jVar, @NotNull Continuation<?> continuation) {
        return E(this, jVar, continuation);
    }

    @Override // k.b.i4.i0
    @NotNull
    public List<T> d() {
        synchronized (this) {
            int T = T();
            if (T == 0) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList(T);
            Object[] objArr = this.f29384i;
            Intrinsics.checkNotNull(objArr);
            int i2 = 0;
            while (i2 < T) {
                int i3 = i2 + 1;
                arrayList.add(k0.c(objArr, this.f29385j + i2));
                i2 = i3;
            }
            return arrayList;
        }
    }

    @Override // k.b.i4.d0, k.b.i4.j
    @Nullable
    public Object emit(T t, @NotNull Continuation<? super Unit> continuation) {
        return J(this, t, continuation);
    }

    @Override // k.b.i4.d0
    public void g() {
        synchronized (this) {
            a0(N(), this.f29386k, N(), S());
            Unit unit = Unit.INSTANCE;
        }
    }
}
