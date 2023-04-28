package com.facebook.imagepipeline.request;

import android.net.Uri;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.util.UriUtil;
import com.facebook.imagepipeline.common.BytesRange;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.request.ImageRequest;
import javax.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class ImageRequestBuilder {
    private int mDelayMs;
    @Nullable
    private RequestListener mRequestListener;
    private Uri mSourceUri = null;
    private ImageRequest.RequestLevel mLowestPermittedRequestLevel = ImageRequest.RequestLevel.FULL_FETCH;
    private int mCachesDisabled = 0;
    @Nullable
    private ResizeOptions mResizeOptions = null;
    @Nullable
    private RotationOptions mRotationOptions = null;
    private ImageDecodeOptions mImageDecodeOptions = ImageDecodeOptions.defaults();
    private ImageRequest.CacheChoice mCacheChoice = ImageRequest.CacheChoice.DEFAULT;
    private boolean mProgressiveRenderingEnabled = ImagePipelineConfig.getDefaultImageRequestConfig().isProgressiveRenderingEnabled();
    private boolean mLocalThumbnailPreviewsEnabled = false;
    private boolean mLoadThumbnailOnly = false;
    private Priority mRequestPriority = Priority.HIGH;
    @Nullable
    private Postprocessor mPostprocessor = null;
    @Nullable
    private Boolean mDecodePrefetches = null;
    @Nullable
    private BytesRange mBytesRange = null;
    @Nullable
    private Boolean mResizingAllowedOverride = null;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class BuilderException extends RuntimeException {
        public BuilderException(String message) {
        }
    }

    private ImageRequestBuilder() {
    }

    public static ImageRequestBuilder fromRequest(ImageRequest imageRequest) {
        return newBuilderWithSource(imageRequest.getSourceUri()).setImageDecodeOptions(imageRequest.getImageDecodeOptions()).setBytesRange(imageRequest.getBytesRange()).setCacheChoice(imageRequest.getCacheChoice()).setLocalThumbnailPreviewsEnabled(imageRequest.getLocalThumbnailPreviewsEnabled()).setLoadThumbnailOnly(imageRequest.getLoadThumbnailOnly()).setLowestPermittedRequestLevel(imageRequest.getLowestPermittedRequestLevel()).setCachesDisabled(imageRequest.getCachesDisabled()).setPostprocessor(imageRequest.getPostprocessor()).setProgressiveRenderingEnabled(imageRequest.getProgressiveRenderingEnabled()).setRequestPriority(imageRequest.getPriority()).setResizeOptions(imageRequest.getResizeOptions()).setRequestListener(imageRequest.getRequestListener()).setRotationOptions(imageRequest.getRotationOptions()).setShouldDecodePrefetches(imageRequest.shouldDecodePrefetches()).setDelayMs(imageRequest.getDelayMs());
    }

    public static ImageRequestBuilder newBuilderWithResourceId(int resId) {
        return newBuilderWithSource(UriUtil.getUriForResourceId(resId));
    }

    public static ImageRequestBuilder newBuilderWithSource(Uri uri) {
        return new ImageRequestBuilder().setSource(uri);
    }

    private ImageRequestBuilder setCachesDisabled(int cachesDisabled) {
        this.mCachesDisabled = cachesDisabled;
        return this;
    }

    public ImageRequest build() {
        validate();
        return new ImageRequest(this);
    }

    public ImageRequestBuilder disableDiskCache() {
        this.mCachesDisabled |= 48;
        return this;
    }

    public ImageRequestBuilder disableMemoryCache() {
        this.mCachesDisabled |= 15;
        return this;
    }

    @Nullable
    public BytesRange getBytesRange() {
        return this.mBytesRange;
    }

    public ImageRequest.CacheChoice getCacheChoice() {
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

    public ImageRequest.RequestLevel getLowestPermittedRequestLevel() {
        return this.mLowestPermittedRequestLevel;
    }

    @Nullable
    public Postprocessor getPostprocessor() {
        return this.mPostprocessor;
    }

    @Nullable
    public RequestListener getRequestListener() {
        return this.mRequestListener;
    }

    public Priority getRequestPriority() {
        return this.mRequestPriority;
    }

    @Nullable
    public ResizeOptions getResizeOptions() {
        return this.mResizeOptions;
    }

    @Nullable
    public Boolean getResizingAllowedOverride() {
        return this.mResizingAllowedOverride;
    }

    @Nullable
    public RotationOptions getRotationOptions() {
        return this.mRotationOptions;
    }

    public Uri getSourceUri() {
        return this.mSourceUri;
    }

    public boolean isDiskCacheEnabled() {
        return (this.mCachesDisabled & 48) == 0 && UriUtil.isNetworkUri(this.mSourceUri);
    }

    public boolean isLocalThumbnailPreviewsEnabled() {
        return this.mLocalThumbnailPreviewsEnabled;
    }

    public boolean isMemoryCacheEnabled() {
        return (this.mCachesDisabled & 15) == 0;
    }

    public boolean isProgressiveRenderingEnabled() {
        return this.mProgressiveRenderingEnabled;
    }

    @Deprecated
    public ImageRequestBuilder setAutoRotateEnabled(boolean enabled) {
        if (enabled) {
            return setRotationOptions(RotationOptions.autoRotate());
        }
        return setRotationOptions(RotationOptions.disableRotation());
    }

    public ImageRequestBuilder setBytesRange(@Nullable BytesRange bytesRange) {
        this.mBytesRange = bytesRange;
        return this;
    }

    public ImageRequestBuilder setCacheChoice(ImageRequest.CacheChoice cacheChoice) {
        this.mCacheChoice = cacheChoice;
        return this;
    }

    public ImageRequestBuilder setDelayMs(int delayMs) {
        this.mDelayMs = delayMs;
        return this;
    }

    public ImageRequestBuilder setImageDecodeOptions(ImageDecodeOptions imageDecodeOptions) {
        this.mImageDecodeOptions = imageDecodeOptions;
        return this;
    }

    public ImageRequestBuilder setLoadThumbnailOnly(boolean loadThumbnailOnly) {
        this.mLoadThumbnailOnly = loadThumbnailOnly;
        return this;
    }

    public ImageRequestBuilder setLocalThumbnailPreviewsEnabled(boolean enabled) {
        this.mLocalThumbnailPreviewsEnabled = enabled;
        return this;
    }

    public ImageRequestBuilder setLowestPermittedRequestLevel(ImageRequest.RequestLevel requestLevel) {
        this.mLowestPermittedRequestLevel = requestLevel;
        return this;
    }

    public ImageRequestBuilder setPostprocessor(@Nullable Postprocessor postprocessor) {
        this.mPostprocessor = postprocessor;
        return this;
    }

    public ImageRequestBuilder setProgressiveRenderingEnabled(boolean enabled) {
        this.mProgressiveRenderingEnabled = enabled;
        return this;
    }

    public ImageRequestBuilder setRequestListener(@Nullable RequestListener requestListener) {
        this.mRequestListener = requestListener;
        return this;
    }

    public ImageRequestBuilder setRequestPriority(Priority requestPriority) {
        this.mRequestPriority = requestPriority;
        return this;
    }

    public ImageRequestBuilder setResizeOptions(@Nullable ResizeOptions resizeOptions) {
        this.mResizeOptions = resizeOptions;
        return this;
    }

    public ImageRequestBuilder setResizingAllowedOverride(@Nullable Boolean resizingAllowedOverride) {
        this.mResizingAllowedOverride = resizingAllowedOverride;
        return this;
    }

    public ImageRequestBuilder setRotationOptions(@Nullable RotationOptions rotationOptions) {
        this.mRotationOptions = rotationOptions;
        return this;
    }

    public ImageRequestBuilder setShouldDecodePrefetches(@Nullable Boolean shouldDecodePrefetches) {
        this.mDecodePrefetches = shouldDecodePrefetches;
        return this;
    }

    public ImageRequestBuilder setSource(Uri uri) {
        Preconditions.checkNotNull(uri);
        this.mSourceUri = uri;
        return this;
    }

    @Nullable
    public Boolean shouldDecodePrefetches() {
        return this.mDecodePrefetches;
    }

    public void validate() {
        Uri uri = this.mSourceUri;
        if (uri != null) {
            if (UriUtil.isLocalResourceUri(uri)) {
                if (this.mSourceUri.isAbsolute()) {
                    if (!this.mSourceUri.getPath().isEmpty()) {
                        try {
                            Integer.parseInt(this.mSourceUri.getPath().substring(1));
                        } catch (NumberFormatException unused) {
                            throw new BuilderException("Resource URI path must be a resource id.");
                        }
                    } else {
                        throw new BuilderException("Resource URI must not be empty");
                    }
                } else {
                    throw new BuilderException("Resource URI path must be absolute.");
                }
            }
            if (UriUtil.isLocalAssetUri(this.mSourceUri) && !this.mSourceUri.isAbsolute()) {
                throw new BuilderException("Asset URI path must be absolute.");
            }
            return;
        }
        throw new BuilderException("Source must be set!");
    }
}
