package k.b;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: JobSupport.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016*\u0004\u0018\u00010\u0016H\u0000\u001a\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0016*\u0004\u0018\u00010\u0016H\u0000\"\u0016\u0010\u0000\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0004\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0003\"\u0016\u0010\u0006\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0003\"\u0016\u0010\b\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u0003\"\u0016\u0010\u000b\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\u0003\"\u000e\u0010\r\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0010\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0011\u0010\u0003\"\u0016\u0010\u0012\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0013\u0010\u0003\"\u000e\u0010\u0014\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"COMPLETING_ALREADY", "Lkotlinx/coroutines/internal/Symbol;", "getCOMPLETING_ALREADY$annotations", "()V", "COMPLETING_RETRY", "getCOMPLETING_RETRY$annotations", "COMPLETING_WAITING_CHILDREN", "getCOMPLETING_WAITING_CHILDREN$annotations", "EMPTY_ACTIVE", "Lkotlinx/coroutines/Empty;", "getEMPTY_ACTIVE$annotations", "EMPTY_NEW", "getEMPTY_NEW$annotations", "FALSE", "", "RETRY", "SEALED", "getSEALED$annotations", "TOO_LATE_TO_CANCEL", "getTOO_LATE_TO_CANCEL$annotations", "TRUE", "boxIncomplete", "", "unboxState", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class w2 {

    /* renamed from: e  reason: collision with root package name */
    private static final int f29668e = -1;

    /* renamed from: f  reason: collision with root package name */
    private static final int f29669f = 0;

    /* renamed from: g  reason: collision with root package name */
    private static final int f29670g = 1;
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    private static final k.b.j4.q0 f29666a = new k.b.j4.q0("COMPLETING_ALREADY");
    @JvmField
    @NotNull
    public static final k.b.j4.q0 b = new k.b.j4.q0("COMPLETING_WAITING_CHILDREN");
    @NotNull
    private static final k.b.j4.q0 c = new k.b.j4.q0("COMPLETING_RETRY");
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private static final k.b.j4.q0 f29667d = new k.b.j4.q0("TOO_LATE_TO_CANCEL");
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    private static final k.b.j4.q0 f29671h = new k.b.j4.q0("SEALED");
    @NotNull

    /* renamed from: i  reason: collision with root package name */
    private static final s1 f29672i = new s1(false);
    @NotNull

    /* renamed from: j  reason: collision with root package name */
    private static final s1 f29673j = new s1(true);

    @Nullable
    public static final Object g(@Nullable Object obj) {
        return obj instanceof g2 ? new h2((g2) obj) : obj;
    }

    private static /* synthetic */ void h() {
    }

    private static /* synthetic */ void i() {
    }

    public static /* synthetic */ void j() {
    }

    private static /* synthetic */ void k() {
    }

    private static /* synthetic */ void l() {
    }

    private static /* synthetic */ void m() {
    }

    private static /* synthetic */ void n() {
    }

    @Nullable
    public static final Object o(@Nullable Object obj) {
        g2 g2Var;
        h2 h2Var = obj instanceof h2 ? (h2) obj : null;
        return (h2Var == null || (g2Var = h2Var.f29304a) == null) ? obj : g2Var;
    }
}
