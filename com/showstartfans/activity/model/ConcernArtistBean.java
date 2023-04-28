package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class ConcernArtistBean implements Parcelable {
    public static final Parcelable.Creator<ConcernArtistBean> CREATOR = null;
    private static final long serialVersionUID = -1365899487830892128L;
    private int activityNum;
    private int age;
    public String alias;
    private String avatar;
    private String cityName;
    private int follow;
    private String id;
    private String name;
    private int relationship;
    private int sex;
    private List<String> styles;
    private int type;
    public int userLevel;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<ConcernArtistBean> {
        public ConcernArtistBean a(Parcel parcel) {
        }

        public ConcernArtistBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ConcernArtistBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ConcernArtistBean[] newArray(int i2) {
        }
    }

    public ConcernArtistBean() {
    }

    public static long getSerialVersionUID() {
    }

    public static long getSerialversionuid() {
    }

    public UserInfoBean converToUserInfoBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public int getActivityNum() {
    }

    public int getAge() {
    }

    public String getAvatar() {
    }

    public String getCityName() {
    }

    public int getFollow() {
    }

    public String getId() {
    }

    public String getName() {
    }

    public int getRelationship() {
    }

    public int getSex() {
    }

    public List<String> getStyles() {
    }

    public int getType() {
    }

    public void setActivityNum(int i2) {
    }

    public void setAge(int i2) {
    }

    public void setAvatar(String str) {
    }

    public void setCityName(String str) {
    }

    public void setFollow(int i2) {
    }

    public void setId(String str) {
    }

    public void setName(String str) {
    }

    public void setRelationship(int i2) {
    }

    public void setSex(int i2) {
    }

    public void setStyles(List<String> list) {
    }

    public void setType(int i2) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public ConcernArtistBean(Parcel parcel) {
    }
}
