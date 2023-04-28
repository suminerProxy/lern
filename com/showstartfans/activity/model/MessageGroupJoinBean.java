package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class MessageGroupJoinBean implements Parcelable {
    public static final Parcelable.Creator<MessageGroupJoinBean> CREATOR = null;
    private String content;
    private String showTime;
    private int unReadNum;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<MessageGroupJoinBean> {
        public MessageGroupJoinBean a(Parcel parcel) {
        }

        public MessageGroupJoinBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ MessageGroupJoinBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ MessageGroupJoinBean[] newArray(int i2) {
        }
    }

    public MessageGroupJoinBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String getContent() {
    }

    public String getShowTime() {
    }

    public int getUnReadNum() {
    }

    public void setContent(String str) {
    }

    public void setShowTime(String str) {
    }

    public void setUnReadNum(int i2) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public MessageGroupJoinBean(Parcel parcel) {
    }
}
