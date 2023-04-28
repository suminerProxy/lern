package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SearchResultBean implements Parcelable {
    public static final Parcelable.Creator<SearchResultBean> CREATOR = null;
    private List<SearchListBean> activityInfo;
    private boolean hasMore;
    private String keyId;
    private List<FansUserInfoBean> userInfos;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<SearchResultBean> {
        public SearchResultBean a(Parcel parcel) {
        }

        public SearchResultBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ SearchResultBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ SearchResultBean[] newArray(int i2) {
        }
    }

    public SearchResultBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public List<SearchListBean> getActivityInfo() {
    }

    public String getKeyId() {
    }

    public List<FansUserInfoBean> getUserInfos() {
    }

    public boolean isHasMore() {
    }

    public void setActivityInfo(List<SearchListBean> list) {
    }

    public void setHasMore(boolean z) {
    }

    public void setKeyId(String str) {
    }

    public void setUserInfos(List<FansUserInfoBean> list) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public SearchResultBean(Parcel parcel) {
    }
}
