package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface DrawingContent extends Content {
    void draw(Canvas canvas, Matrix matrix, int i2);

    void getBounds(RectF rectF, Matrix matrix, boolean z);
}
