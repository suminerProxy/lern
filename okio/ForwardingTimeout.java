package okio;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

/* compiled from: ForwardingTimeout.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0019\u0010\u0018J\u0015\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0006\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0002\u001a\u00020\u00018\u0007@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010\u0017\u001a\u0004\b\u0002\u0010\u0012\"\u0004\b\u0003\u0010\u0018¨\u0006\u001a"}, d2 = {"Lokio/ForwardingTimeout;", "Lokio/Timeout;", "delegate", "setDelegate", "(Lokio/Timeout;)Lokio/ForwardingTimeout;", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "(JLjava/util/concurrent/TimeUnit;)Lokio/Timeout;", "timeoutNanos", "()J", "", "hasDeadline", "()Z", "deadlineNanoTime", "(J)Lokio/Timeout;", "clearTimeout", "()Lokio/Timeout;", "clearDeadline", "", "throwIfReached", "()V", "Lokio/Timeout;", "(Lokio/Timeout;)V", "<init>", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class ForwardingTimeout extends Timeout {
    @NotNull
    private Timeout delegate;

    public ForwardingTimeout(@NotNull Timeout timeout) {
    }

    @Override // okio.Timeout
    @NotNull
    public Timeout clearDeadline() {
    }

    @Override // okio.Timeout
    @NotNull
    public Timeout clearTimeout() {
    }

    @Override // okio.Timeout
    public long deadlineNanoTime() {
    }

    @JvmName(name = "delegate")
    @NotNull
    public final Timeout delegate() {
    }

    @Override // okio.Timeout
    public boolean hasDeadline() {
    }

    /* renamed from: setDelegate  reason: collision with other method in class */
    public final /* synthetic */ void m1625setDelegate(@NotNull Timeout timeout) {
    }

    @Override // okio.Timeout
    public void throwIfReached() throws IOException {
    }

    @Override // okio.Timeout
    @NotNull
    public Timeout timeout(long j2, @NotNull TimeUnit timeUnit) {
    }

    @Override // okio.Timeout
    public long timeoutNanos() {
    }

    @Override // okio.Timeout
    @NotNull
    public Timeout deadlineNanoTime(long j2) {
    }

    @NotNull
    public final ForwardingTimeout setDelegate(@NotNull Timeout timeout) {
    }
}
