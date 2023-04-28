package com.google.android.exoplayer2.util;

import android.os.Looper;
import androidx.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface HandlerWrapper {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface Message {
        HandlerWrapper getTarget();

        void sendToTarget();
    }

    Looper getLooper();

    boolean hasMessages(int what);

    Message obtainMessage(int what);

    Message obtainMessage(int what, int arg1, int arg2);

    Message obtainMessage(int what, int arg1, int arg2, @Nullable Object obj);

    Message obtainMessage(int what, @Nullable Object obj);

    boolean post(Runnable runnable);

    boolean postAtFrontOfQueue(Runnable runnable);

    boolean postDelayed(Runnable runnable, long delayMs);

    void removeCallbacksAndMessages(@Nullable Object token);

    void removeMessages(int what);

    boolean sendEmptyMessage(int what);

    boolean sendEmptyMessageAtTime(int what, long uptimeMs);

    boolean sendEmptyMessageDelayed(int what, int delayMs);

    boolean sendMessageAtFrontOfQueue(Message message);
}
