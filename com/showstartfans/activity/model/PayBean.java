package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import h.y.a.h.f;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class PayBean implements Parcelable {
    public static final Parcelable.Creator<PayBean> CREATOR = null;
    private String activityId;
    private String address;
    private String addressId;
    private String areaCode;
    private String checkCode;
    private String cityName;
    private String customerName;
    private f payWay;
    private double price;
    private String provinceName;
    private String telephone;
    private String tencentRandStr;
    private String tencentTicketCode;
    private String ticketId;
    private int ticketNum;
    private int ticketType;
    private String tokenCode;
    private String tokenRand;
    private String userID;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<PayBean> {
        public PayBean a(Parcel parcel) {
        }

        public PayBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ PayBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ PayBean[] newArray(int i2) {
        }
    }

    public PayBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String getActivityId() {
    }

    public String getAddress() {
    }

    public String getAddressId() {
    }

    public String getAreaCode() {
    }

    public String getCheckCode() {
    }

    public String getCityName() {
    }

    public String getCustomerName() {
    }

    public f getPayWay() {
    }

    public double getPrice() {
    }

    public String getProvinceName() {
    }

    public String getTelephone() {
    }

    public String getTencentRandStr() {
    }

    public String getTencentTicketCode() {
    }

    public String getTicketId() {
    }

    public int getTicketNum() {
    }

    public int getTicketType() {
    }

    public String getTokenCode() {
    }

    public String getTokenRand() {
    }

    public String getUserID() {
    }

    public void setActivityId(String str) {
    }

    public void setAddress(String str) {
    }

    public void setAddressId(String str) {
    }

    public void setAreaCode(String str) {
    }

    public void setCheckCode(String str) {
    }

    public void setCityName(String str) {
    }

    public void setCustomerName(String str) {
    }

    public void setPayWay(f fVar) {
    }

    public void setPrice(double d2) {
    }

    public void setProvinceName(String str) {
    }

    public void setTelephone(String str) {
    }

    public void setTencentRandStr(String str) {
    }

    public void setTencentTicketCode(String str) {
    }

    public void setTicketId(String str) {
    }

    public void setTicketNum(int i2) {
    }

    public void setTicketType(int i2) {
    }

    public void setTokenCode(String str) {
    }

    public void setTokenRand(String str) {
    }

    public void setUserID(String str) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public PayBean(Parcel parcel) {
    }
}
