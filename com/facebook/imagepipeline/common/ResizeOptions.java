package com.facebook.imagepipeline.common;

import com.facebook.common.internal.Preconditions;
import com.facebook.common.util.HashCodeUtil;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ResizeOptions {
    public static final float DEFAULT_ROUNDUP_FRACTION = 0.6666667f;
    public final int height;
    public final float maxBitmapSize;
    public final float roundUpFraction;
    public final int width;

    public ResizeOptions(int width, int height) {
        this(width, height, 2048.0f);
    }

    @Nullable
    public static ResizeOptions forDimensions(int width, int height) {
        if (width <= 0 || height <= 0) {
            return null;
        }
        return new ResizeOptions(width, height);
    }

    @Nullable
    public static ResizeOptions forSquareSize(int size) {
        if (size <= 0) {
            return null;
        }
        return new ResizeOptions(size, size);
    }

    public boolean equals(@Nullable Object other) {
        if (other == this) {
            return true;
        }
        if (other instanceof ResizeOptions) {
            ResizeOptions resizeOptions = (ResizeOptions) other;
            return this.width == resizeOptions.width && this.height == resizeOptions.height;
        }
        return false;
    }

    public int hashCode() {
        return HashCodeUtil.hashCode(this.width, this.height);
    }

    public String toString() {
        return String.format(null, "%dx%d", Integer.valueOf(this.width), Integer.valueOf(this.height));
    }

    public ResizeOptions(int width, int height, float maxBitmapSize) {
        this(width, height, maxBitmapSize, 0.6666667f);
    }

    public ResizeOptions(int width, int height, float maxBitmapSize, float roundUpFraction) {
        Preconditions.checkArgument(Boolean.valueOf(width > 0));
        Preconditions.checkArgument(Boolean.valueOf(height > 0));
        this.width = width;
        this.height = height;
        this.maxBitmapSize = maxBitmapSize;
        this.roundUpFraction = roundUpFraction;
    }
}
