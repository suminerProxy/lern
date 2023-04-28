package com.sobot.network.http.task;

import android.os.Handler;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class XExecutor extends ThreadPoolExecutor {
    private List<OnAllTaskEndListener> allTaskEndListenerList;
    private Handler innerHandler;
    private List<OnTaskEndListener> taskEndListenerList;

    /* renamed from: com.sobot.network.http.task.XExecutor$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ XExecutor this$0;
        public final /* synthetic */ OnTaskEndListener val$listener;
        public final /* synthetic */ Runnable val$r;

        public AnonymousClass1(XExecutor xExecutor, OnTaskEndListener onTaskEndListener, Runnable runnable) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.sobot.network.http.task.XExecutor$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 implements Runnable {
        public final /* synthetic */ XExecutor this$0;
        public final /* synthetic */ OnAllTaskEndListener val$listener;

        public AnonymousClass2(XExecutor xExecutor, OnAllTaskEndListener onAllTaskEndListener) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface OnAllTaskEndListener {
        void onAllTaskEnd();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface OnTaskEndListener {
        void onTaskEnd(Runnable runnable);
    }

    public XExecutor(int i2, int i3, long j2, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, RejectedExecutionHandler rejectedExecutionHandler) {
    }

    public void addOnAllTaskEndListener(OnAllTaskEndListener onAllTaskEndListener) {
    }

    public void addOnTaskEndListener(OnTaskEndListener onTaskEndListener) {
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th) {
    }

    public void removeOnAllTaskEndListener(OnAllTaskEndListener onAllTaskEndListener) {
    }

    public void removeOnTaskEndListener(OnTaskEndListener onTaskEndListener) {
    }

    public XExecutor(int i2, int i3, long j2, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
    }

    public XExecutor(int i2, int i3, long j2, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
    }

    public XExecutor(int i2, int i3, long j2, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue) {
    }
}
