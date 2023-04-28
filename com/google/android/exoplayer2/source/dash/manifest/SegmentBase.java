package com.google.android.exoplayer2.source.dash.manifest;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class SegmentBase {
    @Nullable
    public final RangedUri initialization;
    public final long presentationTimeOffset;
    public final long timescale;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class MultiSegmentBase extends SegmentBase {
        @VisibleForTesting
        public final long availabilityTimeOffsetUs;
        public final long duration;
        private final long periodStartUnixTimeUs;
        @Nullable
        public final List<SegmentTimelineElement> segmentTimeline;
        public final long startNumber;
        private final long timeShiftBufferDepthUs;

        public MultiSegmentBase(@Nullable RangedUri initialization, long timescale, long presentationTimeOffset, long startNumber, long duration, @Nullable List<SegmentTimelineElement> segmentTimeline, long availabilityTimeOffsetUs, long timeShiftBufferDepthUs, long periodStartUnixTimeUs) {
        }

        public long getAvailableSegmentCount(long periodDurationUs, long nowUnixTimeUs) {
        }

        public long getFirstAvailableSegmentNum(long periodDurationUs, long nowUnixTimeUs) {
        }

        public long getFirstSegmentNum() {
        }

        public long getNextSegmentAvailableTimeUs(long periodDurationUs, long nowUnixTimeUs) {
        }

        public abstract long getSegmentCount(long periodDurationUs);

        public final long getSegmentDurationUs(long sequenceNumber, long periodDurationUs) {
        }

        public long getSegmentNum(long timeUs, long periodDurationUs) {
        }

        public final long getSegmentTimeUs(long sequenceNumber) {
        }

        public abstract RangedUri getSegmentUrl(Representation representation, long index);

        public boolean isExplicit() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class SegmentList extends MultiSegmentBase {
        @Nullable
        public final List<RangedUri> mediaSegments;

        public SegmentList(RangedUri initialization, long timescale, long presentationTimeOffset, long startNumber, long duration, @Nullable List<SegmentTimelineElement> segmentTimeline, long availabilityTimeOffsetUs, @Nullable List<RangedUri> mediaSegments, long timeShiftBufferDepthUs, long periodStartUnixTimeUs) {
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.SegmentBase.MultiSegmentBase
        public long getSegmentCount(long periodDurationUs) {
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.SegmentBase.MultiSegmentBase
        public RangedUri getSegmentUrl(Representation representation, long sequenceNumber) {
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.SegmentBase.MultiSegmentBase
        public boolean isExplicit() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class SegmentTemplate extends MultiSegmentBase {
        public final long endNumber;
        @Nullable
        public final UrlTemplate initializationTemplate;
        @Nullable
        public final UrlTemplate mediaTemplate;

        public SegmentTemplate(RangedUri initialization, long timescale, long presentationTimeOffset, long startNumber, long endNumber, long duration, @Nullable List<SegmentTimelineElement> segmentTimeline, long availabilityTimeOffsetUs, @Nullable UrlTemplate initializationTemplate, @Nullable UrlTemplate mediaTemplate, long timeShiftBufferDepthUs, long periodStartUnixTimeUs) {
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.SegmentBase
        @Nullable
        public RangedUri getInitialization(Representation representation) {
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.SegmentBase.MultiSegmentBase
        public long getSegmentCount(long periodDurationUs) {
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.SegmentBase.MultiSegmentBase
        public RangedUri getSegmentUrl(Representation representation, long sequenceNumber) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class SegmentTimelineElement {
        public final long duration;
        public final long startTime;

        public SegmentTimelineElement(long startTime, long duration) {
        }

        public boolean equals(@Nullable Object o2) {
        }

        public int hashCode() {
        }
    }

    public SegmentBase(@Nullable RangedUri initialization, long timescale, long presentationTimeOffset) {
    }

    @Nullable
    public RangedUri getInitialization(Representation representation) {
    }

    public long getPresentationTimeOffsetUs() {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SingleSegmentBase extends SegmentBase {
        public final long indexLength;
        public final long indexStart;

        public SingleSegmentBase(@Nullable RangedUri initialization, long timescale, long presentationTimeOffset, long indexStart, long indexLength) {
        }

        @Nullable
        public RangedUri getIndex() {
        }

        public SingleSegmentBase() {
        }
    }
}
