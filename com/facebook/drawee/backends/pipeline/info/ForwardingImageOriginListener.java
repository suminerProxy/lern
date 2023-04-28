package com.facebook.drawee.backends.pipeline.info;

import com.facebook.infer.annotation.Nullsafe;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ForwardingImageOriginListener implements ImageOriginListener {
    private static final String TAG = "ForwardingImageOriginListener";
    private final List<ImageOriginListener> mImageOriginListeners;

    public ForwardingImageOriginListener(Set<ImageOriginListener> imageOriginListeners) {
    }

    public synchronized void addImageOriginListener(ImageOriginListener listener) {
    }

    @Override // com.facebook.drawee.backends.pipeline.info.ImageOriginListener
    public synchronized void onImageLoaded(String controllerId, int imageOrigin, boolean successful, @Nullable String ultimateProducerName) {
    }

    public synchronized void removeImageOriginListener(ImageOriginListener listener) {
    }

    public ForwardingImageOriginListener(ImageOriginListener... imageOriginListeners) {
    }
}
