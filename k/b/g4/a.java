package k.b.g4;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import k.b.a1;
import k.b.g4.i0;
import k.b.g4.n;
import k.b.g4.p;
import k.b.g4.r;
import k.b.j4.y;
import k.b.p1;
import k.b.z0;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AbstractChannel.kt */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0007STUVWXYB'\u0012 \u0010\u0004\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\u0019\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0007J\u0016\u0010\u0019\u001a\u00020\u00062\u000e\u0010\u001a\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001dJ\u0017\u0010\u001e\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0000¢\u0006\u0002\b\u001fJ\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0004J\u0016\u0010\"\u001a\u00020\n2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000$H\u0002J\u0016\u0010%\u001a\u00020\n2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000$H\u0014JR\u0010&\u001a\u00020\n\"\u0004\b\u0001\u0010'2\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H'0)2$\u0010*\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010,\u0012\n\u0012\b\u0012\u0004\u0012\u0002H'0-\u0012\u0006\u0012\u0004\u0018\u00010,0+2\u0006\u0010.\u001a\u00020/H\u0002ø\u0001\u0000¢\u0006\u0002\u00100J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00028\u000002H\u0086\u0002J\u0010\u00103\u001a\u00020\u00062\u0006\u00104\u001a\u00020\nH\u0014J/\u00105\u001a\u00020\u00062\f\u00106\u001a\b\u0012\u0004\u0012\u000208072\n\u00109\u001a\u0006\u0012\u0002\b\u00030:H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b;\u0010<J\b\u0010=\u001a\u00020\u0006H\u0014J\b\u0010>\u001a\u00020\u0006H\u0014J\n\u0010?\u001a\u0004\u0018\u00010,H\u0014J\u0016\u0010@\u001a\u0004\u0018\u00010,2\n\u0010(\u001a\u0006\u0012\u0002\b\u00030)H\u0014J\u0011\u0010#\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010AJ\"\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0086@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\bC\u0010AJ\u001f\u0010D\u001a\u0002H'\"\u0004\b\u0001\u0010'2\u0006\u0010.\u001a\u00020/H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010EJR\u0010F\u001a\u00020\u0006\"\u0004\b\u0001\u0010'2\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H'0)2\u0006\u0010.\u001a\u00020/2$\u0010*\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010,\u0012\n\u0012\b\u0012\u0004\u0012\u0002H'0-\u0012\u0006\u0012\u0004\u0018\u00010,0+H\u0002ø\u0001\u0000¢\u0006\u0002\u0010GJ \u0010H\u001a\u00020\u00062\n\u0010I\u001a\u0006\u0012\u0002\b\u00030J2\n\u0010#\u001a\u0006\u0012\u0002\b\u00030$H\u0002J\u0010\u0010K\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010LH\u0014J\u001c\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\bN\u0010OJX\u0010P\u001a\u00020\u0006\"\u0004\b\u0001\u0010'* \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010,\u0012\n\u0012\b\u0012\u0004\u0012\u0002H'0-\u0012\u0006\u0012\u0004\u0018\u00010,0+2\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H'0)2\u0006\u0010.\u001a\u00020/2\b\u0010Q\u001a\u0004\u0018\u00010,H\u0002ø\u0001\u0000¢\u0006\u0002\u0010RR\u0014\u0010\t\u001a\u00020\n8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\nX¤\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\fR\u0012\u0010\u000e\u001a\u00020\nX¤\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\u00020\n8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\fR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00170\u00138Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0015\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Z"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel;", ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/channels/AbstractSendChannel;", "Lkotlinx/coroutines/channels/Channel;", "onUndeliveredElement", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "(Lkotlin/jvm/functions/Function1;)V", "hasReceiveOrClosed", "", "getHasReceiveOrClosed", "()Z", "isBufferAlwaysEmpty", "isBufferEmpty", "isClosedForReceive", "isEmpty", "isEmptyImpl", "onReceive", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnReceive", "()Lkotlinx/coroutines/selects/SelectClause1;", "onReceiveCatching", "Lkotlinx/coroutines/channels/ChannelResult;", "getOnReceiveCatching", "cancel", "cause", "", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cancelInternal", "cancelInternal$kotlinx_coroutines_core", "describeTryPoll", "Lkotlinx/coroutines/channels/AbstractChannel$TryPollDesc;", "enqueueReceive", "receive", "Lkotlinx/coroutines/channels/Receive;", "enqueueReceiveInternal", "enqueueReceiveSelect", "R", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "block", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "receiveMode", "", "(Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;I)Z", "iterator", "Lkotlinx/coroutines/channels/ChannelIterator;", "onCancelIdempotent", "wasClosed", "onCancelIdempotentList", "list", "Lkotlinx/coroutines/internal/InlineList;", "Lkotlinx/coroutines/channels/Send;", "closed", "Lkotlinx/coroutines/channels/Closed;", "onCancelIdempotentList-w-w6eGU", "(Ljava/lang/Object;Lkotlinx/coroutines/channels/Closed;)V", "onReceiveDequeued", "onReceiveEnqueued", "pollInternal", "pollSelectInternal", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiveCatching", "receiveCatching-JP2dKIU", "receiveSuspend", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerSelectReceiveMode", "(Lkotlinx/coroutines/selects/SelectInstance;ILkotlin/jvm/functions/Function2;)V", "removeReceiveOnCancel", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "takeFirstReceiveOrPeekClosed", "Lkotlinx/coroutines/channels/ReceiveOrClosed;", "tryReceive", "tryReceive-PtdJZtk", "()Ljava/lang/Object;", "tryStartBlockUnintercepted", "value", "(Lkotlin/jvm/functions/Function2;Lkotlinx/coroutines/selects/SelectInstance;ILjava/lang/Object;)V", "Itr", "ReceiveElement", "ReceiveElementWithUndeliveredHandler", "ReceiveHasNext", "ReceiveSelect", "RemoveReceiveOnCancel", "TryPollDesc", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public abstract class a<E> extends k.b.g4.c<E> implements n<E> {

    /* compiled from: AbstractChannel.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0002\u0010\u0005J\u0011\u0010\f\u001a\u00020\rH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u0012\u0010\u000f\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002J\u0011\u0010\u0010\u001a\u00020\rH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u0011\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010\tR\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$Itr;", ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/channels/ChannelIterator;", "channel", "Lkotlinx/coroutines/channels/AbstractChannel;", "(Lkotlinx/coroutines/channels/AbstractChannel;)V", com.alipay.sdk.util.l.c, "", "getResult", "()Ljava/lang/Object;", "setResult", "(Ljava/lang/Object;)V", "hasNext", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasNextResult", "hasNextSuspend", "next", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* renamed from: k.b.g4.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class C0599a<E> implements p<E> {
        @JvmField
        @NotNull

        /* renamed from: a  reason: collision with root package name */
        public final a<E> f29237a;
        @Nullable
        private Object b = k.b.g4.b.f29254f;

        public C0599a(@NotNull a<E> aVar) {
            this.f29237a = aVar;
        }

        private final boolean e(Object obj) {
            if (obj instanceof w) {
                w wVar = (w) obj;
                if (wVar.f29295e == null) {
                    return false;
                }
                throw k.b.j4.p0.p(wVar.m0());
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Object f(Continuation<? super Boolean> continuation) {
            k.b.s b = k.b.u.b(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
            d dVar = new d(this, b);
            while (true) {
                if (this.f29237a.b0(dVar)) {
                    this.f29237a.q0(b, dVar);
                    break;
                }
                Object m0 = this.f29237a.m0();
                g(m0);
                if (m0 instanceof w) {
                    w wVar = (w) m0;
                    if (wVar.f29295e == null) {
                        Result.Companion companion = Result.Companion;
                        b.resumeWith(Result.m57constructorimpl(Boxing.boxBoolean(false)));
                    } else {
                        Result.Companion companion2 = Result.Companion;
                        b.resumeWith(Result.m57constructorimpl(ResultKt.createFailure(wVar.m0())));
                    }
                } else if (m0 != k.b.g4.b.f29254f) {
                    Boolean boxBoolean = Boxing.boxBoolean(true);
                    Function1<E, Unit> function1 = this.f29237a.b;
                    b.y(boxBoolean, function1 == null ? null : k.b.j4.i0.a(function1, m0, b.getContext()));
                }
            }
            Object x = b.x();
            if (x == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return x;
        }

        @Override // k.b.g4.p
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
        @JvmName(name = "next")
        public /* synthetic */ Object a(Continuation continuation) {
            return p.a.a(this, continuation);
        }

        @Override // k.b.g4.p
        @Nullable
        public Object b(@NotNull Continuation<? super Boolean> continuation) {
            Object d2 = d();
            k.b.j4.q0 q0Var = k.b.g4.b.f29254f;
            if (d2 != q0Var) {
                return Boxing.boxBoolean(e(d()));
            }
            g(this.f29237a.m0());
            return d() != q0Var ? Boxing.boxBoolean(e(d())) : f(continuation);
        }

        @Nullable
        public final Object d() {
            return this.b;
        }

        public final void g(@Nullable Object obj) {
            this.b = obj;
        }

        @Override // k.b.g4.p
        public E next() {
            E e2 = (E) this.b;
            if (!(e2 instanceof w)) {
                k.b.j4.q0 q0Var = k.b.g4.b.f29254f;
                if (e2 != q0Var) {
                    this.b = q0Var;
                    return e2;
                }
                throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
            }
            throw k.b.j4.p0.p(((w) e2).m0());
        }
    }

    /* compiled from: AbstractChannel.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0012\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\fJ\u0014\u0010\r\u001a\u00020\n2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000fH\u0016J\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00028\u0001¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0013H\u0016J!\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u000b\u001a\u00028\u00012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0002\u0010\u0018R\u0018\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$ReceiveElement;", ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/channels/Receive;", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "", "receiveMode", "", "(Lkotlinx/coroutines/CancellableContinuation;I)V", "completeResumeReceive", "", "value", "(Ljava/lang/Object;)V", "resumeReceiveClosed", "closed", "Lkotlinx/coroutines/channels/Closed;", "resumeValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "toString", "", "tryResumeReceive", "Lkotlinx/coroutines/internal/Symbol;", "otherOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;)Lkotlinx/coroutines/internal/Symbol;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class b<E> extends h0<E> {
        @JvmField
        @NotNull

        /* renamed from: e  reason: collision with root package name */
        public final k.b.r<Object> f29238e;
        @JvmField

        /* renamed from: f  reason: collision with root package name */
        public final int f29239f;

        public b(@NotNull k.b.r<Object> rVar, int i2) {
            this.f29238e = rVar;
            this.f29239f = i2;
        }

        @Override // k.b.g4.h0
        public void h0(@NotNull w<?> wVar) {
            if (this.f29239f == 1) {
                k.b.r<Object> rVar = this.f29238e;
                Result.Companion companion = Result.Companion;
                rVar.resumeWith(Result.m57constructorimpl(r.b(r.b.a(wVar.f29295e))));
                return;
            }
            k.b.r<Object> rVar2 = this.f29238e;
            Result.Companion companion2 = Result.Companion;
            rVar2.resumeWith(Result.m57constructorimpl(ResultKt.createFailure(wVar.m0())));
        }

        @Nullable
        public final Object i0(E e2) {
            return this.f29239f == 1 ? r.b(r.b.c(e2)) : e2;
        }

        @Override // k.b.g4.j0
        public void k(E e2) {
            this.f29238e.Y(k.b.t.f29646d);
        }

        @Override // k.b.j4.y
        @NotNull
        public String toString() {
            return "ReceiveElement@" + a1.b(this) + "[receiveMode=" + this.f29239f + ']';
        }

        @Override // k.b.g4.j0
        @Nullable
        public k.b.j4.q0 v(E e2, @Nullable y.d dVar) {
            Object N = this.f29238e.N(i0(e2), dVar == null ? null : dVar.c, g0(e2));
            if (N == null) {
                return null;
            }
            if (z0.b()) {
                if (!(N == k.b.t.f29646d)) {
                    throw new AssertionError();
                }
            }
            if (dVar != null) {
                dVar.d();
            }
            return k.b.t.f29646d;
        }
    }

    /* compiled from: AbstractChannel.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u0002B;\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u001c\u0010\b\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00028\u0001`\u000b¢\u0006\u0002\u0010\fJ#\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0010R&\u0010\b\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00028\u0001`\u000b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$ReceiveElementWithUndeliveredHandler;", ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/channels/AbstractChannel$ReceiveElement;", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "", "receiveMode", "", "onUndeliveredElement", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "(Lkotlinx/coroutines/CancellableContinuation;ILkotlin/jvm/functions/Function1;)V", "resumeOnCancellationFun", "", "value", "(Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class c<E> extends b<E> {
        @JvmField
        @NotNull

        /* renamed from: g  reason: collision with root package name */
        public final Function1<E, Unit> f29240g;

        /* JADX WARN: Multi-variable type inference failed */
        public c(@NotNull k.b.r<Object> rVar, int i2, @NotNull Function1<? super E, Unit> function1) {
            super(rVar, i2);
            this.f29240g = function1;
        }

        @Override // k.b.g4.h0
        @Nullable
        public Function1<Throwable, Unit> g0(E e2) {
            return k.b.j4.i0.a(this.f29240g, e2, this.f29238e.getContext());
        }
    }

    /* compiled from: AbstractChannel.kt */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0012\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B!\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\fJ#\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0010J\u0014\u0010\u0011\u001a\u00020\n2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J!\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u000b\u001a\u00028\u00012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0002\u0010\u001aR\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$ReceiveHasNext;", ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/channels/Receive;", "iterator", "Lkotlinx/coroutines/channels/AbstractChannel$Itr;", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "", "(Lkotlinx/coroutines/channels/AbstractChannel$Itr;Lkotlinx/coroutines/CancellableContinuation;)V", "completeResumeReceive", "", "value", "(Ljava/lang/Object;)V", "resumeOnCancellationFun", "Lkotlin/Function1;", "", "(Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;", "resumeReceiveClosed", "closed", "Lkotlinx/coroutines/channels/Closed;", "toString", "", "tryResumeReceive", "Lkotlinx/coroutines/internal/Symbol;", "otherOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;)Lkotlinx/coroutines/internal/Symbol;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class d<E> extends h0<E> {
        @JvmField
        @NotNull

        /* renamed from: e  reason: collision with root package name */
        public final C0599a<E> f29241e;
        @JvmField
        @NotNull

        /* renamed from: f  reason: collision with root package name */
        public final k.b.r<Boolean> f29242f;

        public d(@NotNull C0599a<E> c0599a, @NotNull k.b.r<? super Boolean> rVar) {
        }

        @Override // k.b.g4.h0
        @Nullable
        public Function1<Throwable, Unit> g0(E e2) {
        }

        @Override // k.b.g4.h0
        public void h0(@NotNull w<?> wVar) {
        }

        @Override // k.b.g4.j0
        public void k(E e2) {
        }

        @Override // k.b.j4.y
        @NotNull
        public String toString() {
        }

        @Override // k.b.g4.j0
        @Nullable
        public k.b.j4.q0 v(E e2, @Nullable y.d dVar) {
        }
    }

    /* compiled from: AbstractChannel.kt */
    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u0001*\u0004\b\u0002\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00020\u00032\u00020\u0004BR\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\b\u0012$\u0010\t\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u0012\u0006\u0010\r\u001a\u00020\u000eø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0002H\u0016¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0012H\u0016J#\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00172\u0006\u0010\u0013\u001a\u00028\u0002H\u0016¢\u0006\u0002\u0010\u0019J\u0014\u0010\u001a\u001a\u00020\u00122\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J!\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010\u0013\u001a\u00028\u00022\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0002\u0010#R3\u0010\t\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n8\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0010R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$ReceiveSelect;", "R", ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/channels/Receive;", "Lkotlinx/coroutines/DisposableHandle;", "channel", "Lkotlinx/coroutines/channels/AbstractChannel;", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "block", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "receiveMode", "", "(Lkotlinx/coroutines/channels/AbstractChannel;Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;I)V", "Lkotlin/jvm/functions/Function2;", "completeResumeReceive", "", "value", "(Ljava/lang/Object;)V", "dispose", "resumeOnCancellationFun", "Lkotlin/Function1;", "", "(Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;", "resumeReceiveClosed", "closed", "Lkotlinx/coroutines/channels/Closed;", "toString", "", "tryResumeReceive", "Lkotlinx/coroutines/internal/Symbol;", "otherOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;)Lkotlinx/coroutines/internal/Symbol;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class e<R, E> extends h0<E> implements p1 {
        @JvmField
        @NotNull

        /* renamed from: e  reason: collision with root package name */
        public final a<E> f29243e;
        @JvmField
        @NotNull

        /* renamed from: f  reason: collision with root package name */
        public final k.b.o4.f<R> f29244f;
        @JvmField
        @NotNull

        /* renamed from: g  reason: collision with root package name */
        public final Function2<Object, Continuation<? super R>, Object> f29245g;
        @JvmField

        /* renamed from: h  reason: collision with root package name */
        public final int f29246h;

        /* JADX WARN: Multi-variable type inference failed */
        public e(@NotNull a<E> aVar, @NotNull k.b.o4.f<? super R> fVar, @NotNull Function2<Object, ? super Continuation<? super R>, ? extends Object> function2, int i2) {
            this.f29243e = aVar;
            this.f29244f = fVar;
            this.f29245g = function2;
            this.f29246h = i2;
        }

        @Override // k.b.p1
        public void dispose() {
            if (X()) {
                this.f29243e.k0();
            }
        }

        @Override // k.b.g4.h0
        @Nullable
        public Function1<Throwable, Unit> g0(E e2) {
            Function1<E, Unit> function1 = this.f29243e.b;
            if (function1 == null) {
                return null;
            }
            return k.b.j4.i0.a(function1, e2, this.f29244f.p().getContext());
        }

        @Override // k.b.g4.h0
        public void h0(@NotNull w<?> wVar) {
            if (this.f29244f.o()) {
                int i2 = this.f29246h;
                if (i2 == 0) {
                    this.f29244f.t(wVar.m0());
                } else if (i2 != 1) {
                } else {
                    k.b.k4.a.f(this.f29245g, r.b(r.b.a(wVar.f29295e)), this.f29244f.p(), null, 4, null);
                }
            }
        }

        @Override // k.b.g4.j0
        public void k(E e2) {
            k.b.k4.a.e(this.f29245g, this.f29246h == 1 ? r.b(r.b.c(e2)) : e2, this.f29244f.p(), g0(e2));
        }

        @Override // k.b.j4.y
        @NotNull
        public String toString() {
            return "ReceiveSelect@" + a1.b(this) + '[' + this.f29244f + ",receiveMode=" + this.f29246h + ']';
        }

        @Override // k.b.g4.j0
        @Nullable
        public k.b.j4.q0 v(E e2, @Nullable y.d dVar) {
            return (k.b.j4.q0) this.f29244f.m(dVar);
        }
    }

    /* compiled from: AbstractChannel.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\t\u001a\u00020\nH\u0016R\u0012\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$RemoveReceiveOnCancel;", "Lkotlinx/coroutines/BeforeResumeCancelHandler;", "receive", "Lkotlinx/coroutines/channels/Receive;", "(Lkotlinx/coroutines/channels/AbstractChannel;Lkotlinx/coroutines/channels/Receive;)V", "invoke", "", "cause", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public final class f extends k.b.h {
        @NotNull
        private final h0<?> b;

        public f(@NotNull h0<?> h0Var) {
            this.b = h0Var;
        }

        @Override // k.b.q
        public void a(@Nullable Throwable th) {
            if (this.b.X()) {
                a.this.k0();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            a(th);
            return Unit.INSTANCE;
        }

        @NotNull
        public String toString() {
            return "RemoveReceiveOnCancel[" + this.b + ']';
        }
    }

    /* compiled from: AbstractChannel.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0014J\u0016\u0010\f\u001a\u0004\u0018\u00010\t2\n\u0010\r\u001a\u00060\u000ej\u0002`\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$TryPollDesc;", ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$RemoveFirstDesc;", "Lkotlinx/coroutines/channels/Send;", "Lkotlinx/coroutines/internal/RemoveFirstDesc;", "queue", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "(Lkotlinx/coroutines/internal/LockFreeLinkedListHead;)V", "failure", "", "affected", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "onPrepare", "prepareOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "Lkotlinx/coroutines/internal/PrepareOp;", "onRemoved", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class g<E> extends y.e<l0> {
        public g(@NotNull k.b.j4.w wVar) {
            super(wVar);
        }

        @Override // k.b.j4.y.e, k.b.j4.y.a
        @Nullable
        public Object e(@NotNull k.b.j4.y yVar) {
            if (yVar instanceof w) {
                return yVar;
            }
            if (yVar instanceof l0) {
                return null;
            }
            return k.b.g4.b.f29254f;
        }

        @Override // k.b.j4.y.a
        @Nullable
        public Object j(@NotNull y.d dVar) {
            k.b.j4.q0 i0 = ((l0) dVar.f29473a).i0(dVar);
            if (i0 == null) {
                return k.b.j4.z.f29477a;
            }
            Object obj = k.b.j4.c.b;
            if (i0 == obj) {
                return obj;
            }
            if (z0.b()) {
                if (i0 == k.b.t.f29646d) {
                    return null;
                }
                throw new AssertionError();
            }
            return null;
        }

        @Override // k.b.j4.y.a
        public void k(@NotNull k.b.j4.y yVar) {
            ((l0) yVar).j0();
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/internal/LockFreeLinkedListNode$makeCondAddOp$1", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "prepare", "", "affected", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class h extends y.c {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ k.b.j4.y f29247d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ a f29248e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(k.b.j4.y yVar, a aVar) {
            super(yVar);
            this.f29247d = yVar;
            this.f29248e = aVar;
        }

        @Override // k.b.j4.d
        @Nullable
        /* renamed from: k */
        public Object i(@NotNull k.b.j4.y yVar) {
            if (this.f29248e.g0()) {
                return null;
            }
            return k.b.j4.x.a();
        }
    }

    /* compiled from: AbstractChannel.kt */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001JH\u0010\u0002\u001a\u00020\u0003\"\u0004\b\u0001\u0010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00062\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\bH\u0016ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"kotlinx/coroutines/channels/AbstractChannel$onReceive$1", "Lkotlinx/coroutines/selects/SelectClause1;", "registerSelectClause1", "", "R", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class i implements k.b.o4.d<E> {
        public final /* synthetic */ a<E> b;

        public i(a<E> aVar) {
            this.b = aVar;
        }

        @Override // k.b.o4.d
        public <R> void h(@NotNull k.b.o4.f<? super R> fVar, @NotNull Function2<? super E, ? super Continuation<? super R>, ? extends Object> function2) {
            this.b.p0(fVar, 0, function2);
        }
    }

    /* compiled from: AbstractChannel.kt */
    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001JQ\u0010\u0003\u001a\u00020\u0004\"\u0004\b\u0001\u0010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u00072(\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\tH\u0016ø\u0001\u0000ø\u0001\u0000¢\u0006\u0002\u0010\fø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"kotlinx/coroutines/channels/AbstractChannel$onReceiveCatching$1", "Lkotlinx/coroutines/selects/SelectClause1;", "Lkotlinx/coroutines/channels/ChannelResult;", "registerSelectClause1", "", "R", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class j implements k.b.o4.d<r<? extends E>> {
        public final /* synthetic */ a<E> b;

        public j(a<E> aVar) {
            this.b = aVar;
        }

        @Override // k.b.o4.d
        public <R> void h(@NotNull k.b.o4.f<? super R> fVar, @NotNull Function2<? super r<? extends E>, ? super Continuation<? super R>, ? extends Object> function2) {
            this.b.p0(fVar, 1, function2);
        }
    }

    /* compiled from: AbstractChannel.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.channels.AbstractChannel", f = "AbstractChannel.kt", i = {}, l = {633}, m = "receiveCatching-JP2dKIU", n = {}, s = {})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class k extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;
        public final /* synthetic */ a<E> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(a<E> aVar, Continuation<? super k> continuation) {
            super(continuation);
            this.this$0 = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object M = this.this$0.M(this);
            return M == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? M : r.b(M);
        }
    }

    public a(@Nullable Function1<? super E, Unit> function1) {
        super(function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean b0(h0<? super E> h0Var) {
        boolean c0 = c0(h0Var);
        if (c0) {
            l0();
        }
        return c0;
    }

    private final <R> boolean d0(k.b.o4.f<? super R> fVar, Function2<Object, ? super Continuation<? super R>, ? extends Object> function2, int i2) {
        e eVar = new e(this, fVar, function2, i2);
        boolean b0 = b0(eVar);
        if (b0) {
            fVar.l(eVar);
        }
        return b0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [k.b.g4.a$b] */
    public final <R> Object o0(int i2, Continuation<? super R> continuation) {
        c cVar;
        k.b.s b2 = k.b.u.b(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        if (this.b == null) {
            cVar = new b(b2, i2);
        } else {
            cVar = new c(b2, i2, this.b);
        }
        while (true) {
            if (b0(cVar)) {
                q0(b2, cVar);
                break;
            }
            Object m0 = m0();
            if (m0 instanceof w) {
                cVar.h0((w) m0);
                break;
            } else if (m0 != k.b.g4.b.f29254f) {
                b2.y(cVar.i0(m0), cVar.g0(m0));
                break;
            }
        }
        Object x = b2.x();
        if (x == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return x;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <R> void p0(k.b.o4.f<? super R> fVar, int i2, Function2<Object, ? super Continuation<? super R>, ? extends Object> function2) {
        while (!fVar.i()) {
            if (h0()) {
                if (d0(fVar, function2, i2)) {
                    return;
                }
            } else {
                Object n0 = n0(fVar);
                if (n0 == k.b.o4.g.d()) {
                    return;
                }
                if (n0 != k.b.g4.b.f29254f && n0 != k.b.j4.c.b) {
                    r0(function2, fVar, i2, n0);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q0(k.b.r<?> rVar, h0<?> h0Var) {
        rVar.q(new f(h0Var));
    }

    private final <R> void r0(Function2<Object, ? super Continuation<? super R>, ? extends Object> function2, k.b.o4.f<? super R> fVar, int i2, Object obj) {
        boolean z = obj instanceof w;
        if (!z) {
            if (i2 == 1) {
                r.b bVar = r.b;
                k.b.k4.b.d(function2, r.b(z ? bVar.a(((w) obj).f29295e) : bVar.c(obj)), fVar.p());
                return;
            }
            k.b.k4.b.d(function2, obj, fVar.p());
        } else if (i2 != 0) {
            if (i2 == 1 && fVar.o()) {
                k.b.k4.b.d(function2, r.b(r.b.a(((w) obj).f29295e)), fVar.p());
            }
        } else {
            throw k.b.j4.p0.p(((w) obj).m0());
        }
    }

    @Override // k.b.g4.i0
    @NotNull
    public final k.b.o4.d<E> H() {
        return new i(this);
    }

    @Override // k.b.g4.i0
    @NotNull
    public final k.b.o4.d<r<E>> I() {
        return new j(this);
    }

    @Override // k.b.g4.i0
    @NotNull
    public k.b.o4.d<E> J() {
        return n.a.b(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k.b.g4.i0
    @NotNull
    public final Object K() {
        Object m0 = m0();
        return m0 == k.b.g4.b.f29254f ? r.b.b() : m0 instanceof w ? r.b.a(((w) m0).f29295e) : r.b.c(m0);
    }

    @Override // k.b.g4.i0
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
    @LowPriorityInOverloadResolution
    @Nullable
    public Object L(@NotNull Continuation<? super E> continuation) {
        return n.a.e(this, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // k.b.g4.i0
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object M(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super k.b.g4.r<? extends E>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof k.b.g4.a.k
            if (r0 == 0) goto L13
            r0 = r5
            k.b.g4.a$k r0 = (k.b.g4.a.k) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            k.b.g4.a$k r0 = new k.b.g4.a$k
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.throwOnFailure(r5)
            goto L5b
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.ResultKt.throwOnFailure(r5)
            java.lang.Object r5 = r4.m0()
            k.b.j4.q0 r2 = k.b.g4.b.f29254f
            if (r5 == r2) goto L52
            boolean r0 = r5 instanceof k.b.g4.w
            if (r0 == 0) goto L4b
            k.b.g4.r$b r0 = k.b.g4.r.b
            k.b.g4.w r5 = (k.b.g4.w) r5
            java.lang.Throwable r5 = r5.f29295e
            java.lang.Object r5 = r0.a(r5)
            goto L51
        L4b:
            k.b.g4.r$b r0 = k.b.g4.r.b
            java.lang.Object r5 = r0.c(r5)
        L51:
            return r5
        L52:
            r0.label = r3
            java.lang.Object r5 = r4.o0(r3, r0)
            if (r5 != r1) goto L5b
            return r1
        L5b:
            k.b.g4.r r5 = (k.b.g4.r) r5
            java.lang.Object r5 = r5.o()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: k.b.g4.a.M(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // k.b.g4.c
    @Nullable
    public j0<E> P() {
        j0<E> P = super.P();
        if (P != null && !(P instanceof w)) {
            k0();
        }
        return P;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k.b.g4.i0
    @Nullable
    public final Object Q(@NotNull Continuation<? super E> continuation) {
        Object m0 = m0();
        return (m0 == k.b.g4.b.f29254f || (m0 instanceof w)) ? o0(0, continuation) : m0;
    }

    @Override // k.b.g4.i0
    /* renamed from: Z */
    public final boolean a(@Nullable Throwable th) {
        boolean R = R(th);
        i0(R);
        return R;
    }

    @NotNull
    public final g<E> a0() {
        return new g<>(p());
    }

    @Override // k.b.g4.i0
    public final void b(@Nullable CancellationException cancellationException) {
        if (i()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new CancellationException(Intrinsics.stringPlus(a1.a(this), " was cancelled"));
        }
        a(cancellationException);
    }

    public boolean c0(@NotNull h0<? super E> h0Var) {
        int d0;
        k.b.j4.y R;
        if (f0()) {
            k.b.j4.y p2 = p();
            do {
                R = p2.R();
                if (!(!(R instanceof l0))) {
                    return false;
                }
            } while (!R.F(h0Var, p2));
        } else {
            k.b.j4.y p3 = p();
            h hVar = new h(h0Var, this);
            do {
                k.b.j4.y R2 = p3.R();
                if (!(!(R2 instanceof l0))) {
                    return false;
                }
                d0 = R2.d0(h0Var, p3, hVar);
                if (d0 != 1) {
                }
            } while (d0 != 2);
            return false;
        }
        return true;
    }

    @Override // k.b.g4.i0
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        i0.a.a(this);
    }

    public final boolean e0() {
        return p().Q() instanceof j0;
    }

    public abstract boolean f0();

    public abstract boolean g0();

    public final boolean h0() {
        return !(p().Q() instanceof l0) && g0();
    }

    @Override // k.b.g4.i0
    public boolean i() {
        return n() != null && g0();
    }

    public void i0(boolean z) {
        w<?> o2 = o();
        if (o2 != null) {
            Object c2 = k.b.j4.q.c(null, 1, null);
            while (true) {
                k.b.j4.y R = o2.R();
                if (R instanceof k.b.j4.w) {
                    j0(c2, o2);
                    return;
                } else if (z0.b() && !(R instanceof l0)) {
                    throw new AssertionError();
                } else {
                    if (!R.X()) {
                        R.S();
                    } else {
                        c2 = k.b.j4.q.h(c2, (l0) R);
                    }
                }
            }
        } else {
            throw new IllegalStateException("Cannot happen".toString());
        }
    }

    @Override // k.b.g4.i0
    public boolean isEmpty() {
        return h0();
    }

    @Override // k.b.g4.i0
    @NotNull
    public final p<E> iterator() {
        return new C0599a(this);
    }

    public void j0(@NotNull Object obj, @NotNull w<?> wVar) {
        if (obj == null) {
            return;
        }
        if (!(obj instanceof ArrayList)) {
            ((l0) obj).h0(wVar);
            return;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
        ArrayList arrayList = (ArrayList) obj;
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i2 = size - 1;
            ((l0) arrayList.get(size)).h0(wVar);
            if (i2 < 0) {
                return;
            }
            size = i2;
        }
    }

    public void k0() {
    }

    public void l0() {
    }

    @Nullable
    public Object m0() {
        while (true) {
            l0 S = S();
            if (S == null) {
                return k.b.g4.b.f29254f;
            }
            k.b.j4.q0 i0 = S.i0(null);
            if (i0 != null) {
                if (z0.b()) {
                    if (!(i0 == k.b.t.f29646d)) {
                        throw new AssertionError();
                    }
                }
                S.f0();
                return S.g0();
            }
            S.j0();
        }
    }

    @Nullable
    public Object n0(@NotNull k.b.o4.f<?> fVar) {
        g<E> a0 = a0();
        Object u = fVar.u(a0);
        if (u != null) {
            return u;
        }
        a0.o().f0();
        return a0.o().g0();
    }

    @Override // k.b.g4.i0
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @ReplaceWith(expression = "tryReceive().getOrNull()", imports = {}))
    @Nullable
    public E poll() {
        return (E) n.a.d(this);
    }
}
