package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class BrilliantShowBean implements Parcelable {
    public static final Parcelable.Creator<BrilliantShowBean> CREATOR = null;
    public int activityId;
    public String poster;
    public int recommendType;
    public List<BrilliantTagBean> tags;
    public String title;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<BrilliantShowBean> {
        public BrilliantShowBean a(Parcel parcel) {
        }

        public BrilliantShowBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ BrilliantShowBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ BrilliantShowBean[] newArray(int i2) {
        }
    }

    public BrilliantShowBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public BrilliantShowBean(Parcel parcel) {
    }
}
