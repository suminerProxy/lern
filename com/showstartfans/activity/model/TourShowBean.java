package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class TourShowBean implements Parcelable {
    public static final Parcelable.Creator<TourShowBean> CREATOR = null;
    public String avatar;
    public String remark;
    public String styleName;
    public String tourId;
    public List<TourShowMsgBean> tourList;
    public String tourName;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<TourShowBean> {
        public TourShowBean a(Parcel parcel) {
        }

        public TourShowBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ TourShowBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ TourShowBean[] newArray(int i2) {
        }
    }

    public TourShowBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public TourShowBean(Parcel parcel) {
    }
}
