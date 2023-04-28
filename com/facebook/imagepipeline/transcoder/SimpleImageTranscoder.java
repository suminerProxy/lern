package com.facebook.imagepipeline.transcoder;

import android.graphics.Bitmap;
import com.facebook.imageformat.ImageFormat;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.infer.annotation.Nullsafe;
import java.io.OutputStream;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class SimpleImageTranscoder implements ImageTranscoder {
    private static final String TAG = "SimpleImageTranscoder";
    private final int mMaxBitmapSize;
    private final boolean mResizingEnabled;

    public SimpleImageTranscoder(final boolean resizingEnabled, final int maxBitmapSize) {
    }

    private static Bitmap.CompressFormat getOutputFormat(@Nullable final ImageFormat format) {
    }

    private int getSampleSize(final EncodedImage encodedImage, final RotationOptions rotationOptions, @Nullable final ResizeOptions resizeOptions) {
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
    public ImageTranscodeResult transcode(EncodedImage encodedImage, OutputStream outputStream, @Nullable RotationOptions rotationOptions, @Nullable ResizeOptions resizeOptions, @Nullable ImageFormat outputFormat, @Nullable Integer quality) {
    }
}
