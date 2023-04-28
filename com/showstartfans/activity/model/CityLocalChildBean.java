package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class CityLocalChildBean implements Parcelable {
    public static final Parcelable.Creator<CityLocalChildBean> CREATOR = null;
    public String baiduCode;
    public String code;
    public String countryCode;
    public String en;
    public String homeDisplay;
    public int id;
    public String name;
    public String name_en;
    public String provinceCode;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<CityLocalChildBean> {
        public CityLocalChildBean a(Parcel parcel) {
        }

        public CityLocalChildBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ CityLocalChildBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ CityLocalChildBean[] newArray(int i2) {
        }
    }

    public CityLocalChildBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public CityLocalChildBean(Parcel parcel) {
    }
}
