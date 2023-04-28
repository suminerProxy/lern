package com.aliyun.identity.platform;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ThreadHandler {
    private Handler.Callback handlerCBInter;
    private HandlerThread mHandlerThread;
    private Handler threadHandler;
    private ThreadHandlerCallback userCBInner;

    /* renamed from: com.aliyun.identity.platform.ThreadHandler$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements Handler.Callback {
        public final /* synthetic */ ThreadHandler this$0;

        public AnonymousClass1(ThreadHandler threadHandler) {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface ThreadHandlerCallback {
        void onMessage(Message message);
    }

    public ThreadHandler(ThreadHandlerCallback threadHandlerCallback) {
    }

    public static /* synthetic */ ThreadHandlerCallback access$000(ThreadHandler threadHandler) {
    }

    private void init() {
    }

    public void release() {
    }

    public void removeMessages(int i2) {
    }

    public void sendEmptyMessage(int i2) {
    }

    public void sendMessage(Message message) {
    }
}
