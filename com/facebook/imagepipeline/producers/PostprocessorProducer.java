package com.facebook.imagepipeline.producers;

import androidx.annotation.VisibleForTesting;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.request.Postprocessor;
import com.facebook.imagepipeline.request.RepeatedPostprocessor;
import com.facebook.imagepipeline.request.RepeatedPostprocessorRunner;
import com.facebook.infer.annotation.Nullsafe;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class PostprocessorProducer implements Producer<CloseableReference<CloseableImage>> {
    public static final String NAME = "PostprocessorProducer";
    @VisibleForTesting
    public static final String POSTPROCESSOR = "Postprocessor";
    private final PlatformBitmapFactory mBitmapFactory;
    private final Executor mExecutor;
    private final Producer<CloseableReference<CloseableImage>> mInputProducer;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class PostprocessorConsumer extends DelegatingConsumer<CloseableReference<CloseableImage>, CloseableReference<CloseableImage>> {
        @GuardedBy("PostprocessorConsumer.this")
        private boolean mIsClosed;
        @GuardedBy("PostprocessorConsumer.this")
        private boolean mIsDirty;
        @GuardedBy("PostprocessorConsumer.this")
        private boolean mIsPostProcessingRunning;
        private final ProducerListener2 mListener;
        private final Postprocessor mPostprocessor;
        private final ProducerContext mProducerContext;
        @GuardedBy("PostprocessorConsumer.this")
        @Nullable
        private CloseableReference<CloseableImage> mSourceImageRef;
        @GuardedBy("PostprocessorConsumer.this")
        private int mStatus;
        public final /* synthetic */ PostprocessorProducer this$0;

        /* renamed from: com.facebook.imagepipeline.producers.PostprocessorProducer$PostprocessorConsumer$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 extends BaseProducerContextCallbacks {
            public final /* synthetic */ PostprocessorConsumer this$1;
            public final /* synthetic */ PostprocessorProducer val$this$0;

            public AnonymousClass1(final PostprocessorConsumer this$1, final PostprocessorProducer val$this$0) {
            }

            @Override // com.facebook.imagepipeline.producers.BaseProducerContextCallbacks, com.facebook.imagepipeline.producers.ProducerContextCallbacks
            public void onCancellationRequested() {
            }
        }

        /* renamed from: com.facebook.imagepipeline.producers.PostprocessorProducer$PostprocessorConsumer$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass2 implements Runnable {
            public final /* synthetic */ PostprocessorConsumer this$1;

            public AnonymousClass2(final PostprocessorConsumer this$1) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public PostprocessorConsumer(final PostprocessorProducer this$0, Consumer<CloseableReference<CloseableImage>> consumer, ProducerListener2 listener, Postprocessor postprocessor, ProducerContext producerContext) {
        }

        public static /* synthetic */ void access$200(PostprocessorConsumer postprocessorConsumer) {
        }

        public static /* synthetic */ CloseableReference access$300(PostprocessorConsumer postprocessorConsumer) {
        }

        public static /* synthetic */ CloseableReference access$302(PostprocessorConsumer postprocessorConsumer, CloseableReference closeableReference) {
        }

        public static /* synthetic */ int access$400(PostprocessorConsumer postprocessorConsumer) {
        }

        public static /* synthetic */ boolean access$502(PostprocessorConsumer postprocessorConsumer, boolean z) {
        }

        public static /* synthetic */ void access$600(PostprocessorConsumer postprocessorConsumer, CloseableReference closeableReference, int i2) {
        }

        public static /* synthetic */ void access$700(PostprocessorConsumer postprocessorConsumer) {
        }

        private void clearRunningAndStartIfDirty() {
        }

        private boolean close() {
        }

        private void doPostprocessing(CloseableReference<CloseableImage> sourceImageRef, int status) {
        }

        @Nullable
        private Map<String, String> getExtraMap(ProducerListener2 listener, ProducerContext producerContext, Postprocessor postprocessor) {
        }

        private synchronized boolean isClosed() {
        }

        private void maybeNotifyOnCancellation() {
        }

        private void maybeNotifyOnFailure(Throwable throwable) {
        }

        private void maybeNotifyOnNewResult(@Nullable CloseableReference<CloseableImage> newRef, int status) {
        }

        private CloseableReference<CloseableImage> postprocessInternal(CloseableImage sourceImage) {
        }

        private synchronized boolean setRunningIfDirtyAndNotRunning() {
        }

        private boolean shouldPostprocess(CloseableImage sourceImage) {
        }

        private void submitPostprocessing() {
        }

        private void updateSourceImageRef(@Nullable CloseableReference<CloseableImage> sourceImageRef, int status) {
        }

        @Override // com.facebook.imagepipeline.producers.DelegatingConsumer, com.facebook.imagepipeline.producers.BaseConsumer
        public void onCancellationImpl() {
        }

        @Override // com.facebook.imagepipeline.producers.DelegatingConsumer, com.facebook.imagepipeline.producers.BaseConsumer
        public void onFailureImpl(Throwable t) {
        }

        @Override // com.facebook.imagepipeline.producers.BaseConsumer
        public /* bridge */ /* synthetic */ void onNewResultImpl(@Nullable Object newResult, int status) {
        }

        public void onNewResultImpl(@Nullable CloseableReference<CloseableImage> newResult, int status) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class RepeatedPostprocessorConsumer extends DelegatingConsumer<CloseableReference<CloseableImage>, CloseableReference<CloseableImage>> implements RepeatedPostprocessorRunner {
        @GuardedBy("RepeatedPostprocessorConsumer.this")
        private boolean mIsClosed;
        @GuardedBy("RepeatedPostprocessorConsumer.this")
        @Nullable
        private CloseableReference<CloseableImage> mSourceImageRef;
        public final /* synthetic */ PostprocessorProducer this$0;

        /* renamed from: com.facebook.imagepipeline.producers.PostprocessorProducer$RepeatedPostprocessorConsumer$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 extends BaseProducerContextCallbacks {
            public final /* synthetic */ RepeatedPostprocessorConsumer this$1;
            public final /* synthetic */ PostprocessorProducer val$this$0;

            public AnonymousClass1(final RepeatedPostprocessorConsumer this$1, final PostprocessorProducer val$this$0) {
            }

            @Override // com.facebook.imagepipeline.producers.BaseProducerContextCallbacks, com.facebook.imagepipeline.producers.ProducerContextCallbacks
            public void onCancellationRequested() {
            }
        }

        public /* synthetic */ RepeatedPostprocessorConsumer(PostprocessorProducer postprocessorProducer, PostprocessorConsumer postprocessorConsumer, RepeatedPostprocessor repeatedPostprocessor, ProducerContext producerContext, AnonymousClass1 anonymousClass1) {
        }

        public static /* synthetic */ boolean access$1000(RepeatedPostprocessorConsumer repeatedPostprocessorConsumer) {
        }

        private boolean close() {
        }

        private void setSourceImageRef(CloseableReference<CloseableImage> sourceImageRef) {
        }

        private void updateInternal() {
        }

        @Override // com.facebook.imagepipeline.producers.DelegatingConsumer, com.facebook.imagepipeline.producers.BaseConsumer
        public void onCancellationImpl() {
        }

        @Override // com.facebook.imagepipeline.producers.DelegatingConsumer, com.facebook.imagepipeline.producers.BaseConsumer
        public void onFailureImpl(Throwable throwable) {
        }

        @Override // com.facebook.imagepipeline.producers.BaseConsumer
        public /* bridge */ /* synthetic */ void onNewResultImpl(Object newResult, int status) {
        }

        @Override // com.facebook.imagepipeline.request.RepeatedPostprocessorRunner
        public synchronized void update() {
        }

        private RepeatedPostprocessorConsumer(final PostprocessorProducer this$0, PostprocessorConsumer postprocessorConsumer, RepeatedPostprocessor repeatedPostprocessor, ProducerContext context) {
        }

        public void onNewResultImpl(CloseableReference<CloseableImage> newResult, int status) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class SingleUsePostprocessorConsumer extends DelegatingConsumer<CloseableReference<CloseableImage>, CloseableReference<CloseableImage>> {
        public final /* synthetic */ PostprocessorProducer this$0;

        public /* synthetic */ SingleUsePostprocessorConsumer(PostprocessorProducer postprocessorProducer, PostprocessorConsumer postprocessorConsumer, AnonymousClass1 anonymousClass1) {
        }

        @Override // com.facebook.imagepipeline.producers.BaseConsumer
        public /* bridge */ /* synthetic */ void onNewResultImpl(final Object newResult, int status) {
        }

        private SingleUsePostprocessorConsumer(final PostprocessorProducer this$0, PostprocessorConsumer postprocessorConsumer) {
        }

        public void onNewResultImpl(final CloseableReference<CloseableImage> newResult, int status) {
        }
    }

    public PostprocessorProducer(Producer<CloseableReference<CloseableImage>> inputProducer, PlatformBitmapFactory platformBitmapFactory, Executor executor) {
        this.mInputProducer = (Producer) Preconditions.checkNotNull(inputProducer);
        this.mBitmapFactory = platformBitmapFactory;
        this.mExecutor = (Executor) Preconditions.checkNotNull(executor);
    }

    @Override // com.facebook.imagepipeline.producers.Producer
    public void produceResults(final Consumer<CloseableReference<CloseableImage>> consumer, ProducerContext context) {
        Consumer<CloseableReference<CloseableImage>> singleUsePostprocessorConsumer;
        ProducerListener2 producerListener = context.getProducerListener();
        Postprocessor postprocessor = context.getImageRequest().getPostprocessor();
        Preconditions.checkNotNull(postprocessor);
        PostprocessorConsumer postprocessorConsumer = new PostprocessorConsumer(this, consumer, producerListener, postprocessor, context);
        if (postprocessor instanceof RepeatedPostprocessor) {
            singleUsePostprocessorConsumer = new RepeatedPostprocessorConsumer(this, postprocessorConsumer, (RepeatedPostprocessor) postprocessor, context, null);
        } else {
            singleUsePostprocessorConsumer = new SingleUsePostprocessorConsumer(this, postprocessorConsumer, null);
        }
        this.mInputProducer.produceResults(singleUsePostprocessorConsumer, context);
    }
}
