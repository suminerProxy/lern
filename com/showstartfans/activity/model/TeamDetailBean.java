package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.showstartfans.activity.model.pay.TicketBean;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class TeamDetailBean implements Parcelable {
    public static final Parcelable.Creator<TeamDetailBean> CREATOR = null;
    public TeamShowActivityBean activityInfo;
    public PaySupportBean payType;
    public int realName;
    public List<TicketBean> ticketList;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<TeamDetailBean> {
        public TeamDetailBean a(Parcel parcel) {
        }

        public TeamDetailBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ TeamDetailBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ TeamDetailBean[] newArray(int i2) {
        }
    }

    public TeamDetailBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public TeamDetailBean(Parcel parcel) {
    }
}
