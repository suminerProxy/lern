package com.google.android.exoplayer2.source;

import android.os.Handler;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.UnknownNull;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class CompositeMediaSource<T> extends BaseMediaSource {
    private final HashMap<T, MediaSourceAndListener<T>> childSources;
    @Nullable
    private Handler eventHandler;
    @Nullable
    private TransferListener mediaTransferListener;

    /* JADX WARN: Field signature parse error: id
    jadx.core.utils.exceptions.JadxRuntimeException: Can't parse type: TT at position 1 ('T'), unexpected: T
    	at jadx.core.dex.nodes.parser.SignatureParser.consumeType(SignatureParser.java:169)
    	at jadx.core.dex.visitors.SignatureProcessor.parseFieldSignature(SignatureProcessor.java:128)
    	at jadx.core.dex.visitors.SignatureProcessor.visit(SignatureProcessor.java:36)
     */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class ForwardingEventListener implements MediaSourceEventListener, DrmSessionEventListener {
        private DrmSessionEventListener.EventDispatcher drmEventDispatcher;
        @UnknownNull
        private final Object id;
        private MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcher;
        public final /* synthetic */ CompositeMediaSource this$0;

        /* JADX WARN: Failed to parse method signature: (TT)V
        jadx.core.utils.exceptions.JadxRuntimeException: Can't parse type: (TT)V at position 2 ('T'), unexpected: T
        	at jadx.core.dex.nodes.parser.SignatureParser.consumeType(SignatureParser.java:169)
        	at jadx.core.dex.nodes.parser.SignatureParser.consumeMethodArgs(SignatureParser.java:318)
        	at jadx.core.dex.visitors.SignatureProcessor.parseMethodSignature(SignatureProcessor.java:154)
        	at jadx.core.dex.visitors.SignatureProcessor.visit(SignatureProcessor.java:39)
         */
        public ForwardingEventListener(@UnknownNull final CompositeMediaSource this$0, Object id) {
        }

        private boolean maybeUpdateEventDispatcher(int childWindowIndex, @Nullable MediaSource.MediaPeriodId childMediaPeriodId) {
        }

        private MediaLoadData maybeUpdateMediaLoadData(MediaLoadData mediaLoadData) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onDownstreamFormatChanged(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmKeysLoaded(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmKeysRemoved(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmKeysRestored(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public /* synthetic */ void onDrmSessionAcquired(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmSessionAcquired(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, int state) {
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmSessionManagerError(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, Exception error) {
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmSessionReleased(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onLoadCanceled(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventData, MediaLoadData mediaLoadData) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onLoadCompleted(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventData, MediaLoadData mediaLoadData) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onLoadError(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventData, MediaLoadData mediaLoadData, IOException error, boolean wasCanceled) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onLoadStarted(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventData, MediaLoadData mediaLoadData) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onUpstreamDiscarded(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class MediaSourceAndListener<T> {
        public final MediaSource.MediaSourceCaller caller;
        public final CompositeMediaSource<T>.ForwardingEventListener eventListener;
        public final MediaSource mediaSource;

        public MediaSourceAndListener(MediaSource mediaSource, MediaSource.MediaSourceCaller caller, CompositeMediaSource<T>.ForwardingEventListener eventListener) {
        }
    }

    private /* synthetic */ void a(Object obj, MediaSource mediaSource, Timeline timeline) {
    }

    public /* synthetic */ void b(Object obj, MediaSource mediaSource, Timeline timeline) {
    }

    public final void disableChildSource(@UnknownNull T id) {
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    @CallSuper
    public void disableInternal() {
    }

    public final void enableChildSource(@UnknownNull T id) {
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    @CallSuper
    public void enableInternal() {
    }

    @Nullable
    public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(@UnknownNull T id, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    public long getMediaTimeForChildMediaTime(@UnknownNull T id, long mediaTimeMs) {
    }

    public int getWindowIndexForChildWindowIndex(@UnknownNull T id, int windowIndex) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    @CallSuper
    public void maybeThrowSourceInfoRefreshError() throws IOException {
    }

    public abstract void onChildSourceInfoRefreshed(@UnknownNull T id, MediaSource mediaSource, Timeline timeline);

    public final void prepareChildSource(@UnknownNull T id, MediaSource mediaSource) {
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    @CallSuper
    public void prepareSourceInternal(@Nullable TransferListener mediaTransferListener) {
    }

    public final void releaseChildSource(@UnknownNull T id) {
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    @CallSuper
    public void releaseSourceInternal() {
    }
}
