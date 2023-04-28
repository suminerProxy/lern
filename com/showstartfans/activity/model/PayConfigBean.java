package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class PayConfigBean implements Parcelable {
    public static final Parcelable.Creator<PayConfigBean> CREATOR = null;
    private String input_charset;
    private String is_b_pay;
    private String key;
    private String notify_url;
    private String partner;
    private String private_key;
    private String public_key;
    private String return_url;
    private String seller_email;
    private String sign_type;
    private String transport;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<PayConfigBean> {
        public PayConfigBean a(Parcel parcel) {
        }

        public PayConfigBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ PayConfigBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ PayConfigBean[] newArray(int i2) {
        }
    }

    public PayConfigBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String getInput_charset() {
    }

    public String getIs_b_pay() {
    }

    public String getKey() {
    }

    public String getNotify_url() {
    }

    public String getPartner() {
    }

    public String getPrivate_key() {
    }

    public String getPublic_key() {
    }

    public String getReturn_url() {
    }

    public String getSeller_email() {
    }

    public String getSign_type() {
    }

    public String getTransport() {
    }

    public void setInput_charset(String str) {
    }

    public void setIs_b_pay(String str) {
    }

    public void setKey(String str) {
    }

    public void setNotify_url(String str) {
    }

    public void setPartner(String str) {
    }

    public void setPrivate_key(String str) {
    }

    public void setPublic_key(String str) {
    }

    public void setReturn_url(String str) {
    }

    public void setSeller_email(String str) {
    }

    public void setSign_type(String str) {
    }

    public void setTransport(String str) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public PayConfigBean(Parcel parcel) {
    }
}
