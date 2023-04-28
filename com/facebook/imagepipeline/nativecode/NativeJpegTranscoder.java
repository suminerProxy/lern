package com.facebook.imagepipeline.nativecode;

import androidx.annotation.VisibleForTesting;
import com.facebook.common.internal.DoNotStrip;
import com.facebook.imageformat.ImageFormat;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.transcoder.ImageTranscodeResult;
import com.facebook.imagepipeline.transcoder.ImageTranscoder;
import com.facebook.infer.annotation.Nullsafe;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.annotation.Nullable;

@DoNotStrip
@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class NativeJpegTranscoder implements ImageTranscoder {
    public static final String TAG = "NativeJpegTranscoder";
    private int mMaxBitmapSize;
    private boolean mResizingEnabled;
    private boolean mUseDownsamplingRatio;

    public NativeJpegTranscoder(final boolean resizingEnabled, final int maxBitmapSize, final boolean useDownsamplingRatio, final boolean ensureTranscoderLibraryLoaded) {
    }

    @DoNotStrip
    private static native void nativeTranscodeJpeg(InputStream inputStream, OutputStream outputStream, int rotationAngle, int scaleNominator, int quality) throws IOException;

    @DoNotStrip
    private static native void nativeTranscodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int exifOrientation, int scaleNominator, int quality) throws IOException;

    @VisibleForTesting
    public static void transcodeJpeg(final InputStream inputStream, final OutputStream outputStream, final int rotationAngle, final int scaleNumerator, final int quality) throws IOException {
    }

    @VisibleForTesting
    public static void transcodeJpegWithExifOrientation(final InputStream inputStream, final OutputStream outputStream, final int exifOrientation, final int scaleNumerator, final int quality) throws IOException {
    }

    @Override // com.facebook.imagepipeline.transcoder.ImageTranscoder
    public boolean canResize(EncodedImage encodedImage, @Nullable RotationOptions rotationOptions, @Nullable ResizeOptions resizeOptions) {
    }

    @Override // com.facebook.imagepipeline.transcoder.ImageTranscoder
    public boolean canTranscode(ImageFormat imageFormat) {
    }

    @Override // com.facebook.imagepipeline.transcoder.ImageTranscoder
    public String getIdentifier() {
    }

    @Override // com.facebook.imagepipeline.transcoder.ImageTranscoder
    public ImageTranscodeResult transcode(final EncodedImage encodedImage, final OutputStream outputStream, @Nullable RotationOptions rotationOptions, @Nullable final ResizeOptions resizeOptions, @Nullable ImageFormat outputFormat, @Nullable Integer quality) throws IOException {
    }
}
