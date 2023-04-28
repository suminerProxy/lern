package com.showstartfans.activity.model.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.showstartfans.activity.model.PaySupportBean;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class PayTicketResultBean implements Parcelable {
    public static final Parcelable.Creator<PayTicketResultBean> CREATOR = null;
    public PaySupportBean payType;
    public int realName;
    public TicketReservationBean reserveInfo;
    public int validateType;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<PayTicketResultBean> {
        public PayTicketResultBean a(Parcel parcel) {
        }

        public PayTicketResultBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ PayTicketResultBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ PayTicketResultBean[] newArray(int i2) {
        }
    }

    public PayTicketResultBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public PayTicketResultBean(Parcel parcel) {
    }
}
