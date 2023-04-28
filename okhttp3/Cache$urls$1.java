package okhttp3;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableIterator;
import okhttp3.internal.cache.DiskLruCache;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Cache.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0010)\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR#\u0010\r\u001a\f\u0012\b\u0012\u00060\u000bR\u00020\f0\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R$\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0016\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0005\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"okhttp3/Cache$urls$1", "", "", "", "hasNext", "()Z", "next", "()Ljava/lang/String;", "", "remove", "()V", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "delegate", "Ljava/util/Iterator;", "getDelegate", "()Ljava/util/Iterator;", "nextUrl", "Ljava/lang/String;", "getNextUrl", "setNextUrl", "(Ljava/lang/String;)V", "canRemove", "Z", "getCanRemove", "setCanRemove", "(Z)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class Cache$urls$1 implements Iterator<String>, KMutableIterator {
    private boolean canRemove;
    @NotNull
    private final Iterator<DiskLruCache.Snapshot> delegate;
    @Nullable
    private String nextUrl;
    public final /* synthetic */ Cache this$0;

    public Cache$urls$1(Cache cache) {
    }

    public final boolean getCanRemove() {
    }

    @NotNull
    public final Iterator<DiskLruCache.Snapshot> getDelegate() {
    }

    @Nullable
    public final String getNextUrl() {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ String next() {
    }

    @Override // java.util.Iterator
    public void remove() {
    }

    public final void setCanRemove(boolean z) {
    }

    public final void setNextUrl(@Nullable String str) {
    }

    @Override // java.util.Iterator
    @NotNull
    /* renamed from: next  reason: avoid collision after fix types in other method */
    public String next2() {
    }
}
