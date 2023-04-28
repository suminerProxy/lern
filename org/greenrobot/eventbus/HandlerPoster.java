package org.greenrobot.eventbus;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class HandlerPoster extends Handler implements Poster {
    private final EventBus eventBus;
    private boolean handlerActive;
    private final int maxMillisInsideHandleMessage;
    private final PendingPostQueue queue;

    public HandlerPoster(EventBus eventBus, Looper looper, int i2) {
    }

    @Override // org.greenrobot.eventbus.Poster
    public void enqueue(Subscription subscription, Object obj) {
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
    }
}
