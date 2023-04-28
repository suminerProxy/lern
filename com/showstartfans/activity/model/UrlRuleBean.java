package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class UrlRuleBean implements Parcelable {
    public static final Parcelable.Creator<UrlRuleBean> CREATOR = null;
    public boolean login;
    public Map<String, String> parameterMapping;
    public String path;
    public int type;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<UrlRuleBean> {
        public UrlRuleBean a(Parcel parcel) {
        }

        public UrlRuleBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ UrlRuleBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ UrlRuleBean[] newArray(int i2) {
        }
    }

    public UrlRuleBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String getPath() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public UrlRuleBean(Parcel parcel) {
    }
}
