package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.nio.charset.Charset;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class VersionedParcelStream extends VersionedParcel {
    private static final int TYPE_BOOLEAN = 5;
    private static final int TYPE_BOOLEAN_ARRAY = 6;
    private static final int TYPE_DOUBLE = 7;
    private static final int TYPE_DOUBLE_ARRAY = 8;
    private static final int TYPE_FLOAT = 13;
    private static final int TYPE_FLOAT_ARRAY = 14;
    private static final int TYPE_INT = 9;
    private static final int TYPE_INT_ARRAY = 10;
    private static final int TYPE_LONG = 11;
    private static final int TYPE_LONG_ARRAY = 12;
    private static final int TYPE_NULL = 0;
    private static final int TYPE_STRING = 3;
    private static final int TYPE_STRING_ARRAY = 4;
    private static final int TYPE_SUB_BUNDLE = 1;
    private static final int TYPE_SUB_PERSISTABLE_BUNDLE = 2;
    private static final Charset UTF_16 = null;
    public int mCount;
    private DataInputStream mCurrentInput;
    private DataOutputStream mCurrentOutput;
    private FieldBuffer mFieldBuffer;
    private int mFieldId;
    public int mFieldSize;
    private boolean mIgnoreParcelables;
    private final DataInputStream mMasterInput;
    private final DataOutputStream mMasterOutput;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class FieldBuffer {
        public final DataOutputStream mDataStream;
        private final int mFieldId;
        public final ByteArrayOutputStream mOutput;
        private final DataOutputStream mTarget;

        public FieldBuffer(int i2, DataOutputStream dataOutputStream) {
        }

        public void flushField() throws IOException {
        }
    }

    public VersionedParcelStream(InputStream inputStream, OutputStream outputStream) {
    }

    private void readObject(int i2, String str, Bundle bundle) {
    }

    private void writeObject(Object obj) {
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void closeField() {
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public VersionedParcel createSubParcel() {
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean isStream() {
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean readBoolean() {
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public Bundle readBundle() {
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public byte[] readByteArray() {
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public CharSequence readCharSequence() {
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public double readDouble() {
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean readField(int i2) {
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public float readFloat() {
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public int readInt() {
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public long readLong() {
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public <T extends Parcelable> T readParcelable() {
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public String readString() {
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public IBinder readStrongBinder() {
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void setOutputField(int i2) {
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void setSerializationFlags(boolean z, boolean z2) {
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeBoolean(boolean z) {
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeBundle(Bundle bundle) {
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeByteArray(byte[] bArr) {
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeCharSequence(CharSequence charSequence) {
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeDouble(double d2) {
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeFloat(float f2) {
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeInt(int i2) {
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeLong(long j2) {
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeParcelable(Parcelable parcelable) {
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeString(String str) {
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeStrongBinder(IBinder iBinder) {
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeStrongInterface(IInterface iInterface) {
    }

    private VersionedParcelStream(InputStream inputStream, OutputStream outputStream, ArrayMap<String, Method> arrayMap, ArrayMap<String, Method> arrayMap2, ArrayMap<String, Class> arrayMap3) {
    }

    /* renamed from: androidx.versionedparcelable.VersionedParcelStream$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 extends FilterInputStream {
        public final /* synthetic */ VersionedParcelStream this$0;

        public AnonymousClass1(VersionedParcelStream versionedParcelStream, InputStream inputStream) {
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j2) throws IOException {
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) throws IOException {
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeByteArray(byte[] bArr, int i2, int i3) {
    }
}
