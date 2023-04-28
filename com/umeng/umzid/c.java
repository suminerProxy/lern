package com.umeng.umzid;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public static volatile ScheduledThreadPoolExecutor f15506a;
    public static ThreadFactory b;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public AtomicInteger f15507a;

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
        }
    }

    public static ScheduledThreadPoolExecutor a() {
    }

    public static void a(Runnable runnable) {
    }
}
