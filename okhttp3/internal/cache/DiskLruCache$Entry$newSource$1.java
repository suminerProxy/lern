package okhttp3.internal.cache;

import kotlin.Metadata;
import okhttp3.internal.cache.DiskLruCache;
import okio.ForwardingSource;
import okio.Source;

/* compiled from: DiskLruCache.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"okhttp3/internal/cache/DiskLruCache$Entry$newSource$1", "Lokio/ForwardingSource;", "", "close", "()V", "", "closed", "Z", "getClosed", "()Z", "setClosed", "(Z)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class DiskLruCache$Entry$newSource$1 extends ForwardingSource {
    public final /* synthetic */ Source $fileSource;
    private boolean closed;
    public final /* synthetic */ DiskLruCache.Entry this$0;

    public DiskLruCache$Entry$newSource$1(DiskLruCache.Entry entry, Source source, Source source2) {
    }

    @Override // okio.ForwardingSource, okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final boolean getClosed() {
    }

    public final void setClosed(boolean z) {
    }
}
