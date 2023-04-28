package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class FansUserInfoBean implements Parcelable {
    public static final Parcelable.Creator<FansUserInfoBean> CREATOR = null;
    private String avatar;
    private String birthday;
    private int documentType;
    private int goodsCount;
    private int id;
    private String name;
    private String nickName;
    private int raiseCount;
    private int realNameStatus;
    private int sex;
    private String tel;
    private int type;
    public int userLevel;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<FansUserInfoBean> {
        public FansUserInfoBean a(Parcel parcel) {
        }

        public FansUserInfoBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ FansUserInfoBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ FansUserInfoBean[] newArray(int i2) {
        }
    }

    public FansUserInfoBean() {
    }

    public UserInfoBean converToUserInfoBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String getAvatar() {
    }

    public String getBirthday() {
    }

    public int getDocumentType() {
    }

    public int getGoodsCount() {
    }

    public int getId() {
    }

    public String getName() {
    }

    public String getNickName() {
    }

    public int getRaiseCount() {
    }

    public int getRealNameStatus() {
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

    public void setDocumentType(int i2) {
    }

    public void setGoodsCount(int i2) {
    }

    public void setId(int i2) {
    }

    public void setName(String str) {
    }

    public void setNickName(String str) {
    }

    public void setRaiseCount(int i2) {
    }

    public void setRealNameStatus(int i2) {
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

    public FansUserInfoBean(Parcel parcel) {
    }
}
