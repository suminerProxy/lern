package com.google.android.material.transition.platform;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.RequiresApi;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;
import com.google.android.material.transition.platform.MaterialContainerTransform;

@RequiresApi(21)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class MaskEvaluator {
    private ShapeAppearanceModel currentShapeAppearanceModel;
    private final Path endPath;
    private final Path path;
    private final ShapeAppearancePathProvider pathProvider;
    private final Path startPath;

    public void clip(Canvas canvas) {
    }

    public void evaluate(float f2, ShapeAppearanceModel shapeAppearanceModel, ShapeAppearanceModel shapeAppearanceModel2, RectF rectF, RectF rectF2, RectF rectF3, MaterialContainerTransform.ProgressThresholds progressThresholds) {
    }

    public ShapeAppearanceModel getCurrentShapeAppearanceModel() {
    }

    public Path getPath() {
    }
}
