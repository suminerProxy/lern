package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class JPushBean implements Parcelable {
    public static final Parcelable.Creator<JPushBean> CREATOR = null;
    public String fromUserId;
    public String fromUserName;
    public String fromUserType;
    private String isSceneRecordMsg;
    private String isTicketMessage;
    private int msgTypeV2;
    private String pushRecordId;
    private String sceneActivityId;
    private String sendTime;
    private String ticketId;
    public String userLevel;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<JPushBean> {
        public JPushBean a(Parcel parcel) {
        }

        public JPushBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ JPushBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ JPushBean[] newArray(int i2) {
        }
    }

    public JPushBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String getIsSceneRecordMsg() {
    }

    public String getIsTicketMessage() {
    }

    public int getMsgTypeV2() {
    }

    public String getPushRecordId() {
    }

    public String getSceneActivityId() {
    }

    public String getSendTime() {
    }

    public String getTicketId() {
    }

    public void setIsSceneRecordMsg(String str) {
    }

    public void setIsTicketMessage(String str) {
    }

    public void setMsgTypeV2(int i2) {
    }

    public void setPushRecordId(String str) {
    }

    public void setSceneActivityId(String str) {
    }

    public void setSendTime(String str) {
    }

    public void setTicketId(String str) {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public JPushBean(Parcel parcel) {
    }
}
