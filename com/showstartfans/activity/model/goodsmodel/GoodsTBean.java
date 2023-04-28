package com.showstartfans.activity.model.goodsmodel;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class GoodsTBean implements Parcelable {
    public static final Parcelable.Creator<GoodsTBean> CREATOR = null;
    public List<ShowGoodsIntBean> hotGoods;
    public List<GoodsThemeBean> themes;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<GoodsTBean> {
        public GoodsTBean a(Parcel parcel) {
        }

        public GoodsTBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ GoodsTBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ GoodsTBean[] newArray(int i2) {
        }
    }

    public GoodsTBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public GoodsTBean(Parcel parcel) {
    }
}
