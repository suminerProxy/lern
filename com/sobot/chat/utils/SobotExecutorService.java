package com.sobot.chat.utils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotExecutorService {
    private static ExecutorService executorService;

    /* renamed from: com.sobot.chat.utils.SobotExecutorService$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class AnonymousClass1 implements ThreadFactory {
        public final /* synthetic */ boolean val$daemon;
        public final /* synthetic */ String val$name;

        public AnonymousClass1(String str, boolean z) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
        }
    }

    public static ExecutorService executorService() {
    }

    public static ThreadFactory threadFactory(String str, boolean z) {
    }
}
