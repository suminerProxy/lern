package com.tencent.liteav.base;

import com.tencent.liteav.base.annotations.JNINamespace;

@JNINamespace("base::android")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class PathService {
    public static final int DIR_MODULE = 3;

    private PathService() {
    }

    private static native void nativeOverride(int i2, String str);

    public static void override(int i2, String str) {
    }
}
