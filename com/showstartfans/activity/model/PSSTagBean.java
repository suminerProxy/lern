package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class PSSTagBean implements Parcelable {
    public static final Parcelable.Creator<PSSTagBean> CREATOR = null;
    public int drawable;
    private int id;
    private String name;
    private List<SSTagBean> tags;
    private int type;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<PSSTagBean> {
        public PSSTagBean a(Parcel parcel) {
        }

        public PSSTagBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ PSSTagBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ PSSTagBean[] newArray(int i2) {
        }
    }

    public PSSTagBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public int getId() {
    }

    public String getName() {
    }

    public List<SSTagBean> getTags() {
    }

    public int getType() {
    }

    public void setId(int i2) {
    }

    public void setName(String str) {
    }

    public void setTags(List<SSTagBean> list) {
    }

    public void setType(int i2) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public PSSTagBean(Parcel parcel) {
    }
}
