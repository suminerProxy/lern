package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class CityLocalBean implements Parcelable {
    public static final Parcelable.Creator<CityLocalBean> CREATOR = null;
    public String baiduCode;
    public List<CityLocalChildBean> cityList;
    public String countryCode;
    public String provinceCode;
    public String provinceName;
    public String provinceName_en;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<CityLocalBean> {
        public CityLocalBean a(Parcel parcel) {
        }

        public CityLocalBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ CityLocalBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ CityLocalBean[] newArray(int i2) {
        }
    }

    public CityLocalBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public CityLocalBean(Parcel parcel) {
    }
}
