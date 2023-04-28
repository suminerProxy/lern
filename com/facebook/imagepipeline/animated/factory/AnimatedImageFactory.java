package com.facebook.imagepipeline.animated.factory;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.infer.annotation.Nullsafe;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface AnimatedImageFactory {
    CloseableImage decodeGif(final EncodedImage encodedImage, final ImageDecodeOptions options, final Bitmap.Config bitmapConfig);

    CloseableImage decodeWebP(final EncodedImage encodedImage, final ImageDecodeOptions options, final Bitmap.Config bitmapConfig);
}
