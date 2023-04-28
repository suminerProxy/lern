package com.sina.weibo.sdk.api;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class MediaObject implements Parcelable, Serializable {
    public static final Parcelable.Creator<MediaObject> CREATOR = null;
    private static final long serialVersionUID = -5562495969515901397L;
    public String actionUrl;
    public String description;
    public String identify;
    public String schema;
    public byte[] thumbData;
    public String title;

    /* renamed from: com.sina.weibo.sdk.api.MediaObject$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class AnonymousClass1 implements Parcelable.Creator<MediaObject> {
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ MediaObject createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ MediaObject[] newArray(int i2) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MediaObject createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MediaObject[] newArray(int i2) {
        }
    }

    public MediaObject() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public MediaObject(Parcel parcel) {
    }
}
