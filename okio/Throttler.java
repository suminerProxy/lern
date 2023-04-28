package okio;

import com.tencent.android.tpush.common.MessageKey;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;

/* compiled from: Throttler.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\tB\t\b\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010\u0003\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ+\u0010\n\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\n\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000f\u0010\u0004J\u001f\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001bR\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001bR\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001b¨\u0006\u001f"}, d2 = {"Lokio/Throttler;", "", "", "nanosToBytes", "(J)J", "bytesToNanos", "nanosToWait", "", "waitNanos", "(J)V", "bytesPerSecond", "waitByteCount", "maxByteCount", "(JJJ)V", "byteCount", "take$okio", "take", "now", "byteCountOrWaitNanos$okio", "(JJ)J", "byteCountOrWaitNanos", "Lokio/Source;", MessageKey.MSG_SOURCE, "(Lokio/Source;)Lokio/Source;", "Lokio/Sink;", "sink", "(Lokio/Sink;)Lokio/Sink;", "J", "allocatedUntil", "<init>", "()V", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class Throttler {
    private long allocatedUntil;
    private long bytesPerSecond;
    private long maxByteCount;
    private long waitByteCount;

    public Throttler(long j2) {
    }

    public static /* synthetic */ void bytesPerSecond$default(Throttler throttler, long j2, long j3, long j4, int i2, Object obj) {
    }

    private final long bytesToNanos(long j2) {
    }

    private final long nanosToBytes(long j2) {
    }

    private final void waitNanos(long j2) {
    }

    public final long byteCountOrWaitNanos$okio(long j2, long j3) {
    }

    @JvmOverloads
    public final void bytesPerSecond(long j2) {
    }

    @JvmOverloads
    public final void bytesPerSecond(long j2, long j3) {
    }

    @JvmOverloads
    public final void bytesPerSecond(long j2, long j3, long j4) {
    }

    @NotNull
    public final Sink sink(@NotNull Sink sink) {
    }

    @NotNull
    public final Source source(@NotNull Source source) {
    }

    public final long take$okio(long j2) {
    }

    public Throttler() {
    }
}
