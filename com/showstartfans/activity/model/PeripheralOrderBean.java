package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.showstartfans.activity.model.goodsmodel.ShoppingCartBean;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class PeripheralOrderBean implements Parcelable {
    public static final Parcelable.Creator<PeripheralOrderBean> CREATOR = null;
    public String afterId;
    public String afterStatus;
    public String amountPayable;
    public int deliveryType;
    public String expressUrl;
    public List<ShoppingCartBean> goodsList;
    public int id;
    public boolean isOrderListTitle;
    public Long leftTime;
    public List<OrderExpressBean> logisticsList;
    public String orderStatus;
    public String orderStatusView;
    public String orderTime;
    public String orderTimeView;
    public String sn;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<PeripheralOrderBean> {
        public PeripheralOrderBean a(Parcel parcel) {
        }

        public PeripheralOrderBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ PeripheralOrderBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ PeripheralOrderBean[] newArray(int i2) {
        }
    }

    public PeripheralOrderBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public PeripheralOrderBean(int i2) {
    }

    public PeripheralOrderBean(Parcel parcel) {
    }
}
