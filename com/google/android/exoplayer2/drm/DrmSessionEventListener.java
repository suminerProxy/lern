package com.google.android.exoplayer2.drm;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.MediaSource;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface DrmSessionEventListener {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class EventDispatcher {
        private final CopyOnWriteArrayList<ListenerAndHandler> listenerAndHandlers;
        @Nullable
        public final MediaSource.MediaPeriodId mediaPeriodId;
        public final int windowIndex;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static final class ListenerAndHandler {
            public Handler handler;
            public DrmSessionEventListener listener;

            public ListenerAndHandler(Handler handler, DrmSessionEventListener listener) {
            }
        }

        public EventDispatcher() {
        }

        private /* synthetic */ void a(DrmSessionEventListener drmSessionEventListener) {
        }

        private /* synthetic */ void c(DrmSessionEventListener drmSessionEventListener) {
        }

        private /* synthetic */ void e(DrmSessionEventListener drmSessionEventListener) {
        }

        private /* synthetic */ void g(DrmSessionEventListener drmSessionEventListener, int i2) {
        }

        private /* synthetic */ void i(DrmSessionEventListener drmSessionEventListener, Exception exc) {
        }

        private /* synthetic */ void k(DrmSessionEventListener drmSessionEventListener) {
        }

        public void addEventListener(Handler handler, DrmSessionEventListener eventListener) {
        }

        public /* synthetic */ void b(DrmSessionEventListener drmSessionEventListener) {
        }

        public /* synthetic */ void d(DrmSessionEventListener drmSessionEventListener) {
        }

        public void drmKeysLoaded() {
        }

        public void drmKeysRemoved() {
        }

        public void drmKeysRestored() {
        }

        public void drmSessionAcquired(int state) {
        }

        public void drmSessionManagerError(Exception error) {
        }

        public void drmSessionReleased() {
        }

        public /* synthetic */ void f(DrmSessionEventListener drmSessionEventListener) {
        }

        public /* synthetic */ void h(DrmSessionEventListener drmSessionEventListener, int i2) {
        }

        public /* synthetic */ void j(DrmSessionEventListener drmSessionEventListener, Exception exc) {
        }

        public /* synthetic */ void l(DrmSessionEventListener drmSessionEventListener) {
        }

        public void removeEventListener(DrmSessionEventListener eventListener) {
        }

        @CheckResult
        public EventDispatcher withParameters(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        }

        private EventDispatcher(CopyOnWriteArrayList<ListenerAndHandler> listenerAndHandlers, int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        }
    }

    void onDrmKeysLoaded(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId);

    void onDrmKeysRemoved(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId);

    void onDrmKeysRestored(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId);

    @Deprecated
    void onDrmSessionAcquired(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId);

    void onDrmSessionAcquired(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, int state);

    void onDrmSessionManagerError(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, Exception error);

    void onDrmSessionReleased(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId);
}
