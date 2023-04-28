package tencent.txlive.room.roomutil.commondef;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class TCUserInfo implements Parcelable {
    public static final Parcelable.Creator<TCUserInfo> CREATOR = null;
    public String sex;
    public String userAvatar;
    public String userId;
    public String userName;

    /* renamed from: tencent.txlive.room.roomutil.commondef.TCUserInfo$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class AnonymousClass1 implements Parcelable.Creator<TCUserInfo> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ TCUserInfo createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ TCUserInfo[] newArray(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: createFromParcel  reason: avoid collision after fix types in other method */
        public TCUserInfo createFromParcel2(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: newArray  reason: avoid collision after fix types in other method */
        public TCUserInfo[] newArray2(int i2) {
        }
    }

    public TCUserInfo() {
    }

    public static TCUserInfo getUserInfo() {
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

    public TCUserInfo(Parcel parcel) {
    }
}
