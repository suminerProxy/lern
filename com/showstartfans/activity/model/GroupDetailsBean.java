package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class GroupDetailsBean implements Parcelable {
    public static final Parcelable.Creator<GroupDetailsBean> CREATOR = null;
    private GroupInfoBean groupInfo;
    private List<GroupMemberInfoBean> managerList;
    private List<GroupMemberInfoBean> memberList;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<GroupDetailsBean> {
        public GroupDetailsBean a(Parcel parcel) {
        }

        public GroupDetailsBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ GroupDetailsBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ GroupDetailsBean[] newArray(int i2) {
        }
    }

    public GroupDetailsBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public GroupInfoBean getGroupInfo() {
    }

    public List<GroupMemberInfoBean> getManagerList() {
    }

    public List<GroupMemberInfoBean> getMemberList() {
    }

    public void setGroupInfo(GroupInfoBean groupInfoBean) {
    }

    public void setManagerList(List<GroupMemberInfoBean> list) {
    }

    public void setMemberList(List<GroupMemberInfoBean> list) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public GroupDetailsBean(Parcel parcel) {
    }
}
