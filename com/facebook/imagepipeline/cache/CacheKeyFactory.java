package com.facebook.imagepipeline.cache;

import android.net.Uri;
import com.facebook.cache.common.CacheKey;
import com.facebook.imagepipeline.request.ImageRequest;
import javax.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface CacheKeyFactory {
    CacheKey getBitmapCacheKey(ImageRequest request, @Nullable Object callerContext);

    CacheKey getEncodedCacheKey(ImageRequest request, Uri sourceUri, @Nullable Object callerContext);

    CacheKey getEncodedCacheKey(ImageRequest request, @Nullable Object callerContext);

    CacheKey getPostprocessedBitmapCacheKey(ImageRequest request, @Nullable Object callerContext);
}
