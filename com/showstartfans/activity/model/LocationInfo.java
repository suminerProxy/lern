package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class LocationInfo implements Parcelable {
    public static final Parcelable.Creator<LocationInfo> CREATOR = null;
    private double latitude;
    private double longitude;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<LocationInfo> {
        public LocationInfo a(Parcel parcel) {
        }

        public LocationInfo[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ LocationInfo createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ LocationInfo[] newArray(int i2) {
        }
    }

    public LocationInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public double getLatitude() {
    }

    public double getLongitude() {
    }

    public void setLatitude(double d2) {
    }

    public void setLongitude(double d2) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public LocationInfo(double d2, double d3) {
    }

    public LocationInfo(Parcel parcel) {
    }
}
