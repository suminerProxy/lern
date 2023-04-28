package k.b.j4;

import androidx.exifinterface.media.ExifInterface;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k.b.i2;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LockFreeLinkedList.kt */
@i2
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\f\b\u0017\u0018\u00002\u00020C:\u0005JKLMNB\u0007¢\u0006\u0004\b\u0001\u0010\u0002J\u0019\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u0003¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\u000b\u001a\u00020\t2\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u00032\u000e\b\u0004\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086\b¢\u0006\u0004\b\u000b\u0010\fJ4\u0010\u000f\u001a\u00020\t2\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u00032\u0016\u0010\u000e\u001a\u0012\u0012\b\u0012\u00060\u0000j\u0002`\u0003\u0012\u0004\u0012\u00020\t0\rH\u0086\b¢\u0006\u0004\b\u000f\u0010\u0010JD\u0010\u0011\u001a\u00020\t2\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u00032\u0016\u0010\u000e\u001a\u0012\u0012\b\u0012\u00060\u0000j\u0002`\u0003\u0012\u0004\u0012\u00020\t0\r2\u000e\b\u0004\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086\b¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0014\u001a\u00020\t2\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u00032\n\u0010\u0013\u001a\u00060\u0000j\u0002`\u0003H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\t2\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\"\u0010\u001a\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0082\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d\"\f\b\u0000\u0010\u001c*\u00060\u0000j\u0002`\u00032\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\f\u0012\b\u0012\u00060\u0000j\u0002`\u00030 ¢\u0006\u0004\b!\u0010\"J \u0010$\u001a\u00060\u0000j\u0002`\u00032\n\u0010#\u001a\u00060\u0000j\u0002`\u0003H\u0082\u0010¢\u0006\u0004\b$\u0010%J\u001b\u0010&\u001a\u00020\u00052\n\u0010\u0013\u001a\u00060\u0000j\u0002`\u0003H\u0002¢\u0006\u0004\b&\u0010\u0007J\r\u0010'\u001a\u00020\u0005¢\u0006\u0004\b'\u0010\u0002J\u000f\u0010(\u001a\u00020\u0005H\u0001¢\u0006\u0004\b(\u0010\u0002J,\u0010*\u001a\u00020)2\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u00032\u000e\b\u0004\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0081\b¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0003H\u0014¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\tH\u0016¢\u0006\u0004\b.\u0010/J.\u00100\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u001c\u0018\u00012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\rH\u0086\b¢\u0006\u0004\b0\u00101J\u0015\u00102\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0003¢\u0006\u0004\b2\u0010-J\u0017\u00103\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0003H\u0001¢\u0006\u0004\b3\u0010-J\u000f\u00105\u001a\u000204H\u0002¢\u0006\u0004\b5\u00106J\u000f\u00108\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109J/\u0010<\u001a\u00020;2\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u00032\n\u0010\u0013\u001a\u00060\u0000j\u0002`\u00032\u0006\u0010:\u001a\u00020)H\u0001¢\u0006\u0004\b<\u0010=J'\u0010A\u001a\u00020\u00052\n\u0010>\u001a\u00060\u0000j\u0002`\u00032\n\u0010\u0013\u001a\u00060\u0000j\u0002`\u0003H\u0000¢\u0006\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010/R\u0011\u0010\u0013\u001a\u00020C8F¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0015\u0010G\u001a\u00060\u0000j\u0002`\u00038F¢\u0006\u0006\u001a\u0004\bF\u0010-R\u0015\u0010I\u001a\u00060\u0000j\u0002`\u00038F¢\u0006\u0006\u001a\u0004\bH\u0010-¨\u0006O"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "<init>", "()V", "Lkotlinx/coroutines/internal/Node;", "node", "", "addLast", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "Lkotlin/Function0;", "", "condition", "addLastIf", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlin/jvm/functions/Function0;)Z", "Lkotlin/Function1;", "predicate", "addLastIfPrev", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlin/jvm/functions/Function1;)Z", "addLastIfPrevAndIf", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Z", "next", "addNext", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Z", "addOneIfEmpty", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Z", "Lkotlinx/coroutines/internal/OpDescriptor;", "op", "correctPrev", "(Lkotlinx/coroutines/internal/OpDescriptor;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;", "describeAddLast", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$RemoveFirstDesc;", "describeRemoveFirst", "()Lkotlinx/coroutines/internal/LockFreeLinkedListNode$RemoveFirstDesc;", "current", "findPrevNonRemoved", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "finishAdd", "helpRemove", "helpRemovePrev", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "makeCondAddOp", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlin/jvm/functions/Function0;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "nextIfRemoved", "()Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "remove", "()Z", "removeFirstIfIsInstanceOfOrPeekIf", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "removeFirstOrNull", "removeOrNext", "Lkotlinx/coroutines/internal/Removed;", "removed", "()Lkotlinx/coroutines/internal/Removed;", "", "toString", "()Ljava/lang/String;", "condAdd", "", "tryCondAddNext", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;)I", "prev", "validateNode$kotlinx_coroutines_core", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "validateNode", "isRemoved", "", "getNext", "()Ljava/lang/Object;", "getNextNode", "nextNode", "getPrevNode", "prevNode", "AbstractAtomicDesc", "AddLastDesc", "CondAddOp", "PrepareOp", "RemoveFirstDesc", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class y {
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(y.class, Object.class, "_next");
    public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(y.class, Object.class, "_prev");

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f29471d = AtomicReferenceFieldUpdater.newUpdater(y.class, Object.class, "_removedRef");
    @NotNull
    public volatile /* synthetic */ Object _next = this;
    @NotNull
    public volatile /* synthetic */ Object _prev = this;
    @NotNull
    private volatile /* synthetic */ Object _removedRef = null;

    /* compiled from: LockFreeLinkedList.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\n\u001a\u00020\u000b2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0010\u001a\u00060\u0004j\u0002`\u0005H\u0014J \u0010\u0011\u001a\u00020\u000b2\n\u0010\u0010\u001a\u00060\u0004j\u0002`\u00052\n\u0010\u0012\u001a\u00060\u0004j\u0002`\u0005H$J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0014\u0010\u0017\u001a\u00020\u000b2\n\u0010\u0010\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\rJ\u001c\u0010\u0019\u001a\u00020\u001a2\n\u0010\u0010\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0012\u001a\u00020\u000fH\u0014J\u0018\u0010\u001b\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00052\u0006\u0010\f\u001a\u00020\u001cH\u0014J \u0010\u001d\u001a\u00020\u000f2\n\u0010\u0010\u001a\u00060\u0004j\u0002`\u00052\n\u0010\u0012\u001a\u00060\u0004j\u0002`\u0005H&R\u001a\u0010\u0003\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005X¤\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\u001e"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AbstractAtomicDesc;", "Lkotlinx/coroutines/internal/AtomicDesc;", "()V", "affectedNode", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "getAffectedNode", "()Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "originalNext", "getOriginalNext", "complete", "", "op", "Lkotlinx/coroutines/internal/AtomicOp;", "failure", "", "affected", "finishOnSuccess", "next", "finishPrepare", "prepareOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "onPrepare", "onRemoved", "prepare", "retry", "", "takeAffectedNode", "Lkotlinx/coroutines/internal/OpDescriptor;", "updatedNext", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static abstract class a extends k.b.j4.b {
        @Override // k.b.j4.b
        public final void a(@NotNull k.b.j4.d<?> dVar, @Nullable Object obj) {
            boolean z = obj == null;
            y h2 = h();
            if (h2 == null) {
                if (k.b.z0.b() && !(!z)) {
                    throw new AssertionError();
                }
                return;
            }
            y i2 = i();
            if (i2 == null) {
                if (k.b.z0.b() && !(!z)) {
                    throw new AssertionError();
                }
                return;
            }
            if (y.b.compareAndSet(h2, dVar, z ? n(h2, i2) : i2) && z) {
                f(h2, i2);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x0054, code lost:
            if (k.b.z0.b() == false) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0056, code lost:
            if (r4 != null) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0058, code lost:
            r7 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x005a, code lost:
            r7 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x005b, code lost:
            if (r7 == false) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0063, code lost:
            throw new java.lang.AssertionError();
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
            return null;
         */
        @Override // k.b.j4.b
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object c(@org.jetbrains.annotations.NotNull k.b.j4.d<?> r7) {
            /*
                r6 = this;
            L0:
                k.b.j4.y r0 = r6.m(r7)
                if (r0 != 0) goto L9
                java.lang.Object r7 = k.b.j4.c.b
                return r7
            L9:
                java.lang.Object r1 = r0._next
                r2 = 0
                if (r1 != r7) goto Lf
                return r2
            Lf:
                boolean r3 = r7.h()
                if (r3 == 0) goto L16
                return r2
            L16:
                boolean r3 = r1 instanceof k.b.j4.j0
                if (r3 == 0) goto L29
                k.b.j4.j0 r1 = (k.b.j4.j0) r1
                boolean r2 = r7.b(r1)
                if (r2 == 0) goto L25
                java.lang.Object r7 = k.b.j4.c.b
                return r7
            L25:
                r1.c(r0)
                goto L0
            L29:
                java.lang.Object r3 = r6.e(r0)
                if (r3 == 0) goto L30
                return r3
            L30:
                boolean r3 = r6.l(r0, r1)
                if (r3 == 0) goto L37
                goto L0
            L37:
                k.b.j4.y$d r3 = new k.b.j4.y$d
                r4 = r1
                k.b.j4.y r4 = (k.b.j4.y) r4
                r3.<init>(r0, r4, r6)
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = k.b.j4.y.b
                boolean r4 = r4.compareAndSet(r0, r1, r3)
                if (r4 == 0) goto L0
                java.lang.Object r4 = r3.c(r0)     // Catch: java.lang.Throwable -> L65
                java.lang.Object r5 = k.b.j4.z.f29477a     // Catch: java.lang.Throwable -> L65
                if (r4 != r5) goto L50
                goto L0
            L50:
                boolean r7 = k.b.z0.b()     // Catch: java.lang.Throwable -> L65
                if (r7 == 0) goto L64
                if (r4 != 0) goto L5a
                r7 = 1
                goto L5b
            L5a:
                r7 = 0
            L5b:
                if (r7 == 0) goto L5e
                goto L64
            L5e:
                java.lang.AssertionError r7 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L65
                r7.<init>()     // Catch: java.lang.Throwable -> L65
                throw r7     // Catch: java.lang.Throwable -> L65
            L64:
                return r2
            L65:
                r7 = move-exception
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = k.b.j4.y.b
                r2.compareAndSet(r0, r3, r1)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: k.b.j4.y.a.c(k.b.j4.d):java.lang.Object");
        }

        @Nullable
        public Object e(@NotNull y yVar) {
            return null;
        }

        public abstract void f(@NotNull y yVar, @NotNull y yVar2);

        public abstract void g(@NotNull d dVar);

        @Nullable
        public abstract y h();

        @Nullable
        public abstract y i();

        @Nullable
        public Object j(@NotNull d dVar) {
            g(dVar);
            return null;
        }

        public void k(@NotNull y yVar) {
        }

        public boolean l(@NotNull y yVar, @NotNull Object obj) {
            return false;
        }

        @Nullable
        public y m(@NotNull j0 j0Var) {
            y h2 = h();
            Intrinsics.checkNotNull(h2);
            return h2;
        }

        @NotNull
        public abstract Object n(@NotNull y yVar, @NotNull y yVar2);
    }

    /* compiled from: LockFreeLinkedList.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\b\u0016\u0018\u0000*\f\b\u0000\u0010\u0003*\u00060\u0001j\u0002`\u00022\u00020!B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0001j\u0002`\u0002\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000b\u001a\u00020\n2\n\u0010\b\u001a\u00060\u0001j\u0002`\u00022\n\u0010\t\u001a\u00060\u0001j\u0002`\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\u0007J\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\u00020\u00112\n\u0010\b\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\t\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0004¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0018\u001a\u00020\u00102\n\u0010\b\u001a\u00060\u0001j\u0002`\u00022\n\u0010\t\u001a\u00060\u0001j\u0002`\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u00028DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00028\u00008\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0018\u0010\u001f\u001a\u00060\u0001j\u0002`\u00028DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001bR\u0018\u0010\u0004\u001a\u00060\u0001j\u0002`\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001d¨\u0006 "}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", ExifInterface.GPS_DIRECTION_TRUE, "queue", "node", "<init>", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "affected", "next", "", "finishOnSuccess", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "prepareOp", "finishPrepare", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;)V", "", "", "retry", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Ljava/lang/Object;)Z", "Lkotlinx/coroutines/internal/OpDescriptor;", "op", "takeAffectedNode", "(Lkotlinx/coroutines/internal/OpDescriptor;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "updatedNext", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Ljava/lang/Object;", "getAffectedNode", "()Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "affectedNode", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "getOriginalNext", "originalNext", "kotlinx-coroutines-core", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AbstractAtomicDesc;"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class b<T extends y> extends a {

        /* renamed from: d  reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f29472d = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_affectedNode");
        @NotNull
        private volatile /* synthetic */ Object _affectedNode;
        @JvmField
        @NotNull
        public final y b;
        @JvmField
        @NotNull
        public final T c;

        public b(@NotNull y yVar, @NotNull T t) {
            this.b = yVar;
            this.c = t;
            if (k.b.z0.b()) {
                if (!(t._next == t && t._prev == t)) {
                    throw new AssertionError();
                }
            }
            this._affectedNode = null;
        }

        @Override // k.b.j4.y.a
        public void f(@NotNull y yVar, @NotNull y yVar2) {
            this.c.L(this.b);
        }

        @Override // k.b.j4.y.a
        public void g(@NotNull d dVar) {
            f29472d.compareAndSet(this, null, dVar.f29473a);
        }

        @Override // k.b.j4.y.a
        @Nullable
        public final y h() {
            return (y) this._affectedNode;
        }

        @Override // k.b.j4.y.a
        @NotNull
        public final y i() {
            return this.b;
        }

        @Override // k.b.j4.y.a
        public boolean l(@NotNull y yVar, @NotNull Object obj) {
            return obj != this.b;
        }

        @Override // k.b.j4.y.a
        @Nullable
        public final y m(@NotNull j0 j0Var) {
            return this.b.H(j0Var);
        }

        @Override // k.b.j4.y.a
        @NotNull
        public Object n(@NotNull y yVar, @NotNull y yVar2) {
            T t = this.c;
            y.c.compareAndSet(t, t, yVar);
            T t2 = this.c;
            y.b.compareAndSet(t2, t2, this.b);
            return this.c;
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\b!\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001B\u0011\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0002\u0010\u0005J\u001e\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0002j\u0002`\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u0014\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "Lkotlinx/coroutines/internal/AtomicOp;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "newNode", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "oldNext", "complete", "", "affected", "failure", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    @PublishedApi
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static abstract class c extends k.b.j4.d<y> {
        @JvmField
        @NotNull
        public final y b;
        @JvmField
        @Nullable
        public y c;

        public c(@NotNull y yVar) {
            this.b = yVar;
        }

        @Override // k.b.j4.d
        /* renamed from: j */
        public void d(@NotNull y yVar, @Nullable Object obj) {
            boolean z = obj == null;
            y yVar2 = z ? this.b : this.c;
            if (yVar2 != null && y.b.compareAndSet(yVar, this, yVar2) && z) {
                y yVar3 = this.b;
                y yVar4 = this.c;
                Intrinsics.checkNotNull(yVar4);
                yVar3.L(yVar4);
            }
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B%\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\r\u001a\u00020\u000eJ\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0002\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0002\u001a\u00060\u0003j\u0002`\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\u0006\u0012\u0002\b\u00030\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "Lkotlinx/coroutines/internal/OpDescriptor;", "affected", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "next", "desc", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AbstractAtomicDesc;", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AbstractAtomicDesc;)V", "atomicOp", "Lkotlinx/coroutines/internal/AtomicOp;", "getAtomicOp", "()Lkotlinx/coroutines/internal/AtomicOp;", "finishPrepare", "", "perform", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class d extends j0 {
        @JvmField
        @NotNull

        /* renamed from: a  reason: collision with root package name */
        public final y f29473a;
        @JvmField
        @NotNull
        public final y b;
        @JvmField
        @NotNull
        public final a c;

        public d(@NotNull y yVar, @NotNull y yVar2, @NotNull a aVar) {
            this.f29473a = yVar;
            this.b = yVar2;
            this.c = aVar;
        }

        @Override // k.b.j4.j0
        @NotNull
        public k.b.j4.d<?> a() {
            return this.c.b();
        }

        @Override // k.b.j4.j0
        @Nullable
        public Object c(@Nullable Object obj) {
            Object f2;
            Object obj2;
            if (k.b.z0.b()) {
                if (!(obj == this.f29473a)) {
                    throw new AssertionError();
                }
            }
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            y yVar = (y) obj;
            Object j2 = this.c.j(this);
            Object obj3 = z.f29477a;
            if (j2 == obj3) {
                y yVar2 = this.b;
                if (y.b.compareAndSet(yVar, this, yVar2.c0())) {
                    this.c.k(yVar);
                    yVar2.H(null);
                }
                return obj3;
            }
            if (j2 != null) {
                f2 = a().e(j2);
            } else {
                f2 = a().f();
            }
            if (f2 == k.b.j4.c.f29433a) {
                obj2 = a();
            } else if (f2 == null) {
                obj2 = this.c.n(yVar, this.b);
            } else {
                obj2 = this.b;
            }
            y.b.compareAndSet(yVar, this, obj2);
            return null;
        }

        public final void d() {
            this.c.g(this);
        }

        @Override // k.b.j4.j0
        @NotNull
        public String toString() {
            return "PrepareOp(op=" + a() + ')';
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020(B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u0003H\u0014¢\u0006\u0004\b\t\u0010\nJ'\u0010\r\u001a\u00020\f2\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u00032\n\u0010\u000b\u001a\u00060\u0002j\u0002`\u0003H\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0014\u001a\u00020\u00132\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u000b\u001a\u00020\bH\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00032\u0006\u0010\u0017\u001a\u00020\u0016H\u0004¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001a\u001a\u00020\b2\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u00032\n\u0010\u000b\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001e\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010 \u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010!R\u0017\u0010&\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode$RemoveFirstDesc;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "queue", "<init>", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "affected", "", "failure", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Ljava/lang/Object;", "next", "", "finishOnSuccess", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "prepareOp", "finishPrepare", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;)V", "", "retry", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Ljava/lang/Object;)Z", "Lkotlinx/coroutines/internal/OpDescriptor;", "op", "takeAffectedNode", "(Lkotlinx/coroutines/internal/OpDescriptor;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "updatedNext", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Ljava/lang/Object;", "getAffectedNode", "()Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "affectedNode", "getOriginalNext", "originalNext", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "getResult", "()Ljava/lang/Object;", "getResult$annotations", "()V", com.alipay.sdk.util.l.c, "kotlinx-coroutines-core", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AbstractAtomicDesc;"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class e<T> extends a {
        private static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_affectedNode");

        /* renamed from: d  reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f29474d = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_originalNext");
        @NotNull
        private volatile /* synthetic */ Object _affectedNode = null;
        @NotNull
        private volatile /* synthetic */ Object _originalNext = null;
        @JvmField
        @NotNull
        public final y b;

        public e(@NotNull y yVar) {
            this.b = yVar;
        }

        public static /* synthetic */ void p() {
        }

        @Override // k.b.j4.y.a
        @Nullable
        public Object e(@NotNull y yVar) {
            if (yVar == this.b) {
                return x.d();
            }
            return null;
        }

        @Override // k.b.j4.y.a
        public final void f(@NotNull y yVar, @NotNull y yVar2) {
            yVar2.H(null);
        }

        @Override // k.b.j4.y.a
        public void g(@NotNull d dVar) {
            c.compareAndSet(this, null, dVar.f29473a);
            f29474d.compareAndSet(this, null, dVar.b);
        }

        @Override // k.b.j4.y.a
        @Nullable
        public final y h() {
            return (y) this._affectedNode;
        }

        @Override // k.b.j4.y.a
        @Nullable
        public final y i() {
            return (y) this._originalNext;
        }

        @Override // k.b.j4.y.a
        public final boolean l(@NotNull y yVar, @NotNull Object obj) {
            if (obj instanceof l0) {
                ((l0) obj).f29449a.T();
                return true;
            }
            return false;
        }

        @Override // k.b.j4.y.a
        @Nullable
        public final y m(@NotNull j0 j0Var) {
            y yVar = this.b;
            while (true) {
                Object obj = yVar._next;
                if (obj instanceof j0) {
                    j0 j0Var2 = (j0) obj;
                    if (j0Var.b(j0Var2)) {
                        return null;
                    }
                    j0Var2.c(this.b);
                } else {
                    return (y) obj;
                }
            }
        }

        @Override // k.b.j4.y.a
        @NotNull
        public final Object n(@NotNull y yVar, @NotNull y yVar2) {
            return yVar2.c0();
        }

        public final T o() {
            T t = (T) h();
            Intrinsics.checkNotNull(t);
            return t;
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/internal/LockFreeLinkedListNode$makeCondAddOp$1", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "prepare", "", "affected", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 176)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class f extends c {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Function0<Boolean> f29476e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function0<Boolean> function0) {
            super(y.this);
            this.f29476e = function0;
        }

        @Override // k.b.j4.d
        @Nullable
        /* renamed from: k */
        public Object i(@NotNull y yVar) {
            if (this.f29476e.invoke().booleanValue()) {
                return null;
            }
            return x.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0048, code lost:
        if (k.b.j4.y.b.compareAndSet(r3, r2, ((k.b.j4.l0) r4).f29449a) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final k.b.j4.y H(k.b.j4.j0 r8) {
        /*
            r7 = this;
        L0:
            java.lang.Object r0 = r7._prev
            k.b.j4.y r0 = (k.b.j4.y) r0
            r1 = 0
            r2 = r0
        L6:
            r3 = r1
        L7:
            java.lang.Object r4 = r2._next
            if (r4 != r7) goto L18
            if (r0 != r2) goto Le
            return r2
        Le:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = k.b.j4.y.c
            boolean r0 = r1.compareAndSet(r7, r0, r2)
            if (r0 != 0) goto L17
            goto L0
        L17:
            return r2
        L18:
            boolean r5 = r7.U()
            if (r5 == 0) goto L1f
            return r1
        L1f:
            if (r4 != r8) goto L22
            return r2
        L22:
            boolean r5 = r4 instanceof k.b.j4.j0
            if (r5 == 0) goto L38
            if (r8 == 0) goto L32
            r0 = r4
            k.b.j4.j0 r0 = (k.b.j4.j0) r0
            boolean r0 = r8.b(r0)
            if (r0 == 0) goto L32
            return r1
        L32:
            k.b.j4.j0 r4 = (k.b.j4.j0) r4
            r4.c(r2)
            goto L0
        L38:
            boolean r5 = r4 instanceof k.b.j4.l0
            if (r5 == 0) goto L52
            if (r3 == 0) goto L4d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = k.b.j4.y.b
            k.b.j4.l0 r4 = (k.b.j4.l0) r4
            k.b.j4.y r4 = r4.f29449a
            boolean r2 = r5.compareAndSet(r3, r2, r4)
            if (r2 != 0) goto L4b
            goto L0
        L4b:
            r2 = r3
            goto L6
        L4d:
            java.lang.Object r2 = r2._prev
            k.b.j4.y r2 = (k.b.j4.y) r2
            goto L7
        L52:
            r3 = r4
            k.b.j4.y r3 = (k.b.j4.y) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: k.b.j4.y.H(k.b.j4.j0):k.b.j4.y");
    }

    private final y K(y yVar) {
        while (yVar.U()) {
            yVar = (y) yVar._prev;
        }
        return yVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(y yVar) {
        y yVar2;
        do {
            yVar2 = (y) yVar._prev;
            if (M() != yVar) {
                return;
            }
        } while (!c.compareAndSet(yVar, yVar2, this));
        if (U()) {
            yVar.H(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l0 c0() {
        l0 l0Var = (l0) this._removedRef;
        if (l0Var == null) {
            l0 l0Var2 = new l0(this);
            f29471d.lazySet(this, l0Var2);
            return l0Var2;
        }
        return l0Var;
    }

    public final void B(@NotNull y yVar) {
        do {
        } while (!R().F(yVar, this));
    }

    public final boolean C(@NotNull y yVar, @NotNull Function0<Boolean> function0) {
        int d0;
        f fVar = new f(function0);
        do {
            d0 = R().d0(yVar, this, fVar);
            if (d0 == 1) {
                return true;
            }
        } while (d0 != 2);
        return false;
    }

    public final boolean D(@NotNull y yVar, @NotNull Function1<? super y, Boolean> function1) {
        y R;
        do {
            R = R();
            if (!function1.invoke(R).booleanValue()) {
                return false;
            }
        } while (!R.F(yVar, this));
        return true;
    }

    public final boolean E(@NotNull y yVar, @NotNull Function1<? super y, Boolean> function1, @NotNull Function0<Boolean> function0) {
        int d0;
        f fVar = new f(function0);
        do {
            y R = R();
            if (!function1.invoke(R).booleanValue()) {
                return false;
            }
            d0 = R.d0(yVar, this, fVar);
            if (d0 == 1) {
                return true;
            }
        } while (d0 != 2);
        return false;
    }

    @PublishedApi
    public final boolean F(@NotNull y yVar, @NotNull y yVar2) {
        c.lazySet(yVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
        atomicReferenceFieldUpdater.lazySet(yVar, yVar2);
        if (atomicReferenceFieldUpdater.compareAndSet(this, yVar2, yVar)) {
            yVar.L(yVar2);
            return true;
        }
        return false;
    }

    public final boolean G(@NotNull y yVar) {
        c.lazySet(yVar, this);
        b.lazySet(yVar, this);
        while (M() == this) {
            if (b.compareAndSet(this, this, yVar)) {
                yVar.L(this);
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final <T extends y> b<T> I(@NotNull T t) {
        return new b<>(this, t);
    }

    @NotNull
    public final e<y> J() {
        return new e<>(this);
    }

    @NotNull
    public final Object M() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof j0)) {
                return obj;
            }
            ((j0) obj).c(this);
        }
    }

    @NotNull
    public final y Q() {
        return x.h(M());
    }

    @NotNull
    public final y R() {
        y H = H(null);
        return H == null ? K((y) this._prev) : H;
    }

    public final void S() {
        ((l0) M()).f29449a.T();
    }

    @PublishedApi
    public final void T() {
        y yVar = this;
        while (true) {
            Object M = yVar.M();
            if (!(M instanceof l0)) {
                yVar.H(null);
                return;
            }
            yVar = ((l0) M).f29449a;
        }
    }

    public boolean U() {
        return M() instanceof l0;
    }

    @PublishedApi
    @NotNull
    public final c V(@NotNull y yVar, @NotNull Function0<Boolean> function0) {
        return new f(function0);
    }

    @Nullable
    public y W() {
        Object M = M();
        l0 l0Var = M instanceof l0 ? (l0) M : null;
        if (l0Var == null) {
            return null;
        }
        return l0Var.f29449a;
    }

    public boolean X() {
        return b0() == null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [k.b.j4.y, T, java.lang.Object] */
    public final /* synthetic */ <T> T Z(Function1<? super T, Boolean> function1) {
        y b0;
        while (true) {
            y yVar = (y) M();
            if (yVar == this) {
                return null;
            }
            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
            if (!(yVar instanceof Object)) {
                return null;
            }
            if ((function1.invoke(yVar).booleanValue() && !yVar.U()) || (b0 = yVar.b0()) == null) {
                return yVar;
            }
            b0.T();
        }
    }

    @Nullable
    public final y a0() {
        while (true) {
            y yVar = (y) M();
            if (yVar == this) {
                return null;
            }
            if (yVar.X()) {
                return yVar;
            }
            yVar.S();
        }
    }

    @PublishedApi
    @Nullable
    public final y b0() {
        Object M;
        y yVar;
        do {
            M = M();
            if (M instanceof l0) {
                return ((l0) M).f29449a;
            }
            if (M == this) {
                return (y) M;
            }
            yVar = (y) M;
        } while (!b.compareAndSet(this, M, yVar.c0()));
        yVar.H(null);
        return null;
    }

    @PublishedApi
    public final int d0(@NotNull y yVar, @NotNull y yVar2, @NotNull c cVar) {
        c.lazySet(yVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
        atomicReferenceFieldUpdater.lazySet(yVar, yVar2);
        cVar.c = yVar2;
        if (atomicReferenceFieldUpdater.compareAndSet(this, yVar2, cVar)) {
            return cVar.c(this) == null ? 1 : 2;
        }
        return 0;
    }

    public final void e0(@NotNull y yVar, @NotNull y yVar2) {
        if (k.b.z0.b()) {
            if (!(yVar == this._prev)) {
                throw new AssertionError();
            }
        }
        if (k.b.z0.b()) {
            if (!(yVar2 == this._next)) {
                throw new AssertionError();
            }
        }
    }

    @NotNull
    public String toString() {
        return new PropertyReference0Impl(this) { // from class: k.b.j4.y.g
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            @Nullable
            public Object get() {
                return k.b.a1.a(this.receiver);
            }
        } + '@' + k.b.a1.b(this);
    }
}
