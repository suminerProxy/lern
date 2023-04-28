package com.google.android.exoplayer2.util;

import androidx.annotation.Nullable;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Assertions {
    private Assertions() {
    }

    @Pure
    public static void checkArgument(boolean expression) {
    }

    @Pure
    public static int checkIndex(int index, int start, int limit) {
    }

    @Pure
    public static void checkMainThread() {
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static String checkNotEmpty(@Nullable String string) {
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static <T> T checkNotNull(@Nullable T reference) {
    }

    @Pure
    public static void checkState(boolean expression) {
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static <T> T checkStateNotNull(@Nullable T reference) {
    }

    @Pure
    public static void checkArgument(boolean expression, Object errorMessage) {
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static <T> T checkNotNull(@Nullable T reference, Object errorMessage) {
    }

    @Pure
    public static void checkState(boolean expression, Object errorMessage) {
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static <T> T checkStateNotNull(@Nullable T reference, Object errorMessage) {
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static String checkNotEmpty(@Nullable String string, Object errorMessage) {
    }
}
