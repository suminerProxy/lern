package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class CutoutDrawable extends MaterialShapeDrawable {
    @NonNull
    private final RectF cutoutBounds;
    @NonNull
    private final Paint cutoutPaint;
    private int savedLayer;

    public CutoutDrawable() {
    }

    private void postDraw(@NonNull Canvas canvas) {
    }

    private void preDraw(@NonNull Canvas canvas) {
    }

    private void saveCanvasLayer(@NonNull Canvas canvas) {
    }

    private void setPaintStyles() {
    }

    private boolean useHardwareLayer(Drawable.Callback callback) {
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
    }

    public boolean hasCutout() {
    }

    public void removeCutout() {
    }

    public void setCutout(float f2, float f3, float f4, float f5) {
    }

    public CutoutDrawable(@Nullable ShapeAppearanceModel shapeAppearanceModel) {
    }

    public void setCutout(@NonNull RectF rectF) {
    }
}
