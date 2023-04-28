package com.taihe.photoselector.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class PhotoModel implements Serializable, Parcelable {
    public static final Parcelable.Creator<PhotoModel> CREATOR = null;
    public Object extend;
    private boolean isChecked;
    public boolean isCuted;
    private boolean isTake;
    private String originalPath;
    private int type;
    public String videoConver;
    private int videoTime;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<PhotoModel> {
        public PhotoModel a(Parcel parcel) {
        }

        public PhotoModel[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ PhotoModel createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ PhotoModel[] newArray(int i2) {
        }
    }

    public PhotoModel(boolean z) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String getOriginalPath() {
    }

    public int getType() {
    }

    public int getVideoTime() {
    }

    public boolean isChecked() {
    }

    public boolean isTake() {
    }

    public void setChecked(boolean z) {
    }

    public void setOriginalPath(String str) {
    }

    public void setTake(boolean z) {
    }

    public void setType(int i2) {
    }

    public void setVideoTime(int i2) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public PhotoModel(String str, int i2) {
    }

    public PhotoModel(String str, boolean z) {
    }

    public PhotoModel(String str) {
    }

    public PhotoModel() {
    }

    public PhotoModel(Parcel parcel) {
    }
}
