package com.sina.weibo.sdk.api;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class MultiImageObject extends MediaObject {
    public static final Parcelable.Creator<MultiImageObject> CREATOR = null;
    private static final long serialVersionUID = 4858450022450986236L;
    public ArrayList<Uri> imageList;

    /* renamed from: com.sina.weibo.sdk.api.MultiImageObject$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class AnonymousClass1 implements Parcelable.Creator<MultiImageObject> {
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ MultiImageObject createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ MultiImageObject[] newArray(int i2) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MultiImageObject createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MultiImageObject[] newArray(int i2) {
        }
    }

    public MultiImageObject() {
    }

    @Override // com.sina.weibo.sdk.api.MediaObject, android.os.Parcelable
    public int describeContents() {
    }

    public ArrayList<Uri> getImageList() {
    }

    @Override // com.sina.weibo.sdk.api.MediaObject, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public MultiImageObject(Parcel parcel) {
    }
}
