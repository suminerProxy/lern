package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class CityListGroup implements Parcelable {
    public static final Parcelable.Creator<CityListGroup> CREATOR = null;
    private List<CityListItem> cityEntry;
    private String title;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<CityListGroup> {
        public CityListGroup a(Parcel parcel) {
        }

        public CityListGroup[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ CityListGroup createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ CityListGroup[] newArray(int i2) {
        }
    }

    public CityListGroup(Parcel parcel) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public List<CityListItem> getCityEntry() {
    }

    public String getTitle() {
    }

    public void setCityEntry(List<CityListItem> list) {
    }

    public void setTitle(String str) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public CityListGroup() {
    }
}
