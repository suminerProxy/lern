package k.b;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: CompletionState.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0000\b\u0010\u0018\u00002\u00020\u000fB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\fR\u0011\u0010\u0004\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\r\u0010\b¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/CompletedExceptionally;", "", "cause", "", "handled", "<init>", "(Ljava/lang/Throwable;Z)V", "makeHandled", "()Z", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Throwable;", "getHandled", "kotlinx-coroutines-core", ""}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class f0 {
    private static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(f0.class, "_handled");
    @NotNull
    private volatile /* synthetic */ int _handled;
    @JvmField
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f29231a;

    public f0(@NotNull Throwable th, boolean z) {
        this.f29231a = th;
        this._handled = z ? 1 : 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean a() {
        return this._handled;
    }

    public final boolean b() {
        return b.compareAndSet(this, 0, 1);
    }

    @NotNull
    public String toString() {
        return a1.a(this) + '[' + this.f29231a + ']';
    }

    public /* synthetic */ f0(Throwable th, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, (i2 & 2) != 0 ? false : z);
    }
}
