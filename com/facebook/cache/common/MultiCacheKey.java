package com.facebook.cache.common;

import android.net.Uri;
import com.facebook.infer.annotation.Nullsafe;
import java.util.List;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class MultiCacheKey implements CacheKey {
    public final List<CacheKey> mCacheKeys;

    public MultiCacheKey(List<CacheKey> cacheKeys) {
    }

    @Override // com.facebook.cache.common.CacheKey
    public boolean containsUri(Uri uri) {
    }

    @Override // com.facebook.cache.common.CacheKey
    public boolean equals(@Nullable Object o2) {
    }

    public List<CacheKey> getCacheKeys() {
    }

    @Override // com.facebook.cache.common.CacheKey
    public String getUriString() {
    }

    @Override // com.facebook.cache.common.CacheKey
    public int hashCode() {
    }

    @Override // com.facebook.cache.common.CacheKey
    public boolean isResourceIdForDebugging() {
    }

    @Override // com.facebook.cache.common.CacheKey
    public String toString() {
    }
}
