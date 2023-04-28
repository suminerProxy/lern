package com.efs.sdk.launch;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f3151a = "com.efs.sdk.launch.a";
    private static volatile ScheduledThreadPoolExecutor b;
    private static ThreadFactory c;

    /* renamed from: com.efs.sdk.launch.a$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass1 implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private AtomicInteger f3152a;

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
        }
    }

    private static ScheduledThreadPoolExecutor a() {
    }

    public static void a(Runnable runnable) {
    }
}
