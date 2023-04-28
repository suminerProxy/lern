package com.showstartfans.activity.model.pay;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class TicketCountDownMsgBean implements Parcelable {
    public static final Parcelable.Creator<TicketCountDownMsgBean> CREATOR = null;
    private int countdown;
    private String orderToken;
    private int validateType;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<TicketCountDownMsgBean> {
        public TicketCountDownMsgBean a(Parcel parcel) {
        }

        public TicketCountDownMsgBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ TicketCountDownMsgBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ TicketCountDownMsgBean[] newArray(int i2) {
        }
    }

    public TicketCountDownMsgBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public int getCountdown() {
    }

    public String getOrderToken() {
    }

    public int getValidateType() {
    }

    public void setCountdown(int i2) {
    }

    public void setOrderToken(String str) {
    }

    public void setValidateType(int i2) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public TicketCountDownMsgBean(Parcel parcel) {
    }
}
