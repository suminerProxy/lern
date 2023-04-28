package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class LiveShowMenuEventMsgBean implements Parcelable {
    public static final Parcelable.Creator<LiveShowMenuEventMsgBean> CREATOR = null;
    public long beginTime;
    public long endTime;
    public int eventId;
    public String eventTitle;
    public int liveStatus;
    public String liveUserAvatar;
    public String liveUserId;
    public String liveUserName;
    public int liveUserType;
    public String roomId;
    public int showStatus;
    public String timeStr;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<LiveShowMenuEventMsgBean> {
        public LiveShowMenuEventMsgBean a(Parcel parcel) {
        }

        public LiveShowMenuEventMsgBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ LiveShowMenuEventMsgBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ LiveShowMenuEventMsgBean[] newArray(int i2) {
        }
    }

    public LiveShowMenuEventMsgBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public LiveShowMenuEventMsgBean(Parcel parcel) {
    }
}
