package okio;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: AsyncTimeout.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"okio/AsyncTimeout$source$1", "Lokio/Source;", "Lokio/Buffer;", "sink", "", "byteCount", "read", "(Lokio/Buffer;J)J", "", "close", "()V", "Lokio/AsyncTimeout;", "timeout", "()Lokio/AsyncTimeout;", "", "toString", "()Ljava/lang/String;", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class AsyncTimeout$source$1 implements Source {
    public final /* synthetic */ Source $source;
    public final /* synthetic */ AsyncTimeout this$0;

    public AsyncTimeout$source$1(AsyncTimeout asyncTimeout, Source source) {
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // okio.Source
    public long read(@NotNull Buffer buffer, long j2) {
    }

    @Override // okio.Source
    public /* bridge */ /* synthetic */ Timeout timeout() {
    }

    @NotNull
    public String toString() {
    }

    @Override // okio.Source
    @NotNull
    public AsyncTimeout timeout() {
    }
}
