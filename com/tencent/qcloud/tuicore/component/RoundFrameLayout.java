package com.tencent.qcloud.tuicore.component;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class RoundFrameLayout extends FrameLayout {
    private final PaintFlagsDrawFilter aliasFilter;
    private int leftBottomRadius;
    private int leftTopRadius;
    private final Path path;
    private int radius;
    private final RectF rectF;
    private int rightBottomRadius;
    private int rightTopRadius;

    public RoundFrameLayout(@NonNull Context context) {
    }

    private void init(Context context, AttributeSet attributeSet) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    public RoundFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public RoundFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
