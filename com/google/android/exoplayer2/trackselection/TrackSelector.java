package com.google.android.exoplayer2.trackselection;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.upstream.BandwidthMeter;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class TrackSelector {
    @Nullable
    private BandwidthMeter bandwidthMeter;
    @Nullable
    private InvalidationListener listener;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface InvalidationListener {
        void onTrackSelectionsInvalidated();
    }

    public final BandwidthMeter getBandwidthMeter() {
    }

    public final void init(InvalidationListener listener, BandwidthMeter bandwidthMeter) {
    }

    public final void invalidate() {
    }

    public abstract void onSelectionActivated(@Nullable Object info);

    public abstract TrackSelectorResult selectTracks(RendererCapabilities[] rendererCapabilities, TrackGroupArray trackGroups, MediaSource.MediaPeriodId periodId, Timeline timeline) throws ExoPlaybackException;
}
