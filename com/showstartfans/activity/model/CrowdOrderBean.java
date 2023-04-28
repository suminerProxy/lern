package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class CrowdOrderBean implements Parcelable {
    public static final Parcelable.Creator<CrowdOrderBean> CREATOR = null;
    public String amountPayable;
    public String deliveryType;
    public String expressURL;
    public int id;
    public String leftTime;
    public List<OrderExpressBean> logisticsList;
    public int orderStatus;
    public RaiseInfoBean raiseInfo;
    public String sn;
    public String status;
    public String statusView;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<CrowdOrderBean> {
        public CrowdOrderBean a(Parcel parcel) {
        }

        public CrowdOrderBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ CrowdOrderBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ CrowdOrderBean[] newArray(int i2) {
        }
    }

    public CrowdOrderBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public CrowdOrderBean(Parcel parcel) {
    }
}
