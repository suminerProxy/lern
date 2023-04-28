package okio;

import com.tencent.android.tpush.common.MessageKey;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: AsyncTimeout.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"okio/AsyncTimeout$sink$1", "Lokio/Sink;", "Lokio/Buffer;", MessageKey.MSG_SOURCE, "", "byteCount", "", "write", "(Lokio/Buffer;J)V", "flush", "()V", "close", "Lokio/AsyncTimeout;", "timeout", "()Lokio/AsyncTimeout;", "", "toString", "()Ljava/lang/String;", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class AsyncTimeout$sink$1 implements Sink {
    public final /* synthetic */ Sink $sink;
    public final /* synthetic */ AsyncTimeout this$0;

    public AsyncTimeout$sink$1(AsyncTimeout asyncTimeout, Sink sink) {
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() {
    }

    @Override // okio.Sink
    public /* bridge */ /* synthetic */ Timeout timeout() {
    }

    @NotNull
    public String toString() {
    }

    @Override // okio.Sink
    public void write(@NotNull Buffer buffer, long j2) {
    }

    @Override // okio.Sink
    @NotNull
    public AsyncTimeout timeout() {
    }
}
