package com.google.common.primitives;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible(emulated = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Chars {
    public static final int BYTES = 2;

    @GwtCompatible
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class CharArrayAsList extends AbstractList<Character> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        public final char[] array;
        public final int end;
        public final int start;

        public CharArrayAsList(char[] cArr) {
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
        public List<Character> subList(int i2, int i3) {
        }

        public char[] toCharArray() {
        }

        @Override // java.util.AbstractCollection
        public String toString() {
        }

        public CharArrayAsList(char[] cArr, int i2, int i3) {
        }

        @Override // java.util.AbstractList, java.util.List
        public Character get(int i2) {
        }

        public Character set(int i2, Character ch) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class LexicographicalComparator implements Comparator<char[]> {
        private static final /* synthetic */ LexicographicalComparator[] $VALUES = null;
        public static final LexicographicalComparator INSTANCE = null;

        private LexicographicalComparator(String str, int i2) {
        }

        public static LexicographicalComparator valueOf(String str) {
        }

        public static LexicographicalComparator[] values() {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(char[] cArr, char[] cArr2) {
        }

        @Override // java.lang.Enum
        public String toString() {
        }

        /* renamed from: compare  reason: avoid collision after fix types in other method */
        public int compare2(char[] cArr, char[] cArr2) {
        }
    }

    private Chars() {
    }

    public static /* synthetic */ int access$000(char[] cArr, char c, int i2, int i3) {
    }

    public static /* synthetic */ int access$100(char[] cArr, char c, int i2, int i3) {
    }

    public static List<Character> asList(char... cArr) {
    }

    public static char checkedCast(long j2) {
    }

    public static int compare(char c, char c2) {
    }

    public static char[] concat(char[]... cArr) {
    }

    @Beta
    public static char constrainToRange(char c, char c2, char c3) {
    }

    public static boolean contains(char[] cArr, char c) {
    }

    public static char[] ensureCapacity(char[] cArr, int i2, int i3) {
    }

    @GwtIncompatible
    public static char fromByteArray(byte[] bArr) {
    }

    @GwtIncompatible
    public static char fromBytes(byte b, byte b2) {
    }

    public static int hashCode(char c) {
    }

    public static int indexOf(char[] cArr, char c) {
    }

    public static String join(String str, char... cArr) {
    }

    public static int lastIndexOf(char[] cArr, char c) {
    }

    public static Comparator<char[]> lexicographicalComparator() {
    }

    public static char max(char... cArr) {
    }

    public static char min(char... cArr) {
    }

    public static void reverse(char[] cArr) {
    }

    public static char saturatedCast(long j2) {
    }

    public static void sortDescending(char[] cArr) {
    }

    public static char[] toArray(Collection<Character> collection) {
    }

    @GwtIncompatible
    public static byte[] toByteArray(char c) {
    }

    private static int indexOf(char[] cArr, char c, int i2, int i3) {
    }

    private static int lastIndexOf(char[] cArr, char c, int i2, int i3) {
    }

    public static int indexOf(char[] cArr, char[] cArr2) {
    }

    public static void reverse(char[] cArr, int i2, int i3) {
    }

    public static void sortDescending(char[] cArr, int i2, int i3) {
    }
}
