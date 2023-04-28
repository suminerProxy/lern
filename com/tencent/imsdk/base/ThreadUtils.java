package com.tencent.imsdk.base;

import android.os.Handler;
import android.os.Looper;
import com.tencent.imsdk.base.annotations.CalledByNative;
import com.tencent.imsdk.base.annotations.VisibleForTesting;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ThreadUtils {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Object sLock = null;
    private static boolean sThreadAssertsDisabled;
    private static Handler sUiThreadHandler;
    private static boolean sWillOverride;

    public static void assertOnBackgroundThread() {
    }

    public static void assertOnUiThread() {
    }

    public static void checkUiThread() {
    }

    public static Handler getUiThreadHandler() {
    }

    public static Looper getUiThreadLooper() {
    }

    @CalledByNative
    private static boolean isThreadPriorityAudio(int i2) {
    }

    @Deprecated
    public static <T> FutureTask<T> postOnUiThread(FutureTask<T> futureTask) {
    }

    @VisibleForTesting
    @Deprecated
    public static void postOnUiThreadDelayed(Runnable runnable, long j2) {
    }

    @Deprecated
    public static <T> FutureTask<T> runOnUiThread(FutureTask<T> futureTask) {
    }

    @Deprecated
    public static void runOnUiThreadBlocking(Runnable runnable) {
    }

    @VisibleForTesting
    @Deprecated
    public static <T> T runOnUiThreadBlockingNoException(Callable<T> callable) {
    }

    public static boolean runningOnUiThread() {
    }

    public static void setThreadAssertsDisabledForTesting(boolean z) {
    }

    @CalledByNative
    public static void setThreadPriorityAudio(int i2) {
    }

    public static void setUiThread(Looper looper) {
    }

    public static void setWillOverrideUiThread(boolean z) {
    }

    @Deprecated
    public static void postOnUiThread(Runnable runnable) {
    }

    @Deprecated
    public static <T> FutureTask<T> runOnUiThread(Callable<T> callable) {
    }

    @Deprecated
    public static void runOnUiThread(Runnable runnable) {
    }

    @Deprecated
    public static <T> T runOnUiThreadBlocking(Callable<T> callable) throws ExecutionException {
    }
}
