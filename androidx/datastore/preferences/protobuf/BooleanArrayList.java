package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class BooleanArrayList extends AbstractProtobufList<Boolean> implements Internal.BooleanList, RandomAccess, PrimitiveNonBoxingCollection {
    private static final BooleanArrayList EMPTY_LIST = null;
    private boolean[] array;
    private int size;

    public BooleanArrayList() {
    }

    public static BooleanArrayList emptyList() {
    }

    private void ensureIndexInRange(int i2) {
    }

    private String makeOutOfBoundsExceptionMessage(int i2) {
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ void add(int i2, Object obj) {
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Boolean> collection) {
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.BooleanList
    public void addBoolean(boolean z) {
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
    }

    @Override // java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object get(int i2) {
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.BooleanList
    public boolean getBoolean(int i2) {
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
    /* renamed from: mutableCopyWithCapacity  reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Internal.ProtobufList<Boolean> mutableCopyWithCapacity2(int i2) {
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

    @Override // androidx.datastore.preferences.protobuf.Internal.BooleanList
    public boolean setBoolean(int i2, boolean z) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
    }

    private BooleanArrayList(boolean[] zArr, int i2) {
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
    }

    @Override // java.util.AbstractList, java.util.List
    public Boolean get(int i2) {
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
    public Internal.ProtobufList<Boolean> mutableCopyWithCapacity(int i2) {
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
    }

    public Boolean set(int i2, Boolean bool) {
    }

    public boolean add(Boolean bool) {
    }

    public void add(int i2, Boolean bool) {
    }

    private void addBoolean(int i2, boolean z) {
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Boolean remove(int i2) {
    }
}
