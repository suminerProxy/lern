package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class ShareBean implements Parcelable {
    public static final Parcelable.Creator<ShareBean> CREATOR = null;
    private String content;
    private String logo;
    private String poster;
    private String remark;
    private String thumbnail;
    private String title;
    private String type;
    private String url;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<ShareBean> {
        public ShareBean a(Parcel parcel) {
        }

        public ShareBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ShareBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ShareBean[] newArray(int i2) {
        }
    }

    public ShareBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String getContent() {
    }

    public String getLogo() {
    }

    public String getPoster() {
    }

    public String getRemark() {
    }

    public String getThumbnail() {
    }

    public String getTitle() {
    }

    public String getType() {
    }

    public String getUrl() {
    }

    public void setContent(String str) {
    }

    public void setLogo(String str) {
    }

    public void setPoster(String str) {
    }

    public void setRemark(String str) {
    }

    public void setThumbnail(String str) {
    }

    public void setTitle(String str) {
    }

    public void setType(String str) {
    }

    public void setUrl(String str) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public ShareBean(String str) {
    }

    public ShareBean(Parcel parcel) {
    }
}
