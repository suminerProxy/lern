package com.tencent.qcloud.tuikit.tuichat.component.camera.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TypeButton extends View {
    public static final int TYPE_CANCEL = 1;
    public static final int TYPE_CONFIRM = 2;
    private float button_radius;
    private int button_size;
    private int button_type;
    private float center_X;
    private float center_Y;
    private float index;
    private Paint mPaint;
    private Path path;
    private RectF rectF;
    private float strokeWidth;

    public TypeButton(Context context) {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
    }

    public TypeButton(Context context, int i2, int i3) {
    }
}
