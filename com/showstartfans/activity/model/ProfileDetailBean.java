package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.showstartfans.activity.model.actdes.MusicBean;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class ProfileDetailBean implements Parcelable {
    public static final Parcelable.Creator<ProfileDetailBean> CREATOR = null;
    private String description;
    private String joinURL;
    private String licenseUrl;
    private List<MusicBean> musicList;
    private List<FansUserInfoBean> performerList;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<ProfileDetailBean> {
        public ProfileDetailBean a(Parcel parcel) {
        }

        public ProfileDetailBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ProfileDetailBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ProfileDetailBean[] newArray(int i2) {
        }
    }

    public ProfileDetailBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String getDescription() {
    }

    public String getJoinURL() {
    }

    public String getLicenseUrl() {
    }

    public List<MusicBean> getMusicList() {
    }

    public List<FansUserInfoBean> getPerformerList() {
    }

    public void setDescription(String str) {
    }

    public void setJoinURL(String str) {
    }

    public void setLicenseUrl(String str) {
    }

    public void setMusicList(List<MusicBean> list) {
    }

    public void setPerformerList(List<FansUserInfoBean> list) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public ProfileDetailBean(Parcel parcel) {
    }
}
