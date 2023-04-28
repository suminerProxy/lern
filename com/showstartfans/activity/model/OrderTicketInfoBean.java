package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class OrderTicketInfoBean implements Parcelable {
    public static final Parcelable.Creator<OrderTicketInfoBean> CREATOR = null;
    private String address;
    private String alternateEndTime;
    private String areaCode;
    private int buyGroupType;
    private long customerId;
    private String customerName;
    private String entityInstruction;
    public List<PerformerBean> orderPerformers;
    private String pickupDate;
    private long pickupEndTime;
    private double pickupLatitude;
    private double pickupLongitude;
    private long pickupStartTime;
    private String pickupTime;
    private String telephone;
    private String ticketInstruction;
    private String userID;
    private int waitingAlternateNum;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<OrderTicketInfoBean> {
        public OrderTicketInfoBean a(Parcel parcel) {
        }

        public OrderTicketInfoBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ OrderTicketInfoBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ OrderTicketInfoBean[] newArray(int i2) {
        }
    }

    public OrderTicketInfoBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String getAddress() {
    }

    public String getAlternateEndTime() {
    }

    public String getAreaCode() {
    }

    public int getBuyGroupType() {
    }

    public long getCustomerId() {
    }

    public String getCustomerName() {
    }

    public String getEntityInstruction() {
    }

    public String getPickupDate() {
    }

    public long getPickupEndTime() {
    }

    public double getPickupLatitude() {
    }

    public double getPickupLongitude() {
    }

    public long getPickupStartTime() {
    }

    public String getPickupTime() {
    }

    public String getTelephone() {
    }

    public String getTicketInstruction() {
    }

    public String getUserID() {
    }

    public int getWaitingAlternateNum() {
    }

    public void setAddress(String str) {
    }

    public void setAlternateEndTime(String str) {
    }

    public void setAreaCode(String str) {
    }

    public void setBuyGroupType(int i2) {
    }

    public void setCustomerId(long j2) {
    }

    public void setCustomerName(String str) {
    }

    public void setEntityInstruction(String str) {
    }

    public void setPickupDate(String str) {
    }

    public void setPickupEndTime(long j2) {
    }

    public void setPickupLatitude(double d2) {
    }

    public void setPickupLongitude(double d2) {
    }

    public void setPickupStartTime(long j2) {
    }

    public void setPickupTime(String str) {
    }

    public void setTelephone(String str) {
    }

    public void setTicketInstruction(String str) {
    }

    public void setUserID(String str) {
    }

    public void setWaitingAlternateNum(int i2) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public OrderTicketInfoBean(Parcel parcel) {
    }
}
