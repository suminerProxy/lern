package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class GroupShowBean implements Parcelable {
    public static final Parcelable.Creator<GroupShowBean> CREATOR = null;
    private String avatar;
    private String id;
    private int isJoin;
    private int joinCount;
    private int joinStatus;
    private String name;
    private int size;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<GroupShowBean> {
        public GroupShowBean a(Parcel parcel) {
        }

        public GroupShowBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ GroupShowBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ GroupShowBean[] newArray(int i2) {
        }
    }

    public GroupShowBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String getAvatar() {
    }

    public String getId() {
    }

    public int getIsJoin() {
    }

    public int getJoinCount() {
    }

    public String getJoinCountStr() {
    }

    public int getJoinStatus() {
    }

    public String getName() {
    }

    public int getSize() {
    }

    public void setAvatar(String str) {
    }

    public void setId(String str) {
    }

    public void setIsJoin(int i2) {
    }

    public void setJoinCount(int i2) {
    }

    public void setJoinStatus(int i2) {
    }

    public void setName(String str) {
    }

    public void setSize(int i2) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public GroupShowBean(Parcel parcel) {
    }
}
