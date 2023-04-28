package com.tencent.qcloud.tuicore.component;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class RoundCornerImageView extends AppCompatImageView {
    private final PaintFlagsDrawFilter aliasFilter;
    private int leftBottomRadius;
    private int leftTopRadius;
    private final Path path;
    private int radius;
    private final RectF rectF;
    private int rightBottomRadius;
    private int rightTopRadius;

    public RoundCornerImageView(@NonNull Context context) {
    }

    private void init(Context context, AttributeSet attributeSet) {
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
    }

    public RoundCornerImageView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public RoundCornerImageView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
