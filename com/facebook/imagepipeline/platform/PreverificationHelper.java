package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import com.facebook.infer.annotation.Nullsafe;
import com.facebook.soloader.DoNotOptimize;
import javax.annotation.Nullable;

@DoNotOptimize
@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class PreverificationHelper {
    @DoNotOptimize
    @TargetApi(26)
    public boolean shouldUseHardwareBitmapConfig(@Nullable Bitmap.Config config) {
        return config == Bitmap.Config.HARDWARE;
    }
}
