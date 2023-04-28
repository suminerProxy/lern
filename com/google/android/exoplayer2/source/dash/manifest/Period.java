package com.google.android.exoplayer2.source.dash.manifest;

import androidx.annotation.Nullable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class Period {
    public final List<AdaptationSet> adaptationSets;
    @Nullable
    public final Descriptor assetIdentifier;
    public final List<EventStream> eventStreams;
    @Nullable
    public final String id;
    public final long startMs;

    public Period(@Nullable String id, long startMs, List<AdaptationSet> adaptationSets) {
    }

    public int getAdaptationSetIndex(int type) {
    }

    public Period(@Nullable String id, long startMs, List<AdaptationSet> adaptationSets, List<EventStream> eventStreams) {
    }

    public Period(@Nullable String id, long startMs, List<AdaptationSet> adaptationSets, List<EventStream> eventStreams, @Nullable Descriptor assetIdentifier) {
    }
}
