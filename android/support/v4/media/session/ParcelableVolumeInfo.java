package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = null;
    public int audioStream;
    public int controlType;
    public int currentVolume;
    public int maxVolume;
    public int volumeType;

    /* renamed from: android.support.v4.media.session.ParcelableVolumeInfo$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements Parcelable.Creator<ParcelableVolumeInfo> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ParcelableVolumeInfo createFromParcel(Parcel in) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ParcelableVolumeInfo[] newArray(int size) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableVolumeInfo createFromParcel(Parcel in) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableVolumeInfo[] newArray(int size) {
        }
    }

    public ParcelableVolumeInfo(int volumeType, int audioStream, int controlType, int maxVolume, int currentVolume) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
    }

    public ParcelableVolumeInfo(Parcel from) {
    }
}
