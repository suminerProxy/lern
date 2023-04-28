package com.facebook.imagepipeline.transcoder;

import com.facebook.imageformat.ImageFormat;
import com.facebook.infer.annotation.Nullsafe;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class SimpleImageTranscoderFactory implements ImageTranscoderFactory {
    private final int mMaxBitmapSize;

    public SimpleImageTranscoderFactory(final int maxBitmapSize) {
        this.mMaxBitmapSize = maxBitmapSize;
    }

    @Override // com.facebook.imagepipeline.transcoder.ImageTranscoderFactory
    public ImageTranscoder createImageTranscoder(ImageFormat imageFormat, boolean isResizingEnabled) {
        return new SimpleImageTranscoder(isResizingEnabled, this.mMaxBitmapSize);
    }
}
