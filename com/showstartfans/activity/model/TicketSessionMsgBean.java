package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.showstartfans.activity.model.pay.TicketBean;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class TicketSessionMsgBean implements Parcelable {
    public static final Parcelable.Creator<TicketSessionMsgBean> CREATOR = null;
    private int isConfirmedStartTime;
    private String sessionId;
    private String sessionName;
    private List<TicketBean> ticketList;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<TicketSessionMsgBean> {
        public TicketSessionMsgBean a(Parcel parcel) {
        }

        public TicketSessionMsgBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ TicketSessionMsgBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ TicketSessionMsgBean[] newArray(int i2) {
        }
    }

    public TicketSessionMsgBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public int getIsConfirmedStartTime() {
    }

    public String getSessionId() {
    }

    public String getSessionName() {
    }

    public List<TicketBean> getTicketList() {
    }

    public void setIsConfirmedStartTime(int i2) {
    }

    public void setSessionId(String str) {
    }

    public void setSessionName(String str) {
    }

    public void setTicketList(List<TicketBean> list) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public TicketSessionMsgBean(Parcel parcel) {
    }
}
