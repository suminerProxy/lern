package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class TicketSessionBean implements Parcelable {
    public static final Parcelable.Creator<TicketSessionBean> CREATOR = null;
    private int realName;
    private List<TicketSessionMsgBean> sessions;
    private String showTime;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<TicketSessionBean> {
        public TicketSessionBean a(Parcel parcel) {
        }

        public TicketSessionBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ TicketSessionBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ TicketSessionBean[] newArray(int i2) {
        }
    }

    public TicketSessionBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public int getRealName() {
    }

    public List<TicketSessionMsgBean> getSessions() {
    }

    public String getShowTime() {
    }

    public void setRealName(int i2) {
    }

    public void setSessions(List<TicketSessionMsgBean> list) {
    }

    public void setShowTime(String str) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public TicketSessionBean(Parcel parcel) {
    }
}
