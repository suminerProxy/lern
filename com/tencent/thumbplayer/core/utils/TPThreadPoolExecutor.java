package com.tencent.thumbplayer.core.utils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TPThreadPoolExecutor {
    private static final int QUEUE_CAPACITY = 20;
    private static final String TAG = "TPCore[TPThreadPoolExecutor]";
    private static final long THREAD_KEEP_ALIVE_TIME = 60;
    private static final String THREAD_POOL_NAME = "TP-Thread";

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class CustomRejectedExecutionHandler implements RejectedExecutionHandler {
        private CustomRejectedExecutionHandler() {
        }

        public /* synthetic */ CustomRejectedExecutionHandler(AnonymousClass1 anonymousClass1) {
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class CustomThreadFactory implements ThreadFactory {
        private AtomicInteger threadAtomicCount;

        private CustomThreadFactory() {
        }

        public /* synthetic */ CustomThreadFactory(AnonymousClass1 anonymousClass1) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
        }
    }

    public static ExecutorService newCustomThreadExecutor(int i2, int i3) {
    }
}
