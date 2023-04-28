package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class CityListItem implements Parcelable {
    public static final int CITY_GPS = 2;
    public static final int CITY_HOT = 1;
    public static final int CITY_OTHER = 0;
    public static final Parcelable.Creator<CityListItem> CREATOR = null;
    public static final int SECTION = 1;
    private String cityCode;
    private String cityName;
    private int city_type;
    private String pinyin;
    private int type;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<CityListItem> {
        public CityListItem a(Parcel parcel) {
        }

        public CityListItem[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ CityListItem createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ CityListItem[] newArray(int i2) {
        }
    }

    public CityListItem() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String getCityCode() {
    }

    public String getCityName() {
    }

    public int getCity_type() {
    }

    public String getPinyin() {
    }

    public int getType() {
    }

    public void setCityCode(String str) {
    }

    public void setCityName(String str) {
    }

    public void setCity_type(int i2) {
    }

    public void setPinyin(String str) {
    }

    public void setType(int i2) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public CityListItem(Parcel parcel) {
    }
}
