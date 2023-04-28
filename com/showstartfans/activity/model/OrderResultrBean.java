package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class OrderResultrBean implements Parcelable {
    public static final Parcelable.Creator<OrderResultrBean> CREATOR = null;
    private String guideUrl;
    private List<OrderDetailsEntity> orderList;
    private int presentTicketCount;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<OrderResultrBean> {
        public OrderResultrBean a(Parcel parcel) {
        }

        public OrderResultrBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ OrderResultrBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ OrderResultrBean[] newArray(int i2) {
        }
    }

    public OrderResultrBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String getGuideUrl() {
    }

    public List<OrderDetailsEntity> getOrderList() {
    }

    public int getPresentTicketCount() {
    }

    public void setGuideUrl(String str) {
    }

    public void setOrderList(List<OrderDetailsEntity> list) {
    }

    public void setPresentTicketCount(int i2) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public OrderResultrBean(Parcel parcel) {
    }
}
