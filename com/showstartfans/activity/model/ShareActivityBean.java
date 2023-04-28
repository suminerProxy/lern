package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class ShareActivityBean implements Parcelable {
    public static final Parcelable.Creator<ShareActivityBean> CREATOR = null;
    private String activityId;
    private String articleTitle;
    private String endTime;
    private String endTimeStr;
    private int isJoin;
    private String listImg;
    private String poster;
    private String title;
    private String wapUrl;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<ShareActivityBean> {
        public ShareActivityBean a(Parcel parcel) {
        }

        public ShareActivityBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ShareActivityBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ShareActivityBean[] newArray(int i2) {
        }
    }

    public ShareActivityBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String getActivityId() {
    }

    public String getArticleTitle() {
    }

    public String getEndTime() {
    }

    public String getEndTimeStr() {
    }

    public int getIsJoin() {
    }

    public String getListImg() {
    }

    public String getPoster() {
    }

    public String getTitle() {
    }

    public String getWapUrl() {
    }

    public void setActivityId(String str) {
    }

    public void setArticleTitle(String str) {
    }

    public void setEndTime(String str) {
    }

    public void setEndTimeStr(String str) {
    }

    public void setIsJoin(int i2) {
    }

    public void setListImg(String str) {
    }

    public void setPoster(String str) {
    }

    public void setTitle(String str) {
    }

    public void setWapUrl(String str) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public ShareActivityBean(Parcel parcel) {
    }
}
