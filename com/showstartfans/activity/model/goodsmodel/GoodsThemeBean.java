package com.showstartfans.activity.model.goodsmodel;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class GoodsThemeBean implements Parcelable {
    public static final Parcelable.Creator<GoodsThemeBean> CREATOR = null;
    public String description;
    public String detailPath;
    public String dominantTone;
    public List<GoodsThemeGoodsBean> goodsList;
    public String id;
    public String poster;
    public String subTitle;
    public String title;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<GoodsThemeBean> {
        public GoodsThemeBean a(Parcel parcel) {
        }

        public GoodsThemeBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ GoodsThemeBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ GoodsThemeBean[] newArray(int i2) {
        }
    }

    public GoodsThemeBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public GoodsThemeBean(Parcel parcel) {
    }
}
