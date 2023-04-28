package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.google.android.material.shadow.ShadowRenderer;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class ShapePath {
    public static final float ANGLE_LEFT = 180.0f;
    private static final float ANGLE_UP = 270.0f;
    private boolean containsIncompatibleShadowOp;
    @Deprecated
    public float currentShadowAngle;
    @Deprecated
    public float endShadowAngle;
    @Deprecated
    public float endX;
    @Deprecated
    public float endY;
    private final List<PathOperation> operations;
    private final List<ShadowCompatOperation> shadowCompatOperations;
    @Deprecated
    public float startX;
    @Deprecated
    public float startY;

    /* renamed from: com.google.android.material.shape.ShapePath$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends ShadowCompatOperation {
        public final /* synthetic */ ShapePath this$0;
        public final /* synthetic */ List val$operations;
        public final /* synthetic */ Matrix val$transformCopy;

        public AnonymousClass1(ShapePath shapePath, List list, Matrix matrix) {
        }

        @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
        public void draw(Matrix matrix, ShadowRenderer shadowRenderer, int i2, Canvas canvas) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class ArcShadowOperation extends ShadowCompatOperation {
        private final PathArcOperation operation;

        public ArcShadowOperation(PathArcOperation pathArcOperation) {
        }

        @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
        public void draw(Matrix matrix, @NonNull ShadowRenderer shadowRenderer, int i2, @NonNull Canvas canvas) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class LineShadowOperation extends ShadowCompatOperation {
        private final PathLineOperation operation;
        private final float startX;
        private final float startY;

        public LineShadowOperation(PathLineOperation pathLineOperation, float f2, float f3) {
        }

        @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
        public void draw(Matrix matrix, @NonNull ShadowRenderer shadowRenderer, int i2, @NonNull Canvas canvas) {
        }

        public float getAngle() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class PathArcOperation extends PathOperation {
        private static final RectF rectF = null;
        @Deprecated
        public float bottom;
        @Deprecated
        public float left;
        @Deprecated
        public float right;
        @Deprecated
        public float startAngle;
        @Deprecated
        public float sweepAngle;
        @Deprecated

        /* renamed from: top  reason: collision with root package name */
        public float f3356top;

        public PathArcOperation(float f2, float f3, float f4, float f5) {
        }

        public static /* synthetic */ float access$1000(PathArcOperation pathArcOperation) {
        }

        public static /* synthetic */ float access$1100(PathArcOperation pathArcOperation) {
        }

        public static /* synthetic */ float access$1200(PathArcOperation pathArcOperation) {
        }

        public static /* synthetic */ float access$1300(PathArcOperation pathArcOperation) {
        }

        public static /* synthetic */ void access$600(PathArcOperation pathArcOperation, float f2) {
        }

        public static /* synthetic */ void access$700(PathArcOperation pathArcOperation, float f2) {
        }

        public static /* synthetic */ float access$800(PathArcOperation pathArcOperation) {
        }

        public static /* synthetic */ float access$900(PathArcOperation pathArcOperation) {
        }

        private float getBottom() {
        }

        private float getLeft() {
        }

        private float getRight() {
        }

        private float getStartAngle() {
        }

        private float getSweepAngle() {
        }

        private float getTop() {
        }

        private void setBottom(float f2) {
        }

        private void setLeft(float f2) {
        }

        private void setRight(float f2) {
        }

        private void setStartAngle(float f2) {
        }

        private void setSweepAngle(float f2) {
        }

        private void setTop(float f2) {
        }

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(@NonNull Matrix matrix, @NonNull Path path) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class PathCubicOperation extends PathOperation {
        private float controlX1;
        private float controlX2;
        private float controlY1;
        private float controlY2;
        private float endX;
        private float endY;

        public PathCubicOperation(float f2, float f3, float f4, float f5, float f6, float f7) {
        }

        private float getControlX1() {
        }

        private float getControlX2() {
        }

        private float getControlY1() {
        }

        private float getControlY2() {
        }

        private float getEndX() {
        }

        private float getEndY() {
        }

        private void setControlX1(float f2) {
        }

        private void setControlX2(float f2) {
        }

        private void setControlY1(float f2) {
        }

        private void setControlY2(float f2) {
        }

        private void setEndX(float f2) {
        }

        private void setEndY(float f2) {
        }

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(@NonNull Matrix matrix, @NonNull Path path) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class PathLineOperation extends PathOperation {
        private float x;
        private float y;

        public static /* synthetic */ float access$000(PathLineOperation pathLineOperation) {
        }

        public static /* synthetic */ float access$002(PathLineOperation pathLineOperation, float f2) {
        }

        public static /* synthetic */ float access$100(PathLineOperation pathLineOperation) {
        }

        public static /* synthetic */ float access$102(PathLineOperation pathLineOperation, float f2) {
        }

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(@NonNull Matrix matrix, @NonNull Path path) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class PathOperation {
        public final Matrix matrix;

        public abstract void applyToPath(Matrix matrix, Path path);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class PathQuadOperation extends PathOperation {
        @Deprecated
        public float controlX;
        @Deprecated
        public float controlY;
        @Deprecated
        public float endX;
        @Deprecated
        public float endY;

        public static /* synthetic */ void access$200(PathQuadOperation pathQuadOperation, float f2) {
        }

        public static /* synthetic */ void access$300(PathQuadOperation pathQuadOperation, float f2) {
        }

        public static /* synthetic */ void access$400(PathQuadOperation pathQuadOperation, float f2) {
        }

        public static /* synthetic */ void access$500(PathQuadOperation pathQuadOperation, float f2) {
        }

        private float getControlX() {
        }

        private float getControlY() {
        }

        private float getEndX() {
        }

        private float getEndY() {
        }

        private void setControlX(float f2) {
        }

        private void setControlY(float f2) {
        }

        private void setEndX(float f2) {
        }

        private void setEndY(float f2) {
        }

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(@NonNull Matrix matrix, @NonNull Path path) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class ShadowCompatOperation {
        public static final Matrix IDENTITY_MATRIX = null;

        public abstract void draw(Matrix matrix, ShadowRenderer shadowRenderer, int i2, Canvas canvas);

        public final void draw(ShadowRenderer shadowRenderer, int i2, Canvas canvas) {
        }
    }

    public ShapePath() {
    }

    private void addConnectingShadowIfNecessary(float f2) {
    }

    private void addShadowCompatOperation(ShadowCompatOperation shadowCompatOperation, float f2, float f3) {
    }

    private float getCurrentShadowAngle() {
    }

    private float getEndShadowAngle() {
    }

    private void setCurrentShadowAngle(float f2) {
    }

    private void setEndShadowAngle(float f2) {
    }

    private void setEndX(float f2) {
    }

    private void setEndY(float f2) {
    }

    private void setStartX(float f2) {
    }

    private void setStartY(float f2) {
    }

    public void addArc(float f2, float f3, float f4, float f5, float f6, float f7) {
    }

    public void applyToPath(Matrix matrix, Path path) {
    }

    public boolean containsIncompatibleShadowOp() {
    }

    @NonNull
    public ShadowCompatOperation createShadowCompatOperation(Matrix matrix) {
    }

    @RequiresApi(21)
    public void cubicToPoint(float f2, float f3, float f4, float f5, float f6, float f7) {
    }

    public float getEndX() {
    }

    public float getEndY() {
    }

    public float getStartX() {
    }

    public float getStartY() {
    }

    public void lineTo(float f2, float f3) {
    }

    @RequiresApi(21)
    public void quadToPoint(float f2, float f3, float f4, float f5) {
    }

    public void reset(float f2, float f3) {
    }

    public void reset(float f2, float f3, float f4, float f5) {
    }

    public ShapePath(float f2, float f3) {
    }
}
