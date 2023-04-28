package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class UserQRCodeInfoBean implements Parcelable {
    public static final Parcelable.Creator<UserQRCodeInfoBean> CREATOR = null;
    private String avatar;
    private String balanceUrl;
    private String code;
    private String name;
    private int status;
    private int userId;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<UserQRCodeInfoBean> {
        public UserQRCodeInfoBean a(Parcel parcel) {
        }

        public UserQRCodeInfoBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ UserQRCodeInfoBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ UserQRCodeInfoBean[] newArray(int i2) {
        }
    }

    public UserQRCodeInfoBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String getAvatar() {
    }

    public String getBalanceUrl() {
    }

    public String getCode() {
    }

    public String getName() {
    }

    public int getStatus() {
    }

    public int getUserId() {
    }

    public void setAvatar(String str) {
    }

    public void setBalanceUrl(String str) {
    }

    public void setCode(String str) {
    }

    public void setName(String str) {
    }

    public void setStatus(int i2) {
    }

    public void setUserId(int i2) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public UserQRCodeInfoBean(Parcel parcel) {
    }
}
