package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface PlatformDecoder {
    CloseableReference<Bitmap> decodeFromEncodedImage(final EncodedImage encodedImage, Bitmap.Config bitmapConfig, @Nullable Rect regionToDecode);

    CloseableReference<Bitmap> decodeFromEncodedImageWithColorSpace(final EncodedImage encodedImage, Bitmap.Config bitmapConfig, @Nullable Rect regionToDecode, @Nullable final ColorSpace colorSpace);

    CloseableReference<Bitmap> decodeJPEGFromEncodedImage(EncodedImage encodedImage, Bitmap.Config bitmapConfig, @Nullable Rect regionToDecode, int length);

    CloseableReference<Bitmap> decodeJPEGFromEncodedImageWithColorSpace(EncodedImage encodedImage, Bitmap.Config bitmapConfig, @Nullable Rect regionToDecode, int length, @Nullable final ColorSpace colorSpace);
}
