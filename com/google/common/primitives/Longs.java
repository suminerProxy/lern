package com.google.common.primitives;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Converter;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Longs {
    public static final int BYTES = 8;
    public static final long MAX_POWER_OF_TWO = 4611686018427387904L;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class AsciiDigits {
        private static final byte[] asciiDigits = null;

        private AsciiDigits() {
        }

        public static int digit(char c) {
        }
    }

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

    @GwtCompatible
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class LongArrayAsList extends AbstractList<Long> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        public final long[] array;
        public final int end;
        public final int start;

        public LongArrayAsList(long[] jArr) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@NullableDecl Object obj) {
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i2) {
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Long> subList(int i2, int i3) {
        }

        public long[] toLongArray() {
        }

        @Override // java.util.AbstractCollection
        public String toString() {
        }

        public LongArrayAsList(long[] jArr, int i2, int i3) {
        }

        @Override // java.util.AbstractList, java.util.List
        public Long get(int i2) {
        }

        public Long set(int i2, Long l2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class LongConverter extends Converter<String, Long> implements Serializable {
        public static final LongConverter INSTANCE = null;
        private static final long serialVersionUID = 1;

        private LongConverter() {
        }

        private Object readResolve() {
        }

        @Override // com.google.common.base.Converter
        public /* bridge */ /* synthetic */ String doBackward(Long l2) {
        }

        @Override // com.google.common.base.Converter
        public /* bridge */ /* synthetic */ Long doForward(String str) {
        }

        public String toString() {
        }

        /* renamed from: doBackward  reason: avoid collision after fix types in other method */
        public String doBackward2(Long l2) {
        }

        /* renamed from: doForward  reason: avoid collision after fix types in other method */
        public Long doForward2(String str) {
        }
    }

    private Longs() {
    }

    public static /* synthetic */ int access$000(long[] jArr, long j2, int i2, int i3) {
    }

    public static /* synthetic */ int access$100(long[] jArr, long j2, int i2, int i3) {
    }

    public static List<Long> asList(long... jArr) {
    }

    public static int compare(long j2, long j3) {
    }

    public static long[] concat(long[]... jArr) {
    }

    @Beta
    public static long constrainToRange(long j2, long j3, long j4) {
    }

    public static boolean contains(long[] jArr, long j2) {
    }

    public static long[] ensureCapacity(long[] jArr, int i2, int i3) {
    }

    public static long fromByteArray(byte[] bArr) {
    }

    public static long fromBytes(byte b, byte b2, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8) {
    }

    public static int hashCode(long j2) {
    }

    public static int indexOf(long[] jArr, long j2) {
    }

    public static String join(String str, long... jArr) {
    }

    public static int lastIndexOf(long[] jArr, long j2) {
    }

    public static Comparator<long[]> lexicographicalComparator() {
    }

    public static long max(long... jArr) {
    }

    public static long min(long... jArr) {
    }

    public static void reverse(long[] jArr) {
    }

    public static void sortDescending(long[] jArr) {
    }

    @Beta
    public static Converter<String, Long> stringConverter() {
    }

    public static long[] toArray(Collection<? extends Number> collection) {
    }

    public static byte[] toByteArray(long j2) {
    }

    @Beta
    @NullableDecl
    public static Long tryParse(String str) {
    }

    private static int indexOf(long[] jArr, long j2, int i2, int i3) {
    }

    private static int lastIndexOf(long[] jArr, long j2, int i2, int i3) {
    }

    @Beta
    @NullableDecl
    public static Long tryParse(String str, int i2) {
    }

    public static int indexOf(long[] jArr, long[] jArr2) {
    }

    public static void reverse(long[] jArr, int i2, int i3) {
    }

    public static void sortDescending(long[] jArr, int i2, int i3) {
    }
}
