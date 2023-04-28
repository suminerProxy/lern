package com.facebook.imagepipeline.producers;

import androidx.annotation.VisibleForTesting;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.common.util.TriState;
import com.facebook.imageformat.ImageFormat;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.producers.JobScheduler;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.transcoder.ImageTranscodeResult;
import com.facebook.imagepipeline.transcoder.ImageTranscoder;
import com.facebook.imagepipeline.transcoder.ImageTranscoderFactory;
import com.facebook.imagepipeline.transcoder.JpegTranscoderUtils;
import com.facebook.infer.annotation.Nullsafe;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class ResizeAndRotateProducer implements Producer<EncodedImage> {
    private static final String INPUT_IMAGE_FORMAT = "Image format";
    @VisibleForTesting
    public static final int MIN_TRANSFORM_INTERVAL_MS = 100;
    private static final String ORIGINAL_SIZE_KEY = "Original size";
    private static final String PRODUCER_NAME = "ResizeAndRotateProducer";
    private static final String REQUESTED_SIZE_KEY = "Requested size";
    private static final String TRANSCODER_ID = "Transcoder id";
    private static final String TRANSCODING_RESULT = "Transcoding result";
    private final Executor mExecutor;
    private final ImageTranscoderFactory mImageTranscoderFactory;
    private final Producer<EncodedImage> mInputProducer;
    private final boolean mIsResizingEnabled;
    private final PooledByteBufferFactory mPooledByteBufferFactory;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class TransformingConsumer extends DelegatingConsumer<EncodedImage, EncodedImage> {
        private final ImageTranscoderFactory mImageTranscoderFactory;
        private boolean mIsCancelled;
        private final boolean mIsResizingEnabled;
        private final JobScheduler mJobScheduler;
        private final ProducerContext mProducerContext;
        public final /* synthetic */ ResizeAndRotateProducer this$0;

        /* renamed from: com.facebook.imagepipeline.producers.ResizeAndRotateProducer$TransformingConsumer$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 implements JobScheduler.JobRunnable {
            public final /* synthetic */ TransformingConsumer this$1;
            public final /* synthetic */ ResizeAndRotateProducer val$this$0;

            public AnonymousClass1(final TransformingConsumer this$1, final ResizeAndRotateProducer val$this$0) {
            }

            @Override // com.facebook.imagepipeline.producers.JobScheduler.JobRunnable
            public void run(EncodedImage encodedImage, int status) {
            }
        }

        /* renamed from: com.facebook.imagepipeline.producers.ResizeAndRotateProducer$TransformingConsumer$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass2 extends BaseProducerContextCallbacks {
            public final /* synthetic */ TransformingConsumer this$1;
            public final /* synthetic */ Consumer val$consumer;
            public final /* synthetic */ ResizeAndRotateProducer val$this$0;

            public AnonymousClass2(final TransformingConsumer this$1, final ResizeAndRotateProducer val$consumer, final Consumer val$this$0) {
            }

            @Override // com.facebook.imagepipeline.producers.BaseProducerContextCallbacks, com.facebook.imagepipeline.producers.ProducerContextCallbacks
            public void onCancellationRequested() {
            }

            @Override // com.facebook.imagepipeline.producers.BaseProducerContextCallbacks, com.facebook.imagepipeline.producers.ProducerContextCallbacks
            public void onIsIntermediateResultExpectedChanged() {
            }
        }

        public TransformingConsumer(final ResizeAndRotateProducer this$0, final Consumer<EncodedImage> consumer, final ProducerContext producerContext, final boolean isResizingEnabled, final ImageTranscoderFactory imageTranscoderFactory) {
        }

        public static /* synthetic */ boolean access$000(TransformingConsumer transformingConsumer) {
        }

        public static /* synthetic */ ImageTranscoderFactory access$100(TransformingConsumer transformingConsumer) {
        }

        public static /* synthetic */ void access$200(TransformingConsumer transformingConsumer, EncodedImage encodedImage, int i2, ImageTranscoder imageTranscoder) {
        }

        public static /* synthetic */ ProducerContext access$400(TransformingConsumer transformingConsumer) {
        }

        public static /* synthetic */ JobScheduler access$500(TransformingConsumer transformingConsumer) {
        }

        public static /* synthetic */ boolean access$602(TransformingConsumer transformingConsumer, boolean z) {
        }

        private void doTransform(EncodedImage encodedImage, int status, ImageTranscoder imageTranscoder) {
        }

        private void forwardNewResult(EncodedImage newResult, int status, ImageFormat imageFormat) {
        }

        @Nullable
        private EncodedImage getCloneWithRotationApplied(EncodedImage encodedImage, int angle) {
        }

        @Nullable
        private Map<String, String> getExtraMap(EncodedImage encodedImage, @Nullable ResizeOptions resizeOptions, @Nullable ImageTranscodeResult transcodeResult, @Nullable String transcoderId) {
        }

        @Nullable
        private EncodedImage getNewResultForImagesWithoutExifData(EncodedImage encodedImage) {
        }

        @Nullable
        private EncodedImage getNewResultsForJpegOrHeif(EncodedImage encodedImage) {
        }

        @Override // com.facebook.imagepipeline.producers.BaseConsumer
        public /* bridge */ /* synthetic */ void onNewResultImpl(@Nullable Object newResult, int status) {
        }

        public void onNewResultImpl(@Nullable EncodedImage newResult, int status) {
        }
    }

    public ResizeAndRotateProducer(final Executor executor, final PooledByteBufferFactory pooledByteBufferFactory, final Producer<EncodedImage> inputProducer, final boolean isResizingEnabled, final ImageTranscoderFactory imageTranscoderFactory) {
        this.mExecutor = (Executor) Preconditions.checkNotNull(executor);
        this.mPooledByteBufferFactory = (PooledByteBufferFactory) Preconditions.checkNotNull(pooledByteBufferFactory);
        this.mInputProducer = (Producer) Preconditions.checkNotNull(inputProducer);
        this.mImageTranscoderFactory = (ImageTranscoderFactory) Preconditions.checkNotNull(imageTranscoderFactory);
        this.mIsResizingEnabled = isResizingEnabled;
    }

    private static boolean shouldRotate(RotationOptions rotationOptions, EncodedImage encodedImage) {
        return !rotationOptions.canDeferUntilRendered() && (JpegTranscoderUtils.getRotationAngle(rotationOptions, encodedImage) != 0 || shouldRotateUsingExifOrientation(rotationOptions, encodedImage));
    }

    private static boolean shouldRotateUsingExifOrientation(RotationOptions rotationOptions, EncodedImage encodedImage) {
        if (rotationOptions.rotationEnabled() && !rotationOptions.canDeferUntilRendered()) {
            return JpegTranscoderUtils.INVERTED_EXIF_ORIENTATIONS.contains(Integer.valueOf(encodedImage.getExifOrientation()));
        }
        encodedImage.setExifOrientation(0);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static TriState shouldTransform(ImageRequest request, EncodedImage encodedImage, ImageTranscoder imageTranscoder) {
        if (encodedImage != null && encodedImage.getImageFormat() != ImageFormat.UNKNOWN) {
            if (!imageTranscoder.canTranscode(encodedImage.getImageFormat())) {
                return TriState.NO;
            }
            return TriState.valueOf(shouldRotate(request.getRotationOptions(), encodedImage) || imageTranscoder.canResize(encodedImage, request.getRotationOptions(), request.getResizeOptions()));
        }
        return TriState.UNSET;
    }

    @Override // com.facebook.imagepipeline.producers.Producer
    public void produceResults(final Consumer<EncodedImage> consumer, final ProducerContext context) {
        this.mInputProducer.produceResults(new TransformingConsumer(this, consumer, context, this.mIsResizingEnabled, this.mImageTranscoderFactory), context);
    }
}
