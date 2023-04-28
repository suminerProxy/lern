package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class ADShowBean implements Parcelable {
    public static final Parcelable.Creator<ADShowBean> CREATOR = null;
    private long endTime;
    private String id;
    private String path;
    private String title;
    private int type;
    private String url;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<ADShowBean> {
        public ADShowBean a(Parcel parcel) {
        }

        public ADShowBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ADShowBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ADShowBean[] newArray(int i2) {
        }
    }

    public ADShowBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public long getEndTime() {
    }

    public String getId() {
    }

    public String getPath() {
    }

    public String getTitle() {
    }

    public int getType() {
    }

    public String getUrl() {
    }

    public void setEndTime(long j2) {
    }

    public void setId(String str) {
    }

    public void setPath(String str) {
    }

    public void setTitle(String str) {
    }

    public void setType(int i2) {
    }

    public void setUrl(String str) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public ADShowBean(Parcel parcel) {
    }
}
