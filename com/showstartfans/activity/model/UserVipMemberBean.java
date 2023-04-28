package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class UserVipMemberBean implements Parcelable {
    public static final Parcelable.Creator<UserVipMemberBean> CREATOR = null;
    private String avatar;
    private String memberExpireDate;
    private String memberStatus;
    private String name;
    private String userId;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<UserVipMemberBean> {
        public UserVipMemberBean a(Parcel parcel) {
        }

        public UserVipMemberBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ UserVipMemberBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ UserVipMemberBean[] newArray(int i2) {
        }
    }

    public UserVipMemberBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String getAvatar() {
    }

    public String getMemberExpireDate() {
    }

    public String getMemberStatus() {
    }

    public String getName() {
    }

    public String getUserId() {
    }

    public void setAvatar(String str) {
    }

    public void setMemberExpireDate(String str) {
    }

    public void setMemberStatus(String str) {
    }

    public void setName(String str) {
    }

    public void setUserId(String str) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public UserVipMemberBean(Parcel parcel) {
    }
}
