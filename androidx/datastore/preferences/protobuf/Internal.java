package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class Internal {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    public static final byte[] EMPTY_BYTE_ARRAY = null;
    public static final ByteBuffer EMPTY_BYTE_BUFFER = null;
    public static final CodedInputStream EMPTY_CODED_INPUT_STREAM = null;
    public static final Charset ISO_8859_1 = null;
    public static final Charset UTF_8 = null;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface BooleanList extends ProtobufList<Boolean> {
        void addBoolean(boolean z);

        boolean getBoolean(int i2);

        @Override // 
        ProtobufList<Boolean> mutableCopyWithCapacity(int i2);

        boolean setBoolean(int i2, boolean z);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface DoubleList extends ProtobufList<Double> {
        void addDouble(double d2);

        double getDouble(int i2);

        @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
        ProtobufList<Double> mutableCopyWithCapacity(int i2);

        double setDouble(int i2, double d2);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface EnumLite {
        int getNumber();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface EnumLiteMap<T extends EnumLite> {
        T findValueByNumber(int i2);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface EnumVerifier {
        boolean isInRange(int i2);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface FloatList extends ProtobufList<Float> {
        void addFloat(float f2);

        float getFloat(int i2);

        @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
        ProtobufList<Float> mutableCopyWithCapacity(int i2);

        float setFloat(int i2, float f2);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface IntList extends ProtobufList<Integer> {
        void addInt(int i2);

        int getInt(int i2);

        @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
        ProtobufList<Integer> mutableCopyWithCapacity(int i2);

        int setInt(int i2, int i3);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class ListAdapter<F, T> extends AbstractList<T> {
        private final Converter<F, T> converter;
        private final List<F> fromList;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public interface Converter<F, T> {
            T convert(F f2);
        }

        public ListAdapter(List<F> list, Converter<F, T> converter) {
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i2) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface LongList extends ProtobufList<Long> {
        void addLong(long j2);

        long getLong(int i2);

        @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
        ProtobufList<Long> mutableCopyWithCapacity(int i2);

        long setLong(int i2, long j2);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class MapAdapter<K, V, RealValue> extends AbstractMap<K, V> {
        private final Map<K, RealValue> realMap;
        private final Converter<RealValue, V> valueConverter;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* renamed from: androidx.datastore.preferences.protobuf.Internal$MapAdapter$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public static class AnonymousClass1<T> implements Converter<Integer, T> {
            public final /* synthetic */ EnumLiteMap val$enumMap;
            public final /* synthetic */ EnumLite val$unrecognizedValue;

            public AnonymousClass1(EnumLiteMap enumLiteMap, EnumLite enumLite) {
            }

            @Override // androidx.datastore.preferences.protobuf.Internal.MapAdapter.Converter
            public /* bridge */ /* synthetic */ Integer doBackward(Object obj) {
            }

            @Override // androidx.datastore.preferences.protobuf.Internal.MapAdapter.Converter
            public /* bridge */ /* synthetic */ Object doForward(Integer num) {
            }

            /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Integer; */
            public Integer doBackward(EnumLite enumLite) {
            }

            /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/Integer;)TT; */
            /* renamed from: doForward  reason: avoid collision after fix types in other method */
            public EnumLite doForward2(Integer num) {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public interface Converter<A, B> {
            A doBackward(B b);

            B doForward(A a2);
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class EntryAdapter implements Map.Entry<K, V> {
            private final Map.Entry<K, RealValue> realEntry;
            public final /* synthetic */ MapAdapter this$0;

            public EntryAdapter(MapAdapter mapAdapter, Map.Entry<K, RealValue> entry) {
            }

            @Override // java.util.Map.Entry
            public boolean equals(Object obj) {
            }

            @Override // java.util.Map.Entry
            public K getKey() {
            }

            @Override // java.util.Map.Entry
            public V getValue() {
            }

            @Override // java.util.Map.Entry
            public int hashCode() {
            }

            @Override // java.util.Map.Entry
            public V setValue(V v) {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class IteratorAdapter implements Iterator<Map.Entry<K, V>> {
            private final Iterator<Map.Entry<K, RealValue>> realIterator;
            public final /* synthetic */ MapAdapter this$0;

            public IteratorAdapter(MapAdapter mapAdapter, Iterator<Map.Entry<K, RealValue>> it) {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
            }

            @Override // java.util.Iterator
            public /* bridge */ /* synthetic */ Object next() {
            }

            @Override // java.util.Iterator
            public void remove() {
            }

            @Override // java.util.Iterator
            public Map.Entry<K, V> next() {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class SetAdapter extends AbstractSet<Map.Entry<K, V>> {
            private final Set<Map.Entry<K, RealValue>> realSet;
            public final /* synthetic */ MapAdapter this$0;

            public SetAdapter(MapAdapter mapAdapter, Set<Map.Entry<K, RealValue>> set) {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
            }
        }

        public MapAdapter(Map<K, RealValue> map, Converter<RealValue, V> converter) {
        }

        public static /* synthetic */ Converter access$000(MapAdapter mapAdapter) {
        }

        public static <T extends EnumLite> Converter<Integer, T> newEnumConverter(EnumLiteMap<T> enumLiteMap, T t) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(K k2, V v) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface ProtobufList<E> extends List<E>, RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        ProtobufList<E> mutableCopyWithCapacity(int i2);
    }

    private Internal() {
    }

    public static byte[] byteArrayDefaultValue(String str) {
    }

    public static ByteBuffer byteBufferDefaultValue(String str) {
    }

    public static ByteString bytesDefaultValue(String str) {
    }

    public static <T> T checkNotNull(T t) {
    }

    public static ByteBuffer copyByteBuffer(ByteBuffer byteBuffer) {
    }

    public static boolean equals(List<byte[]> list, List<byte[]> list2) {
    }

    public static boolean equalsByteBuffer(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
    }

    public static <T extends MessageLite> T getDefaultInstance(Class<T> cls) {
    }

    public static int hashBoolean(boolean z) {
    }

    public static int hashCode(List<byte[]> list) {
    }

    public static int hashCodeByteBuffer(List<ByteBuffer> list) {
    }

    public static int hashEnum(EnumLite enumLite) {
    }

    public static int hashEnumList(List<? extends EnumLite> list) {
    }

    public static int hashLong(long j2) {
    }

    public static boolean isValidUtf8(ByteString byteString) {
    }

    public static Object mergeMessage(Object obj, Object obj2) {
    }

    public static int partialHash(int i2, byte[] bArr, int i3, int i4) {
    }

    public static String stringDefaultValue(String str) {
    }

    public static byte[] toByteArray(String str) {
    }

    public static String toStringUtf8(byte[] bArr) {
    }

    public static <T> T checkNotNull(T t, String str) {
    }

    public static boolean isValidUtf8(byte[] bArr) {
    }

    public static boolean equalsByteBuffer(List<ByteBuffer> list, List<ByteBuffer> list2) {
    }

    public static int hashCode(byte[] bArr) {
    }

    public static int hashCodeByteBuffer(ByteBuffer byteBuffer) {
    }

    public static int hashCode(byte[] bArr, int i2, int i3) {
    }
}
