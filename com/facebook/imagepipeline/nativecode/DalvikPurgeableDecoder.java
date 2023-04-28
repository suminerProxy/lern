package com.facebook.imagepipeline.nativecode;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import androidx.annotation.VisibleForTesting;
import com.facebook.common.internal.DoNotStrip;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.memory.BitmapCounter;
import com.facebook.imagepipeline.platform.PlatformDecoder;
import com.facebook.infer.annotation.Nullsafe;
import com.facebook.soloader.DoNotOptimize;
import javax.annotation.Nullable;

@DoNotStrip
@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class DalvikPurgeableDecoder implements PlatformDecoder {
    public static final byte[] EOI = null;
    private final BitmapCounter mUnpooledBitmapsCounter;

    @DoNotOptimize
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class OreoUtils {
        private OreoUtils() {
        }

        @TargetApi(26)
        public static void setColorSpace(BitmapFactory.Options options, @Nullable ColorSpace colorSpace) {
        }
    }

    @VisibleForTesting
    public static boolean endsWithEOI(CloseableReference<PooledByteBuffer> bytesRef, int length) {
    }

    @VisibleForTesting
    public static BitmapFactory.Options getBitmapFactoryOptions(int sampleSize, Bitmap.Config bitmapConfig) {
    }

    @DoNotStrip
    private static native void nativePinBitmap(Bitmap bitmap);

    public abstract Bitmap decodeByteArrayAsPurgeable(CloseableReference<PooledByteBuffer> bytesRef, BitmapFactory.Options options);

    @Override // com.facebook.imagepipeline.platform.PlatformDecoder
    public CloseableReference<Bitmap> decodeFromEncodedImage(EncodedImage encodedImage, Bitmap.Config bitmapConfig, @Nullable Rect regionToDecode) {
    }

    @Override // com.facebook.imagepipeline.platform.PlatformDecoder
    public CloseableReference<Bitmap> decodeFromEncodedImageWithColorSpace(final EncodedImage encodedImage, Bitmap.Config bitmapConfig, @Nullable Rect regionToDecode, @Nullable final ColorSpace colorSpace) {
    }

    public abstract Bitmap decodeJPEGByteArrayAsPurgeable(CloseableReference<PooledByteBuffer> bytesRef, int length, BitmapFactory.Options options);

    @Override // com.facebook.imagepipeline.platform.PlatformDecoder
    public CloseableReference<Bitmap> decodeJPEGFromEncodedImage(EncodedImage encodedImage, Bitmap.Config bitmapConfig, @Nullable Rect regionToDecode, int length) {
    }

    @Override // com.facebook.imagepipeline.platform.PlatformDecoder
    public CloseableReference<Bitmap> decodeJPEGFromEncodedImageWithColorSpace(final EncodedImage encodedImage, Bitmap.Config bitmapConfig, @Nullable Rect regionToDecode, int length, @Nullable final ColorSpace colorSpace) {
    }

    public CloseableReference<Bitmap> pinBitmap(Bitmap bitmap) {
    }
}
