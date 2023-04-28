package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import h.u.a.u.a4.d;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class GroupMemberInfoBean extends d implements Parcelable {
    public static final Parcelable.Creator<GroupMemberInfoBean> CREATOR = null;
    private boolean Checked;
    private String avatar;
    private String id;
    private String isChat;
    private String key;
    private String name;
    private String type;
    private String userId;
    private String userType;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<GroupMemberInfoBean> {
        public GroupMemberInfoBean a(Parcel parcel) {
        }

        public GroupMemberInfoBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ GroupMemberInfoBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ GroupMemberInfoBean[] newArray(int i2) {
        }
    }

    public GroupMemberInfoBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String getAvatar() {
    }

    public String getId() {
    }

    public String getIsChat() {
    }

    public String getKey() {
    }

    public String getName() {
    }

    public String getType() {
    }

    public String getUserId() {
    }

    public String getUserType() {
    }

    public boolean isChecked() {
    }

    public void setAvatar(String str) {
    }

    public void setChecked(boolean z) {
    }

    public void setId(String str) {
    }

    public void setIsChat(String str) {
    }

    public void setKey(String str) {
    }

    public void setName(String str) {
    }

    public void setType(String str) {
    }

    public void setUserId(String str) {
    }

    public void setUserType(String str) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public GroupMemberInfoBean(Parcel parcel) {
    }
}
