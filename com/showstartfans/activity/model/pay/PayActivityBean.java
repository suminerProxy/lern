package com.showstartfans.activity.model.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.showstartfans.activity.model.actdes.SiteBean;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class PayActivityBean implements Parcelable {
    public static final Parcelable.Creator<PayActivityBean> CREATOR = null;
    public int activityId;
    public String activityName;
    public String avatar;
    public String showTime;
    public SiteBean site;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<PayActivityBean> {
        public PayActivityBean a(Parcel parcel) {
        }

        public PayActivityBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ PayActivityBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ PayActivityBean[] newArray(int i2) {
        }
    }

    public PayActivityBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public PayActivityBean(Parcel parcel) {
    }
}
