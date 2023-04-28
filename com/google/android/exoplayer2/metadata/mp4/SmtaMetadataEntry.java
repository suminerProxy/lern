package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.metadata.Metadata;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class SmtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<SmtaMetadataEntry> CREATOR = null;
    public final float captureFrameRate;
    public final int svcTemporalLayerCount;

    /* renamed from: com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements Parcelable.Creator<SmtaMetadataEntry> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ SmtaMetadataEntry createFromParcel(Parcel in) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ SmtaMetadataEntry[] newArray(int size) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SmtaMetadataEntry createFromParcel(Parcel in) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SmtaMetadataEntry[] newArray(int size) {
        }
    }

    public /* synthetic */ SmtaMetadataEntry(Parcel parcel, AnonymousClass1 anonymousClass1) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(@Nullable Object obj) {
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ byte[] getWrappedMetadataBytes() {
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ Format getWrappedMetadataFormat() {
    }

    public int hashCode() {
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ void populateMediaMetadata(MediaMetadata.Builder builder) {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
    }

    public SmtaMetadataEntry(float captureFrameRate, int svcTemporalLayerCount) {
    }

    private SmtaMetadataEntry(Parcel in) {
    }
}
