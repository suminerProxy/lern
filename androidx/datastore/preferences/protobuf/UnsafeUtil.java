package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class UnsafeUtil {
    private static final long BOOLEAN_ARRAY_BASE_OFFSET = 0;
    private static final long BOOLEAN_ARRAY_INDEX_SCALE = 0;
    private static final long BUFFER_ADDRESS_OFFSET = 0;
    private static final int BYTE_ARRAY_ALIGNMENT = 0;
    public static final long BYTE_ARRAY_BASE_OFFSET = 0;
    private static final long DOUBLE_ARRAY_BASE_OFFSET = 0;
    private static final long DOUBLE_ARRAY_INDEX_SCALE = 0;
    private static final long FLOAT_ARRAY_BASE_OFFSET = 0;
    private static final long FLOAT_ARRAY_INDEX_SCALE = 0;
    private static final boolean HAS_UNSAFE_ARRAY_OPERATIONS = false;
    private static final boolean HAS_UNSAFE_BYTEBUFFER_OPERATIONS = false;
    private static final long INT_ARRAY_BASE_OFFSET = 0;
    private static final long INT_ARRAY_INDEX_SCALE = 0;
    private static final boolean IS_ANDROID_32 = false;
    private static final boolean IS_ANDROID_64 = false;
    public static final boolean IS_BIG_ENDIAN = false;
    private static final long LONG_ARRAY_BASE_OFFSET = 0;
    private static final long LONG_ARRAY_INDEX_SCALE = 0;
    private static final MemoryAccessor MEMORY_ACCESSOR = null;
    private static final Class<?> MEMORY_CLASS = null;
    private static final long OBJECT_ARRAY_BASE_OFFSET = 0;
    private static final long OBJECT_ARRAY_INDEX_SCALE = 0;
    private static final int STRIDE = 8;
    private static final int STRIDE_ALIGNMENT_MASK = 7;
    private static final Unsafe UNSAFE = null;
    private static final Logger logger = null;

    /* renamed from: androidx.datastore.preferences.protobuf.UnsafeUtil$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass1 implements PrivilegedExceptionAction<Unsafe> {
        @Override // java.security.PrivilegedExceptionAction
        public /* bridge */ /* synthetic */ Unsafe run() throws Exception {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* renamed from: run  reason: avoid collision after fix types in other method */
        public Unsafe run2() throws Exception {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class Android32MemoryAccessor extends MemoryAccessor {
        private static final long SMALL_ADDRESS_MASK = -1;

        public Android32MemoryAccessor(Unsafe unsafe) {
        }

        private static int smallAddress(long j2) {
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void copyMemory(long j2, byte[] bArr, long j3, long j4) {
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public boolean getBoolean(Object obj, long j2) {
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(long j2) {
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public double getDouble(Object obj, long j2) {
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public float getFloat(Object obj, long j2) {
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public int getInt(long j2) {
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public long getLong(long j2) {
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public Object getStaticObject(java.lang.reflect.Field field) {
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putBoolean(Object obj, long j2, boolean z) {
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(long j2, byte b) {
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putDouble(Object obj, long j2, double d2) {
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putFloat(Object obj, long j2, float f2) {
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putInt(long j2, int i2) {
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putLong(long j2, long j3) {
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void copyMemory(byte[] bArr, long j2, long j3, long j4) {
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(Object obj, long j2) {
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(Object obj, long j2, byte b) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class Android64MemoryAccessor extends MemoryAccessor {
        public Android64MemoryAccessor(Unsafe unsafe) {
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void copyMemory(long j2, byte[] bArr, long j3, long j4) {
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public boolean getBoolean(Object obj, long j2) {
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(long j2) {
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public double getDouble(Object obj, long j2) {
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public float getFloat(Object obj, long j2) {
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public int getInt(long j2) {
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public long getLong(long j2) {
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public Object getStaticObject(java.lang.reflect.Field field) {
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putBoolean(Object obj, long j2, boolean z) {
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(long j2, byte b) {
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putDouble(Object obj, long j2, double d2) {
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putFloat(Object obj, long j2, float f2) {
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putInt(long j2, int i2) {
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putLong(long j2, long j3) {
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void copyMemory(byte[] bArr, long j2, long j3, long j4) {
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(Object obj, long j2) {
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(Object obj, long j2, byte b) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class JvmMemoryAccessor extends MemoryAccessor {
        public JvmMemoryAccessor(Unsafe unsafe) {
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void copyMemory(long j2, byte[] bArr, long j3, long j4) {
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public boolean getBoolean(Object obj, long j2) {
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(long j2) {
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public double getDouble(Object obj, long j2) {
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public float getFloat(Object obj, long j2) {
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public int getInt(long j2) {
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public long getLong(long j2) {
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public Object getStaticObject(java.lang.reflect.Field field) {
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putBoolean(Object obj, long j2, boolean z) {
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(long j2, byte b) {
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putDouble(Object obj, long j2, double d2) {
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putFloat(Object obj, long j2, float f2) {
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putInt(long j2, int i2) {
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putLong(long j2, long j3) {
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void copyMemory(byte[] bArr, long j2, long j3, long j4) {
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(Object obj, long j2) {
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(Object obj, long j2, byte b) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static abstract class MemoryAccessor {
        public Unsafe unsafe;

        public MemoryAccessor(Unsafe unsafe) {
        }

        public final int arrayBaseOffset(Class<?> cls) {
        }

        public final int arrayIndexScale(Class<?> cls) {
        }

        public abstract void copyMemory(long j2, byte[] bArr, long j3, long j4);

        public abstract void copyMemory(byte[] bArr, long j2, long j3, long j4);

        public abstract boolean getBoolean(Object obj, long j2);

        public abstract byte getByte(long j2);

        public abstract byte getByte(Object obj, long j2);

        public abstract double getDouble(Object obj, long j2);

        public abstract float getFloat(Object obj, long j2);

        public abstract int getInt(long j2);

        public final int getInt(Object obj, long j2) {
        }

        public abstract long getLong(long j2);

        public final long getLong(Object obj, long j2) {
        }

        public final Object getObject(Object obj, long j2) {
        }

        public abstract Object getStaticObject(java.lang.reflect.Field field);

        public final long objectFieldOffset(java.lang.reflect.Field field) {
        }

        public abstract void putBoolean(Object obj, long j2, boolean z);

        public abstract void putByte(long j2, byte b);

        public abstract void putByte(Object obj, long j2, byte b);

        public abstract void putDouble(Object obj, long j2, double d2);

        public abstract void putFloat(Object obj, long j2, float f2);

        public abstract void putInt(long j2, int i2);

        public final void putInt(Object obj, long j2, int i2) {
        }

        public abstract void putLong(long j2, long j3);

        public final void putLong(Object obj, long j2, long j3) {
        }

        public final void putObject(Object obj, long j2, Object obj2) {
        }
    }

    private UnsafeUtil() {
    }

    public static /* synthetic */ byte access$000(Object obj, long j2) {
    }

    public static /* synthetic */ byte access$100(Object obj, long j2) {
    }

    public static /* synthetic */ void access$200(Object obj, long j2, byte b) {
    }

    public static /* synthetic */ void access$300(Object obj, long j2, byte b) {
    }

    public static /* synthetic */ boolean access$400(Object obj, long j2) {
    }

    public static /* synthetic */ boolean access$500(Object obj, long j2) {
    }

    public static /* synthetic */ void access$600(Object obj, long j2, boolean z) {
    }

    public static /* synthetic */ void access$700(Object obj, long j2, boolean z) {
    }

    public static long addressOffset(ByteBuffer byteBuffer) {
    }

    public static <T> T allocateInstance(Class<T> cls) {
    }

    private static int arrayBaseOffset(Class<?> cls) {
    }

    private static int arrayIndexScale(Class<?> cls) {
    }

    private static java.lang.reflect.Field bufferAddressField() {
    }

    public static void copyMemory(byte[] bArr, long j2, long j3, long j4) {
    }

    private static boolean determineAndroidSupportByAddressSize(Class<?> cls) {
    }

    private static java.lang.reflect.Field field(Class<?> cls, String str) {
    }

    private static long fieldOffset(java.lang.reflect.Field field) {
    }

    private static int firstDifferingByteIndexNativeEndian(long j2, long j3) {
    }

    public static boolean getBoolean(Object obj, long j2) {
    }

    private static boolean getBooleanBigEndian(Object obj, long j2) {
    }

    private static boolean getBooleanLittleEndian(Object obj, long j2) {
    }

    public static byte getByte(Object obj, long j2) {
    }

    private static byte getByteBigEndian(Object obj, long j2) {
    }

    private static byte getByteLittleEndian(Object obj, long j2) {
    }

    public static double getDouble(Object obj, long j2) {
    }

    public static float getFloat(Object obj, long j2) {
    }

    public static int getInt(Object obj, long j2) {
    }

    public static long getLong(Object obj, long j2) {
    }

    private static MemoryAccessor getMemoryAccessor() {
    }

    public static Object getObject(Object obj, long j2) {
    }

    public static Object getStaticObject(java.lang.reflect.Field field) {
    }

    public static Unsafe getUnsafe() {
    }

    public static boolean hasUnsafeArrayOperations() {
    }

    public static boolean hasUnsafeByteBufferOperations() {
    }

    public static boolean isAndroid64() {
    }

    public static int mismatch(byte[] bArr, int i2, byte[] bArr2, int i3, int i4) {
    }

    public static long objectFieldOffset(java.lang.reflect.Field field) {
    }

    public static void putBoolean(Object obj, long j2, boolean z) {
    }

    private static void putBooleanBigEndian(Object obj, long j2, boolean z) {
    }

    private static void putBooleanLittleEndian(Object obj, long j2, boolean z) {
    }

    public static void putByte(Object obj, long j2, byte b) {
    }

    private static void putByteBigEndian(Object obj, long j2, byte b) {
    }

    private static void putByteLittleEndian(Object obj, long j2, byte b) {
    }

    public static void putDouble(Object obj, long j2, double d2) {
    }

    public static void putFloat(Object obj, long j2, float f2) {
    }

    public static void putInt(Object obj, long j2, int i2) {
    }

    public static void putLong(Object obj, long j2, long j3) {
    }

    public static void putObject(Object obj, long j2, Object obj2) {
    }

    private static boolean supportsUnsafeArrayOperations() {
    }

    private static boolean supportsUnsafeByteBufferOperations() {
    }

    public static void copyMemory(long j2, byte[] bArr, long j3, long j4) {
    }

    public static boolean getBoolean(boolean[] zArr, long j2) {
    }

    public static byte getByte(byte[] bArr, long j2) {
    }

    public static double getDouble(double[] dArr, long j2) {
    }

    public static float getFloat(float[] fArr, long j2) {
    }

    public static int getInt(int[] iArr, long j2) {
    }

    public static long getLong(long[] jArr, long j2) {
    }

    public static Object getObject(Object[] objArr, long j2) {
    }

    public static void putBoolean(boolean[] zArr, long j2, boolean z) {
    }

    public static void putByte(byte[] bArr, long j2, byte b) {
    }

    public static void putDouble(double[] dArr, long j2, double d2) {
    }

    public static void putFloat(float[] fArr, long j2, float f2) {
    }

    public static void putInt(int[] iArr, long j2, int i2) {
    }

    public static void putLong(long[] jArr, long j2, long j3) {
    }

    public static void putObject(Object[] objArr, long j2, Object obj) {
    }

    public static void copyMemory(byte[] bArr, long j2, byte[] bArr2, long j3, long j4) {
    }

    public static byte getByte(long j2) {
    }

    public static int getInt(long j2) {
    }

    public static long getLong(long j2) {
    }

    public static void putByte(long j2, byte b) {
    }

    public static void putInt(long j2, int i2) {
    }

    public static void putLong(long j2, long j3) {
    }
}
