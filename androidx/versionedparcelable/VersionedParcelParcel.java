package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import java.lang.reflect.Method;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class VersionedParcelParcel extends VersionedParcel {
    private static final boolean DEBUG = false;
    private static final String TAG = "VersionedParcelParcel";
    private int mCurrentField;
    private final int mEnd;
    private int mFieldId;
    private int mNextRead;
    private final int mOffset;
    private final Parcel mParcel;
    private final SparseIntArray mPositionLookup;
    private final String mPrefix;

    public VersionedParcelParcel(Parcel parcel) {
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void closeField() {
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public VersionedParcel createSubParcel() {
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

    private VersionedParcelParcel(Parcel parcel, int i2, int i3, String str, ArrayMap<String, Method> arrayMap, ArrayMap<String, Method> arrayMap2, ArrayMap<String, Class> arrayMap3) {
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeByteArray(byte[] bArr, int i2, int i3) {
    }
}
