package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class ActivityListBean implements Parcelable {
    public static final Parcelable.Creator<ActivityListBean> CREATOR = null;
    public List<SearchListBean> activityInfo;
    public int cityType;
    public String title;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<ActivityListBean> {
        public ActivityListBean a(Parcel parcel) {
        }

        public ActivityListBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ActivityListBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ActivityListBean[] newArray(int i2) {
        }
    }

    public ActivityListBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public ActivityListBean(Parcel parcel) {
    }
}
