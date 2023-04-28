package com.tencent.liteav.base;

import androidx.annotation.UiThread;
import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.annotations.MainDex;
import java.lang.Thread;

@JNINamespace("base::android")
@MainDex
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class JavaExceptionReporter implements Thread.UncaughtExceptionHandler {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private final boolean mCrashAfterReport;
    private boolean mHandlingException;
    private final Thread.UncaughtExceptionHandler mParent;

    private JavaExceptionReporter(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, boolean z) {
    }

    @CalledByNative
    private static void installHandler(boolean z) {
    }

    @UiThread
    public static void reportStackTrace(String str) {
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
    }
}
