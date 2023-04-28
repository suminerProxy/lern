package com.facebook.imagepipeline.nativecode;

import android.content.Context;
import com.facebook.common.internal.DoNotStrip;
import com.facebook.infer.annotation.Nullsafe;
import com.facebook.soloader.SoLoader;
import java.io.IOException;

@DoNotStrip
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class NativeCodeInitializer {
    @DoNotStrip
    public static void init(Context context) throws IOException {
        SoLoader.init(context, 0);
    }
}
