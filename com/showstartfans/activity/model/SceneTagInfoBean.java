package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SceneTagInfoBean implements Parcelable {
    public static final Parcelable.Creator<SceneTagInfoBean> CREATOR = null;
    private int id;
    private String name;
    private int type;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<SceneTagInfoBean> {
        public SceneTagInfoBean a(Parcel parcel) {
        }

        public SceneTagInfoBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ SceneTagInfoBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ SceneTagInfoBean[] newArray(int i2) {
        }
    }

    public SceneTagInfoBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public int getId() {
    }

    public String getName() {
    }

    public int getType() {
    }

    public void setId(int i2) {
    }

    public void setName(String str) {
    }

    public void setType(int i2) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public SceneTagInfoBean(int i2, String str, int i3) {
    }

    public SceneTagInfoBean(Parcel parcel) {
    }
}
