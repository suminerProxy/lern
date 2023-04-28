package com.facebook.drawee.generic;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import com.facebook.common.internal.Preconditions;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.infer.annotation.Nullsafe;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class GenericDraweeHierarchyBuilder {
    public static final int DEFAULT_FADE_DURATION = 300;
    @Nullable
    private ColorFilter mActualImageColorFilter;
    @Nullable
    private PointF mActualImageFocusPoint;
    @Nullable
    private Matrix mActualImageMatrix;
    @Nullable
    private ScalingUtils.ScaleType mActualImageScaleType;
    @Nullable
    private Drawable mBackground;
    private float mDesiredAspectRatio;
    private int mFadeDuration;
    @Nullable
    private Drawable mFailureImage;
    @Nullable
    private ScalingUtils.ScaleType mFailureImageScaleType;
    @Nullable
    private List<Drawable> mOverlays;
    @Nullable
    private Drawable mPlaceholderImage;
    @Nullable
    private ScalingUtils.ScaleType mPlaceholderImageScaleType;
    @Nullable
    private Drawable mPressedStateOverlay;
    @Nullable
    private Drawable mProgressBarImage;
    @Nullable
    private ScalingUtils.ScaleType mProgressBarImageScaleType;
    private Resources mResources;
    @Nullable
    private Drawable mRetryImage;
    @Nullable
    private ScalingUtils.ScaleType mRetryImageScaleType;
    @Nullable
    private RoundingParams mRoundingParams;
    public static final ScalingUtils.ScaleType DEFAULT_SCALE_TYPE = ScalingUtils.ScaleType.CENTER_INSIDE;
    public static final ScalingUtils.ScaleType DEFAULT_ACTUAL_IMAGE_SCALE_TYPE = ScalingUtils.ScaleType.CENTER_CROP;

    public GenericDraweeHierarchyBuilder(Resources resources) {
        this.mResources = resources;
        init();
    }

    private void init() {
        this.mFadeDuration = 300;
        this.mDesiredAspectRatio = 0.0f;
        this.mPlaceholderImage = null;
        ScalingUtils.ScaleType scaleType = DEFAULT_SCALE_TYPE;
        this.mPlaceholderImageScaleType = scaleType;
        this.mRetryImage = null;
        this.mRetryImageScaleType = scaleType;
        this.mFailureImage = null;
        this.mFailureImageScaleType = scaleType;
        this.mProgressBarImage = null;
        this.mProgressBarImageScaleType = scaleType;
        this.mActualImageScaleType = DEFAULT_ACTUAL_IMAGE_SCALE_TYPE;
        this.mActualImageMatrix = null;
        this.mActualImageFocusPoint = null;
        this.mActualImageColorFilter = null;
        this.mBackground = null;
        this.mOverlays = null;
        this.mPressedStateOverlay = null;
        this.mRoundingParams = null;
    }

    public static GenericDraweeHierarchyBuilder newInstance(Resources resources) {
        return new GenericDraweeHierarchyBuilder(resources);
    }

    private void validate() {
        List<Drawable> list = this.mOverlays;
        if (list != null) {
            for (Drawable drawable : list) {
                Preconditions.checkNotNull(drawable);
            }
        }
    }

    public GenericDraweeHierarchy build() {
        validate();
        return new GenericDraweeHierarchy(this);
    }

    @Nullable
    public ColorFilter getActualImageColorFilter() {
        return this.mActualImageColorFilter;
    }

    @Nullable
    public PointF getActualImageFocusPoint() {
        return this.mActualImageFocusPoint;
    }

    @Nullable
    public ScalingUtils.ScaleType getActualImageScaleType() {
        return this.mActualImageScaleType;
    }

    @Nullable
    public Drawable getBackground() {
        return this.mBackground;
    }

    public float getDesiredAspectRatio() {
        return this.mDesiredAspectRatio;
    }

    public int getFadeDuration() {
        return this.mFadeDuration;
    }

    @Nullable
    public Drawable getFailureImage() {
        return this.mFailureImage;
    }

    @Nullable
    public ScalingUtils.ScaleType getFailureImageScaleType() {
        return this.mFailureImageScaleType;
    }

    @Nullable
    public List<Drawable> getOverlays() {
        return this.mOverlays;
    }

    @Nullable
    public Drawable getPlaceholderImage() {
        return this.mPlaceholderImage;
    }

    @Nullable
    public ScalingUtils.ScaleType getPlaceholderImageScaleType() {
        return this.mPlaceholderImageScaleType;
    }

    @Nullable
    public Drawable getPressedStateOverlay() {
        return this.mPressedStateOverlay;
    }

    @Nullable
    public Drawable getProgressBarImage() {
        return this.mProgressBarImage;
    }

    @Nullable
    public ScalingUtils.ScaleType getProgressBarImageScaleType() {
        return this.mProgressBarImageScaleType;
    }

    public Resources getResources() {
        return this.mResources;
    }

    @Nullable
    public Drawable getRetryImage() {
        return this.mRetryImage;
    }

    @Nullable
    public ScalingUtils.ScaleType getRetryImageScaleType() {
        return this.mRetryImageScaleType;
    }

    @Nullable
    public RoundingParams getRoundingParams() {
        return this.mRoundingParams;
    }

    public GenericDraweeHierarchyBuilder reset() {
        init();
        return this;
    }

    public GenericDraweeHierarchyBuilder setActualImageColorFilter(@Nullable ColorFilter colorFilter) {
        this.mActualImageColorFilter = colorFilter;
        return this;
    }

    public GenericDraweeHierarchyBuilder setActualImageFocusPoint(@Nullable PointF focusPoint) {
        this.mActualImageFocusPoint = focusPoint;
        return this;
    }

    public GenericDraweeHierarchyBuilder setActualImageScaleType(@Nullable ScalingUtils.ScaleType actualImageScaleType) {
        this.mActualImageScaleType = actualImageScaleType;
        this.mActualImageMatrix = null;
        return this;
    }

    public GenericDraweeHierarchyBuilder setBackground(@Nullable Drawable background) {
        this.mBackground = background;
        return this;
    }

    public GenericDraweeHierarchyBuilder setDesiredAspectRatio(float desiredAspectRatio) {
        this.mDesiredAspectRatio = desiredAspectRatio;
        return this;
    }

    public GenericDraweeHierarchyBuilder setFadeDuration(int fadeDuration) {
        this.mFadeDuration = fadeDuration;
        return this;
    }

    public GenericDraweeHierarchyBuilder setFailureImage(@Nullable Drawable failureDrawable) {
        this.mFailureImage = failureDrawable;
        return this;
    }

    public GenericDraweeHierarchyBuilder setFailureImageScaleType(@Nullable ScalingUtils.ScaleType failureImageScaleType) {
        this.mFailureImageScaleType = failureImageScaleType;
        return this;
    }

    public GenericDraweeHierarchyBuilder setOverlay(@Nullable Drawable overlay) {
        if (overlay == null) {
            this.mOverlays = null;
        } else {
            this.mOverlays = Arrays.asList(overlay);
        }
        return this;
    }

    public GenericDraweeHierarchyBuilder setOverlays(@Nullable List<Drawable> overlays) {
        this.mOverlays = overlays;
        return this;
    }

    public GenericDraweeHierarchyBuilder setPlaceholderImage(@Nullable Drawable placeholderDrawable) {
        this.mPlaceholderImage = placeholderDrawable;
        return this;
    }

    public GenericDraweeHierarchyBuilder setPlaceholderImageScaleType(@Nullable ScalingUtils.ScaleType placeholderImageScaleType) {
        this.mPlaceholderImageScaleType = placeholderImageScaleType;
        return this;
    }

    public GenericDraweeHierarchyBuilder setPressedStateOverlay(@Nullable Drawable drawable) {
        if (drawable == null) {
            this.mPressedStateOverlay = null;
        } else {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{16842919}, drawable);
            this.mPressedStateOverlay = stateListDrawable;
        }
        return this;
    }

    public GenericDraweeHierarchyBuilder setProgressBarImage(@Nullable Drawable progressBarDrawable) {
        this.mProgressBarImage = progressBarDrawable;
        return this;
    }

    public GenericDraweeHierarchyBuilder setProgressBarImageScaleType(@Nullable ScalingUtils.ScaleType progressBarImageScaleType) {
        this.mProgressBarImageScaleType = progressBarImageScaleType;
        return this;
    }

    public GenericDraweeHierarchyBuilder setRetryImage(@Nullable Drawable retryDrawable) {
        this.mRetryImage = retryDrawable;
        return this;
    }

    public GenericDraweeHierarchyBuilder setRetryImageScaleType(@Nullable ScalingUtils.ScaleType retryImageScaleType) {
        this.mRetryImageScaleType = retryImageScaleType;
        return this;
    }

    public GenericDraweeHierarchyBuilder setRoundingParams(@Nullable RoundingParams roundingParams) {
        this.mRoundingParams = roundingParams;
        return this;
    }

    public GenericDraweeHierarchyBuilder setFailureImage(int resourceId) {
        this.mFailureImage = this.mResources.getDrawable(resourceId);
        return this;
    }

    public GenericDraweeHierarchyBuilder setPlaceholderImage(int resourceId) {
        this.mPlaceholderImage = this.mResources.getDrawable(resourceId);
        return this;
    }

    public GenericDraweeHierarchyBuilder setProgressBarImage(int resourceId) {
        this.mProgressBarImage = this.mResources.getDrawable(resourceId);
        return this;
    }

    public GenericDraweeHierarchyBuilder setRetryImage(int resourceId) {
        this.mRetryImage = this.mResources.getDrawable(resourceId);
        return this;
    }

    public GenericDraweeHierarchyBuilder setFailureImage(Drawable failureDrawable, @Nullable ScalingUtils.ScaleType failureImageScaleType) {
        this.mFailureImage = failureDrawable;
        this.mFailureImageScaleType = failureImageScaleType;
        return this;
    }

    public GenericDraweeHierarchyBuilder setPlaceholderImage(Drawable placeholderDrawable, @Nullable ScalingUtils.ScaleType placeholderImageScaleType) {
        this.mPlaceholderImage = placeholderDrawable;
        this.mPlaceholderImageScaleType = placeholderImageScaleType;
        return this;
    }

    public GenericDraweeHierarchyBuilder setProgressBarImage(Drawable progressBarDrawable, @Nullable ScalingUtils.ScaleType progressBarImageScaleType) {
        this.mProgressBarImage = progressBarDrawable;
        this.mProgressBarImageScaleType = progressBarImageScaleType;
        return this;
    }

    public GenericDraweeHierarchyBuilder setRetryImage(Drawable retryDrawable, @Nullable ScalingUtils.ScaleType retryImageScaleType) {
        this.mRetryImage = retryDrawable;
        this.mRetryImageScaleType = retryImageScaleType;
        return this;
    }

    public GenericDraweeHierarchyBuilder setFailureImage(int resourceId, @Nullable ScalingUtils.ScaleType failureImageScaleType) {
        this.mFailureImage = this.mResources.getDrawable(resourceId);
        this.mFailureImageScaleType = failureImageScaleType;
        return this;
    }

    public GenericDraweeHierarchyBuilder setPlaceholderImage(int resourceId, @Nullable ScalingUtils.ScaleType placeholderImageScaleType) {
        this.mPlaceholderImage = this.mResources.getDrawable(resourceId);
        this.mPlaceholderImageScaleType = placeholderImageScaleType;
        return this;
    }

    public GenericDraweeHierarchyBuilder setProgressBarImage(int resourceId, @Nullable ScalingUtils.ScaleType progressBarImageScaleType) {
        this.mProgressBarImage = this.mResources.getDrawable(resourceId);
        this.mProgressBarImageScaleType = progressBarImageScaleType;
        return this;
    }

    public GenericDraweeHierarchyBuilder setRetryImage(int resourceId, @Nullable ScalingUtils.ScaleType retryImageScaleType) {
        this.mRetryImage = this.mResources.getDrawable(resourceId);
        this.mRetryImageScaleType = retryImageScaleType;
        return this;
    }
}
