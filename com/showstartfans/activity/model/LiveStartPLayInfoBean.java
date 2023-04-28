package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class LiveStartPLayInfoBean implements Parcelable {
    public static final Parcelable.Creator<LiveStartPLayInfoBean> CREATOR = null;
    public long beginTime;
    public String beginTimeStr;
    public long countDown;
    public int isReserve;
    public String liveEventId;
    public String liveEventTitle;
    public int liveStatus;
    public String liveThemeId;
    public String liveThemeTitle;
    public String roomId;
    public String waitingImg;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<LiveStartPLayInfoBean> {
        public LiveStartPLayInfoBean a(Parcel parcel) {
        }

        public LiveStartPLayInfoBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ LiveStartPLayInfoBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ LiveStartPLayInfoBean[] newArray(int i2) {
        }
    }

    public LiveStartPLayInfoBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public LiveStartPLayInfoBean(Parcel parcel) {
    }
}
