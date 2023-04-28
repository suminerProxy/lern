package com.taihebase.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class ProvinceBean implements Parcelable {
    public static final Parcelable.Creator<ProvinceBean> CREATOR = null;
    public String baiduCode;
    public List<CityBean> cityList;
    public String provinceCode;
    public String provinceName;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<ProvinceBean> {
        public ProvinceBean a(Parcel parcel) {
        }

        public ProvinceBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ProvinceBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ProvinceBean[] newArray(int i2) {
        }
    }

    public ProvinceBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public ProvinceBean(Parcel parcel) {
    }
}
