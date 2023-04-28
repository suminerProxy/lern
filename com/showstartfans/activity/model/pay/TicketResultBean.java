package com.showstartfans.activity.model.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.showstartfans.activity.model.PaySupportBean;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class TicketResultBean implements Parcelable {
    public static final Parcelable.Creator<TicketResultBean> CREATOR = null;
    public int buyType;
    private String helpUrl;
    public PaySupportBean payType;
    public int realName;
    public TicketReservationBean reserveInfo;
    private String showTime;
    private List<TicketBean> ticketList;
    private int validateType;
    private String week;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<TicketResultBean> {
        public TicketResultBean a(Parcel parcel) {
        }

        public TicketResultBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ TicketResultBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ TicketResultBean[] newArray(int i2) {
        }
    }

    public TicketResultBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String getHelpUrl() {
    }

    public String getShowTime() {
    }

    public List<TicketBean> getTicketList() {
    }

    public int getValidateType() {
    }

    public String getWeek() {
    }

    public boolean haveReservation() {
    }

    public void setHelpUrl(String str) {
    }

    public void setShowTime(String str) {
    }

    public void setTicketList(List<TicketBean> list) {
    }

    public void setValidateType(int i2) {
    }

    public void setWeek(String str) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public TicketResultBean(Parcel parcel) {
    }
}
