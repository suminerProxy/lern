package com.facebook.cache.common;

import android.net.Uri;
import com.facebook.common.internal.Preconditions;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class SimpleCacheKey implements CacheKey {
    public final boolean mIsResourceIdForDebugging;
    public final String mKey;

    public SimpleCacheKey(final String key) {
        this(key, false);
    }

    @Override // com.facebook.cache.common.CacheKey
    public boolean containsUri(Uri uri) {
        return this.mKey.contains(uri.toString());
    }

    @Override // com.facebook.cache.common.CacheKey
    public boolean equals(@Nullable Object o2) {
        if (o2 == this) {
            return true;
        }
        if (o2 instanceof SimpleCacheKey) {
            return this.mKey.equals(((SimpleCacheKey) o2).mKey);
        }
        return false;
    }

    @Override // com.facebook.cache.common.CacheKey
    public String getUriString() {
        return this.mKey;
    }

    @Override // com.facebook.cache.common.CacheKey
    public int hashCode() {
        return this.mKey.hashCode();
    }

    @Override // com.facebook.cache.common.CacheKey
    public boolean isResourceIdForDebugging() {
        return this.mIsResourceIdForDebugging;
    }

    @Override // com.facebook.cache.common.CacheKey
    public String toString() {
        return this.mKey;
    }

    public SimpleCacheKey(final String key, boolean isResourceIdForDebugging) {
        this.mKey = (String) Preconditions.checkNotNull(key);
        this.mIsResourceIdForDebugging = isResourceIdForDebugging;
    }
}
