package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class TeamUserMsgBean implements Parcelable {
    public static final Parcelable.Creator<TeamUserMsgBean> CREATOR = null;
    public String avatar;
    public String name;
    public String userId;
    public int userType;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<TeamUserMsgBean> {
        public TeamUserMsgBean a(Parcel parcel) {
        }

        public TeamUserMsgBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ TeamUserMsgBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ TeamUserMsgBean[] newArray(int i2) {
        }
    }

    public TeamUserMsgBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public TeamUserMsgBean(Parcel parcel) {
    }
}
