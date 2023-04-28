package com.facebook.imagepipeline.transcoder;

import android.graphics.Matrix;
import androidx.annotation.VisibleForTesting;
import com.facebook.common.internal.ImmutableList;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class JpegTranscoderUtils {
    @VisibleForTesting
    public static final int DEFAULT_JPEG_QUALITY = 85;
    private static final int FULL_ROUND = 360;
    public static final ImmutableList<Integer> INVERTED_EXIF_ORIENTATIONS = null;
    public static final int MAX_QUALITY = 100;
    public static final int MAX_SCALE_NUMERATOR = 16;
    public static final int MIN_QUALITY = 0;
    public static final int MIN_SCALE_NUMERATOR = 1;
    public static final int SCALE_DENOMINATOR = 8;

    @VisibleForTesting
    public static int calculateDownsampleNumerator(int downsampleRatio) {
    }

    @VisibleForTesting
    public static float determineResizeRatio(ResizeOptions resizeOptions, int width, int height) {
    }

    private static int extractOrientationFromMetadata(EncodedImage encodedImage) {
    }

    public static int getForceRotatedInvertedExifOrientation(RotationOptions rotationOptions, EncodedImage encodedImage) {
    }

    public static int getRotationAngle(RotationOptions rotationOptions, EncodedImage encodedImage) {
    }

    public static int getSoftwareNumerator(RotationOptions rotationOptions, @Nullable ResizeOptions resizeOptions, EncodedImage encodedImage, boolean resizingEnabled) {
    }

    @Nullable
    public static Matrix getTransformationMatrix(final EncodedImage encodedImage, final RotationOptions rotationOptions) {
    }

    @Nullable
    private static Matrix getTransformationMatrixFromInvertedExif(final int orientation) {
    }

    public static boolean isExifOrientationAllowed(int exifOrientation) {
    }

    public static boolean isRotationAngleAllowed(int degrees) {
    }

    @VisibleForTesting
    public static int roundNumerator(float maxRatio, float roundUpFraction) {
    }
}
