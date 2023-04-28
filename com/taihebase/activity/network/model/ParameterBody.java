package com.taihebase.activity.network.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.fastjson.JSONObject;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class ParameterBody implements Parcelable {
    public static final Parcelable.Creator<ParameterBody> CREATOR = null;
    public String action;
    public JSONObject body;
    public String deviceName;
    public long qtime;
    public String ranstr;
    public String sysVersion;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<ParameterBody> {
        public ParameterBody a(Parcel parcel) {
        }

        public ParameterBody[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ParameterBody createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ParameterBody[] newArray(int i2) {
        }
    }

    public ParameterBody() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public ParameterBody(String str, long j2, String str2, String str3, String str4, JSONObject jSONObject) {
    }

    public ParameterBody(Parcel parcel) {
    }
}
