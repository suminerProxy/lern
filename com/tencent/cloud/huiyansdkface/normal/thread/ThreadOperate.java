package com.tencent.cloud.huiyansdkface.normal.thread;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ThreadOperate {
    private static ExecutorService mExecutorService;
    private static Handler mHandler;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface UiThreadCallback<T> {
        void callback(T t);
    }

    public static /* synthetic */ Handler access$000() {
    }

    public static boolean isMainThread() {
    }

    public static <T> Future<T> runOnSubThread(Callable<T> callable) {
    }

    public static void runOnSubThread(Runnable runnable) {
    }

    public static <T> void runOnSubThread(Callable<T> callable, UiThreadCallback<T> uiThreadCallback) {
    }

    public static void runOnUiThread(Runnable runnable) {
    }

    public static void runOnUiThreadDelay(Runnable runnable, long j2) {
    }
}
