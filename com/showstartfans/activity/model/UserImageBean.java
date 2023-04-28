package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class UserImageBean implements Parcelable {
    public static final Parcelable.Creator<UserImageBean> CREATOR = null;
    public static final String TAG_ADD = "addImage";
    private String imageId;
    private String imageName;
    private String tag;
    private String url;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<UserImageBean> {
        public UserImageBean a(Parcel parcel) {
        }

        public UserImageBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ UserImageBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ UserImageBean[] newArray(int i2) {
        }
    }

    public UserImageBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String getImageId() {
    }

    public String getImageName() {
    }

    public String getTag() {
    }

    public String getUrl() {
    }

    public void setImageId(String str) {
    }

    public void setImageName(String str) {
    }

    public void setTag(String str) {
    }

    public void setUrl(String str) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public UserImageBean(Parcel parcel) {
    }
}
