package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.showstartfans.activity.model.goodsmodel.ShoppingCartBean;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class PeripheralOrderGoodsBean implements Parcelable {
    public static final Parcelable.Creator<PeripheralOrderGoodsBean> CREATOR = null;
    public String areaCode;
    public String codeUrl;
    public List<ShoppingCartBean> goodsInfos;
    public String subTitle;
    public String telephone;
    public String ticketCode;
    public String title;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<PeripheralOrderGoodsBean> {
        public PeripheralOrderGoodsBean a(Parcel parcel) {
        }

        public PeripheralOrderGoodsBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ PeripheralOrderGoodsBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ PeripheralOrderGoodsBean[] newArray(int i2) {
        }
    }

    public PeripheralOrderGoodsBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public PeripheralOrderGoodsBean(Parcel parcel) {
    }
}
