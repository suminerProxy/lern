package com.facebook.imagepipeline.common;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.facebook.imagepipeline.decoder.ImageDecoder;
import com.facebook.imagepipeline.transformation.BitmapTransformation;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ImageDecodeOptionsBuilder<T extends ImageDecodeOptionsBuilder> {
    private Bitmap.Config mAnimatedBitmapConfig;
    private Bitmap.Config mBitmapConfig;
    @Nullable
    private BitmapTransformation mBitmapTransformation;
    @Nullable
    private ColorSpace mColorSpace;
    @Nullable
    private ImageDecoder mCustomImageDecoder;
    private boolean mDecodeAllFrames;
    private boolean mDecodePreviewFrame;
    private boolean mExcludeBitmapConfigFromComparison;
    private boolean mForceStaticImage;
    private int mMaxDimensionPx;
    private int mMinDecodeIntervalMs;
    private boolean mUseLastFrameForPreview;

    public ImageDecodeOptions build() {
    }

    public Bitmap.Config getAnimatedBitmapConfig() {
    }

    public Bitmap.Config getBitmapConfig() {
    }

    @Nullable
    public BitmapTransformation getBitmapTransformation() {
    }

    @Nullable
    public ColorSpace getColorSpace() {
    }

    @Nullable
    public ImageDecoder getCustomImageDecoder() {
    }

    public boolean getDecodeAllFrames() {
    }

    public boolean getDecodePreviewFrame() {
    }

    public boolean getExcludeBitmapConfigFromComparison() {
    }

    public boolean getForceStaticImage() {
    }

    public int getMaxDimensionPx() {
    }

    public int getMinDecodeIntervalMs() {
    }

    public T getThis() {
    }

    public boolean getUseLastFrameForPreview() {
    }

    public T setAnimatedBitmapConfig(Bitmap.Config animatedBitmapConfig) {
    }

    public T setBitmapConfig(Bitmap.Config bitmapConfig) {
    }

    public T setBitmapTransformation(@Nullable BitmapTransformation bitmapTransformation) {
    }

    public T setColorSpace(ColorSpace colorSpace) {
    }

    public T setCustomImageDecoder(@Nullable ImageDecoder customImageDecoder) {
    }

    public T setDecodeAllFrames(boolean decodeAllFrames) {
    }

    public T setDecodePreviewFrame(boolean decodePreviewFrame) {
    }

    public T setExcludeBitmapConfigFromComparison(boolean excludeBitmapConfigFromComparison) {
    }

    public T setForceStaticImage(boolean forceStaticImage) {
    }

    public ImageDecodeOptionsBuilder setFrom(ImageDecodeOptions options) {
    }

    public T setMaxDimensionPx(int maxDimensionPx) {
    }

    public T setMinDecodeIntervalMs(int intervalMs) {
    }

    public T setUseLastFrameForPreview(boolean useLastFrameForPreview) {
    }
}
