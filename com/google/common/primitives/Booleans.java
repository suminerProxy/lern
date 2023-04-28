package com.google.common.primitives;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Booleans {

    @GwtCompatible
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class BooleanArrayAsList extends AbstractList<Boolean> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        public final boolean[] array;
        public final int end;
        public final int start;

        public BooleanArrayAsList(boolean[] zArr) {
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
        public List<Boolean> subList(int i2, int i3) {
        }

        public boolean[] toBooleanArray() {
        }

        @Override // java.util.AbstractCollection
        public String toString() {
        }

        public BooleanArrayAsList(boolean[] zArr, int i2, int i3) {
        }

        @Override // java.util.AbstractList, java.util.List
        public Boolean get(int i2) {
        }

        public Boolean set(int i2, Boolean bool) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class BooleanComparator implements Comparator<Boolean> {
        private static final /* synthetic */ BooleanComparator[] $VALUES = null;
        public static final BooleanComparator FALSE_FIRST = null;
        public static final BooleanComparator TRUE_FIRST = null;
        private final String toString;
        private final int trueValue;

        private BooleanComparator(String str, int i2, int i3, String str2) {
        }

        public static BooleanComparator valueOf(String str) {
        }

        public static BooleanComparator[] values() {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Boolean bool, Boolean bool2) {
        }

        @Override // java.lang.Enum
        public String toString() {
        }

        /* renamed from: compare  reason: avoid collision after fix types in other method */
        public int compare2(Boolean bool, Boolean bool2) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class LexicographicalComparator implements Comparator<boolean[]> {
        private static final /* synthetic */ LexicographicalComparator[] $VALUES = null;
        public static final LexicographicalComparator INSTANCE = null;

        private LexicographicalComparator(String str, int i2) {
        }

        public static LexicographicalComparator valueOf(String str) {
        }

        public static LexicographicalComparator[] values() {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(boolean[] zArr, boolean[] zArr2) {
        }

        @Override // java.lang.Enum
        public String toString() {
        }

        /* renamed from: compare  reason: avoid collision after fix types in other method */
        public int compare2(boolean[] zArr, boolean[] zArr2) {
        }
    }

    private Booleans() {
    }

    public static /* synthetic */ int access$000(boolean[] zArr, boolean z, int i2, int i3) {
    }

    public static /* synthetic */ int access$100(boolean[] zArr, boolean z, int i2, int i3) {
    }

    public static List<Boolean> asList(boolean... zArr) {
    }

    public static int compare(boolean z, boolean z2) {
    }

    public static boolean[] concat(boolean[]... zArr) {
    }

    public static boolean contains(boolean[] zArr, boolean z) {
    }

    @Beta
    public static int countTrue(boolean... zArr) {
    }

    public static boolean[] ensureCapacity(boolean[] zArr, int i2, int i3) {
    }

    @Beta
    public static Comparator<Boolean> falseFirst() {
    }

    public static int hashCode(boolean z) {
    }

    public static int indexOf(boolean[] zArr, boolean z) {
    }

    public static String join(String str, boolean... zArr) {
    }

    public static int lastIndexOf(boolean[] zArr, boolean z) {
    }

    public static Comparator<boolean[]> lexicographicalComparator() {
    }

    public static void reverse(boolean[] zArr) {
    }

    public static boolean[] toArray(Collection<Boolean> collection) {
    }

    @Beta
    public static Comparator<Boolean> trueFirst() {
    }

    private static int indexOf(boolean[] zArr, boolean z, int i2, int i3) {
    }

    private static int lastIndexOf(boolean[] zArr, boolean z, int i2, int i3) {
    }

    public static int indexOf(boolean[] zArr, boolean[] zArr2) {
    }

    public static void reverse(boolean[] zArr, int i2, int i3) {
    }
}
