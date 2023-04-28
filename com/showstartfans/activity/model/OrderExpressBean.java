package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class OrderExpressBean implements Parcelable {
    public static final Parcelable.Creator<OrderExpressBean> CREATOR = null;
    private String expressName;
    private String expressNo;
    private String expressURL;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<OrderExpressBean> {
        public OrderExpressBean a(Parcel parcel) {
        }

        public OrderExpressBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ OrderExpressBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ OrderExpressBean[] newArray(int i2) {
        }
    }

    public OrderExpressBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String getExpressName() {
    }

    public String getExpressNo() {
    }

    public String getExpressURL() {
    }

    public void setExpressName(String str) {
    }

    public void setExpressNo(String str) {
    }

    public void setExpressURL(String str) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public OrderExpressBean(Parcel parcel) {
    }
}
