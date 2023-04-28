package com.google.android.exoplayer2.video;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import org.checkerframework.dataflow.qual.Pure;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ColorInfo implements Parcelable {
    public static final Parcelable.Creator<ColorInfo> CREATOR = null;
    public final int colorRange;
    public final int colorSpace;
    public final int colorTransfer;
    private int hashCode;
    @Nullable
    public final byte[] hdrStaticInfo;

    /* renamed from: com.google.android.exoplayer2.video.ColorInfo$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements Parcelable.Creator<ColorInfo> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ColorInfo createFromParcel(Parcel in) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ColorInfo[] newArray(int size) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ColorInfo createFromParcel(Parcel in) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ColorInfo[] newArray(int size) {
        }
    }

    public ColorInfo(int colorSpace, int colorRange, int colorTransfer, @Nullable byte[] hdrStaticInfo) {
    }

    @Pure
    public static int isoColorPrimariesToColorSpace(int isoColorPrimaries) {
    }

    @Pure
    public static int isoTransferCharacteristicsToColorTransfer(int isoTransferCharacteristics) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(@Nullable Object obj) {
    }

    public int hashCode() {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
    }

    public ColorInfo(Parcel in) {
    }
}
