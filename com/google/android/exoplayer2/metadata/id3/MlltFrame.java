package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class MlltFrame extends Id3Frame {
    public static final Parcelable.Creator<MlltFrame> CREATOR = null;
    public static final String ID = "MLLT";
    public final int bytesBetweenReference;
    public final int[] bytesDeviations;
    public final int millisecondsBetweenReference;
    public final int[] millisecondsDeviations;
    public final int mpegFramesBetweenReference;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.MlltFrame$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements Parcelable.Creator<MlltFrame> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ MlltFrame createFromParcel(Parcel in) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ MlltFrame[] newArray(int size) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MlltFrame createFromParcel(Parcel in) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MlltFrame[] newArray(int size) {
        }
    }

    public MlltFrame(int mpegFramesBetweenReference, int bytesBetweenReference, int millisecondsBetweenReference, int[] bytesDeviations, int[] millisecondsDeviations) {
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(@Nullable Object obj) {
    }

    public int hashCode() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
    }

    public MlltFrame(Parcel in) {
    }
}
