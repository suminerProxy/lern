package com.facebook.imagepipeline.animated.base;

import android.graphics.Bitmap;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.transformation.BitmapTransformation;
import com.facebook.infer.annotation.Nullsafe;
import java.util.List;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class AnimatedImageResultBuilder {
    @Nullable
    private BitmapTransformation mBitmapTransformation;
    @Nullable
    private List<CloseableReference<Bitmap>> mDecodedFrames;
    private int mFrameForPreview;
    private final AnimatedImage mImage;
    @Nullable
    private CloseableReference<Bitmap> mPreviewBitmap;

    public AnimatedImageResultBuilder(AnimatedImage image) {
    }

    public AnimatedImageResult build() {
    }

    @Nullable
    public BitmapTransformation getBitmapTransformation() {
    }

    @Nullable
    public List<CloseableReference<Bitmap>> getDecodedFrames() {
    }

    public int getFrameForPreview() {
    }

    public AnimatedImage getImage() {
    }

    @Nullable
    public CloseableReference<Bitmap> getPreviewBitmap() {
    }

    public AnimatedImageResultBuilder setBitmapTransformation(@Nullable BitmapTransformation bitmapTransformation) {
    }

    public AnimatedImageResultBuilder setDecodedFrames(@Nullable List<CloseableReference<Bitmap>> decodedFrames) {
    }

    public AnimatedImageResultBuilder setFrameForPreview(int frameForPreview) {
    }

    public AnimatedImageResultBuilder setPreviewBitmap(@Nullable CloseableReference<Bitmap> previewBitmap) {
    }
}
