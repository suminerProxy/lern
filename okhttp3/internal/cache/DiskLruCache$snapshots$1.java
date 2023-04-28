package okhttp3.internal.cache;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableIterator;
import okhttp3.internal.cache.DiskLruCache;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DiskLruCache.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001J\u0010\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\u0007\u001a\u00060\u0002R\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR(\u0010\f\u001a\b\u0018\u00010\u0002R\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\b\"\u0004\b\u000f\u0010\u0010R(\u0010\u0011\u001a\b\u0018\u00010\u0002R\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\u0010R/\u0010\u0016\u001a\u0018\u0012\u0014\u0012\u0012 \u0015*\b\u0018\u00010\u0014R\u00020\u00030\u0014R\u00020\u00030\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"okhttp3/internal/cache/DiskLruCache$snapshots$1", "", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "", "hasNext", "()Z", "next", "()Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "", "remove", "()V", "removeSnapshot", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "getRemoveSnapshot", "setRemoveSnapshot", "(Lokhttp3/internal/cache/DiskLruCache$Snapshot;)V", "nextSnapshot", "getNextSnapshot", "setNextSnapshot", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "kotlin.jvm.PlatformType", "delegate", "Ljava/util/Iterator;", "getDelegate", "()Ljava/util/Iterator;", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class DiskLruCache$snapshots$1 implements Iterator<DiskLruCache.Snapshot>, KMutableIterator {
    @NotNull
    private final Iterator<DiskLruCache.Entry> delegate;
    @Nullable
    private DiskLruCache.Snapshot nextSnapshot;
    @Nullable
    private DiskLruCache.Snapshot removeSnapshot;
    public final /* synthetic */ DiskLruCache this$0;

    public DiskLruCache$snapshots$1(DiskLruCache diskLruCache) {
    }

    @NotNull
    public final Iterator<DiskLruCache.Entry> getDelegate() {
    }

    @Nullable
    public final DiskLruCache.Snapshot getNextSnapshot() {
    }

    @Nullable
    public final DiskLruCache.Snapshot getRemoveSnapshot() {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ DiskLruCache.Snapshot next() {
    }

    @Override // java.util.Iterator
    public void remove() {
    }

    public final void setNextSnapshot(@Nullable DiskLruCache.Snapshot snapshot) {
    }

    public final void setRemoveSnapshot(@Nullable DiskLruCache.Snapshot snapshot) {
    }

    @Override // java.util.Iterator
    @NotNull
    /* renamed from: next  reason: avoid collision after fix types in other method */
    public DiskLruCache.Snapshot next2() {
    }
}
