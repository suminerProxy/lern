package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class LiveRoomDetailBean implements Parcelable {
    public static final Parcelable.Creator<LiveRoomDetailBean> CREATOR = null;
    public int canWatch;
    public String groupId;
    public int isFollow;
    public String liveEventId;
    public int liveStatus;
    public String liveThemeId;
    public String loginUserAvatar;
    public String loginUserId;
    public String loginUserName;
    public String loginUserType;
    public LiveDetailNoticeInfoBean noticeInfo;
    public int onlineNum;
    public long payTargetId;
    public String payTips;
    public String payUrl;
    public String popularityStr;
    public String pullStreamUrl;
    public String roomId;
    public long sdkAppId;
    public String userAvatar;
    public String userId;
    public String userName;
    public int userRole;
    public String userSig;
    public int userType;
    public int watchFreeTime;
    public int watchType;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<LiveRoomDetailBean> {
        public LiveRoomDetailBean a(Parcel parcel) {
        }

        public LiveRoomDetailBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ LiveRoomDetailBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ LiveRoomDetailBean[] newArray(int i2) {
        }
    }

    public LiveRoomDetailBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public LiveRoomDetailBean(Parcel parcel) {
    }
}
