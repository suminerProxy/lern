package k.b.g4;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k.b.a1;
import k.b.g4.m0;
import k.b.j4.c1;
import k.b.j4.y;
import k.b.p1;
import k.b.z0;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AbstractChannel.kt */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u000006:\u0004defgB)\u0012 \u0010\u0005\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0013\u001a\u000e\u0012\u0002\b\u00030\u0011j\u0006\u0012\u0002\b\u0003`\u00122\u0006\u0010\u0010\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\u0010\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001f\u001a\u00020\u00032\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J#\u0010!\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00028\u00002\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001dH\u0002¢\u0006\u0004\b!\u0010\"J\u001b\u0010!\u001a\u00020\b2\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001dH\u0002¢\u0006\u0004\b!\u0010#J)\u0010&\u001a\u00020\u00032\u0018\u0010%\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`$H\u0016¢\u0006\u0004\b&\u0010\u0007J\u0019\u0010'\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00028\u0000H\u0014¢\u0006\u0004\b+\u0010,J#\u0010/\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00028\u00002\n\u0010.\u001a\u0006\u0012\u0002\b\u00030-H\u0014¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u000201H\u0014¢\u0006\u0004\b2\u00103JX\u00109\u001a\u00020\u0003\"\u0004\b\u0001\u001042\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00010-2\u0006\u0010\u0010\u001a\u00028\u00002(\u00108\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000107\u0012\u0006\u0012\u0004\u0018\u00010\u001a05H\u0002ø\u0001\u0000¢\u0006\u0004\b9\u0010:J\u001b\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010;J\u001d\u0010=\u001a\b\u0012\u0002\b\u0003\u0018\u00010<2\u0006\u0010\u0010\u001a\u00028\u0000H\u0004¢\u0006\u0004\b=\u0010>J\u001b\u0010?\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b?\u0010;J\u0017\u0010@\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010<H\u0014¢\u0006\u0004\b@\u0010AJ\u0011\u0010B\u001a\u0004\u0018\u00010\u0018H\u0004¢\u0006\u0004\bB\u0010CJ\u000f\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bE\u0010FJ$\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00030G2\u0006\u0010\u0010\u001a\u00028\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bH\u0010,J+\u0010J\u001a\u00020\u0003*\u0006\u0012\u0002\b\u0003072\u0006\u0010\u0010\u001a\u00028\u00002\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001dH\u0002¢\u0006\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020D8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bL\u0010FR\u001a\u0010P\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001d8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u001a\u0010R\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001d8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010OR\u0014\u0010S\u001a\u00020\n8$X¤\u0004¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0014\u0010U\u001a\u00020\n8$X¤\u0004¢\u0006\u0006\u001a\u0004\bU\u0010TR\u0011\u0010V\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bV\u0010TR\u0014\u0010W\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bW\u0010TR#\u0010[\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0000060X8F¢\u0006\u0006\u001a\u0004\bY\u0010ZR.\u0010\u0005\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00048\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\\R\u001a\u0010^\u001a\u00020]8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\u0014\u0010c\u001a\u00020D8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bb\u0010F\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006h"}, d2 = {"Lkotlinx/coroutines/channels/AbstractSendChannel;", ExifInterface.LONGITUDE_EAST, "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "cause", "", "close", "(Ljava/lang/Throwable;)Z", "", "countQueueSize", "()I", "element", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;", "Lkotlinx/coroutines/internal/AddLastDesc;", "describeSendBuffered", "(Ljava/lang/Object;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;", "Lkotlinx/coroutines/channels/AbstractSendChannel$TryOfferDesc;", "describeTryOffer", "(Ljava/lang/Object;)Lkotlinx/coroutines/channels/AbstractSendChannel$TryOfferDesc;", "Lkotlinx/coroutines/channels/Send;", "send", "", "enqueueSend", "(Lkotlinx/coroutines/channels/Send;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/Closed;", "closed", "helpClose", "(Lkotlinx/coroutines/channels/Closed;)V", "helpCloseAndGetSendException", "(Ljava/lang/Object;Lkotlinx/coroutines/channels/Closed;)Ljava/lang/Throwable;", "(Lkotlinx/coroutines/channels/Closed;)Ljava/lang/Throwable;", "Lkotlinx/coroutines/channels/Handler;", "handler", "invokeOnClose", "invokeOnCloseHandler", "(Ljava/lang/Throwable;)V", "offer", "(Ljava/lang/Object;)Z", "offerInternal", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "offerSelectInternal", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "onClosedIdempotent", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "R", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/SendChannel;", "Lkotlin/coroutines/Continuation;", "block", "registerSelectSend", "(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ReceiveOrClosed;", "sendBuffered", "(Ljava/lang/Object;)Lkotlinx/coroutines/channels/ReceiveOrClosed;", "sendSuspend", "takeFirstReceiveOrPeekClosed", "()Lkotlinx/coroutines/channels/ReceiveOrClosed;", "takeFirstSendOrPeekClosed", "()Lkotlinx/coroutines/channels/Send;", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/channels/ChannelResult;", "trySend-JP2dKIU", "trySend", "helpCloseAndResumeWithSendException", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;Lkotlinx/coroutines/channels/Closed;)V", "getBufferDebugString", "bufferDebugString", "getClosedForReceive", "()Lkotlinx/coroutines/channels/Closed;", "closedForReceive", "getClosedForSend", "closedForSend", "isBufferAlwaysFull", "()Z", "isBufferFull", "isClosedForSend", "isFullImpl", "Lkotlinx/coroutines/selects/SelectClause2;", "getOnSend", "()Lkotlinx/coroutines/selects/SelectClause2;", "onSend", "Lkotlin/jvm/functions/Function1;", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "queue", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "getQueue", "()Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "getQueueDebugStateString", "queueDebugStateString", "SendBuffered", "SendBufferedDesc", "SendSelect", "TryOfferDesc", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public abstract class c<E> implements m0<E> {

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f29258d = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "onCloseHandler");
    @JvmField
    @Nullable
    public final Function1<E, Unit> b;
    @NotNull
    private final k.b.j4.w c = new k.b.j4.w();
    @NotNull
    private volatile /* synthetic */ Object onCloseHandler = null;

    /* compiled from: AbstractChannel.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0014\u0010\f\u001a\u00020\u000b2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u0012\u0010\u0003\u001a\u00028\u00018\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0015"}, d2 = {"Lkotlinx/coroutines/channels/AbstractSendChannel$SendBuffered;", ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/channels/Send;", "element", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "pollResult", "", "getPollResult", "()Ljava/lang/Object;", "completeResumeSend", "", "resumeSendClosed", "closed", "Lkotlinx/coroutines/channels/Closed;", "toString", "", "tryResumeSend", "Lkotlinx/coroutines/internal/Symbol;", "otherOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<E> extends l0 {
        @JvmField

        /* renamed from: e  reason: collision with root package name */
        public final E f29259e;

        public a(E e2) {
            this.f29259e = e2;
        }

        @Override // k.b.g4.l0
        public void f0() {
        }

        @Override // k.b.g4.l0
        @Nullable
        public Object g0() {
            return this.f29259e;
        }

        @Override // k.b.g4.l0
        public void h0(@NotNull w<?> wVar) {
            if (z0.b()) {
                throw new AssertionError();
            }
        }

        @Override // k.b.g4.l0
        @Nullable
        public k.b.j4.q0 i0(@Nullable y.d dVar) {
            k.b.j4.q0 q0Var = k.b.t.f29646d;
            if (dVar != null) {
                dVar.d();
            }
            return q0Var;
        }

        @Override // k.b.j4.y
        @NotNull
        public String toString() {
            return "SendBuffered@" + a1.b(this) + '(' + this.f29259e + ')';
        }
    }

    /* compiled from: AbstractChannel.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0012\u0018\u0000*\u0004\b\u0001\u0010\u00012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0003`\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00028\u0001¢\u0006\u0002\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0014¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/channels/AbstractSendChannel$SendBufferedDesc;", ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;", "Lkotlinx/coroutines/channels/AbstractSendChannel$SendBuffered;", "Lkotlinx/coroutines/internal/AddLastDesc;", "queue", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "element", "(Lkotlinx/coroutines/internal/LockFreeLinkedListHead;Ljava/lang/Object;)V", "failure", "", "affected", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class b<E> extends y.b<a<? extends E>> {
        public b(@NotNull k.b.j4.w wVar, E e2) {
            super(wVar, new a(e2));
        }

        @Override // k.b.j4.y.a
        @Nullable
        public Object e(@NotNull k.b.j4.y yVar) {
            if (yVar instanceof w) {
                return yVar;
            }
            if (yVar instanceof j0) {
                return k.b.g4.b.f29253e;
            }
            return null;
        }
    }

    /* compiled from: AbstractChannel.kt */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u0001*\u0004\b\u0002\u0010\u00022\u00020\u00032\u00020\u0004BV\u0012\u0006\u0010\u0005\u001a\u00028\u0001\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\t\u0012(\u0010\n\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u000bø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\u0014\u0010\u0017\u001a\u00020\u00152\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\u0015H\u0016R7\u0010\n\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u000b8\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0010R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\u00028\u0001X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Lkotlinx/coroutines/channels/AbstractSendChannel$SendSelect;", ExifInterface.LONGITUDE_EAST, "R", "Lkotlinx/coroutines/channels/Send;", "Lkotlinx/coroutines/DisposableHandle;", "pollResult", "channel", "Lkotlinx/coroutines/channels/AbstractSendChannel;", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/SendChannel;", "Lkotlin/coroutines/Continuation;", "", "(Ljava/lang/Object;Lkotlinx/coroutines/channels/AbstractSendChannel;Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", "getPollResult", "()Ljava/lang/Object;", "Ljava/lang/Object;", "completeResumeSend", "", "dispose", "resumeSendClosed", "closed", "Lkotlinx/coroutines/channels/Closed;", "toString", "", "tryResumeSend", "Lkotlinx/coroutines/internal/Symbol;", "otherOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "undeliveredElement", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* renamed from: k.b.g4.c$c  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class C0600c<E, R> extends l0 implements p1 {

        /* renamed from: e  reason: collision with root package name */
        private final E f29260e;
        @JvmField
        @NotNull

        /* renamed from: f  reason: collision with root package name */
        public final c<E> f29261f;
        @JvmField
        @NotNull

        /* renamed from: g  reason: collision with root package name */
        public final k.b.o4.f<R> f29262g;
        @JvmField
        @NotNull

        /* renamed from: h  reason: collision with root package name */
        public final Function2<m0<? super E>, Continuation<? super R>, Object> f29263h;

        /* JADX WARN: Multi-variable type inference failed */
        public C0600c(E e2, @NotNull c<E> cVar, @NotNull k.b.o4.f<? super R> fVar, @NotNull Function2<? super m0<? super E>, ? super Continuation<? super R>, ? extends Object> function2) {
            this.f29260e = e2;
            this.f29261f = cVar;
            this.f29262g = fVar;
            this.f29263h = function2;
        }

        @Override // k.b.p1
        public void dispose() {
            if (X()) {
                j0();
            }
        }

        @Override // k.b.g4.l0
        public void f0() {
            k.b.k4.a.f(this.f29263h, this.f29261f, this.f29262g.p(), null, 4, null);
        }

        @Override // k.b.g4.l0
        public E g0() {
            return this.f29260e;
        }

        @Override // k.b.g4.l0
        public void h0(@NotNull w<?> wVar) {
            if (this.f29262g.o()) {
                this.f29262g.t(wVar.n0());
            }
        }

        @Override // k.b.g4.l0
        @Nullable
        public k.b.j4.q0 i0(@Nullable y.d dVar) {
            return (k.b.j4.q0) this.f29262g.m(dVar);
        }

        @Override // k.b.g4.l0
        public void j0() {
            Function1<E, Unit> function1 = this.f29261f.b;
            if (function1 == null) {
                return;
            }
            k.b.j4.i0.b(function1, g0(), this.f29262g.p().getContext());
        }

        @Override // k.b.j4.y
        @NotNull
        public String toString() {
            return "SendSelect@" + a1.b(this) + '(' + g0() + ")[" + this.f29261f + ", " + this.f29262g + ']';
        }
    }

    /* compiled from: AbstractChannel.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0003`\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00028\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014J\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\u0010\u000f\u001a\u00060\u0010j\u0002`\u0011H\u0016R\u0012\u0010\u0005\u001a\u00028\u00018\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/channels/AbstractSendChannel$TryOfferDesc;", ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$RemoveFirstDesc;", "Lkotlinx/coroutines/channels/ReceiveOrClosed;", "Lkotlinx/coroutines/internal/RemoveFirstDesc;", "element", "queue", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/LockFreeLinkedListHead;)V", "Ljava/lang/Object;", "failure", "", "affected", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "onPrepare", "prepareOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "Lkotlinx/coroutines/internal/PrepareOp;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class d<E> extends y.e<j0<? super E>> {
        @JvmField

        /* renamed from: e  reason: collision with root package name */
        public final E f29264e;

        public d(E e2, @NotNull k.b.j4.w wVar) {
            super(wVar);
            this.f29264e = e2;
        }

        @Override // k.b.j4.y.e, k.b.j4.y.a
        @Nullable
        public Object e(@NotNull k.b.j4.y yVar) {
            if (yVar instanceof w) {
                return yVar;
            }
            if (yVar instanceof j0) {
                return null;
            }
            return k.b.g4.b.f29253e;
        }

        @Override // k.b.j4.y.a
        @Nullable
        public Object j(@NotNull y.d dVar) {
            k.b.j4.q0 v = ((j0) dVar.f29473a).v(this.f29264e, dVar);
            if (v == null) {
                return k.b.j4.z.f29477a;
            }
            Object obj = k.b.j4.c.b;
            if (v == obj) {
                return obj;
            }
            if (z0.b()) {
                if (v == k.b.t.f29646d) {
                    return null;
                }
                throw new AssertionError();
            }
            return null;
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/internal/LockFreeLinkedListNode$makeCondAddOp$1", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "prepare", "", "affected", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class e extends y.c {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ k.b.j4.y f29265d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ c f29266e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(k.b.j4.y yVar, c cVar) {
            super(yVar);
            this.f29265d = yVar;
            this.f29266e = cVar;
        }

        @Override // k.b.j4.d
        @Nullable
        /* renamed from: k */
        public Object i(@NotNull k.b.j4.y yVar) {
            if (this.f29266e.z()) {
                return null;
            }
            return k.b.j4.x.a();
        }
    }

    /* compiled from: AbstractChannel.kt */
    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001JV\u0010\u0003\u001a\u00020\u0004\"\u0004\b\u0001\u0010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u00072\u0006\u0010\b\u001a\u00028\u00002(\u0010\t\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\nH\u0016ø\u0001\u0000¢\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"kotlinx/coroutines/channels/AbstractSendChannel$onSend$1", "Lkotlinx/coroutines/selects/SelectClause2;", "Lkotlinx/coroutines/channels/SendChannel;", "registerSelectClause2", "", "R", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "param", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class f implements k.b.o4.e<E, m0<? super E>> {
        public final /* synthetic */ c<E> b;

        public f(c<E> cVar) {
            this.b = cVar;
        }

        @Override // k.b.o4.e
        public <R> void E(@NotNull k.b.o4.f<? super R> fVar, E e2, @NotNull Function2<? super m0<? super E>, ? super Continuation<? super R>, ? extends Object> function2) {
            this.b.G(fVar, e2, function2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@Nullable Function1<? super E, Unit> function1) {
        this.b = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean A() {
        return !(this.c.Q() instanceof j0) && z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <R> void G(k.b.o4.f<? super R> fVar, E e2, Function2<? super m0<? super E>, ? super Continuation<? super R>, ? extends Object> function2) {
        while (!fVar.i()) {
            if (A()) {
                C0600c c0600c = new C0600c(e2, this, fVar, function2);
                Object l2 = l(c0600c);
                if (l2 == null) {
                    fVar.l(c0600c);
                    return;
                } else if (!(l2 instanceof w)) {
                    if (l2 != k.b.g4.b.f29255g && !(l2 instanceof h0)) {
                        throw new IllegalStateException(("enqueueSend returned " + l2 + ' ').toString());
                    }
                } else {
                    throw k.b.j4.p0.p(s(e2, (w) l2));
                }
            }
            Object E = E(e2, fVar);
            if (E == k.b.o4.g.d()) {
                return;
            }
            if (E != k.b.g4.b.f29253e && E != k.b.j4.c.b) {
                if (E == k.b.g4.b.f29252d) {
                    k.b.k4.b.d(function2, this, fVar.p());
                    return;
                } else if (!(E instanceof w)) {
                    throw new IllegalStateException(Intrinsics.stringPlus("offerSelectInternal returned ", E).toString());
                } else {
                    throw k.b.j4.p0.p(s(e2, (w) E));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006f, code lost:
        r4 = r0.x();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
        if (r4 != kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0079, code lost:
        kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0080, code lost:
        if (r4 != kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0082, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0085, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object O(E r4, kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
        /*
            r3 = this;
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.intercepted(r5)
            k.b.s r0 = k.b.u.b(r0)
        L8:
            boolean r1 = e(r3)
            if (r1 == 0) goto L4d
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r1 = r3.b
            if (r1 != 0) goto L18
            k.b.g4.n0 r1 = new k.b.g4.n0
            r1.<init>(r4, r0)
            goto L1f
        L18:
            k.b.g4.o0 r1 = new k.b.g4.o0
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r2 = r3.b
            r1.<init>(r4, r0, r2)
        L1f:
            java.lang.Object r2 = r3.l(r1)
            if (r2 != 0) goto L29
            k.b.u.c(r0, r1)
            goto L6f
        L29:
            boolean r1 = r2 instanceof k.b.g4.w
            if (r1 == 0) goto L33
            k.b.g4.w r2 = (k.b.g4.w) r2
            d(r3, r0, r4, r2)
            goto L6f
        L33:
            k.b.j4.q0 r1 = k.b.g4.b.f29255g
            if (r2 != r1) goto L38
            goto L4d
        L38:
            boolean r1 = r2 instanceof k.b.g4.h0
            if (r1 == 0) goto L3d
            goto L4d
        L3d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "enqueueSend returned "
            java.lang.String r5 = kotlin.jvm.internal.Intrinsics.stringPlus(r5, r2)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L4d:
            java.lang.Object r1 = r3.C(r4)
            k.b.j4.q0 r2 = k.b.g4.b.f29252d
            if (r1 != r2) goto L61
            kotlin.Result$Companion r4 = kotlin.Result.Companion
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            java.lang.Object r4 = kotlin.Result.m57constructorimpl(r4)
            r0.resumeWith(r4)
            goto L6f
        L61:
            k.b.j4.q0 r2 = k.b.g4.b.f29253e
            if (r1 != r2) goto L66
            goto L8
        L66:
            boolean r2 = r1 instanceof k.b.g4.w
            if (r2 == 0) goto L86
            k.b.g4.w r1 = (k.b.g4.w) r1
            d(r3, r0, r4, r1)
        L6f:
            java.lang.Object r4 = r0.x()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r4 != r0) goto L7c
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r5)
        L7c:
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r4 != r5) goto L83
            return r4
        L83:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L86:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "offerInternal returned "
            java.lang.String r5 = kotlin.jvm.internal.Intrinsics.stringPlus(r5, r1)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k.b.g4.c.O(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final int h() {
        k.b.j4.w wVar = this.c;
        int i2 = 0;
        for (k.b.j4.y yVar = (k.b.j4.y) wVar.M(); !Intrinsics.areEqual(yVar, wVar); yVar = yVar.Q()) {
            if (yVar instanceof k.b.j4.y) {
                i2++;
            }
        }
        return i2;
    }

    private final String q() {
        String stringPlus;
        k.b.j4.y Q = this.c.Q();
        if (Q == this.c) {
            return "EmptyQueue";
        }
        if (Q instanceof w) {
            stringPlus = Q.toString();
        } else if (Q instanceof h0) {
            stringPlus = "ReceiveQueued";
        } else {
            stringPlus = Q instanceof l0 ? "SendQueued" : Intrinsics.stringPlus("UNEXPECTED:", Q);
        }
        k.b.j4.y R = this.c.R();
        if (R != Q) {
            String str = stringPlus + ",queueSize=" + h();
            if (R instanceof w) {
                return str + ",closedForSend=" + R;
            }
            return str;
        }
        return stringPlus;
    }

    private final void r(w<?> wVar) {
        Object c = k.b.j4.q.c(null, 1, null);
        while (true) {
            k.b.j4.y R = wVar.R();
            h0 h0Var = R instanceof h0 ? (h0) R : null;
            if (h0Var == null) {
                break;
            } else if (!h0Var.X()) {
                h0Var.S();
            } else {
                c = k.b.j4.q.h(c, h0Var);
            }
        }
        if (c != null) {
            if (!(c instanceof ArrayList)) {
                ((h0) c).h0(wVar);
            } else {
                Objects.requireNonNull(c, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
                ArrayList arrayList = (ArrayList) c;
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i2 = size - 1;
                        ((h0) arrayList.get(size)).h0(wVar);
                        if (i2 < 0) {
                            break;
                        }
                        size = i2;
                    }
                }
            }
        }
        F(wVar);
    }

    private final Throwable s(E e2, w<?> wVar) {
        c1 d2;
        r(wVar);
        Function1<E, Unit> function1 = this.b;
        if (function1 == null || (d2 = k.b.j4.i0.d(function1, e2, null, 2, null)) == null) {
            return wVar.n0();
        }
        ExceptionsKt__ExceptionsKt.addSuppressed(d2, wVar.n0());
        throw d2;
    }

    private final Throwable u(w<?> wVar) {
        r(wVar);
        return wVar.n0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(Continuation<?> continuation, E e2, w<?> wVar) {
        c1 d2;
        r(wVar);
        Throwable n0 = wVar.n0();
        Function1<E, Unit> function1 = this.b;
        if (function1 == null || (d2 = k.b.j4.i0.d(function1, e2, null, 2, null)) == null) {
            Result.Companion companion = Result.Companion;
            continuation.resumeWith(Result.m57constructorimpl(ResultKt.createFailure(n0)));
            return;
        }
        ExceptionsKt__ExceptionsKt.addSuppressed(d2, n0);
        Result.Companion companion2 = Result.Companion;
        continuation.resumeWith(Result.m57constructorimpl(ResultKt.createFailure(d2)));
    }

    private final void x(Throwable th) {
        k.b.j4.q0 q0Var;
        Object obj = this.onCloseHandler;
        if (obj == null || obj == (q0Var = k.b.g4.b.f29256h) || !f29258d.compareAndSet(this, obj, q0Var)) {
            return;
        }
        ((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj, 1)).invoke(th);
    }

    @Override // k.b.g4.m0
    public void B(@NotNull Function1<? super Throwable, Unit> function1) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29258d;
        if (!atomicReferenceFieldUpdater.compareAndSet(this, null, function1)) {
            Object obj = this.onCloseHandler;
            if (obj == k.b.g4.b.f29256h) {
                throw new IllegalStateException("Another handler was already registered and successfully invoked");
            }
            throw new IllegalStateException(Intrinsics.stringPlus("Another handler was already registered: ", obj));
        }
        w<?> o2 = o();
        if (o2 == null || !atomicReferenceFieldUpdater.compareAndSet(this, function1, k.b.g4.b.f29256h)) {
            return;
        }
        function1.invoke(o2.f29295e);
    }

    @NotNull
    public Object C(E e2) {
        j0<E> P;
        k.b.j4.q0 v;
        do {
            P = P();
            if (P == null) {
                return k.b.g4.b.f29253e;
            }
            v = P.v(e2, null);
        } while (v == null);
        if (z0.b()) {
            if (!(v == k.b.t.f29646d)) {
                throw new AssertionError();
            }
        }
        P.k(e2);
        return P.c();
    }

    @Override // k.b.g4.m0
    @NotNull
    public final Object D(E e2) {
        Object C = C(e2);
        if (C == k.b.g4.b.f29252d) {
            return r.b.c(Unit.INSTANCE);
        }
        if (C == k.b.g4.b.f29253e) {
            w<?> o2 = o();
            return o2 == null ? r.b.b() : r.b.a(u(o2));
        } else if (C instanceof w) {
            return r.b.a(u((w) C));
        } else {
            throw new IllegalStateException(Intrinsics.stringPlus("trySend returned ", C).toString());
        }
    }

    @NotNull
    public Object E(E e2, @NotNull k.b.o4.f<?> fVar) {
        d<E> k2 = k(e2);
        Object u = fVar.u(k2);
        if (u != null) {
            return u;
        }
        j0<? super E> o2 = k2.o();
        o2.k(e2);
        return o2.c();
    }

    public void F(@NotNull k.b.j4.y yVar) {
    }

    @Nullable
    public final j0<?> N(E e2) {
        k.b.j4.y R;
        k.b.j4.y yVar = this.c;
        a aVar = new a(e2);
        do {
            R = yVar.R();
            if (R instanceof j0) {
                return (j0) R;
            }
        } while (!R.F(aVar, yVar));
        return null;
    }

    @Nullable
    public j0<E> P() {
        k.b.j4.y yVar;
        k.b.j4.y b0;
        k.b.j4.w wVar = this.c;
        while (true) {
            yVar = (k.b.j4.y) wVar.M();
            if (yVar != wVar && (yVar instanceof j0)) {
                if (((((j0) yVar) instanceof w) && !yVar.U()) || (b0 = yVar.b0()) == null) {
                    break;
                }
                b0.T();
            }
        }
        yVar = null;
        return (j0) yVar;
    }

    @Override // k.b.g4.m0
    public boolean R(@Nullable Throwable th) {
        boolean z;
        w<?> wVar = new w<>(th);
        k.b.j4.y yVar = this.c;
        while (true) {
            k.b.j4.y R = yVar.R();
            z = true;
            if (!(!(R instanceof w))) {
                z = false;
                break;
            } else if (R.F(wVar, yVar)) {
                break;
            }
        }
        if (!z) {
            wVar = (w) this.c.R();
        }
        r(wVar);
        if (z) {
            x(th);
        }
        return z;
    }

    @Nullable
    public final l0 S() {
        k.b.j4.y yVar;
        k.b.j4.y b0;
        k.b.j4.w wVar = this.c;
        while (true) {
            yVar = (k.b.j4.y) wVar.M();
            if (yVar != wVar && (yVar instanceof l0)) {
                if (((((l0) yVar) instanceof w) && !yVar.U()) || (b0 = yVar.b0()) == null) {
                    break;
                }
                b0.T();
            }
        }
        yVar = null;
        return (l0) yVar;
    }

    @Override // k.b.g4.m0
    @Nullable
    public final Object U(E e2, @NotNull Continuation<? super Unit> continuation) {
        Object O;
        return (C(e2) != k.b.g4.b.f29252d && (O = O(e2, continuation)) == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? O : Unit.INSTANCE;
    }

    @Override // k.b.g4.m0
    public final boolean V() {
        return o() != null;
    }

    @NotNull
    public final y.b<?> j(E e2) {
        return new b(this.c, e2);
    }

    @NotNull
    public final d<E> k(E e2) {
        return new d<>(e2, this.c);
    }

    @Nullable
    public Object l(@NotNull l0 l0Var) {
        boolean z;
        k.b.j4.y R;
        if (y()) {
            k.b.j4.y yVar = this.c;
            do {
                R = yVar.R();
                if (R instanceof j0) {
                    return R;
                }
            } while (!R.F(l0Var, yVar));
            return null;
        }
        k.b.j4.y yVar2 = this.c;
        e eVar = new e(l0Var, this);
        while (true) {
            k.b.j4.y R2 = yVar2.R();
            if (!(R2 instanceof j0)) {
                int d0 = R2.d0(l0Var, yVar2, eVar);
                z = true;
                if (d0 != 1) {
                    if (d0 == 2) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            } else {
                return R2;
            }
        }
        if (z) {
            return null;
        }
        return k.b.g4.b.f29255g;
    }

    @NotNull
    public String m() {
        return "";
    }

    @Nullable
    public final w<?> n() {
        k.b.j4.y Q = this.c.Q();
        w<?> wVar = Q instanceof w ? (w) Q : null;
        if (wVar == null) {
            return null;
        }
        r(wVar);
        return wVar;
    }

    @Nullable
    public final w<?> o() {
        k.b.j4.y R = this.c.R();
        w<?> wVar = R instanceof w ? (w) R : null;
        if (wVar == null) {
            return null;
        }
        r(wVar);
        return wVar;
    }

    @Override // k.b.g4.m0
    public boolean offer(E e2) {
        c1 d2;
        try {
            return m0.a.c(this, e2);
        } catch (Throwable th) {
            Function1<E, Unit> function1 = this.b;
            if (function1 != null && (d2 = k.b.j4.i0.d(function1, e2, null, 2, null)) != null) {
                ExceptionsKt__ExceptionsKt.addSuppressed(d2, th);
                throw d2;
            }
            throw th;
        }
    }

    @NotNull
    public final k.b.j4.w p() {
        return this.c;
    }

    @Override // k.b.g4.m0
    @NotNull
    public final k.b.o4.e<E, m0<E>> t() {
        return new f(this);
    }

    @NotNull
    public String toString() {
        return a1.a(this) + '@' + a1.b(this) + '{' + q() + '}' + m();
    }

    public abstract boolean y();

    public abstract boolean z();
}
