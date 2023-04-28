package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class DoubleArrayList extends AbstractProtobufList<Double> implements Internal.DoubleList, RandomAccess, PrimitiveNonBoxingCollection {
    private static final DoubleArrayList EMPTY_LIST = null;
    private double[] array;
    private int size;

    public DoubleArrayList() {
    }

    public static DoubleArrayList emptyList() {
    }

    private void ensureIndexInRange(int i2) {
    }

    private String makeOutOfBoundsExceptionMessage(int i2) {
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ void add(int i2, Object obj) {
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Double> collection) {
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.DoubleList
    public void addDouble(double d2) {
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
    }

    @Override // java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object get(int i2) {
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.DoubleList
    public double getDouble(int i2) {
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
    /* renamed from: mutableCopyWithCapacity  reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Internal.ProtobufList<Double> mutableCopyWithCapacity2(int i2) {
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

    @Override // androidx.datastore.preferences.protobuf.Internal.DoubleList
    public double setDouble(int i2, double d2) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
    }

    private DoubleArrayList(double[] dArr, int i2) {
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
    }

    @Override // java.util.AbstractList, java.util.List
    public Double get(int i2) {
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
    public Internal.ProtobufList<Double> mutableCopyWithCapacity(int i2) {
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
    }

    public Double set(int i2, Double d2) {
    }

    public boolean add(Double d2) {
    }

    public void add(int i2, Double d2) {
    }

    private void addDouble(int i2, double d2) {
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Double remove(int i2) {
    }
}
