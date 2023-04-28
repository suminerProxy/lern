package com.google.android.exoplayer2.source.hls;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class HlsTrackMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<HlsTrackMetadataEntry> CREATOR = null;
    @Nullable
    public final String groupId;
    @Nullable
    public final String name;
    public final List<VariantInfo> variantInfos;

    /* renamed from: com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements Parcelable.Creator<HlsTrackMetadataEntry> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ HlsTrackMetadataEntry createFromParcel(Parcel in) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ HlsTrackMetadataEntry[] newArray(int size) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public HlsTrackMetadataEntry createFromParcel(Parcel in) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public HlsTrackMetadataEntry[] newArray(int size) {
        }
    }

    public HlsTrackMetadataEntry(@Nullable String groupId, @Nullable String name, List<VariantInfo> variantInfos) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(@Nullable Object other) {
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

    public HlsTrackMetadataEntry(Parcel in) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class VariantInfo implements Parcelable {
        public static final Parcelable.Creator<VariantInfo> CREATOR = null;
        @Nullable
        public final String audioGroupId;
        public final int averageBitrate;
        @Nullable
        public final String captionGroupId;
        public final int peakBitrate;
        @Nullable
        public final String subtitleGroupId;
        @Nullable
        public final String videoGroupId;

        /* renamed from: com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry$VariantInfo$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 implements Parcelable.Creator<VariantInfo> {
            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ VariantInfo createFromParcel(Parcel in) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ VariantInfo[] newArray(int size) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public VariantInfo createFromParcel(Parcel in) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public VariantInfo[] newArray(int size) {
            }
        }

        public VariantInfo(int averageBitrate, int peakBitrate, @Nullable String videoGroupId, @Nullable String audioGroupId, @Nullable String subtitleGroupId, @Nullable String captionGroupId) {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
        }

        public boolean equals(@Nullable Object other) {
        }

        public int hashCode() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
        }

        public VariantInfo(Parcel in) {
        }
    }
}
