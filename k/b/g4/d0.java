package k.b.g4;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Objects;
import k.b.g4.c;
import k.b.j4.c1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LinkedListChannel.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B'\u0012 \u0010\u0003\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0006¢\u0006\u0002\u0010\u0007J\u0015\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u0011J!\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u00002\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0014¢\u0006\u0002\u0010\u0015J/\u0010\u0016\u001a\u00020\u00052\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u001bH\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\b\u001a\u00020\t8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\nR\u0014\u0010\u000b\u001a\u00020\t8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\t8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\t8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\n\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Lkotlinx/coroutines/channels/LinkedListChannel;", ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/channels/AbstractChannel;", "onUndeliveredElement", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "(Lkotlin/jvm/functions/Function1;)V", "isBufferAlwaysEmpty", "", "()Z", "isBufferAlwaysFull", "isBufferEmpty", "isBufferFull", "offerInternal", "", "element", "(Ljava/lang/Object;)Ljava/lang/Object;", "offerSelectInternal", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;)Ljava/lang/Object;", "onCancelIdempotentList", "list", "Lkotlinx/coroutines/internal/InlineList;", "Lkotlinx/coroutines/channels/Send;", "closed", "Lkotlinx/coroutines/channels/Closed;", "onCancelIdempotentList-w-w6eGU", "(Ljava/lang/Object;Lkotlinx/coroutines/channels/Closed;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class d0<E> extends a<E> {
    public d0(@Nullable Function1<? super E, Unit> function1) {
        super(function1);
    }

    @Override // k.b.g4.c
    @NotNull
    public Object C(E e2) {
        j0<?> N;
        do {
            Object C = super.C(e2);
            k.b.j4.q0 q0Var = b.f29252d;
            if (C == q0Var) {
                return q0Var;
            }
            if (C == b.f29253e) {
                N = N(e2);
                if (N == null) {
                    return q0Var;
                }
            } else if (C instanceof w) {
                return C;
            } else {
                throw new IllegalStateException(Intrinsics.stringPlus("Invalid offerInternal result ", C).toString());
            }
        } while (!(N instanceof w));
        return N;
    }

    @Override // k.b.g4.c
    @NotNull
    public Object E(E e2, @NotNull k.b.o4.f<?> fVar) {
        Object u;
        while (true) {
            if (e0()) {
                u = super.E(e2, fVar);
            } else {
                u = fVar.u(j(e2));
                if (u == null) {
                    u = b.f29252d;
                }
            }
            if (u == k.b.o4.g.d()) {
                return k.b.o4.g.d();
            }
            k.b.j4.q0 q0Var = b.f29252d;
            if (u == q0Var) {
                return q0Var;
            }
            if (u != b.f29253e && u != k.b.j4.c.b) {
                if (u instanceof w) {
                    return u;
                }
                throw new IllegalStateException(Intrinsics.stringPlus("Invalid result ", u).toString());
            }
        }
    }

    @Override // k.b.g4.a
    public final boolean f0() {
        return true;
    }

    @Override // k.b.g4.a
    public final boolean g0() {
        return true;
    }

    @Override // k.b.g4.a
    public void j0(@NotNull Object obj, @NotNull w<?> wVar) {
        c1 c1Var = null;
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                l0 l0Var = (l0) obj;
                if (l0Var instanceof c.a) {
                    Function1<E, Unit> function1 = this.b;
                    if (function1 != null) {
                        c1Var = k.b.j4.i0.c(function1, ((c.a) l0Var).f29259e, null);
                    }
                } else {
                    l0Var.h0(wVar);
                }
            } else {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    c1 c1Var2 = null;
                    while (true) {
                        int i2 = size - 1;
                        l0 l0Var2 = (l0) arrayList.get(size);
                        if (l0Var2 instanceof c.a) {
                            Function1<E, Unit> function12 = this.b;
                            c1Var2 = function12 == null ? null : k.b.j4.i0.c(function12, ((c.a) l0Var2).f29259e, c1Var2);
                        } else {
                            l0Var2.h0(wVar);
                        }
                        if (i2 < 0) {
                            break;
                        }
                        size = i2;
                    }
                    c1Var = c1Var2;
                }
            }
        }
        if (c1Var != null) {
            throw c1Var;
        }
    }

    @Override // k.b.g4.c
    public final boolean y() {
        return false;
    }

    @Override // k.b.g4.c
    public final boolean z() {
        return false;
    }
}
