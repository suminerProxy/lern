package k.b.g4;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.sobot.network.http.model.SobotProgress;
import java.util.concurrent.locks.ReentrantLock;
import k.b.g4.c;
import k.b.j4.c1;
import k.b.z0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ArrayChannel.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000BB9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012 \u0010\t\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00172\u0006\u0010\r\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010 \u001a\u00020\u00172\u0006\u0010\r\u001a\u00028\u00002\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u001eH\u0014¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0012H\u0014¢\u0006\u0004\b#\u0010$J\u0011\u0010%\u001a\u0004\u0018\u00010\u0017H\u0014¢\u0006\u0004\b%\u0010&J\u001d\u0010'\u001a\u0004\u0018\u00010\u00172\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u001eH\u0014¢\u0006\u0004\b'\u0010(J\u0019\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b*\u0010+R\u001e\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00102\u001a\u00020/8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00103R\u0016\u00104\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00103R\u0014\u00105\u001a\u00020\u00128DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u00107\u001a\u00020\u00128DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b7\u00106R\u0014\u00108\u001a\u00020\u00128DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b8\u00106R\u0014\u00109\u001a\u00020\u00128DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b9\u00106R\u0014\u0010:\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u00106R\u0014\u0010;\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u00106R\u0018\u0010>\u001a\u00060<j\u0002`=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010@¨\u0006A"}, d2 = {"Lkotlinx/coroutines/channels/ArrayChannel;", ExifInterface.LONGITUDE_EAST, "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(ILkotlinx/coroutines/channels/BufferOverflow;Lkotlin/jvm/functions/Function1;)V", SobotProgress.CURRENT_SIZE, "element", "enqueueElement", "(ILjava/lang/Object;)V", "Lkotlinx/coroutines/channels/Receive;", "receive", "", "enqueueReceiveInternal", "(Lkotlinx/coroutines/channels/Receive;)Z", "Lkotlinx/coroutines/channels/Send;", "send", "", "enqueueSend", "(Lkotlinx/coroutines/channels/Send;)Ljava/lang/Object;", "ensureCapacity", "(I)V", "offerInternal", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "offerSelectInternal", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;)Ljava/lang/Object;", "wasClosed", "onCancelIdempotent", "(Z)V", "pollInternal", "()Ljava/lang/Object;", "pollSelectInternal", "(Lkotlinx/coroutines/selects/SelectInstance;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/Symbol;", "updateBufferSize", "(I)Lkotlinx/coroutines/internal/Symbol;", "", "buffer", "[Ljava/lang/Object;", "", "getBufferDebugString", "()Ljava/lang/String;", "bufferDebugString", "I", TtmlNode.TAG_HEAD, "isBufferAlwaysEmpty", "()Z", "isBufferAlwaysFull", "isBufferEmpty", "isBufferFull", "isClosedForReceive", "isEmpty", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/channels/BufferOverflow;", "kotlinx-coroutines-core", "Lkotlinx/coroutines/channels/AbstractChannel;"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class h<E> extends k.b.g4.a<E> {

    /* renamed from: e  reason: collision with root package name */
    private final int f29274e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final m f29275f;
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    private final ReentrantLock f29276g;
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    private Object[] f29277h;

    /* renamed from: i  reason: collision with root package name */
    private int f29278i;
    @NotNull
    private volatile /* synthetic */ int size;

    /* compiled from: ArrayChannel.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f29279a = null;
    }

    public h(int i2, @NotNull m mVar, @Nullable Function1<? super E, Unit> function1) {
        super(function1);
        this.f29274e = i2;
        this.f29275f = mVar;
        if (i2 >= 1) {
            this.f29276g = new ReentrantLock();
            Object[] objArr = new Object[Math.min(i2, 8)];
            ArraysKt___ArraysJvmKt.fill$default(objArr, b.c, 0, 0, 6, (Object) null);
            this.f29277h = objArr;
            this.size = 0;
            return;
        }
        throw new IllegalArgumentException(("ArrayChannel capacity must be at least 1, but " + i2 + " was specified").toString());
    }

    private final void s0(int i2, E e2) {
        if (i2 < this.f29274e) {
            t0(i2);
            Object[] objArr = this.f29277h;
            objArr[(this.f29278i + i2) % objArr.length] = e2;
            return;
        }
        if (z0.b()) {
            if (!(this.f29275f == m.DROP_OLDEST)) {
                throw new AssertionError();
            }
        }
        Object[] objArr2 = this.f29277h;
        int i3 = this.f29278i;
        objArr2[i3 % objArr2.length] = null;
        objArr2[(i2 + i3) % objArr2.length] = e2;
        this.f29278i = (i3 + 1) % objArr2.length;
    }

    private final void t0(int i2) {
        Object[] objArr = this.f29277h;
        if (i2 >= objArr.length) {
            int min = Math.min(objArr.length * 2, this.f29274e);
            Object[] objArr2 = new Object[min];
            for (int i3 = 0; i3 < i2; i3++) {
                Object[] objArr3 = this.f29277h;
                objArr2[i3] = objArr3[(this.f29278i + i3) % objArr3.length];
            }
            ArraysKt___ArraysJvmKt.fill((k.b.j4.q0[]) objArr2, b.c, i2, min);
            this.f29277h = objArr2;
            this.f29278i = 0;
        }
    }

    private final k.b.j4.q0 u0(int i2) {
        if (i2 < this.f29274e) {
            this.size = i2 + 1;
            return null;
        }
        int i3 = a.f29279a[this.f29275f.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            return b.f29252d;
        }
        return b.f29253e;
    }

    @Override // k.b.g4.c
    @NotNull
    public Object C(E e2) {
        j0<E> P;
        k.b.j4.q0 v;
        ReentrantLock reentrantLock = this.f29276g;
        reentrantLock.lock();
        try {
            int i2 = this.size;
            w<?> o2 = o();
            if (o2 == null) {
                k.b.j4.q0 u0 = u0(i2);
                if (u0 == null) {
                    if (i2 == 0) {
                        do {
                            P = P();
                            if (P != null) {
                                if (P instanceof w) {
                                    this.size = i2;
                                    return P;
                                }
                                v = P.v(e2, null);
                            }
                        } while (v == null);
                        if (z0.b()) {
                            if (!(v == k.b.t.f29646d)) {
                                throw new AssertionError();
                            }
                        }
                        this.size = i2;
                        Unit unit = Unit.INSTANCE;
                        reentrantLock.unlock();
                        P.k(e2);
                        return P.c();
                    }
                    s0(i2, e2);
                    return b.f29252d;
                }
                return u0;
            }
            return o2;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // k.b.g4.c
    @NotNull
    public Object E(E e2, @NotNull k.b.o4.f<?> fVar) {
        ReentrantLock reentrantLock = this.f29276g;
        reentrantLock.lock();
        try {
            int i2 = this.size;
            w<?> o2 = o();
            if (o2 == null) {
                k.b.j4.q0 u0 = u0(i2);
                if (u0 == null) {
                    if (i2 == 0) {
                        while (true) {
                            c.d<E> k2 = k(e2);
                            Object u = fVar.u(k2);
                            if (u == null) {
                                this.size = i2;
                                j0<? super E> o3 = k2.o();
                                Unit unit = Unit.INSTANCE;
                                reentrantLock.unlock();
                                Intrinsics.checkNotNull(o3);
                                j0<? super E> j0Var = o3;
                                j0Var.k(e2);
                                return j0Var.c();
                            } else if (u == b.f29253e) {
                                break;
                            } else if (u != k.b.j4.c.b) {
                                if (u != k.b.o4.g.d() && !(u instanceof w)) {
                                    throw new IllegalStateException(Intrinsics.stringPlus("performAtomicTrySelect(describeTryOffer) returned ", u).toString());
                                }
                                this.size = i2;
                                return u;
                            }
                        }
                    }
                    if (!fVar.o()) {
                        this.size = i2;
                        return k.b.o4.g.d();
                    }
                    s0(i2, e2);
                    return b.f29252d;
                }
                return u0;
            }
            return o2;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // k.b.g4.a
    public boolean c0(@NotNull h0<? super E> h0Var) {
        ReentrantLock reentrantLock = this.f29276g;
        reentrantLock.lock();
        try {
            return super.c0(h0Var);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // k.b.g4.a
    public final boolean f0() {
        return false;
    }

    @Override // k.b.g4.a
    public final boolean g0() {
        return this.size == 0;
    }

    @Override // k.b.g4.a, k.b.g4.i0
    public boolean i() {
        ReentrantLock reentrantLock = this.f29276g;
        reentrantLock.lock();
        try {
            return super.i();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // k.b.g4.a
    public void i0(boolean z) {
        Function1<E, Unit> function1 = this.b;
        ReentrantLock reentrantLock = this.f29276g;
        reentrantLock.lock();
        try {
            int i2 = this.size;
            c1 c1Var = null;
            int i3 = 0;
            while (i3 < i2) {
                i3++;
                Object obj = this.f29277h[this.f29278i];
                if (function1 != null && obj != b.c) {
                    c1Var = k.b.j4.i0.c(function1, obj, c1Var);
                }
                Object[] objArr = this.f29277h;
                int i4 = this.f29278i;
                objArr[i4] = b.c;
                this.f29278i = (i4 + 1) % objArr.length;
            }
            this.size = 0;
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            super.i0(z);
            if (c1Var != null) {
                throw c1Var;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // k.b.g4.a, k.b.g4.i0
    public boolean isEmpty() {
        ReentrantLock reentrantLock = this.f29276g;
        reentrantLock.lock();
        try {
            return h0();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // k.b.g4.c
    @Nullable
    public Object l(@NotNull l0 l0Var) {
        ReentrantLock reentrantLock = this.f29276g;
        reentrantLock.lock();
        try {
            return super.l(l0Var);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // k.b.g4.c
    @NotNull
    public String m() {
        return "(buffer:capacity=" + this.f29274e + ",size=" + this.size + ')';
    }

    @Override // k.b.g4.a
    @Nullable
    public Object m0() {
        ReentrantLock reentrantLock = this.f29276g;
        reentrantLock.lock();
        try {
            int i2 = this.size;
            if (i2 == 0) {
                Object o2 = o();
                if (o2 == null) {
                    o2 = b.f29254f;
                }
                return o2;
            }
            Object[] objArr = this.f29277h;
            int i3 = this.f29278i;
            Object obj = objArr[i3];
            l0 l0Var = null;
            objArr[i3] = null;
            this.size = i2 - 1;
            Object obj2 = b.f29254f;
            if (i2 == this.f29274e) {
                l0 l0Var2 = null;
                while (true) {
                    l0 S = S();
                    if (S == null) {
                        l0Var = l0Var2;
                        break;
                    }
                    k.b.j4.q0 i0 = S.i0(null);
                    if (i0 != null) {
                        if (z0.b()) {
                            if (!(i0 == k.b.t.f29646d)) {
                                throw new AssertionError();
                            }
                        }
                        obj2 = S.g0();
                        r6 = true;
                        l0Var = S;
                    } else {
                        S.j0();
                        l0Var2 = S;
                    }
                }
            }
            if (obj2 != b.f29254f && !(obj2 instanceof w)) {
                this.size = i2;
                Object[] objArr2 = this.f29277h;
                objArr2[(this.f29278i + i2) % objArr2.length] = obj2;
            }
            this.f29278i = (this.f29278i + 1) % this.f29277h.length;
            Unit unit = Unit.INSTANCE;
            if (r6) {
                Intrinsics.checkNotNull(l0Var);
                l0Var.f0();
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0092 A[Catch: all -> 0x00bb, TRY_LEAVE, TryCatch #0 {all -> 0x00bb, blocks: (B:3:0x0005, B:5:0x0009, B:7:0x000f, B:10:0x0015, B:12:0x0029, B:14:0x0033, B:32:0x0078, B:34:0x007c, B:36:0x0080, B:42:0x00a2, B:37:0x008c, B:39:0x0092, B:15:0x0043, B:18:0x0048, B:21:0x004d, B:23:0x0053, B:26:0x005f, B:29:0x0067, B:30:0x0076), top: B:50:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b2  */
    @Override // k.b.g4.a
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object n0(@org.jetbrains.annotations.NotNull k.b.o4.f<?> r9) {
        /*
            r8 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r8.f29276g
            r0.lock()
            int r1 = r8.size     // Catch: java.lang.Throwable -> Lbb
            if (r1 != 0) goto L15
            k.b.g4.w r9 = r8.o()     // Catch: java.lang.Throwable -> Lbb
            if (r9 != 0) goto L11
            k.b.j4.q0 r9 = k.b.g4.b.f29254f     // Catch: java.lang.Throwable -> Lbb
        L11:
            r0.unlock()
            return r9
        L15:
            java.lang.Object[] r2 = r8.f29277h     // Catch: java.lang.Throwable -> Lbb
            int r3 = r8.f29278i     // Catch: java.lang.Throwable -> Lbb
            r4 = r2[r3]     // Catch: java.lang.Throwable -> Lbb
            r5 = 0
            r2[r3] = r5     // Catch: java.lang.Throwable -> Lbb
            int r2 = r1 + (-1)
            r8.size = r2     // Catch: java.lang.Throwable -> Lbb
            k.b.j4.q0 r2 = k.b.g4.b.f29254f     // Catch: java.lang.Throwable -> Lbb
            int r3 = r8.f29274e     // Catch: java.lang.Throwable -> Lbb
            r6 = 1
            if (r1 != r3) goto L77
        L29:
            k.b.g4.a$g r3 = r8.a0()     // Catch: java.lang.Throwable -> Lbb
            java.lang.Object r7 = r9.u(r3)     // Catch: java.lang.Throwable -> Lbb
            if (r7 != 0) goto L43
            java.lang.Object r5 = r3.o()     // Catch: java.lang.Throwable -> Lbb
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)     // Catch: java.lang.Throwable -> Lbb
            r2 = r5
            k.b.g4.l0 r2 = (k.b.g4.l0) r2     // Catch: java.lang.Throwable -> Lbb
            java.lang.Object r2 = r2.g0()     // Catch: java.lang.Throwable -> Lbb
            r3 = r6
            goto L78
        L43:
            k.b.j4.q0 r3 = k.b.g4.b.f29254f     // Catch: java.lang.Throwable -> Lbb
            if (r7 != r3) goto L48
            goto L77
        L48:
            java.lang.Object r3 = k.b.j4.c.b     // Catch: java.lang.Throwable -> Lbb
            if (r7 != r3) goto L4d
            goto L29
        L4d:
            java.lang.Object r2 = k.b.o4.g.d()     // Catch: java.lang.Throwable -> Lbb
            if (r7 != r2) goto L5f
            r8.size = r1     // Catch: java.lang.Throwable -> Lbb
            java.lang.Object[] r9 = r8.f29277h     // Catch: java.lang.Throwable -> Lbb
            int r1 = r8.f29278i     // Catch: java.lang.Throwable -> Lbb
            r9[r1] = r4     // Catch: java.lang.Throwable -> Lbb
            r0.unlock()
            return r7
        L5f:
            boolean r2 = r7 instanceof k.b.g4.w     // Catch: java.lang.Throwable -> Lbb
            if (r2 == 0) goto L67
            r3 = r6
            r2 = r7
            r5 = r2
            goto L78
        L67:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r1 = "performAtomicTrySelect(describeTryOffer) returned "
            java.lang.String r1 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r7)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lbb
            r9.<init>(r1)     // Catch: java.lang.Throwable -> Lbb
            throw r9     // Catch: java.lang.Throwable -> Lbb
        L77:
            r3 = 0
        L78:
            k.b.j4.q0 r7 = k.b.g4.b.f29254f     // Catch: java.lang.Throwable -> Lbb
            if (r2 == r7) goto L8c
            boolean r7 = r2 instanceof k.b.g4.w     // Catch: java.lang.Throwable -> Lbb
            if (r7 != 0) goto L8c
            r8.size = r1     // Catch: java.lang.Throwable -> Lbb
            java.lang.Object[] r9 = r8.f29277h     // Catch: java.lang.Throwable -> Lbb
            int r7 = r8.f29278i     // Catch: java.lang.Throwable -> Lbb
            int r7 = r7 + r1
            int r1 = r9.length     // Catch: java.lang.Throwable -> Lbb
            int r7 = r7 % r1
            r9[r7] = r2     // Catch: java.lang.Throwable -> Lbb
            goto La2
        L8c:
            boolean r9 = r9.o()     // Catch: java.lang.Throwable -> Lbb
            if (r9 != 0) goto La2
            r8.size = r1     // Catch: java.lang.Throwable -> Lbb
            java.lang.Object[] r9 = r8.f29277h     // Catch: java.lang.Throwable -> Lbb
            int r1 = r8.f29278i     // Catch: java.lang.Throwable -> Lbb
            r9[r1] = r4     // Catch: java.lang.Throwable -> Lbb
            java.lang.Object r9 = k.b.o4.g.d()     // Catch: java.lang.Throwable -> Lbb
            r0.unlock()
            return r9
        La2:
            int r9 = r8.f29278i     // Catch: java.lang.Throwable -> Lbb
            int r9 = r9 + r6
            java.lang.Object[] r1 = r8.f29277h     // Catch: java.lang.Throwable -> Lbb
            int r1 = r1.length     // Catch: java.lang.Throwable -> Lbb
            int r9 = r9 % r1
            r8.f29278i = r9     // Catch: java.lang.Throwable -> Lbb
            kotlin.Unit r9 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lbb
            r0.unlock()
            if (r3 == 0) goto Lba
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            k.b.g4.l0 r5 = (k.b.g4.l0) r5
            r5.f0()
        Lba:
            return r4
        Lbb:
            r9 = move-exception
            r0.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: k.b.g4.h.n0(k.b.o4.f):java.lang.Object");
    }

    @Override // k.b.g4.c
    public final boolean y() {
        return false;
    }

    @Override // k.b.g4.c
    public final boolean z() {
        return this.size == this.f29274e && this.f29275f == m.SUSPEND;
    }
}
