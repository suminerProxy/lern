package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Equivalence;
import com.google.common.base.Supplier;
import com.google.common.base.Ticker;
import com.google.common.cache.AbstractCache;
import com.google.common.cache.LocalCache;
import com.google.errorprone.annotations.CheckReturnValue;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;

@GwtCompatible(emulated = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class CacheBuilder<K, V> {
    public static final Supplier<AbstractCache.StatsCounter> CACHE_STATS_COUNTER = null;
    private static final int DEFAULT_CONCURRENCY_LEVEL = 4;
    private static final int DEFAULT_EXPIRATION_NANOS = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    private static final int DEFAULT_REFRESH_NANOS = 0;
    public static final CacheStats EMPTY_STATS = null;
    public static final Supplier<? extends AbstractCache.StatsCounter> NULL_STATS_COUNTER = null;
    public static final Ticker NULL_TICKER = null;
    public static final int UNSET_INT = -1;
    private static final Logger logger = null;
    public int concurrencyLevel;
    public long expireAfterAccessNanos;
    public long expireAfterWriteNanos;
    public int initialCapacity;
    @MonotonicNonNullDecl
    public Equivalence<Object> keyEquivalence;
    @MonotonicNonNullDecl
    public LocalCache.Strength keyStrength;
    public long maximumSize;
    public long maximumWeight;
    public long refreshNanos;
    @MonotonicNonNullDecl
    public RemovalListener<? super K, ? super V> removalListener;
    public Supplier<? extends AbstractCache.StatsCounter> statsCounterSupplier;
    public boolean strictParsing;
    @MonotonicNonNullDecl
    public Ticker ticker;
    @MonotonicNonNullDecl
    public Equivalence<Object> valueEquivalence;
    @MonotonicNonNullDecl
    public LocalCache.Strength valueStrength;
    @MonotonicNonNullDecl
    public Weigher<? super K, ? super V> weigher;

    /* renamed from: com.google.common.cache.CacheBuilder$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1 implements AbstractCache.StatsCounter {
        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public void recordEviction() {
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public void recordHits(int i2) {
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public void recordLoadException(long j2) {
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public void recordLoadSuccess(long j2) {
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public void recordMisses(int i2) {
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public CacheStats snapshot() {
        }
    }

    /* renamed from: com.google.common.cache.CacheBuilder$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass2 implements Supplier<AbstractCache.StatsCounter> {
        @Override // com.google.common.base.Supplier
        public /* bridge */ /* synthetic */ AbstractCache.StatsCounter get() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.common.base.Supplier
        public AbstractCache.StatsCounter get() {
        }
    }

    /* renamed from: com.google.common.cache.CacheBuilder$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass3 extends Ticker {
        @Override // com.google.common.base.Ticker
        public long read() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class NullListener implements RemovalListener<Object, Object> {
        private static final /* synthetic */ NullListener[] $VALUES = null;
        public static final NullListener INSTANCE = null;

        private NullListener(String str, int i2) {
        }

        public static NullListener valueOf(String str) {
        }

        public static NullListener[] values() {
        }

        @Override // com.google.common.cache.RemovalListener
        public void onRemoval(RemovalNotification<Object, Object> removalNotification) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class OneWeigher implements Weigher<Object, Object> {
        private static final /* synthetic */ OneWeigher[] $VALUES = null;
        public static final OneWeigher INSTANCE = null;

        private OneWeigher(String str, int i2) {
        }

        public static OneWeigher valueOf(String str) {
        }

        public static OneWeigher[] values() {
        }

        @Override // com.google.common.cache.Weigher
        public int weigh(Object obj, Object obj2) {
        }
    }

    private CacheBuilder() {
    }

    private void checkNonLoadingCache() {
    }

    private void checkWeightWithWeigher() {
    }

    @GwtIncompatible
    public static CacheBuilder<Object, Object> from(CacheBuilderSpec cacheBuilderSpec) {
    }

    public static CacheBuilder<Object, Object> newBuilder() {
    }

    public <K1 extends K, V1 extends V> LoadingCache<K1, V1> build(CacheLoader<? super K1, V1> cacheLoader) {
    }

    public CacheBuilder<K, V> concurrencyLevel(int i2) {
    }

    public CacheBuilder<K, V> expireAfterAccess(long j2, TimeUnit timeUnit) {
    }

    public CacheBuilder<K, V> expireAfterWrite(long j2, TimeUnit timeUnit) {
    }

    public int getConcurrencyLevel() {
    }

    public long getExpireAfterAccessNanos() {
    }

    public long getExpireAfterWriteNanos() {
    }

    public int getInitialCapacity() {
    }

    public Equivalence<Object> getKeyEquivalence() {
    }

    public LocalCache.Strength getKeyStrength() {
    }

    public long getMaximumWeight() {
    }

    public long getRefreshNanos() {
    }

    public <K1 extends K, V1 extends V> RemovalListener<K1, V1> getRemovalListener() {
    }

    public Supplier<? extends AbstractCache.StatsCounter> getStatsCounterSupplier() {
    }

    public Ticker getTicker(boolean z) {
    }

    public Equivalence<Object> getValueEquivalence() {
    }

    public LocalCache.Strength getValueStrength() {
    }

    public <K1 extends K, V1 extends V> Weigher<K1, V1> getWeigher() {
    }

    public CacheBuilder<K, V> initialCapacity(int i2) {
    }

    public boolean isRecordingStats() {
    }

    @GwtIncompatible
    public CacheBuilder<K, V> keyEquivalence(Equivalence<Object> equivalence) {
    }

    @GwtIncompatible
    public CacheBuilder<K, V> lenientParsing() {
    }

    public CacheBuilder<K, V> maximumSize(long j2) {
    }

    @GwtIncompatible
    public CacheBuilder<K, V> maximumWeight(long j2) {
    }

    public CacheBuilder<K, V> recordStats() {
    }

    @GwtIncompatible
    public CacheBuilder<K, V> refreshAfterWrite(long j2, TimeUnit timeUnit) {
    }

    @CheckReturnValue
    public <K1 extends K, V1 extends V> CacheBuilder<K1, V1> removalListener(RemovalListener<? super K1, ? super V1> removalListener) {
    }

    public CacheBuilder<K, V> setKeyStrength(LocalCache.Strength strength) {
    }

    public CacheBuilder<K, V> setValueStrength(LocalCache.Strength strength) {
    }

    @GwtIncompatible
    public CacheBuilder<K, V> softValues() {
    }

    public CacheBuilder<K, V> ticker(Ticker ticker) {
    }

    public String toString() {
    }

    @GwtIncompatible
    public CacheBuilder<K, V> valueEquivalence(Equivalence<Object> equivalence) {
    }

    @GwtIncompatible
    public CacheBuilder<K, V> weakKeys() {
    }

    @GwtIncompatible
    public CacheBuilder<K, V> weakValues() {
    }

    @GwtIncompatible
    public <K1 extends K, V1 extends V> CacheBuilder<K1, V1> weigher(Weigher<? super K1, ? super V1> weigher) {
    }

    @GwtIncompatible
    public static CacheBuilder<Object, Object> from(String str) {
    }

    public <K1 extends K, V1 extends V> Cache<K1, V1> build() {
    }
}
