package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Comparator;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class SlowMotionData implements Metadata.Entry {
    public static final Parcelable.Creator<SlowMotionData> CREATOR = null;
    public final List<Segment> segments;

    /* renamed from: com.google.android.exoplayer2.metadata.mp4.SlowMotionData$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements Parcelable.Creator<SlowMotionData> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ SlowMotionData createFromParcel(Parcel in) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ SlowMotionData[] newArray(int size) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SlowMotionData createFromParcel(Parcel in) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SlowMotionData[] newArray(int size) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Segment implements Parcelable {
        public static final Comparator<Segment> BY_START_THEN_END_THEN_DIVISOR = null;
        public static final Parcelable.Creator<Segment> CREATOR = null;
        public final long endTimeMs;
        public final int speedDivisor;
        public final long startTimeMs;

        /* renamed from: com.google.android.exoplayer2.metadata.mp4.SlowMotionData$Segment$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 implements Parcelable.Creator<Segment> {
            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Segment createFromParcel(Parcel in) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Segment[] newArray(int size) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Segment createFromParcel(Parcel in) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Segment[] newArray(int size) {
            }
        }

        public Segment(long startTimeMs, long endTimeMs, int speedDivisor) {
        }

        public static /* synthetic */ int a(Segment segment, Segment segment2) {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
        }

        public boolean equals(@Nullable Object o2) {
        }

        public int hashCode() {
        }

        public String toString() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
        }
    }

    public SlowMotionData(List<Segment> segments) {
    }

    private static boolean doSegmentsOverlap(List<Segment> segments) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(@Nullable Object o2) {
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
}
