package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class UserRealNameInfoBean implements Parcelable {
    public static final Parcelable.Creator<UserRealNameInfoBean> CREATOR = null;
    private String documentNumber;
    private int documentType;
    private String name;
    private int status;
    private String uniqueCode;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<UserRealNameInfoBean> {
        public UserRealNameInfoBean a(Parcel parcel) {
        }

        public UserRealNameInfoBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ UserRealNameInfoBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ UserRealNameInfoBean[] newArray(int i2) {
        }
    }

    public UserRealNameInfoBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String getDocumentNumber() {
    }

    public int getDocumentType() {
    }

    public String getName() {
    }

    public int getStatus() {
    }

    public String getUniqueCode() {
    }

    public void setDocumentNumber(String str) {
    }

    public void setDocumentType(int i2) {
    }

    public void setName(String str) {
    }

    public void setStatus(int i2) {
    }

    public void setUniqueCode(String str) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public UserRealNameInfoBean(Parcel parcel) {
    }
}
