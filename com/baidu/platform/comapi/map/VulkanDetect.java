package com.baidu.platform.comapi.map;

import android.view.Surface;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class VulkanDetect {
    public static native long getNativeWindow(Surface surface);

    public static native boolean isSupportedVulkan();

    public static native void releaseNativeWindow(long j2);
}
