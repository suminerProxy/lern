package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class OrderPayDetailBean implements Parcelable {
    public static final Parcelable.Creator<OrderPayDetailBean> CREATOR = null;
    private double amountpayable;
    private double cashback;
    private String foreignCurrencyAmount;
    private double price;
    private String ticketName;
    private double totalAmount;
    private int totalNum;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<OrderPayDetailBean> {
        public OrderPayDetailBean a(Parcel parcel) {
        }

        public OrderPayDetailBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ OrderPayDetailBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ OrderPayDetailBean[] newArray(int i2) {
        }
    }

    public OrderPayDetailBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public double getAmountpayable() {
    }

    public double getCashback() {
    }

    public String getForeignCurrencyAmount() {
    }

    public double getPrice() {
    }

    public String getTicketName() {
    }

    public double getTotalAmount() {
    }

    public int getTotalNum() {
    }

    public void setAmountpayable(double d2) {
    }

    public void setCashback(double d2) {
    }

    public void setForeignCurrencyAmount(String str) {
    }

    public void setPrice(double d2) {
    }

    public void setTicketName(String str) {
    }

    public void setTotalAmount(double d2) {
    }

    public void setTotalNum(int i2) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public OrderPayDetailBean(Parcel parcel) {
    }
}
