package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class UserInfoBaseBean implements Parcelable {
    public static final Parcelable.Creator<UserInfoBaseBean> CREATOR = null;
    private String avatar;
    private String birthday;
    private String id;
    private String name;
    private String nickName;
    private int sex;
    private String tel;
    private int type;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<UserInfoBaseBean> {
        public UserInfoBaseBean a(Parcel parcel) {
        }

        public UserInfoBaseBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ UserInfoBaseBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ UserInfoBaseBean[] newArray(int i2) {
        }
    }

    public UserInfoBaseBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String getAvatar() {
    }

    public String getBirthday() {
    }

    public String getId() {
    }

    public String getName() {
    }

    public String getNickName() {
    }

    public int getSex() {
    }

    public String getTel() {
    }

    public int getType() {
    }

    public void setAvatar(String str) {
    }

    public void setBirthday(String str) {
    }

    public void setId(String str) {
    }

    public void setName(String str) {
    }

    public void setNickName(String str) {
    }

    public void setSex(int i2) {
    }

    public void setTel(String str) {
    }

    public void setType(int i2) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public UserInfoBaseBean(Parcel parcel) {
    }
}
