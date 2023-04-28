package com.facebook.imagepipeline.producers;

import com.facebook.common.internal.Preconditions;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.common.memory.PooledByteBufferOutputStream;
import com.facebook.common.util.TriState;
import com.facebook.imageformat.DefaultImageFormats;
import com.facebook.imageformat.ImageFormat;
import com.facebook.imageformat.ImageFormatChecker;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.nativecode.WebpTranscoder;
import com.facebook.imagepipeline.nativecode.WebpTranscoderFactory;
import com.facebook.infer.annotation.Nullsafe;
import java.io.InputStream;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class WebpTranscodeProducer implements Producer<EncodedImage> {
    private static final int DEFAULT_JPEG_QUALITY = 80;
    public static final String PRODUCER_NAME = "WebpTranscodeProducer";
    private final Executor mExecutor;
    private final Producer<EncodedImage> mInputProducer;
    private final PooledByteBufferFactory mPooledByteBufferFactory;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class WebpTranscodeConsumer extends DelegatingConsumer<EncodedImage, EncodedImage> {
        private final ProducerContext mContext;
        private TriState mShouldTranscodeWhenFinished;
        public final /* synthetic */ WebpTranscodeProducer this$0;

        public WebpTranscodeConsumer(final WebpTranscodeProducer this$0, final Consumer<EncodedImage> consumer, final ProducerContext context) {
        }

        @Override // com.facebook.imagepipeline.producers.BaseConsumer
        public /* bridge */ /* synthetic */ void onNewResultImpl(@Nullable Object newResult, int status) {
        }

        public void onNewResultImpl(@Nullable EncodedImage newResult, int status) {
        }
    }

    public WebpTranscodeProducer(Executor executor, PooledByteBufferFactory pooledByteBufferFactory, Producer<EncodedImage> inputProducer) {
        this.mExecutor = (Executor) Preconditions.checkNotNull(executor);
        this.mPooledByteBufferFactory = (PooledByteBufferFactory) Preconditions.checkNotNull(pooledByteBufferFactory);
        this.mInputProducer = (Producer) Preconditions.checkNotNull(inputProducer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void doTranscode(final EncodedImage encodedImage, final PooledByteBufferOutputStream outputStream) throws Exception {
        InputStream inputStream = (InputStream) Preconditions.checkNotNull(encodedImage.getInputStream());
        ImageFormat imageFormat_WrapIOException = ImageFormatChecker.getImageFormat_WrapIOException(inputStream);
        if (imageFormat_WrapIOException != DefaultImageFormats.WEBP_SIMPLE && imageFormat_WrapIOException != DefaultImageFormats.WEBP_EXTENDED) {
            if (imageFormat_WrapIOException != DefaultImageFormats.WEBP_LOSSLESS && imageFormat_WrapIOException != DefaultImageFormats.WEBP_EXTENDED_WITH_ALPHA) {
                throw new IllegalArgumentException("Wrong image format");
            }
            WebpTranscoderFactory.getWebpTranscoder().transcodeWebpToPng(inputStream, outputStream);
            encodedImage.setImageFormat(DefaultImageFormats.PNG);
            return;
        }
        WebpTranscoderFactory.getWebpTranscoder().transcodeWebpToJpeg(inputStream, outputStream, 80);
        encodedImage.setImageFormat(DefaultImageFormats.JPEG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static TriState shouldTranscode(final EncodedImage encodedImage) {
        Preconditions.checkNotNull(encodedImage);
        ImageFormat imageFormat_WrapIOException = ImageFormatChecker.getImageFormat_WrapIOException((InputStream) Preconditions.checkNotNull(encodedImage.getInputStream()));
        if (DefaultImageFormats.isStaticWebpFormat(imageFormat_WrapIOException)) {
            WebpTranscoder webpTranscoder = WebpTranscoderFactory.getWebpTranscoder();
            if (webpTranscoder == null) {
                return TriState.NO;
            }
            return TriState.valueOf(!webpTranscoder.isWebpNativelySupported(imageFormat_WrapIOException));
        } else if (imageFormat_WrapIOException == ImageFormat.UNKNOWN) {
            return TriState.UNSET;
        } else {
            return TriState.NO;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void transcodeLastResult(final EncodedImage originalResult, final Consumer<EncodedImage> consumer, final ProducerContext producerContext) {
        Preconditions.checkNotNull(originalResult);
        this.mExecutor.execute(new StatefulProducerRunnable<EncodedImage>(this, consumer, producerContext.getProducerListener(), producerContext, PRODUCER_NAME, EncodedImage.cloneOrNull(originalResult)) { // from class: com.facebook.imagepipeline.producers.WebpTranscodeProducer.1
            public final /* synthetic */ WebpTranscodeProducer this$0;
            public final /* synthetic */ EncodedImage val$encodedImageCopy;

            @Override // com.facebook.imagepipeline.producers.StatefulProducerRunnable, com.facebook.common.executors.StatefulRunnable
            public /* bridge */ /* synthetic */ void disposeResult(Object result) {
            }

            @Override // com.facebook.common.executors.StatefulRunnable
            public /* bridge */ /* synthetic */ Object getResult() throws Exception {
            }

            @Override // com.facebook.imagepipeline.producers.StatefulProducerRunnable, com.facebook.common.executors.StatefulRunnable
            public void onCancellation() {
            }

            @Override // com.facebook.imagepipeline.producers.StatefulProducerRunnable, com.facebook.common.executors.StatefulRunnable
            public void onFailure(Exception e2) {
            }

            @Override // com.facebook.imagepipeline.producers.StatefulProducerRunnable, com.facebook.common.executors.StatefulRunnable
            public /* bridge */ /* synthetic */ void onSuccess(Object result) {
            }

            public void disposeResult(EncodedImage result) {
            }

            @Override // com.facebook.common.executors.StatefulRunnable
            public EncodedImage getResult() throws Exception {
            }

            public void onSuccess(EncodedImage result) {
            }
        });
    }

    @Override // com.facebook.imagepipeline.producers.Producer
    public void produceResults(final Consumer<EncodedImage> consumer, final ProducerContext context) {
        this.mInputProducer.produceResults(new WebpTranscodeConsumer(this, consumer, context), context);
    }
}
