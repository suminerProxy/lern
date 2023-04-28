package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class OrderActivityBean implements Parcelable {
    public static final Parcelable.Creator<OrderActivityBean> CREATOR = null;
    private int activityId;
    private String activityName;
    private String avatar;
    private String cityName;
    private String leftDays;
    private boolean payed;
    private String performer;
    private int sellIdentity;
    private String sequence;
    private long showTime;
    private String showTimeView;
    private String siteName;
    private String week;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<OrderActivityBean> {
        public OrderActivityBean a(Parcel parcel) {
        }

        public OrderActivityBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ OrderActivityBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ OrderActivityBean[] newArray(int i2) {
        }
    }

    public OrderActivityBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public int getActivityId() {
    }

    public String getActivityName() {
    }

    public String getAvatar() {
    }

    public String getCityName() {
    }

    public String getLeftDays() {
    }

    public String getPerformer() {
    }

    public int getSellIdentity() {
    }

    public String getSequence() {
    }

    public long getShowTime() {
    }

    public String getShowTimeView() {
    }

    public String getSiteName() {
    }

    public String getWeek() {
    }

    public boolean isPayed() {
    }

    public void setActivityId(int i2) {
    }

    public void setActivityName(String str) {
    }

    public void setAvatar(String str) {
    }

    public void setCityName(String str) {
    }

    public void setLeftDays(String str) {
    }

    public void setPayed(boolean z) {
    }

    public void setPerformer(String str) {
    }

    public void setSellIdentity(int i2) {
    }

    public void setSequence(String str) {
    }

    public void setShowTime(long j2) {
    }

    public void setShowTimeView(String str) {
    }

    public void setSiteName(String str) {
    }

    public void setWeek(String str) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public OrderActivityBean(Parcel parcel) {
    }
}
