package com.tencent.thumbplayer.core.utils;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TPThreadPool {
    private static final int CORE_POOL_SIZE = 1;
    private static final int MAX_POOL_SIZE = 20;
    private static final String PRE_THREAD_NAME = "TPCoreHdr";
    private static final String SHARE_THREAD_NAME = "TPCore-ShareThread";
    private static final String TAG = "TPCore[TPThreadPool]";
    private static volatile ExecutorService sCustomExecutor;
    private static volatile HandlerThread sHandlerThread;
    private static volatile TPThreadPool sInstance;
    private static volatile Handler sMainThreadHandler;
    private static volatile ScheduledExecutorService sScheduler;
    private static volatile ExecutorService sShareSingleExecutor;
    private static int sShareThreadCount;

    private TPThreadPool() {
    }

    public static TPThreadPool getInstance() {
    }

    private static void initHandlerThread() {
    }

    private static void initMainThreadHandler() {
    }

    public HandlerThread obtainHandleThread(String str) {
    }

    public HandlerThread obtainHandleThread(String str, int i2) {
    }

    public ScheduledExecutorService obtainScheduledExecutorService() {
    }

    public HandlerThread obtainShareThread() {
    }

    public ExecutorService obtainSingleThreadExecutor() {
    }

    public ExecutorService obtainThreadExecutor() {
    }

    public void postDelayRunnableOnMainThread(Runnable runnable, long j2) {
    }

    public void postRunnableOnMainThread(Runnable runnable) {
    }

    public void postRunnableOnMainThreadFront(Runnable runnable) {
    }

    public void recycle(HandlerThread handlerThread, Handler handler) {
    }
}
