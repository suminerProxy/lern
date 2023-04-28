package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class AlbumImageBean implements Parcelable {
    public static final Parcelable.Creator<AlbumImageBean> CREATOR = null;
    private String imageId;
    private String imageName;
    private String imageUrl;
    private String tag;
    private String url;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<AlbumImageBean> {
        public AlbumImageBean a(Parcel parcel) {
        }

        public AlbumImageBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ AlbumImageBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ AlbumImageBean[] newArray(int i2) {
        }
    }

    public AlbumImageBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String getImageId() {
    }

    public String getImageName() {
    }

    public String getImageUrl() {
    }

    public String getTag() {
    }

    public String getUrl() {
    }

    public void setImageId(String str) {
    }

    public void setImageName(String str) {
    }

    public void setImageUrl(String str) {
    }

    public void setTag(String str) {
    }

    public void setUrl(String str) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public AlbumImageBean(Parcel parcel) {
    }
}
