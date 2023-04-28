package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class DryingTicketsPBean implements Parcelable {
    public static final Parcelable.Creator<DryingTicketsPBean> CREATOR = null;
    public String activityId;
    public DryingTicketsDataBean data;
    public DryingDouYinBean douyin;
    public String identifier;
    public String orderId;
    public DryingTicketsTemplateBean template;
    public DryingWeiboBean weibo;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<DryingTicketsPBean> {
        public DryingTicketsPBean a(Parcel parcel) {
        }

        public DryingTicketsPBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ DryingTicketsPBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ DryingTicketsPBean[] newArray(int i2) {
        }
    }

    public DryingTicketsPBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public DryingTicketsPBean(Parcel parcel) {
    }
}
