package com.facebook.imagepipeline.cache;

import android.graphics.Bitmap;
import androidx.annotation.VisibleForTesting;
import com.facebook.common.internal.Predicate;
import com.facebook.common.internal.Supplier;
import com.facebook.common.memory.MemoryTrimType;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.references.ResourceReleaser;
import com.facebook.imagepipeline.cache.CountingMemoryCache;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.infer.annotation.Nullsafe;
import java.util.ArrayList;
import java.util.Map;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class AbstractAdaptiveCountingMemoryCache<K, V> implements CountingMemoryCache<K, V> {
    public static final int DEFAULT_ADAPTIVE_RATE_PROMIL = 10;
    public static final int DEFAULT_LFU_FRACTION_PROMIL = 500;
    public static final int MAX_FRACTION_PROMIL = 900;
    @VisibleForTesting
    public static final int MIN_FRACTION_PROMIL = 100;
    private static final String TAG = "AbstractArcCountingMemoryCache";
    public static final int TOTAL_PROMIL = 1000;
    @GuardedBy("this")
    @VisibleForTesting
    public final int mAdaptiveRatePromil;
    private final MemoryCache.CacheTrimStrategy mCacheTrimStrategy;
    @GuardedBy("this")
    @VisibleForTesting
    public final CountingLruMap<K, CountingMemoryCache.Entry<K, V>> mCachedEntries;
    private final int mFrequentlyUsedThreshold;
    @GuardedBy("this")
    @VisibleForTesting
    public final int mGhostListMaxSize;
    @GuardedBy("this")
    @VisibleForTesting
    public int mLFUFractionPromil;
    @GuardedBy("this")
    private long mLastCacheParamsCheck;
    @GuardedBy("this")
    @VisibleForTesting
    public final CountingLruMap<K, CountingMemoryCache.Entry<K, V>> mLeastFrequentlyUsedExclusiveEntries;
    @GuardedBy("this")
    @VisibleForTesting
    public final AbstractAdaptiveCountingMemoryCache<K, V>.IntMapArrayList<K> mLeastFrequentlyUsedKeysGhostList;
    @GuardedBy("this")
    public MemoryCacheParams mMemoryCacheParams;
    private final Supplier<MemoryCacheParams> mMemoryCacheParamsSupplier;
    @GuardedBy("this")
    @VisibleForTesting
    public final CountingLruMap<K, CountingMemoryCache.Entry<K, V>> mMostFrequentlyUsedExclusiveEntries;
    @GuardedBy("this")
    @VisibleForTesting
    public final ArrayList<K> mMostFrequentlyUsedKeysGhostList;
    private final ValueDescriptor<V> mValueDescriptor;

    /* renamed from: com.facebook.imagepipeline.cache.AbstractAdaptiveCountingMemoryCache$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements ValueDescriptor<CountingMemoryCache.Entry<K, V>> {
        public final /* synthetic */ AbstractAdaptiveCountingMemoryCache this$0;
        public final /* synthetic */ ValueDescriptor val$evictableValueDescriptor;

        public AnonymousClass1(final AbstractAdaptiveCountingMemoryCache this$0, final ValueDescriptor val$evictableValueDescriptor) {
        }

        @Override // com.facebook.imagepipeline.cache.ValueDescriptor
        public /* bridge */ /* synthetic */ int getSizeInBytes(Object entry) {
        }

        public int getSizeInBytes(CountingMemoryCache.Entry<K, V> entry) {
        }
    }

    /* renamed from: com.facebook.imagepipeline.cache.AbstractAdaptiveCountingMemoryCache$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements ResourceReleaser<V> {
        public final /* synthetic */ AbstractAdaptiveCountingMemoryCache this$0;
        public final /* synthetic */ CountingMemoryCache.Entry val$entry;

        public AnonymousClass2(final AbstractAdaptiveCountingMemoryCache this$0, final CountingMemoryCache.Entry val$entry) {
        }

        @Override // com.facebook.common.references.ResourceReleaser
        public void release(V unused) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class ArrayListType {
        private static final /* synthetic */ ArrayListType[] $VALUES = null;
        public static final ArrayListType LFU = null;
        public static final ArrayListType MFU = null;

        private ArrayListType(String $enum$name, int $enum$ordinal) {
        }

        public static ArrayListType valueOf(String name) {
        }

        public static ArrayListType[] values() {
        }
    }

    @VisibleForTesting
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class IntMapArrayList<E> {
        private final ArrayList<E> mFirstList;
        private final int mMaxCapacity;
        private final ArrayList<Integer> mSecondList;
        public final /* synthetic */ AbstractAdaptiveCountingMemoryCache this$0;

        public IntMapArrayList(final AbstractAdaptiveCountingMemoryCache this$0, int maxCapacity) {
        }

        public void addPair(E element, Integer second) {
        }

        public boolean contains(E element) {
        }

        @Nullable
        public Integer getValue(E element) {
        }

        public void increaseValueIfExists(E element) {
        }

        public int size() {
        }
    }

    public AbstractAdaptiveCountingMemoryCache(Supplier<MemoryCacheParams> memoryCacheParamsSupplier, MemoryCache.CacheTrimStrategy cacheTrimStrategy, ValueDescriptor<V> valueDescriptor, int adaptiveRatePromil, int frequentlyUsedThreshold, int ghostListMaxSize, int lfuFractionPromil) {
    }

    public static /* synthetic */ void access$000(AbstractAdaptiveCountingMemoryCache abstractAdaptiveCountingMemoryCache, CountingMemoryCache.Entry entry) {
    }

    private synchronized void addElementToGhostList(K key, int accessCount, ArrayListType evictionType) {
    }

    private synchronized boolean canCacheNewValue(V value) {
    }

    private synchronized void decreaseClientCount(CountingMemoryCache.Entry<K, V> entry) {
    }

    private synchronized void increaseAccessCount(CountingMemoryCache.Entry<K, V> entry) {
    }

    private synchronized void increaseCounters(CountingMemoryCache.Entry<K, V> entry) {
    }

    private synchronized void makeOrphan(CountingMemoryCache.Entry<K, V> entry) {
    }

    private synchronized void makeOrphans(@Nullable ArrayList<CountingMemoryCache.Entry<K, V>> oldEntries1, @Nullable ArrayList<CountingMemoryCache.Entry<K, V>> oldEntries2) {
    }

    private synchronized boolean maybeAddToExclusives(CountingMemoryCache.Entry<K, V> entry) {
    }

    private void maybeClose(@Nullable ArrayList<CountingMemoryCache.Entry<K, V>> oldEntries1, @Nullable ArrayList<CountingMemoryCache.Entry<K, V>> oldEntries2) {
    }

    private void maybeNotifyExclusiveEntriesRemoval(@Nullable ArrayList<CountingMemoryCache.Entry<K, V>> entries1, @Nullable ArrayList<CountingMemoryCache.Entry<K, V>> entries2) {
    }

    private static <K, V> void maybeNotifyExclusiveEntryInsertion(@Nullable CountingMemoryCache.Entry<K, V> entry) {
    }

    private void maybeNotifyExclusiveEntryRemoval(@Nullable CountingMemoryCache.Entry<K, V> entry1, @Nullable CountingMemoryCache.Entry<K, V> entry2) {
    }

    private synchronized void maybeUpdateCacheFraction(K key) {
    }

    private synchronized void maybeUpdateCacheParams() {
    }

    private synchronized CloseableReference<V> newClientReference(final CountingMemoryCache.Entry<K, V> entry) {
    }

    @Nullable
    private synchronized CloseableReference<V> referenceToClose(CountingMemoryCache.Entry<K, V> entry) {
    }

    private void releaseClientReference(final CountingMemoryCache.Entry<K, V> entry) {
    }

    @Nullable
    private synchronized ArrayList<CountingMemoryCache.Entry<K, V>> trimExclusivelyOwnedEntries(int count, int size, CountingLruMap<K, CountingMemoryCache.Entry<K, V>> ExclusixeEntries, ArrayListType evictionType) {
    }

    private ValueDescriptor<CountingMemoryCache.Entry<K, V>> wrapValueDescriptor(final ValueDescriptor<V> evictableValueDescriptor) {
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    @Nullable
    public CloseableReference<V> cache(final K key, final CloseableReference<V> valueRef) {
    }

    @Override // com.facebook.imagepipeline.cache.CountingMemoryCache
    public void clear() {
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    public synchronized boolean contains(Predicate<K> predicate) {
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    @Nullable
    public CloseableReference<V> get(final K key) {
    }

    @Override // com.facebook.imagepipeline.cache.CountingMemoryCache
    public CountingLruMap getCachedEntries() {
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    public synchronized int getCount() {
    }

    @Override // com.facebook.imagepipeline.cache.CountingMemoryCache
    public synchronized int getEvictionQueueCount() {
    }

    @Override // com.facebook.imagepipeline.cache.CountingMemoryCache
    public synchronized int getEvictionQueueSizeInBytes() {
    }

    public synchronized int getInUseCount() {
    }

    @Override // com.facebook.imagepipeline.cache.CountingMemoryCache
    public synchronized int getInUseSizeInBytes() {
    }

    @Override // com.facebook.imagepipeline.cache.CountingMemoryCache
    public MemoryCacheParams getMemoryCacheParams() {
    }

    @Override // com.facebook.imagepipeline.cache.CountingMemoryCache
    public Map<Bitmap, Object> getOtherEntries() {
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    public synchronized int getSizeInBytes() {
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    @Nullable
    public V inspect(K key) {
    }

    public abstract void logIllegalAdaptiveRate();

    public abstract void logIllegalLfuFraction();

    @Override // com.facebook.imagepipeline.cache.CountingMemoryCache
    public void maybeEvictEntries() {
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    public void probe(K key) {
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    public int removeAll(Predicate<K> predicate) {
    }

    public String reportData() {
    }

    @Override // com.facebook.imagepipeline.cache.CountingMemoryCache
    @Nullable
    public CloseableReference<V> reuse(K key) {
    }

    @Override // com.facebook.common.memory.MemoryTrimmable
    public void trim(MemoryTrimType trimType) {
    }

    @Override // com.facebook.imagepipeline.cache.CountingMemoryCache
    @Nullable
    public CloseableReference<V> cache(final K key, final CloseableReference<V> valueRef, @Nullable final CountingMemoryCache.EntryStateObserver<K> observer) {
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    public synchronized boolean contains(K key) {
    }

    private void maybeClose(@Nullable ArrayList<CountingMemoryCache.Entry<K, V>> oldEntries) {
    }

    private void maybeNotifyExclusiveEntryRemoval(@Nullable ArrayList<CountingMemoryCache.Entry<K, V>> entries) {
    }

    private synchronized void makeOrphans(@Nullable ArrayList<CountingMemoryCache.Entry<K, V>> oldEntries) {
    }

    private static <K, V> void maybeNotifyExclusiveEntryRemoval(@Nullable CountingMemoryCache.Entry<K, V> entry) {
    }
}
