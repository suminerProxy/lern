package com.google.android.exoplayer2.upstream.cache;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.TreeSet;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class CachedContent {
    private static final String TAG = "CachedContent";
    private final TreeSet<SimpleCacheSpan> cachedSpans;
    public final int id;
    public final String key;
    private final ArrayList<Range> lockedRanges;
    private DefaultContentMetadata metadata;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Range {
        public final long length;
        public final long position;

        public Range(long position, long length) {
        }

        public boolean contains(long otherPosition, long otherLength) {
        }

        public boolean intersects(long otherPosition, long otherLength) {
        }
    }

    public CachedContent(int id, String key) {
    }

    public void addSpan(SimpleCacheSpan span) {
    }

    public boolean applyMetadataMutations(ContentMetadataMutations mutations) {
    }

    public boolean equals(@Nullable Object o2) {
    }

    public long getCachedBytesLength(long position, long length) {
    }

    public DefaultContentMetadata getMetadata() {
    }

    public SimpleCacheSpan getSpan(long position, long length) {
    }

    public TreeSet<SimpleCacheSpan> getSpans() {
    }

    public int hashCode() {
    }

    public boolean isEmpty() {
    }

    public boolean isFullyLocked(long position, long length) {
    }

    public boolean isFullyUnlocked() {
    }

    public boolean lockRange(long position, long length) {
    }

    public boolean removeSpan(CacheSpan span) {
    }

    public SimpleCacheSpan setLastTouchTimestamp(SimpleCacheSpan cacheSpan, long lastTouchTimestamp, boolean updateFile) {
    }

    public void unlockRange(long position) {
    }

    public CachedContent(int id, String key, DefaultContentMetadata metadata) {
    }
}
