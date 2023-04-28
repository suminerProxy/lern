package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.showstartfans.activity.model.goodsmodel.ShoppingCartBean;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class ShCartBean implements Parcelable {
    public static final Parcelable.Creator<ShCartBean> CREATOR = null;
    private int deliveryType;
    private String freight;
    private List<ShoppingCartBean> goodsList;
    private String notice;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<ShCartBean> {
        public ShCartBean a(Parcel parcel) {
        }

        public ShCartBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ShCartBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ShCartBean[] newArray(int i2) {
        }
    }

    public ShCartBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public int getDeliveryType() {
    }

    public String getFreight() {
    }

    public List<ShoppingCartBean> getGoodsList() {
    }

    public String getNotice() {
    }

    public void setDeliveryType(int i2) {
    }

    public void setFreight(String str) {
    }

    public void setGoodsList(List<ShoppingCartBean> list) {
    }

    public void setNotice(String str) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public ShCartBean(Parcel parcel) {
    }
}
