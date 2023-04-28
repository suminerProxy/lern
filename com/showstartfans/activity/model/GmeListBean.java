package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class GmeListBean implements Parcelable {
    public static final Parcelable.Creator<GmeListBean> CREATOR = null;
    private String key;
    private List<GroupMemberInfoBean> list;
    private String name;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<GmeListBean> {
        public GmeListBean a(Parcel parcel) {
        }

        public GmeListBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ GmeListBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ GmeListBean[] newArray(int i2) {
        }
    }

    public GmeListBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String getKey() {
    }

    public List<GroupMemberInfoBean> getList() {
    }

    public String getName() {
    }

    public void setKey(String str) {
    }

    public void setList(List<GroupMemberInfoBean> list) {
    }

    public void setName(String str) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public GmeListBean(Parcel parcel) {
    }
}
