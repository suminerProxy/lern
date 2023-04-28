package com.showstartfans.activity.model.actdes;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class ReserveInfoBean implements Parcelable {
    public static final Parcelable.Creator<ReserveInfoBean> CREATOR = null;
    public String desc;
    public long endLeftTime;
    public int isReserve;
    public int reserveStatus;
    public long startLeftTime;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<ReserveInfoBean> {
        public ReserveInfoBean a(Parcel parcel) {
        }

        public ReserveInfoBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ReserveInfoBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ReserveInfoBean[] newArray(int i2) {
        }
    }

    public ReserveInfoBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public ReserveInfoBean(Parcel parcel) {
    }
}
