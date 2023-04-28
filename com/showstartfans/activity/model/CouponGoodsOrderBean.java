package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class CouponGoodsOrderBean implements Parcelable {
    public static final Parcelable.Creator<CouponGoodsOrderBean> CREATOR = null;
    private int canNotUseNum;
    private int canUseNum;
    private List<CouponBean> couponList;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<CouponGoodsOrderBean> {
        public CouponGoodsOrderBean a(Parcel parcel) {
        }

        public CouponGoodsOrderBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ CouponGoodsOrderBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ CouponGoodsOrderBean[] newArray(int i2) {
        }
    }

    public CouponGoodsOrderBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public int getCanNotUseNum() {
    }

    public int getCanUseNum() {
    }

    public List<CouponBean> getCouponList() {
    }

    public void setCanNotUseNum(int i2) {
    }

    public void setCanUseNum(int i2) {
    }

    public void setCouponList(List<CouponBean> list) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public CouponGoodsOrderBean(Parcel parcel) {
    }
}
