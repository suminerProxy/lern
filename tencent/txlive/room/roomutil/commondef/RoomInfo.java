package tencent.txlive.room.roomutil.commondef;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class RoomInfo implements Parcelable {
    public static final Parcelable.Creator<RoomInfo> CREATOR = null;
    public int audienceCount;
    public List<Audience> audiences;
    public String custom;
    public String mixedPlayURL;
    public List<AnchorInfo> pushers;
    public String roomCreator;
    public String roomID;
    public String roomInfo;
    public String roomName;

    /* renamed from: tencent.txlive.room.roomutil.commondef.RoomInfo$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class AnonymousClass1 implements Parcelable.Creator<RoomInfo> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ RoomInfo createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ RoomInfo[] newArray(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: createFromParcel  reason: avoid collision after fix types in other method */
        public RoomInfo createFromParcel2(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: newArray  reason: avoid collision after fix types in other method */
        public RoomInfo[] newArray2(int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class Audience {
        public String userAvatar;
        public String userID;
        public String userInfo;
        public String userName;

        public void transferUserInfo() {
        }
    }

    public RoomInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public RoomInfo(String str, String str2, String str3, String str4, String str5, List<AnchorInfo> list) {
    }

    public RoomInfo(Parcel parcel) {
    }
}
