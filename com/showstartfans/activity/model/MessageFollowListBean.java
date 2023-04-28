package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class MessageFollowListBean implements Parcelable {
    public static final Parcelable.Creator<MessageFollowListBean> CREATOR = null;
    private int activityId;
    private String sequence;
    private String title;
    private String week;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<MessageFollowListBean> {
        public MessageFollowListBean a(Parcel parcel) {
        }

        public MessageFollowListBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ MessageFollowListBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ MessageFollowListBean[] newArray(int i2) {
        }
    }

    public MessageFollowListBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public int getActivityId() {
    }

    public String getSequence() {
    }

    public String getTitle() {
    }

    public String getWeek() {
    }

    public void setActivityId(int i2) {
    }

    public void setSequence(String str) {
    }

    public void setTitle(String str) {
    }

    public void setWeek(String str) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public MessageFollowListBean(Parcel parcel) {
    }
}
