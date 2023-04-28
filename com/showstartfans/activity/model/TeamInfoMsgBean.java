package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class TeamInfoMsgBean implements Parcelable {
    public static final Parcelable.Creator<TeamInfoMsgBean> CREATOR = null;
    private int num;
    private String orderId;
    private String teamId;
    private int teamStatus;
    private List<TeamUserMsgBean> userList;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<TeamInfoMsgBean> {
        public TeamInfoMsgBean a(Parcel parcel) {
        }

        public TeamInfoMsgBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ TeamInfoMsgBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ TeamInfoMsgBean[] newArray(int i2) {
        }
    }

    public TeamInfoMsgBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public int getNum() {
    }

    public String getOrderId() {
    }

    public String getTeamId() {
    }

    public int getTeamStatus() {
    }

    public List<TeamUserMsgBean> getUserList() {
    }

    public void setNum(int i2) {
    }

    public void setOrderId(String str) {
    }

    public void setTeamId(String str) {
    }

    public void setTeamStatus(int i2) {
    }

    public void setUserList(List<TeamUserMsgBean> list) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public TeamInfoMsgBean(Parcel parcel) {
    }
}
