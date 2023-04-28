package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class IntArrayList extends AbstractProtobufList<Integer> implements Internal.IntList, RandomAccess, PrimitiveNonBoxingCollection {
    private static final IntArrayList EMPTY_LIST = null;
    private int[] array;
    private int size;

    public IntArrayList() {
    }

    public static IntArrayList emptyList() {
    }

    private void ensureIndexInRange(int i2) {
    }

    private String makeOutOfBoundsExceptionMessage(int i2) {
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ void add(int i2, Object obj) {
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.IntList
    public void addInt(int i2) {
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
    }

    @Override // java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object get(int i2) {
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.IntList
    public int getInt(int i2) {
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
    /* renamed from: mutableCopyWithCapacity  reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Internal.ProtobufList<Integer> mutableCopyWithCapacity2(int i2) {
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

    @Override // androidx.datastore.preferences.protobuf.Internal.IntList
    public int setInt(int i2, int i3) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
    }

    private IntArrayList(int[] iArr, int i2) {
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
    }

    @Override // java.util.AbstractList, java.util.List
    public Integer get(int i2) {
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
    public Internal.ProtobufList<Integer> mutableCopyWithCapacity(int i2) {
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
    }

    public Integer set(int i2, Integer num) {
    }

    public boolean add(Integer num) {
    }

    public void add(int i2, Integer num) {
    }

    private void addInt(int i2, int i3) {
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Integer remove(int i2) {
    }
}
