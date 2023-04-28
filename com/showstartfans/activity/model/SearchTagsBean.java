package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SearchTagsBean implements Parcelable {
    public static final Parcelable.Creator<SearchTagsBean> CREATOR = null;
    private String param;
    private ArrayList<SearchTagBean> tags;
    private String title;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<SearchTagsBean> {
        public SearchTagsBean a(Parcel parcel) {
        }

        public SearchTagsBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ SearchTagsBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ SearchTagsBean[] newArray(int i2) {
        }
    }

    public SearchTagsBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String getParam() {
    }

    public ArrayList<SearchTagBean> getTags() {
    }

    public String getTitle() {
    }

    public void setParam(String str) {
    }

    public void setTags(ArrayList<SearchTagBean> arrayList) {
    }

    public void setTitle(String str) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public SearchTagsBean(Parcel parcel) {
    }
}
