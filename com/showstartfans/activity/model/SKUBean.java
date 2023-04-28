package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SKUBean implements Parcelable {
    public static final Parcelable.Creator<SKUBean> CREATOR = null;
    private String id;
    private String imageUrl;
    private List<SKUPropertyBean> propertyList;
    private String skuPropertyIds;
    private int stock;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<SKUBean> {
        public SKUBean a(Parcel parcel) {
        }

        public SKUBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ SKUBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ SKUBean[] newArray(int i2) {
        }
    }

    public SKUBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String getId() {
    }

    public String getImageUrl() {
    }

    public List<SKUPropertyBean> getPropertyList() {
    }

    public String getSkuPropertyIds() {
    }

    public int getStock() {
    }

    public void setId(String str) {
    }

    public void setImageUrl(String str) {
    }

    public void setPropertyList(List<SKUPropertyBean> list) {
    }

    public void setSkuPropertyIds(String str) {
    }

    public void setStock(int i2) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public SKUBean(Parcel parcel) {
    }
}
