package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class WelcomeBean implements Parcelable {
    public static final Parcelable.Creator<WelcomeBean> CREATOR = null;
    private List<ADShowBean> data;
    private ADShowBean showData;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<WelcomeBean> {
        public WelcomeBean a(Parcel parcel) {
        }

        public WelcomeBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ WelcomeBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ WelcomeBean[] newArray(int i2) {
        }
    }

    public WelcomeBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public List<ADShowBean> getData() {
    }

    public ADShowBean getShowData() {
    }

    public void setData(List<ADShowBean> list) {
    }

    public void setShowData(ADShowBean aDShowBean) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public WelcomeBean(Parcel parcel) {
    }
}
