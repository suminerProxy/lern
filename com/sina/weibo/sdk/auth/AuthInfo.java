package com.sina.weibo.sdk.auth;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class AuthInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<AuthInfo> CREATOR = null;
    private static final long serialVersionUID = 6421253895937667193L;
    private String app_key;
    private String hash;
    private String package_name;
    private String redirect_url;
    private String scope;

    /* renamed from: com.sina.weibo.sdk.auth.AuthInfo$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class AnonymousClass1 implements Parcelable.Creator<AuthInfo> {
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ AuthInfo createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ AuthInfo[] newArray(int i2) {
        }
    }

    public AuthInfo(Context context, String str, String str2, String str3) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
    }

    public final String getAppKey() {
    }

    public final String getHash() {
    }

    public final String getPackageName() {
    }

    public final String getRedirectUrl() {
    }

    public final String getScope() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
    }

    public AuthInfo(Parcel parcel) {
    }
}
