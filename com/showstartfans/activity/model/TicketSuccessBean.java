package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class TicketSuccessBean extends JPushBean {
    public static final Parcelable.Creator<TicketSuccessBean> CREATOR = null;
    public String accessNum;
    public int checkTicketMsg;
    public int goodsId;
    public String poster;
    public String title;
    public String uAvatart;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<TicketSuccessBean> {
        public TicketSuccessBean a(Parcel parcel) {
        }

        public TicketSuccessBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ TicketSuccessBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ TicketSuccessBean[] newArray(int i2) {
        }
    }

    public TicketSuccessBean() {
    }

    @Override // com.showstartfans.activity.model.JPushBean, android.os.Parcelable
    public int describeContents() {
    }

    @Override // com.showstartfans.activity.model.JPushBean, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public TicketSuccessBean(Parcel parcel) {
    }
}
