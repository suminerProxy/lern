package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CheckReturnValue;
import java.lang.Thread;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

@CanIgnoreReturnValue
@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ThreadFactoryBuilder {
    private ThreadFactory backingThreadFactory;
    private Boolean daemon;
    private String nameFormat;
    private Integer priority;
    private Thread.UncaughtExceptionHandler uncaughtExceptionHandler;

    /* renamed from: com.google.common.util.concurrent.ThreadFactoryBuilder$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1 implements ThreadFactory {
        public final /* synthetic */ ThreadFactory val$backingThreadFactory;
        public final /* synthetic */ AtomicLong val$count;
        public final /* synthetic */ Boolean val$daemon;
        public final /* synthetic */ String val$nameFormat;
        public final /* synthetic */ Integer val$priority;
        public final /* synthetic */ Thread.UncaughtExceptionHandler val$uncaughtExceptionHandler;

        public AnonymousClass1(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool, Integer num, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
        }
    }

    public static /* synthetic */ String access$000(String str, Object[] objArr) {
    }

    private static ThreadFactory doBuild(ThreadFactoryBuilder threadFactoryBuilder) {
    }

    private static String format(String str, Object... objArr) {
    }

    @CheckReturnValue
    public ThreadFactory build() {
    }

    public ThreadFactoryBuilder setDaemon(boolean z) {
    }

    public ThreadFactoryBuilder setNameFormat(String str) {
    }

    public ThreadFactoryBuilder setPriority(int i2) {
    }

    public ThreadFactoryBuilder setThreadFactory(ThreadFactory threadFactory) {
    }

    public ThreadFactoryBuilder setUncaughtExceptionHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
    }
}
