package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class MsgSettingHelpBean implements Parcelable {
    public static final Parcelable.Creator<MsgSettingHelpBean> CREATOR = null;
    private String helpURL;
    private MsgSettingBean settingInfo;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<MsgSettingHelpBean> {
        public MsgSettingHelpBean a(Parcel parcel) {
        }

        public MsgSettingHelpBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ MsgSettingHelpBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ MsgSettingHelpBean[] newArray(int i2) {
        }
    }

    public MsgSettingHelpBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String getHelpURL() {
    }

    public MsgSettingBean getSettingInfo() {
    }

    public void setHelpURL(String str) {
    }

    public void setSettingInfo(MsgSettingBean msgSettingBean) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public MsgSettingHelpBean(Parcel parcel) {
    }
}
