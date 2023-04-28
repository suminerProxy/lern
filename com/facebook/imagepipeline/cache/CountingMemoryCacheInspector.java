package com.facebook.imagepipeline.cache;

import android.graphics.Bitmap;
import com.facebook.common.references.CloseableReference;
import com.facebook.infer.annotation.Nullsafe;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class CountingMemoryCacheInspector<K, V> {
    private final CountingMemoryCache<K, V> mCountingBitmapCache;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class DumpInfo<K, V> {
        public final List<DumpInfoEntry<K, V>> lruEntries;
        public final int lruSize;
        public final int maxEntriesCount;
        public final int maxEntrySize;
        public final int maxSize;
        public final Map<Bitmap, Object> otherEntries;
        public final List<DumpInfoEntry<K, V>> sharedEntries;
        public final int size;

        public DumpInfo(int size, int lruSize, MemoryCacheParams params) {
        }

        public void release() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class DumpInfoEntry<K, V> {
        public final K key;
        @Nullable
        public final CloseableReference<V> value;

        public DumpInfoEntry(final K key, final CloseableReference<V> valueRef) {
        }

        public void release() {
        }
    }

    public CountingMemoryCacheInspector(CountingMemoryCache<K, V> countingBitmapCache) {
    }

    public DumpInfo dumpCacheContent() {
    }
}
