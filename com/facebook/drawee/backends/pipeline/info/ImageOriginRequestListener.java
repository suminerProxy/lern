package com.facebook.drawee.backends.pipeline.info;

import com.facebook.imagepipeline.listener.BaseRequestListener;
import javax.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ImageOriginRequestListener extends BaseRequestListener {
    private String mControllerId;
    @Nullable
    private final ImageOriginListener mImageOriginLister;

    public ImageOriginRequestListener(String controllerId, @Nullable ImageOriginListener imageOriginLister) {
    }

    public void init(String controllerId) {
    }

    @Override // com.facebook.imagepipeline.listener.BaseRequestListener, com.facebook.imagepipeline.producers.ProducerListener
    public void onUltimateProducerReached(String requestId, String ultimateProducerName, boolean successful) {
    }
}
