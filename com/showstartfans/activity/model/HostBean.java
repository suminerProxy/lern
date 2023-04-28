package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class HostBean implements Parcelable {
    public static final Parcelable.Creator<HostBean> CREATOR = null;
    private int activityRoleType;
    public String address;
    public String avatar;
    public String id;
    public int isCollect;
    public String name;
    public int relationship;
    public int userType;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<HostBean> {
        public HostBean a(Parcel parcel) {
        }

        public HostBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ HostBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ HostBean[] newArray(int i2) {
        }
    }

    public HostBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public int getActivityRoleType() {
    }

    public String getAddress() {
    }

    public String getAvatar() {
    }

    public String getId() {
    }

    public int getIsCollect() {
    }

    public String getName() {
    }

    public int getRelationship() {
    }

    public int getUserType() {
    }

    public void setActivityRoleType(int i2) {
    }

    public void setAddress(String str) {
    }

    public void setAvatar(String str) {
    }

    public void setId(String str) {
    }

    public void setIsCollect(int i2) {
    }

    public void setName(String str) {
    }

    public void setRelationship(int i2) {
    }

    public void setUserType(int i2) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public HostBean(Parcel parcel) {
    }
}
