package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.core.ImagePipelineConfigInterface;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class SettableProducerContext extends BaseProducerContext {
    public SettableProducerContext(ProducerContext context) {
        this(context.getImageRequest(), context.getId(), context.getUiComponentId(), context.getProducerListener(), context.getCallerContext(), context.getLowestPermittedRequestLevel(), context.isPrefetch(), context.isIntermediateResultExpected(), context.getPriority(), context.getImagePipelineConfig());
    }

    public void setIsIntermediateResultExpected(boolean isIntermediateResultExpected) {
        BaseProducerContext.callOnIsIntermediateResultExpectedChanged(setIsIntermediateResultExpectedNoCallbacks(isIntermediateResultExpected));
    }

    public void setIsPrefetch(boolean isPrefetch) {
        BaseProducerContext.callOnIsPrefetchChanged(setIsPrefetchNoCallbacks(isPrefetch));
    }

    public void setPriority(Priority priority) {
        BaseProducerContext.callOnPriorityChanged(setPriorityNoCallbacks(priority));
    }

    public SettableProducerContext(ImageRequest overrideRequest, ProducerContext context) {
        this(overrideRequest, context.getId(), context.getUiComponentId(), context.getProducerListener(), context.getCallerContext(), context.getLowestPermittedRequestLevel(), context.isPrefetch(), context.isIntermediateResultExpected(), context.getPriority(), context.getImagePipelineConfig());
    }

    public SettableProducerContext(ImageRequest imageRequest, String id, ProducerListener2 producerListener, Object callerContext, ImageRequest.RequestLevel lowestPermittedRequestLevel, boolean isPrefetch, boolean isIntermediateResultExpected, Priority priority, ImagePipelineConfigInterface imagePipelineConfig) {
        super(imageRequest, id, producerListener, callerContext, lowestPermittedRequestLevel, isPrefetch, isIntermediateResultExpected, priority, imagePipelineConfig);
    }

    public SettableProducerContext(ImageRequest imageRequest, String id, @Nullable String uiComponentId, ProducerListener2 producerListener, Object callerContext, ImageRequest.RequestLevel lowestPermittedRequestLevel, boolean isPrefetch, boolean isIntermediateResultExpected, Priority priority, ImagePipelineConfigInterface imagePipelineConfig) {
        super(imageRequest, id, uiComponentId, producerListener, callerContext, lowestPermittedRequestLevel, isPrefetch, isIntermediateResultExpected, priority, imagePipelineConfig);
    }
}
