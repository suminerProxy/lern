package com.google.common.primitives;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Comparator;

@Beta
@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class UnsignedInts {
    public static final long INT_MASK = 4294967295L;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class LexicographicalComparator implements Comparator<int[]> {
        private static final /* synthetic */ LexicographicalComparator[] $VALUES = null;
        public static final LexicographicalComparator INSTANCE = null;

        private LexicographicalComparator(String str, int i2) {
        }

        public static LexicographicalComparator valueOf(String str) {
        }

        public static LexicographicalComparator[] values() {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(int[] iArr, int[] iArr2) {
        }

        @Override // java.lang.Enum
        public String toString() {
        }

        /* renamed from: compare  reason: avoid collision after fix types in other method */
        public int compare2(int[] iArr, int[] iArr2) {
        }
    }

    private UnsignedInts() {
    }

    public static int checkedCast(long j2) {
    }

    public static int compare(int i2, int i3) {
    }

    @CanIgnoreReturnValue
    public static int decode(String str) {
    }

    public static int divide(int i2, int i3) {
    }

    public static int flip(int i2) {
    }

    public static String join(String str, int... iArr) {
    }

    public static Comparator<int[]> lexicographicalComparator() {
    }

    public static int max(int... iArr) {
    }

    public static int min(int... iArr) {
    }

    @CanIgnoreReturnValue
    public static int parseUnsignedInt(String str) {
    }

    public static int remainder(int i2, int i3) {
    }

    public static int saturatedCast(long j2) {
    }

    public static void sort(int[] iArr) {
    }

    public static void sortDescending(int[] iArr) {
    }

    public static long toLong(int i2) {
    }

    public static String toString(int i2) {
    }

    @CanIgnoreReturnValue
    public static int parseUnsignedInt(String str, int i2) {
    }

    public static String toString(int i2, int i3) {
    }

    public static void sort(int[] iArr, int i2, int i3) {
    }

    public static void sortDescending(int[] iArr, int i2, int i3) {
    }
}
