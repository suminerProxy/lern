package com.facebook.imagepipeline.transcoder;

import com.facebook.imageformat.ImageFormat;
import com.facebook.imagepipeline.core.NativeCodeSetup;
import com.facebook.imagepipeline.nativecode.NativeImageTranscoderFactory;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class MultiImageTranscoderFactory implements ImageTranscoderFactory {
    private final boolean mEnsureTranscoderLibraryLoaded;
    @Nullable
    private final Integer mImageTranscoderType;
    private final int mMaxBitmapSize;
    @Nullable
    private final ImageTranscoderFactory mPrimaryImageTranscoderFactory;
    private final boolean mUseDownSamplingRatio;

    public MultiImageTranscoderFactory(final int maxBitmapSize, final boolean useDownSamplingRatio, @Nullable final ImageTranscoderFactory primaryImageTranscoderFactory, @Nullable final Integer imageTranscoderType, final boolean ensureTranscoderLibraryLoaded) {
        this.mMaxBitmapSize = maxBitmapSize;
        this.mUseDownSamplingRatio = useDownSamplingRatio;
        this.mPrimaryImageTranscoderFactory = primaryImageTranscoderFactory;
        this.mImageTranscoderType = imageTranscoderType;
        this.mEnsureTranscoderLibraryLoaded = ensureTranscoderLibraryLoaded;
    }

    @Nullable
    private ImageTranscoder getCustomImageTranscoder(ImageFormat imageFormat, boolean isResizingEnabled) {
        ImageTranscoderFactory imageTranscoderFactory = this.mPrimaryImageTranscoderFactory;
        if (imageTranscoderFactory == null) {
            return null;
        }
        return imageTranscoderFactory.createImageTranscoder(imageFormat, isResizingEnabled);
    }

    @Nullable
    private ImageTranscoder getImageTranscoderWithType(ImageFormat imageFormat, boolean isResizingEnabled) {
        Integer num = this.mImageTranscoderType;
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == 1) {
                return getSimpleImageTranscoder(imageFormat, isResizingEnabled);
            }
            throw new IllegalArgumentException("Invalid ImageTranscoderType");
        }
        return getNativeImageTranscoder(imageFormat, isResizingEnabled);
    }

    @Nullable
    private ImageTranscoder getNativeImageTranscoder(ImageFormat imageFormat, boolean isResizingEnabled) {
        return NativeImageTranscoderFactory.getNativeImageTranscoderFactory(this.mMaxBitmapSize, this.mUseDownSamplingRatio, this.mEnsureTranscoderLibraryLoaded).createImageTranscoder(imageFormat, isResizingEnabled);
    }

    private ImageTranscoder getSimpleImageTranscoder(ImageFormat imageFormat, boolean isResizingEnabled) {
        return new SimpleImageTranscoderFactory(this.mMaxBitmapSize).createImageTranscoder(imageFormat, isResizingEnabled);
    }

    @Override // com.facebook.imagepipeline.transcoder.ImageTranscoderFactory
    public ImageTranscoder createImageTranscoder(ImageFormat imageFormat, boolean isResizingEnabled) {
        ImageTranscoder customImageTranscoder = getCustomImageTranscoder(imageFormat, isResizingEnabled);
        if (customImageTranscoder == null) {
            customImageTranscoder = getImageTranscoderWithType(imageFormat, isResizingEnabled);
        }
        if (customImageTranscoder == null && NativeCodeSetup.getUseNativeCode()) {
            customImageTranscoder = getNativeImageTranscoder(imageFormat, isResizingEnabled);
        }
        return customImageTranscoder == null ? getSimpleImageTranscoder(imageFormat, isResizingEnabled) : customImageTranscoder;
    }
}
