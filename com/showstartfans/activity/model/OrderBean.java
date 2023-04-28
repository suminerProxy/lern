package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class OrderBean implements Parcelable {
    public static final Parcelable.Creator<OrderBean> CREATOR = null;
    private double amountPaid;
    private double amountPayable;
    private String couponName;
    private int couponPrice;
    private String customerName;
    private String customerRemark;
    private String id;
    private long leftTime;
    private OrderDetailsEntity orderDetail;
    private String orderStateView;
    private long orderTime;
    private String orderTimeView;
    private int paymentStatus;
    private String sn;
    private int status;
    private String statusView;
    private String systemRemark;
    private String telephone;
    private int totalAmount;
    private int totalNum;
    private int useCoupon;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<OrderBean> {
        public OrderBean a(Parcel parcel) {
        }

        public OrderBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ OrderBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ OrderBean[] newArray(int i2) {
        }
    }

    public OrderBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public double getAmountPaid() {
    }

    public double getAmountPayable() {
    }

    public String getCouponName() {
    }

    public int getCouponPrice() {
    }

    public String getCustomerName() {
    }

    public String getCustomerRemark() {
    }

    public String getId() {
    }

    public long getLeftTime() {
    }

    public OrderDetailsEntity getOrderDetail() {
    }

    public String getOrderStateView() {
    }

    public long getOrderTime() {
    }

    public String getOrderTimeView() {
    }

    public int getPaymentStatus() {
    }

    public String getSn() {
    }

    public int getStatus() {
    }

    public String getStatusView() {
    }

    public String getSystemRemark() {
    }

    public String getTelephone() {
    }

    public int getTotalAmount() {
    }

    public int getTotalNum() {
    }

    public int getUseCoupon() {
    }

    public void setAmountPaid(double d2) {
    }

    public void setAmountPayable(double d2) {
    }

    public void setCouponName(String str) {
    }

    public void setCouponPrice(int i2) {
    }

    public void setCustomerName(String str) {
    }

    public void setCustomerRemark(String str) {
    }

    public void setId(String str) {
    }

    public void setLeftTime(long j2) {
    }

    public void setOrderDetail(OrderDetailsEntity orderDetailsEntity) {
    }

    public void setOrderStateView(String str) {
    }

    public void setOrderTime(long j2) {
    }

    public void setOrderTimeView(String str) {
    }

    public void setPaymentStatus(int i2) {
    }

    public void setSn(String str) {
    }

    public void setStatus(int i2) {
    }

    public void setStatusView(String str) {
    }

    public void setSystemRemark(String str) {
    }

    public void setTelephone(String str) {
    }

    public void setTotalAmount(int i2) {
    }

    public void setTotalNum(int i2) {
    }

    public void setUseCoupon(int i2) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public OrderBean(Parcel parcel) {
    }
}
