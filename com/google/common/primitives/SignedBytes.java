package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
import java.util.Comparator;

@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class SignedBytes {
    public static final byte MAX_POWER_OF_TWO = 64;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class LexicographicalComparator implements Comparator<byte[]> {
        private static final /* synthetic */ LexicographicalComparator[] $VALUES = null;
        public static final LexicographicalComparator INSTANCE = null;

        private LexicographicalComparator(String str, int i2) {
        }

        public static LexicographicalComparator valueOf(String str) {
        }

        public static LexicographicalComparator[] values() {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(byte[] bArr, byte[] bArr2) {
        }

        @Override // java.lang.Enum
        public String toString() {
        }

        /* renamed from: compare  reason: avoid collision after fix types in other method */
        public int compare2(byte[] bArr, byte[] bArr2) {
        }
    }

    private SignedBytes() {
    }

    public static byte checkedCast(long j2) {
    }

    public static int compare(byte b, byte b2) {
    }

    public static String join(String str, byte... bArr) {
    }

    public static Comparator<byte[]> lexicographicalComparator() {
    }

    public static byte max(byte... bArr) {
    }

    public static byte min(byte... bArr) {
    }

    public static byte saturatedCast(long j2) {
    }

    public static void sortDescending(byte[] bArr) {
    }

    public static void sortDescending(byte[] bArr, int i2, int i3) {
    }
}
