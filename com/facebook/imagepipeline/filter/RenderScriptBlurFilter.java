package com.facebook.imagepipeline.filter;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.RequiresApi;
import com.facebook.infer.annotation.Nullsafe;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class RenderScriptBlurFilter {
    public static final int BLUR_MAX_RADIUS = 25;

    @RequiresApi(17)
    public static void blurBitmap(final Bitmap dest, final Bitmap src, final Context context, final int radius) {
    }

    public static boolean canUseRenderScript() {
    }
}
