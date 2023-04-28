package com.facebook.imagepipeline.image;

import com.facebook.imagepipeline.animated.base.AnimatedImage;
import com.facebook.imagepipeline.animated.base.AnimatedImageResult;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class CloseableAnimatedImage extends CloseableImage {
    @Nullable
    private AnimatedImageResult mImageResult;
    private boolean mIsStateful;

    public CloseableAnimatedImage(AnimatedImageResult imageResult) {
        this(imageResult, true);
    }

    @Override // com.facebook.imagepipeline.image.CloseableImage, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            AnimatedImageResult animatedImageResult = this.mImageResult;
            if (animatedImageResult == null) {
                return;
            }
            this.mImageResult = null;
            animatedImageResult.dispose();
        }
    }

    @Override // com.facebook.imagepipeline.image.ImageInfo
    public synchronized int getHeight() {
        AnimatedImageResult animatedImageResult;
        animatedImageResult = this.mImageResult;
        return animatedImageResult == null ? 0 : animatedImageResult.getImage().getHeight();
    }

    @Nullable
    public synchronized AnimatedImage getImage() {
        AnimatedImageResult animatedImageResult;
        animatedImageResult = this.mImageResult;
        return animatedImageResult == null ? null : animatedImageResult.getImage();
    }

    @Nullable
    public synchronized AnimatedImageResult getImageResult() {
        return this.mImageResult;
    }

    @Override // com.facebook.imagepipeline.image.CloseableImage
    public synchronized int getSizeInBytes() {
        AnimatedImageResult animatedImageResult;
        animatedImageResult = this.mImageResult;
        return animatedImageResult == null ? 0 : animatedImageResult.getImage().getSizeInBytes();
    }

    @Override // com.facebook.imagepipeline.image.ImageInfo
    public synchronized int getWidth() {
        AnimatedImageResult animatedImageResult;
        animatedImageResult = this.mImageResult;
        return animatedImageResult == null ? 0 : animatedImageResult.getImage().getWidth();
    }

    @Override // com.facebook.imagepipeline.image.CloseableImage
    public synchronized boolean isClosed() {
        return this.mImageResult == null;
    }

    @Override // com.facebook.imagepipeline.image.CloseableImage
    public boolean isStateful() {
        return this.mIsStateful;
    }

    public CloseableAnimatedImage(AnimatedImageResult imageResult, boolean isStateful) {
        this.mImageResult = imageResult;
        this.mIsStateful = isStateful;
    }
}
