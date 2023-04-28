package com.showstartfans.activity.model;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class DanMuCusItem implements Parcelable {
    public static final Parcelable.Creator<DanMuCusItem> CREATOR = null;
    public String content;
    public long convert;
    public String id;
    public boolean isCurrentUser;
    public String letterUserAvatar;
    public String letterUserId;
    public String letterUserName;
    public int letterUserType;
    public Bitmap userLogo;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<DanMuCusItem> {
        public DanMuCusItem a(Parcel parcel) {
        }

        public DanMuCusItem[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ DanMuCusItem createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ DanMuCusItem[] newArray(int i2) {
        }
    }

    public DanMuCusItem() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public DanMuCusItem(String str, String str2, String str3, String str4, int i2, String str5, boolean z, long j2) {
    }

    public DanMuCusItem(Parcel parcel) {
    }
}
