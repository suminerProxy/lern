package com.facebook.drawee.backends.pipeline.info;

import com.facebook.infer.annotation.Nullsafe;
import java.util.Collection;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ForwardingImagePerfDataListener implements ImagePerfDataListener {
    private final Collection<ImagePerfDataListener> mListeners;

    public ForwardingImagePerfDataListener(Collection<ImagePerfDataListener> listeners) {
    }

    @Override // com.facebook.drawee.backends.pipeline.info.ImagePerfDataListener
    public void onImageLoadStatusUpdated(ImagePerfData imagePerfData, int imageLoadStatus) {
    }

    @Override // com.facebook.drawee.backends.pipeline.info.ImagePerfDataListener
    public void onImageVisibilityUpdated(ImagePerfData imagePerfData, int visibilityState) {
    }
}
