package com.tencent.ugc;

import com.tencent.liteav.base.annotations.JNINamespace;

@JNINamespace("liteav::ugc")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class UGCInitializer {
    private static final String TAG = "UGCInitializer";
    private static com.tencent.liteav.base.util.b sInitializerHandler;
    private static int sRefCount;

    public static /* synthetic */ void access$lambda$0() {
    }

    public static /* synthetic */ void access$lambda$1() {
    }

    public static synchronized void initialize() {
    }

    private static native void nativeInitialize();

    private static native void nativeUninitialize();

    private static boolean runAndWaitDownOnInitialThread(Runnable runnable) {
    }

    public static synchronized void uninitialize() {
    }
}
