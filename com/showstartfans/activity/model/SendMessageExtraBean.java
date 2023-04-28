package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SendMessageExtraBean implements Parcelable {
    public static final Parcelable.Creator<SendMessageExtraBean> CREATOR = null;
    private String avtarURL;
    private int chatType;
    private String chatUserType;
    private int clientType;
    private String content;
    private String targetAvtarURL;
    private String targetUserName;
    private int targetUserType;
    private String userName;
    private int userType;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<SendMessageExtraBean> {
        public SendMessageExtraBean a(Parcel parcel) {
        }

        public SendMessageExtraBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ SendMessageExtraBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ SendMessageExtraBean[] newArray(int i2) {
        }
    }

    public SendMessageExtraBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String getAvtarURL() {
    }

    public int getChatType() {
    }

    public String getChatUserType() {
    }

    public int getClientType() {
    }

    public String getContent() {
    }

    public String getTargetAvtarURL() {
    }

    public String getTargetUserName() {
    }

    public int getTargetUserType() {
    }

    public String getUserName() {
    }

    public int getUserType() {
    }

    public void setAvtarURL(String str) {
    }

    public void setChatType(int i2) {
    }

    public void setChatUserType(String str) {
    }

    public void setClientType(int i2) {
    }

    public void setContent(String str) {
    }

    public void setTargetAvtarURL(String str) {
    }

    public void setTargetUserName(String str) {
    }

    public void setTargetUserType(int i2) {
    }

    public void setUserName(String str) {
    }

    public void setUserType(int i2) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public SendMessageExtraBean(Parcel parcel) {
    }
}
