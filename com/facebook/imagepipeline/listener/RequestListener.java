package com.facebook.imagepipeline.listener;

import com.facebook.imagepipeline.producers.ProducerListener;
import com.facebook.imagepipeline.request.ImageRequest;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface RequestListener extends ProducerListener {
    void onRequestCancellation(String requestId);

    void onRequestFailure(ImageRequest request, String requestId, Throwable throwable, boolean isPrefetch);

    void onRequestStart(ImageRequest request, Object callerContext, String requestId, boolean isPrefetch);

    void onRequestSuccess(ImageRequest request, String requestId, boolean isPrefetch);
}
