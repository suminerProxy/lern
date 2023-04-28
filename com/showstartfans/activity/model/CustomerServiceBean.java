package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class CustomerServiceBean implements Parcelable {
    public static final Parcelable.Creator<CustomerServiceBean> CREATOR = null;
    public String serviceAvatar;
    public String serviceId;
    public String serviceName;
    public int serviceType;
    public String serviceUserId;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<CustomerServiceBean> {
        public CustomerServiceBean a(Parcel parcel) {
        }

        public CustomerServiceBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ CustomerServiceBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ CustomerServiceBean[] newArray(int i2) {
        }
    }

    public CustomerServiceBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public CustomerServiceBean(Parcel parcel) {
    }
}
