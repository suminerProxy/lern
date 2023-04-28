package com.google.android.exoplayer2.source;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.upstream.TransferListener;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class BaseMediaSource implements MediaSource {
    private final DrmSessionEventListener.EventDispatcher drmEventDispatcher;
    private final HashSet<MediaSource.MediaSourceCaller> enabledMediaSourceCallers;
    private final MediaSourceEventListener.EventDispatcher eventDispatcher;
    @Nullable
    private Looper looper;
    private final ArrayList<MediaSource.MediaSourceCaller> mediaSourceCallers;
    @Nullable
    private Timeline timeline;

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final void addDrmEventListener(Handler handler, DrmSessionEventListener eventListener) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final void addEventListener(Handler handler, MediaSourceEventListener eventListener) {
    }

    public final DrmSessionEventListener.EventDispatcher createDrmEventDispatcher(@Nullable MediaSource.MediaPeriodId mediaPeriodId) {
    }

    public final MediaSourceEventListener.EventDispatcher createEventDispatcher(@Nullable MediaSource.MediaPeriodId mediaPeriodId) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final void disable(MediaSource.MediaSourceCaller caller) {
    }

    public void disableInternal() {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final void enable(MediaSource.MediaSourceCaller caller) {
    }

    public void enableInternal() {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public /* synthetic */ Timeline getInitialTimeline() {
    }

    public final boolean isEnabled() {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public /* synthetic */ boolean isSingleWindow() {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final void prepareSource(MediaSource.MediaSourceCaller caller, @Nullable TransferListener mediaTransferListener) {
    }

    public abstract void prepareSourceInternal(@Nullable TransferListener mediaTransferListener);

    public final void refreshSourceInfo(Timeline timeline) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final void releaseSource(MediaSource.MediaSourceCaller caller) {
    }

    public abstract void releaseSourceInternal();

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final void removeDrmEventListener(DrmSessionEventListener eventListener) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final void removeEventListener(MediaSourceEventListener eventListener) {
    }

    public final DrmSessionEventListener.EventDispatcher createDrmEventDispatcher(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
    }

    public final MediaSourceEventListener.EventDispatcher createEventDispatcher(MediaSource.MediaPeriodId mediaPeriodId, long mediaTimeOffsetMs) {
    }

    public final MediaSourceEventListener.EventDispatcher createEventDispatcher(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, long mediaTimeOffsetMs) {
    }
}
