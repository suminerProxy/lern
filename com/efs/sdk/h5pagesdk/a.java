package com.efs.sdk.h5pagesdk;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class a {
    private static final String TAG = "com.efs.sdk.h5pagesdk.a";

    /* renamed from: i  reason: collision with root package name */
    private static volatile ScheduledThreadPoolExecutor f3139i;

    /* renamed from: j  reason: collision with root package name */
    private static ThreadFactory f3140j;

    /* renamed from: com.efs.sdk.h5pagesdk.a$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass1 implements ThreadFactory {

        /* renamed from: k  reason: collision with root package name */
        private AtomicInteger f3141k;

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
        }
    }

    private static ScheduledThreadPoolExecutor a() {
    }

    public static void execute(Runnable runnable) {
    }
}
