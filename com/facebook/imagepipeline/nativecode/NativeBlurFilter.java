package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import com.facebook.common.internal.DoNotStrip;
import com.facebook.infer.annotation.Nullsafe;

@DoNotStrip
@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class NativeBlurFilter {
    public static void iterativeBoxBlur(Bitmap bitmap, int iterations, int blurRadius) {
    }

    @DoNotStrip
    private static native void nativeIterativeBoxBlur(Bitmap bitmap, int iterations, int blurRadius);
}
