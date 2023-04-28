package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class MyGroupListBean implements Parcelable {
    public static final Parcelable.Creator<MyGroupListBean> CREATOR = null;
    private String helpUrl;
    private List<GroupShowBean> list;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<MyGroupListBean> {
        public MyGroupListBean a(Parcel parcel) {
        }

        public MyGroupListBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ MyGroupListBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ MyGroupListBean[] newArray(int i2) {
        }
    }

    public MyGroupListBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String getHelpUrl() {
    }

    public List<GroupShowBean> getList() {
    }

    public void setHelpUrl(String str) {
    }

    public void setList(List<GroupShowBean> list) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public MyGroupListBean(Parcel parcel) {
    }
}
