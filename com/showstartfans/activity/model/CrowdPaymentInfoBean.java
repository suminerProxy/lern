package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class CrowdPaymentInfoBean implements Parcelable {
    public static final Parcelable.Creator<CrowdPaymentInfoBean> CREATOR = null;
    public String orderTime;
    public String orderTimeView;
    public String payMethod;
    public String payTime;
    public String payTimeView;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<CrowdPaymentInfoBean> {
        public CrowdPaymentInfoBean a(Parcel parcel) {
        }

        public CrowdPaymentInfoBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ CrowdPaymentInfoBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ CrowdPaymentInfoBean[] newArray(int i2) {
        }
    }

    public CrowdPaymentInfoBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public CrowdPaymentInfoBean(Parcel parcel) {
    }
}
