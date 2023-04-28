package com.google.android.exoplayer2.source.dash.manifest;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.dash.DashSegmentIndex;
import com.google.android.exoplayer2.source.dash.manifest.SegmentBase;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class Representation {
    public static final long REVISION_ID_DEFAULT = -1;
    public final ImmutableList<BaseUrl> baseUrls;
    public final Format format;
    public final List<Descriptor> inbandEventStreams;
    private final RangedUri initializationUri;
    public final long presentationTimeOffsetUs;
    public final long revisionId;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class MultiSegmentRepresentation extends Representation implements DashSegmentIndex {
        @VisibleForTesting
        public final SegmentBase.MultiSegmentBase segmentBase;

        public MultiSegmentRepresentation(long revisionId, Format format, List<BaseUrl> baseUrls, SegmentBase.MultiSegmentBase segmentBase, @Nullable List<Descriptor> inbandEventStreams) {
        }

        @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
        public long getAvailableSegmentCount(long periodDurationUs, long nowUnixTimeUs) {
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.Representation
        @Nullable
        public String getCacheKey() {
        }

        @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
        public long getDurationUs(long segmentNum, long periodDurationUs) {
        }

        @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
        public long getFirstAvailableSegmentNum(long periodDurationUs, long nowUnixTimeUs) {
        }

        @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
        public long getFirstSegmentNum() {
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.Representation
        public DashSegmentIndex getIndex() {
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.Representation
        @Nullable
        public RangedUri getIndexUri() {
        }

        @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
        public long getNextSegmentAvailableTimeUs(long periodDurationUs, long nowUnixTimeUs) {
        }

        @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
        public long getSegmentCount(long periodDurationUs) {
        }

        @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
        public long getSegmentNum(long timeUs, long periodDurationUs) {
        }

        @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
        public RangedUri getSegmentUrl(long segmentNum) {
        }

        @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
        public long getTimeUs(long segmentNum) {
        }

        @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
        public boolean isExplicit() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SingleSegmentRepresentation extends Representation {
        @Nullable
        private final String cacheKey;
        public final long contentLength;
        @Nullable
        private final RangedUri indexUri;
        @Nullable
        private final SingleSegmentIndex segmentIndex;
        public final Uri uri;

        public SingleSegmentRepresentation(long revisionId, Format format, List<BaseUrl> baseUrls, SegmentBase.SingleSegmentBase segmentBase, @Nullable List<Descriptor> inbandEventStreams, @Nullable String cacheKey, long contentLength) {
        }

        public static SingleSegmentRepresentation newInstance(long revisionId, Format format, String uri, long initializationStart, long initializationEnd, long indexStart, long indexEnd, List<Descriptor> inbandEventStreams, @Nullable String cacheKey, long contentLength) {
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.Representation
        @Nullable
        public String getCacheKey() {
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.Representation
        @Nullable
        public DashSegmentIndex getIndex() {
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.Representation
        @Nullable
        public RangedUri getIndexUri() {
        }
    }

    public /* synthetic */ Representation(long j2, Format format, List list, SegmentBase segmentBase, List list2, AnonymousClass1 anonymousClass1) {
    }

    public static Representation newInstance(long revisionId, Format format, List<BaseUrl> baseUrls, SegmentBase segmentBase) {
    }

    @Nullable
    public abstract String getCacheKey();

    @Nullable
    public abstract DashSegmentIndex getIndex();

    @Nullable
    public abstract RangedUri getIndexUri();

    @Nullable
    public RangedUri getInitializationUri() {
    }

    private Representation(long revisionId, Format format, List<BaseUrl> baseUrls, SegmentBase segmentBase, @Nullable List<Descriptor> inbandEventStreams) {
    }

    public static Representation newInstance(long revisionId, Format format, List<BaseUrl> baseUrls, SegmentBase segmentBase, @Nullable List<Descriptor> inbandEventStreams) {
    }

    public static Representation newInstance(long revisionId, Format format, List<BaseUrl> baseUrls, SegmentBase segmentBase, @Nullable List<Descriptor> inbandEventStreams, @Nullable String cacheKey) {
    }
}
