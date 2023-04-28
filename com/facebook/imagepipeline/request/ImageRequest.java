package com.facebook.imagepipeline.request;

import android.net.Uri;
import androidx.core.app.NotificationCompat;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Fn;
import com.facebook.common.internal.Objects;
import com.facebook.common.media.MediaUtils;
import com.facebook.common.util.UriUtil;
import com.facebook.imagepipeline.common.BytesRange;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.listener.RequestListener;
import com.sobot.network.http.model.SobotProgress;
import java.io.File;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

@Immutable
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class ImageRequest {
    public static final Fn<ImageRequest, Uri> REQUEST_TO_URI_FN = new Fn<ImageRequest, Uri>() { // from class: com.facebook.imagepipeline.request.ImageRequest.1
        @Override // com.facebook.common.internal.Fn
        @Nullable
        public /* bridge */ /* synthetic */ Uri apply(@Nullable ImageRequest arg) {
        }

        @Nullable
        /* renamed from: apply  reason: avoid collision after fix types in other method */
        public Uri apply2(@Nullable ImageRequest arg) {
        }
    };
    private static boolean sCacheHashcode;
    private static boolean sUseCachedHashcodeInEquals;
    @Nullable
    private final BytesRange mBytesRange;
    private final CacheChoice mCacheChoice;
    private final int mCachesDisabled;
    @Nullable
    private final Boolean mDecodePrefetches;
    private final int mDelayMs;
    private int mHashcode;
    private final ImageDecodeOptions mImageDecodeOptions;
    private final boolean mIsDiskCacheEnabled;
    private final boolean mIsMemoryCacheEnabled;
    private final boolean mLoadThumbnailOnly;
    private final boolean mLocalThumbnailPreviewsEnabled;
    private final RequestLevel mLowestPermittedRequestLevel;
    @Nullable
    private final Postprocessor mPostprocessor;
    private final boolean mProgressiveRenderingEnabled;
    @Nullable
    private final RequestListener mRequestListener;
    private final Priority mRequestPriority;
    @Nullable
    private final ResizeOptions mResizeOptions;
    @Nullable
    private final Boolean mResizingAllowedOverride;
    private final RotationOptions mRotationOptions;
    @Nullable
    private File mSourceFile;
    private final Uri mSourceUri;
    private final int mSourceUriType;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public enum CacheChoice {
        SMALL,
        DEFAULT
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface CachesLocationsMasks {
        public static final int BITMAP_READ = 1;
        public static final int BITMAP_WRITE = 2;
        public static final int DISK_READ = 16;
        public static final int DISK_WRITE = 32;
        public static final int ENCODED_READ = 4;
        public static final int ENCODED_WRITE = 8;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public enum RequestLevel {
        FULL_FETCH(1),
        DISK_CACHE(2),
        ENCODED_MEMORY_CACHE(3),
        BITMAP_MEMORY_CACHE(4);
        
        private int mValue;

        RequestLevel(int value) {
            this.mValue = value;
        }

        public static RequestLevel getMax(RequestLevel requestLevel1, RequestLevel requestLevel2) {
            return requestLevel1.getValue() > requestLevel2.getValue() ? requestLevel1 : requestLevel2;
        }

        public int getValue() {
            return this.mValue;
        }
    }

    public ImageRequest(ImageRequestBuilder builder) {
        RotationOptions rotationOptions;
        this.mCacheChoice = builder.getCacheChoice();
        Uri sourceUri = builder.getSourceUri();
        this.mSourceUri = sourceUri;
        this.mSourceUriType = getSourceUriType(sourceUri);
        this.mProgressiveRenderingEnabled = builder.isProgressiveRenderingEnabled();
        this.mLocalThumbnailPreviewsEnabled = builder.isLocalThumbnailPreviewsEnabled();
        this.mLoadThumbnailOnly = builder.getLoadThumbnailOnly();
        this.mImageDecodeOptions = builder.getImageDecodeOptions();
        this.mResizeOptions = builder.getResizeOptions();
        if (builder.getRotationOptions() == null) {
            rotationOptions = RotationOptions.autoRotate();
        } else {
            rotationOptions = builder.getRotationOptions();
        }
        this.mRotationOptions = rotationOptions;
        this.mBytesRange = builder.getBytesRange();
        this.mRequestPriority = builder.getRequestPriority();
        this.mLowestPermittedRequestLevel = builder.getLowestPermittedRequestLevel();
        this.mCachesDisabled = builder.getCachesDisabled();
        this.mIsDiskCacheEnabled = builder.isDiskCacheEnabled();
        this.mIsMemoryCacheEnabled = builder.isMemoryCacheEnabled();
        this.mDecodePrefetches = builder.shouldDecodePrefetches();
        this.mPostprocessor = builder.getPostprocessor();
        this.mRequestListener = builder.getRequestListener();
        this.mResizingAllowedOverride = builder.getResizingAllowedOverride();
        this.mDelayMs = builder.getDelayMs();
    }

    @Nullable
    public static ImageRequest fromFile(@Nullable File file) {
        if (file == null) {
            return null;
        }
        return fromUri(UriUtil.getUriForFile(file));
    }

    @Nullable
    public static ImageRequest fromUri(@Nullable Uri uri) {
        if (uri == null) {
            return null;
        }
        return ImageRequestBuilder.newBuilderWithSource(uri).build();
    }

    public static void setCacheHashcode(boolean cacheHashcode) {
        sCacheHashcode = cacheHashcode;
    }

    public static void setUseCachedHashcodeInEquals(boolean useCachedHashcodeInEquals) {
        sUseCachedHashcodeInEquals = useCachedHashcodeInEquals;
    }

    public boolean equals(@Nullable Object o2) {
        if (o2 instanceof ImageRequest) {
            ImageRequest imageRequest = (ImageRequest) o2;
            if (sUseCachedHashcodeInEquals) {
                int i2 = this.mHashcode;
                int i3 = imageRequest.mHashcode;
                if (i2 != 0 && i3 != 0 && i2 != i3) {
                    return false;
                }
            }
            if (this.mLocalThumbnailPreviewsEnabled == imageRequest.mLocalThumbnailPreviewsEnabled && this.mIsDiskCacheEnabled == imageRequest.mIsDiskCacheEnabled && this.mIsMemoryCacheEnabled == imageRequest.mIsMemoryCacheEnabled && Objects.equal(this.mSourceUri, imageRequest.mSourceUri) && Objects.equal(this.mCacheChoice, imageRequest.mCacheChoice) && Objects.equal(this.mSourceFile, imageRequest.mSourceFile) && Objects.equal(this.mBytesRange, imageRequest.mBytesRange) && Objects.equal(this.mImageDecodeOptions, imageRequest.mImageDecodeOptions) && Objects.equal(this.mResizeOptions, imageRequest.mResizeOptions) && Objects.equal(this.mRequestPriority, imageRequest.mRequestPriority) && Objects.equal(this.mLowestPermittedRequestLevel, imageRequest.mLowestPermittedRequestLevel) && Objects.equal(Integer.valueOf(this.mCachesDisabled), Integer.valueOf(imageRequest.mCachesDisabled)) && Objects.equal(this.mDecodePrefetches, imageRequest.mDecodePrefetches) && Objects.equal(this.mResizingAllowedOverride, imageRequest.mResizingAllowedOverride) && Objects.equal(this.mRotationOptions, imageRequest.mRotationOptions) && this.mLoadThumbnailOnly == imageRequest.mLoadThumbnailOnly) {
                Postprocessor postprocessor = this.mPostprocessor;
                CacheKey postprocessorCacheKey = postprocessor != null ? postprocessor.getPostprocessorCacheKey() : null;
                Postprocessor postprocessor2 = imageRequest.mPostprocessor;
                return Objects.equal(postprocessorCacheKey, postprocessor2 != null ? postprocessor2.getPostprocessorCacheKey() : null) && this.mDelayMs == imageRequest.mDelayMs;
            }
            return false;
        }
        return false;
    }

    @Deprecated
    public boolean getAutoRotateEnabled() {
        return this.mRotationOptions.useImageMetadata();
    }

    @Nullable
    public BytesRange getBytesRange() {
        return this.mBytesRange;
    }

    public CacheChoice getCacheChoice() {
        return this.mCacheChoice;
    }

    public int getCachesDisabled() {
        return this.mCachesDisabled;
    }

    public int getDelayMs() {
        return this.mDelayMs;
    }

    public ImageDecodeOptions getImageDecodeOptions() {
        return this.mImageDecodeOptions;
    }

    public boolean getLoadThumbnailOnly() {
        return this.mLoadThumbnailOnly;
    }

    public boolean getLocalThumbnailPreviewsEnabled() {
        return this.mLocalThumbnailPreviewsEnabled;
    }

    public RequestLevel getLowestPermittedRequestLevel() {
        return this.mLowestPermittedRequestLevel;
    }

    @Nullable
    public Postprocessor getPostprocessor() {
        return this.mPostprocessor;
    }

    public int getPreferredHeight() {
        ResizeOptions resizeOptions = this.mResizeOptions;
        if (resizeOptions != null) {
            return resizeOptions.height;
        }
        return 2048;
    }

    public int getPreferredWidth() {
        ResizeOptions resizeOptions = this.mResizeOptions;
        if (resizeOptions != null) {
            return resizeOptions.width;
        }
        return 2048;
    }

    public Priority getPriority() {
        return this.mRequestPriority;
    }

    public boolean getProgressiveRenderingEnabled() {
        return this.mProgressiveRenderingEnabled;
    }

    @Nullable
    public RequestListener getRequestListener() {
        return this.mRequestListener;
    }

    @Nullable
    public ResizeOptions getResizeOptions() {
        return this.mResizeOptions;
    }

    @Nullable
    public Boolean getResizingAllowedOverride() {
        return this.mResizingAllowedOverride;
    }

    public RotationOptions getRotationOptions() {
        return this.mRotationOptions;
    }

    public synchronized File getSourceFile() {
        if (this.mSourceFile == null) {
            this.mSourceFile = new File(this.mSourceUri.getPath());
        }
        return this.mSourceFile;
    }

    public Uri getSourceUri() {
        return this.mSourceUri;
    }

    public int getSourceUriType() {
        return this.mSourceUriType;
    }

    public int hashCode() {
        boolean z = sCacheHashcode;
        int i2 = z ? this.mHashcode : 0;
        if (i2 == 0) {
            Postprocessor postprocessor = this.mPostprocessor;
            i2 = Objects.hashCode(this.mCacheChoice, this.mSourceUri, Boolean.valueOf(this.mLocalThumbnailPreviewsEnabled), this.mBytesRange, this.mRequestPriority, this.mLowestPermittedRequestLevel, Integer.valueOf(this.mCachesDisabled), Boolean.valueOf(this.mIsDiskCacheEnabled), Boolean.valueOf(this.mIsMemoryCacheEnabled), this.mImageDecodeOptions, this.mDecodePrefetches, this.mResizeOptions, this.mRotationOptions, postprocessor != null ? postprocessor.getPostprocessorCacheKey() : null, this.mResizingAllowedOverride, Integer.valueOf(this.mDelayMs), Boolean.valueOf(this.mLoadThumbnailOnly));
            if (z) {
                this.mHashcode = i2;
            }
        }
        return i2;
    }

    public boolean isCacheEnabled(int cacheMask) {
        return (cacheMask & getCachesDisabled()) == 0;
    }

    public boolean isDiskCacheEnabled() {
        return this.mIsDiskCacheEnabled;
    }

    public boolean isMemoryCacheEnabled() {
        return this.mIsMemoryCacheEnabled;
    }

    @Nullable
    public Boolean shouldDecodePrefetches() {
        return this.mDecodePrefetches;
    }

    public String toString() {
        return Objects.toStringHelper(this).add(NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, this.mSourceUri).add("cacheChoice", this.mCacheChoice).add("decodeOptions", this.mImageDecodeOptions).add("postprocessor", this.mPostprocessor).add(SobotProgress.PRIORITY, this.mRequestPriority).add("resizeOptions", this.mResizeOptions).add("rotationOptions", this.mRotationOptions).add("bytesRange", this.mBytesRange).add("resizingAllowedOverride", this.mResizingAllowedOverride).add("progressiveRenderingEnabled", this.mProgressiveRenderingEnabled).add("localThumbnailPreviewsEnabled", this.mLocalThumbnailPreviewsEnabled).add("loadThumbnailOnly", this.mLoadThumbnailOnly).add("lowestPermittedRequestLevel", this.mLowestPermittedRequestLevel).add("cachesDisabled", this.mCachesDisabled).add("isDiskCacheEnabled", this.mIsDiskCacheEnabled).add("isMemoryCacheEnabled", this.mIsMemoryCacheEnabled).add("decodePrefetches", this.mDecodePrefetches).add("delayMs", this.mDelayMs).toString();
    }

    @Nullable
    public static ImageRequest fromUri(@Nullable String uriString) {
        if (uriString == null || uriString.length() == 0) {
            return null;
        }
        return fromUri(Uri.parse(uriString));
    }

    private static int getSourceUriType(final Uri uri) {
        if (uri == null) {
            return -1;
        }
        if (UriUtil.isNetworkUri(uri)) {
            return 0;
        }
        if (UriUtil.isLocalFileUri(uri)) {
            return MediaUtils.isVideo(MediaUtils.extractMime(uri.getPath())) ? 2 : 3;
        } else if (UriUtil.isLocalContentUri(uri)) {
            return 4;
        } else {
            if (UriUtil.isLocalAssetUri(uri)) {
                return 5;
            }
            if (UriUtil.isLocalResourceUri(uri)) {
                return 6;
            }
            if (UriUtil.isDataUri(uri)) {
                return 7;
            }
            return UriUtil.isQualifiedResourceUri(uri) ? 8 : -1;
        }
    }
}
