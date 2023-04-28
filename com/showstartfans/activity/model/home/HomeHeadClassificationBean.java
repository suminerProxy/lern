package com.showstartfans.activity.model.home;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class HomeHeadClassificationBean implements Parcelable {
    public static final Parcelable.Creator<HomeHeadClassificationBean> CREATOR = null;
    public List<HomeHeadClassChildBean> activityScale;
    private String id;
    private String imgBmp;
    private String imgUrl;
    private String name;
    public List<HomeHeadClassSortTypeBean> price;
    public List<HomeHeadClassSortTypeBean> saleSituation;
    public List<HomeHeadClassSortTypeBean> sortType;
    public List<ShowStylesBean> styles;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<HomeHeadClassificationBean> {
        public HomeHeadClassificationBean a(Parcel parcel) {
        }

        public HomeHeadClassificationBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ HomeHeadClassificationBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ HomeHeadClassificationBean[] newArray(int i2) {
        }
    }

    public HomeHeadClassificationBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public List<HomeHeadClassChildBean> getActivityScale() {
    }

    public String getId() {
    }

    public String getImgBmp() {
    }

    public String getImgUrl() {
    }

    public String getName() {
    }

    public List<HomeHeadClassSortTypeBean> getPrice() {
    }

    public List<HomeHeadClassSortTypeBean> getSaleSituation() {
    }

    public List<HomeHeadClassSortTypeBean> getSortType() {
    }

    public List<ShowStylesBean> getStyles() {
    }

    public void setActivityScale(List<HomeHeadClassChildBean> list) {
    }

    public void setId(String str) {
    }

    public void setImgBmp(String str) {
    }

    public void setImgUrl(String str) {
    }

    public void setName(String str) {
    }

    public void setPrice(List<HomeHeadClassSortTypeBean> list) {
    }

    public void setSaleSituation(List<HomeHeadClassSortTypeBean> list) {
    }

    public void setSortType(List<HomeHeadClassSortTypeBean> list) {
    }

    public void setStyles(List<ShowStylesBean> list) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public HomeHeadClassificationBean(Parcel parcel) {
    }
}
