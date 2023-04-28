package com.showstartfans.activity.model.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.showstartfans.activity.model.PerformerBean;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class TicketReservationBean implements Parcelable {
    public static final Parcelable.Creator<TicketReservationBean> CREATOR = null;
    public String address;
    public String areaCode;
    public String city;
    public List<PerformerBean> commonPerformers;
    public String consignee;
    public List<performerBean> performers;
    public String province;
    public String telephone;
    public String userID;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<TicketReservationBean> {
        public TicketReservationBean a(Parcel parcel) {
        }

        public TicketReservationBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ TicketReservationBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ TicketReservationBean[] newArray(int i2) {
        }
    }

    public TicketReservationBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public TicketReservationBean(Parcel parcel) {
    }
}
