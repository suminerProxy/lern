package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class MessageDetailActivityBean implements Parcelable {
    public static final Parcelable.Creator<MessageDetailActivityBean> CREATOR = null;
    private String activityId;
    private String activityPoster;
    private String activityTitle;
    private String cityName;
    private long groupId;
    private int isEnd;
    private int isTour;
    private String price;
    private int sellIdentity;
    private String showStartTime;
    private String site;
    private List<String> style;
    private int wantToNum;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<MessageDetailActivityBean> {
        public MessageDetailActivityBean a(Parcel parcel) {
        }

        public MessageDetailActivityBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ MessageDetailActivityBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ MessageDetailActivityBean[] newArray(int i2) {
        }
    }

    public MessageDetailActivityBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String getActivityId() {
    }

    public String getActivityPoster() {
    }

    public String getActivityTitle() {
    }

    public String getCityName() {
    }

    public long getGroupId() {
    }

    public int getIsEnd() {
    }

    public int getIsTour() {
    }

    public String getPrice() {
    }

    public int getSellIdentity() {
    }

    public String getShowStartTime() {
    }

    public String getSite() {
    }

    public List<String> getStyle() {
    }

    public int getWantToNum() {
    }

    public void setActivityId(String str) {
    }

    public void setActivityPoster(String str) {
    }

    public void setActivityTitle(String str) {
    }

    public void setCityName(String str) {
    }

    public void setGroupId(long j2) {
    }

    public void setIsEnd(int i2) {
    }

    public void setIsTour(int i2) {
    }

    public void setPrice(String str) {
    }

    public void setSellIdentity(int i2) {
    }

    public void setShowStartTime(String str) {
    }

    public void setSite(String str) {
    }

    public void setStyle(List<String> list) {
    }

    public void setWantToNum(int i2) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public MessageDetailActivityBean(Parcel parcel) {
    }
}
