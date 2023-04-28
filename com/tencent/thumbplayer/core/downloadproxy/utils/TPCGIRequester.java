package com.tencent.thumbplayer.core.downloadproxy.utils;

import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TPCGIRequester {
    private static final String FILE_NAME = "TPCGIRequester";
    private static final int MAX_RETRY_TIMES = 3;
    private static final int MSG_CONFIG_URL = 2011;
    private static final int MSG_REPORT_URL = 2010;
    private static final int MSG_WUJI_CONFIG_URL = 2013;
    private static final int RETRY_INTERVAL = 3000;
    private static final int TIMEOUT = 3000;
    private static volatile ExecutorService mCustomExecutor;
    private static TPCGIRequester mRequester;
    private LinkedBlockingQueue<TPRequestItem> mRequestQueue;
    private LinkedBlockingQueue<TPRequestItem> mRetryQueue;
    private TimerTask mTimerTask;

    /* renamed from: com.tencent.thumbplayer.core.downloadproxy.utils.TPCGIRequester$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 extends TimerTask {
        public final /* synthetic */ TPCGIRequester this$0;

        public AnonymousClass1(TPCGIRequester tPCGIRequester) {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.thumbplayer.core.downloadproxy.utils.TPCGIRequester$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements Runnable {
        public final /* synthetic */ TPCGIRequester this$0;

        public AnonymousClass2(TPCGIRequester tPCGIRequester) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    private TPCGIRequester() {
    }

    public static /* synthetic */ LinkedBlockingQueue access$000(TPCGIRequester tPCGIRequester) {
    }

    public static /* synthetic */ void access$100(TPCGIRequester tPCGIRequester, TPRequestItem tPRequestItem) {
    }

    public static /* synthetic */ LinkedBlockingQueue access$200(TPCGIRequester tPCGIRequester) {
    }

    public static /* synthetic */ boolean access$300(TPCGIRequester tPCGIRequester, TPRequestItem tPRequestItem) {
    }

    public static /* synthetic */ void access$400(TPCGIRequester tPCGIRequester, TPRequestItem tPRequestItem) {
    }

    private void addNotifyReqQueue(TPRequestItem tPRequestItem) {
    }

    private void addRetryRequestItem(TPRequestItem tPRequestItem) {
    }

    public static TPCGIRequester getInstance() {
    }

    private boolean handleRequestItem(TPRequestItem tPRequestItem) {
    }

    private static ExecutorService obtainThreadExcutor() {
    }

    private void process() {
    }

    public void addRequestItem(String str, int i2) {
    }
}
