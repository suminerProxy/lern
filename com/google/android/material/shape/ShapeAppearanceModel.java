package com.google.android.material.shape;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class ShapeAppearanceModel {
    public static final CornerSize PILL = null;
    public EdgeTreatment bottomEdge;
    public CornerTreatment bottomLeftCorner;
    public CornerSize bottomLeftCornerSize;
    public CornerTreatment bottomRightCorner;
    public CornerSize bottomRightCornerSize;
    public EdgeTreatment leftEdge;
    public EdgeTreatment rightEdge;
    public EdgeTreatment topEdge;
    public CornerTreatment topLeftCorner;
    public CornerSize topLeftCornerSize;
    public CornerTreatment topRightCorner;
    public CornerSize topRightCornerSize;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Builder {
        @NonNull
        private EdgeTreatment bottomEdge;
        @NonNull
        private CornerTreatment bottomLeftCorner;
        @NonNull
        private CornerSize bottomLeftCornerSize;
        @NonNull
        private CornerTreatment bottomRightCorner;
        @NonNull
        private CornerSize bottomRightCornerSize;
        @NonNull
        private EdgeTreatment leftEdge;
        @NonNull
        private EdgeTreatment rightEdge;
        @NonNull
        private EdgeTreatment topEdge;
        @NonNull
        private CornerTreatment topLeftCorner;
        @NonNull
        private CornerSize topLeftCornerSize;
        @NonNull
        private CornerTreatment topRightCorner;
        @NonNull
        private CornerSize topRightCornerSize;

        public Builder() {
        }

        public static /* synthetic */ CornerTreatment access$100(Builder builder) {
        }

        public static /* synthetic */ EdgeTreatment access$1000(Builder builder) {
        }

        public static /* synthetic */ EdgeTreatment access$1100(Builder builder) {
        }

        public static /* synthetic */ EdgeTreatment access$1200(Builder builder) {
        }

        public static /* synthetic */ CornerTreatment access$200(Builder builder) {
        }

        public static /* synthetic */ CornerTreatment access$300(Builder builder) {
        }

        public static /* synthetic */ CornerTreatment access$400(Builder builder) {
        }

        public static /* synthetic */ CornerSize access$500(Builder builder) {
        }

        public static /* synthetic */ CornerSize access$600(Builder builder) {
        }

        public static /* synthetic */ CornerSize access$700(Builder builder) {
        }

        public static /* synthetic */ CornerSize access$800(Builder builder) {
        }

        public static /* synthetic */ EdgeTreatment access$900(Builder builder) {
        }

        private static float compatCornerTreatmentSize(CornerTreatment cornerTreatment) {
        }

        @NonNull
        public ShapeAppearanceModel build() {
        }

        @NonNull
        public Builder setAllCornerSizes(@NonNull CornerSize cornerSize) {
        }

        @NonNull
        public Builder setAllCorners(int i2, @Dimension float f2) {
        }

        @NonNull
        public Builder setAllEdges(@NonNull EdgeTreatment edgeTreatment) {
        }

        @NonNull
        public Builder setBottomEdge(@NonNull EdgeTreatment edgeTreatment) {
        }

        @NonNull
        public Builder setBottomLeftCorner(int i2, @Dimension float f2) {
        }

        @NonNull
        public Builder setBottomLeftCornerSize(@Dimension float f2) {
        }

        @NonNull
        public Builder setBottomRightCorner(int i2, @Dimension float f2) {
        }

        @NonNull
        public Builder setBottomRightCornerSize(@Dimension float f2) {
        }

        @NonNull
        public Builder setLeftEdge(@NonNull EdgeTreatment edgeTreatment) {
        }

        @NonNull
        public Builder setRightEdge(@NonNull EdgeTreatment edgeTreatment) {
        }

        @NonNull
        public Builder setTopEdge(@NonNull EdgeTreatment edgeTreatment) {
        }

        @NonNull
        public Builder setTopLeftCorner(int i2, @Dimension float f2) {
        }

        @NonNull
        public Builder setTopLeftCornerSize(@Dimension float f2) {
        }

        @NonNull
        public Builder setTopRightCorner(int i2, @Dimension float f2) {
        }

        @NonNull
        public Builder setTopRightCornerSize(@Dimension float f2) {
        }

        @NonNull
        public Builder setBottomLeftCornerSize(@NonNull CornerSize cornerSize) {
        }

        @NonNull
        public Builder setBottomRightCornerSize(@NonNull CornerSize cornerSize) {
        }

        @NonNull
        public Builder setTopLeftCornerSize(@NonNull CornerSize cornerSize) {
        }

        @NonNull
        public Builder setTopRightCornerSize(@NonNull CornerSize cornerSize) {
        }

        @NonNull
        public Builder setAllCorners(@NonNull CornerTreatment cornerTreatment) {
        }

        @NonNull
        public Builder setBottomLeftCorner(int i2, @NonNull CornerSize cornerSize) {
        }

        @NonNull
        public Builder setBottomRightCorner(int i2, @NonNull CornerSize cornerSize) {
        }

        @NonNull
        public Builder setTopLeftCorner(int i2, @NonNull CornerSize cornerSize) {
        }

        @NonNull
        public Builder setTopRightCorner(int i2, @NonNull CornerSize cornerSize) {
        }

        @NonNull
        public Builder setAllCornerSizes(@Dimension float f2) {
        }

        @NonNull
        public Builder setBottomLeftCorner(@NonNull CornerTreatment cornerTreatment) {
        }

        @NonNull
        public Builder setBottomRightCorner(@NonNull CornerTreatment cornerTreatment) {
        }

        @NonNull
        public Builder setTopLeftCorner(@NonNull CornerTreatment cornerTreatment) {
        }

        @NonNull
        public Builder setTopRightCorner(@NonNull CornerTreatment cornerTreatment) {
        }

        public Builder(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface CornerSizeUnaryOperator {
        @NonNull
        CornerSize apply(@NonNull CornerSize cornerSize);
    }

    public /* synthetic */ ShapeAppearanceModel(Builder builder, AnonymousClass1 anonymousClass1) {
    }

    @NonNull
    public static Builder builder() {
    }

    @NonNull
    private static CornerSize getCornerSize(TypedArray typedArray, int i2, @NonNull CornerSize cornerSize) {
    }

    @NonNull
    public EdgeTreatment getBottomEdge() {
    }

    @NonNull
    public CornerTreatment getBottomLeftCorner() {
    }

    @NonNull
    public CornerSize getBottomLeftCornerSize() {
    }

    @NonNull
    public CornerTreatment getBottomRightCorner() {
    }

    @NonNull
    public CornerSize getBottomRightCornerSize() {
    }

    @NonNull
    public EdgeTreatment getLeftEdge() {
    }

    @NonNull
    public EdgeTreatment getRightEdge() {
    }

    @NonNull
    public EdgeTreatment getTopEdge() {
    }

    @NonNull
    public CornerTreatment getTopLeftCorner() {
    }

    @NonNull
    public CornerSize getTopLeftCornerSize() {
    }

    @NonNull
    public CornerTreatment getTopRightCorner() {
    }

    @NonNull
    public CornerSize getTopRightCornerSize() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isRoundRect(@NonNull RectF rectF) {
    }

    @NonNull
    public Builder toBuilder() {
    }

    @NonNull
    public ShapeAppearanceModel withCornerSize(float f2) {
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public ShapeAppearanceModel withTransformedCornerSizes(@NonNull CornerSizeUnaryOperator cornerSizeUnaryOperator) {
    }

    private ShapeAppearanceModel(@NonNull Builder builder) {
    }

    @NonNull
    public static Builder builder(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i2, @StyleRes int i3) {
    }

    @NonNull
    public ShapeAppearanceModel withCornerSize(@NonNull CornerSize cornerSize) {
    }

    @NonNull
    public static Builder builder(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i2, @StyleRes int i3, int i4) {
    }

    @NonNull
    public static Builder builder(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i2, @StyleRes int i3, @NonNull CornerSize cornerSize) {
    }

    @NonNull
    public static Builder builder(Context context, @StyleRes int i2, @StyleRes int i3) {
    }

    @NonNull
    private static Builder builder(Context context, @StyleRes int i2, @StyleRes int i3, int i4) {
    }

    @NonNull
    private static Builder builder(Context context, @StyleRes int i2, @StyleRes int i3, @NonNull CornerSize cornerSize) {
    }

    public ShapeAppearanceModel() {
    }
}
