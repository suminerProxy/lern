package com.google.android.exoplayer2.source.dash.manifest;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.offline.FilterableManifest;
import com.google.android.exoplayer2.offline.StreamKey;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class DashManifest implements FilterableManifest<DashManifest> {
    public final long availabilityStartTimeMs;
    public final long durationMs;
    public final boolean dynamic;
    @Nullable
    public final Uri location;
    public final long minBufferTimeMs;
    public final long minUpdatePeriodMs;
    private final List<Period> periods;
    @Nullable
    public final ProgramInformation programInformation;
    public final long publishTimeMs;
    @Nullable
    public final ServiceDescriptionElement serviceDescription;
    public final long suggestedPresentationDelayMs;
    public final long timeShiftBufferDepthMs;
    @Nullable
    public final UtcTimingElement utcTiming;

    public DashManifest(long availabilityStartTimeMs, long durationMs, long minBufferTimeMs, boolean dynamic, long minUpdatePeriodMs, long timeShiftBufferDepthMs, long suggestedPresentationDelayMs, long publishTimeMs, @Nullable ProgramInformation programInformation, @Nullable UtcTimingElement utcTiming, @Nullable ServiceDescriptionElement serviceDescription, @Nullable Uri location, List<Period> periods) {
    }

    private static ArrayList<AdaptationSet> copyAdaptationSets(List<AdaptationSet> adaptationSets, LinkedList<StreamKey> keys) {
    }

    @Override // com.google.android.exoplayer2.offline.FilterableManifest
    public /* bridge */ /* synthetic */ DashManifest copy(List streamKeys) {
    }

    public final Period getPeriod(int index) {
    }

    public final int getPeriodCount() {
    }

    public final long getPeriodDurationMs(int index) {
    }

    public final long getPeriodDurationUs(int index) {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.exoplayer2.offline.FilterableManifest
    public final DashManifest copy(List<StreamKey> streamKeys) {
    }
}
