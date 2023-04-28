package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class LiveTopHotBean implements Parcelable {
    public static final Parcelable.Creator<LiveTopHotBean> CREATOR = null;
    private List<LiveTopUserBean> myRank;
    private List<LiveTopUserBean> rankList;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<LiveTopHotBean> {
        public LiveTopHotBean a(Parcel parcel) {
        }

        public LiveTopHotBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ LiveTopHotBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ LiveTopHotBean[] newArray(int i2) {
        }
    }

    public static /* synthetic */ List access$002(LiveTopHotBean liveTopHotBean, List list) {
    }

    public static /* synthetic */ List access$102(LiveTopHotBean liveTopHotBean, List list) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public List<LiveTopUserBean> getMyRank() {
    }

    public List<LiveTopUserBean> getRankList() {
    }

    public void setMyRank(List<LiveTopUserBean> list) {
    }

    public void setRankList(List<LiveTopUserBean> list) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }
}
