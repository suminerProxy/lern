package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SSMsgBean implements Parcelable {
    public static final Parcelable.Creator<SSMsgBean> CREATOR = null;
    private String content;
    private int totalNum;
    private int unReadNum;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<SSMsgBean> {
        public SSMsgBean a(Parcel parcel) {
        }

        public SSMsgBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ SSMsgBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ SSMsgBean[] newArray(int i2) {
        }
    }

    public SSMsgBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String getContent() {
    }

    public int getTotalNum() {
    }

    public int getUnReadNum() {
    }

    public void setContent(String str) {
    }

    public void setTotalNum(int i2) {
    }

    public void setUnReadNum(int i2) {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public SSMsgBean(Parcel parcel) {
    }
}
