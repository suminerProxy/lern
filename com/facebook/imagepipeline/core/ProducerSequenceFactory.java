package com.facebook.imagepipeline.core;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.Build;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.media.MediaUtils;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.webp.WebpSupportStatus;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.producers.AddImageTransformMetaDataProducer;
import com.facebook.imagepipeline.producers.DiskCacheReadProducer;
import com.facebook.imagepipeline.producers.DiskCacheWriteProducer;
import com.facebook.imagepipeline.producers.EncodedMemoryCacheProducer;
import com.facebook.imagepipeline.producers.NetworkFetcher;
import com.facebook.imagepipeline.producers.Producer;
import com.facebook.imagepipeline.producers.RemoveImageTransformMetaDataProducer;
import com.facebook.imagepipeline.producers.ThreadHandoffProducerQueue;
import com.facebook.imagepipeline.producers.ThumbnailProducer;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.systrace.FrescoSystrace;
import com.facebook.imagepipeline.transcoder.ImageTranscoderFactory;
import com.facebook.infer.annotation.Nullsafe;
import java.util.HashMap;
import java.util.Map;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ProducerSequenceFactory {
    private final boolean mAllowDelay;
    @Nullable
    @VisibleForTesting
    public Producer<EncodedImage> mBackgroundLocalContentUriFetchToEncodedMemorySequence;
    @Nullable
    @VisibleForTesting
    public Producer<EncodedImage> mBackgroundLocalFileFetchToEncodedMemorySequence;
    @Nullable
    @VisibleForTesting
    public Producer<EncodedImage> mBackgroundNetworkFetchToEncodedMemorySequence;
    @Nullable
    private Producer<EncodedImage> mCommonNetworkFetchToEncodedMemorySequence;
    private final ContentResolver mContentResolver;
    @Nullable
    @VisibleForTesting
    public Producer<CloseableReference<CloseableImage>> mDataFetchSequence;
    private final boolean mDiskCacheEnabled;
    private final boolean mDownsampleEnabled;
    private final ImageTranscoderFactory mImageTranscoderFactory;
    private final boolean mIsDiskCacheProbingEnabled;
    private final boolean mIsEncodedMemoryCacheProbingEnabled;
    @Nullable
    @VisibleForTesting
    public Producer<CloseableReference<CloseableImage>> mLocalAssetFetchSequence;
    @Nullable
    @VisibleForTesting
    public Producer<CloseableReference<PooledByteBuffer>> mLocalContentUriEncodedImageProducerSequence;
    @Nullable
    @VisibleForTesting
    public Producer<CloseableReference<CloseableImage>> mLocalContentUriFetchSequence;
    @Nullable
    @VisibleForTesting
    public Producer<CloseableReference<PooledByteBuffer>> mLocalFileEncodedImageProducerSequence;
    @Nullable
    @VisibleForTesting
    public Producer<Void> mLocalFileFetchToEncodedMemoryPrefetchSequence;
    @Nullable
    @VisibleForTesting
    public Producer<CloseableReference<CloseableImage>> mLocalImageFileFetchSequence;
    @Nullable
    @VisibleForTesting
    public Producer<CloseableReference<CloseableImage>> mLocalResourceFetchSequence;
    @Nullable
    @VisibleForTesting
    public Producer<CloseableReference<CloseableImage>> mLocalThumbnailBitmapFetchSequence;
    @Nullable
    @VisibleForTesting
    public Producer<CloseableReference<CloseableImage>> mLocalVideoFileFetchSequence;
    @Nullable
    @VisibleForTesting
    public Producer<CloseableReference<PooledByteBuffer>> mNetworkEncodedImageProducerSequence;
    @Nullable
    @VisibleForTesting
    public Producer<CloseableReference<CloseableImage>> mNetworkFetchSequence;
    @Nullable
    @VisibleForTesting
    public Producer<Void> mNetworkFetchToEncodedMemoryPrefetchSequence;
    private final NetworkFetcher mNetworkFetcher;
    private final boolean mPartialImageCachingEnabled;
    private final ProducerFactory mProducerFactory;
    @Nullable
    @VisibleForTesting
    public Producer<CloseableReference<CloseableImage>> mQualifiedResourceFetchSequence;
    private final boolean mResizeAndRotateEnabledForNetwork;
    private final ThreadHandoffProducerQueue mThreadHandoffProducerQueue;
    private final boolean mUseBitmapPrepareToDraw;
    private final boolean mWebpSupportEnabled;
    @VisibleForTesting
    public Map<Producer<CloseableReference<CloseableImage>>, Producer<CloseableReference<CloseableImage>>> mPostprocessorSequences = new HashMap();
    @VisibleForTesting
    public Map<Producer<CloseableReference<CloseableImage>>, Producer<Void>> mCloseableImagePrefetchSequences = new HashMap();
    @VisibleForTesting
    public Map<Producer<CloseableReference<CloseableImage>>, Producer<CloseableReference<CloseableImage>>> mBitmapPrepareSequences = new HashMap();

    public ProducerSequenceFactory(ContentResolver contentResolver, ProducerFactory producerFactory, NetworkFetcher networkFetcher, boolean resizeAndRotateEnabledForNetwork, boolean webpSupportEnabled, ThreadHandoffProducerQueue threadHandoffProducerQueue, boolean downSampleEnabled, boolean useBitmapPrepareToDraw, boolean partialImageCachingEnabled, boolean diskCacheEnabled, ImageTranscoderFactory imageTranscoderFactory, boolean isEncodedMemoryCacheProbingEnabled, boolean isDiskCacheProbingEnabled, boolean allowDelay) {
        this.mContentResolver = contentResolver;
        this.mProducerFactory = producerFactory;
        this.mNetworkFetcher = networkFetcher;
        this.mResizeAndRotateEnabledForNetwork = resizeAndRotateEnabledForNetwork;
        this.mWebpSupportEnabled = webpSupportEnabled;
        this.mThreadHandoffProducerQueue = threadHandoffProducerQueue;
        this.mDownsampleEnabled = downSampleEnabled;
        this.mUseBitmapPrepareToDraw = useBitmapPrepareToDraw;
        this.mPartialImageCachingEnabled = partialImageCachingEnabled;
        this.mDiskCacheEnabled = diskCacheEnabled;
        this.mImageTranscoderFactory = imageTranscoderFactory;
        this.mIsEncodedMemoryCacheProbingEnabled = isEncodedMemoryCacheProbingEnabled;
        this.mIsDiskCacheProbingEnabled = isDiskCacheProbingEnabled;
        this.mAllowDelay = allowDelay;
    }

    private synchronized Producer<EncodedImage> getBackgroundLocalContentUriFetchToEncodeMemorySequence() {
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.beginSection("ProducerSequenceFactory#getBackgroundLocalContentUriFetchToEncodeMemorySequence");
        }
        if (this.mBackgroundLocalContentUriFetchToEncodedMemorySequence == null) {
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.beginSection("ProducerSequenceFactory#getBackgroundLocalContentUriFetchToEncodeMemorySequence:init");
            }
            this.mBackgroundLocalContentUriFetchToEncodedMemorySequence = this.mProducerFactory.newBackgroundThreadHandoffProducer(newEncodedCacheMultiplexToTranscodeSequence(this.mProducerFactory.newLocalContentUriFetchProducer()), this.mThreadHandoffProducerQueue);
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.endSection();
            }
        }
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.endSection();
        }
        return this.mBackgroundLocalContentUriFetchToEncodedMemorySequence;
    }

    private synchronized Producer<EncodedImage> getBackgroundLocalFileFetchToEncodeMemorySequence() {
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.beginSection("ProducerSequenceFactory#getBackgroundLocalFileFetchToEncodeMemorySequence");
        }
        if (this.mBackgroundLocalFileFetchToEncodedMemorySequence == null) {
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.beginSection("ProducerSequenceFactory#getBackgroundLocalFileFetchToEncodeMemorySequence:init");
            }
            this.mBackgroundLocalFileFetchToEncodedMemorySequence = this.mProducerFactory.newBackgroundThreadHandoffProducer(newEncodedCacheMultiplexToTranscodeSequence(this.mProducerFactory.newLocalFileFetchProducer()), this.mThreadHandoffProducerQueue);
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.endSection();
            }
        }
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.endSection();
        }
        return this.mBackgroundLocalFileFetchToEncodedMemorySequence;
    }

    private synchronized Producer<EncodedImage> getBackgroundNetworkFetchToEncodedMemorySequence() {
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.beginSection("ProducerSequenceFactory#getBackgroundNetworkFetchToEncodedMemorySequence");
        }
        if (this.mBackgroundNetworkFetchToEncodedMemorySequence == null) {
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.beginSection("ProducerSequenceFactory#getBackgroundNetworkFetchToEncodedMemorySequence:init");
            }
            this.mBackgroundNetworkFetchToEncodedMemorySequence = this.mProducerFactory.newBackgroundThreadHandoffProducer(getCommonNetworkFetchToEncodedMemorySequence(), this.mThreadHandoffProducerQueue);
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.endSection();
            }
        }
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.endSection();
        }
        return this.mBackgroundNetworkFetchToEncodedMemorySequence;
    }

    private Producer<CloseableReference<CloseableImage>> getBasicDecodedImageSequence(ImageRequest imageRequest) {
        try {
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.beginSection("ProducerSequenceFactory#getBasicDecodedImageSequence");
            }
            Preconditions.checkNotNull(imageRequest);
            Uri sourceUri = imageRequest.getSourceUri();
            Preconditions.checkNotNull(sourceUri, "Uri is null.");
            int sourceUriType = imageRequest.getSourceUriType();
            if (sourceUriType != 0) {
                switch (sourceUriType) {
                    case 2:
                        Producer<CloseableReference<CloseableImage>> localVideoFileFetchSequence = getLocalVideoFileFetchSequence();
                        if (FrescoSystrace.isTracing()) {
                            FrescoSystrace.endSection();
                        }
                        return localVideoFileFetchSequence;
                    case 3:
                        Producer<CloseableReference<CloseableImage>> localImageFileFetchSequence = getLocalImageFileFetchSequence();
                        if (FrescoSystrace.isTracing()) {
                            FrescoSystrace.endSection();
                        }
                        return localImageFileFetchSequence;
                    case 4:
                        if (imageRequest.getLoadThumbnailOnly() && Build.VERSION.SDK_INT >= 29) {
                            Producer<CloseableReference<CloseableImage>> localContentUriThumbnailFetchSequence = getLocalContentUriThumbnailFetchSequence();
                            if (FrescoSystrace.isTracing()) {
                                FrescoSystrace.endSection();
                            }
                            return localContentUriThumbnailFetchSequence;
                        } else if (MediaUtils.isVideo(this.mContentResolver.getType(sourceUri))) {
                            Producer<CloseableReference<CloseableImage>> localVideoFileFetchSequence2 = getLocalVideoFileFetchSequence();
                            if (FrescoSystrace.isTracing()) {
                                FrescoSystrace.endSection();
                            }
                            return localVideoFileFetchSequence2;
                        } else {
                            Producer<CloseableReference<CloseableImage>> localContentUriFetchSequence = getLocalContentUriFetchSequence();
                            if (FrescoSystrace.isTracing()) {
                                FrescoSystrace.endSection();
                            }
                            return localContentUriFetchSequence;
                        }
                    case 5:
                        Producer<CloseableReference<CloseableImage>> localAssetFetchSequence = getLocalAssetFetchSequence();
                        if (FrescoSystrace.isTracing()) {
                            FrescoSystrace.endSection();
                        }
                        return localAssetFetchSequence;
                    case 6:
                        Producer<CloseableReference<CloseableImage>> localResourceFetchSequence = getLocalResourceFetchSequence();
                        if (FrescoSystrace.isTracing()) {
                            FrescoSystrace.endSection();
                        }
                        return localResourceFetchSequence;
                    case 7:
                        Producer<CloseableReference<CloseableImage>> dataFetchSequence = getDataFetchSequence();
                        if (FrescoSystrace.isTracing()) {
                            FrescoSystrace.endSection();
                        }
                        return dataFetchSequence;
                    case 8:
                        return getQualifiedResourceFetchSequence();
                    default:
                        throw new IllegalArgumentException("Unsupported uri scheme! Uri is: " + getShortenedUriString(sourceUri));
                }
            }
            Producer<CloseableReference<CloseableImage>> networkFetchSequence = getNetworkFetchSequence();
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.endSection();
            }
            return networkFetchSequence;
        } finally {
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.endSection();
            }
        }
    }

    private synchronized Producer<CloseableReference<CloseableImage>> getBitmapPrepareSequence(Producer<CloseableReference<CloseableImage>> inputProducer) {
        Producer<CloseableReference<CloseableImage>> producer;
        producer = this.mBitmapPrepareSequences.get(inputProducer);
        if (producer == null) {
            producer = this.mProducerFactory.newBitmapPrepareProducer(inputProducer);
            this.mBitmapPrepareSequences.put(inputProducer, producer);
        }
        return producer;
    }

    private synchronized Producer<EncodedImage> getCommonNetworkFetchToEncodedMemorySequence() {
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.beginSection("ProducerSequenceFactory#getCommonNetworkFetchToEncodedMemorySequence");
        }
        if (this.mCommonNetworkFetchToEncodedMemorySequence == null) {
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.beginSection("ProducerSequenceFactory#getCommonNetworkFetchToEncodedMemorySequence:init");
            }
            AddImageTransformMetaDataProducer newAddImageTransformMetaDataProducer = ProducerFactory.newAddImageTransformMetaDataProducer((Producer) Preconditions.checkNotNull(newEncodedCacheMultiplexToTranscodeSequence(this.mProducerFactory.newNetworkFetchProducer(this.mNetworkFetcher))));
            this.mCommonNetworkFetchToEncodedMemorySequence = newAddImageTransformMetaDataProducer;
            this.mCommonNetworkFetchToEncodedMemorySequence = this.mProducerFactory.newResizeAndRotateProducer(newAddImageTransformMetaDataProducer, this.mResizeAndRotateEnabledForNetwork && !this.mDownsampleEnabled, this.mImageTranscoderFactory);
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.endSection();
            }
        }
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.endSection();
        }
        return this.mCommonNetworkFetchToEncodedMemorySequence;
    }

    private synchronized Producer<CloseableReference<CloseableImage>> getDataFetchSequence() {
        if (this.mDataFetchSequence == null) {
            Producer<EncodedImage> newDataFetchProducer = this.mProducerFactory.newDataFetchProducer();
            if (WebpSupportStatus.sIsWebpSupportRequired && (!this.mWebpSupportEnabled || WebpSupportStatus.sWebpBitmapFactory == null)) {
                newDataFetchProducer = this.mProducerFactory.newWebpTranscodeProducer(newDataFetchProducer);
            }
            this.mDataFetchSequence = newBitmapCacheGetToDecodeSequence(this.mProducerFactory.newResizeAndRotateProducer(ProducerFactory.newAddImageTransformMetaDataProducer(newDataFetchProducer), true, this.mImageTranscoderFactory));
        }
        return this.mDataFetchSequence;
    }

    private synchronized Producer<Void> getDecodedImagePrefetchSequence(Producer<CloseableReference<CloseableImage>> inputProducer) {
        Producer<Void> producer;
        producer = this.mCloseableImagePrefetchSequences.get(inputProducer);
        if (producer == null) {
            producer = this.mProducerFactory.newSwallowResultProducer(inputProducer);
            this.mCloseableImagePrefetchSequences.put(inputProducer, producer);
        }
        return producer;
    }

    private synchronized Producer<CloseableReference<CloseableImage>> getDelaySequence(Producer<CloseableReference<CloseableImage>> inputProducer) {
        return this.mProducerFactory.newDelayProducer(inputProducer);
    }

    private synchronized Producer<CloseableReference<CloseableImage>> getLocalAssetFetchSequence() {
        if (this.mLocalAssetFetchSequence == null) {
            this.mLocalAssetFetchSequence = newBitmapCacheGetToLocalTransformSequence(this.mProducerFactory.newLocalAssetFetchProducer());
        }
        return this.mLocalAssetFetchSequence;
    }

    private synchronized Producer<CloseableReference<CloseableImage>> getLocalContentUriFetchSequence() {
        if (this.mLocalContentUriFetchSequence == null) {
            this.mLocalContentUriFetchSequence = newBitmapCacheGetToLocalTransformSequence(this.mProducerFactory.newLocalContentUriFetchProducer(), new ThumbnailProducer[]{this.mProducerFactory.newLocalContentUriThumbnailFetchProducer(), this.mProducerFactory.newLocalExifThumbnailProducer()});
        }
        return this.mLocalContentUriFetchSequence;
    }

    @RequiresApi(29)
    private synchronized Producer<CloseableReference<CloseableImage>> getLocalContentUriThumbnailFetchSequence() {
        if (this.mLocalThumbnailBitmapFetchSequence == null) {
            this.mLocalThumbnailBitmapFetchSequence = newBitmapCacheGetToBitmapCacheSequence(this.mProducerFactory.newLocalThumbnailBitmapProducer());
        }
        return this.mLocalThumbnailBitmapFetchSequence;
    }

    private synchronized Producer<Void> getLocalFileFetchToEncodedMemoryPrefetchSequence() {
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.beginSection("ProducerSequenceFactory#getLocalFileFetchToEncodedMemoryPrefetchSequence");
        }
        if (this.mLocalFileFetchToEncodedMemoryPrefetchSequence == null) {
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.beginSection("ProducerSequenceFactory#getLocalFileFetchToEncodedMemoryPrefetchSequence:init");
            }
            this.mLocalFileFetchToEncodedMemoryPrefetchSequence = this.mProducerFactory.newSwallowResultProducer(getBackgroundLocalFileFetchToEncodeMemorySequence());
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.endSection();
            }
        }
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.endSection();
        }
        return this.mLocalFileFetchToEncodedMemoryPrefetchSequence;
    }

    private synchronized Producer<CloseableReference<CloseableImage>> getLocalImageFileFetchSequence() {
        if (this.mLocalImageFileFetchSequence == null) {
            this.mLocalImageFileFetchSequence = newBitmapCacheGetToLocalTransformSequence(this.mProducerFactory.newLocalFileFetchProducer());
        }
        return this.mLocalImageFileFetchSequence;
    }

    private synchronized Producer<CloseableReference<CloseableImage>> getLocalResourceFetchSequence() {
        if (this.mLocalResourceFetchSequence == null) {
            this.mLocalResourceFetchSequence = newBitmapCacheGetToLocalTransformSequence(this.mProducerFactory.newLocalResourceFetchProducer());
        }
        return this.mLocalResourceFetchSequence;
    }

    private synchronized Producer<CloseableReference<CloseableImage>> getLocalVideoFileFetchSequence() {
        if (this.mLocalVideoFileFetchSequence == null) {
            this.mLocalVideoFileFetchSequence = newBitmapCacheGetToBitmapCacheSequence(this.mProducerFactory.newLocalVideoThumbnailProducer());
        }
        return this.mLocalVideoFileFetchSequence;
    }

    private synchronized Producer<CloseableReference<CloseableImage>> getNetworkFetchSequence() {
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.beginSection("ProducerSequenceFactory#getNetworkFetchSequence");
        }
        if (this.mNetworkFetchSequence == null) {
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.beginSection("ProducerSequenceFactory#getNetworkFetchSequence:init");
            }
            this.mNetworkFetchSequence = newBitmapCacheGetToDecodeSequence(getCommonNetworkFetchToEncodedMemorySequence());
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.endSection();
            }
        }
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.endSection();
        }
        return this.mNetworkFetchSequence;
    }

    private synchronized Producer<Void> getNetworkFetchToEncodedMemoryPrefetchSequence() {
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.beginSection("ProducerSequenceFactory#getNetworkFetchToEncodedMemoryPrefetchSequence");
        }
        if (this.mNetworkFetchToEncodedMemoryPrefetchSequence == null) {
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.beginSection("ProducerSequenceFactory#getNetworkFetchToEncodedMemoryPrefetchSequence:init");
            }
            this.mNetworkFetchToEncodedMemoryPrefetchSequence = this.mProducerFactory.newSwallowResultProducer(getBackgroundNetworkFetchToEncodedMemorySequence());
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.endSection();
            }
        }
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.endSection();
        }
        return this.mNetworkFetchToEncodedMemoryPrefetchSequence;
    }

    private synchronized Producer<CloseableReference<CloseableImage>> getPostprocessorSequence(Producer<CloseableReference<CloseableImage>> inputProducer) {
        Producer<CloseableReference<CloseableImage>> producer;
        producer = this.mPostprocessorSequences.get(inputProducer);
        if (producer == null) {
            producer = this.mProducerFactory.newPostprocessorBitmapMemoryCacheProducer(this.mProducerFactory.newPostprocessorProducer(inputProducer));
            this.mPostprocessorSequences.put(inputProducer, producer);
        }
        return producer;
    }

    private synchronized Producer<CloseableReference<CloseableImage>> getQualifiedResourceFetchSequence() {
        if (this.mQualifiedResourceFetchSequence == null) {
            this.mQualifiedResourceFetchSequence = newBitmapCacheGetToLocalTransformSequence(this.mProducerFactory.newQualifiedResourceFetchProducer());
        }
        return this.mQualifiedResourceFetchSequence;
    }

    private static String getShortenedUriString(Uri uri) {
        String valueOf = String.valueOf(uri);
        if (valueOf.length() > 30) {
            return valueOf.substring(0, 30) + "...";
        }
        return valueOf;
    }

    private Producer<CloseableReference<CloseableImage>> newBitmapCacheGetToBitmapCacheSequence(Producer<CloseableReference<CloseableImage>> inputProducer) {
        Producer<CloseableReference<CloseableImage>> newBackgroundThreadHandoffProducer = this.mProducerFactory.newBackgroundThreadHandoffProducer(this.mProducerFactory.newBitmapMemoryCacheKeyMultiplexProducer(this.mProducerFactory.newBitmapMemoryCacheProducer(inputProducer)), this.mThreadHandoffProducerQueue);
        if (!this.mIsEncodedMemoryCacheProbingEnabled && !this.mIsDiskCacheProbingEnabled) {
            return this.mProducerFactory.newBitmapMemoryCacheGetProducer(newBackgroundThreadHandoffProducer);
        }
        return this.mProducerFactory.newBitmapProbeProducer(this.mProducerFactory.newBitmapMemoryCacheGetProducer(newBackgroundThreadHandoffProducer));
    }

    private Producer<CloseableReference<CloseableImage>> newBitmapCacheGetToDecodeSequence(Producer<EncodedImage> inputProducer) {
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.beginSection("ProducerSequenceFactory#newBitmapCacheGetToDecodeSequence");
        }
        Producer<CloseableReference<CloseableImage>> newBitmapCacheGetToBitmapCacheSequence = newBitmapCacheGetToBitmapCacheSequence(this.mProducerFactory.newDecodeProducer(inputProducer));
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.endSection();
        }
        return newBitmapCacheGetToBitmapCacheSequence;
    }

    private Producer<CloseableReference<CloseableImage>> newBitmapCacheGetToLocalTransformSequence(Producer<EncodedImage> inputProducer) {
        return newBitmapCacheGetToLocalTransformSequence(inputProducer, new ThumbnailProducer[]{this.mProducerFactory.newLocalExifThumbnailProducer()});
    }

    private Producer<EncodedImage> newDiskCacheSequence(Producer<EncodedImage> inputProducer) {
        DiskCacheWriteProducer newDiskCacheWriteProducer;
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.beginSection("ProducerSequenceFactory#newDiskCacheSequence");
        }
        if (this.mPartialImageCachingEnabled) {
            newDiskCacheWriteProducer = this.mProducerFactory.newDiskCacheWriteProducer(this.mProducerFactory.newPartialDiskCacheProducer(inputProducer));
        } else {
            newDiskCacheWriteProducer = this.mProducerFactory.newDiskCacheWriteProducer(inputProducer);
        }
        DiskCacheReadProducer newDiskCacheReadProducer = this.mProducerFactory.newDiskCacheReadProducer(newDiskCacheWriteProducer);
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.endSection();
        }
        return newDiskCacheReadProducer;
    }

    private Producer<EncodedImage> newEncodedCacheMultiplexToTranscodeSequence(Producer<EncodedImage> inputProducer) {
        if (WebpSupportStatus.sIsWebpSupportRequired && (!this.mWebpSupportEnabled || WebpSupportStatus.sWebpBitmapFactory == null)) {
            inputProducer = this.mProducerFactory.newWebpTranscodeProducer(inputProducer);
        }
        if (this.mDiskCacheEnabled) {
            inputProducer = newDiskCacheSequence(inputProducer);
        }
        EncodedMemoryCacheProducer newEncodedMemoryCacheProducer = this.mProducerFactory.newEncodedMemoryCacheProducer(inputProducer);
        if (this.mIsDiskCacheProbingEnabled) {
            return this.mProducerFactory.newEncodedCacheKeyMultiplexProducer(this.mProducerFactory.newEncodedProbeProducer(newEncodedMemoryCacheProducer));
        }
        return this.mProducerFactory.newEncodedCacheKeyMultiplexProducer(newEncodedMemoryCacheProducer);
    }

    private Producer<EncodedImage> newLocalThumbnailProducer(ThumbnailProducer<EncodedImage>[] thumbnailProducers) {
        return this.mProducerFactory.newResizeAndRotateProducer(this.mProducerFactory.newThumbnailBranchProducer(thumbnailProducers), true, this.mImageTranscoderFactory);
    }

    private Producer<EncodedImage> newLocalTransformationsSequence(Producer<EncodedImage> inputProducer, ThumbnailProducer<EncodedImage>[] thumbnailProducers) {
        return ProducerFactory.newBranchOnSeparateImagesProducer(newLocalThumbnailProducer(thumbnailProducers), this.mProducerFactory.newThrottlingProducer(this.mProducerFactory.newResizeAndRotateProducer(ProducerFactory.newAddImageTransformMetaDataProducer(inputProducer), true, this.mImageTranscoderFactory)));
    }

    private static void validateEncodedImageRequest(ImageRequest imageRequest) {
        Preconditions.checkNotNull(imageRequest);
        Preconditions.checkArgument(Boolean.valueOf(imageRequest.getLowestPermittedRequestLevel().getValue() <= ImageRequest.RequestLevel.ENCODED_MEMORY_CACHE.getValue()));
    }

    public Producer<Void> getDecodedImagePrefetchProducerSequence(ImageRequest imageRequest) {
        Producer<CloseableReference<CloseableImage>> basicDecodedImageSequence = getBasicDecodedImageSequence(imageRequest);
        if (this.mUseBitmapPrepareToDraw) {
            basicDecodedImageSequence = getBitmapPrepareSequence(basicDecodedImageSequence);
        }
        return getDecodedImagePrefetchSequence(basicDecodedImageSequence);
    }

    public Producer<CloseableReference<CloseableImage>> getDecodedImageProducerSequence(ImageRequest imageRequest) {
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.beginSection("ProducerSequenceFactory#getDecodedImageProducerSequence");
        }
        Producer<CloseableReference<CloseableImage>> basicDecodedImageSequence = getBasicDecodedImageSequence(imageRequest);
        if (imageRequest.getPostprocessor() != null) {
            basicDecodedImageSequence = getPostprocessorSequence(basicDecodedImageSequence);
        }
        if (this.mUseBitmapPrepareToDraw) {
            basicDecodedImageSequence = getBitmapPrepareSequence(basicDecodedImageSequence);
        }
        if (this.mAllowDelay && imageRequest.getDelayMs() > 0) {
            basicDecodedImageSequence = getDelaySequence(basicDecodedImageSequence);
        }
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.endSection();
        }
        return basicDecodedImageSequence;
    }

    public Producer<Void> getEncodedImagePrefetchProducerSequence(ImageRequest imageRequest) {
        validateEncodedImageRequest(imageRequest);
        int sourceUriType = imageRequest.getSourceUriType();
        if (sourceUriType != 0) {
            if (sourceUriType != 2 && sourceUriType != 3) {
                Uri sourceUri = imageRequest.getSourceUri();
                throw new IllegalArgumentException("Unsupported uri scheme for encoded image fetch! Uri is: " + getShortenedUriString(sourceUri));
            }
            return getLocalFileFetchToEncodedMemoryPrefetchSequence();
        }
        return getNetworkFetchToEncodedMemoryPrefetchSequence();
    }

    public Producer<CloseableReference<PooledByteBuffer>> getEncodedImageProducerSequence(ImageRequest imageRequest) {
        try {
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.beginSection("ProducerSequenceFactory#getEncodedImageProducerSequence");
            }
            validateEncodedImageRequest(imageRequest);
            Uri sourceUri = imageRequest.getSourceUri();
            int sourceUriType = imageRequest.getSourceUriType();
            if (sourceUriType == 0) {
                Producer<CloseableReference<PooledByteBuffer>> networkFetchEncodedImageProducerSequence = getNetworkFetchEncodedImageProducerSequence();
                if (FrescoSystrace.isTracing()) {
                    FrescoSystrace.endSection();
                }
                return networkFetchEncodedImageProducerSequence;
            } else if (sourceUriType == 2 || sourceUriType == 3) {
                Producer<CloseableReference<PooledByteBuffer>> localFileFetchEncodedImageProducerSequence = getLocalFileFetchEncodedImageProducerSequence();
                if (FrescoSystrace.isTracing()) {
                    FrescoSystrace.endSection();
                }
                return localFileFetchEncodedImageProducerSequence;
            } else if (sourceUriType == 4) {
                return getLocalContentUriFetchEncodedImageProducerSequence();
            } else {
                throw new IllegalArgumentException("Unsupported uri scheme for encoded image fetch! Uri is: " + getShortenedUriString(sourceUri));
            }
        } finally {
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.endSection();
            }
        }
    }

    public Producer<CloseableReference<PooledByteBuffer>> getLocalContentUriFetchEncodedImageProducerSequence() {
        synchronized (this) {
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.beginSection("ProducerSequenceFactory#getLocalContentUriFetchEncodedImageProducerSequence");
            }
            if (this.mLocalContentUriEncodedImageProducerSequence == null) {
                if (FrescoSystrace.isTracing()) {
                    FrescoSystrace.beginSection("ProducerSequenceFactory#getLocalContentUriFetchEncodedImageProducerSequence:init");
                }
                this.mLocalContentUriEncodedImageProducerSequence = new RemoveImageTransformMetaDataProducer(getBackgroundLocalContentUriFetchToEncodeMemorySequence());
                if (FrescoSystrace.isTracing()) {
                    FrescoSystrace.endSection();
                }
            }
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.endSection();
            }
        }
        return this.mLocalContentUriEncodedImageProducerSequence;
    }

    public Producer<CloseableReference<PooledByteBuffer>> getLocalFileFetchEncodedImageProducerSequence() {
        synchronized (this) {
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.beginSection("ProducerSequenceFactory#getLocalFileFetchEncodedImageProducerSequence");
            }
            if (this.mLocalFileEncodedImageProducerSequence == null) {
                if (FrescoSystrace.isTracing()) {
                    FrescoSystrace.beginSection("ProducerSequenceFactory#getLocalFileFetchEncodedImageProducerSequence:init");
                }
                this.mLocalFileEncodedImageProducerSequence = new RemoveImageTransformMetaDataProducer(getBackgroundLocalFileFetchToEncodeMemorySequence());
                if (FrescoSystrace.isTracing()) {
                    FrescoSystrace.endSection();
                }
            }
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.endSection();
            }
        }
        return this.mLocalFileEncodedImageProducerSequence;
    }

    public Producer<CloseableReference<PooledByteBuffer>> getNetworkFetchEncodedImageProducerSequence() {
        synchronized (this) {
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.beginSection("ProducerSequenceFactory#getNetworkFetchEncodedImageProducerSequence");
            }
            if (this.mNetworkEncodedImageProducerSequence == null) {
                if (FrescoSystrace.isTracing()) {
                    FrescoSystrace.beginSection("ProducerSequenceFactory#getNetworkFetchEncodedImageProducerSequence:init");
                }
                this.mNetworkEncodedImageProducerSequence = new RemoveImageTransformMetaDataProducer(getBackgroundNetworkFetchToEncodedMemorySequence());
                if (FrescoSystrace.isTracing()) {
                    FrescoSystrace.endSection();
                }
            }
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.endSection();
            }
        }
        return this.mNetworkEncodedImageProducerSequence;
    }

    private Producer<CloseableReference<CloseableImage>> newBitmapCacheGetToLocalTransformSequence(Producer<EncodedImage> inputProducer, ThumbnailProducer<EncodedImage>[] thumbnailProducers) {
        return newBitmapCacheGetToDecodeSequence(newLocalTransformationsSequence(newEncodedCacheMultiplexToTranscodeSequence(inputProducer), thumbnailProducers));
    }
}
