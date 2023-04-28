package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class AtBean implements Parcelable, Serializable {
    public static final Parcelable.Creator<AtBean> CREATOR = null;
    public String endIndex;
    public String startIndex;
    public String text;
    public String type;
    public String userId;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<AtBean> {
        public AtBean a(Parcel parcel) {
        }

        public AtBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ AtBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ AtBean[] newArray(int i2) {
        }
    }

    public AtBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public int getEndIndex() {
    }

    public int getStartIndex() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public AtBean(String str, String str2, String str3, String str4, String str5) {
    }

    public AtBean(Parcel parcel) {
    }
}
