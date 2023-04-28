package com.facebook.drawee.drawable;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ScalingUtils {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static abstract class AbstractScaleType implements ScaleType {
        @Override // com.facebook.drawee.drawable.ScalingUtils.ScaleType
        public Matrix getTransform(Matrix outTransform, Rect parentRect, int childWidth, int childHeight, float focusX, float focusY) {
        }

        public abstract void getTransformImpl(Matrix outTransform, Rect parentRect, int childWidth, int childHeight, float focusX, float focusY, float scaleX, float scaleY);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface ScaleType {
        public static final ScaleType CENTER = null;
        public static final ScaleType CENTER_CROP = null;
        public static final ScaleType CENTER_INSIDE = null;
        public static final ScaleType FIT_BOTTOM_START = null;
        public static final ScaleType FIT_CENTER = null;
        public static final ScaleType FIT_END = null;
        public static final ScaleType FIT_START = null;
        public static final ScaleType FIT_X = null;
        public static final ScaleType FIT_XY = null;
        public static final ScaleType FIT_Y = null;
        public static final ScaleType FOCUS_CROP = null;

        Matrix getTransform(Matrix outTransform, Rect parentBounds, int childWidth, int childHeight, float focusX, float focusY);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class ScaleTypeCenter extends AbstractScaleType {
        public static final ScaleType INSTANCE = null;

        private ScaleTypeCenter() {
        }

        @Override // com.facebook.drawee.drawable.ScalingUtils.AbstractScaleType
        public void getTransformImpl(Matrix outTransform, Rect parentRect, int childWidth, int childHeight, float focusX, float focusY, float scaleX, float scaleY) {
        }

        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class ScaleTypeCenterCrop extends AbstractScaleType {
        public static final ScaleType INSTANCE = null;

        private ScaleTypeCenterCrop() {
        }

        @Override // com.facebook.drawee.drawable.ScalingUtils.AbstractScaleType
        public void getTransformImpl(Matrix outTransform, Rect parentRect, int childWidth, int childHeight, float focusX, float focusY, float scaleX, float scaleY) {
        }

        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class ScaleTypeCenterInside extends AbstractScaleType {
        public static final ScaleType INSTANCE = null;

        private ScaleTypeCenterInside() {
        }

        @Override // com.facebook.drawee.drawable.ScalingUtils.AbstractScaleType
        public void getTransformImpl(Matrix outTransform, Rect parentRect, int childWidth, int childHeight, float focusX, float focusY, float scaleX, float scaleY) {
        }

        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class ScaleTypeFitBottomStart extends AbstractScaleType {
        public static final ScaleType INSTANCE = null;

        private ScaleTypeFitBottomStart() {
        }

        @Override // com.facebook.drawee.drawable.ScalingUtils.AbstractScaleType
        public void getTransformImpl(Matrix outTransform, Rect parentRect, int childWidth, int childHeight, float focusX, float focusY, float scaleX, float scaleY) {
        }

        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class ScaleTypeFitCenter extends AbstractScaleType {
        public static final ScaleType INSTANCE = null;

        private ScaleTypeFitCenter() {
        }

        @Override // com.facebook.drawee.drawable.ScalingUtils.AbstractScaleType
        public void getTransformImpl(Matrix outTransform, Rect parentRect, int childWidth, int childHeight, float focusX, float focusY, float scaleX, float scaleY) {
        }

        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class ScaleTypeFitEnd extends AbstractScaleType {
        public static final ScaleType INSTANCE = null;

        private ScaleTypeFitEnd() {
        }

        @Override // com.facebook.drawee.drawable.ScalingUtils.AbstractScaleType
        public void getTransformImpl(Matrix outTransform, Rect parentRect, int childWidth, int childHeight, float focusX, float focusY, float scaleX, float scaleY) {
        }

        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class ScaleTypeFitStart extends AbstractScaleType {
        public static final ScaleType INSTANCE = null;

        private ScaleTypeFitStart() {
        }

        @Override // com.facebook.drawee.drawable.ScalingUtils.AbstractScaleType
        public void getTransformImpl(Matrix outTransform, Rect parentRect, int childWidth, int childHeight, float focusX, float focusY, float scaleX, float scaleY) {
        }

        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class ScaleTypeFitX extends AbstractScaleType {
        public static final ScaleType INSTANCE = null;

        private ScaleTypeFitX() {
        }

        @Override // com.facebook.drawee.drawable.ScalingUtils.AbstractScaleType
        public void getTransformImpl(Matrix outTransform, Rect parentRect, int childWidth, int childHeight, float focusX, float focusY, float scaleX, float scaleY) {
        }

        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class ScaleTypeFitXY extends AbstractScaleType {
        public static final ScaleType INSTANCE = null;

        private ScaleTypeFitXY() {
        }

        @Override // com.facebook.drawee.drawable.ScalingUtils.AbstractScaleType
        public void getTransformImpl(Matrix outTransform, Rect parentRect, int childWidth, int childHeight, float focusX, float focusY, float scaleX, float scaleY) {
        }

        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class ScaleTypeFitY extends AbstractScaleType {
        public static final ScaleType INSTANCE = null;

        private ScaleTypeFitY() {
        }

        @Override // com.facebook.drawee.drawable.ScalingUtils.AbstractScaleType
        public void getTransformImpl(Matrix outTransform, Rect parentRect, int childWidth, int childHeight, float focusX, float focusY, float scaleX, float scaleY) {
        }

        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class ScaleTypeFocusCrop extends AbstractScaleType {
        public static final ScaleType INSTANCE = null;

        private ScaleTypeFocusCrop() {
        }

        @Override // com.facebook.drawee.drawable.ScalingUtils.AbstractScaleType
        public void getTransformImpl(Matrix outTransform, Rect parentRect, int childWidth, int childHeight, float focusX, float focusY, float scaleX, float scaleY) {
        }

        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface StatefulScaleType {
        Object getState();
    }

    @Nullable
    public static ScaleTypeDrawable getActiveScaleTypeDrawable(@Nullable Drawable drawable) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class InterpolatingScaleType implements ScaleType, StatefulScaleType {
        @Nullable
        private final Rect mBoundsFrom;
        @Nullable
        private final Rect mBoundsTo;
        @Nullable
        private final PointF mFocusPointFrom;
        @Nullable
        private final PointF mFocusPointTo;
        private float mInterpolatingValue;
        private final float[] mMatrixValuesFrom;
        private final float[] mMatrixValuesInterpolated;
        private final float[] mMatrixValuesTo;
        private final ScaleType mScaleTypeFrom;
        private final ScaleType mScaleTypeTo;

        public InterpolatingScaleType(ScaleType scaleTypeFrom, ScaleType scaleTypeTo, @Nullable Rect boundsFrom, @Nullable Rect boundsTo, @Nullable PointF focusPointFrom, @Nullable PointF focusPointTo) {
        }

        @Nullable
        public Rect getBoundsFrom() {
        }

        @Nullable
        public Rect getBoundsTo() {
        }

        @Nullable
        public PointF getFocusPointFrom() {
        }

        @Nullable
        public PointF getFocusPointTo() {
        }

        public ScaleType getScaleTypeFrom() {
        }

        public ScaleType getScaleTypeTo() {
        }

        @Override // com.facebook.drawee.drawable.ScalingUtils.StatefulScaleType
        public Object getState() {
        }

        @Override // com.facebook.drawee.drawable.ScalingUtils.ScaleType
        public Matrix getTransform(Matrix transform, Rect parentBounds, int childWidth, int childHeight, float focusX, float focusY) {
        }

        public float getValue() {
        }

        public void setValue(float value) {
        }

        public String toString() {
        }

        public InterpolatingScaleType(ScaleType scaleTypeFrom, ScaleType scaleTypeTo, @Nullable Rect boundsFrom, @Nullable Rect boundsTo) {
        }

        public InterpolatingScaleType(ScaleType scaleTypeFrom, ScaleType scaleTypeTo) {
        }
    }
}
