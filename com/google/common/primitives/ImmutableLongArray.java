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
public final class ImmutableLongArray implements Serializable {
    private static final ImmutableLongArray EMPTY = null;
    private final long[] array;
    private final int end;
    private final transient int start;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AsList extends AbstractList<Long> implements RandomAccess, Serializable {
        private final ImmutableLongArray parent;

        public /* synthetic */ AsList(ImmutableLongArray immutableLongArray, AnonymousClass1 anonymousClass1) {
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
        public List<Long> subList(int i2, int i3) {
        }

        @Override // java.util.AbstractCollection
        public String toString() {
        }

        private AsList(ImmutableLongArray immutableLongArray) {
        }

        @Override // java.util.AbstractList, java.util.List
        public Long get(int i2) {
        }
    }

    public /* synthetic */ ImmutableLongArray(long[] jArr, int i2, int i3, AnonymousClass1 anonymousClass1) {
    }

    public static /* synthetic */ long[] access$000(ImmutableLongArray immutableLongArray) {
    }

    public static /* synthetic */ int access$100(ImmutableLongArray immutableLongArray) {
    }

    public static /* synthetic */ ImmutableLongArray access$200() {
    }

    public static Builder builder(int i2) {
    }

    public static ImmutableLongArray copyOf(long[] jArr) {
    }

    private boolean isPartialView() {
    }

    public static ImmutableLongArray of() {
    }

    public List<Long> asList() {
    }

    public boolean contains(long j2) {
    }

    public boolean equals(@NullableDecl Object obj) {
    }

    public long get(int i2) {
    }

    public int hashCode() {
    }

    public int indexOf(long j2) {
    }

    public boolean isEmpty() {
    }

    public int lastIndexOf(long j2) {
    }

    public int length() {
    }

    public Object readResolve() {
    }

    public ImmutableLongArray subArray(int i2, int i3) {
    }

    public long[] toArray() {
    }

    public String toString() {
    }

    public ImmutableLongArray trimmed() {
    }

    public Object writeReplace() {
    }

    private ImmutableLongArray(long[] jArr) {
    }

    public static ImmutableLongArray of(long j2) {
    }

    @CanIgnoreReturnValue
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Builder {
        private long[] array;
        private int count;

        public Builder(int i2) {
        }

        private void ensureRoomFor(int i2) {
        }

        private static int expandedCapacity(int i2, int i3) {
        }

        public Builder add(long j2) {
        }

        public Builder addAll(long[] jArr) {
        }

        @CheckReturnValue
        public ImmutableLongArray build() {
        }

        public Builder addAll(Iterable<Long> iterable) {
        }

        public Builder addAll(Collection<Long> collection) {
        }

        public Builder addAll(ImmutableLongArray immutableLongArray) {
        }
    }

    private ImmutableLongArray(long[] jArr, int i2, int i3) {
    }

    public static Builder builder() {
    }

    public static ImmutableLongArray copyOf(Collection<Long> collection) {
    }

    public static ImmutableLongArray of(long j2, long j3) {
    }

    public static ImmutableLongArray copyOf(Iterable<Long> iterable) {
    }

    public static ImmutableLongArray of(long j2, long j3, long j4) {
    }

    public static ImmutableLongArray of(long j2, long j3, long j4, long j5) {
    }

    public static ImmutableLongArray of(long j2, long j3, long j4, long j5, long j6) {
    }

    public static ImmutableLongArray of(long j2, long j3, long j4, long j5, long j6, long j7) {
    }

    public static ImmutableLongArray of(long j2, long... jArr) {
    }
}
