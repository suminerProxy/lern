package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class ParticipatingBean implements Parcelable {
    public static final Parcelable.Creator<ParticipatingBean> CREATOR = null;
    private int activityRoleType;
    private String avatar;
    private int follow;
    private String id;
    private boolean isHoster;
    private String name;
    private String nickName;
    private int sex;
    private int squadStatus;
    private String style;
    private int type;
    private int userType;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<ParticipatingBean> {
        public ParticipatingBean a(Parcel parcel) {
        }

        public ParticipatingBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ParticipatingBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ParticipatingBean[] newArray(int i2) {
        }
    }

    public ParticipatingBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public int getActivityRoleType() {
    }

    public String getAvatar() {
    }

    public int getFollow() {
    }

    public String getId() {
    }

    public String getName() {
    }

    public String getNickName() {
    }

    public int getSex() {
    }

    public int getSquadStatus() {
    }

    public String getStyle() {
    }

    public int getType() {
    }

    public int getUserType() {
    }

    public boolean isHoster() {
    }

    public void setActivityRoleType(int i2) {
    }

    public void setAvatar(String str) {
    }

    public void setFollow(int i2) {
    }

    public void setHoster(boolean z) {
    }

    public void setId(String str) {
    }

    public void setName(String str) {
    }

    public void setNickName(String str) {
    }

    public void setSex(int i2) {
    }

    public void setSquadStatus(int i2) {
    }

    public void setStyle(String str) {
    }

    public void setType(int i2) {
    }

    public void setUserType(int i2) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public ParticipatingBean(Parcel parcel) {
    }
}
