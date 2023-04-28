package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseBooleanArray;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class VersionedParcel {
    private static final int EX_BAD_PARCELABLE = -2;
    private static final int EX_ILLEGAL_ARGUMENT = -3;
    private static final int EX_ILLEGAL_STATE = -5;
    private static final int EX_NETWORK_MAIN_THREAD = -6;
    private static final int EX_NULL_POINTER = -4;
    private static final int EX_PARCELABLE = -9;
    private static final int EX_SECURITY = -1;
    private static final int EX_UNSUPPORTED_OPERATION = -7;
    private static final String TAG = "VersionedParcel";
    private static final int TYPE_BINDER = 5;
    private static final int TYPE_FLOAT = 8;
    private static final int TYPE_INTEGER = 7;
    private static final int TYPE_PARCELABLE = 2;
    private static final int TYPE_SERIALIZABLE = 3;
    private static final int TYPE_STRING = 4;
    private static final int TYPE_VERSIONED_PARCELABLE = 1;
    public final ArrayMap<String, Class> mParcelizerCache;
    public final ArrayMap<String, Method> mReadCache;
    public final ArrayMap<String, Method> mWriteCache;

    /* renamed from: androidx.versionedparcelable.VersionedParcel$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 extends ObjectInputStream {
        public final /* synthetic */ VersionedParcel this$0;

        public AnonymousClass1(VersionedParcel versionedParcel, InputStream inputStream) {
        }

        @Override // java.io.ObjectInputStream
        public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class ParcelException extends RuntimeException {
        public ParcelException(Throwable th) {
        }
    }

    public VersionedParcel(ArrayMap<String, Method> arrayMap, ArrayMap<String, Method> arrayMap2, ArrayMap<String, Class> arrayMap3) {
    }

    private Exception createException(int i2, String str) {
    }

    private Class findParcelClass(Class<? extends VersionedParcelable> cls) throws ClassNotFoundException {
    }

    private Method getReadMethod(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
    }

    @NonNull
    public static Throwable getRootCause(@NonNull Throwable th) {
    }

    private <T> int getType(T t) {
    }

    private Method getWriteMethod(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
    }

    private <T, S extends Collection<T>> S readCollection(S s) {
    }

    private int readExceptionCode() {
    }

    private <T> void writeCollection(Collection<T> collection, int i2) {
    }

    private void writeVersionedParcelableCreator(VersionedParcelable versionedParcelable) {
    }

    public abstract void closeField();

    public abstract VersionedParcel createSubParcel();

    public boolean isStream() {
    }

    public <T> T[] readArray(T[] tArr, int i2) {
    }

    public abstract boolean readBoolean();

    public boolean readBoolean(boolean z, int i2) {
    }

    public boolean[] readBooleanArray(boolean[] zArr, int i2) {
    }

    public abstract Bundle readBundle();

    public Bundle readBundle(Bundle bundle, int i2) {
    }

    public byte readByte(byte b, int i2) {
    }

    public abstract byte[] readByteArray();

    public byte[] readByteArray(byte[] bArr, int i2) {
    }

    public char[] readCharArray(char[] cArr, int i2) {
    }

    public abstract CharSequence readCharSequence();

    public CharSequence readCharSequence(CharSequence charSequence, int i2) {
    }

    public abstract double readDouble();

    public double readDouble(double d2, int i2) {
    }

    public double[] readDoubleArray(double[] dArr, int i2) {
    }

    public Exception readException(Exception exc, int i2) {
    }

    public abstract boolean readField(int i2);

    public abstract float readFloat();

    public float readFloat(float f2, int i2) {
    }

    public float[] readFloatArray(float[] fArr, int i2) {
    }

    public <T extends VersionedParcelable> T readFromParcel(String str, VersionedParcel versionedParcel) {
    }

    public abstract int readInt();

    public int readInt(int i2, int i3) {
    }

    public int[] readIntArray(int[] iArr, int i2) {
    }

    public <T> List<T> readList(List<T> list, int i2) {
    }

    public abstract long readLong();

    public long readLong(long j2, int i2) {
    }

    public long[] readLongArray(long[] jArr, int i2) {
    }

    public <K, V> Map<K, V> readMap(Map<K, V> map, int i2) {
    }

    public abstract <T extends Parcelable> T readParcelable();

    public <T extends Parcelable> T readParcelable(T t, int i2) {
    }

    public Serializable readSerializable() {
    }

    public <T> Set<T> readSet(Set<T> set, int i2) {
    }

    @RequiresApi(api = 21)
    public Size readSize(Size size, int i2) {
    }

    @RequiresApi(api = 21)
    public SizeF readSizeF(SizeF sizeF, int i2) {
    }

    public SparseBooleanArray readSparseBooleanArray(SparseBooleanArray sparseBooleanArray, int i2) {
    }

    public abstract String readString();

    public String readString(String str, int i2) {
    }

    public abstract IBinder readStrongBinder();

    public IBinder readStrongBinder(IBinder iBinder, int i2) {
    }

    public <T extends VersionedParcelable> T readVersionedParcelable(T t, int i2) {
    }

    public abstract void setOutputField(int i2);

    public void setSerializationFlags(boolean z, boolean z2) {
    }

    public <T> void writeArray(T[] tArr, int i2) {
    }

    public abstract void writeBoolean(boolean z);

    public void writeBoolean(boolean z, int i2) {
    }

    public void writeBooleanArray(boolean[] zArr, int i2) {
    }

    public abstract void writeBundle(Bundle bundle);

    public void writeBundle(Bundle bundle, int i2) {
    }

    public void writeByte(byte b, int i2) {
    }

    public abstract void writeByteArray(byte[] bArr);

    public void writeByteArray(byte[] bArr, int i2) {
    }

    public abstract void writeByteArray(byte[] bArr, int i2, int i3);

    public void writeCharArray(char[] cArr, int i2) {
    }

    public abstract void writeCharSequence(CharSequence charSequence);

    public void writeCharSequence(CharSequence charSequence, int i2) {
    }

    public abstract void writeDouble(double d2);

    public void writeDouble(double d2, int i2) {
    }

    public void writeDoubleArray(double[] dArr, int i2) {
    }

    public void writeException(Exception exc, int i2) {
    }

    public abstract void writeFloat(float f2);

    public void writeFloat(float f2, int i2) {
    }

    public void writeFloatArray(float[] fArr, int i2) {
    }

    public abstract void writeInt(int i2);

    public void writeInt(int i2, int i3) {
    }

    public void writeIntArray(int[] iArr, int i2) {
    }

    public <T> void writeList(List<T> list, int i2) {
    }

    public abstract void writeLong(long j2);

    public void writeLong(long j2, int i2) {
    }

    public void writeLongArray(long[] jArr, int i2) {
    }

    public <K, V> void writeMap(Map<K, V> map, int i2) {
    }

    public void writeNoException() {
    }

    public abstract void writeParcelable(Parcelable parcelable);

    public void writeParcelable(Parcelable parcelable, int i2) {
    }

    public void writeSerializable(Serializable serializable, int i2) {
    }

    public <T> void writeSet(Set<T> set, int i2) {
    }

    @RequiresApi(api = 21)
    public void writeSize(Size size, int i2) {
    }

    @RequiresApi(api = 21)
    public void writeSizeF(SizeF sizeF, int i2) {
    }

    public void writeSparseBooleanArray(SparseBooleanArray sparseBooleanArray, int i2) {
    }

    public abstract void writeString(String str);

    public void writeString(String str, int i2) {
    }

    public abstract void writeStrongBinder(IBinder iBinder);

    public void writeStrongBinder(IBinder iBinder, int i2) {
    }

    public abstract void writeStrongInterface(IInterface iInterface);

    public void writeStrongInterface(IInterface iInterface, int i2) {
    }

    public <T extends VersionedParcelable> void writeToParcel(T t, VersionedParcel versionedParcel) {
    }

    public void writeVersionedParcelable(VersionedParcelable versionedParcelable, int i2) {
    }

    private <T> void writeCollection(Collection<T> collection) {
    }

    private void writeSerializable(Serializable serializable) {
    }

    public <T> T[] readArray(T[] tArr) {
    }

    public boolean[] readBooleanArray() {
    }

    public double[] readDoubleArray() {
    }

    public float[] readFloatArray() {
    }

    public int[] readIntArray() {
    }

    public long[] readLongArray() {
    }

    public <T extends VersionedParcelable> T readVersionedParcelable() {
    }

    public <T> void writeArray(T[] tArr) {
    }

    public void writeBooleanArray(boolean[] zArr) {
    }

    public void writeByteArray(byte[] bArr, int i2, int i3, int i4) {
    }

    public void writeDoubleArray(double[] dArr) {
    }

    public void writeFloatArray(float[] fArr) {
    }

    public void writeIntArray(int[] iArr) {
    }

    public void writeLongArray(long[] jArr) {
    }

    public void writeVersionedParcelable(VersionedParcelable versionedParcelable) {
    }

    private Exception readException(int i2, String str) {
    }
}
