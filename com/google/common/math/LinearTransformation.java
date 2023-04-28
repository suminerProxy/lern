package com.google.common.math;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.concurrent.LazyInit;

@Beta
@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class LinearTransformation {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class LinearTransformationBuilder {
        private final double x1;
        private final double y1;

        public /* synthetic */ LinearTransformationBuilder(double d2, double d3, AnonymousClass1 anonymousClass1) {
        }

        public LinearTransformation and(double d2, double d3) {
        }

        public LinearTransformation withSlope(double d2) {
        }

        private LinearTransformationBuilder(double d2, double d3) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class NaNLinearTransformation extends LinearTransformation {
        public static final NaNLinearTransformation INSTANCE = null;

        private NaNLinearTransformation() {
        }

        @Override // com.google.common.math.LinearTransformation
        public LinearTransformation inverse() {
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isHorizontal() {
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isVertical() {
        }

        @Override // com.google.common.math.LinearTransformation
        public double slope() {
        }

        public String toString() {
        }

        @Override // com.google.common.math.LinearTransformation
        public double transform(double d2) {
        }
    }

    public static LinearTransformation forNaN() {
    }

    public static LinearTransformation horizontal(double d2) {
    }

    public static LinearTransformationBuilder mapping(double d2, double d3) {
    }

    public static LinearTransformation vertical(double d2) {
    }

    public abstract LinearTransformation inverse();

    public abstract boolean isHorizontal();

    public abstract boolean isVertical();

    public abstract double slope();

    public abstract double transform(double d2);

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class VerticalLinearTransformation extends LinearTransformation {
        @LazyInit
        public LinearTransformation inverse;
        public final double x;

        public VerticalLinearTransformation(double d2) {
        }

        private LinearTransformation createInverse() {
        }

        @Override // com.google.common.math.LinearTransformation
        public LinearTransformation inverse() {
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isHorizontal() {
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isVertical() {
        }

        @Override // com.google.common.math.LinearTransformation
        public double slope() {
        }

        public String toString() {
        }

        @Override // com.google.common.math.LinearTransformation
        public double transform(double d2) {
        }

        public VerticalLinearTransformation(double d2, LinearTransformation linearTransformation) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class RegularLinearTransformation extends LinearTransformation {
        @LazyInit
        public LinearTransformation inverse;
        public final double slope;
        public final double yIntercept;

        public RegularLinearTransformation(double d2, double d3) {
        }

        private LinearTransformation createInverse() {
        }

        @Override // com.google.common.math.LinearTransformation
        public LinearTransformation inverse() {
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isHorizontal() {
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isVertical() {
        }

        @Override // com.google.common.math.LinearTransformation
        public double slope() {
        }

        public String toString() {
        }

        @Override // com.google.common.math.LinearTransformation
        public double transform(double d2) {
        }

        public RegularLinearTransformation(double d2, double d3, LinearTransformation linearTransformation) {
        }
    }
}
