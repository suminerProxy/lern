package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class GoodsLiveBean implements Parcelable {
    public static final Parcelable.Creator<GoodsLiveBean> CREATOR = null;
    public String giftDescription;
    public Long goodsId;
    public String goodsName;
    public String goodsPoster;
    public String goodsPriceFormat;
    public long goodsSkuId;
    public int leftStock;
    public int sendNum;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<GoodsLiveBean> {
        public GoodsLiveBean a(Parcel parcel) {
        }

        public GoodsLiveBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ GoodsLiveBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ GoodsLiveBean[] newArray(int i2) {
        }
    }

    public GoodsLiveBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public GoodsLiveBean(Parcel parcel) {
    }
}
