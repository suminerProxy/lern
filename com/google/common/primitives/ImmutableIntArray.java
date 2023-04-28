package com.google.common.primitives;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CheckReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Immutable
@Beta
@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ImmutableIntArray implements Serializable {
    private static final ImmutableIntArray EMPTY = null;
    private final int[] array;
    private final int end;
    private final transient int start;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AsList extends AbstractList<Integer> implements RandomAccess, Serializable {
        private final ImmutableIntArray parent;

        public /* synthetic */ AsList(ImmutableIntArray immutableIntArray, AnonymousClass1 anonymousClass1) {
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

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Integer> subList(int i2, int i3) {
        }

        @Override // java.util.AbstractCollection
        public String toString() {
        }

        private AsList(ImmutableIntArray immutableIntArray) {
        }

        @Override // java.util.AbstractList, java.util.List
        public Integer get(int i2) {
        }
    }

    public /* synthetic */ ImmutableIntArray(int[] iArr, int i2, int i3, AnonymousClass1 anonymousClass1) {
    }

    public static /* synthetic */ int[] access$000(ImmutableIntArray immutableIntArray) {
    }

    public static /* synthetic */ int access$100(ImmutableIntArray immutableIntArray) {
    }

    public static /* synthetic */ ImmutableIntArray access$200() {
    }

    public static Builder builder(int i2) {
    }

    public static ImmutableIntArray copyOf(int[] iArr) {
    }

    private boolean isPartialView() {
    }

    public static ImmutableIntArray of() {
    }

    public List<Integer> asList() {
    }

    public boolean contains(int i2) {
    }

    public boolean equals(@NullableDecl Object obj) {
    }

    public int get(int i2) {
    }

    public int hashCode() {
    }

    public int indexOf(int i2) {
    }

    public boolean isEmpty() {
    }

    public int lastIndexOf(int i2) {
    }

    public int length() {
    }

    public Object readResolve() {
    }

    public ImmutableIntArray subArray(int i2, int i3) {
    }

    public int[] toArray() {
    }

    public String toString() {
    }

    public ImmutableIntArray trimmed() {
    }

    public Object writeReplace() {
    }

    private ImmutableIntArray(int[] iArr) {
    }

    public static ImmutableIntArray copyOf(Collection<Integer> collection) {
    }

    public static ImmutableIntArray of(int i2) {
    }

    @CanIgnoreReturnValue
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Builder {
        private int[] array;
        private int count;

        public Builder(int i2) {
        }

        private void ensureRoomFor(int i2) {
        }

        private static int expandedCapacity(int i2, int i3) {
        }

        public Builder add(int i2) {
        }

        public Builder addAll(int[] iArr) {
        }

        @CheckReturnValue
        public ImmutableIntArray build() {
        }

        public Builder addAll(Iterable<Integer> iterable) {
        }

        public Builder addAll(Collection<Integer> collection) {
        }

        public Builder addAll(ImmutableIntArray immutableIntArray) {
        }
    }

    private ImmutableIntArray(int[] iArr, int i2, int i3) {
    }

    public static Builder builder() {
    }

    public static ImmutableIntArray copyOf(Iterable<Integer> iterable) {
    }

    public static ImmutableIntArray of(int i2, int i3) {
    }

    public static ImmutableIntArray of(int i2, int i3, int i4) {
    }

    public static ImmutableIntArray of(int i2, int i3, int i4, int i5) {
    }

    public static ImmutableIntArray of(int i2, int i3, int i4, int i5, int i6) {
    }

    public static ImmutableIntArray of(int i2, int i3, int i4, int i5, int i6, int i7) {
    }

    public static ImmutableIntArray of(int i2, int... iArr) {
    }
}
