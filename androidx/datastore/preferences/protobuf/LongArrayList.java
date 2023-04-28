package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class LongArrayList extends AbstractProtobufList<Long> implements Internal.LongList, RandomAccess, PrimitiveNonBoxingCollection {
    private static final LongArrayList EMPTY_LIST = null;
    private long[] array;
    private int size;

    public LongArrayList() {
    }

    public static LongArrayList emptyList() {
    }

    private void ensureIndexInRange(int i2) {
    }

    private String makeOutOfBoundsExceptionMessage(int i2) {
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ void add(int i2, Object obj) {
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.LongList
    public void addLong(long j2) {
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
    }

    @Override // java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object get(int i2) {
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.LongList
    public long getLong(int i2) {
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
    /* renamed from: mutableCopyWithCapacity  reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Internal.ProtobufList<Long> mutableCopyWithCapacity2(int i2) {
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object remove(int i2) {
    }

    @Override // java.util.AbstractList
    public void removeRange(int i2, int i3) {
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.LongList
    public long setLong(int i2, long j2) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
    }

    private LongArrayList(long[] jArr, int i2) {
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
    }

    @Override // java.util.AbstractList, java.util.List
    public Long get(int i2) {
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
    public Internal.ProtobufList<Long> mutableCopyWithCapacity(int i2) {
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
    }

    public Long set(int i2, Long l2) {
    }

    public boolean add(Long l2) {
    }

    public void add(int i2, Long l2) {
    }

    private void addLong(int i2, long j2) {
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Long remove(int i2) {
    }
}
