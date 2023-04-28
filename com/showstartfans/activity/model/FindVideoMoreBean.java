package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class FindVideoMoreBean implements Parcelable {
    public static final Parcelable.Creator<FindVideoMoreBean> CREATOR = null;
    private List<FindVideoChannelBean> channels;
    private List<VideoSpecialBean> specials;
    private List<FindVideoBean> wonderfulVideos;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<FindVideoMoreBean> {
        public FindVideoMoreBean a(Parcel parcel) {
        }

        public FindVideoMoreBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ FindVideoMoreBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ FindVideoMoreBean[] newArray(int i2) {
        }
    }

    public FindVideoMoreBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public List<FindVideoChannelBean> getChannels() {
    }

    public List<VideoSpecialBean> getSpecials() {
    }

    public List<FindVideoBean> getWonderfulVideos() {
    }

    public void setChannels(List<FindVideoChannelBean> list) {
    }

    public void setSpecials(List<VideoSpecialBean> list) {
    }

    public void setWonderfulVideos(List<FindVideoBean> list) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public FindVideoMoreBean(Parcel parcel) {
    }
}
