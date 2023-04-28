package com.umeng.commonsdk.framework;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class UMWorkDispatch {
    public static final String GENERAL_CONTENT = "content";
    public static final String GENERAL_HEADER = "header";
    public static final String KEY_EXCEPTION = "exception";
    private static final int MSG_AUTO_PROCESS = 769;
    private static final int MSG_CHECKER_TIMER = 771;
    private static final int MSG_DELAY_PROCESS = 770;
    private static final int MSG_QUIT = 784;
    private static final int MSG_SEND_EVENT = 768;
    private static HandlerThread mNetTask;
    private static a mSender;
    private static Object mSenderInitLock;
    private static Handler mTaskHandler;

    /* renamed from: com.umeng.commonsdk.framework.UMWorkDispatch$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class AnonymousClass1 extends Handler {
        public AnonymousClass1(Looper looper) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    private UMWorkDispatch() {
    }

    public static void Quit() {
    }

    public static /* synthetic */ void access$000(Message message) {
    }

    public static /* synthetic */ void access$100() {
    }

    public static /* synthetic */ void access$200() {
    }

    private static void delayProcess() {
    }

    public static synchronized boolean eventHasExist(int i2) {
    }

    private static void handleEvent(Message message) {
    }

    private static void handleQuit() {
    }

    private static synchronized void init() {
    }

    public static void registerConnStateObserver(UMSenderStateNotify uMSenderStateNotify) {
    }

    public static synchronized void removeEvent() {
    }

    public static void sendDelayProcessMsg(long j2) {
    }

    public static void sendEvent(Context context, int i2, UMLogDataProtocol uMLogDataProtocol, Object obj) {
    }

    public static void sendEventEx(Context context, int i2, UMLogDataProtocol uMLogDataProtocol, Object obj, long j2) {
    }

    public static void sendEventInternal(Context context, int i2, int i3, UMLogDataProtocol uMLogDataProtocol, Object obj, long j2) {
    }

    private static void teardown() {
    }

    public static void sendEvent(Context context, int i2, UMLogDataProtocol uMLogDataProtocol, Object obj, long j2) {
    }

    public static synchronized boolean eventHasExist() {
    }

    public static synchronized void removeEvent(int i2) {
    }
}
