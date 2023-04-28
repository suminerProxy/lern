package skin.support.collection;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class SimpleArrayMap<K, V> {
    private static final int BASE_SIZE = 4;
    private static final int CACHE_SIZE = 10;
    private static final boolean CONCURRENT_MODIFICATION_EXCEPTIONS = true;
    private static final boolean DEBUG = false;
    private static final String TAG = "ArrayMap";
    public static Object[] mBaseCache;
    public static int mBaseCacheSize;
    public static Object[] mTwiceBaseCache;
    public static int mTwiceBaseCacheSize;
    public Object[] mArray;
    public int[] mHashes;
    public int mSize;

    public SimpleArrayMap() {
    }

    private void allocArrays(int i2) {
    }

    private static int binarySearchHashes(int[] iArr, int i2, int i3) {
    }

    private static void freeArrays(int[] iArr, Object[] objArr, int i2) {
    }

    public void clear() {
    }

    public boolean containsKey(Object obj) {
    }

    public boolean containsValue(Object obj) {
    }

    public void ensureCapacity(int i2) {
    }

    public boolean equals(Object obj) {
    }

    public V get(Object obj) {
    }

    public int hashCode() {
    }

    public int indexOf(Object obj, int i2) {
    }

    public int indexOfKey(Object obj) {
    }

    public int indexOfNull() {
    }

    public int indexOfValue(Object obj) {
    }

    public boolean isEmpty() {
    }

    public K keyAt(int i2) {
    }

    public V put(K k2, V v) {
    }

    public void putAll(SimpleArrayMap<? extends K, ? extends V> simpleArrayMap) {
    }

    public V remove(Object obj) {
    }

    public V removeAt(int i2) {
    }

    public V setValueAt(int i2, V v) {
    }

    public int size() {
    }

    public String toString() {
    }

    public V valueAt(int i2) {
    }

    public SimpleArrayMap(int i2) {
    }

    public SimpleArrayMap(SimpleArrayMap<K, V> simpleArrayMap) {
    }
}
