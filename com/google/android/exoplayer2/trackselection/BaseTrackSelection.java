package com.google.android.exoplayer2.trackselection;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.chunk.Chunk;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class BaseTrackSelection implements ExoTrackSelection {
    private final long[] excludeUntilTimes;
    private final Format[] formats;
    public final TrackGroup group;
    private int hashCode;
    public final int length;
    public final int[] tracks;
    private final int type;

    public BaseTrackSelection(TrackGroup group, int... tracks) {
    }

    public static /* synthetic */ int a(Format format, Format format2) {
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public boolean blacklist(int index, long exclusionDurationMs) {
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public void disable() {
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public void enable() {
    }

    public boolean equals(@Nullable Object obj) {
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public int evaluateQueueSize(long playbackPositionUs, List<? extends MediaChunk> queue) {
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final Format getFormat(int index) {
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final int getIndexInTrackGroup(int index) {
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public final Format getSelectedFormat() {
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public final int getSelectedIndexInTrackGroup() {
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final TrackGroup getTrackGroup() {
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final int getType() {
    }

    public int hashCode() {
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final int indexOf(Format format) {
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public boolean isBlacklisted(int index, long nowMs) {
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final int length() {
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public /* synthetic */ void onDiscontinuity() {
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public /* synthetic */ void onPlayWhenReadyChanged(boolean z) {
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public void onPlaybackSpeed(float playbackSpeed) {
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public /* synthetic */ void onRebuffer() {
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public /* synthetic */ boolean shouldCancelChunkLoad(long j2, Chunk chunk, List list) {
    }

    public BaseTrackSelection(TrackGroup group, int[] tracks, int type) {
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final int indexOf(int indexInTrackGroup) {
    }
}
