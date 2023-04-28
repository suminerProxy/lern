package com.facebook.imagepipeline.cache;

import android.net.Uri;
import com.facebook.cache.common.CacheKey;
import com.facebook.cache.common.SimpleCacheKey;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.Postprocessor;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class DefaultCacheKeyFactory implements CacheKeyFactory {
    @Nullable
    private static DefaultCacheKeyFactory sInstance;

    public static synchronized DefaultCacheKeyFactory getInstance() {
        DefaultCacheKeyFactory defaultCacheKeyFactory;
        synchronized (DefaultCacheKeyFactory.class) {
            if (sInstance == null) {
                sInstance = new DefaultCacheKeyFactory();
            }
            defaultCacheKeyFactory = sInstance;
        }
        return defaultCacheKeyFactory;
    }

    @Override // com.facebook.imagepipeline.cache.CacheKeyFactory
    public CacheKey getBitmapCacheKey(ImageRequest request, @Nullable Object callerContext) {
        return new BitmapMemoryCacheKey(getCacheKeySourceUri(request.getSourceUri()).toString(), request.getResizeOptions(), request.getRotationOptions(), request.getImageDecodeOptions(), null, null, callerContext);
    }

    public Uri getCacheKeySourceUri(Uri sourceUri) {
        return sourceUri;
    }

    @Override // com.facebook.imagepipeline.cache.CacheKeyFactory
    public CacheKey getEncodedCacheKey(ImageRequest request, @Nullable Object callerContext) {
        return getEncodedCacheKey(request, request.getSourceUri(), callerContext);
    }

    @Override // com.facebook.imagepipeline.cache.CacheKeyFactory
    public CacheKey getPostprocessedBitmapCacheKey(ImageRequest request, @Nullable Object callerContext) {
        CacheKey cacheKey;
        String str;
        Postprocessor postprocessor = request.getPostprocessor();
        if (postprocessor != null) {
            CacheKey postprocessorCacheKey = postprocessor.getPostprocessorCacheKey();
            str = postprocessor.getClass().getName();
            cacheKey = postprocessorCacheKey;
        } else {
            cacheKey = null;
            str = null;
        }
        return new BitmapMemoryCacheKey(getCacheKeySourceUri(request.getSourceUri()).toString(), request.getResizeOptions(), request.getRotationOptions(), request.getImageDecodeOptions(), cacheKey, str, callerContext);
    }

    @Override // com.facebook.imagepipeline.cache.CacheKeyFactory
    public CacheKey getEncodedCacheKey(ImageRequest request, Uri sourceUri, @Nullable Object callerContext) {
        return new SimpleCacheKey(getCacheKeySourceUri(sourceUri).toString());
    }
}
