package com.showstartfans.activity.model.home;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class RecommendPerformersBean implements Parcelable {
    public static final Parcelable.Creator<RecommendPerformersBean> CREATOR = null;
    private String avatar;
    private List<String> musicStyle;
    private String performerId;
    private String performerName;
    private int popularity;
    private int userType;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<RecommendPerformersBean> {
        public RecommendPerformersBean a(Parcel parcel) {
        }

        public RecommendPerformersBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ RecommendPerformersBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ RecommendPerformersBean[] newArray(int i2) {
        }
    }

    public RecommendPerformersBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String getAvatar() {
    }

    public List<String> getMusicStyle() {
    }

    public String getPerformerId() {
    }

    public String getPerformerName() {
    }

    public int getPopularity() {
    }

    public int getUserType() {
    }

    public void setAvatar(String str) {
    }

    public void setMusicStyle(List<String> list) {
    }

    public void setPerformerId(String str) {
    }

    public void setPerformerName(String str) {
    }

    public void setPopularity(int i2) {
    }

    public void setUserType(int i2) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public RecommendPerformersBean(Parcel parcel) {
    }
}
