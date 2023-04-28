package com.google.android.material.shape;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class ShapeAppearancePathProvider {
    private final Path boundsPath;
    private final Path cornerPath;
    private final ShapePath[] cornerPaths;
    private final Matrix[] cornerTransforms;
    private boolean edgeIntersectionCheckEnabled;
    private final Path edgePath;
    private final Matrix[] edgeTransforms;
    private final Path overlappedEdgePath;
    private final PointF pointF;
    private final float[] scratch;
    private final float[] scratch2;
    private final ShapePath shapePath;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class Lazy {
        public static final ShapeAppearancePathProvider INSTANCE = null;

        private Lazy() {
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface PathListener {
        void onCornerPathCreated(ShapePath shapePath, Matrix matrix, int i2);

        void onEdgePathCreated(ShapePath shapePath, Matrix matrix, int i2);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class ShapeAppearancePathSpec {
        @NonNull
        public final RectF bounds;
        public final float interpolation;
        @NonNull
        public final Path path;
        @Nullable
        public final PathListener pathListener;
        @NonNull
        public final ShapeAppearanceModel shapeAppearanceModel;

        public ShapeAppearancePathSpec(@NonNull ShapeAppearanceModel shapeAppearanceModel, float f2, RectF rectF, @Nullable PathListener pathListener, Path path) {
        }
    }

    private float angleOfEdge(int i2) {
    }

    private void appendCornerPath(@NonNull ShapeAppearancePathSpec shapeAppearancePathSpec, int i2) {
    }

    private void appendEdgePath(@NonNull ShapeAppearancePathSpec shapeAppearancePathSpec, int i2) {
    }

    private void getCoordinatesOfCorner(int i2, @NonNull RectF rectF, @NonNull PointF pointF) {
    }

    private CornerSize getCornerSizeForIndex(int i2, @NonNull ShapeAppearanceModel shapeAppearanceModel) {
    }

    private CornerTreatment getCornerTreatmentForIndex(int i2, @NonNull ShapeAppearanceModel shapeAppearanceModel) {
    }

    private float getEdgeCenterForIndex(@NonNull RectF rectF, int i2) {
    }

    private EdgeTreatment getEdgeTreatmentForIndex(int i2, @NonNull ShapeAppearanceModel shapeAppearanceModel) {
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @UiThread
    public static ShapeAppearancePathProvider getInstance() {
    }

    @RequiresApi(19)
    private boolean pathOverlapsCorner(Path path, int i2) {
    }

    private void setCornerPathAndTransform(@NonNull ShapeAppearancePathSpec shapeAppearancePathSpec, int i2) {
    }

    private void setEdgePathAndTransform(int i2) {
    }

    public void calculatePath(ShapeAppearanceModel shapeAppearanceModel, float f2, RectF rectF, @NonNull Path path) {
    }

    public void setEdgeIntersectionCheckEnable(boolean z) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void calculatePath(ShapeAppearanceModel shapeAppearanceModel, float f2, RectF rectF, PathListener pathListener, @NonNull Path path) {
    }
}
