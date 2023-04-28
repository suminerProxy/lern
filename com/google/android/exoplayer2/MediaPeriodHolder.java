package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectorResult;
import com.google.android.exoplayer2.upstream.Allocator;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class MediaPeriodHolder {
    private static final String TAG = "MediaPeriodHolder";
    public boolean allRenderersInCorrectState;
    public boolean hasEnabledTracks;
    public MediaPeriodInfo info;
    private final boolean[] mayRetainStreamFlags;
    public final MediaPeriod mediaPeriod;
    private final MediaSourceList mediaSourceList;
    @Nullable
    private MediaPeriodHolder next;
    public boolean prepared;
    private final RendererCapabilities[] rendererCapabilities;
    private long rendererPositionOffsetUs;
    public final SampleStream[] sampleStreams;
    private TrackGroupArray trackGroups;
    private final TrackSelector trackSelector;
    private TrackSelectorResult trackSelectorResult;
    public final Object uid;

    public MediaPeriodHolder(RendererCapabilities[] rendererCapabilities, long rendererPositionOffsetUs, TrackSelector trackSelector, Allocator allocator, MediaSourceList mediaSourceList, MediaPeriodInfo info, TrackSelectorResult emptyTrackSelectorResult) {
    }

    private void associateNoSampleRenderersWithEmptySampleStream(SampleStream[] sampleStreams) {
    }

    private static MediaPeriod createMediaPeriod(MediaSource.MediaPeriodId id, MediaSourceList mediaSourceList, Allocator allocator, long startPositionUs, long endPositionUs) {
    }

    private void disableTrackSelectionsInResult() {
    }

    private void disassociateNoSampleRenderersWithEmptySampleStream(SampleStream[] sampleStreams) {
    }

    private void enableTrackSelectionsInResult() {
    }

    private boolean isLoadingMediaPeriod() {
    }

    private static void releaseMediaPeriod(MediaSourceList mediaSourceList, MediaPeriod mediaPeriod) {
    }

    public long applyTrackSelection(TrackSelectorResult trackSelectorResult, long positionUs, boolean forceRecreateStreams) {
    }

    public void continueLoading(long rendererPositionUs) {
    }

    public long getBufferedPositionUs() {
    }

    @Nullable
    public MediaPeriodHolder getNext() {
    }

    public long getNextLoadPositionUs() {
    }

    public long getRendererOffset() {
    }

    public long getStartPositionRendererTime() {
    }

    public TrackGroupArray getTrackGroups() {
    }

    public TrackSelectorResult getTrackSelectorResult() {
    }

    public void handlePrepared(float playbackSpeed, Timeline timeline) throws ExoPlaybackException {
    }

    public boolean isFullyBuffered() {
    }

    public void reevaluateBuffer(long rendererPositionUs) {
    }

    public void release() {
    }

    public TrackSelectorResult selectTracks(float playbackSpeed, Timeline timeline) throws ExoPlaybackException {
    }

    public void setNext(@Nullable MediaPeriodHolder nextMediaPeriodHolder) {
    }

    public void setRendererOffset(long rendererPositionOffsetUs) {
    }

    public long toPeriodTime(long rendererTimeUs) {
    }

    public long toRendererTime(long periodTimeUs) {
    }

    public void updateClipping() {
    }

    public long applyTrackSelection(TrackSelectorResult newTrackSelectorResult, long positionUs, boolean forceRecreateStreams, boolean[] streamResetFlags) {
    }
}
