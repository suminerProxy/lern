package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class GiftTicketBean implements Parcelable {
    public static final Parcelable.Creator<GiftTicketBean> CREATOR = null;
    public int activityId;
    public String activityPoster;
    public String activityStartTime;
    public String activityTitle;
    public String cityName;
    public boolean openMore;
    public String siteName;
    public String ticketName;
    public String ticketNum;
    public String ticketShowContent;
    public String ticketURL;
    public List<String> ticketURLList;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<GiftTicketBean> {
        public GiftTicketBean a(Parcel parcel) {
        }

        public GiftTicketBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ GiftTicketBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ GiftTicketBean[] newArray(int i2) {
        }
    }

    public GiftTicketBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public GiftTicketBean(Parcel parcel) {
    }
}
