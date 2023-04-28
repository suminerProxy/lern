package tencent.txlive.room.roomutil.commondef;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class LoginInfo implements Parcelable {
    public static final Parcelable.Creator<LoginInfo> CREATOR = null;
    public long sdkAppID;
    public String userAvatar;
    public String userID;
    public String userName;
    public int userRole;
    public String userSig;

    /* renamed from: tencent.txlive.room.roomutil.commondef.LoginInfo$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class AnonymousClass1 implements Parcelable.Creator<LoginInfo> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ LoginInfo createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ LoginInfo[] newArray(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: createFromParcel  reason: avoid collision after fix types in other method */
        public LoginInfo createFromParcel2(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: newArray  reason: avoid collision after fix types in other method */
        public LoginInfo[] newArray2(int i2) {
        }
    }

    public LoginInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public LoginInfo(int i2, String str, String str2, String str3, String str4, int i3) {
    }

    public LoginInfo(Parcel parcel) {
    }
}
