package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class QuickCheckBean implements Parcelable {
    public static final Parcelable.Creator<QuickCheckBean> CREATOR = null;
    public String activityId;
    public String activityTitle;
    public String address;
    public String cityName;
    public String codeUrl;
    public double latitude;
    public double longitude;
    public String orderId;
    public String poster;
    public String showStartTime;
    public String siteName;
    public String startTime;
    public String ticketInstruction;
    public String ticketName;
    public int ticketNum;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<QuickCheckBean> {
        public QuickCheckBean a(Parcel parcel) {
        }

        public QuickCheckBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ QuickCheckBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ QuickCheckBean[] newArray(int i2) {
        }
    }

    public QuickCheckBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public QuickCheckBean(Parcel parcel) {
    }
}
