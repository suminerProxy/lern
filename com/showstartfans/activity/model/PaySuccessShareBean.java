package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.showstartfans.activity.model.actdes.PerformersPaySuccessBean;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class PaySuccessShareBean implements Parcelable {
    public static final Parcelable.Creator<PaySuccessShareBean> CREATOR = null;
    private String imageUrl;
    private List<PerformersPaySuccessBean> performers;
    private List<String> shareIds;
    private String shareUrl;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<PaySuccessShareBean> {
        public PaySuccessShareBean a(Parcel parcel) {
        }

        public PaySuccessShareBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ PaySuccessShareBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ PaySuccessShareBean[] newArray(int i2) {
        }
    }

    public PaySuccessShareBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String getImageUrl() {
    }

    public List<PerformersPaySuccessBean> getPerformers() {
    }

    public List<String> getShareIds() {
    }

    public String getShareUrl() {
    }

    public void setImageUrl(String str) {
    }

    public void setPerformers(List<PerformersPaySuccessBean> list) {
    }

    public void setShareIds(List<String> list) {
    }

    public void setShareUrl(String str) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public PaySuccessShareBean(Parcel parcel) {
    }
}
