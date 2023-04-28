package com.facebook.imagepipeline.cache;

import android.net.Uri;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Objects;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.common.util.HashCodeUtil;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

@Nullsafe(Nullsafe.Mode.LOCAL)
@Immutable
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class BitmapMemoryCacheKey implements CacheKey {
    private final long mCacheTime;
    @Nullable
    private final Object mCallerContext;
    private final int mHash;
    private final ImageDecodeOptions mImageDecodeOptions;
    @Nullable
    private final CacheKey mPostprocessorCacheKey;
    @Nullable
    private final String mPostprocessorName;
    @Nullable
    private final ResizeOptions mResizeOptions;
    private final RotationOptions mRotationOptions;
    private final String mSourceString;

    public BitmapMemoryCacheKey(String sourceString, @Nullable ResizeOptions resizeOptions, RotationOptions rotationOptions, ImageDecodeOptions imageDecodeOptions, @Nullable CacheKey postprocessorCacheKey, @Nullable String postprocessorName, @Nullable Object callerContext) {
        this.mSourceString = (String) Preconditions.checkNotNull(sourceString);
        this.mResizeOptions = resizeOptions;
        this.mRotationOptions = rotationOptions;
        this.mImageDecodeOptions = imageDecodeOptions;
        this.mPostprocessorCacheKey = postprocessorCacheKey;
        this.mPostprocessorName = postprocessorName;
        this.mHash = HashCodeUtil.hashCode(Integer.valueOf(sourceString.hashCode()), Integer.valueOf(resizeOptions != null ? resizeOptions.hashCode() : 0), Integer.valueOf(rotationOptions.hashCode()), imageDecodeOptions, postprocessorCacheKey, postprocessorName);
        this.mCallerContext = callerContext;
        this.mCacheTime = RealtimeSinceBootClock.get().now();
    }

    @Override // com.facebook.cache.common.CacheKey
    public boolean containsUri(Uri uri) {
        return getUriString().contains(uri.toString());
    }

    @Override // com.facebook.cache.common.CacheKey
    public boolean equals(@Nullable Object o2) {
        if (o2 instanceof BitmapMemoryCacheKey) {
            BitmapMemoryCacheKey bitmapMemoryCacheKey = (BitmapMemoryCacheKey) o2;
            return this.mHash == bitmapMemoryCacheKey.mHash && this.mSourceString.equals(bitmapMemoryCacheKey.mSourceString) && Objects.equal(this.mResizeOptions, bitmapMemoryCacheKey.mResizeOptions) && Objects.equal(this.mRotationOptions, bitmapMemoryCacheKey.mRotationOptions) && Objects.equal(this.mImageDecodeOptions, bitmapMemoryCacheKey.mImageDecodeOptions) && Objects.equal(this.mPostprocessorCacheKey, bitmapMemoryCacheKey.mPostprocessorCacheKey) && Objects.equal(this.mPostprocessorName, bitmapMemoryCacheKey.mPostprocessorName);
        }
        return false;
    }

    @Nullable
    public Object getCallerContext() {
        return this.mCallerContext;
    }

    public long getInBitmapCacheSince() {
        return this.mCacheTime;
    }

    @Nullable
    public String getPostprocessorName() {
        return this.mPostprocessorName;
    }

    @Override // com.facebook.cache.common.CacheKey
    public String getUriString() {
        return this.mSourceString;
    }

    @Override // com.facebook.cache.common.CacheKey
    public int hashCode() {
        return this.mHash;
    }

    @Override // com.facebook.cache.common.CacheKey
    public boolean isResourceIdForDebugging() {
        return false;
    }

    @Override // com.facebook.cache.common.CacheKey
    public String toString() {
        return String.format(null, "%s_%s_%s_%s_%s_%s_%d", this.mSourceString, this.mResizeOptions, this.mRotationOptions, this.mImageDecodeOptions, this.mPostprocessorCacheKey, this.mPostprocessorName, Integer.valueOf(this.mHash));
    }
}
