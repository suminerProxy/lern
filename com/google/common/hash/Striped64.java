package com.google.common.hash;

import com.google.common.annotations.GwtIncompatible;
import java.security.PrivilegedExceptionAction;
import java.util.Random;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import sun.misc.Unsafe;

@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class Striped64 extends Number {
    public static final int NCPU = 0;
    private static final Unsafe UNSAFE = null;
    private static final long baseOffset = 0;
    private static final long busyOffset = 0;
    public static final Random rng = null;
    public static final ThreadLocal<int[]> threadHashCode = null;
    public volatile transient long base;
    public volatile transient int busy;
    @NullableDecl
    public volatile transient Cell[] cells;

    /* renamed from: com.google.common.hash.Striped64$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1 implements PrivilegedExceptionAction<Unsafe> {
        @Override // java.security.PrivilegedExceptionAction
        public /* bridge */ /* synthetic */ Unsafe run() throws Exception {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* renamed from: run  reason: avoid collision after fix types in other method */
        public Unsafe run2() throws Exception {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Cell {
        private static final Unsafe UNSAFE = null;
        private static final long valueOffset = 0;
        public volatile long p0;
        public volatile long p1;
        public volatile long p2;
        public volatile long p3;
        public volatile long p4;
        public volatile long p5;
        public volatile long p6;
        public volatile long q0;
        public volatile long q1;
        public volatile long q2;
        public volatile long q3;
        public volatile long q4;
        public volatile long q5;
        public volatile long q6;
        public volatile long value;

        public Cell(long j2) {
        }

        public final boolean cas(long j2, long j3) {
        }
    }

    public static /* synthetic */ Unsafe access$000() {
    }

    private static Unsafe getUnsafe() {
    }

    public final boolean casBase(long j2, long j3) {
    }

    public final boolean casBusy() {
    }

    public abstract long fn(long j2, long j3);

    public final void internalReset(long j2) {
    }

    public final void retryUpdate(long j2, @NullableDecl int[] iArr, boolean z) {
    }
}
