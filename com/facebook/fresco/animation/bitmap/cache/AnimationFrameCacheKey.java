package com.facebook.fresco.animation.bitmap.cache;

import android.net.Uri;
import com.facebook.cache.common.CacheKey;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class AnimationFrameCacheKey implements CacheKey {
    private static final String URI_PREFIX = "anim://";
    private final String mAnimationUriString;
    private final boolean mDeepEquals;

    public AnimationFrameCacheKey(int imageId) {
        this(imageId, false);
    }

    @Override // com.facebook.cache.common.CacheKey
    public boolean containsUri(Uri uri) {
        return uri.toString().startsWith(this.mAnimationUriString);
    }

    @Override // com.facebook.cache.common.CacheKey
    public boolean equals(@Nullable Object o2) {
        if (this.mDeepEquals) {
            if (this == o2) {
                return true;
            }
            if (o2 == null || getClass() != o2.getClass()) {
                return false;
            }
            return this.mAnimationUriString.equals(((AnimationFrameCacheKey) o2).mAnimationUriString);
        }
        return super.equals(o2);
    }

    @Override // com.facebook.cache.common.CacheKey
    public String getUriString() {
        return this.mAnimationUriString;
    }

    @Override // com.facebook.cache.common.CacheKey
    public int hashCode() {
        if (!this.mDeepEquals) {
            return super.hashCode();
        }
        return this.mAnimationUriString.hashCode();
    }

    @Override // com.facebook.cache.common.CacheKey
    public boolean isResourceIdForDebugging() {
        return false;
    }

    public AnimationFrameCacheKey(int imageId, boolean deepEquals) {
        this.mAnimationUriString = URI_PREFIX + imageId;
        this.mDeepEquals = deepEquals;
    }
}
