package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class OrderPlaceGoodsBean implements Parcelable {
    public static final Parcelable.Creator<OrderPlaceGoodsBean> CREATOR = null;
    public String cartId;
    public String goodsId;
    public int goodsType;
    public int num;
    public String price;
    public String skuId;
    public int skuType;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<OrderPlaceGoodsBean> {
        public OrderPlaceGoodsBean a(Parcel parcel) {
        }

        public OrderPlaceGoodsBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ OrderPlaceGoodsBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ OrderPlaceGoodsBean[] newArray(int i2) {
        }
    }

    public OrderPlaceGoodsBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public OrderPlaceGoodsBean(Parcel parcel) {
    }
}
