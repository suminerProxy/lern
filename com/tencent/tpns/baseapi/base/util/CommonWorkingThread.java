package com.tencent.tpns.baseapi.base.util;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import java.lang.Thread;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class CommonWorkingThread {

    /* renamed from: a  reason: collision with root package name */
    private static HandlerThread f13664a;
    private static Handler b;

    /* compiled from: ProGuard */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class CommonWorkingThreadHolder {
        public static CommonWorkingThread instance = new CommonWorkingThread();
    }

    private static void a() {
        try {
            HandlerThread handlerThread = f13664a;
            if (handlerThread == null || !handlerThread.isAlive() || f13664a.isInterrupted() || f13664a.getState() == Thread.State.TERMINATED) {
                HandlerThread handlerThread2 = new HandlerThread("tpns.baseapi.thread");
                f13664a = handlerThread2;
                handlerThread2.start();
                Looper looper = f13664a.getLooper();
                if (looper != null) {
                    b = new Handler(looper);
                } else {
                    Logger.e("CommonWorkingThread", ">>> Create new working thread false, cause thread.getLooper()==null");
                }
            }
        } catch (Throwable th) {
            Logger.e("CommonWorkingThread", "unexpected for initHandler", th);
        }
    }

    public static CommonWorkingThread getInstance() {
        a();
        return CommonWorkingThreadHolder.instance;
    }

    public boolean execute(TTask tTask) {
        Handler handler = b;
        if (handler != null) {
            return handler.post(tTask);
        }
        return false;
    }

    public boolean executeAtTime(TTask tTask, int i2, long j2) {
        Handler handler = b;
        if (handler != null) {
            return handler.postAtTime(tTask, Integer.valueOf(i2), SystemClock.uptimeMillis() + j2);
        }
        return false;
    }

    public Handler getHandler() {
        return b;
    }

    public void remove(int i2) {
        Handler handler = b;
        if (handler != null) {
            handler.removeCallbacksAndMessages(Integer.valueOf(i2));
        }
    }

    private CommonWorkingThread() {
    }

    public boolean execute(TTask tTask, long j2) {
        Handler handler = b;
        if (handler != null) {
            return handler.postDelayed(tTask, j2);
        }
        return false;
    }

    public void remove(TTask tTask) {
        Handler handler = b;
        if (handler != null) {
            handler.removeCallbacks(tTask);
        }
    }
}
