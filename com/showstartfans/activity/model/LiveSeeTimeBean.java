package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class LiveSeeTimeBean implements Parcelable {
    public static final Parcelable.Creator<LiveSeeTimeBean> CREATOR = null;
    public String currentUserId;
    public String payUrl;
    public long remainingTime;
    public String roomId;
    public long serviceTime;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<LiveSeeTimeBean> {
        public LiveSeeTimeBean a(Parcel parcel) {
        }

        public LiveSeeTimeBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ LiveSeeTimeBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ LiveSeeTimeBean[] newArray(int i2) {
        }
    }

    public LiveSeeTimeBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public LiveSeeTimeBean(String str, String str2, String str3, long j2, long j3) {
    }

    public LiveSeeTimeBean(Parcel parcel) {
    }
}
