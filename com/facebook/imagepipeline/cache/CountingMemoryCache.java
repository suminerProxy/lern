package com.facebook.imagepipeline.cache;

import android.graphics.Bitmap;
import androidx.annotation.VisibleForTesting;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.memory.MemoryTrimmable;
import com.facebook.common.references.CloseableReference;
import com.facebook.infer.annotation.Nullsafe;
import java.util.Map;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface CountingMemoryCache<K, V> extends MemoryCache<K, V>, MemoryTrimmable {

    @VisibleForTesting
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Entry<K, V> {
        public final K key;
        @Nullable
        public final EntryStateObserver<K> observer;
        public int size;
        public final CloseableReference<V> valueRef;
        public int clientCount = 0;
        public boolean isOrphan = false;
        public int accessCount = 0;

        private Entry(K key, CloseableReference<V> valueRef, @Nullable EntryStateObserver<K> observer, int size) {
            this.key = (K) Preconditions.checkNotNull(key);
            this.valueRef = (CloseableReference) Preconditions.checkNotNull(CloseableReference.cloneOrNull(valueRef));
            this.observer = observer;
            this.size = size;
        }

        @VisibleForTesting
        public static <K, V> Entry<K, V> of(final K key, final CloseableReference<V> valueRef, @Nullable final EntryStateObserver<K> observer) {
            return of(key, valueRef, -1, observer);
        }

        @VisibleForTesting
        public static <K, V> Entry<K, V> of(final K key, final CloseableReference<V> valueRef, final int size, @Nullable final EntryStateObserver<K> observer) {
            return new Entry<>(key, valueRef, observer, size);
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface EntryStateObserver<K> {
        void onExclusivityChanged(K key, boolean isExclusive);
    }

    @Nullable
    CloseableReference<V> cache(K key, CloseableReference<V> valueRef, EntryStateObserver<K> observer);

    void clear();

    CountingLruMap<K, Entry<K, V>> getCachedEntries();

    int getEvictionQueueCount();

    int getEvictionQueueSizeInBytes();

    int getInUseSizeInBytes();

    MemoryCacheParams getMemoryCacheParams();

    Map<Bitmap, Object> getOtherEntries();

    void maybeEvictEntries();

    @Nullable
    CloseableReference<V> reuse(K key);
}
