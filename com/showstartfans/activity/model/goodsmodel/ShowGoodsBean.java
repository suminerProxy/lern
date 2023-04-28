package com.showstartfans.activity.model.goodsmodel;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class ShowGoodsBean implements Parcelable {
    public static final Parcelable.Creator<ShowGoodsBean> CREATOR = null;
    private String bindName;
    private int buyGroupType;
    private String goodsId;
    private String goodsName;
    private String goodsPoster;
    private double price;
    private int status;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<ShowGoodsBean> {
        public ShowGoodsBean a(Parcel parcel) {
        }

        public ShowGoodsBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ShowGoodsBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ShowGoodsBean[] newArray(int i2) {
        }
    }

    public ShowGoodsBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String getBindName() {
    }

    public int getBuyGroupType() {
    }

    public String getGoodsId() {
    }

    public String getGoodsName() {
    }

    public String getGoodsPoster() {
    }

    public double getPrice() {
    }

    public int getStatus() {
    }

    public void setBindName(String str) {
    }

    public void setBuyGroupType(int i2) {
    }

    public void setGoodsId(String str) {
    }

    public void setGoodsName(String str) {
    }

    public void setGoodsPoster(String str) {
    }

    public void setPrice(double d2) {
    }

    public void setStatus(int i2) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public ShowGoodsBean(Parcel parcel) {
    }
}
