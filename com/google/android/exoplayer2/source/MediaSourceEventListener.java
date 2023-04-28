package com.google.android.exoplayer2.source;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.MediaSource;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface MediaSourceEventListener {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class EventDispatcher {
        private final CopyOnWriteArrayList<ListenerAndHandler> listenerAndHandlers;
        @Nullable
        public final MediaSource.MediaPeriodId mediaPeriodId;
        private final long mediaTimeOffsetMs;
        public final int windowIndex;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static final class ListenerAndHandler {
            public Handler handler;
            public MediaSourceEventListener listener;

            public ListenerAndHandler(Handler handler, MediaSourceEventListener listener) {
            }
        }

        public EventDispatcher() {
        }

        private /* synthetic */ void a(MediaSourceEventListener mediaSourceEventListener, MediaLoadData mediaLoadData) {
        }

        private long adjustMediaTime(long mediaTimeUs) {
        }

        private /* synthetic */ void c(MediaSourceEventListener mediaSourceEventListener, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        }

        private /* synthetic */ void e(MediaSourceEventListener mediaSourceEventListener, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        }

        private /* synthetic */ void g(MediaSourceEventListener mediaSourceEventListener, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
        }

        private /* synthetic */ void i(MediaSourceEventListener mediaSourceEventListener, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        }

        private /* synthetic */ void k(MediaSourceEventListener mediaSourceEventListener, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
        }

        public void addEventListener(Handler handler, MediaSourceEventListener eventListener) {
        }

        public /* synthetic */ void b(MediaSourceEventListener mediaSourceEventListener, MediaLoadData mediaLoadData) {
        }

        public /* synthetic */ void d(MediaSourceEventListener mediaSourceEventListener, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        }

        public void downstreamFormatChanged(int trackType, @Nullable Format trackFormat, int trackSelectionReason, @Nullable Object trackSelectionData, long mediaTimeUs) {
        }

        public /* synthetic */ void f(MediaSourceEventListener mediaSourceEventListener, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        }

        public /* synthetic */ void h(MediaSourceEventListener mediaSourceEventListener, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
        }

        public /* synthetic */ void j(MediaSourceEventListener mediaSourceEventListener, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        }

        public /* synthetic */ void l(MediaSourceEventListener mediaSourceEventListener, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
        }

        public void loadCanceled(LoadEventInfo loadEventInfo, int dataType) {
        }

        public void loadCompleted(LoadEventInfo loadEventInfo, int dataType) {
        }

        public void loadError(LoadEventInfo loadEventInfo, int dataType, IOException error, boolean wasCanceled) {
        }

        public void loadStarted(LoadEventInfo loadEventInfo, int dataType) {
        }

        public void removeEventListener(MediaSourceEventListener eventListener) {
        }

        public void upstreamDiscarded(int trackType, long mediaStartTimeUs, long mediaEndTimeUs) {
        }

        @CheckResult
        public EventDispatcher withParameters(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, long mediaTimeOffsetMs) {
        }

        private EventDispatcher(CopyOnWriteArrayList<ListenerAndHandler> listenerAndHandlers, int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, long mediaTimeOffsetMs) {
        }

        public void loadCanceled(LoadEventInfo loadEventInfo, int dataType, int trackType, @Nullable Format trackFormat, int trackSelectionReason, @Nullable Object trackSelectionData, long mediaStartTimeUs, long mediaEndTimeUs) {
        }

        public void loadCompleted(LoadEventInfo loadEventInfo, int dataType, int trackType, @Nullable Format trackFormat, int trackSelectionReason, @Nullable Object trackSelectionData, long mediaStartTimeUs, long mediaEndTimeUs) {
        }

        public void loadError(LoadEventInfo loadEventInfo, int dataType, int trackType, @Nullable Format trackFormat, int trackSelectionReason, @Nullable Object trackSelectionData, long mediaStartTimeUs, long mediaEndTimeUs, IOException error, boolean wasCanceled) {
        }

        public void loadStarted(LoadEventInfo loadEventInfo, int dataType, int trackType, @Nullable Format trackFormat, int trackSelectionReason, @Nullable Object trackSelectionData, long mediaStartTimeUs, long mediaEndTimeUs) {
        }

        public void downstreamFormatChanged(MediaLoadData mediaLoadData) {
        }

        public void upstreamDiscarded(MediaLoadData mediaLoadData) {
        }

        public void loadCanceled(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        }

        public void loadCompleted(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        }

        public void loadError(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException error, boolean wasCanceled) {
        }

        public void loadStarted(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        }
    }

    void onDownstreamFormatChanged(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData);

    void onLoadCanceled(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData);

    void onLoadCompleted(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData);

    void onLoadError(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException error, boolean wasCanceled);

    void onLoadStarted(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData);

    void onUpstreamDiscarded(int windowIndex, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData);
}
