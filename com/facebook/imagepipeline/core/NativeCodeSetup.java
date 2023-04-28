package com.facebook.imagepipeline.core;

import com.facebook.infer.annotation.Nullsafe;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class NativeCodeSetup {
    private static boolean sUseNativeCode = true;

    private NativeCodeSetup() {
    }

    public static boolean getUseNativeCode() {
        return sUseNativeCode;
    }

    public static void setUseNativeCode(boolean useNativeCode) {
        sUseNativeCode = useNativeCode;
    }
}
