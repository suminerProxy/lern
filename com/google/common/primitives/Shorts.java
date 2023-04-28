package com.google.common.primitives;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Converter;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible(emulated = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Shorts {
    public static final int BYTES = 2;
    public static final short MAX_POWER_OF_TWO = 16384;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class LexicographicalComparator implements Comparator<short[]> {
        private static final /* synthetic */ LexicographicalComparator[] $VALUES = null;
        public static final LexicographicalComparator INSTANCE = null;

        private LexicographicalComparator(String str, int i2) {
        }

        public static LexicographicalComparator valueOf(String str) {
        }

        public static LexicographicalComparator[] values() {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(short[] sArr, short[] sArr2) {
        }

        @Override // java.lang.Enum
        public String toString() {
        }

        /* renamed from: compare  reason: avoid collision after fix types in other method */
        public int compare2(short[] sArr, short[] sArr2) {
        }
    }

    @GwtCompatible
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class ShortArrayAsList extends AbstractList<Short> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        public final short[] array;
        public final int end;
        public final int start;

        public ShortArrayAsList(short[] sArr) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@NullableDecl Object obj) {
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
        public int indexOf(@NullableDecl Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@NullableDecl Object obj) {
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Short> subList(int i2, int i3) {
        }

        public short[] toShortArray() {
        }

        @Override // java.util.AbstractCollection
        public String toString() {
        }

        public ShortArrayAsList(short[] sArr, int i2, int i3) {
        }

        @Override // java.util.AbstractList, java.util.List
        public Short get(int i2) {
        }

        public Short set(int i2, Short sh) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class ShortConverter extends Converter<String, Short> implements Serializable {
        public static final ShortConverter INSTANCE = null;
        private static final long serialVersionUID = 1;

        private ShortConverter() {
        }

        private Object readResolve() {
        }

        @Override // com.google.common.base.Converter
        public /* bridge */ /* synthetic */ String doBackward(Short sh) {
        }

        @Override // com.google.common.base.Converter
        public /* bridge */ /* synthetic */ Short doForward(String str) {
        }

        public String toString() {
        }

        /* renamed from: doBackward  reason: avoid collision after fix types in other method */
        public String doBackward2(Short sh) {
        }

        /* renamed from: doForward  reason: avoid collision after fix types in other method */
        public Short doForward2(String str) {
        }
    }

    private Shorts() {
    }

    public static /* synthetic */ int access$000(short[] sArr, short s, int i2, int i3) {
    }

    public static /* synthetic */ int access$100(short[] sArr, short s, int i2, int i3) {
    }

    public static List<Short> asList(short... sArr) {
    }

    public static short checkedCast(long j2) {
    }

    public static int compare(short s, short s2) {
    }

    public static short[] concat(short[]... sArr) {
    }

    @Beta
    public static short constrainToRange(short s, short s2, short s3) {
    }

    public static boolean contains(short[] sArr, short s) {
    }

    public static short[] ensureCapacity(short[] sArr, int i2, int i3) {
    }

    @GwtIncompatible
    public static short fromByteArray(byte[] bArr) {
    }

    @GwtIncompatible
    public static short fromBytes(byte b, byte b2) {
    }

    public static int hashCode(short s) {
    }

    public static int indexOf(short[] sArr, short s) {
    }

    public static String join(String str, short... sArr) {
    }

    public static int lastIndexOf(short[] sArr, short s) {
    }

    public static Comparator<short[]> lexicographicalComparator() {
    }

    public static short max(short... sArr) {
    }

    public static short min(short... sArr) {
    }

    public static void reverse(short[] sArr) {
    }

    public static short saturatedCast(long j2) {
    }

    public static void sortDescending(short[] sArr) {
    }

    @Beta
    public static Converter<String, Short> stringConverter() {
    }

    public static short[] toArray(Collection<? extends Number> collection) {
    }

    @GwtIncompatible
    public static byte[] toByteArray(short s) {
    }

    private static int indexOf(short[] sArr, short s, int i2, int i3) {
    }

    private static int lastIndexOf(short[] sArr, short s, int i2, int i3) {
    }

    public static int indexOf(short[] sArr, short[] sArr2) {
    }

    public static void reverse(short[] sArr, int i2, int i3) {
    }

    public static void sortDescending(short[] sArr, int i2, int i3) {
    }
}
