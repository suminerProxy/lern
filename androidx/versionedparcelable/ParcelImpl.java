package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;

@SuppressLint({"BanParcelableUsage"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = null;
    private final VersionedParcelable mParcel;

    /* renamed from: androidx.versionedparcelable.ParcelImpl$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass1 implements Parcelable.Creator<ParcelImpl> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ParcelImpl createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ParcelImpl[] newArray(int i2) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelImpl createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelImpl[] newArray(int i2) {
        }
    }

    public ParcelImpl(VersionedParcelable versionedParcelable) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public <T extends VersionedParcelable> T getVersionedParcel() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public ParcelImpl(Parcel parcel) {
    }
}
