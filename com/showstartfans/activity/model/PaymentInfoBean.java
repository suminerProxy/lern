package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class PaymentInfoBean implements Parcelable {
    public static final Parcelable.Creator<PaymentInfoBean> CREATOR = null;
    public String orderTime;
    public String orderTimeView;
    public String payTime;
    public String payTimeView;
    public String paymethod;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<PaymentInfoBean> {
        public PaymentInfoBean a(Parcel parcel) {
        }

        public PaymentInfoBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ PaymentInfoBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ PaymentInfoBean[] newArray(int i2) {
        }
    }

    public PaymentInfoBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public PaymentInfoBean(Parcel parcel) {
    }
}
