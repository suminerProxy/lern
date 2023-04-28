package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class PrivateSettingBean implements Parcelable {
    public static final Parcelable.Creator<PrivateSettingBean> CREATOR = null;
    private int privacyLetter;
    private int seeActivity;
    public int seeAlbums;
    private int seeDistance;
    private int seeHomepage;
    private int seeWish;
    private int userId;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<PrivateSettingBean> {
        public PrivateSettingBean a(Parcel parcel) {
        }

        public PrivateSettingBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ PrivateSettingBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ PrivateSettingBean[] newArray(int i2) {
        }
    }

    public PrivateSettingBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public int getPrivacyLetter() {
    }

    public int getSeeActivity() {
    }

    public int getSeeDistance() {
    }

    public int getSeeHomepage() {
    }

    public int getSeeWish() {
    }

    public int getUserId() {
    }

    public void setPrivacyLetter(int i2) {
    }

    public void setSeeActivity(int i2) {
    }

    public void setSeeDistance(int i2) {
    }

    public void setSeeHomepage(int i2) {
    }

    public void setSeeWish(int i2) {
    }

    public void setUserId(int i2) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public PrivateSettingBean(Parcel parcel) {
    }
}
