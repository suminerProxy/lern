package com.sina.weibo.sdk.api;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class VideoSourceObject extends MediaObject {
    public static final Parcelable.Creator<VideoSourceObject> CREATOR = null;
    private static final long serialVersionUID = 2745594466460840583L;
    public Uri coverPath;
    public long during;
    public Uri videoPath;

    /* renamed from: com.sina.weibo.sdk.api.VideoSourceObject$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class AnonymousClass1 implements Parcelable.Creator<VideoSourceObject> {
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VideoSourceObject createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VideoSourceObject[] newArray(int i2) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VideoSourceObject createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VideoSourceObject[] newArray(int i2) {
        }
    }

    public VideoSourceObject() {
    }

    @Override // com.sina.weibo.sdk.api.MediaObject, android.os.Parcelable
    public int describeContents() {
    }

    @Override // com.sina.weibo.sdk.api.MediaObject, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public VideoSourceObject(Parcel parcel) {
    }
}
