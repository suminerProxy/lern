package com.sina.weibo.sdk.web;

import android.os.Parcel;
import android.os.Parcelable;
import com.sina.weibo.sdk.auth.AuthInfo;
import java.io.Serializable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class WebData implements Parcelable, Serializable {
    public static final Parcelable.Creator<WebData> CREATOR = null;
    private static final long serialVersionUID = -4038177938155795889L;
    public AuthInfo av;
    public String aw;

    /* renamed from: i  reason: collision with root package name */
    public String f7544i;
    public int type;

    /* renamed from: com.sina.weibo.sdk.web.WebData$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class AnonymousClass1 implements Parcelable.Creator<WebData> {
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ WebData createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ WebData[] newArray(int i2) {
        }
    }

    public WebData(AuthInfo authInfo, int i2, String str, String str2) {
    }

    public final AuthInfo a() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public final int getType() {
    }

    public final String getUrl() {
    }

    public final String r() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public WebData(Parcel parcel) {
    }
}
