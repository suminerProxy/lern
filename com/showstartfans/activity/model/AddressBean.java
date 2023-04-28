package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class AddressBean implements Parcelable {
    public static final Parcelable.Creator<AddressBean> CREATOR = null;
    private String address;
    private String areaCode;
    private String cityCode;
    private String cityName;
    private String consignee;
    private String customerName;
    private long id;
    private int isDefault;
    private String postCode;
    private String provinceCode;
    private String provinceName;
    private String telephone;
    private String userId;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<AddressBean> {
        public AddressBean a(Parcel parcel) {
        }

        public AddressBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ AddressBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ AddressBean[] newArray(int i2) {
        }
    }

    public AddressBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String getAddress() {
    }

    public String getAreaCode() {
    }

    public String getCityCode() {
    }

    public String getCityName() {
    }

    public String getConsignee() {
    }

    public String getCustomerName() {
    }

    public long getId() {
    }

    public int getIsDefault() {
    }

    public String getPostCode() {
    }

    public String getProvinceCode() {
    }

    public String getProvinceName() {
    }

    public String getTelephone() {
    }

    public String getUserId() {
    }

    public void setAddress(String str) {
    }

    public void setAreaCode(String str) {
    }

    public void setCityCode(String str) {
    }

    public void setCityName(String str) {
    }

    public void setConsignee(String str) {
    }

    public void setCustomerName(String str) {
    }

    public void setId(long j2) {
    }

    public void setIsDefault(int i2) {
    }

    public void setPostCode(String str) {
    }

    public void setProvinceCode(String str) {
    }

    public void setProvinceName(String str) {
    }

    public void setTelephone(String str) {
    }

    public void setUserId(String str) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public AddressBean(Parcel parcel) {
    }
}
