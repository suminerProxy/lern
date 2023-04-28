package com.facebook.drawee.view;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class AspectRatioMeasure {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Spec {
        public int height;
        public int width;
    }

    private static boolean shouldAdjust(int layoutDimension) {
        return layoutDimension == 0 || layoutDimension == -2;
    }

    public static void updateMeasureSpec(Spec spec, float aspectRatio, @Nullable ViewGroup.LayoutParams layoutParams, int widthPadding, int heightPadding) {
        if (aspectRatio <= 0.0f || layoutParams == null) {
            return;
        }
        if (shouldAdjust(layoutParams.height)) {
            spec.height = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(spec.width) - widthPadding) / aspectRatio) + heightPadding), spec.height), 1073741824);
        } else if (shouldAdjust(layoutParams.width)) {
            spec.width = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(spec.height) - heightPadding) * aspectRatio) + widthPadding), spec.width), 1073741824);
        }
    }
}
