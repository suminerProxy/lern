package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.showstartfans.activity.model.actdes.AnnouncementBean;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class CrowdOrderDetailsBean implements Parcelable {
    public static final Parcelable.Creator<CrowdOrderDetailsBean> CREATOR = null;
    public String address;
    public String alterView;
    public String amountPayable;
    public String areaCode;
    public String cashback;
    public String customerId;
    public String customerName;
    public int deliveryType;
    public String leftTime;
    public List<OrderExpressBean> logisticsList;
    public List<AnnouncementBean> notices;
    public int orderId;
    public int orderStatus;
    public CrowdPaymentInfoBean paymentInfo;
    public int paymentStatus;
    public String price;
    public RaiseInfoBean raiseInfo;
    public String redoundTime;
    public String remark;
    public String sn;
    public String statusView;
    public String telephone;
    public String ticketName;
    public String totalAmount;
    public int totalNum;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<CrowdOrderDetailsBean> {
        public CrowdOrderDetailsBean a(Parcel parcel) {
        }

        public CrowdOrderDetailsBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ CrowdOrderDetailsBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ CrowdOrderDetailsBean[] newArray(int i2) {
        }
    }

    public CrowdOrderDetailsBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public CrowdOrderDetailsBean(Parcel parcel) {
    }
}
