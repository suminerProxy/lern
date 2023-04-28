package okio;

import com.tencent.android.tpush.common.MessageKey;
import java.io.IOException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

/* compiled from: ForwardingSink.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0014\u001a\u00020\u00018\u0007@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0018"}, d2 = {"Lokio/ForwardingSink;", "Lokio/Sink;", "Lokio/Buffer;", MessageKey.MSG_SOURCE, "", "byteCount", "", "write", "(Lokio/Buffer;J)V", "flush", "()V", "Lokio/Timeout;", "timeout", "()Lokio/Timeout;", "close", "", "toString", "()Ljava/lang/String;", "-deprecated_delegate", "()Lokio/Sink;", "delegate", "Lokio/Sink;", "<init>", "(Lokio/Sink;)V", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public abstract class ForwardingSink implements Sink {
    @NotNull
    private final Sink delegate;

    public ForwardingSink(@NotNull Sink sink) {
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "delegate", imports = {}))
    @JvmName(name = "-deprecated_delegate")
    @NotNull
    /* renamed from: -deprecated_delegate  reason: not valid java name */
    public final Sink m1623deprecated_delegate() {
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @JvmName(name = "delegate")
    @NotNull
    public final Sink delegate() {
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() throws IOException {
    }

    @Override // okio.Sink
    @NotNull
    public Timeout timeout() {
    }

    @NotNull
    public String toString() {
    }

    @Override // okio.Sink
    public void write(@NotNull Buffer buffer, long j2) throws IOException {
    }
}
