package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class City implements Serializable, Parcelable {
    public static final Parcelable.Creator<City> CREATOR = null;
    private static final long serialVersionUID = -4121121214324312L;
    public String baiduCode;
    public String code;
    public String name;
    public String name_en;
    public String provinceCode;
    public String provinceName;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<City> {
        public City a(Parcel parcel) {
        }

        public City[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ City createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ City[] newArray(int i2) {
        }
    }

    public City() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public City(Parcel parcel) {
    }
}
