package com.tencent.liteav.base.dispatcher;

import android.os.Handler;
import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;

@JNINamespace("liteav")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class PlatformDispatcherTask implements Runnable {
    private long mNativePlatformDispatcherTask;

    @CalledByNative
    public PlatformDispatcherTask(long j2) {
    }

    private void destroyTask() {
    }

    @CalledByNative
    public static Handler getMainHandler() {
    }

    private static native void nativeDestroyTask(long j2);

    private static native void nativeRunTask(long j2);

    public void finalize() throws Throwable {
    }

    @Override // java.lang.Runnable
    public void run() {
    }
}
