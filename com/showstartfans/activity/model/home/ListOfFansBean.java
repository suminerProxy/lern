package com.showstartfans.activity.model.home;

import android.os.Parcel;
import android.os.Parcelable;
import com.showstartfans.activity.model.UserInfoBean;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class ListOfFansBean implements Parcelable {
    public static final Parcelable.Creator<ListOfFansBean> CREATOR = null;
    private int age;
    private String avatar;
    private String distance;
    private int follow;
    private String range;
    private int sex;
    private String signature;
    private List<String> tags;
    private String userId;
    public int userLevel;
    private String userName;
    private int userType;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<ListOfFansBean> {
        public ListOfFansBean a(Parcel parcel) {
        }

        public ListOfFansBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ListOfFansBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ListOfFansBean[] newArray(int i2) {
        }
    }

    public ListOfFansBean() {
    }

    public UserInfoBean converToUserInfoBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public int getAge() {
    }

    public String getAvatar() {
    }

    public String getDistance() {
    }

    public int getFollow() {
    }

    public String getRange() {
    }

    public int getSex() {
    }

    public String getSignature() {
    }

    public List<String> getTags() {
    }

    public String getUserId() {
    }

    public String getUserName() {
    }

    public int getUserType() {
    }

    public void setAge(int i2) {
    }

    public void setAvatar(String str) {
    }

    public void setDistance(String str) {
    }

    public void setFollow(int i2) {
    }

    public void setRange(String str) {
    }

    public void setSex(int i2) {
    }

    public void setSignature(String str) {
    }

    public void setTags(List<String> list) {
    }

    public void setUserId(String str) {
    }

    public void setUserName(String str) {
    }

    public void setUserType(int i2) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public ListOfFansBean(Parcel parcel) {
    }
}
