package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class OrderPaymentBean implements Parcelable {
    public static final Parcelable.Creator<OrderPaymentBean> CREATOR = null;
    private long orderTime;
    private String orderTimeView;
    private String payMethod;
    private long payTime;
    private String payTimeView;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<OrderPaymentBean> {
        public OrderPaymentBean a(Parcel parcel) {
        }

        public OrderPaymentBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ OrderPaymentBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ OrderPaymentBean[] newArray(int i2) {
        }
    }

    public OrderPaymentBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public long getOrderTime() {
    }

    public String getOrderTimeView() {
    }

    public String getPayMethod() {
    }

    public long getPayTime() {
    }

    public String getPayTimeView() {
    }

    public void setOrderTime(long j2) {
    }

    public void setOrderTimeView(String str) {
    }

    public void setPayMethod(String str) {
    }

    public void setPayTime(long j2) {
    }

    public void setPayTimeView(String str) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public OrderPaymentBean(Parcel parcel) {
    }
}
