package com.sina.weibo.sdk.api;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class ImageObject extends MediaObject {
    private static final int CONTENT_LENGTH_LIMIT = 1048576;
    public static final Parcelable.Creator<ImageObject> CREATOR = null;
    private static final int PATH_LENGTH_LIMIT = 512;
    private static final String TAG = "ImageObject";
    private static final long serialVersionUID = 8760548583231081050L;
    public byte[] imageData;
    public String imagePath;

    /* renamed from: com.sina.weibo.sdk.api.ImageObject$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class AnonymousClass1 implements Parcelable.Creator<ImageObject> {
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ImageObject createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ImageObject[] newArray(int i2) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ImageObject createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ImageObject[] newArray(int i2) {
        }
    }

    public ImageObject() {
    }

    private int getFileSize(String str) {
    }

    public boolean checkArgs() {
    }

    @Override // com.sina.weibo.sdk.api.MediaObject, android.os.Parcelable
    public int describeContents() {
    }

    public void setImageData(Bitmap bitmap) {
    }

    public void setImagePath(String str) {
    }

    @Override // com.sina.weibo.sdk.api.MediaObject, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public ImageObject(Parcel parcel) {
    }
}
