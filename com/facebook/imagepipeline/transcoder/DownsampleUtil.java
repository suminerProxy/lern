package com.facebook.imagepipeline.transcoder;

import androidx.annotation.VisibleForTesting;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class DownsampleUtil {
    public static final int DEFAULT_SAMPLE_SIZE = 1;
    private static final float INTERVAL_ROUNDING = 0.33333334f;

    private DownsampleUtil() {
    }

    @VisibleForTesting
    public static float determineDownsampleRatio(final RotationOptions rotationOptions, @Nullable final ResizeOptions resizeOptions, final EncodedImage encodedImage) {
    }

    public static int determineSampleSize(final RotationOptions rotationOptions, @Nullable final ResizeOptions resizeOptions, final EncodedImage encodedImage, final int maxBitmapSize) {
    }

    public static int determineSampleSizeJPEG(final EncodedImage encodedImage, final int pixelSize, final int maxBitmapSizeInBytes) {
    }

    private static int getRotationAngle(final RotationOptions rotationOptions, final EncodedImage encodedImage) {
    }

    @VisibleForTesting
    public static int ratioToSampleSize(final float ratio) {
    }

    @VisibleForTesting
    public static int ratioToSampleSizeJPEG(final float ratio) {
    }

    @VisibleForTesting
    public static int roundToPowerOfTwo(final int sampleSize) {
    }
}
