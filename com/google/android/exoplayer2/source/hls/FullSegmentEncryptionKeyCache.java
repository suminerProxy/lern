package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class FullSegmentEncryptionKeyCache {
    private final LinkedHashMap<Uri, byte[]> backingMap;

    /* renamed from: com.google.android.exoplayer2.source.hls.FullSegmentEncryptionKeyCache$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends LinkedHashMap<Uri, byte[]> {
        public final /* synthetic */ int val$maxSize;

        public AnonymousClass1(final FullSegmentEncryptionKeyCache this$0, int initialCapacity, float loadFactor, boolean accessOrder, final int val$maxSize) {
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<Uri, byte[]> eldest) {
        }
    }

    public FullSegmentEncryptionKeyCache(int maxSize) {
    }

    public boolean containsUri(Uri uri) {
    }

    @Nullable
    public byte[] get(@Nullable Uri uri) {
    }

    @Nullable
    public byte[] put(Uri uri, byte[] encryptionKey) {
    }

    @Nullable
    public byte[] remove(Uri uri) {
    }
}
