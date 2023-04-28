package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.listener.RequestListener2;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class InternalRequestListener extends InternalProducerListener implements RequestListener2 {
    @Nullable
    private final RequestListener mRequestListener;
    @Nullable
    private final RequestListener2 mRequestListener2;

    public InternalRequestListener(@Nullable RequestListener requestListener, @Nullable RequestListener2 requestListener2) {
        super(requestListener, requestListener2);
        this.mRequestListener = requestListener;
        this.mRequestListener2 = requestListener2;
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener2
    public void onRequestCancellation(ProducerContext producerContext) {
        RequestListener requestListener = this.mRequestListener;
        if (requestListener != null) {
            requestListener.onRequestCancellation(producerContext.getId());
        }
        RequestListener2 requestListener2 = this.mRequestListener2;
        if (requestListener2 != null) {
            requestListener2.onRequestCancellation(producerContext);
        }
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener2
    public void onRequestFailure(ProducerContext producerContext, Throwable throwable) {
        RequestListener requestListener = this.mRequestListener;
        if (requestListener != null) {
            requestListener.onRequestFailure(producerContext.getImageRequest(), producerContext.getId(), throwable, producerContext.isPrefetch());
        }
        RequestListener2 requestListener2 = this.mRequestListener2;
        if (requestListener2 != null) {
            requestListener2.onRequestFailure(producerContext, throwable);
        }
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener2
    public void onRequestStart(ProducerContext producerContext) {
        RequestListener requestListener = this.mRequestListener;
        if (requestListener != null) {
            requestListener.onRequestStart(producerContext.getImageRequest(), producerContext.getCallerContext(), producerContext.getId(), producerContext.isPrefetch());
        }
        RequestListener2 requestListener2 = this.mRequestListener2;
        if (requestListener2 != null) {
            requestListener2.onRequestStart(producerContext);
        }
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener2
    public void onRequestSuccess(ProducerContext producerContext) {
        RequestListener requestListener = this.mRequestListener;
        if (requestListener != null) {
            requestListener.onRequestSuccess(producerContext.getImageRequest(), producerContext.getId(), producerContext.isPrefetch());
        }
        RequestListener2 requestListener2 = this.mRequestListener2;
        if (requestListener2 != null) {
            requestListener2.onRequestSuccess(producerContext);
        }
    }
}
