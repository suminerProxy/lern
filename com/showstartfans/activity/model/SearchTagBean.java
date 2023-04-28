package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SearchTagBean implements Parcelable {
    public static final Parcelable.Creator<SearchTagBean> CREATOR = null;
    private String imageURL;
    private String key;
    private String showName;
    private String value;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<SearchTagBean> {
        public SearchTagBean a(Parcel parcel) {
        }

        public SearchTagBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ SearchTagBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ SearchTagBean[] newArray(int i2) {
        }
    }

    public SearchTagBean(Parcel parcel) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String getImageURL() {
    }

    public String getKey() {
    }

    public String getShowName() {
    }

    public String getValue() {
    }

    public void setImageURL(String str) {
    }

    public void setKey(String str) {
    }

    public void setShowName(String str) {
    }

    public void setValue(String str) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public SearchTagBean(String str, String str2, String str3, String str4) {
    }

    public SearchTagBean() {
    }
}
