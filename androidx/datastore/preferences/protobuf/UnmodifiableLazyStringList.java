package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class UnmodifiableLazyStringList extends AbstractList<String> implements LazyStringList, RandomAccess {
    private final LazyStringList list;

    /* renamed from: androidx.datastore.preferences.protobuf.UnmodifiableLazyStringList$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements ListIterator<String> {
        public ListIterator<String> iter;
        public final /* synthetic */ UnmodifiableLazyStringList this$0;
        public final /* synthetic */ int val$index;

        public AnonymousClass1(UnmodifiableLazyStringList unmodifiableLazyStringList, int i2) {
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void add(String str) {
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ String previous() {
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void set(String str) {
        }

        /* renamed from: add  reason: avoid collision after fix types in other method */
        public void add2(String str) {
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public String next() {
        }

        @Override // java.util.ListIterator
        /* renamed from: previous  reason: avoid collision after fix types in other method */
        public String previous2() {
        }

        /* renamed from: set  reason: avoid collision after fix types in other method */
        public void set2(String str) {
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.UnmodifiableLazyStringList$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements Iterator<String> {
        public Iterator<String> iter;
        public final /* synthetic */ UnmodifiableLazyStringList this$0;

        public AnonymousClass2(UnmodifiableLazyStringList unmodifiableLazyStringList) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ String next() {
        }

        @Override // java.util.Iterator
        public void remove() {
        }

        @Override // java.util.Iterator
        /* renamed from: next  reason: avoid collision after fix types in other method */
        public String next2() {
        }
    }

    public UnmodifiableLazyStringList(LazyStringList lazyStringList) {
    }

    public static /* synthetic */ LazyStringList access$000(UnmodifiableLazyStringList unmodifiableLazyStringList) {
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public void add(ByteString byteString) {
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

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i2) {
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public void mergeFrom(LazyStringList lazyStringList) {
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public void set(int i2, ByteString byteString) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public void add(byte[] bArr) {
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i2) {
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public void set(int i2, byte[] bArr) {
    }
}
