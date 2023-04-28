package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class LazyStringArrayList extends AbstractProtobufList<String> implements LazyStringList, RandomAccess {
    public static final LazyStringList EMPTY = null;
    private static final LazyStringArrayList EMPTY_LIST = null;
    private final List<Object> list;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class ByteArrayListView extends AbstractList<byte[]> implements RandomAccess {
        private final LazyStringArrayList list;

        public ByteArrayListView(LazyStringArrayList lazyStringArrayList) {
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i2) {
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ Object remove(int i2) {
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }

        public void add(int i2, byte[] bArr) {
        }

        @Override // java.util.AbstractList, java.util.List
        public byte[] get(int i2) {
        }

        @Override // java.util.AbstractList, java.util.List
        public byte[] remove(int i2) {
        }

        public byte[] set(int i2, byte[] bArr) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class ByteStringListView extends AbstractList<ByteString> implements RandomAccess {
        private final LazyStringArrayList list;

        public ByteStringListView(LazyStringArrayList lazyStringArrayList) {
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i2) {
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ Object remove(int i2) {
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }

        public void add(int i2, ByteString byteString) {
        }

        @Override // java.util.AbstractList, java.util.List
        public ByteString get(int i2) {
        }

        @Override // java.util.AbstractList, java.util.List
        public ByteString remove(int i2) {
        }

        public ByteString set(int i2, ByteString byteString) {
        }
    }

    public LazyStringArrayList() {
    }

    public static /* synthetic */ Object access$000(LazyStringArrayList lazyStringArrayList, int i2, byte[] bArr) {
    }

    public static /* synthetic */ byte[] access$100(Object obj) {
    }

    public static /* synthetic */ void access$200(LazyStringArrayList lazyStringArrayList, int i2, byte[] bArr) {
    }

    public static /* synthetic */ Object access$300(LazyStringArrayList lazyStringArrayList, int i2, ByteString byteString) {
    }

    public static /* synthetic */ ByteString access$400(Object obj) {
    }

    public static /* synthetic */ void access$500(LazyStringArrayList lazyStringArrayList, int i2, ByteString byteString) {
    }

    private static byte[] asByteArray(Object obj) {
    }

    private static ByteString asByteString(Object obj) {
    }

    private static String asString(Object obj) {
    }

    public static LazyStringArrayList emptyList() {
    }

    private Object setAndReturn(int i2, ByteString byteString) {
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ void add(int i2, Object obj) {
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public boolean addAllByteArray(Collection<byte[]> collection) {
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public boolean addAllByteString(Collection<? extends ByteString> collection) {
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public List<byte[]> asByteArrayList() {
    }

    @Override // androidx.datastore.preferences.protobuf.ProtocolStringList
    public List<ByteString> asByteStringList() {
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
    }

    @Override // java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object get(int i2) {
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public byte[] getByteArray(int i2) {
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public ByteString getByteString(int i2) {
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public Object getRaw(int i2) {
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public List<?> getUnderlyingElements() {
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public LazyStringList getUnmodifiableView() {
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, androidx.datastore.preferences.protobuf.Internal.ProtobufList
    public /* bridge */ /* synthetic */ boolean isModifiable() {
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public void mergeFrom(LazyStringList lazyStringList) {
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
    public /* bridge */ /* synthetic */ Internal.ProtobufList mutableCopyWithCapacity(int i2) {
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object remove(int i2) {
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
    }

    public LazyStringArrayList(int i2) {
    }

    public void add(int i2, String str) {
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public boolean addAll(int i2, Collection<? extends String> collection) {
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i2) {
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
    public LazyStringArrayList mutableCopyWithCapacity(int i2) {
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
    }

    public String set(int i2, String str) {
    }

    public LazyStringArrayList(LazyStringList lazyStringList) {
    }

    private Object setAndReturn(int i2, byte[] bArr) {
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public String remove(int i2) {
    }

    private void add(int i2, ByteString byteString) {
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public void set(int i2, ByteString byteString) {
    }

    public LazyStringArrayList(List<String> list) {
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public void set(int i2, byte[] bArr) {
    }

    private LazyStringArrayList(ArrayList<Object> arrayList) {
    }

    private void add(int i2, byte[] bArr) {
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public void add(ByteString byteString) {
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public void add(byte[] bArr) {
    }
}
