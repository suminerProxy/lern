package com.facebook.imagepipeline.decoder;

import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.image.QualityInfo;
import javax.annotation.Nonnull;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface ImageDecoder {
    CloseableImage decode(@Nonnull EncodedImage encodedImage, int length, @Nonnull QualityInfo qualityInfo, @Nonnull ImageDecodeOptions options);
}
