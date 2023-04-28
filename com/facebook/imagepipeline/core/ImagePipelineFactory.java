package com.facebook.imagepipeline.core;

import android.content.Context;
import android.os.Build;
import com.facebook.cache.common.CacheKey;
import com.facebook.cache.disk.FileCache;
import com.facebook.common.internal.AndroidPredicates;
import com.facebook.common.internal.Objects;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.logging.FLog;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.references.CloseableReference;
import com.facebook.imageformat.ImageFormatChecker;
import com.facebook.imagepipeline.animated.factory.AnimatedFactory;
import com.facebook.imagepipeline.animated.factory.AnimatedFactoryProvider;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactoryProvider;
import com.facebook.imagepipeline.cache.BufferedDiskCache;
import com.facebook.imagepipeline.cache.CountingMemoryCache;
import com.facebook.imagepipeline.cache.EncodedCountingMemoryCacheFactory;
import com.facebook.imagepipeline.cache.EncodedMemoryCacheFactory;
import com.facebook.imagepipeline.cache.InstrumentedMemoryCache;
import com.facebook.imagepipeline.cache.InstrumentedMemoryCacheBitmapMemoryCacheFactory;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.decoder.DefaultImageDecoder;
import com.facebook.imagepipeline.decoder.ImageDecoder;
import com.facebook.imagepipeline.drawable.DrawableFactory;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.platform.PlatformDecoder;
import com.facebook.imagepipeline.platform.PlatformDecoderFactory;
import com.facebook.imagepipeline.producers.ExperimentalThreadHandoffProducerQueueImpl;
import com.facebook.imagepipeline.producers.ThreadHandoffProducerQueue;
import com.facebook.imagepipeline.producers.ThreadHandoffProducerQueueImpl;
import com.facebook.imagepipeline.systrace.FrescoSystrace;
import com.facebook.imagepipeline.transcoder.ImageTranscoderFactory;
import com.facebook.imagepipeline.transcoder.MultiImageTranscoderFactory;
import com.facebook.imagepipeline.transcoder.SimpleImageTranscoderFactory;
import javax.annotation.Nullable;
import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ImagePipelineFactory {
    private static final Class<?> TAG = ImagePipelineFactory.class;
    private static boolean sForceSinglePipelineInstance;
    private static ImagePipeline sImagePipeline;
    private static ImagePipelineFactory sInstance;
    @Nullable
    private AnimatedFactory mAnimatedFactory;
    private CountingMemoryCache<CacheKey, CloseableImage> mBitmapCountingMemoryCache;
    @Nullable
    private InstrumentedMemoryCache<CacheKey, CloseableImage> mBitmapMemoryCache;
    private final CloseableReferenceFactory mCloseableReferenceFactory;
    private final ImagePipelineConfigInterface mConfig;
    private CountingMemoryCache<CacheKey, PooledByteBuffer> mEncodedCountingMemoryCache;
    @Nullable
    private InstrumentedMemoryCache<CacheKey, PooledByteBuffer> mEncodedMemoryCache;
    @Nullable
    private ImageDecoder mImageDecoder;
    @Nullable
    private ImagePipeline mImagePipeline;
    @Nullable
    private ImageTranscoderFactory mImageTranscoderFactory;
    @Nullable
    private BufferedDiskCache mMainBufferedDiskCache;
    @Nullable
    private FileCache mMainFileCache;
    @Nullable
    private PlatformBitmapFactory mPlatformBitmapFactory;
    @Nullable
    private PlatformDecoder mPlatformDecoder;
    @Nullable
    private ProducerFactory mProducerFactory;
    @Nullable
    private ProducerSequenceFactory mProducerSequenceFactory;
    @Nullable
    private BufferedDiskCache mSmallImageBufferedDiskCache;
    @Nullable
    private FileCache mSmallImageFileCache;
    private final ThreadHandoffProducerQueue mThreadHandoffProducerQueue;

    public ImagePipelineFactory(ImagePipelineConfigInterface config) {
        ThreadHandoffProducerQueue threadHandoffProducerQueueImpl;
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.beginSection("ImagePipelineConfig()");
        }
        ImagePipelineConfigInterface imagePipelineConfigInterface = (ImagePipelineConfigInterface) Preconditions.checkNotNull(config);
        this.mConfig = imagePipelineConfigInterface;
        if (imagePipelineConfigInterface.getExperiments().isExperimentalThreadHandoffQueueEnabled()) {
            threadHandoffProducerQueueImpl = new ExperimentalThreadHandoffProducerQueueImpl(config.getExecutorSupplier().forLightweightBackgroundTasks());
        } else {
            threadHandoffProducerQueueImpl = new ThreadHandoffProducerQueueImpl(config.getExecutorSupplier().forLightweightBackgroundTasks());
        }
        this.mThreadHandoffProducerQueue = threadHandoffProducerQueueImpl;
        CloseableReference.setDisableCloseableReferencesForBitmaps(config.getExperiments().getBitmapCloseableRefType());
        this.mCloseableReferenceFactory = new CloseableReferenceFactory(config.getCloseableReferenceLeakTracker());
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.endSection();
        }
    }

    private ImagePipeline createImagePipeline() {
        return new ImagePipeline(getProducerSequenceFactory(), this.mConfig.getRequestListeners(), this.mConfig.getRequestListener2s(), this.mConfig.getIsPrefetchEnabledSupplier(), getBitmapMemoryCache(), getEncodedMemoryCache(), getMainBufferedDiskCache(), getSmallImageBufferedDiskCache(), this.mConfig.getCacheKeyFactory(), this.mThreadHandoffProducerQueue, this.mConfig.getExperiments().getSuppressBitmapPrefetchingSupplier(), this.mConfig.getExperiments().isLazyDataSource(), this.mConfig.getCallerContextVerifier(), this.mConfig);
    }

    @Nullable
    private AnimatedFactory getAnimatedFactory() {
        if (this.mAnimatedFactory == null) {
            this.mAnimatedFactory = AnimatedFactoryProvider.getAnimatedFactory(getPlatformBitmapFactory(), this.mConfig.getExecutorSupplier(), getBitmapCountingMemoryCache(), this.mConfig.getExperiments().shouldDownscaleFrameToDrawableDimensions(), this.mConfig.getExecutorServiceForAnimatedImages());
        }
        return this.mAnimatedFactory;
    }

    private ImageDecoder getImageDecoder() {
        ImageDecoder imageDecoder;
        if (this.mImageDecoder == null) {
            if (this.mConfig.getImageDecoder() != null) {
                this.mImageDecoder = this.mConfig.getImageDecoder();
            } else {
                AnimatedFactory animatedFactory = getAnimatedFactory();
                ImageDecoder imageDecoder2 = null;
                if (animatedFactory != null) {
                    imageDecoder2 = animatedFactory.getGifDecoder();
                    imageDecoder = animatedFactory.getWebPDecoder();
                } else {
                    imageDecoder = null;
                }
                if (this.mConfig.getImageDecoderConfig() == null) {
                    this.mImageDecoder = new DefaultImageDecoder(imageDecoder2, imageDecoder, getPlatformDecoder());
                } else {
                    this.mImageDecoder = new DefaultImageDecoder(imageDecoder2, imageDecoder, getPlatformDecoder(), this.mConfig.getImageDecoderConfig().getCustomImageDecoders());
                    ImageFormatChecker.getInstance().setCustomImageFormatCheckers(this.mConfig.getImageDecoderConfig().getCustomImageFormats());
                }
            }
        }
        return this.mImageDecoder;
    }

    private ImageTranscoderFactory getImageTranscoderFactory() {
        if (this.mImageTranscoderFactory == null) {
            if (this.mConfig.getImageTranscoderFactory() == null && this.mConfig.getImageTranscoderType() == null && this.mConfig.getExperiments().isNativeCodeDisabled()) {
                this.mImageTranscoderFactory = new SimpleImageTranscoderFactory(this.mConfig.getExperiments().getMaxBitmapSize());
            } else {
                this.mImageTranscoderFactory = new MultiImageTranscoderFactory(this.mConfig.getExperiments().getMaxBitmapSize(), this.mConfig.getExperiments().getUseDownsamplingRatioForResizing(), this.mConfig.getImageTranscoderFactory(), this.mConfig.getImageTranscoderType(), this.mConfig.getExperiments().isEnsureTranscoderLibraryLoaded());
            }
        }
        return this.mImageTranscoderFactory;
    }

    public static ImagePipelineFactory getInstance() {
        return (ImagePipelineFactory) Preconditions.checkNotNull(sInstance, "ImagePipelineFactory was not initialized!");
    }

    private ProducerFactory getProducerFactory() {
        if (this.mProducerFactory == null) {
            this.mProducerFactory = this.mConfig.getExperiments().getProducerFactoryMethod().createProducerFactory(this.mConfig.getContext(), this.mConfig.getPoolFactory().getSmallByteArrayPool(), getImageDecoder(), this.mConfig.getProgressiveJpegConfig(), this.mConfig.isDownsampleEnabled(), this.mConfig.isResizeAndRotateEnabledForNetwork(), this.mConfig.getExperiments().isDecodeCancellationEnabled(), this.mConfig.getExecutorSupplier(), this.mConfig.getPoolFactory().getPooledByteBufferFactory(this.mConfig.getMemoryChunkType()), this.mConfig.getPoolFactory().getPooledByteStreams(), getBitmapMemoryCache(), getEncodedMemoryCache(), getMainBufferedDiskCache(), getSmallImageBufferedDiskCache(), this.mConfig.getCacheKeyFactory(), getPlatformBitmapFactory(), this.mConfig.getExperiments().getBitmapPrepareToDrawMinSizeBytes(), this.mConfig.getExperiments().getBitmapPrepareToDrawMaxSizeBytes(), this.mConfig.getExperiments().getBitmapPrepareToDrawForPrefetch(), this.mConfig.getExperiments().getMaxBitmapSize(), getCloseableReferenceFactory(), this.mConfig.getExperiments().shouldKeepCancelledFetchAsLowPriority(), this.mConfig.getExperiments().getTrackedKeysSize());
        }
        return this.mProducerFactory;
    }

    private ProducerSequenceFactory getProducerSequenceFactory() {
        boolean z = Build.VERSION.SDK_INT >= 24 && this.mConfig.getExperiments().getUseBitmapPrepareToDraw();
        if (this.mProducerSequenceFactory == null) {
            this.mProducerSequenceFactory = new ProducerSequenceFactory(this.mConfig.getContext().getApplicationContext().getContentResolver(), getProducerFactory(), this.mConfig.getNetworkFetcher(), this.mConfig.isResizeAndRotateEnabledForNetwork(), this.mConfig.getExperiments().isWebpSupportEnabled(), this.mThreadHandoffProducerQueue, this.mConfig.isDownsampleEnabled(), z, this.mConfig.getExperiments().isPartialImageCachingEnabled(), this.mConfig.isDiskCacheEnabled(), getImageTranscoderFactory(), this.mConfig.getExperiments().isEncodedMemoryCacheProbingEnabled(), this.mConfig.getExperiments().isDiskCacheProbingEnabled(), this.mConfig.getExperiments().allowDelay());
        }
        return this.mProducerSequenceFactory;
    }

    private BufferedDiskCache getSmallImageBufferedDiskCache() {
        if (this.mSmallImageBufferedDiskCache == null) {
            this.mSmallImageBufferedDiskCache = new BufferedDiskCache(getSmallImageFileCache(), this.mConfig.getPoolFactory().getPooledByteBufferFactory(this.mConfig.getMemoryChunkType()), this.mConfig.getPoolFactory().getPooledByteStreams(), this.mConfig.getExecutorSupplier().forLocalStorageRead(), this.mConfig.getExecutorSupplier().forLocalStorageWrite(), this.mConfig.getImageCacheStatsTracker());
        }
        return this.mSmallImageBufferedDiskCache;
    }

    public static synchronized boolean hasBeenInitialized() {
        boolean z;
        synchronized (ImagePipelineFactory.class) {
            z = sInstance != null;
        }
        return z;
    }

    public static synchronized void initialize(Context context) {
        synchronized (ImagePipelineFactory.class) {
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.beginSection("ImagePipelineFactory#initialize");
            }
            initialize(ImagePipelineConfig.newBuilder(context).build());
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.endSection();
            }
        }
    }

    public static void setInstance(ImagePipelineFactory newInstance) {
        sInstance = newInstance;
    }

    public static synchronized void shutDown() {
        synchronized (ImagePipelineFactory.class) {
            ImagePipelineFactory imagePipelineFactory = sInstance;
            if (imagePipelineFactory != null) {
                imagePipelineFactory.getBitmapMemoryCache().removeAll(AndroidPredicates.True());
                sInstance.getEncodedMemoryCache().removeAll(AndroidPredicates.True());
                sInstance = null;
            }
        }
    }

    @Nullable
    public DrawableFactory getAnimatedDrawableFactory(@Nullable Context context) {
        AnimatedFactory animatedFactory = getAnimatedFactory();
        if (animatedFactory == null) {
            return null;
        }
        return animatedFactory.getAnimatedDrawableFactory(context);
    }

    public CountingMemoryCache<CacheKey, CloseableImage> getBitmapCountingMemoryCache() {
        if (this.mBitmapCountingMemoryCache == null) {
            this.mBitmapCountingMemoryCache = this.mConfig.getBitmapMemoryCacheFactory().create(this.mConfig.getBitmapMemoryCacheParamsSupplier(), this.mConfig.getMemoryTrimmableRegistry(), this.mConfig.getBitmapMemoryCacheTrimStrategy(), this.mConfig.getExperiments().shouldStoreCacheEntrySize(), this.mConfig.getExperiments().shouldIgnoreCacheSizeMismatch(), this.mConfig.getBitmapMemoryCacheEntryStateObserver());
        }
        return this.mBitmapCountingMemoryCache;
    }

    public InstrumentedMemoryCache<CacheKey, CloseableImage> getBitmapMemoryCache() {
        if (this.mBitmapMemoryCache == null) {
            this.mBitmapMemoryCache = InstrumentedMemoryCacheBitmapMemoryCacheFactory.get(getBitmapCountingMemoryCache(), this.mConfig.getImageCacheStatsTracker());
        }
        return this.mBitmapMemoryCache;
    }

    public CloseableReferenceFactory getCloseableReferenceFactory() {
        return this.mCloseableReferenceFactory;
    }

    public CountingMemoryCache<CacheKey, PooledByteBuffer> getEncodedCountingMemoryCache() {
        if (this.mEncodedCountingMemoryCache == null) {
            this.mEncodedCountingMemoryCache = EncodedCountingMemoryCacheFactory.get(this.mConfig.getEncodedMemoryCacheParamsSupplier(), this.mConfig.getMemoryTrimmableRegistry());
        }
        return this.mEncodedCountingMemoryCache;
    }

    public InstrumentedMemoryCache<CacheKey, PooledByteBuffer> getEncodedMemoryCache() {
        MemoryCache<CacheKey, PooledByteBuffer> encodedCountingMemoryCache;
        if (this.mEncodedMemoryCache == null) {
            if (this.mConfig.getEncodedMemoryCacheOverride() != null) {
                encodedCountingMemoryCache = this.mConfig.getEncodedMemoryCacheOverride();
            } else {
                encodedCountingMemoryCache = getEncodedCountingMemoryCache();
            }
            this.mEncodedMemoryCache = EncodedMemoryCacheFactory.get(encodedCountingMemoryCache, this.mConfig.getImageCacheStatsTracker());
        }
        return this.mEncodedMemoryCache;
    }

    public ImagePipeline getImagePipeline() {
        if (sForceSinglePipelineInstance) {
            if (sImagePipeline == null) {
                ImagePipeline createImagePipeline = createImagePipeline();
                sImagePipeline = createImagePipeline;
                this.mImagePipeline = createImagePipeline;
            }
            return sImagePipeline;
        }
        if (this.mImagePipeline == null) {
            this.mImagePipeline = createImagePipeline();
        }
        return this.mImagePipeline;
    }

    public BufferedDiskCache getMainBufferedDiskCache() {
        if (this.mMainBufferedDiskCache == null) {
            this.mMainBufferedDiskCache = new BufferedDiskCache(getMainFileCache(), this.mConfig.getPoolFactory().getPooledByteBufferFactory(this.mConfig.getMemoryChunkType()), this.mConfig.getPoolFactory().getPooledByteStreams(), this.mConfig.getExecutorSupplier().forLocalStorageRead(), this.mConfig.getExecutorSupplier().forLocalStorageWrite(), this.mConfig.getImageCacheStatsTracker());
        }
        return this.mMainBufferedDiskCache;
    }

    public FileCache getMainFileCache() {
        if (this.mMainFileCache == null) {
            this.mMainFileCache = this.mConfig.getFileCacheFactory().get(this.mConfig.getMainDiskCacheConfig());
        }
        return this.mMainFileCache;
    }

    public PlatformBitmapFactory getPlatformBitmapFactory() {
        if (this.mPlatformBitmapFactory == null) {
            this.mPlatformBitmapFactory = PlatformBitmapFactoryProvider.buildPlatformBitmapFactory(this.mConfig.getPoolFactory(), getPlatformDecoder(), getCloseableReferenceFactory());
        }
        return this.mPlatformBitmapFactory;
    }

    public PlatformDecoder getPlatformDecoder() {
        if (this.mPlatformDecoder == null) {
            this.mPlatformDecoder = PlatformDecoderFactory.buildPlatformDecoder(this.mConfig.getPoolFactory(), this.mConfig.getExperiments().isGingerbreadDecoderEnabled());
        }
        return this.mPlatformDecoder;
    }

    public FileCache getSmallImageFileCache() {
        if (this.mSmallImageFileCache == null) {
            this.mSmallImageFileCache = this.mConfig.getFileCacheFactory().get(this.mConfig.getSmallImageDiskCacheConfig());
        }
        return this.mSmallImageFileCache;
    }

    @Nullable
    public String reportData() {
        return Objects.toStringHelper("ImagePipelineFactory").add("bitmapCountingMemoryCache", this.mBitmapCountingMemoryCache.getDebugData()).add("encodedCountingMemoryCache", this.mEncodedCountingMemoryCache.getDebugData()).toString();
    }

    public static synchronized void initialize(ImagePipelineConfigInterface imagePipelineConfig, boolean forceSinglePipelineInstance) {
        synchronized (ImagePipelineFactory.class) {
            if (sInstance != null) {
                FLog.w(TAG, "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior.");
            }
            sForceSinglePipelineInstance = forceSinglePipelineInstance;
            sInstance = new ImagePipelineFactory(imagePipelineConfig);
        }
    }

    public static synchronized void initialize(ImagePipelineConfigInterface imagePipelineConfig) {
        synchronized (ImagePipelineFactory.class) {
            if (sInstance != null) {
                FLog.w(TAG, "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior.");
            }
            sInstance = new ImagePipelineFactory(imagePipelineConfig);
        }
    }
}
