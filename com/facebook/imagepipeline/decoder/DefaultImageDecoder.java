package com.facebook.imagepipeline.decoder;

import android.graphics.Bitmap;
import com.facebook.common.references.CloseableReference;
import com.facebook.imageformat.DefaultImageFormats;
import com.facebook.imageformat.ImageFormat;
import com.facebook.imageformat.ImageFormatChecker;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.image.ImmutableQualityInfo;
import com.facebook.imagepipeline.image.QualityInfo;
import com.facebook.imagepipeline.platform.PlatformDecoder;
import com.facebook.imagepipeline.transformation.CircularTransformation;
import com.facebook.imagepipeline.transformation.TransformationUtils;
import com.facebook.infer.annotation.Nullsafe;
import java.io.InputStream;
import java.util.Map;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class DefaultImageDecoder implements ImageDecoder {
    @Nullable
    private final ImageDecoder mAnimatedGifDecoder;
    @Nullable
    private final ImageDecoder mAnimatedWebPDecoder;
    @Nullable
    private final Map<ImageFormat, ImageDecoder> mCustomDecoders;
    private final ImageDecoder mDefaultDecoder;
    private final PlatformDecoder mPlatformDecoder;

    public DefaultImageDecoder(@Nullable final ImageDecoder animatedGifDecoder, @Nullable final ImageDecoder animatedWebPDecoder, final PlatformDecoder platformDecoder) {
        this(animatedGifDecoder, animatedWebPDecoder, platformDecoder, null);
    }

    @Override // com.facebook.imagepipeline.decoder.ImageDecoder
    public CloseableImage decode(final EncodedImage encodedImage, final int length, final QualityInfo qualityInfo, final ImageDecodeOptions options) {
        InputStream inputStream;
        ImageDecoder imageDecoder;
        ImageDecoder imageDecoder2 = options.customImageDecoder;
        if (imageDecoder2 != null) {
            return imageDecoder2.decode(encodedImage, length, qualityInfo, options);
        }
        ImageFormat imageFormat = encodedImage.getImageFormat();
        if ((imageFormat == null || imageFormat == ImageFormat.UNKNOWN) && (inputStream = encodedImage.getInputStream()) != null) {
            imageFormat = ImageFormatChecker.getImageFormat_WrapIOException(inputStream);
            encodedImage.setImageFormat(imageFormat);
        }
        Map<ImageFormat, ImageDecoder> map = this.mCustomDecoders;
        if (map != null && (imageDecoder = map.get(imageFormat)) != null) {
            return imageDecoder.decode(encodedImage, length, qualityInfo, options);
        }
        return this.mDefaultDecoder.decode(encodedImage, length, qualityInfo, options);
    }

    public CloseableImage decodeAnimatedWebp(final EncodedImage encodedImage, final int length, final QualityInfo qualityInfo, final ImageDecodeOptions options) {
        ImageDecoder imageDecoder = this.mAnimatedWebPDecoder;
        if (imageDecoder != null) {
            return imageDecoder.decode(encodedImage, length, qualityInfo, options);
        }
        throw new DecodeException("Animated WebP support not set up!", encodedImage);
    }

    public CloseableImage decodeGif(final EncodedImage encodedImage, final int length, final QualityInfo qualityInfo, final ImageDecodeOptions options) {
        ImageDecoder imageDecoder;
        if (encodedImage.getWidth() != -1 && encodedImage.getHeight() != -1) {
            if (!options.forceStaticImage && (imageDecoder = this.mAnimatedGifDecoder) != null) {
                return imageDecoder.decode(encodedImage, length, qualityInfo, options);
            }
            return decodeStaticImage(encodedImage, options);
        }
        throw new DecodeException("image width or height is incorrect", encodedImage);
    }

    public CloseableStaticBitmap decodeJpeg(final EncodedImage encodedImage, int length, QualityInfo qualityInfo, ImageDecodeOptions options) {
        CloseableReference<Bitmap> decodeJPEGFromEncodedImageWithColorSpace = this.mPlatformDecoder.decodeJPEGFromEncodedImageWithColorSpace(encodedImage, options.bitmapConfig, null, length, options.colorSpace);
        try {
            boolean maybeApplyTransformation = TransformationUtils.maybeApplyTransformation(options.bitmapTransformation, decodeJPEGFromEncodedImageWithColorSpace);
            CloseableStaticBitmap closeableStaticBitmap = new CloseableStaticBitmap(decodeJPEGFromEncodedImageWithColorSpace, qualityInfo, encodedImage.getRotationAngle(), encodedImage.getExifOrientation());
            closeableStaticBitmap.setImageExtra("is_rounded", Boolean.valueOf(maybeApplyTransformation && (options.bitmapTransformation instanceof CircularTransformation)));
            return closeableStaticBitmap;
        } finally {
            decodeJPEGFromEncodedImageWithColorSpace.close();
        }
    }

    public CloseableStaticBitmap decodeStaticImage(final EncodedImage encodedImage, ImageDecodeOptions options) {
        CloseableReference<Bitmap> decodeFromEncodedImageWithColorSpace = this.mPlatformDecoder.decodeFromEncodedImageWithColorSpace(encodedImage, options.bitmapConfig, null, options.colorSpace);
        try {
            boolean maybeApplyTransformation = TransformationUtils.maybeApplyTransformation(options.bitmapTransformation, decodeFromEncodedImageWithColorSpace);
            CloseableStaticBitmap closeableStaticBitmap = new CloseableStaticBitmap(decodeFromEncodedImageWithColorSpace, ImmutableQualityInfo.FULL_QUALITY, encodedImage.getRotationAngle(), encodedImage.getExifOrientation());
            closeableStaticBitmap.setImageExtra("is_rounded", Boolean.valueOf(maybeApplyTransformation && (options.bitmapTransformation instanceof CircularTransformation)));
            return closeableStaticBitmap;
        } finally {
            decodeFromEncodedImageWithColorSpace.close();
        }
    }

    public DefaultImageDecoder(@Nullable final ImageDecoder animatedGifDecoder, @Nullable final ImageDecoder animatedWebPDecoder, final PlatformDecoder platformDecoder, @Nullable Map<ImageFormat, ImageDecoder> customDecoders) {
        this.mDefaultDecoder = new ImageDecoder() { // from class: com.facebook.imagepipeline.decoder.DefaultImageDecoder.1
            @Override // com.facebook.imagepipeline.decoder.ImageDecoder
            public CloseableImage decode(EncodedImage encodedImage, int length, QualityInfo qualityInfo, ImageDecodeOptions options) {
                ImageFormat imageFormat = encodedImage.getImageFormat();
                if (imageFormat == DefaultImageFormats.JPEG) {
                    return DefaultImageDecoder.this.decodeJpeg(encodedImage, length, qualityInfo, options);
                }
                if (imageFormat == DefaultImageFormats.GIF) {
                    return DefaultImageDecoder.this.decodeGif(encodedImage, length, qualityInfo, options);
                }
                if (imageFormat == DefaultImageFormats.WEBP_ANIMATED) {
                    return DefaultImageDecoder.this.decodeAnimatedWebp(encodedImage, length, qualityInfo, options);
                }
                if (imageFormat != ImageFormat.UNKNOWN) {
                    return DefaultImageDecoder.this.decodeStaticImage(encodedImage, options);
                }
                throw new DecodeException("unknown image format", encodedImage);
            }
        };
        this.mAnimatedGifDecoder = animatedGifDecoder;
        this.mAnimatedWebPDecoder = animatedWebPDecoder;
        this.mPlatformDecoder = platformDecoder;
        this.mCustomDecoders = customDecoders;
    }
}
