package com.google.common.io;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Deque;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Beta
@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Closer implements Closeable {
    private static final Suppressor SUPPRESSOR = null;
    private final Deque<Closeable> stack;
    @VisibleForTesting
    public final Suppressor suppressor;
    @MonotonicNonNullDecl
    private Throwable thrown;

    @VisibleForTesting
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class LoggingSuppressor implements Suppressor {
        public static final LoggingSuppressor INSTANCE = null;

        @Override // com.google.common.io.Closer.Suppressor
        public void suppress(Closeable closeable, Throwable th, Throwable th2) {
        }
    }

    @VisibleForTesting
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class SuppressingSuppressor implements Suppressor {
        public static final SuppressingSuppressor INSTANCE = null;
        public static final Method addSuppressed = null;

        private static Method getAddSuppressed() {
        }

        public static boolean isAvailable() {
        }

        @Override // com.google.common.io.Closer.Suppressor
        public void suppress(Closeable closeable, Throwable th, Throwable th2) {
        }
    }

    @VisibleForTesting
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface Suppressor {
        void suppress(Closeable closeable, Throwable th, Throwable th2);
    }

    @VisibleForTesting
    public Closer(Suppressor suppressor) {
    }

    public static Closer create() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @CanIgnoreReturnValue
    public <C extends Closeable> C register(@NullableDecl C c) {
    }

    public RuntimeException rethrow(Throwable th) throws IOException {
    }

    public <X extends Exception> RuntimeException rethrow(Throwable th, Class<X> cls) throws IOException, Exception {
    }

    public <X1 extends Exception, X2 extends Exception> RuntimeException rethrow(Throwable th, Class<X1> cls, Class<X2> cls2) throws IOException, Exception, Exception {
    }
}
