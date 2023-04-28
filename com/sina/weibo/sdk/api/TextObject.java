package com.sina.weibo.sdk.api;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class TextObject extends MediaObject {
    public static final Parcelable.Creator<TextObject> CREATOR = null;
    private static final long serialVersionUID = -5610314414793811821L;
    public String text;

    /* renamed from: com.sina.weibo.sdk.api.TextObject$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class AnonymousClass1 implements Parcelable.Creator<TextObject> {
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TextObject createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TextObject[] newArray(int i2) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TextObject createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TextObject[] newArray(int i2) {
        }
    }

    public TextObject() {
    }

    @Override // com.sina.weibo.sdk.api.MediaObject, android.os.Parcelable
    public int describeContents() {
    }

    @Override // com.sina.weibo.sdk.api.MediaObject, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public TextObject(Parcel parcel) {
    }
}
