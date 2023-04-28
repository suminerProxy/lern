package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class Province implements Parcelable {
    public static final Parcelable.Creator<Province> CREATOR = null;
    public String baiduCode;
    public List<City> cityList;
    public String provinceCode;
    public String provinceName;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<Province> {
        public Province a(Parcel parcel) {
        }

        public Province[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Province createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Province[] newArray(int i2) {
        }
    }

    public Province() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public Province(Parcel parcel) {
    }
}
