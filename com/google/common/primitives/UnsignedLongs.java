package com.google.common.primitives;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Comparator;

@Beta
@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class UnsignedLongs {
    public static final long MAX_VALUE = -1;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class LexicographicalComparator implements Comparator<long[]> {
        private static final /* synthetic */ LexicographicalComparator[] $VALUES = null;
        public static final LexicographicalComparator INSTANCE = null;

        private LexicographicalComparator(String str, int i2) {
        }

        public static LexicographicalComparator valueOf(String str) {
        }

        public static LexicographicalComparator[] values() {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(long[] jArr, long[] jArr2) {
        }

        @Override // java.lang.Enum
        public String toString() {
        }

        /* renamed from: compare  reason: avoid collision after fix types in other method */
        public int compare2(long[] jArr, long[] jArr2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class ParseOverflowDetection {
        public static final int[] maxSafeDigits = null;
        public static final long[] maxValueDivs = null;
        public static final int[] maxValueMods = null;

        private ParseOverflowDetection() {
        }

        public static boolean overflowInParse(long j2, int i2, int i3) {
        }
    }

    private UnsignedLongs() {
    }

    public static int compare(long j2, long j3) {
    }

    @CanIgnoreReturnValue
    public static long decode(String str) {
    }

    public static long divide(long j2, long j3) {
    }

    private static long flip(long j2) {
    }

    public static String join(String str, long... jArr) {
    }

    public static Comparator<long[]> lexicographicalComparator() {
    }

    public static long max(long... jArr) {
    }

    public static long min(long... jArr) {
    }

    @CanIgnoreReturnValue
    public static long parseUnsignedLong(String str) {
    }

    public static long remainder(long j2, long j3) {
    }

    public static void sort(long[] jArr) {
    }

    public static void sortDescending(long[] jArr) {
    }

    public static String toString(long j2) {
    }

    @CanIgnoreReturnValue
    public static long parseUnsignedLong(String str, int i2) {
    }

    public static String toString(long j2, int i2) {
    }

    public static void sort(long[] jArr, int i2, int i3) {
    }

    public static void sortDescending(long[] jArr, int i2, int i3) {
    }
}
