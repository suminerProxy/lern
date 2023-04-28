package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.showstartfans.activity.model.actdes.AnnouncementBean;
import com.showstartfans.activity.model.goodsmodel.ShoppingCartBean;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class PeripheralOrderDetailsBean implements Parcelable {
    public static final Parcelable.Creator<PeripheralOrderDetailsBean> CREATOR = null;
    public String afterId;
    public String afterStatus;
    public String amountPayable;
    public double cashback;
    public AddressBean consigneeInfo;
    public String customerRemark;
    public int deliveryType;
    public double freight;
    public List<ShoppingCartBean> goodsList;
    public int haveNft;
    public int id;
    public String leftTime;
    public List<OrderExpressBean> logisticsList;
    public List<AnnouncementBean> notices;
    public int orderStatus;
    public String orderStatusView;
    public String orderTime;
    public String orderTimeView;
    public PaymentInfoBean paymentInfo;
    public String sn;
    public String ticketCode;
    public String ticketSubTitle;
    public String ticketTitle;
    public String ticketURL;
    public String totalAmount;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<PeripheralOrderDetailsBean> {
        public PeripheralOrderDetailsBean a(Parcel parcel) {
        }

        public PeripheralOrderDetailsBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ PeripheralOrderDetailsBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ PeripheralOrderDetailsBean[] newArray(int i2) {
        }
    }

    public PeripheralOrderDetailsBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public PeripheralOrderDetailsBean(Parcel parcel) {
    }
}
