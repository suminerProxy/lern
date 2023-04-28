package com.facebook.stetho.common;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class Util {
    public static void awaitUninterruptibly(CountDownLatch countDownLatch) {
    }

    public static void close(Closeable closeable, boolean z) throws IOException {
    }

    public static void copy(InputStream inputStream, OutputStream outputStream, byte[] bArr) throws IOException {
    }

    public static <T> T getUninterruptibly(Future<T> future, long j2, TimeUnit timeUnit) throws TimeoutException, ExecutionException {
    }

    public static void joinUninterruptibly(Thread thread) {
    }

    public static String readAsUTF8(InputStream inputStream) throws IOException {
    }

    public static void sleepUninterruptibly(long j2) {
    }

    public static void throwIf(boolean z) {
    }

    public static void throwIfNot(boolean z) {
    }

    public static void throwIfNotNull(Object obj) {
    }

    public static <T> T throwIfNull(T t) {
    }

    public static void throwIfNot(boolean z, String str, Object... objArr) {
    }

    public static <T1, T2> void throwIfNull(T1 t1, T2 t2) {
    }

    public static <T1, T2, T3> void throwIfNull(T1 t1, T2 t2, T3 t3) {
    }

    public static <T> T getUninterruptibly(Future<T> future) throws ExecutionException {
    }
}
