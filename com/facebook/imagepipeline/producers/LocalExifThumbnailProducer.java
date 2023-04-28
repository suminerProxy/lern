package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build;
import android.util.Pair;
import androidx.annotation.VisibleForTesting;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.logging.FLog;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.common.memory.PooledByteBufferInputStream;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.util.UriUtil;
import com.facebook.imageformat.DefaultImageFormats;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imageutils.BitmapUtil;
import com.facebook.imageutils.JfifUtil;
import com.facebook.infer.annotation.Nullsafe;
import com.facebook.soloader.DoNotOptimize;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class LocalExifThumbnailProducer implements ThumbnailProducer<EncodedImage> {
    private static final int COMMON_EXIF_THUMBNAIL_MAX_DIMENSION = 512;
    @VisibleForTesting
    public static final String CREATED_THUMBNAIL = "createdThumbnail";
    public static final String PRODUCER_NAME = "LocalExifThumbnailProducer";
    private final ContentResolver mContentResolver;
    private final Executor mExecutor;
    private final PooledByteBufferFactory mPooledByteBufferFactory;

    @DoNotOptimize
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class Api24Utils {
        public final /* synthetic */ LocalExifThumbnailProducer this$0;

        private Api24Utils(final LocalExifThumbnailProducer this$0) {
        }

        @Nullable
        public ExifInterface getExifInterface(FileDescriptor fileDescriptor) throws IOException {
        }

        public /* synthetic */ Api24Utils(LocalExifThumbnailProducer localExifThumbnailProducer, AnonymousClass1 anonymousClass1) {
        }
    }

    public LocalExifThumbnailProducer(Executor executor, PooledByteBufferFactory pooledByteBufferFactory, ContentResolver contentResolver) {
        this.mExecutor = executor;
        this.mPooledByteBufferFactory = pooledByteBufferFactory;
        this.mContentResolver = contentResolver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public EncodedImage buildEncodedImage(PooledByteBuffer imageBytes, ExifInterface exifInterface) {
        Pair<Integer, Integer> decodeDimensions = BitmapUtil.decodeDimensions(new PooledByteBufferInputStream(imageBytes));
        int rotationAngle = getRotationAngle(exifInterface);
        int intValue = decodeDimensions != null ? ((Integer) decodeDimensions.first).intValue() : -1;
        int intValue2 = decodeDimensions != null ? ((Integer) decodeDimensions.second).intValue() : -1;
        CloseableReference of = CloseableReference.of(imageBytes);
        try {
            EncodedImage encodedImage = new EncodedImage(of);
            CloseableReference.closeSafely(of);
            encodedImage.setImageFormat(DefaultImageFormats.JPEG);
            encodedImage.setRotationAngle(rotationAngle);
            encodedImage.setWidth(intValue);
            encodedImage.setHeight(intValue2);
            return encodedImage;
        } catch (Throwable th) {
            CloseableReference.closeSafely(of);
            throw th;
        }
    }

    private int getRotationAngle(final ExifInterface exifInterface) {
        return JfifUtil.getAutoRotateAngleFromOrientation(Integer.parseInt((String) Preconditions.checkNotNull(exifInterface.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION))));
    }

    @Override // com.facebook.imagepipeline.producers.ThumbnailProducer
    public boolean canProvideImageForSize(@Nullable ResizeOptions resizeOptions) {
        return ThumbnailSizeChecker.isImageBigEnough(512, 512, resizeOptions);
    }

    @VisibleForTesting
    public boolean canReadAsFile(String realPath) throws IOException {
        if (realPath == null) {
            return false;
        }
        File file = new File(realPath);
        return file.exists() && file.canRead();
    }

    @Nullable
    @VisibleForTesting
    public ExifInterface getExifInterface(Uri uri) {
        String realPathFromUri = UriUtil.getRealPathFromUri(this.mContentResolver, uri);
        if (realPathFromUri == null) {
            return null;
        }
        try {
        } catch (IOException unused) {
        } catch (StackOverflowError unused2) {
            FLog.e(LocalExifThumbnailProducer.class, "StackOverflowError in ExifInterface constructor");
        }
        if (canReadAsFile(realPathFromUri)) {
            return new ExifInterface(realPathFromUri);
        }
        AssetFileDescriptor assetFileDescriptor = UriUtil.getAssetFileDescriptor(this.mContentResolver, uri);
        if (assetFileDescriptor != null && Build.VERSION.SDK_INT >= 24) {
            ExifInterface exifInterface = new Api24Utils(this, null).getExifInterface(assetFileDescriptor.getFileDescriptor());
            assetFileDescriptor.close();
            return exifInterface;
        }
        return null;
    }

    @Override // com.facebook.imagepipeline.producers.Producer
    public void produceResults(final Consumer<EncodedImage> consumer, final ProducerContext producerContext) {
        ProducerListener2 producerListener = producerContext.getProducerListener();
        ImageRequest imageRequest = producerContext.getImageRequest();
        producerContext.putOriginExtra("local", "exif");
        StatefulProducerRunnable<EncodedImage> statefulProducerRunnable = new StatefulProducerRunnable<EncodedImage>(this, consumer, producerListener, producerContext, PRODUCER_NAME, imageRequest) { // from class: com.facebook.imagepipeline.producers.LocalExifThumbnailProducer.1
            public final /* synthetic */ LocalExifThumbnailProducer this$0;
            public final /* synthetic */ ImageRequest val$imageRequest;

            @Override // com.facebook.imagepipeline.producers.StatefulProducerRunnable, com.facebook.common.executors.StatefulRunnable
            public /* bridge */ /* synthetic */ void disposeResult(@Nullable Object result) {
            }

            @Override // com.facebook.imagepipeline.producers.StatefulProducerRunnable
            public /* bridge */ /* synthetic */ Map getExtraMapOnSuccess(@Nullable final EncodedImage result) {
            }

            @Override // com.facebook.common.executors.StatefulRunnable
            @Nullable
            public /* bridge */ /* synthetic */ Object getResult() throws Exception {
            }

            public void disposeResult(@Nullable EncodedImage result) {
            }

            /* renamed from: getExtraMapOnSuccess  reason: avoid collision after fix types in other method */
            public Map<String, String> getExtraMapOnSuccess2(@Nullable final EncodedImage result) {
            }

            @Override // com.facebook.common.executors.StatefulRunnable
            @Nullable
            public EncodedImage getResult() throws Exception {
            }
        };
        producerContext.addCallbacks(new BaseProducerContextCallbacks(this, statefulProducerRunnable) { // from class: com.facebook.imagepipeline.producers.LocalExifThumbnailProducer.2
            public final /* synthetic */ LocalExifThumbnailProducer this$0;
            public final /* synthetic */ StatefulProducerRunnable val$cancellableProducerRunnable;

            @Override // com.facebook.imagepipeline.producers.BaseProducerContextCallbacks, com.facebook.imagepipeline.producers.ProducerContextCallbacks
            public void onCancellationRequested() {
            }
        });
        this.mExecutor.execute(statefulProducerRunnable);
    }
}
