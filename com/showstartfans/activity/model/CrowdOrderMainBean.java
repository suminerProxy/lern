package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class CrowdOrderMainBean implements Parcelable {
    public static final Parcelable.Creator<CrowdOrderMainBean> CREATOR = null;
    public String guideUrl;
    public List<CrowdOrderBean> orderList;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<CrowdOrderMainBean> {
        public CrowdOrderMainBean a(Parcel parcel) {
        }

        public CrowdOrderMainBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ CrowdOrderMainBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ CrowdOrderMainBean[] newArray(int i2) {
        }
    }

    public CrowdOrderMainBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public CrowdOrderMainBean(Parcel parcel) {
    }
}
