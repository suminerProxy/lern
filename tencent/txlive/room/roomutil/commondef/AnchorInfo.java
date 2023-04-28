package tencent.txlive.room.roomutil.commondef;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class AnchorInfo implements Parcelable {
    public static final Parcelable.Creator<AnchorInfo> CREATOR = null;
    public String accelerateURL;
    public String userAvatar;
    public String userID;
    public String userName;

    /* renamed from: tencent.txlive.room.roomutil.commondef.AnchorInfo$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class AnonymousClass1 implements Parcelable.Creator<AnchorInfo> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ AnchorInfo createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ AnchorInfo[] newArray(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: createFromParcel  reason: avoid collision after fix types in other method */
        public AnchorInfo createFromParcel2(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: newArray  reason: avoid collision after fix types in other method */
        public AnchorInfo[] newArray2(int i2) {
        }
    }

    public AnchorInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public int hashCode() {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public AnchorInfo(String str, String str2, String str3, String str4) {
    }

    public AnchorInfo(Parcel parcel) {
    }
}
