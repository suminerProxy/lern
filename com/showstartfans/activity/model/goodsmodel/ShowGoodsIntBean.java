package com.showstartfans.activity.model.goodsmodel;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class ShowGoodsIntBean implements Parcelable {
    public static final Parcelable.Creator<ShowGoodsIntBean> CREATOR = null;
    private String bindName;
    private int buyGroupType;
    private int goodsId;
    private String goodsName;
    private String goodsPoster;
    private String price;
    private int status;
    public int typeStatus;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<ShowGoodsIntBean> {
        public ShowGoodsIntBean a(Parcel parcel) {
        }

        public ShowGoodsIntBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ShowGoodsIntBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ShowGoodsIntBean[] newArray(int i2) {
        }
    }

    public ShowGoodsIntBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String getBindName() {
    }

    public int getBuyGroupType() {
    }

    public int getGoodsId() {
    }

    public String getGoodsName() {
    }

    public String getGoodsPoster() {
    }

    public String getPrice() {
    }

    public int getStatus() {
    }

    public int getTypeStatus() {
    }

    public void setBindName(String str) {
    }

    public void setBuyGroupType(int i2) {
    }

    public void setGoodsId(int i2) {
    }

    public void setGoodsName(String str) {
    }

    public void setGoodsPoster(String str) {
    }

    public void setPrice(String str) {
    }

    public void setStatus(int i2) {
    }

    public void setTypeStatus(int i2) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public ShowGoodsIntBean(Parcel parcel) {
    }
}
