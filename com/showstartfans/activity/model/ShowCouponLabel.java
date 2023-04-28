package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class ShowCouponLabel implements Parcelable {
    public static final Parcelable.Creator<ShowCouponLabel> CREATOR = null;
    private int labelType;
    private String name;
    private String price;
    private String subtractPrice;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<ShowCouponLabel> {
        public ShowCouponLabel a(Parcel parcel) {
        }

        public ShowCouponLabel[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ShowCouponLabel createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ShowCouponLabel[] newArray(int i2) {
        }
    }

    public ShowCouponLabel() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public int getLabelType() {
    }

    public String getName() {
    }

    public String getPrice() {
    }

    public String getSubtractPrice() {
    }

    public void setLabelType(int i2) {
    }

    public void setName(String str) {
    }

    public void setPrice(String str) {
    }

    public void setSubtractPrice(String str) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public ShowCouponLabel(Parcel parcel) {
    }
}
