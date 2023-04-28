package com.google.android.exoplayer2.upstream.cache;

import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class DefaultContentMetadata implements ContentMetadata {
    public static final DefaultContentMetadata EMPTY = null;
    private int hashCode;
    private final Map<String, byte[]> metadata;

    public DefaultContentMetadata() {
    }

    private static void addValues(HashMap<String, byte[]> metadata, Map<String, Object> values) {
    }

    private static Map<String, byte[]> applyMutations(Map<String, byte[]> otherMetadata, ContentMetadataMutations mutations) {
    }

    private static byte[] getBytes(Object value) {
    }

    private static boolean isMetadataEqual(Map<String, byte[]> first, Map<String, byte[]> second) {
    }

    private static void removeValues(HashMap<String, byte[]> metadata, List<String> names) {
    }

    @Override // com.google.android.exoplayer2.upstream.cache.ContentMetadata
    public final boolean contains(String key) {
    }

    public DefaultContentMetadata copyWithMutationsApplied(ContentMetadataMutations mutations) {
    }

    public Set<Map.Entry<String, byte[]>> entrySet() {
    }

    public boolean equals(@Nullable Object o2) {
    }

    @Override // com.google.android.exoplayer2.upstream.cache.ContentMetadata
    @Nullable
    public final byte[] get(String key, @Nullable byte[] defaultValue) {
    }

    public int hashCode() {
    }

    public DefaultContentMetadata(Map<String, byte[]> metadata) {
    }

    @Override // com.google.android.exoplayer2.upstream.cache.ContentMetadata
    @Nullable
    public final String get(String key, @Nullable String defaultValue) {
    }

    @Override // com.google.android.exoplayer2.upstream.cache.ContentMetadata
    public final long get(String key, long defaultValue) {
    }
}
